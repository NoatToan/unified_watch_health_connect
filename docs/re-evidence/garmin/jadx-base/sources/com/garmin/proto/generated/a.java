package com.garmin.proto.generated;

import android.database.SQLException;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.source.chunk.BundledChunkExtractor;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.CacheKeyFactory;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;
import java.util.List;
import o53.b0;
import p3.o0;
import p3.z;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements ListenerSet.IterationFinishedEvent, Bundleable.Creator, Id3Decoder.FramePredicate, ChunkExtractor.Factory, CacheKeyFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52541a;

    public /* synthetic */ a(int i14) {
        this.f52541a = i14;
    }

    public static IObjectWrapper b(Parcel parcel) {
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        parcel.recycle();
        return iObjectWrapperAsInterface;
    }

    public static Object c(int i14) {
        return GDIIndoorTrainer.getDescriptor().getMessageTypes().get(i14);
    }

    public static z d(b0 b0Var, o0 o0Var) {
        z zVar = new z(b0Var);
        o0Var.K(zVar);
        return zVar;
    }

    public static /* synthetic */ void e(int i14, Object obj, Object obj2, int i15, int i16) {
        StringBuilder sb3 = new StringBuilder(i14);
        sb3.append(obj);
        sb3.append(i15);
        sb3.append(obj2);
        sb3.append(i16);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public static void f(int i14, HashMap map, String str, int i15, String str2) {
        map.put(str, Integer.valueOf(i14));
        map.put(str2, Integer.valueOf(i15));
    }

    public static /* synthetic */ void g(SQLException sQLException) throws DatabaseIOException {
        throw new DatabaseIOException(sQLException);
    }

    public static /* synthetic */ void h(String str) {
        throw new SecurityException(str);
    }

    public static Object i(int i14) {
        return GDIInternationalGolf.getDescriptor().getMessageTypes().get(i14);
    }

    public static Object j(int i14) {
        return GDIXcelStrength.getDescriptor().getMessageTypes().get(i14);
    }

    public static Object k(int i14) {
        return GDIXeroChronographProto.getDescriptor().getMessageTypes().get(i14);
    }

    public static Object l(int i14) {
        return GDILaunchMonitorProto.getDescriptor().getMessageTypes().get(i14);
    }

    public static Object m(int i14) {
        return GDILiveSessionProto.getDescriptor().getMessageTypes().get(i14);
    }

    public static Object n(int i14) {
        return GDILiveTrackProto.getDescriptor().getMessageTypes().get(i14);
    }

    public static Object o(int i14) {
        return GDIRealtimeSettingsProto.getDescriptor().getMessageTypes().get(i14);
    }

    public static Object p(int i14) {
        return GDIRemoteDeviceManagement.getDescriptor().getMessageTypes().get(i14);
    }

    public static Object q(int i14) {
        return GDIWifiSetup.getDescriptor().getMessageTypes().get(i14);
    }

    public static Object r(int i14) {
        return GDIWifiSetupUnified.getDescriptor().getMessageTypes().get(i14);
    }

    public static Object s(int i14) {
        return GDIXcelSprint.getDescriptor().getMessageTypes().get(i14);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheKeyFactory
    public String buildCacheKey(DataSpec dataSpec) {
        return CacheKeyFactory.lambda$static$0(dataSpec);
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor.Factory
    public ChunkExtractor createProgressiveMediaExtractor(int i14, Format format, boolean z14, List list, TrackOutput trackOutput, PlayerId playerId) {
        switch (this.f52541a) {
            case 20:
                return BundledChunkExtractor.lambda$static$0(i14, format, z14, list, trackOutput, playerId);
            default:
                return MediaParserChunkExtractor.lambda$static$0(i14, format, z14, list, trackOutput, playerId);
        }
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate
    public boolean evaluate(int i14, int i15, int i16, int i17, int i18) {
        switch (this.f52541a) {
            case 16:
                return Mp3Extractor.lambda$static$1(i14, i15, i16, i17, i18);
            default:
                return Id3Decoder.lambda$static$0(i14, i15, i16, i17, i18);
        }
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        switch (this.f52541a) {
            case 14:
                return AudioAttributes.lambda$static$0(bundle);
            case 18:
                return AdPlaybackState.fromBundle(bundle);
            case 19:
                return AdPlaybackState.AdGroup.fromBundle(bundle);
            case 22:
                return Cue.fromBundle(bundle);
            case 26:
                return ColorInfo.lambda$static$0(bundle);
            default:
                return VideoSize.lambda$static$0(bundle);
        }
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        DefaultAnalyticsCollector.lambda$new$0((AnalyticsListener) obj, flagSet);
    }
}
