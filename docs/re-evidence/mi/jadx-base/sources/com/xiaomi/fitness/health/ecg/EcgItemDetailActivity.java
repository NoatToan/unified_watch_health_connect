package com.xiaomi.fitness.health.ecg;

import android.app.Application;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ShareIntentExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.ecg.EcgItemDetailActivity;
import com.xiaomi.fitness.health.ecg.data.EcgConstantsKt;
import com.xiaomi.fitness.health.ecg.util.EcgExtKt;
import com.xiaomi.fitness.health.ecg.util.EcgTrackHelper;
import com.xiaomi.fitness.health.ecg.view.EcgCombineView;
import com.xiaomi.fitness.health.ecg.web.EcgWebViewActivity;
import com.xiaomi.fitness.health.ecg.web.EcgWebViewActivityKt;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainHelper;
import com.xiaomi.fitness.mine.export.IWebSync;
import com.xiaomi.fitness.util.PingAnHealthExtKt;
import com.xiaomi.fitness.view.HealthBannerCardSetView;
import com.xiaomi.fitness.view.TitleBarAlphaView;
import defpackage.a4i;
import defpackage.av6;
import defpackage.bqh;
import defpackage.c0j;
import defpackage.cv1;
import defpackage.dih;
import defpackage.eah;
import defpackage.eri;
import defpackage.hym;
import defpackage.jui;
import defpackage.nwi;
import defpackage.ohi;
import defpackage.pm0;
import defpackage.qxi;
import defpackage.sgq;
import defpackage.yaa;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u0000 W2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001WB\u0007¢\u0006\u0004\bV\u0010\fJ\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\fJ\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\fJ\u000f\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\fJ\u000f\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010\fJ\u0019\u0010\"\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010 H\u0014¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010(\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b(\u0010'J\u0017\u0010)\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b)\u0010\nJ!\u0010,\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\u00192\b\u0010+\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\bH\u0016¢\u0006\u0004\b.\u0010\fJ'\u00103\u001a\u00020\b2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/2\u0006\u00102\u001a\u00020 H\u0016¢\u0006\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00020/0H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u001c\u0010K\u001a\b\u0012\u0004\u0012\u00020/0H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010JR\u0016\u0010L\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010GR\u0016\u0010M\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010GR\u0014\u0010O\u001a\u00020N8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010U\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010R¨\u0006X"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/EcgItemDetailActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/health/ecg/EcgViewModel;", "Lpm0;", "Leah;", "Lyaa;", "Landroid/content/Intent;", "intent", "", "initIntentData", "(Landroid/content/Intent;)V", "checkAnalyzingTime", "()V", "refreshView", "initHrmCard", "initView", "initExpertAnalyzeCard", "checkEcgDataPrivacy", "jumpDataPrivacyAuthPage", "refreshAnalyzeView", "initSymptomCard", "refreshSymptomCard", "showEcgSymptomDialog", "showEmptyGuideSymptom", "showNormalSymptom", "", "getSymptomStr", "()Ljava/lang/String;", "getScenesStr", "initTitle", "dealDeleteAction", "dealShare", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onImgBackClick", "(Landroid/view/View;)V", "onImgShareClick", "onNewIntent", "filePath", "title", "sharePdf", "(Ljava/lang/String;Ljava/lang/String;)V", "onShowCalendar", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onFragmentResult", "(IILandroid/os/Bundle;)V", "Lcom/xiaomi/fitness/view/TitleBarAlphaView;", "titleBarAlphaView", "Lcom/xiaomi/fitness/view/TitleBarAlphaView;", "Landroid/widget/ImageView;", "ivMore", "Landroid/widget/ImageView;", "Lcom/xiaomi/fitness/health/ecg/view/EcgCombineView;", "ecgCombineView", "Lcom/xiaomi/fitness/health/ecg/view/EcgCombineView;", "layoutSymptom", "Landroid/view/View;", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "ecgMeasureReport", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "", "dataTimeSeconds", "Ljava/lang/Long;", "avgHrm", "I", "", "selectSymptomList", "Ljava/util/List;", "selectScenesList", "selectFrequency", FitnessDBConstants.COL_ECG_INTERPRET_STATUS, "", "isEmptySymptom", "()Z", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEcgItemDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcgItemDetailActivity.kt\ncom/xiaomi/fitness/health/ecg/EcgItemDetailActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,543:1\n1557#2:544\n1628#2,3:545\n1557#2:548\n1628#2,3:549\n1863#2,2:552\n1863#2,2:554\n1557#2:556\n1628#2,3:557\n1557#2:560\n1628#2,3:561\n*S KotlinDebug\n*F\n+ 1 EcgItemDetailActivity.kt\ncom/xiaomi/fitness/health/ecg/EcgItemDetailActivity\n*L\n312#1:544\n312#1:545,3\n314#1:548\n314#1:549,3\n377#1:552,2\n392#1:554,2\n527#1:556\n527#1:557,3\n530#1:560\n530#1:561,3\n*E\n"})
public final class EcgItemDetailActivity extends Hilt_EcgItemDetailActivity<EcgViewModel, pm0> implements eah, yaa {
    public static final int REQ_SYMPTOM_CODE = 100;

