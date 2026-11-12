package com.brentvatne.exoplayer;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.uimanager.ViewGroupManager;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import com.tencent.wcdb.database.SQLiteDatabase;
import defpackage.ddj;
import defpackage.e4f;
import defpackage.g9p;
import defpackage.iej;
import defpackage.oqq;
import defpackage.xpk;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ReactExoplayerViewManager extends ViewGroupManager<ddj> {
    private static final String PROP_BUFFER_CONFIG = "bufferConfig";
    private static final String PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = "bufferForPlaybackAfterRebufferMs";
    private static final String PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_MS = "bufferForPlaybackMs";
    private static final String PROP_BUFFER_CONFIG_MAX_BUFFER_MS = "maxBufferMs";
    private static final String PROP_BUFFER_CONFIG_MIN_BUFFER_MS = "minBufferMs";
    private static final String PROP_CONTROLS = "controls";
    private static final String PROP_DISABLE_FOCUS = "disableFocus";
    private static final String PROP_FULLSCREEN = "fullscreen";
    private static final String PROP_HIDE_SHUTTER_VIEW = "hideShutterView";
    private static final String PROP_MAXIMUM_BIT_RATE = "maxBitRate";
    private static final String PROP_MIN_LOAD_RETRY_COUNT = "minLoadRetryCount";
    private static final String PROP_MUTED = "muted";
    private static final String PROP_PAUSED = "paused";
    private static final String PROP_PLAY_IN_BACKGROUND = "playInBackground";
    private static final String PROP_PROGRESS_UPDATE_INTERVAL = "progressUpdateInterval";
    private static final String PROP_RATE = "rate";
    private static final String PROP_REPEAT = "repeat";
    private static final String PROP_REPORT_BANDWIDTH = "reportBandwidth";
    private static final String PROP_RESIZE_MODE = "resizeMode";
    private static final String PROP_SEEK = "seek";
    private static final String PROP_SELECTED_AUDIO_TRACK = "selectedAudioTrack";
    private static final String PROP_SELECTED_AUDIO_TRACK_TYPE = "type";
    private static final String PROP_SELECTED_AUDIO_TRACK_VALUE = "value";
    private static final String PROP_SELECTED_TEXT_TRACK = "selectedTextTrack";
    private static final String PROP_SELECTED_TEXT_TRACK_TYPE = "type";
    private static final String PROP_SELECTED_TEXT_TRACK_VALUE = "value";
    private static final String PROP_SELECTED_VIDEO_TRACK = "selectedVideoTrack";
    private static final String PROP_SELECTED_VIDEO_TRACK_TYPE = "type";
    private static final String PROP_SELECTED_VIDEO_TRACK_VALUE = "value";
    private static final String PROP_SRC = "src";
    private static final String PROP_SRC_HEADERS = "requestHeaders";
    private static final String PROP_SRC_TYPE = "type";
    private static final String PROP_SRC_URI = "uri";
    private static final String PROP_TEXT_TRACKS = "textTracks";
    private static final String PROP_USE_TEXTURE_VIEW = "useTextureView";
    private static final String PROP_VOLUME = "volume";
    private static final String REACT_CLASS = "RCTVideo";

    private int convertToIntDef(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return xpk.a(Integer.parseInt(str));
    }

    private boolean startsWithValidScheme(String str) {
        return str.startsWith("http://") || str.startsWith("https://") || str.startsWith("content://") || str.startsWith("file://") || str.startsWith("asset://");
    }

    public static Map<String, String> toStringMap(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        if (!readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            return null;
        }
        HashMap map = new HashMap();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            map.put(strNextKey, readableMap.getString(strNextKey));
        }
        return map;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        e4f.b bVarA = e4f.a();
        for (String str : oqq.c) {
            bVarA.b(str, e4f.d("registrationName", str));
        }
        return bVarA.a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return e4f.g("ScaleNone", Integer.toString(0), "ScaleAspectFit", Integer.toString(0), "ScaleToFill", Integer.toString(3), "ScaleAspectFill", Integer.toString(4));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @iej(name = PROP_MIN_LOAD_RETRY_COUNT)
    public void minLoadRetryCount(ddj ddjVar, int i) {
        ddjVar.o0(i);
    }

    @iej(name = PROP_BUFFER_CONFIG)
    public void setBufferConfig(ddj ddjVar, ReadableMap readableMap) {
        if (readableMap != null) {
            boolean zHasKey = readableMap.hasKey(PROP_BUFFER_CONFIG_MIN_BUFFER_MS);
            int i = SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH;
            int i2 = zHasKey ? readableMap.getInt(PROP_BUFFER_CONFIG_MIN_BUFFER_MS) : 50000;
            if (readableMap.hasKey(PROP_BUFFER_CONFIG_MAX_BUFFER_MS)) {
                i = readableMap.getInt(PROP_BUFFER_CONFIG_MAX_BUFFER_MS);
            }
            ddjVar.i0(i2, i, readableMap.hasKey(PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_MS) ? readableMap.getInt(PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_MS) : 2500, readableMap.hasKey(PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS) ? readableMap.getInt(PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS) : 5000);
        }
    }

    @iej(defaultBoolean = false, name = PROP_CONTROLS)
    public void setControls(ddj ddjVar, boolean z) {
        ddjVar.j0(z);
    }

    @iej(defaultBoolean = false, name = PROP_DISABLE_FOCUS)
    public void setDisableFocus(ddj ddjVar, boolean z) {
        ddjVar.k0(z);
    }

    @iej(defaultBoolean = false, name = PROP_FULLSCREEN)
    public void setFullscreen(ddj ddjVar, boolean z) {
        ddjVar.l0(z);
    }

    @iej(defaultBoolean = false, name = PROP_HIDE_SHUTTER_VIEW)
    public void setHideShutterView(ddj ddjVar, boolean z) {
        ddjVar.m0(z);
    }

    @iej(name = PROP_MAXIMUM_BIT_RATE)
    public void setMaxBitRate(ddj ddjVar, int i) {
        ddjVar.n0(i);
    }

    @iej(defaultBoolean = false, name = PROP_MUTED)
    public void setMuted(ddj ddjVar, boolean z) {
        ddjVar.p0(z);
    }

    @iej(defaultBoolean = false, name = PROP_PAUSED)
    public void setPaused(ddj ddjVar, boolean z) {
        ddjVar.q0(z);
    }

    @iej(defaultBoolean = false, name = PROP_PLAY_IN_BACKGROUND)
    public void setPlayInBackground(ddj ddjVar, boolean z) {
        ddjVar.r0(z);
    }

    @iej(defaultFloat = 250.0f, name = PROP_PROGRESS_UPDATE_INTERVAL)
    public void setProgressUpdateInterval(ddj ddjVar, float f) {
        ddjVar.t0(f);
    }

    @iej(name = PROP_TEXT_TRACKS)
    public void setPropTextTracks(ddj ddjVar, ReadableArray readableArray) {
        ddjVar.E0(readableArray);
    }

    @iej(name = PROP_RATE)
    public void setRate(ddj ddjVar, float f) {
        ddjVar.u0(f);
    }

    @iej(defaultBoolean = false, name = PROP_REPEAT)
    public void setRepeat(ddj ddjVar, boolean z) {
        ddjVar.w0(z);
    }

    @iej(defaultBoolean = false, name = PROP_REPORT_BANDWIDTH)
    public void setReportBandwidth(ddj ddjVar, boolean z) {
        ddjVar.x0(z);
    }

    @iej(name = PROP_RESIZE_MODE)
    public void setResizeMode(ddj ddjVar, String str) {
        ddjVar.y0(convertToIntDef(str));
    }

    @iej(name = PROP_SEEK)
    public void setSeek(ddj ddjVar, float f) {
        ddjVar.h0(Math.round(f * 1000.0f));
    }

    @iej(name = PROP_SELECTED_AUDIO_TRACK)
    public void setSelectedAudioTrack(ddj ddjVar, ReadableMap readableMap) {
        Dynamic dynamic;
        String str = null;
        if (readableMap != null) {
            String string = readableMap.hasKey("type") ? readableMap.getString("type") : null;
            dynamic = readableMap.hasKey("value") ? readableMap.getDynamic("value") : null;
            str = string;
        } else {
            dynamic = null;
        }
        ddjVar.z0(str, dynamic);
    }

    @iej(name = PROP_SELECTED_TEXT_TRACK)
    public void setSelectedTextTrack(ddj ddjVar, ReadableMap readableMap) {
        Dynamic dynamic;
        String str = null;
        if (readableMap != null) {
            String string = readableMap.hasKey("type") ? readableMap.getString("type") : null;
            dynamic = readableMap.hasKey("value") ? readableMap.getDynamic("value") : null;
            str = string;
        } else {
            dynamic = null;
        }
        ddjVar.A0(str, dynamic);
    }

    @iej(name = PROP_SELECTED_VIDEO_TRACK)
    public void setSelectedVideoTrack(ddj ddjVar, ReadableMap readableMap) {
        Dynamic dynamic;
        String str = null;
        if (readableMap != null) {
            String string = readableMap.hasKey("type") ? readableMap.getString("type") : null;
            dynamic = readableMap.hasKey("value") ? readableMap.getDynamic("value") : null;
            str = string;
        } else {
            dynamic = null;
        }
        ddjVar.C0(str, dynamic);
    }

    @iej(name = PROP_SRC)
    public void setSrc(ddj ddjVar, ReadableMap readableMap) {
        Uri uriBuildRawResourceUri;
        Context applicationContext = ddjVar.getContext().getApplicationContext();
        String string = readableMap.hasKey("uri") ? readableMap.getString("uri") : null;
        String string2 = readableMap.hasKey("type") ? readableMap.getString("type") : null;
        Map<String, String> stringMap = readableMap.hasKey(PROP_SRC_HEADERS) ? toStringMap(readableMap.getMap(PROP_SRC_HEADERS)) : null;
        if (TextUtils.isEmpty(string)) {
            return;
        }
        if (startsWithValidScheme(string)) {
            Uri uri = Uri.parse(string);
            if (uri != null) {
                ddjVar.D0(uri, string2, stringMap);
                return;
            }
            return;
        }
        int identifier = applicationContext.getResources().getIdentifier(string, "drawable", applicationContext.getPackageName());
        if (identifier == 0) {
            identifier = applicationContext.getResources().getIdentifier(string, "raw", applicationContext.getPackageName());
        }
        if (identifier <= 0 || (uriBuildRawResourceUri = RawResourceDataSource.buildRawResourceUri(identifier)) == null) {
            return;
        }
        ddjVar.v0(uriBuildRawResourceUri, string2);
    }

    @iej(defaultBoolean = true, name = PROP_USE_TEXTURE_VIEW)
    public void setUseTextureView(ddj ddjVar, boolean z) {
        ddjVar.F0(z);
    }

    @iej(defaultFloat = 1.0f, name = PROP_VOLUME)
    public void setVolume(ddj ddjVar, float f) {
        ddjVar.G0(f);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ddj createViewInstance(g9p g9pVar) {
        return new ddj(g9pVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(ddj ddjVar) {
        ddjVar.P();
    }
}
