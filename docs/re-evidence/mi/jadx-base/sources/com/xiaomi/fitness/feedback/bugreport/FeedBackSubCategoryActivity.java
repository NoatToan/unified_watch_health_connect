package com.xiaomi.fitness.feedback.bugreport;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.databinding.ObservableArrayList;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.feedback.bugreport.FeedBackSubCategoryActivity;
import com.xiaomi.fitness.feedback.eco.EcoExtKt;
import com.xiaomi.fitness.feedback.extentions.FeedbackWebUrlsKt;
import com.xiaomi.fitness.feedback.util.FeedbackConstants;
import com.xiaomi.fitness.webview.WebViewActivity;
import com.xiaomi.fitness.webview.healthwebview.HealthWebViewActivity;
import defpackage.bk9;
import defpackage.bv1;
import defpackage.gji;
import defpackage.hui;
import defpackage.xpd;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b%\u0010&J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/feedback/bugreport/FeedBackSubCategoryActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/feedback/bugreport/FeedbackTypesViewModel;", "Lbk9;", "Lcom/xiaomi/fitness/feedback/bugreport/OnItemClickListener;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/feedback/bugreport/FeedbackDeviceInfo;", "feedbackDeviceInfo", "handleFeedback", "(Lcom/xiaomi/fitness/feedback/bugreport/FeedbackDeviceInfo;)V", "Landroid/view/View;", "view", "", "position", "onItemClick", "(Landroid/view/View;I)V", "Landroidx/databinding/ObservableArrayList;", "mDataList", "Landroidx/databinding/ObservableArrayList;", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "", "mShowMore", "Z", "", "TAG", "Ljava/lang/String;", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "()V", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFeedBackSubCategoryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedBackSubCategoryActivity.kt\ncom/xiaomi/fitness/feedback/bugreport/FeedBackSubCategoryActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,135:1\n1863#2,2:136\n*S KotlinDebug\n*F\n+ 1 FeedBackSubCategoryActivity.kt\ncom/xiaomi/fitness/feedback/bugreport/FeedBackSubCategoryActivity\n*L\n50#1:136,2\n*E\n"})
public final class FeedBackSubCategoryActivity extends BaseBindingActivity<FeedbackTypesViewModel, bk9> implements OnItemClickListener {
    private Context mContext;

    @NotNull
    private ObservableArrayList<FeedbackDeviceInfo> mDataList = new ObservableArrayList<>();
    private boolean mShowMore = true;

    @NotNull
    private final String TAG = "FeedBackSubCategoryActivity";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleFeedback$lambda$1(FeedbackDeviceInfo feedbackDeviceInfo, FeedBackSubCategoryActivity this$0, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(feedbackDeviceInfo, "$feedbackDeviceInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 100) {
            Intrinsics.checkNotNull(intent);
            boolean booleanExtra = intent.getBooleanExtra("result", false);
            Intent intent2 = new Intent();
            intent2.putExtra("result", booleanExtra);
            if (!booleanExtra) {
                intent2.putExtra("showContent", feedbackDeviceInfo.getAppName());
                intent2.putExtra("wideTagContent", feedbackDeviceInfo.getWideTagContent());
                intent2.putExtra(FeedbackConstants.KEY_MAIN_TAG_ID, feedbackDeviceInfo.getWideTagId());
                intent2.putExtra(FeedbackConstants.KEY_SUB_TAG_ID, feedbackDeviceInfo.getTagId());
                Logger.i(this$0.TAG, "handleFeedback ShowContent: " + feedbackDeviceInfo.getAppName() + " >> " + feedbackDeviceInfo.getWideTagContent());
            }
            this$0.setResult(100, intent2);
            this$0.finish();
        }
        Logger.i("FeedbackActivity", "connectDevice: " + i + " >> " + intent);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return hui.v;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return bv1.e;
    }

