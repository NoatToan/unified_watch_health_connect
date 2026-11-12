package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import ch.qos.logback.classic.net.SyslogAppender;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.Marker;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p1.l1;
import p1.z;

/* JADX INFO: loaded from: classes7.dex */
public class LottieComposition {
    private Rect bounds;
    private l1<FontCharacter> characters;
    private float endFrame;
    private Map<String, Font> fonts;
    private float frameRate;
    private boolean hasDashPattern;
    private Map<String, LottieImageAsset> images;
    private float imagesDpScale;
    private z<Layer> layerMap;
    private List<Layer> layers;
    private List<Marker> markers;
    private Map<String, List<Layer>> precomps;
    private float startFrame;
    private int unscaledHeight;
    private int unscaledWidth;
    private final PerformanceTracker performanceTracker = new PerformanceTracker();
    private final HashSet<String> warnings = new HashSet<>();
    private int maskAndMatteCount = 0;

    public void addWarning(String str) {
        Logger.warning(str);
        this.warnings.add(str);
    }

    public Rect getBounds() {
        return this.bounds;
    }

    public l1<FontCharacter> getCharacters() {
        return this.characters;
    }

    public float getDuration() {
        return (long) ((getDurationFrames() / this.frameRate) * 1000.0f);
    }

    public float getDurationFrames() {
        return this.endFrame - this.startFrame;
    }

    public float getEndFrame() {
        return this.endFrame;
    }

    public Map<String, Font> getFonts() {
        return this.fonts;
    }

    public float getFrameForProgress(float f14) {
        return MiscUtils.lerp(this.startFrame, this.endFrame, f14);
    }

    public float getFrameRate() {
        return this.frameRate;
    }

    public Map<String, LottieImageAsset> getImages() {
        float fDpScale = Utils.dpScale();
        if (fDpScale != this.imagesDpScale) {
            for (Map.Entry<String, LottieImageAsset> entry : this.images.entrySet()) {
                this.images.put(entry.getKey(), entry.getValue().copyWithScale(this.imagesDpScale / fDpScale));
            }
        }
        this.imagesDpScale = fDpScale;
        return this.images;
    }

    public List<Layer> getLayers() {
        return this.layers;
    }

    public Marker getMarker(String str) {
        int size = this.markers.size();
        for (int i14 = 0; i14 < size; i14++) {
            Marker marker = this.markers.get(i14);
            if (marker.matchesName(str)) {
                return marker;
            }
        }
        return null;
    }

    public List<Marker> getMarkers() {
        return this.markers;
    }

    public int getMaskAndMatteCount() {
        return this.maskAndMatteCount;
    }

    public PerformanceTracker getPerformanceTracker() {
        return this.performanceTracker;
    }

    public List<Layer> getPrecomps(String str) {
        return this.precomps.get(str);
    }

    public float getProgressForFrame(float f14) {
        float f15 = this.startFrame;
        return (f14 - f15) / (this.endFrame - f15);
    }

    public float getStartFrame() {
        return this.startFrame;
    }

    public int getUnscaledHeight() {
        return this.unscaledHeight;
    }

    public int getUnscaledWidth() {
        return this.unscaledWidth;
    }

    public ArrayList<String> getWarnings() {
        HashSet<String> hashSet = this.warnings;
        return new ArrayList<>(Arrays.asList((String[]) hashSet.toArray(new String[hashSet.size()])));
    }

    public boolean hasDashPattern() {
        return this.hasDashPattern;
    }

    public boolean hasImages() {
        return !this.images.isEmpty();
    }

    public void incrementMatteOrMaskCount(int i14) {
        this.maskAndMatteCount += i14;
    }

    public void init(Rect rect, float f14, float f15, float f16, List<Layer> list, z<Layer> zVar, Map<String, List<Layer>> map, Map<String, LottieImageAsset> map2, float f17, l1<FontCharacter> l1Var, Map<String, Font> map3, List<Marker> list2, int i14, int i15) {
        this.bounds = rect;
        this.startFrame = f14;
        this.endFrame = f15;
        this.frameRate = f16;
        this.layers = list;
        this.layerMap = zVar;
        this.precomps = map;
        this.images = map2;
        this.imagesDpScale = f17;
        this.characters = l1Var;
        this.fonts = map3;
        this.markers = list2;
        this.unscaledWidth = i14;
        this.unscaledHeight = i15;
    }

