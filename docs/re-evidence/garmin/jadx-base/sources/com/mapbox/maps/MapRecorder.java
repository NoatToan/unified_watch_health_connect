package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes2.dex */
final class MapRecorder {
    protected long peer;

    public static class MapRecorderPeerCleaner implements Runnable {
        private long peer;

        public MapRecorderPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapRecorder.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public MapRecorder(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native Expected<String, MapRecorder> createInstance(Map map);

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new MapRecorderPeerCleaner(j8));
    }

    public native String getPlaybackState();

    public native void replay(DataRef dataRef, MapPlayerOptions mapPlayerOptions, PlaybackFinished playbackFinished);

    public native void startRecording(MapRecorderOptions mapRecorderOptions);

    public native DataRef stopRecording();

    public native void togglePauseReplay();
}
