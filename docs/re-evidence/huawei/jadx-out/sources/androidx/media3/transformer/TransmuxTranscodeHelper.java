package androidx.media3.transformer;

import android.content.Context;
import android.util.Pair;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.aoy;
import defpackage.arb;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
final class TransmuxTranscodeHelper {

    public static final class ResumeMetadata {
        public final ImmutableList<Pair<Integer, Long>> firstMediaItemIndexAndOffsetInfo;
        public final long lastSyncSampleTimestampUs;
        public final Format videoFormat;

        public ResumeMetadata(long j, ImmutableList<Pair<Integer, Long>> immutableList, Format format) {
            this.lastSyncSampleTimestampUs = j;
            this.firstMediaItemIndexAndOffsetInfo = immutableList;
            this.videoFormat = format;
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.media3.transformer.TransmuxTranscodeHelper$1] */
    public static ListenableFuture<Mp4Info> getMp4Info(final Context context, final String str, final long j) {
        final arb arbVarA = arb.a();
        new Thread("TransmuxTranscodeHelper:Mp4Info") { // from class: androidx.media3.transformer.TransmuxTranscodeHelper.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    arbVarA.set(Mp4Info.create(context, str, j));
                } catch (Exception e) {
                    arbVarA.setException(e);
                }
            }
        }.start();
        return arbVarA;
    }

    public static Composition buildUponCompositionForTrimOptimization(Composition composition, long j, long j2, long j3, boolean z, boolean z2) {
        Effects effects;
        EditedMediaItem editedMediaItem = composition.sequences.get(0).editedMediaItems.get(0);
        MediaItem mediaItemBuild = editedMediaItem.mediaItem.buildUpon().setClippingConfiguration(new MediaItem.ClippingConfiguration.Builder().setStartPositionUs(j).setEndPositionUs(j2).setStartsAtKeyFrame(z).build()).build();
        if (z2) {
            effects = new Effects(editedMediaItem.effects.audioProcessors, ImmutableList.of());
        } else {
            effects = editedMediaItem.effects;
        }
        return composition.buildUpon().setSequences(ImmutableList.of(new EditedMediaItemSequence(editedMediaItem.buildUpon().setMediaItem(mediaItemBuild).setDurationUs(j3).setEffects(effects).build(), new EditedMediaItem[0]))).build();
    }

    private TransmuxTranscodeHelper() {
    }

    public static Composition createVideoOnlyComposition(String str, long j) {
        return new Composition.Builder(ImmutableList.of(new EditedMediaItemSequence(ImmutableList.of(new EditedMediaItem.Builder(new MediaItem.Builder().setUri(str).setClippingConfiguration(new MediaItem.ClippingConfiguration.Builder().setEndPositionMs(Util.usToMs(j)).build()).build()).setRemoveAudio(true).build())))).build();
    }

    public static Composition createAudioTranscodeAndVideoTransmuxComposition(Composition composition, String str) {
        Composition compositionBuildUponComposition = buildUponComposition((Composition) Assertions.checkNotNull(composition), false, true, null);
        Composition.Builder builderBuildUpon = compositionBuildUponComposition.buildUpon();
        ArrayList arrayList = new ArrayList(compositionBuildUponComposition.sequences);
        arrayList.add(new EditedMediaItemSequence(ImmutableList.of(new EditedMediaItem.Builder(new MediaItem.Builder().setUri(str).build()).build())));
        builderBuildUpon.setSequences(arrayList);
        builderBuildUpon.setTransmuxVideo(true);
        return builderBuildUpon.build();
    }

    public static Composition buildUponComposition(Composition composition, boolean z, boolean z2, ResumeMetadata resumeMetadata) {
        long jLongValue;
        int iIntValue;
        Composition.Builder builderBuildUpon = composition.buildUpon();
        ImmutableList<EditedMediaItemSequence> immutableList = composition.sequences;
        ArrayList arrayList = new ArrayList();
        ImmutableList<Pair<Integer, Long>> immutableList2 = resumeMetadata != null ? resumeMetadata.firstMediaItemIndexAndOffsetInfo : null;
        int i = 0;
        while (i < immutableList.size()) {
            EditedMediaItemSequence editedMediaItemSequence = immutableList.get(i);
            ImmutableList<EditedMediaItem> immutableList3 = editedMediaItemSequence.editedMediaItems;
            ArrayList arrayList2 = new ArrayList();
            if (immutableList2 != null) {
                iIntValue = ((Integer) immutableList2.get(i).first).intValue();
                jLongValue = ((Long) immutableList2.get(i).second).longValue();
            } else {
                jLongValue = 0;
                iIntValue = 0;
            }
            int i2 = iIntValue;
            while (i2 < immutableList3.size()) {
                EditedMediaItem editedMediaItem = immutableList3.get(i2);
                EditedMediaItem.Builder builderBuildUpon2 = editedMediaItem.buildUpon();
                if (i2 == iIntValue) {
                    builderBuildUpon2.setMediaItem(editedMediaItem.mediaItem.buildUpon().setClippingConfiguration(editedMediaItem.mediaItem.clippingConfiguration.buildUpon().setStartPositionMs(editedMediaItem.mediaItem.clippingConfiguration.startPositionMs + Util.usToMs(jLongValue)).build()).build());
                }
                if (z) {
                    builderBuildUpon2.setRemoveAudio(true);
                }
                if (z2) {
                    builderBuildUpon2.setRemoveVideo(true);
                }
                arrayList2.add(builderBuildUpon2.build());
                i2++;
                immutableList2 = immutableList2;
                builderBuildUpon = builderBuildUpon;
            }
            arrayList.add(new EditedMediaItemSequence(arrayList2, editedMediaItemSequence.isLooping));
            i++;
            immutableList2 = immutableList2;
            builderBuildUpon = builderBuildUpon;
        }
        Composition.Builder builder = builderBuildUpon;
        builder.setSequences(arrayList);
        return builder.build();
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.media3.transformer.TransmuxTranscodeHelper$2] */
    public static ListenableFuture<ResumeMetadata> getResumeMetadataAsync(final Context context, final String str, final Composition composition) {
        final arb arbVarA = arb.a();
        new Thread("TransmuxTranscodeHelper:ResumeMetadata") { // from class: androidx.media3.transformer.TransmuxTranscodeHelper.2
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    if (arbVarA.isCancelled()) {
                        return;
                    }
                    Mp4Info mp4InfoCreate = Mp4Info.create(context, str);
                    long j = mp4InfoCreate.lastSyncSampleTimestampUs;
                    ImmutableList.c cVar = new ImmutableList.c();
                    if (j != C.TIME_UNSET) {
                        for (int i = 0; i < composition.sequences.size(); i++) {
                            ImmutableList<EditedMediaItem> immutableList = composition.sequences.get(i).editedMediaItems;
                            long j2 = j;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= immutableList.size() || j2 <= 0) {
                                    j2 = 0;
                                    break;
                                }
                                long mediaItemDurationUs = TransmuxTranscodeHelper.getMediaItemDurationUs(context, immutableList.get(i2).mediaItem);
                                if (mediaItemDurationUs > j2) {
                                    break;
                                }
                                j2 -= mediaItemDurationUs;
                                i2++;
                            }
                            cVar.add(new Pair(Integer.valueOf(i2), Long.valueOf(j2)));
                        }
                    }
                    arbVarA.set(new ResumeMetadata(j, cVar.build(), mp4InfoCreate.videoFormat));
                } catch (Exception e) {
                    arbVarA.setException(e);
                }
            }
        }.start();
        return arbVarA;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media3.transformer.TransmuxTranscodeHelper$3] */
    public static ListenableFuture<Void> copyFileAsync(final File file, final File file2) {
        final arb arbVarA = arb.a();
        new Thread("TransmuxTranscodeHelper:CopyFile") { // from class: androidx.media3.transformer.TransmuxTranscodeHelper.3
            /* JADX WARN: Code duplicated, block: B:35:0x005f A[Catch: IOException -> 0x0062, TRY_LEAVE, TryCatch #4 {IOException -> 0x0062, blocks: (B:33:0x005a, B:35:0x005f), top: B:41:0x005a }] */
            /* JADX WARN: Code duplicated, block: B:41:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:52:? A[SYNTHETIC] */
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws Throwable {
                Throwable th;
                FileOutputStream fileOutputStream;
                Throwable th2;
                if (arbVarA.isCancelled()) {
                    return;
                }
                FileInputStream fileInputStream = null;
                try {
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(file);
                        try {
                            fileOutputStream = new FileOutputStream(file2);
                            try {
                                aoy.e(fileInputStream2, fileOutputStream);
                                arbVarA.set(null);
                                fileInputStream2.close();
                                fileOutputStream.close();
                            } catch (Exception e) {
                                e = e;
                                fileInputStream = fileInputStream2;
                                try {
                                    arbVarA.setException(e);
                                    if (fileInputStream != null) {
                                        fileInputStream.close();
                                    }
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                } catch (Throwable th3) {
                                    fileInputStream2 = fileInputStream;
                                    th2 = th3;
                                    FileInputStream fileInputStream3 = fileInputStream2;
                                    th = th2;
                                    fileInputStream = fileInputStream3;
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (IOException unused) {
                                            throw th;
                                        }
                                    }
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                        throw th;
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th2 = th4;
                                FileInputStream fileInputStream4 = fileInputStream2;
                                th = th2;
                                fileInputStream = fileInputStream4;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                    throw th;
                                }
                                throw th;
                            }
                        } catch (Exception e2) {
                            fileOutputStream = null;
                            fileInputStream = fileInputStream2;
                            e = e2;
                        } catch (Throwable th5) {
                            fileOutputStream = null;
                            fileInputStream = fileInputStream2;
                            th = th5;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                                throw th;
                            }
                            throw th;
                        }
                    } catch (IOException unused2) {
                    }
                } catch (Exception e3) {
                    e = e3;
                    fileOutputStream = null;
                } catch (Throwable th6) {
                    th = th6;
                    fileOutputStream = null;
                }
            }
        }.start();
        return arbVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getMediaItemDurationUs(Context context, MediaItem mediaItem) throws IOException {
        long jMsToUs;
        String string = ((MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem.localConfiguration)).uri.toString();
        long jMsToUs2 = Util.msToUs(mediaItem.clippingConfiguration.startPositionMs);
        if (mediaItem.clippingConfiguration.endPositionMs != Long.MIN_VALUE) {
            jMsToUs = Util.msToUs(mediaItem.clippingConfiguration.endPositionMs);
        } else {
            jMsToUs = Mp4Info.create(context, string).durationUs;
        }
        return jMsToUs - jMsToUs2;
    }
}
