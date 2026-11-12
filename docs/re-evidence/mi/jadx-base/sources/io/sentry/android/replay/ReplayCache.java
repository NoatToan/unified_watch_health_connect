package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.compose.runtime.internal.StabilityInferred;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.devicesettings.thirdparty.PhoneStateBroadcastReceiver;
import defpackage.yq5;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.android.replay.video.MuxerConfig;
import io.sentry.android.replay.video.SimpleVideoEncoder;
import io.sentry.l;
import io.sentry.protocol.p;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.LongProgression;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 O2\u00020\u0001:\u0001OB\u001f\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\bM\u0010NJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0014\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0016JA\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u0004\u0018\u00010\u00102\u0006\u0010!\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001d\u0010@\u001a\u0004\u0018\u00010\u00078@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R \u0010B\u001a\b\u0012\u0004\u0012\u00020\u00020A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER0\u0010H\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100Fj\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001d\u0010L\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010=\u001a\u0004\bK\u0010?¨\u0006P"}, d2 = {"Lio/sentry/android/replay/ReplayCache;", "Ljava/io/Closeable;", "Lio/sentry/android/replay/ReplayFrame;", "frame", "", "encode", "(Lio/sentry/android/replay/ReplayFrame;)Z", "Ljava/io/File;", "file", "", "deleteFile", "(Ljava/io/File;)V", "Landroid/graphics/Bitmap;", "bitmap", "", "frameTimestamp", "", PhoneStateBroadcastReceiver.PARAMS_SCREEN, "addFrame$sentry_android_replay_release", "(Landroid/graphics/Bitmap;JLjava/lang/String;)V", "addFrame", "screenshot", "(Ljava/io/File;JLjava/lang/String;)V", "duration", "from", "", "segmentId", "height", "width", "videoFile", "Lio/sentry/android/replay/GeneratedVideo;", "createVideoOf", "(JJIIILjava/io/File;)Lio/sentry/android/replay/GeneratedVideo;", "until", "rotate", "(J)Ljava/lang/String;", Constants.EXTRA_CLOSE_TAI, "()V", "key", "value", "persistSegmentValues", "(Ljava/lang/String;Ljava/lang/String;)V", "Lio/sentry/SentryOptions;", "options", "Lio/sentry/SentryOptions;", "Lio/sentry/protocol/p;", "replayId", "Lio/sentry/protocol/p;", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "recorderConfig", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isClosed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "encoderLock", "Ljava/lang/Object;", "Lio/sentry/android/replay/video/SimpleVideoEncoder;", "encoder", "Lio/sentry/android/replay/video/SimpleVideoEncoder;", "replayCacheDir$delegate", "Lkotlin/Lazy;", "getReplayCacheDir$sentry_android_replay_release", "()Ljava/io/File;", "replayCacheDir", "", "frames", "Ljava/util/List;", "getFrames$sentry_android_replay_release", "()Ljava/util/List;", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "ongoingSegment", "Ljava/util/LinkedHashMap;", "ongoingSegmentFile$delegate", "getOngoingSegmentFile", "ongoingSegmentFile", "<init>", "(Lio/sentry/SentryOptions;Lio/sentry/protocol/p;Lio/sentry/android/replay/ScreenshotRecorderConfig;)V", "Companion", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReplayCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplayCache.kt\nio/sentry/android/replay/ReplayCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,444:1\n1#2:445\n1#2:448\n230#3,2:446\n739#4,4:449\n*S KotlinDebug\n*F\n+ 1 ReplayCache.kt\nio/sentry/android/replay/ReplayCache\n*L\n268#1:448\n268#1:446,2\n269#1:449,4\n*E\n"})
public final class ReplayCache implements Closeable {

    @NotNull
    public static final String ONGOING_SEGMENT = ".ongoing_segment";

    @NotNull
    public static final String SEGMENT_KEY_BIT_RATE = "config.bit-rate";

    @NotNull
    public static final String SEGMENT_KEY_FRAME_RATE = "config.frame-rate";

    @NotNull
    public static final String SEGMENT_KEY_HEIGHT = "config.height";

    @NotNull
    public static final String SEGMENT_KEY_ID = "segment.id";

    @NotNull
    public static final String SEGMENT_KEY_REPLAY_ID = "replay.id";

    @NotNull
    public static final String SEGMENT_KEY_REPLAY_RECORDING = "replay.recording";

    @NotNull
    public static final String SEGMENT_KEY_REPLAY_SCREEN_AT_START = "replay.screen-at-start";

