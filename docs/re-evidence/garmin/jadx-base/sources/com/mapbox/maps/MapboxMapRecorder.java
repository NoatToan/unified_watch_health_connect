package com.mapbox.maps;

import com.mapbox.bindgen.DataRef;
import java.nio.ByteBuffer;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/mapbox/maps/MapboxMapRecorder;", "", "Lcom/mapbox/maps/MapRecorder;", "mapRecorder", "<init>", "(Lcom/mapbox/maps/MapRecorder;)V", "Lcom/mapbox/maps/MapRecorderOptions;", "options", "", "startRecording", "(Lcom/mapbox/maps/MapRecorderOptions;)V", "Ljava/nio/ByteBuffer;", "stopRecording", "()Ljava/nio/ByteBuffer;", "recordedSequence", "Lcom/mapbox/maps/MapPlayerOptions;", "Lkotlin/Function0;", "onEnded", "replay", "(Ljava/nio/ByteBuffer;Lcom/mapbox/maps/MapPlayerOptions;Le23/a;)V", "togglePauseReplay", "()V", "", "getPlaybackState", "()Ljava/lang/String;", "Lcom/mapbox/maps/MapRecorder;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
public final class MapboxMapRecorder {
    private final MapRecorder mapRecorder;

    public MapboxMapRecorder(MapRecorder mapRecorder) {
        mapRecorder.getClass();
        this.mapRecorder = mapRecorder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void replay$default(MapboxMapRecorder mapboxMapRecorder, ByteBuffer byteBuffer, MapPlayerOptions mapPlayerOptions, e23.a aVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            mapPlayerOptions = new MapPlayerOptions.Builder().build();
            mapPlayerOptions.getClass();
        }
        if ((i14 & 4) != 0) {
            aVar = AnonymousClass2.INSTANCE;
        }
        mapboxMapRecorder.replay(byteBuffer, mapPlayerOptions, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void replay$lambda$4(e23.a aVar) {
        aVar.getClass();
        aVar.invoke();
    }

    public static /* synthetic */ void startRecording$default(MapboxMapRecorder mapboxMapRecorder, MapRecorderOptions mapRecorderOptions, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            mapRecorderOptions = new MapRecorderOptions.Builder().build();
            mapRecorderOptions.getClass();
        }
        mapboxMapRecorder.startRecording(mapRecorderOptions);
    }

    public final String getPlaybackState() {
        String playbackState = this.mapRecorder.getPlaybackState();
        playbackState.getClass();
        return playbackState;
    }

    public final void replay(ByteBuffer recordedSequence, MapPlayerOptions options, e23.a<Unit> onEnded) {
        recordedSequence.getClass();
        options.getClass();
        onEnded.getClass();
        DataRef dataRefAllocateNative = DataRef.allocateNative(recordedSequence.limit());
        ByteBuffer buffer = dataRefAllocateNative.getBuffer();
        recordedSequence.rewind();
        buffer.put(recordedSequence).rewind();
        this.mapRecorder.replay(dataRefAllocateNative, options, new m(onEnded, 0));
    }

    public final void startRecording(MapRecorderOptions options) {
        options.getClass();
        this.mapRecorder.startRecording(options);
    }

    public final ByteBuffer stopRecording() {
        ByteBuffer buffer = this.mapRecorder.stopRecording().getBuffer();
        buffer.getClass();
        buffer.rewind();
        return buffer;
    }

    public final void togglePauseReplay() {
        this.mapRecorder.togglePauseReplay();
    }

    /* JADX INFO: renamed from: com.mapbox.maps.MapboxMapRecorder$replay$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements e23.a<Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    public final void startRecording() {
        startRecording$default(this, null, 1, null);
    }

    public final void replay(ByteBuffer byteBuffer, MapPlayerOptions mapPlayerOptions) {
        byteBuffer.getClass();
        mapPlayerOptions.getClass();
        replay$default(this, byteBuffer, mapPlayerOptions, null, 4, null);
    }

    public final void replay(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        replay$default(this, byteBuffer, null, null, 6, null);
    }
}
