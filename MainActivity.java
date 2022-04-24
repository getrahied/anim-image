package com.example.devsufy;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import android.Manifest;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeechService;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
public class MainActivity extends AppCompatActivity{
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=(ImageView)findViewById(R.id.imageView);
    } public void fadeIn(View view){
        Animation animFadeIn= AnimationUtils.loadAnimation(this,R.anim.fade_in);
        imageView.startAnimation(animFadeIn);
    } public void fadeOut(View view){
        Animation animFadeOut=
                AnimationUtils.loadAnimation(this,R.anim.fade_out);
        imageView.startAnimation(animFadeOut);
    } public void zoomIn(View view){
        Animation animZoomIn=AnimationUtils.loadAnimation(this,R.anim.zoom_in);
        imageView.startAnimation(animZoomIn);
    } public void zoomOut(View view){
        Animation
                animZoomOut=AnimationUtils.loadAnimation(this,R.anim.zoom_out);
        imageView.startAnimation(animZoomOut);
    } public void clockwise(View view){
        Animation clockwise=AnimationUtils.loadAnimation(this,
                R.anim.clockwise);
        imageView.startAnimation(clockwise);
    } public void antiClockwise(View view){
        Animation
                antiClockwise=AnimationUtils.loadAnimation(this,R.anim.anticlockwise);
        imageView.startAnimation(antiClockwise);
    }
}