    @NotNull
    public static final String SEGMENT_KEY_REPLAY_TYPE = "replay.type";

    @NotNull
    public static final String SEGMENT_KEY_TIMESTAMP = "segment.timestamp";

    @NotNull
    public static final String SEGMENT_KEY_WIDTH = "config.width";

    @Nullable
    private SimpleVideoEncoder encoder;

    @NotNull
    private final Object encoderLock;

    @NotNull
    private final List<ReplayFrame> frames;

    @NotNull
    private final AtomicBoolean isClosed;

    @NotNull
    private final LinkedHashMap<String, String> ongoingSegment;

    /* JADX INFO: renamed from: ongoingSegmentFile$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ongoingSegmentFile;

    @NotNull
    private final SentryOptions options;

    @NotNull
    private final ScreenshotRecorderConfig recorderConfig;

    /* JADX INFO: renamed from: replayCacheDir$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy replayCacheDir;

    @NotNull
    private final p replayId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ]\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042:\b\u0002\u0010\u000f\u001a4\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\tH\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00148\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00148\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00148\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00148\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0014\u0010\u001c\u001a\u00020\u00148\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\u00148\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0016R\u0014\u0010\u001e\u001a\u00020\u00148\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0016R\u0014\u0010\u001f\u001a\u00020\u00148\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0016R\u0014\u0010 \u001a\u00020\u00148\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010\u0016¨\u0006#"}, d2 = {"Lio/sentry/android/replay/ReplayCache$Companion;", "", "Lio/sentry/SentryOptions;", "options", "Lio/sentry/protocol/p;", "replayId", "Ljava/io/File;", "makeReplayCacheDir", "(Lio/sentry/SentryOptions;Lio/sentry/protocol/p;)Ljava/io/File;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "recorderConfig", "Lio/sentry/android/replay/ReplayCache;", "replayCacheProvider", "Lio/sentry/android/replay/LastSegmentData;", "fromDisk$sentry_android_replay_release", "(Lio/sentry/SentryOptions;Lio/sentry/protocol/p;Lkotlin/jvm/functions/Function2;)Lio/sentry/android/replay/LastSegmentData;", "fromDisk", "", "ONGOING_SEGMENT", "Ljava/lang/String;", "SEGMENT_KEY_BIT_RATE", "SEGMENT_KEY_FRAME_RATE", "SEGMENT_KEY_HEIGHT", "SEGMENT_KEY_ID", "SEGMENT_KEY_REPLAY_ID", "SEGMENT_KEY_REPLAY_RECORDING", "SEGMENT_KEY_REPLAY_SCREEN_AT_START", "SEGMENT_KEY_REPLAY_TYPE", "SEGMENT_KEY_TIMESTAMP", "SEGMENT_KEY_WIDTH", "<init>", "()V", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nReplayCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplayCache.kt\nio/sentry/android/replay/ReplayCache$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,444:1\n1#2:445\n1#2:448\n230#3,2:446\n739#4,4:449\n1002#5,2:453\n1045#5:455\n*S KotlinDebug\n*F\n+ 1 ReplayCache.kt\nio/sentry/android/replay/ReplayCache$Companion\n*L\n319#1:448\n319#1:446,2\n320#1:449,4\n385#1:453,2\n416#1:455\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean fromDisk$lambda$3(ReplayCache cache, File file, String name) {
            Intrinsics.checkNotNullParameter(cache, "$cache");
            Intrinsics.checkNotNullExpressionValue(name, "name");
            if (StringsKt__StringsJVMKt.endsWith$default(name, ".jpg", false, 2, null)) {
                File file2 = new File(file, name);
                Long longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(FilesKt__UtilsKt.getNameWithoutExtension(file2));
                if (longOrNull != null) {
                    ReplayCache.addFrame$default(cache, file2, longOrNull.longValue(), null, 4, null);
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LastSegmentData fromDisk$sentry_android_replay_release$default(Companion companion, SentryOptions sentryOptions, p pVar, Function2 function2, int i, Object obj) {
            if ((i & 4) != 0) {
                function2 = null;
            }
            return companion.fromDisk$sentry_android_replay_release(sentryOptions, pVar, function2);
        }

        /* JADX WARN: Code duplicated, block: B:92:0x020f  */
        @Nullable
        public final LastSegmentData fromDisk$sentry_android_replay_release(@NotNull SentryOptions options, @NotNull p replayId, @Nullable Function2<? super p, ? super ScreenshotRecorderConfig, ReplayCache> replayCacheProvider) {
            Date dateD;
            SentryReplayEvent.ReplayType replayTypeValueOf;
            final ReplayCache replayCache;
            String str = "";
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(replayId, "replayId");
            File fileMakeReplayCacheDir = makeReplayCacheDir(options, replayId);
            File file = new File(fileMakeReplayCacheDir, ReplayCache.ONGOING_SEGMENT);
            List listEmptyList = null;
            if (!file.exists()) {
                options.getLogger().c(SentryLevel.DEBUG, "No ongoing segment found for replay: %s", replayId);
                io.sentry.util.e.a(fileMakeReplayCacheDir);
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                Iterator<String> it = TextStreamsKt.lineSequence(bufferedReader).iterator();
                while (it.hasNext()) {
                    List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) it.next(), new String[]{"="}, false, 2, 2, (Object) null);
                    Pair pair = TuplesKt.to((String) listSplit$default.get(0), (String) listSplit$default.get(1));
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                CloseableKt.closeFinally(bufferedReader, null);
                String str2 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_HEIGHT);
                Integer intOrNull = str2 != null ? StringsKt__StringNumberConversionsKt.toIntOrNull(str2) : null;
                String str3 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_WIDTH);
                Integer intOrNull2 = str3 != null ? StringsKt__StringNumberConversionsKt.toIntOrNull(str3) : null;
                String str4 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_FRAME_RATE);
                Integer intOrNull3 = str4 != null ? StringsKt__StringNumberConversionsKt.toIntOrNull(str4) : null;
                String str5 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_BIT_RATE);
                Integer intOrNull4 = str5 != null ? StringsKt__StringNumberConversionsKt.toIntOrNull(str5) : null;
                String str6 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_ID);
                Integer intOrNull5 = str6 != null ? StringsKt__StringNumberConversionsKt.toIntOrNull(str6) : null;
                try {
                    String str7 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_TIMESTAMP);
                    if (str7 == null) {
                        str7 = "";
                    }
                    dateD = yq5.e(str7);
                } catch (Throwable unused) {
                    dateD = null;
                }
                try {
                    String str8 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_REPLAY_TYPE);
                    if (str8 != null) {
                        str = str8;
                    }
                    replayTypeValueOf = SentryReplayEvent.ReplayType.valueOf(str);
                } catch (Throwable unused2) {
                    replayTypeValueOf = null;
                }
                if (intOrNull == null || intOrNull2 == null || intOrNull3 == null || intOrNull4 == null || intOrNull5 == null || intOrNull5.intValue() == -1 || dateD == null || replayTypeValueOf == null) {
                    options.getLogger().c(SentryLevel.DEBUG, "Incorrect segment values found for replay: %s, deleting the replay", replayId);
                    io.sentry.util.e.a(fileMakeReplayCacheDir);
                    return null;
                }
                ScreenshotRecorderConfig screenshotRecorderConfig = new ScreenshotRecorderConfig(intOrNull2.intValue(), intOrNull.intValue(), 1.0f, 1.0f, intOrNull3.intValue(), intOrNull4.intValue());
                if (replayCacheProvider == null || (replayCache = replayCacheProvider.invoke(replayId, screenshotRecorderConfig)) == null) {
                    replayCache = new ReplayCache(options, replayId, screenshotRecorderConfig);
                }
                File replayCacheDir$sentry_android_replay_release = replayCache.getReplayCacheDir$sentry_android_replay_release();
                if (replayCacheDir$sentry_android_replay_release != null) {
                    replayCacheDir$sentry_android_replay_release.listFiles(new FilenameFilter() { // from class: io.sentry.android.replay.b
                        @Override // java.io.FilenameFilter
                        public final boolean accept(File file2, String str9) {
                            return ReplayCache.Companion.fromDisk$lambda$3(replayCache, file2, str9);
                        }
                    });
                }
                if (replayCache.getFrames$sentry_android_replay_release().isEmpty()) {
                    options.getLogger().c(SentryLevel.DEBUG, "No frames found for replay: %s, deleting the replay", replayId);
                    io.sentry.util.e.a(fileMakeReplayCacheDir);
                    return null;
                }
                List<ReplayFrame> frames$sentry_android_replay_release = replayCache.getFrames$sentry_android_replay_release();
                if (frames$sentry_android_replay_release.size() > 1) {
                    CollectionsKt__MutableCollectionsJVMKt.sortWith(frames$sentry_android_replay_release, new Comparator() { // from class: io.sentry.android.replay.ReplayCache$Companion$fromDisk$$inlined$sortBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((ReplayFrame) t).getTimestamp()), Long.valueOf(((ReplayFrame) t2).getTimestamp()));
                        }
                    });
                }
                SentryReplayEvent.ReplayType replayType = SentryReplayEvent.ReplayType.SESSION;
                int iIntValue = replayTypeValueOf == replayType ? intOrNull5.intValue() : 0;
                if (replayTypeValueOf != replayType) {
                    dateD = yq5.d(((ReplayFrame) CollectionsKt___CollectionsKt.first((List) replayCache.getFrames$sentry_android_replay_release())).getTimestamp());
                    Intrinsics.checkNotNullExpressionValue(dateD, "{\n                // in ….timestamp)\n            }");
                }
                Date date = dateD;
                long timestamp = (((ReplayFrame) CollectionsKt___CollectionsKt.last((List) replayCache.getFrames$sentry_android_replay_release())).getTimestamp() - date.getTime()) + ((long) (1000 / intOrNull3.intValue()));
                String str9 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_REPLAY_RECORDING);
                if (str9 == null) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    l lVar = (l) options.getSerializer().b(new StringReader(str9), l.class);
                    if ((lVar != null ? lVar.a() : null) != null) {
                        List<? extends io.sentry.rrweb.b> listA = lVar.a();
                        Intrinsics.checkNotNull(listA);
                        listEmptyList = new LinkedList(listA);
                    }
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    }
                }
                return new LastSegmentData(screenshotRecorderConfig, replayCache, date, iIntValue, timestamp, replayTypeValueOf, (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_REPLAY_SCREEN_AT_START), CollectionsKt___CollectionsKt.sortedWith(listEmptyList, new Comparator() { // from class: io.sentry.android.replay.ReplayCache$Companion$fromDisk$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((io.sentry.rrweb.b) t).e()), Long.valueOf(((io.sentry.rrweb.b) t2).e()));
                    }
                }));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(bufferedReader, th);
                    throw th2;
                }
            }
        }

        @Nullable
        public final File makeReplayCacheDir(@NotNull SentryOptions options, @NotNull p replayId) {
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(replayId, "replayId");
            String cacheDirPath = options.getCacheDirPath();
            if (cacheDirPath == null || cacheDirPath.length() == 0) {
                options.getLogger().c(SentryLevel.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                return null;
            }
            String cacheDirPath2 = options.getCacheDirPath();
            Intrinsics.checkNotNull(cacheDirPath2);
            File file = new File(cacheDirPath2, "replay_" + replayId);
            file.mkdirs();
            return file;
        }
    }

    public ReplayCache(@NotNull SentryOptions options, @NotNull p replayId, @NotNull ScreenshotRecorderConfig recorderConfig) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        this.options = options;
        this.replayId = replayId;
        this.recorderConfig = recorderConfig;
        this.isClosed = new AtomicBoolean(false);
        this.encoderLock = new Object();
        this.replayCacheDir = LazyKt__LazyJVMKt.lazy(new Function0<File>() { // from class: io.sentry.android.replay.ReplayCache$replayCacheDir$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final File invoke() {
                return ReplayCache.INSTANCE.makeReplayCacheDir(this.this$0.options, this.this$0.replayId);
            }
        });
        this.frames = new ArrayList();
        this.ongoingSegment = new LinkedHashMap<>();
        this.ongoingSegmentFile = LazyKt__LazyJVMKt.lazy(new Function0<File>() { // from class: io.sentry.android.replay.ReplayCache$ongoingSegmentFile$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final File invoke() throws IOException {
                if (this.this$0.getReplayCacheDir$sentry_android_replay_release() == null) {
                    return null;
                }
                File file = new File(this.this$0.getReplayCacheDir$sentry_android_replay_release(), ReplayCache.ONGOING_SEGMENT);
                if (!file.exists()) {
                    file.createNewFile();
                }
                return file;
            }
        });
    }

    public static /* synthetic */ void addFrame$default(ReplayCache replayCache, File file, long j, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        replayCache.addFrame(file, j, str);
    }

    public static /* synthetic */ void addFrame$sentry_android_replay_release$default(ReplayCache replayCache, Bitmap bitmap, long j, String str, int i, Object obj) throws IOException {
        if ((i & 4) != 0) {
            str = null;
        }
        replayCache.addFrame$sentry_android_replay_release(bitmap, j, str);
    }

    public static /* synthetic */ GeneratedVideo createVideoOf$default(ReplayCache replayCache, long j, long j2, int i, int i2, int i3, File file, int i4, Object obj) {
        File file2;
        if ((i4 & 32) != 0) {
            file2 = new File(replayCache.getReplayCacheDir$sentry_android_replay_release(), i + ".mp4");
        } else {
            file2 = file;
        }
        return replayCache.createVideoOf(j, j2, i, i2, i3, file2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteFile(File file) {
        try {
            if (file.delete()) {
                return;
            }
            this.options.getLogger().c(SentryLevel.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th) {
            this.options.getLogger().b(SentryLevel.ERROR, th, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    private final boolean encode(ReplayFrame frame) {
        try {
            Bitmap bitmap = BitmapFactory.decodeFile(frame.getScreenshot().getAbsolutePath());
            synchronized (this.encoderLock) {
                SimpleVideoEncoder simpleVideoEncoder = this.encoder;
                if (simpleVideoEncoder != null) {
                    Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
                    simpleVideoEncoder.encode(bitmap);
                    Unit unit = Unit.INSTANCE;
                }
            }
            bitmap.recycle();
            return true;
        } catch (Throwable th) {
            this.options.getLogger().a(SentryLevel.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th);
            return false;
        }
    }

    private final File getOngoingSegmentFile() {
        return (File) this.ongoingSegmentFile.getValue();
    }

    public final void addFrame(@NotNull File screenshot, long frameTimestamp, @Nullable String screen) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        this.frames.add(new ReplayFrame(screenshot, frameTimestamp, screen));
    }

    public final void addFrame$sentry_android_replay_release(@NotNull Bitmap bitmap, long frameTimestamp, @Nullable String screen) throws IOException {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (getReplayCacheDir$sentry_android_replay_release() == null || bitmap.isRecycled()) {
            return;
        }
        File replayCacheDir$sentry_android_replay_release = getReplayCacheDir$sentry_android_replay_release();
        if (replayCacheDir$sentry_android_replay_release != null) {
            replayCacheDir$sentry_android_replay_release.mkdirs();
        }
        File file = new File(getReplayCacheDir$sentry_android_replay_release(), frameTimestamp + ".jpg");
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            fileOutputStream.flush();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
            addFrame(file, frameTimestamp, screen);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(fileOutputStream, th);
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.encoderLock) {
            try {
                SimpleVideoEncoder simpleVideoEncoder = this.encoder;
                if (simpleVideoEncoder != null) {
                    simpleVideoEncoder.release();
                }
                this.encoder = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.isClosed.set(true);
    }

    @Nullable
    public final GeneratedVideo createVideoOf(long duration, long from, int segmentId, int height, int width, @NotNull File videoFile) throws Throwable {
        Object obj;
        int i;
        SimpleVideoEncoder simpleVideoEncoder;
        long duration2;
        Intrinsics.checkNotNullParameter(videoFile, "videoFile");
        if (videoFile.exists() && videoFile.length() > 0) {
            videoFile.delete();
        }
        if (this.frames.isEmpty()) {
            this.options.getLogger().c(SentryLevel.DEBUG, "No captured frames, skipping generating a video segment", new Object[0]);
            return null;
        }
        Object obj2 = this.encoderLock;
        synchronized (obj2) {
            try {
                obj = obj2;
                try {
                    SimpleVideoEncoder simpleVideoEncoder2 = new SimpleVideoEncoder(this.options, new MuxerConfig(videoFile, width, height, this.recorderConfig.getFrameRate(), this.recorderConfig.getBitRate(), null, 32, null), null, 4, null);
                    simpleVideoEncoder2.start();
                    this.encoder = simpleVideoEncoder2;
                    long frameRate = ((long) 1000) / ((long) this.recorderConfig.getFrameRate());
                    ReplayFrame replayFrame = (ReplayFrame) CollectionsKt___CollectionsKt.first((List) this.frames);
                    long j = from + duration;
                    LongProgression longProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(from, j), frameRate);
                    long first = longProgressionStep.getFirst();
                    long last = longProgressionStep.getLast();
                    long step = longProgressionStep.getStep();
                    if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                        i = 0;
                    } else {
                        int i2 = 0;
                        while (true) {
                            for (ReplayFrame replayFrame2 : this.frames) {
                                long j2 = first + frameRate;
                                long timestamp = replayFrame2.getTimestamp();
                                if (first <= timestamp && timestamp <= j2) {
                                    replayFrame = replayFrame2;
                                    break;
                                }
                                if (replayFrame2.getTimestamp() > j2) {
                                    break;
                                }
                            }
                            if (encode(replayFrame)) {
                                i2++;
                            }
                            if (first == last) {
                                break;
                            }
                            first += step;
                        }
                        i = i2;
                    }
                    if (i == 0) {
                        this.options.getLogger().c(SentryLevel.DEBUG, "Generated a video with no frames, not capturing a replay segment", new Object[0]);
                        deleteFile(videoFile);
                        return null;
                    }
                    synchronized (this.encoderLock) {
                        try {
                            SimpleVideoEncoder simpleVideoEncoder3 = this.encoder;
                            if (simpleVideoEncoder3 != null) {
                                simpleVideoEncoder3.release();
                            }
                            SimpleVideoEncoder simpleVideoEncoder4 = this.encoder;
                            if (simpleVideoEncoder4 != null) {
                                duration2 = simpleVideoEncoder4.getDuration();
                                simpleVideoEncoder = null;
                            } else {
                                simpleVideoEncoder = null;
                                duration2 = 0;
                            }
                            this.encoder = simpleVideoEncoder;
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    rotate(j);
                    return new GeneratedVideo(videoFile, i, duration2);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
            }
        }
    }

    @NotNull
    public final List<ReplayFrame> getFrames$sentry_android_replay_release() {
        return this.frames;
    }

    @Nullable
    public final File getReplayCacheDir$sentry_android_replay_release() {
        return (File) this.replayCacheDir.getValue();
    }

    public final synchronized void persistSegmentValues(@NotNull String key, @Nullable String value) {
        File ongoingSegmentFile;
        try {
            Intrinsics.checkNotNullParameter(key, "key");
            if (this.isClosed.get()) {
                return;
            }
            if (this.ongoingSegment.isEmpty() && (ongoingSegmentFile = getOngoingSegmentFile()) != null) {
                Reader inputStreamReader = new InputStreamReader(new FileInputStream(ongoingSegmentFile), Charsets.UTF_8);
                BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                try {
                    Sequence<String> sequenceLineSequence = TextStreamsKt.lineSequence(bufferedReader);
                    LinkedHashMap<String, String> linkedHashMap = this.ongoingSegment;
                    Iterator<String> it = sequenceLineSequence.iterator();
                    while (it.hasNext()) {
                        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) it.next(), new String[]{"="}, false, 2, 2, (Object) null);
                        Pair pair = TuplesKt.to((String) listSplit$default.get(0), (String) listSplit$default.get(1));
                        linkedHashMap.put((String) pair.getFirst(), (String) pair.getSecond());
                    }
                    CloseableKt.closeFinally(bufferedReader, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(bufferedReader, th);
                        throw th2;
                    }
                }
            }
            if (value == null) {
                this.ongoingSegment.remove(key);
            } else {
                this.ongoingSegment.put(key, value);
            }
            File ongoingSegmentFile2 = getOngoingSegmentFile();
            if (ongoingSegmentFile2 != null) {
                Set<Map.Entry<String, String>> setEntrySet = this.ongoingSegment.entrySet();
                Intrinsics.checkNotNullExpressionValue(setEntrySet, "ongoingSegment.entries");
                FilesKt__FileReadWriteKt.writeText$default(ongoingSegmentFile2, CollectionsKt___CollectionsKt.joinToString$default(setEntrySet, "\n", null, null, 0, null, new Function1<Map.Entry<String, String>, CharSequence>() { // from class: io.sentry.android.replay.ReplayCache.persistSegmentValues.2
                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final CharSequence invoke2(@NotNull Map.Entry<String, String> entry) {
                        Intrinsics.checkNotNullParameter(entry, "<name for destructuring parameter 0>");
                        return entry.getKey() + '=' + entry.getValue();
                    }
                }, 30, null), null, 2, null);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final String rotate(final long until) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        CollectionsKt__MutableCollectionsKt.removeAll((List) this.frames, (Function1) new Function1<ReplayFrame, Boolean>() { // from class: io.sentry.android.replay.ReplayCache.rotate.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r5v2, types: [T, java.lang.String] */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Boolean invoke2(@NotNull ReplayFrame it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getTimestamp() < until) {
                    this.deleteFile(it.getScreenshot());
                    return Boolean.TRUE;
                }
                Ref.ObjectRef<String> objectRef2 = objectRef;
                if (objectRef2.element == null) {
                    objectRef2.element = it.getScreen();
                }
                return Boolean.FALSE;
            }
        });
        return (String) objectRef.element;
    }
}
