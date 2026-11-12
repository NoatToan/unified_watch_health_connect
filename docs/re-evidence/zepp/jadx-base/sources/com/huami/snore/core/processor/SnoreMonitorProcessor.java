package com.huami.snore.core.processor;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.snore.algorithm.SnoreAlgorithmJni;
import com.huami.snore.core.domain.RecorderConfig;
import com.huami.snore.core.domain.SnoreConstant;
import com.huami.snore.core.helper.SnoreHelper;
import com.huami.snore.core.util.SnoreSpCache;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.liulishuo.engzo.lingorecorder.processor.AudioProcessor;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 (2\u00020\u0001:\u0001(B\u001b\b\u0016\u0012\u0006\u0010%\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010!\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b\u000e\u0010 R\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006)"}, d2 = {"Lcom/huami/snore/core/processor/SnoreMonitorProcessor;", "Lcom/liulishuo/engzo/lingorecorder/processor/AudioProcessor;", "", "needExit", "", "start", "", HTTP.CONTENT_RANGE_BYTES, "", "size", "flow", "end", "release", "Lcom/huami/snore/core/domain/RecorderConfig;", "a", "Lcom/huami/snore/core/domain/RecorderConfig;", "recordConfig", "Lcom/huami/snore/core/processor/SnoreResultProcessImpl;", "b", "Lkotlin/Lazy;", "()Lcom/huami/snore/core/processor/SnoreResultProcessImpl;", "mProcessManager", "Landroid/content/Context;", "c", "Landroid/content/Context;", "mContext", "", GoogleApiAvailabilityLight.a, "J", "startTime", "Lcom/huami/snore/algorithm/SnoreAlgorithmJni;", "e", "()Lcom/huami/snore/algorithm/SnoreAlgorithmJni;", "mJniTest", "f", "Z", "needReturn", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;Lcom/huami/snore/core/domain/RecorderConfig;)V", "Companion", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class SnoreMonitorProcessor implements AudioProcessor {

    @NotNull
    public static final String TAG = "VoiceWavProcessor";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private RecorderConfig recordConfig;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mProcessManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private Context mContext;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long startTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy mJniTest;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean needReturn;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return String.valueOf(SnoreMonitorProcessor.this.a().getResult());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return String.valueOf(SnoreMonitorProcessor.this.a().getResult());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/snore/algorithm/SnoreAlgorithmJni;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<SnoreAlgorithmJni> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SnoreAlgorithmJni invoke() {
            RecorderConfig recorderConfig = SnoreMonitorProcessor.this.recordConfig;
            Objects.requireNonNull(recorderConfig);
            String tfModel = recorderConfig.getTfModel();
            RecorderConfig recorderConfig2 = SnoreMonitorProcessor.this.recordConfig;
            Objects.requireNonNull(recorderConfig2);
            return new SnoreAlgorithmJni(tfModel, recorderConfig2.getTimeLag());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/snore/core/processor/SnoreResultProcessImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<SnoreResultProcessImpl> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SnoreResultProcessImpl invoke() {
            RecorderConfig recorderConfig = SnoreMonitorProcessor.this.recordConfig;
            Objects.requireNonNull(recorderConfig);
            return new SnoreResultProcessImpl(recorderConfig);
        }
    }

    public SnoreMonitorProcessor(@NotNull Context context, @NotNull RecorderConfig recorderConfig) {
        this.mProcessManager = LazyKt__LazyJVMKt.lazy(new e());
        this.mJniTest = LazyKt__LazyJVMKt.lazy(new d());
        this.mContext = context;
        this.recordConfig = recorderConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SnoreAlgorithmJni a() {
        return (SnoreAlgorithmJni) this.mJniTest.getValue();
    }

    private final SnoreResultProcessImpl b() {
        return (SnoreResultProcessImpl) this.mProcessManager.getValue();
    }

    @Override // com.liulishuo.engzo.lingorecorder.processor.AudioProcessor
    public void end() {
        b().end(this.mContext);
    }

    @Override // com.liulishuo.engzo.lingorecorder.processor.AudioProcessor
    public void flow(@Nullable byte[] bytes, int size) {
        if (System.currentTimeMillis() - this.startTime > 600000) {
            SnoreSpCache.INSTANCE.getInstance().saveBooleanCache(this.mContext, SnoreConstant.SP_KEY_MORE_TEN_MINI, Boolean.TRUE);
        }
        try {
            SnoreHelper snoreHelper = SnoreHelper.instance;
            if (snoreHelper.isFmActive(this.mContext) || snoreHelper.isTelephonyCalling(this.mContext)) {
                HMLog.verbose(TAG, new b());
                b().setVoiceAnalysisResult(this.mContext, VolumeResult.NOSOUND.getResult());
            } else {
                a().sendData(bytes, size);
                b().process(bytes, size);
                HMLog.info(TAG, new a());
                b().setVoiceAnalysisResult(this.mContext, a().getResult());
            }
        } catch (Exception e2) {
            HMLog.info(TAG, new c(e2));
            this.needReturn = true;
        }
    }

    @Override // com.liulishuo.engzo.lingorecorder.processor.AudioProcessor
    /* JADX INFO: renamed from: needExit, reason: from getter */
    public boolean getNeedReturn() {
        return this.needReturn;
    }

    @Override // com.liulishuo.engzo.lingorecorder.processor.AudioProcessor
    public void release() {
        b().release();
    }

    @Override // com.liulishuo.engzo.lingorecorder.processor.AudioProcessor
    public void start() {
        this.startTime = System.currentTimeMillis();
        SnoreSpCache.INSTANCE.getInstance().saveLongCache(this.mContext, SnoreConstant.SP_KEY_START_MONITOR, Long.valueOf(System.currentTimeMillis()));
    }

    public /* synthetic */ SnoreMonitorProcessor(Context context, RecorderConfig recorderConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new RecorderConfig() : recorderConfig);
    }
}