    public final void handleFeedback(@NotNull final FeedbackDeviceInfo feedbackDeviceInfo) {
        String feedbackFAQUrl;
        Intrinsics.checkNotNullParameter(feedbackDeviceInfo, "feedbackDeviceInfo");
        Logger.d(this.TAG, " url = " + feedbackDeviceInfo.getTagId());
        if (!this.mShowMore || !feedbackDeviceInfo.getHasFaq()) {
            Intent intent = new Intent();
            intent.putExtra("showContent", feedbackDeviceInfo.getAppName());
            intent.putExtra("wideTagContent", feedbackDeviceInfo.getWideTagContent());
            intent.putExtra(FeedbackConstants.KEY_MAIN_TAG_ID, feedbackDeviceInfo.getWideTagId());
            intent.putExtra(FeedbackConstants.KEY_SUB_TAG_ID, feedbackDeviceInfo.getTagId());
            setResult(100, intent);
            finish();
            return;
        }
        int type = feedbackDeviceInfo.getType();
        StringBuilder sb = new StringBuilder();
        sb.append("handleFeedback: ");
        sb.append(type);
        if (EcoExtKt.isUseEcoUrl(feedbackDeviceInfo.getType(), feedbackDeviceInfo.isEcoIot())) {
            DeviceData deviceData = feedbackDeviceInfo.getDeviceData();
            feedbackFAQUrl = EcoExtKt.getEcoFAQUrl(deviceData != null ? deviceData.getModel() : null, feedbackDeviceInfo.getWideTagId(), feedbackDeviceInfo.getTagId());
        } else {
            DeviceData deviceData2 = feedbackDeviceInfo.getDeviceData();
            feedbackFAQUrl = FeedbackWebUrlsKt.getFeedbackFAQUrl(deviceData2 != null ? deviceData2.getModel() : null, feedbackDeviceInfo.getWideTagId(), feedbackDeviceInfo.getTagId());
        }
        Logger.d(this.TAG, " url = " + feedbackFAQUrl);
        Intent intent2 = new Intent(this, (Class<?>) HealthWebViewActivity.class);
        intent2.putExtra("data4", feedbackDeviceInfo.getAppName());
        intent2.putExtra(WebViewActivity.SHOW_TITLE_BAR, true);
        intent2.putExtra("URL", feedbackFAQUrl);
        startForActivityResult(intent2, new Function2() { // from class: th9
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FeedBackSubCategoryActivity.handleFeedback$lambda$1(feedbackDeviceInfo, this, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mContext = getBaseContext();
        String stringExtra = getIntent().getStringExtra(FeedbackConstants.KEY_TAG_ID_FROM_WEB);
        String stringExtra2 = getIntent().getStringExtra(FeedbackConstants.KEY_SUB_TAG_ID_FROM_WEB);
        this.mShowMore = getIntent().getBooleanExtra(FeedbackConstants.KEY_SHOW_RIGHT, true);
        setTitle(stringExtra);
        setTitleBackground(gji.f19056a);
        List listG = xpd.g(stringExtra2, FeedbackDeviceInfo.class);
        if (listG != null) {
            Iterator it = listG.iterator();
            while (it.hasNext()) {
                this.mDataList.add((FeedbackDeviceInfo) it.next());
            }
        }
        int size = this.mDataList.size();
        for (int i = 0; i < size; i++) {
            Logger.d(this.TAG, "FeedBackSubCategory LIST IS " + this.mDataList.get(i));
        }
        ((FeedbackTypesViewModel) getMViewModel()).setDataList(this.mDataList);
        ((FeedbackTypesViewModel) getMViewModel()).setShowMore(this.mShowMore);
        ((FeedbackTypesViewModel) getMViewModel()).getAdapter().setOnItemClickListener(new Function3<FeedbackDeviceInfo, Integer, View, Unit>() { // from class: com.xiaomi.fitness.feedback.bugreport.FeedBackSubCategoryActivity.onCreate.2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(FeedbackDeviceInfo feedbackDeviceInfo, Integer num, View view) {
                invoke(feedbackDeviceInfo, num.intValue(), view);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public void invoke(FeedbackDeviceInfo p1, int position, View itemView) {
                FeedbackDeviceInfo feedbackDeviceInfo;
                Intrinsics.checkNotNullParameter(p1, "p1");
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                if (position <= FeedBackSubCategoryActivity.this.mDataList.size() - 1 && (feedbackDeviceInfo = (FeedbackDeviceInfo) FeedBackSubCategoryActivity.this.mDataList.get(position)) != null) {
                    String str = FeedBackSubCategoryActivity.this.TAG;
                    DeviceData deviceData = feedbackDeviceInfo.getDeviceData();
                    Logger.d(str, "FeedBackSubCategory is " + feedbackDeviceInfo + " did is " + (deviceData != null ? deviceData.getDid() : null));
                    FeedBackSubCategoryActivity.this.handleFeedback(feedbackDeviceInfo);
                }
            }
        });
    }

    @Override // com.xiaomi.fitness.feedback.bugreport.OnItemClickListener
    public void onItemClick(@Nullable View view, int position) {
    }
}
