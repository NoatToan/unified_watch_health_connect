package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.accountsdk.request.NetworkUtils;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.detail.data.SportFeedbackModel;
import com.xiaomi.fitness.detail.model.SportFeedbackLabelModel;
import com.xiaomi.fitness.detail.recycler.SportLabelItemDecoration;
import com.xiaomi.fitness.detail.view.SportFeedbackView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.feedback.export.data.FeedBackModelData;
import com.xiaomi.wearable.data.sportmodel.detail.recycler.SportFeedbackLabelAdapter;
import com.xiaomi.wearable.data.sportmodel.detail.util.SportFeedbackUtil;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.zce;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001KB'\b\u0007\u0012\u0006\u0010D\u001a\u00020C\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010E\u0012\b\b\u0002\u0010H\u001a\u00020G¢\u0006\u0004\bI\u0010JJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\bJ\u001b\u0010\u0014\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u0004J/\u0010#\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0006¢\u0006\u0004\b%\u0010\bJ\u0015\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u000e¢\u0006\u0004\b%\u0010'R\"\u0010(\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\rR\u0016\u0010-\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R(\u00108\u001a\b\u0012\u0004\u0012\u000207068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006L"}, d2 = {"Lcom/xiaomi/fitness/detail/view/SportFeedbackView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "getFeedbackLabel", "()Ljava/lang/String;", "createLabelContent", "", "displayTitleValue", "()V", "initDataList", "Lcom/xiaomi/fitness/detail/view/FeedbackStatue;", "statueParams", "resetStatue", "(Lcom/xiaomi/fitness/detail/view/FeedbackStatue;)V", "", "getRating", "()F", "initView", "Lkotlin/Function0;", "onCommitClick", "addCommitClick", "(Lkotlin/jvm/functions/Function0;)V", "", "isUploadLogFile", "feedBackContent", "onUpload", "(ZLjava/lang/String;)V", "createFeedbackContent", "indoor", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "basicSport", "Lcom/xiaomi/fitness/detail/data/SportFeedbackModel;", "sportFeedbackModel", "Lcom/xiaomi/fitness/detail/view/SportFeedbackView$OnFeedbackUploadListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "bindData", "(ZLcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Lcom/xiaomi/fitness/detail/data/SportFeedbackModel;Lcom/xiaomi/fitness/detail/view/SportFeedbackView$OnFeedbackUploadListener;)V", "displayFeedbackView", "ratingParam", "(F)V", "statue", "Lcom/xiaomi/fitness/detail/view/FeedbackStatue;", "getStatue", "()Lcom/xiaomi/fitness/detail/view/FeedbackStatue;", "setStatue", "indoorFlag", "Z", "Lcom/xiaomi/wearable/data/sportmodel/detail/recycler/SportFeedbackLabelAdapter;", "mAdapter", "Lcom/xiaomi/wearable/data/sportmodel/detail/recycler/SportFeedbackLabelAdapter;", "mDid", "Ljava/lang/String;", "mBasicReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "", "Lcom/xiaomi/fitness/detail/model/SportFeedbackLabelModel;", "labelList", "Ljava/util/List;", "getLabelList", "()Ljava/util/List;", "setLabelList", "(Ljava/util/List;)V", "onFeedbackUploadListener", "Lcom/xiaomi/fitness/detail/view/SportFeedbackView$OnFeedbackUploadListener;", "Lzce;", "binding", "Lzce;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OnFeedbackUploadListener", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSportFeedbackView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportFeedbackView.kt\ncom/xiaomi/fitness/detail/view/SportFeedbackView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,278:1\n774#2:279\n865#2,2:280\n1863#2,2:282\n1863#2,2:284\n*S KotlinDebug\n*F\n+ 1 SportFeedbackView.kt\ncom/xiaomi/fitness/detail/view/SportFeedbackView\n*L\n135#1:279\n135#1:280,2\n138#1:282,2\n209#1:284,2\n*E\n"})
public final class SportFeedbackView extends ConstraintLayout {

    @NotNull
    private final zce binding;
    private boolean indoorFlag;

    @NotNull
    private List<SportFeedbackLabelModel> labelList;
    private SportFeedbackLabelAdapter mAdapter;
    private SportBasicReport mBasicReport;
    private String mDid;
    private OnFeedbackUploadListener onFeedbackUploadListener;

    @NotNull
    private FeedbackStatue statue;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/detail/view/SportFeedbackView$OnFeedbackUploadListener;", "", "uploadInfo", "", "isUploadFile", "", "feedBackModel", "Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData;", "labelStr", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnFeedbackUploadListener {
        void uploadInfo(boolean isUploadFile, @NotNull FeedBackModelData feedBackModel, @NotNull String labelStr);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportFeedbackView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addCommitClick$lambda$2(Function0 onCommitClick, TextView it) {
        Intrinsics.checkNotNullParameter(onCommitClick, "$onCommitClick");
        Intrinsics.checkNotNullParameter(it, "it");
        onCommitClick.invoke();
        return Unit.INSTANCE;
    }