    public Layer layerModelForId(long j8) {
        return this.layerMap.b(j8);
    }

    public void setHasDashPattern(boolean z14) {
        this.hasDashPattern = z14;
    }

    public void setPerformanceTrackingEnabled(boolean z14) {
        this.performanceTracker.setEnabled(z14);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("LottieComposition:\n");
        Iterator<Layer> it = this.layers.iterator();
        while (it.hasNext()) {
            sb3.append(it.next().toString(SyslogAppender.DEFAULT_STACKTRACE_PATTERN));
        }
        return sb3.toString();
    }

    @Deprecated
    public static class Factory {

        public static final class ListenerAdapter implements LottieListener<LottieComposition>, Cancellable {
            private boolean cancelled;
            private final OnCompositionLoadedListener listener;

            private ListenerAdapter(OnCompositionLoadedListener onCompositionLoadedListener) {
                this.cancelled = false;
                this.listener = onCompositionLoadedListener;
            }

            @Override // com.airbnb.lottie.Cancellable
            public void cancel() {
                this.cancelled = true;
            }

            @Override // com.airbnb.lottie.LottieListener
            public void onResult(LottieComposition lottieComposition) {
                if (this.cancelled) {
                    return;
                }
                this.listener.onCompositionLoaded(lottieComposition);
            }
        }

        private Factory() {
        }

        @Deprecated
        public static Cancellable fromAssetFileName(Context context, String str, OnCompositionLoadedListener onCompositionLoadedListener) {
            ListenerAdapter listenerAdapter = new ListenerAdapter(onCompositionLoadedListener);
            LottieCompositionFactory.fromAsset(context, str).addListener(listenerAdapter);
            return listenerAdapter;
        }

        @Deprecated
        public static LottieComposition fromFileSync(Context context, String str) {
            return LottieCompositionFactory.fromAssetSync(context, str).getValue();
        }

        @Deprecated
        public static Cancellable fromInputStream(InputStream inputStream, OnCompositionLoadedListener onCompositionLoadedListener) {
            ListenerAdapter listenerAdapter = new ListenerAdapter(onCompositionLoadedListener);
            LottieCompositionFactory.fromJsonInputStream(inputStream, null).addListener(listenerAdapter);
            return listenerAdapter;
        }

        @Deprecated
        public static LottieComposition fromInputStreamSync(InputStream inputStream, boolean z14) {
            if (z14) {
                Logger.warning("Lottie now auto-closes input stream!");
            }
            return LottieCompositionFactory.fromJsonInputStreamSync(inputStream, null).getValue();
        }

        @Deprecated
        public static Cancellable fromJsonReader(JsonReader jsonReader, OnCompositionLoadedListener onCompositionLoadedListener) {
            ListenerAdapter listenerAdapter = new ListenerAdapter(onCompositionLoadedListener);
            LottieCompositionFactory.fromJsonReader(jsonReader, null).addListener(listenerAdapter);
            return listenerAdapter;
        }

        @Deprecated
        public static Cancellable fromJsonString(String str, OnCompositionLoadedListener onCompositionLoadedListener) {
            ListenerAdapter listenerAdapter = new ListenerAdapter(onCompositionLoadedListener);
            LottieCompositionFactory.fromJsonString(str, null).addListener(listenerAdapter);
            return listenerAdapter;
        }

        @Deprecated
        public static LottieComposition fromJsonSync(Resources resources, JSONObject jSONObject) {
            return LottieCompositionFactory.fromJsonSync(jSONObject, null).getValue();
        }

        @Deprecated
        public static Cancellable fromRawFile(Context context, int i14, OnCompositionLoadedListener onCompositionLoadedListener) {
            ListenerAdapter listenerAdapter = new ListenerAdapter(onCompositionLoadedListener);
            LottieCompositionFactory.fromRawRes(context, i14).addListener(listenerAdapter);
            return listenerAdapter;
        }

        @Deprecated
        public static LottieComposition fromJsonSync(String str) {
            return LottieCompositionFactory.fromJsonStringSync(str, null).getValue();
        }

        @Deprecated
        public static LottieComposition fromJsonSync(JsonReader jsonReader) {
            return LottieCompositionFactory.fromJsonReaderSync(jsonReader, null).getValue();
        }

        @Deprecated
        public static LottieComposition fromInputStreamSync(InputStream inputStream) {
            return LottieCompositionFactory.fromJsonInputStreamSync(inputStream, null).getValue();
        }
    }
}
