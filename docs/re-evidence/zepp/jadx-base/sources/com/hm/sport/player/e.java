package com.hm.sport.player;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class e {
    private e() {
    }

    public static MediaPlayer a(Context context, List<String> list, PlayCommand.CommandId commandId, a aVar) throws Throwable {
        if (context == null || commandId == null || list == null || list.size() <= 0) {
            return null;
        }
        File fileA = c.a(context, list);
        if (fileA == null) {
            Log.i("RunPlayer", "playMedia failed to create file cmdId: " + commandId);
            return null;
        }
        String absolutePath = fileA.getAbsolutePath();
        b bVar = new b();
        bVar.a = context;
        bVar.b = Uri.parse(absolutePath);
        bVar.c = false;
        bVar.d = 3;
        bVar.e = 1.0f;
        return b(bVar, commandId, aVar);
    }

    private static MediaPlayer b(b bVar, PlayCommand.CommandId commandId, a aVar) {
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setAudioStreamType(bVar.d);
            mediaPlayer.setDataSource(bVar.a, bVar.b);
            mediaPlayer.setLooping(bVar.c);
            float f = bVar.e;
            mediaPlayer.setVolume(f, f);
            mediaPlayer.prepare();
            AudioManager audioManager = (AudioManager) bVar.a.getSystemService("audio");
            Uri uri = bVar.b;
            if (uri != null && uri.getEncodedPath() != null && bVar.b.getEncodedPath().length() > 0) {
                if (bVar.c) {
                    audioManager.requestAudioFocus(null, bVar.d, 1);
                } else {
                    audioManager.requestAudioFocus(null, bVar.d, 3);
                }
            }
            d dVar = new d(bVar.a, commandId, aVar);
            mediaPlayer.setOnCompletionListener(dVar);
            mediaPlayer.setOnErrorListener(dVar);
            mediaPlayer.start();
            return mediaPlayer;
        } catch (Exception e) {
            Log.i("RunPlayer", e.getMessage());
            return null;
        }
    }
}