    private final String createLabelContent() {
        String feedbackLabel = getFeedbackLabel();
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(feedbackLabel)) {
            sb.append(";");
            sb.append(feedbackLabel);
        }
        String string = this.binding.A.getText().toString();
        if (!TextUtils.isEmpty(string)) {
            sb.append(";");
            sb.append(string);
        }
        String string2 = this.binding.B.getText().toString();
        if (!TextUtils.isEmpty(string2)) {
            sb.append(";");
            sb.append(string2);
        }
        String string3 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        return string3;
    }

    private final void displayTitleValue() {
        float rating = this.binding.D.getRating();
        if (rating < 1.0f) {
            this.binding.G.setText(ResourceExtKt.getString(j1j.E4));
        } else if (rating < 2.0f) {
            this.binding.G.setText(ResourceExtKt.getString(j1j.J4));
        } else if (rating < 3.0f) {
            this.binding.G.setText(ResourceExtKt.getString(j1j.I4));
        } else if (rating < 4.0f) {
            this.binding.G.setText(ResourceExtKt.getString(j1j.F4));
        } else if (rating < 5.0f) {
            this.binding.G.setText(ResourceExtKt.getString(j1j.G4));
        } else {
            this.binding.G.setText(ResourceExtKt.getString(j1j.H4));
        }
        if (rating < 1.0f || rating >= 5.0f) {
            this.binding.H.setVisibility(8);
            this.binding.E.setVisibility(8);
            if (rating >= 5.0f) {
                this.binding.A.setVisibility(0);
                this.binding.B.setVisibility(0);
            } else {
                this.binding.A.setVisibility(8);
                this.binding.B.setVisibility(8);
            }
            Iterator<T> it = this.labelList.iterator();
            while (it.hasNext()) {
                ((SportFeedbackLabelModel) it.next()).setSelected(false);
            }
            return;
        }
        if (this.binding.E.getVisibility() != 0) {
            this.binding.H.setVisibility(0);
            this.binding.E.setVisibility(0);
            this.binding.A.setVisibility(0);
            this.binding.B.setVisibility(0);
            SportFeedbackLabelAdapter sportFeedbackLabelAdapter = this.mAdapter;
            if (sportFeedbackLabelAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                sportFeedbackLabelAdapter = null;
            }
            sportFeedbackLabelAdapter.notifyDataSetChanged();
        }
    }

    private final String getFeedbackLabel() {
        StringBuilder sb = new StringBuilder();
        List<SportFeedbackLabelModel> list = this.labelList;
        ArrayList<SportFeedbackLabelModel> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((SportFeedbackLabelModel) obj).getSelected()) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Object objLast = CollectionsKt___CollectionsKt.last((List<? extends Object>) arrayList);
            for (SportFeedbackLabelModel sportFeedbackLabelModel : arrayList) {
                sb.append(sportFeedbackLabelModel.getLabelStr());
                if (((SportFeedbackLabelModel) objLast).getIndex() != sportFeedbackLabelModel.getIndex()) {
                    sb.append(",");
                }
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final void initDataList() {
        if (this.labelList.isEmpty()) {
            this.labelList.addAll(SportFeedbackUtil.INSTANCE.createFeedbackLabelList(this.indoorFlag));
            if (!this.labelList.isEmpty()) {
                SportFeedbackLabelAdapter sportFeedbackLabelAdapter = this.mAdapter;
                if (sportFeedbackLabelAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    sportFeedbackLabelAdapter = null;
                }
                sportFeedbackLabelAdapter.notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(SportFeedbackView this$0, RatingBar ratingBar, float f, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.statue == FeedbackStatue.COMMIT) {
            ratingBar.setIsIndicator(true);
        } else {
            this$0.statue = FeedbackStatue.EDIT;
            this$0.displayTitleValue();
        }
    }

    public final void addCommitClick(@NotNull final Function0<Unit> onCommitClick) {
        Intrinsics.checkNotNullParameter(onCommitClick, "onCommitClick");
        ViewExtKt.clickWithTrigger$default(this.binding.C, 0L, new Function1() { // from class: mln
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportFeedbackView.addCommitClick$lambda$2(onCommitClick, (TextView) obj);
            }
        }, 1, null);
    }

    public final void bindData(boolean indoor, @NotNull SportBasicReport basicSport, @Nullable SportFeedbackModel sportFeedbackModel, @NotNull OnFeedbackUploadListener listener) {
        Intrinsics.checkNotNullParameter(basicSport, "basicSport");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.indoorFlag = indoor;
        this.mBasicReport = basicSport;
        String sid = basicSport.getSid();
        if (sid != null) {
            this.mDid = sid;
        }
        if (sportFeedbackModel != null) {
            resetStatue(FeedbackStatue.COMMIT);
            displayFeedbackView(sportFeedbackModel.getStarValue());
        } else {
            this.onFeedbackUploadListener = listener;
            initDataList();
        }
    }

    @NotNull
    public final String createFeedbackContent() {
        String str = this.binding.D.getRating() + createLabelContent();
        Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        return str;
    }

    public final void displayFeedbackView() {
        displayFeedbackView(this.binding.D.getRating());
    }

    @NotNull
    public final List<SportFeedbackLabelModel> getLabelList() {
        return this.labelList;
    }

    public final float getRating() {
        return this.binding.D.getRating();
    }

    @NotNull
    public final FeedbackStatue getStatue() {
        return this.statue;
    }

    public final void initView() {
        this.binding.F.bindData(hoi.S1, getContext().getString(j1j.L4));
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(getContext(), 0);
        flexboxLayoutManager.T(1);
        flexboxLayoutManager.U(0);
        flexboxLayoutManager.R(4);
        this.binding.E.setLayoutManager(flexboxLayoutManager);
        this.binding.E.addItemDecoration(new SportLabelItemDecoration());
        displayTitleValue();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SportFeedbackLabelAdapter sportFeedbackLabelAdapter = new SportFeedbackLabelAdapter(context, this.labelList);
        this.mAdapter = sportFeedbackLabelAdapter;
        this.binding.E.setAdapter(sportFeedbackLabelAdapter);
        this.binding.D.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() { // from class: nln
            @Override // android.widget.RatingBar.OnRatingBarChangeListener
            public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
                SportFeedbackView.initView$lambda$1(this.f28047a, ratingBar, f, z);
            }
        });
    }

    public final void onUpload(boolean isUploadLogFile, @NotNull String feedBackContent) {
        Intrinsics.checkNotNullParameter(feedBackContent, "feedBackContent");
        if (!NetworkUtils.isNetworkConnected(getContext())) {
            ViewExtKt.toast(this, ResourceExtKt.getString(j1j.common_hint_network_unavailable));
            return;
        }
        FeedBackModelData feedBackModelData = new FeedBackModelData();
        feedBackModelData.setContent(feedBackContent);
        feedBackModelData.setMi_wide_tag_id(1897);
        feedBackModelData.setMi_tag_id(9024);
        String str = this.mDid;
        OnFeedbackUploadListener onFeedbackUploadListener = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDid");
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.mDid;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDid");
                str2 = null;
            }
            feedBackModelData.setDid(str2);
        }
        feedBackModelData.setVersion_code(AppUtil.getVersionCode());
        feedBackModelData.setVersion_name(AppUtil.getVersionName());
        if (this.onFeedbackUploadListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onFeedbackUploadListener");
        }
        String strCreateLabelContent = createLabelContent();
        OnFeedbackUploadListener onFeedbackUploadListener2 = this.onFeedbackUploadListener;
        if (onFeedbackUploadListener2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onFeedbackUploadListener");
        } else {
            onFeedbackUploadListener = onFeedbackUploadListener2;
        }
        onFeedbackUploadListener.uploadInfo(isUploadLogFile, feedBackModelData, strCreateLabelContent);
    }

    public final void resetStatue(@NotNull FeedbackStatue statueParams) {
        Intrinsics.checkNotNullParameter(statueParams, "statueParams");
        this.statue = statueParams;
        if (statueParams == FeedbackStatue.COMMIT) {
            this.binding.D.setIsIndicator(true);
        }
    }

    public final void setLabelList(@NotNull List<SportFeedbackLabelModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.labelList = list;
    }

    public final void setStatue(@NotNull FeedbackStatue feedbackStatue) {
        Intrinsics.checkNotNullParameter(feedbackStatue, "<set-?>");
        this.statue = feedbackStatue;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportFeedbackView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void displayFeedbackView(float ratingParam) {
        if (this.statue != FeedbackStatue.COMMIT) {
            this.binding.H.setVisibility(0);
            this.binding.E.setVisibility(0);
            this.binding.C.setVisibility(0);
            this.binding.A.setVisibility(0);
            this.binding.B.setVisibility(0);
            return;
        }
        this.binding.H.setVisibility(8);
        this.binding.E.setVisibility(8);
        this.binding.C.setVisibility(8);
        this.binding.A.setVisibility(8);
        this.binding.B.setVisibility(8);
        this.binding.D.setRating(ratingParam);
        this.binding.G.setText(getContext().getString(j1j.K4));
    }

    public /* synthetic */ SportFeedbackView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportFeedbackView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.statue = FeedbackStatue.INIT;
        this.labelList = new ArrayList();
        this.binding = zce.A0(LayoutInflater.from(context), this, true);
        initView();
    }
}