    @NotNull
    public static final String TAG = "EcgItemDetail";
    private int analyzedStatus;
    private int avgHrm;

    @Nullable
    private Long dataTimeSeconds;

    @Nullable
    private EcgCombineView ecgCombineView;

    @Nullable
    private EcgMedicalItemReport ecgMeasureReport;

    @Nullable
    private ImageView ivMore;

    @Nullable
    private View layoutSymptom;
    private int selectFrequency;

    @Nullable
    private TitleBarAlphaView titleBarAlphaView;

    @NotNull
    private List<Integer> selectSymptomList = new ArrayList();

    @NotNull
    private List<Integer> selectScenesList = new ArrayList();

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.EcgItemDetailActivity$dealShare$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.EcgItemDetailActivity$dealShare$1", f = "EcgItemDetailActivity.kt", i = {}, l = {460, 471}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24511 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.EcgItemDetailActivity$dealShare$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.EcgItemDetailActivity$dealShare$1$1", f = "EcgItemDetailActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $filePath;
            final /* synthetic */ float[] $floatArray;
            final /* synthetic */ UserProfile $userProfile;
            int label;
            final /* synthetic */ EcgItemDetailActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05891(String str, float[] fArr, UserProfile userProfile, EcgItemDetailActivity ecgItemDetailActivity, Continuation<? super C05891> continuation) {
                super(2, continuation);
                this.$filePath = str;
                this.$floatArray = fArr;
                this.$userProfile = userProfile;
                this.this$0 = ecgItemDetailActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05891(this.$filePath, this.$floatArray, this.$userProfile, this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                String str = this.$filePath;
                float[] fArr = this.$floatArray;
                List list = fArr != null ? ArraysKt___ArraysKt.toList(fArr) : null;
                UserProfile userProfile = this.$userProfile;
                Integer numBoxInt = Boxing.boxInt(this.this$0.avgHrm);
                Long l = this.this$0.dataTimeSeconds;
                final EcgItemDetailActivity ecgItemDetailActivity = this.this$0;
                bqh.d(str, list, userProfile, numBoxInt, l, new bqh.a() { // from class: com.xiaomi.fitness.health.ecg.EcgItemDetailActivity.dealShare.1.1.1
                    @Override // bqh.a
                    public void GenerateError(sgq userInfo) {
                        ecgItemDetailActivity.dismissDialog();
                        ToastUtil.showShortToast("生成pdf失败!!");
                    }

                    @Override // bqh.a
                    public void GenerateSuccess(String pdfPath) {
                        ecgItemDetailActivity.dismissDialog();
                        Logger.i(EcgItemDetailActivity.TAG, "onGenerateSuccess " + pdfPath);
                        ecgItemDetailActivity.sharePdf(pdfPath, "pdf分享");
                    }
                });
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C24511(Continuation<? super C24511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcgItemDetailActivity.this.new C24511(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            EcgMedicalItemReport ecgMedicalItemReport = EcgItemDetailActivity.this.ecgMeasureReport;
            Intrinsics.checkNotNull(ecgMedicalItemReport);
            EcgMedicalItemReport ecgMedicalItemReport2 = EcgItemDetailActivity.this.ecgMeasureReport;
            Intrinsics.checkNotNull(ecgMedicalItemReport2);
            int measureDuration = ecgMedicalItemReport2.getMeasureDuration();
            this.label = 1;
            obj = ecgMedicalItemReport.getRecordData(measureDuration, 1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            float[] fArr = (float[]) obj;
            UserProfile userProfile = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserProfile(true);
            String str = EcgItemDetailActivity.this.getString(c0j.f4794a) + "ECGReport" + TimeUtils.formatDate("yyyyMMddHHmm", Boxing.boxLong(System.currentTimeMillis())) + ".pdf";
            File externalFilesDir = EcgItemDetailActivity.this.getExternalFilesDir("EcgPdf");
            if ((externalFilesDir != null ? Boxing.boxBoolean(externalFilesDir.exists()) : null) == null || !externalFilesDir.exists()) {
                Intrinsics.checkNotNull(externalFilesDir);
                externalFilesDir.mkdirs();
            }
            String str2 = externalFilesDir.getAbsolutePath() + File.separator + str;
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C05891 c05891 = new C05891(str2, fArr, userProfile, EcgItemDetailActivity.this, null);
            this.label = 2;
            if (BuildersKt.withContext(main, c05891, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ EcgViewModel access$getMViewModel(EcgItemDetailActivity ecgItemDetailActivity) {
        return (EcgViewModel) ecgItemDetailActivity.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkAnalyzingTime() {
        EcgAnalyzePreference ecgAnalyzePreference = EcgAnalyzePreference.INSTANCE;
        Long l = this.dataTimeSeconds;
        Intrinsics.checkNotNull(l);
        Long analyzingTimeSec = ecgAnalyzePreference.getAnalyzingTimeSec(l.longValue());
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        Logger.i(TAG, "checkAnalyzingTime " + analyzingTimeSec + "; " + jCurrentTimeMillis);
        if (analyzingTimeSec == null || jCurrentTimeMillis - analyzingTimeSec.longValue() <= TimeUnit.MINUTES.toSeconds(1L)) {
            return;
        }
        Logger.i(TAG, "update analyze status to finish");
        EcgMedicalItemReport ecgMedicalItemReport = this.ecgMeasureReport;
        Intrinsics.checkNotNull(ecgMedicalItemReport);
        ecgMedicalItemReport.setInterpretStatus(3);
        EcgMedicalItemReport ecgMedicalItemReport2 = this.ecgMeasureReport;
        Intrinsics.checkNotNull(ecgMedicalItemReport2);
        this.analyzedStatus = ecgMedicalItemReport2.getInterpretStatus();
        EcgViewModel ecgViewModel = (EcgViewModel) getMViewModel();
        EcgMedicalItemReport ecgMedicalItemReport3 = this.ecgMeasureReport;
        Intrinsics.checkNotNull(ecgMedicalItemReport3);
        ecgViewModel.updateEcgReport(ecgMedicalItemReport3);
        Long l2 = this.dataTimeSeconds;
        Intrinsics.checkNotNull(l2);
        ecgAnalyzePreference.removeAnalyzingReport(l2.longValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkEcgDataPrivacy() {
        NetUtil netUtil = NetUtil.INSTANCE;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        if (netUtil.getNetWorkAvailable(application)) {
            ((EcgViewModel) getMViewModel()).queryShowPrivacyStatusLiveData().observe(this, new EcgItemDetailActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: jb7
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EcgItemDetailActivity.checkEcgDataPrivacy$lambda$3(this.f22612a, (Boolean) obj);
                }
            }));
        } else {
            ToastExtKt.toastShort(this, c0j.common_network_error_retry_later);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkEcgDataPrivacy$lambda$3(EcgItemDetailActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool == null) {
            ToastExtKt.toastShort(this$0, c0j.common_network_error_retry_later);
        } else if (bool.booleanValue()) {
            this$0.jumpDataPrivacyAuthPage();
        } else {
            EcgWebViewActivityKt.startEcgWebActivity$default(EcgConstantsKt.getHlwUrl("submit_report"), this$0.ecgMeasureReport, EcgWebViewActivity.ECG_ITEM_PAGE_ORIGIN, null, 8, null);
        }
        return Unit.INSTANCE;
    }

    private final void dealDeleteAction() {
        CommonDialog commonDialogCreate = new CommonDialog.c("delete_check").setDialogTitle(c0j.Ga).setDialogDescription(c0j.ma).setNegativeText(c0j.D7).setPositiveText(c0j.H7).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.ecg.EcgItemDetailActivity.dealDeleteAction.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    EcgMedicalItemReport ecgMedicalItemReport = EcgItemDetailActivity.this.ecgMeasureReport;
                    if (ecgMedicalItemReport != null) {
                        EcgItemDetailActivity.access$getMViewModel(EcgItemDetailActivity.this).deleteEcgReport(ecgMedicalItemReport);
                    }
                    EcgItemDetailActivity.this.lambda$onCreate$0();
                }
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    private final void dealShare() {
        String string = getString(c0j.s);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        PageState.DefaultImpls.showLoading$default(this, string, 0, false, 6, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new C24511(null), 2, null);
    }

    private final String getScenesStr() {
        StringBuilder sb = new StringBuilder();
        String[] stringArray = ResourceExtKt.getStringArray(this, ohi.h);
        Iterator<T> it = this.selectScenesList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue() - 1;
            if (iIntValue >= 0 && iIntValue < stringArray.length) {
                if (!StringsKt__StringsKt.isBlank(sb)) {
                    sb.append(" | ");
                }
                sb.append(stringArray[iIntValue]);
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final String getSymptomStr() {
        StringBuilder sb = new StringBuilder();
        String[] stringArray = ResourceExtKt.getStringArray(this, ohi.i);
        Iterator<T> it = this.selectSymptomList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue() - 1;
            if (iIntValue >= 0 && iIntValue < stringArray.length) {
                if (!StringsKt__StringsKt.isBlank(sb)) {
                    sb.append(" | ");
                }
                sb.append(stringArray[iIntValue]);
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initExpertAnalyzeCard() {
        ((pm0) getMBinding()).O.setOnClickListener(new View.OnClickListener() { // from class: ib7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcgItemDetailActivity.initExpertAnalyzeCard$lambda$2(this.f20964a, view);
            }
        });
        refreshAnalyzeView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initExpertAnalyzeCard$lambda$2(final EcgItemDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = this$0.analyzedStatus;
        if (i == 0) {
            MainExtKt.getInstance(MainHelper.INSTANCE).showSportHealthCloudSynDialogIfNeed(this$0, new IWebSync() { // from class: com.xiaomi.fitness.health.ecg.EcgItemDetailActivity$initExpertAnalyzeCard$1$1
                @Override // com.xiaomi.fitness.mine.export.IWebSync
                public void onPrivacyNotAgree() {
                    IWebSync.DefaultImpls.onPrivacyNotAgree(this);
                }

                @Override // com.xiaomi.fitness.mine.export.IWebSync
                public void onWebSyncAccepted() {
                    EcgWebViewActivityKt.startEcgWebActivity$default(EcgConstantsKt.getHlwUrl("submit_report"), this.this$0.ecgMeasureReport, EcgWebViewActivity.ECG_ITEM_PAGE_ORIGIN, null, 8, null);
                    EcgTrackHelper.INSTANCE.trackSubmitReportClick("ecg_content_page");
                }

                @Override // com.xiaomi.fitness.mine.export.IWebSync
                public void onWebSyncDenied() {
                    Application application = this.this$0.getApplication();
                    Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
                    ToastExtKt.toastShort(application, c0j.ko);
                }
            });
        } else {
            if (i != 3) {
                return;
            }
            EcgWebViewActivityKt.startEcgWebActivity$default(EcgConstantsKt.getHlwUrl("ecg_report_detail"), this$0.ecgMeasureReport, null, null, 12, null);
            EcgTrackHelper.INSTANCE.trackViewReportDetailClick("ecg_view_report_detail");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initHrmCard() {
        int i = this.avgHrm;
        ((pm0) getMBinding()).R.setText(getResources().getQuantityString(qxi.c0, this.avgHrm, i > 0 ? String.valueOf(i) : "--"));
        ((pm0) getMBinding()).S.setText(EcgExtKt.getAnalyzeStatusStr(this.analyzedStatus));
        ((pm0) getMBinding()).G.setOnClickListener(new View.OnClickListener() { // from class: nb7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcgItemDetailActivity.initHrmCard$lambda$1(this.f27746a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initHrmCard$lambda$1(EcgItemDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) EcgLandScapeActivity.class);
        EcgMedicalItemReport ecgMedicalItemReport = this$0.ecgMeasureReport;
        Intrinsics.checkNotNull(ecgMedicalItemReport);
        intent.putExtra(EcgConstantsKt.PARAM_REPORT, ecgMedicalItemReport);
        this$0.startActivity(intent);
    }

    private final void initIntentData(Intent intent) {
        List<Integer> arrayList;
        List<Integer> arrayList2;
        Integer occurFrequency;
        Integer avgHr;
        EcgMedicalItemReport ecgMedicalItemReport = (EcgMedicalItemReport) (intent != null ? intent.getSerializableExtra(EcgConstantsKt.PARAM_REPORT) : null);
        this.ecgMeasureReport = ecgMedicalItemReport;
        if (ecgMedicalItemReport == null) {
            ToastExtKt.toastLong(this, "invalid ecg param result");
            finish();
            return;
        }
        this.dataTimeSeconds = Long.valueOf(ecgMedicalItemReport != null ? ecgMedicalItemReport.getMeasureTime() : System.currentTimeMillis() / ((long) 1000));
        EcgMedicalItemReport ecgMedicalItemReport2 = this.ecgMeasureReport;
        this.avgHrm = (ecgMedicalItemReport2 == null || (avgHr = ecgMedicalItemReport2.getAvgHr()) == null) ? 0 : avgHr.intValue();
        EcgMedicalItemReport ecgMedicalItemReport3 = this.ecgMeasureReport;
        if (ecgMedicalItemReport3 == null || (arrayList = ecgMedicalItemReport3.getSymptomList()) == null) {
            arrayList = new ArrayList<>();
        }
        this.selectSymptomList = arrayList;
        EcgMedicalItemReport ecgMedicalItemReport4 = this.ecgMeasureReport;
        if (ecgMedicalItemReport4 == null || (arrayList2 = ecgMedicalItemReport4.getSceneList()) == null) {
            arrayList2 = new ArrayList<>();
        }
        this.selectScenesList = arrayList2;
        EcgMedicalItemReport ecgMedicalItemReport5 = this.ecgMeasureReport;
        this.selectFrequency = (ecgMedicalItemReport5 == null || (occurFrequency = ecgMedicalItemReport5.getOccurFrequency()) == null) ? 0 : occurFrequency.intValue();
        EcgMedicalItemReport ecgMedicalItemReport6 = this.ecgMeasureReport;
        this.analyzedStatus = ecgMedicalItemReport6 != null ? ecgMedicalItemReport6.getInterpretStatus() : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initSymptomCard() {
        final Function1 function1 = new Function1() { // from class: fb7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcgItemDetailActivity.initSymptomCard$lambda$4(this.f17625a, (View) obj);
            }
        };
        ((pm0) getMBinding()).Z.setOnClickListener(new View.OnClickListener() { // from class: gb7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcgItemDetailActivity.initSymptomCard$lambda$5(function1, view);
            }
        });
        ((pm0) getMBinding()).H.setOnClickListener(new View.OnClickListener() { // from class: hb7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcgItemDetailActivity.initSymptomCard$lambda$6(function1, view);
            }
        });
        refreshSymptomCard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSymptomCard$lambda$4(EcgItemDetailActivity this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.showEcgSymptomDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSymptomCard$lambda$5(Function1 tmp0, View view) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSymptomCard$lambda$6(Function1 tmp0, View view) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(view);
    }

    private final void initTitle() {
        String string = getString(c0j.h);
        Long l = this.dataTimeSeconds;
        Intrinsics.checkNotNull(l);
        String date = TimeUtils.formatDate(string, Long.valueOf(l.longValue() * ((long) 1000)));
        TitleBarAlphaView titleBarAlphaView = this.titleBarAlphaView;
        Intrinsics.checkNotNull(titleBarAlphaView);
        titleBarAlphaView.bindData(getString(c0j.ra), date);
        TitleBarAlphaView titleBarAlphaView2 = this.titleBarAlphaView;
        Intrinsics.checkNotNull(titleBarAlphaView2);
        titleBarAlphaView2.setTitleClickable(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        setActionBarDisplayable(false);
        TitleBarAlphaView titleBarAlphaView = ((pm0) getMBinding()).N;
        this.titleBarAlphaView = titleBarAlphaView;
        Intrinsics.checkNotNull(titleBarAlphaView);
        this.ivMore = titleBarAlphaView.getImgShare();
        this.ecgCombineView = ((pm0) getMBinding()).C;
        this.layoutSymptom = ((pm0) getMBinding()).L;
        TitleBarAlphaView titleBarAlphaView2 = this.titleBarAlphaView;
        Intrinsics.checkNotNull(titleBarAlphaView2);
        titleBarAlphaView2.setOnTitleBarClickListener(this);
        initTitle();
        initHrmCard();
        initSymptomCard();
        initExpertAnalyzeCard();
        HealthBannerCardSetView healthBannerCardSet = ((pm0) getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(healthBannerCardSet, "healthBannerCardSet");
        PingAnHealthExtKt.bindOneBanner(healthBannerCardSet, 0);
    }

    private final boolean isEmptySymptom() {
        return this.selectSymptomList.isEmpty() && this.selectScenesList.isEmpty() && this.selectFrequency <= 0;
    }

    private final void jumpDataPrivacyAuthPage() {
        Bundle bundle = new Bundle();
        bundle.putSerializable(EcgConstantsKt.PARAM_REPORT, this.ecgMeasureReport);
        dih.a().e(this, new FragmentParams.b().e(EcgAnalyzeServiceAuthFragment.class).c(bundle).b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onImgShareClick$lambda$12(EcgItemDetailActivity this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == eri.Gb) {
            this$0.dealShare();
            return true;
        }
        if (itemId != eri.Eb) {
            return true;
        }
        this$0.dealDeleteAction();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshAnalyzeView() {
        int i = this.analyzedStatus;
        if (i == 0) {
            ((pm0) getMBinding()).O.setText(getString(c0j.N7));
            ((pm0) getMBinding()).O.setEnabled(true);
            return;
        }
        if (i == 1) {
            ((pm0) getMBinding()).O.setText(getString(c0j.Ia));
            ((pm0) getMBinding()).O.setEnabled(false);
        } else if (i == 2) {
            ((pm0) getMBinding()).O.setText(getString(c0j.Ha));
            ((pm0) getMBinding()).O.setEnabled(false);
        } else {
            if (i != 3) {
                return;
            }
            ((pm0) getMBinding()).O.setText(getString(c0j.ua));
            ((pm0) getMBinding()).O.setEnabled(true);
        }
    }

    private final void refreshSymptomCard() {
        View view = this.layoutSymptom;
        Intrinsics.checkNotNull(view);
        view.setOnClickListener(new View.OnClickListener() { // from class: mb7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EcgItemDetailActivity.refreshSymptomCard$lambda$7(this.f25966a, view2);
            }
        });
        if (isEmptySymptom()) {
            showEmptyGuideSymptom();
        } else {
            showNormalSymptom();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshSymptomCard$lambda$7(EcgItemDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isEmptySymptom()) {
            this$0.showEcgSymptomDialog();
        }
    }

    private final void refreshView() {
        if (this.ecgMeasureReport == null) {
            return;
        }
        initView();
        EcgCombineView ecgCombineView = this.ecgCombineView;
        if (ecgCombineView != null) {
            ecgCombineView.post(new Runnable() { // from class: kb7
                @Override // java.lang.Runnable
                public final void run() {
                    EcgItemDetailActivity.refreshView$lambda$0(this.f23678a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshView$lambda$0(EcgItemDetailActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EcgCombineView ecgCombineView = this$0.ecgCombineView;
        if (ecgCombineView != null) {
            EcgMedicalItemReport ecgMedicalItemReport = this$0.ecgMeasureReport;
            Intrinsics.checkNotNull(ecgMedicalItemReport);
            EcgMedicalItemReport ecgMedicalItemReport2 = this$0.ecgMeasureReport;
            Intrinsics.checkNotNull(ecgMedicalItemReport2);
            ecgCombineView.bindReport(ecgMedicalItemReport, ecgMedicalItemReport2.getMeasureDuration(), 5, LifecycleOwnerKt.getLifecycleScope(this$0));
        }
    }

    private final void showEcgSymptomDialog() {
        EcgSymptomChoiceDialog ecgSymptomChoiceDialogCreate = new EcgSymptomChoiceDialog.Builder().create();
        ecgSymptomChoiceDialogCreate.setRequestCode(100);
        if (!isEmptySymptom()) {
            List<Integer> list = this.selectSymptomList;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((Number) it.next()).intValue() - 1));
            }
            ecgSymptomChoiceDialogCreate.setSymptomList(arrayList);
            List<Integer> list2 = this.selectScenesList;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((Number) it2.next()).intValue() - 1));
            }
            ecgSymptomChoiceDialogCreate.setSituationList(arrayList2);
            int i = this.selectFrequency;
            if (i > 0) {
                ecgSymptomChoiceDialogCreate.setTimePosition(i - 1);
            }
        }
        ecgSymptomChoiceDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showEmptyGuideSymptom() {
        TextView tvSymptomCardSubtitle = ((pm0) getMBinding()).a0;
        Intrinsics.checkNotNullExpressionValue(tvSymptomCardSubtitle, "tvSymptomCardSubtitle");
        ViewExtKt.setVisible(tvSymptomCardSubtitle, true);
        TextView tvSymptomCardEdit = ((pm0) getMBinding()).Z;
        Intrinsics.checkNotNullExpressionValue(tvSymptomCardEdit, "tvSymptomCardEdit");
        ViewExtKt.setVisible(tvSymptomCardEdit, false);
        View dividerLine = ((pm0) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(dividerLine, "dividerLine");
        ViewExtKt.setVisible(dividerLine, false);
        TextView tvScenesLabel = ((pm0) getMBinding()).W;
        Intrinsics.checkNotNullExpressionValue(tvScenesLabel, "tvScenesLabel");
        ViewExtKt.setVisible(tvScenesLabel, false);
        TextView tvScenesValue = ((pm0) getMBinding()).X;
        Intrinsics.checkNotNullExpressionValue(tvScenesValue, "tvScenesValue");
        ViewExtKt.setVisible(tvScenesValue, false);
        TextView tvSymptomLabel = ((pm0) getMBinding()).c0;
        Intrinsics.checkNotNullExpressionValue(tvSymptomLabel, "tvSymptomLabel");
        ViewExtKt.setVisible(tvSymptomLabel, false);
        TextView tvSymptomValue = ((pm0) getMBinding()).d0;
        Intrinsics.checkNotNullExpressionValue(tvSymptomValue, "tvSymptomValue");
        ViewExtKt.setVisible(tvSymptomValue, false);
        TextView tvFrequencyLabel = ((pm0) getMBinding()).U;
        Intrinsics.checkNotNullExpressionValue(tvFrequencyLabel, "tvFrequencyLabel");
        ViewExtKt.setVisible(tvFrequencyLabel, false);
        TextView tvFrequencyValue = ((pm0) getMBinding()).V;
        Intrinsics.checkNotNullExpressionValue(tvFrequencyValue, "tvFrequencyValue");
        ViewExtKt.setVisible(tvFrequencyValue, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showNormalSymptom() {
        TextView tvSymptomCardSubtitle = ((pm0) getMBinding()).a0;
        Intrinsics.checkNotNullExpressionValue(tvSymptomCardSubtitle, "tvSymptomCardSubtitle");
        ViewExtKt.setVisible(tvSymptomCardSubtitle, false);
        TextView tvSymptomCardEdit = ((pm0) getMBinding()).Z;
        Intrinsics.checkNotNullExpressionValue(tvSymptomCardEdit, "tvSymptomCardEdit");
        ViewExtKt.setVisible(tvSymptomCardEdit, true);
        View dividerLine = ((pm0) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(dividerLine, "dividerLine");
        ViewExtKt.setVisible(dividerLine, true);
        if (!this.selectSymptomList.isEmpty()) {
            TextView tvSymptomLabel = ((pm0) getMBinding()).c0;
            Intrinsics.checkNotNullExpressionValue(tvSymptomLabel, "tvSymptomLabel");
            ViewExtKt.setVisible(tvSymptomLabel, true);
            TextView tvSymptomValue = ((pm0) getMBinding()).d0;
            Intrinsics.checkNotNullExpressionValue(tvSymptomValue, "tvSymptomValue");
            ViewExtKt.setVisible(tvSymptomValue, true);
            ((pm0) getMBinding()).d0.setText(getSymptomStr());
        } else {
            TextView tvSymptomLabel2 = ((pm0) getMBinding()).c0;
            Intrinsics.checkNotNullExpressionValue(tvSymptomLabel2, "tvSymptomLabel");
            ViewExtKt.setVisible(tvSymptomLabel2, false);
            TextView tvSymptomValue2 = ((pm0) getMBinding()).d0;
            Intrinsics.checkNotNullExpressionValue(tvSymptomValue2, "tvSymptomValue");
            ViewExtKt.setVisible(tvSymptomValue2, false);
        }
        if (!this.selectScenesList.isEmpty()) {
            TextView tvScenesLabel = ((pm0) getMBinding()).W;
            Intrinsics.checkNotNullExpressionValue(tvScenesLabel, "tvScenesLabel");
            ViewExtKt.setVisible(tvScenesLabel, true);
            TextView tvScenesValue = ((pm0) getMBinding()).X;
            Intrinsics.checkNotNullExpressionValue(tvScenesValue, "tvScenesValue");
            ViewExtKt.setVisible(tvScenesValue, true);
            ((pm0) getMBinding()).X.setText(getScenesStr());
        } else {
            TextView tvScenesLabel2 = ((pm0) getMBinding()).W;
            Intrinsics.checkNotNullExpressionValue(tvScenesLabel2, "tvScenesLabel");
            ViewExtKt.setVisible(tvScenesLabel2, false);
            TextView tvScenesValue2 = ((pm0) getMBinding()).X;
            Intrinsics.checkNotNullExpressionValue(tvScenesValue2, "tvScenesValue");
            ViewExtKt.setVisible(tvScenesValue2, false);
        }
        if (this.selectFrequency <= 0) {
            TextView tvFrequencyLabel = ((pm0) getMBinding()).U;
            Intrinsics.checkNotNullExpressionValue(tvFrequencyLabel, "tvFrequencyLabel");
            ViewExtKt.setVisible(tvFrequencyLabel, false);
            TextView tvFrequencyValue = ((pm0) getMBinding()).V;
            Intrinsics.checkNotNullExpressionValue(tvFrequencyValue, "tvFrequencyValue");
            ViewExtKt.setVisible(tvFrequencyValue, false);
            return;
        }
        TextView tvFrequencyLabel2 = ((pm0) getMBinding()).U;
        Intrinsics.checkNotNullExpressionValue(tvFrequencyLabel2, "tvFrequencyLabel");
        ViewExtKt.setVisible(tvFrequencyLabel2, true);
        TextView tvFrequencyValue2 = ((pm0) getMBinding()).V;
        Intrinsics.checkNotNullExpressionValue(tvFrequencyValue2, "tvFrequencyValue");
        ViewExtKt.setVisible(tvFrequencyValue2, true);
        String[] stringArray = ResourceExtKt.getStringArray(this, ohi.j);
        int i = this.selectFrequency - 1;
        ((pm0) getMBinding()).V.setText((i < 0 || i >= stringArray.length) ? "" : stringArray[i]);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.d;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return cv1.f14763a;
    }

    @Override // com.xiaomi.fitness.health.ecg.Hilt_EcgItemDetailActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initIntentData(getIntent());
        refreshView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (requestCode == 100 && resultCode == -1) {
            ArrayList<Integer> integerArrayList = data.getIntegerArrayList(EcgSymptomChoiceDialog.KEY_SELECTED_LABEL);
            if (integerArrayList == null) {
                integerArrayList = new ArrayList<>();
            }
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(integerArrayList, 10));
            Iterator<T> it = integerArrayList.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((Integer) it.next()).intValue() + 1));
            }
            this.selectSymptomList = CollectionsKt___CollectionsKt.sorted(arrayList);
            ArrayList<Integer> integerArrayList2 = data.getIntegerArrayList(EcgSymptomChoiceDialog.KEY_SELECTED_LABEL_SITUATION);
            if (integerArrayList2 == null) {
                integerArrayList2 = new ArrayList<>();
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(integerArrayList2, 10));
            Iterator<T> it2 = integerArrayList2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((Integer) it2.next()).intValue() + 1));
            }
            this.selectScenesList = CollectionsKt___CollectionsKt.sorted(arrayList2);
            int i = data.getInt(EcgSymptomChoiceDialog.KEY_SELECTED_LABEL_TIME) + 1;
            this.selectFrequency = i;
            EcgMedicalItemReport ecgMedicalItemReport = this.ecgMeasureReport;
            if (ecgMedicalItemReport != null) {
                ecgMedicalItemReport.setOccurFrequency(Integer.valueOf(i));
            }
            EcgMedicalItemReport ecgMedicalItemReport2 = this.ecgMeasureReport;
            if (ecgMedicalItemReport2 != null) {
                ecgMedicalItemReport2.setSymptomList(this.selectSymptomList);
            }
            EcgMedicalItemReport ecgMedicalItemReport3 = this.ecgMeasureReport;
            if (ecgMedicalItemReport3 != null) {
                ecgMedicalItemReport3.setSceneList(this.selectScenesList);
            }
            EcgMedicalItemReport ecgMedicalItemReport4 = this.ecgMeasureReport;
            if (ecgMedicalItemReport4 != null) {
                ((EcgViewModel) getMViewModel()).updateEcgReport(ecgMedicalItemReport4);
            }
            setResult(2);
            refreshSymptomCard();
        }
    }

    @Override // defpackage.eah
    public void onImgBackClick(@Nullable View view) {
        lambda$onCreate$0();
    }

    @Override // defpackage.eah
    public void onImgShareClick(@Nullable View view) {
        Intrinsics.checkNotNull(view);
        a4i a4iVar = new a4i(this, view);
        a4iVar.f(nwi.d);
        a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: lb7
            @Override // a4i.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return EcgItemDetailActivity.onImgShareClick$lambda$12(this.f24854a, menuItem);
            }
        });
        a4iVar.g();
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        initIntentData(intent);
        refreshView();
    }

    @Override // defpackage.eah
    public void onShowCalendar() {
    }

    public final void sharePdf(@Nullable String filePath, @Nullable String title) {
        if (TextUtils.isEmpty(filePath)) {
            Logger.e(TAG, "share file failed, path = %s", filePath, new Object[0]);
            return;
        }
        File file = new File(filePath);
        if (!file.exists()) {
            Logger.e(TAG, "share file failed, file does not exist, %s", filePath, new Object[0]);
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        Uri uriA = hym.a(this, intent, Uri.fromFile(file));
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.STREAM", uriA);
        intent.setFlags(268435456);
        ComponentName[] excludeComponentNameArray = ShareIntentExtKt.getExcludeComponentNameArray(intent);
        Intent intentCreateChooser = Intent.createChooser(intent, title);
        if (Build.VERSION.SDK_INT >= 33) {
            intentCreateChooser.putExtra("android.intent.extra.EXCLUDE_COMPONENTS", excludeComponentNameArray);
        }
        startActivity(intentCreateChooser);
    }
}
