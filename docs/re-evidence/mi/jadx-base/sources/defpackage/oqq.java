package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.miui.tsmclient.entity.UIConfig;

/* JADX INFO: loaded from: classes4.dex */
public class oqq {
    public static final String[] c = {"onVideoLoadStart", "onVideoLoad", "onVideoError", "onVideoProgress", "onVideoSeek", "onVideoEnd", "onVideoFullscreenPlayerWillPresent", "onVideoFullscreenPlayerDidPresent", "onVideoFullscreenPlayerWillDismiss", "onVideoFullscreenPlayerDidDismiss", "onPlaybackStalled", "onPlaybackResume", "onReadyForDisplay", "onVideoBuffer", "onVideoIdle", "onTimedMetadata", "onVideoAudioBecomingNoisy", "onAudioFocusChanged", "onPlaybackRateChange", "onVideoBandwidthUpdate"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RCTEventEmitter f29398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29399b = -1;

    public oqq(ReactContext reactContext) {
        this.f29398a = (RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class);
    }

    public void a() {
        q("onVideoAudioBecomingNoisy", null);
    }

    public void b(boolean z) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("hasAudioFocus", z);
        q("onAudioFocusChanged", writableMapCreateMap);
    }

    public void c(double d) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("bitrate", d);
        q("onVideoBandwidthUpdate", writableMapCreateMap);
    }

    public void d(boolean z) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("isBuffering", z);
        q("onVideoBuffer", writableMapCreateMap);
    }

    public void e() {
        q("onVideoEnd", null);
    }

    public void f(String str, Exception exc) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("errorString", str);
        writableMapCreateMap.putString("errorException", exc.getMessage());
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putMap("error", writableMapCreateMap);
        q("onVideoError", writableMapCreateMap2);
    }

    public void g() {
        q("onVideoFullscreenPlayerDidDismiss", null);
    }

    public void h() {
        q("onVideoFullscreenPlayerDidPresent", null);
    }

    public void i() {
        q("onVideoFullscreenPlayerWillDismiss", null);
    }

    public void j() {
        q("onVideoFullscreenPlayerWillPresent", null);
    }

    public void k() {
        q("onVideoIdle", null);
    }

    public void l(double d, double d2, int i, int i2, WritableArray writableArray, WritableArray writableArray2, WritableArray writableArray3) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("duration", d / 1000.0d);
        writableMapCreateMap.putDouble(UIConfig.KEY_CURRENT_TIME, d2 / 1000.0d);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt("width", i);
        writableMapCreateMap2.putInt("height", i2);
        if (i > i2) {
            writableMapCreateMap2.putString("orientation", "landscape");
        } else {
            writableMapCreateMap2.putString("orientation", "portrait");
        }
        writableMapCreateMap.putMap("naturalSize", writableMapCreateMap2);
        writableMapCreateMap.putArray("videoTracks", writableArray3);
        writableMapCreateMap.putArray("audioTracks", writableArray);
        writableMapCreateMap.putArray("textTracks", writableArray2);
        writableMapCreateMap.putBoolean("canPlayFastForward", true);
        writableMapCreateMap.putBoolean("canPlaySlowForward", true);
        writableMapCreateMap.putBoolean("canPlaySlowReverse", true);
        writableMapCreateMap.putBoolean("canPlayReverse", true);
        writableMapCreateMap.putBoolean("canPlayFastForward", true);
        writableMapCreateMap.putBoolean("canStepBackward", true);
        writableMapCreateMap.putBoolean("canStepForward", true);
        q("onVideoLoad", writableMapCreateMap);
    }

    public void m() {
        q("onVideoLoadStart", null);
    }

    public void n(float f) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("playbackRate", f);
        q("onPlaybackRateChange", writableMapCreateMap);
    }

    public void o(double d, double d2, double d3) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble(UIConfig.KEY_CURRENT_TIME, d / 1000.0d);
        writableMapCreateMap.putDouble("playableDuration", d2 / 1000.0d);
        writableMapCreateMap.putDouble("seekableDuration", d3 / 1000.0d);
        q("onVideoProgress", writableMapCreateMap);
    }

    public void p() {
        q("onReadyForDisplay", null);
    }

    public final void q(String str, WritableMap writableMap) {
        this.f29398a.receiveEvent(this.f29399b, str, writableMap);
    }

    public void r(long j, long j2) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble(UIConfig.KEY_CURRENT_TIME, j / 1000.0d);
        writableMapCreateMap.putDouble("seekTime", j2 / 1000.0d);
        q("onVideoSeek", writableMapCreateMap);
    }

    public void s(int i) {
        this.f29399b = i;
    }

    public void t(Metadata metadata) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (int i = 0; i < metadata.e(); i++) {
            Id3Frame id3Frame = (Id3Frame) metadata.d(i);
            String str = id3Frame instanceof TextInformationFrame ? ((TextInformationFrame) id3Frame).c : "";
            String str2 = id3Frame.f8005a;
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("identifier", str2);
            writableMapCreateMap.putString("value", str);
            writableArrayCreateArray.pushMap(writableMapCreateMap);
        }
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putArray("metadata", writableArrayCreateArray);
        q("onTimedMetadata", writableMapCreateMap2);
    }
}
