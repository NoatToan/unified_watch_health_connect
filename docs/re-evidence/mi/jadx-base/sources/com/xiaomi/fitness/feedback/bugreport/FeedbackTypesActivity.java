package com.xiaomi.fitness.feedback.bugreport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.feedback.bugreport.FeedbackTypesActivity;
import com.xiaomi.fitness.feedback.export.data.FeedBackModelData;
import com.xiaomi.fitness.feedback.util.FeedbackConstants;
import defpackage.a0j;
import defpackage.bv1;
import defpackage.cri;
import defpackage.hui;
import defpackage.pi9;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b2\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010.¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/feedback/bugreport/FeedbackTypesActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/feedback/bugreport/FeedbackTypesViewModel;", "Lpi9;", "Lcom/xiaomi/fitness/feedback/bugreport/OnItemClickCallBack;", "", "setAdapter", "()V", "Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData$FeedBackType;", "item", "onMainTypeItemCLick", "(Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData$FeedBackType;)V", "Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData$FeedBackType$SubTypeItem;", "onSubTypeItemClick", "(Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData$FeedBackType$SubTypeItem;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "", "any", "onItemClick", "(Landroid/view/View;Ljava/lang/Object;)V", "", "TAG", "Ljava/lang/String;", "", "tagId", "I", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/feedback/bugreport/FeedbackTypesAdapter;", "adapter", "Lcom/xiaomi/fitness/feedback/bugreport/FeedbackTypesAdapter;", "feedBackType", "Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData$FeedBackType;", "", "feedBackTypeList", "Ljava/util/List;", "", "isHideArrow", "Z", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FeedbackTypesActivity extends BaseBindingActivity<FeedbackTypesViewModel, pi9> implements OnItemClickCallBack {

    @NotNull
    private final String TAG = "FeedbackTypesActivity";

    @Nullable
    private FeedbackTypesAdapter adapter;

    @Nullable
    private FeedBackModelData.FeedBackType feedBackType;

    @Nullable
    private List<FeedBackModelData.FeedBackType> feedBackTypeList;
    private boolean isHideArrow;

    @Nullable
    private RecyclerView recyclerView;
    private int tagId;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(FeedbackTypesActivity this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(this$0.TAG, "feedbackList -- " + list);
        if (list != null) {
            this$0.feedBackTypeList = list;
            int i = this$0.tagId;
            if (i != 0) {
                Logger.d(this$0.TAG, "tagId -- " + i);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    FeedBackModelData.FeedBackType feedBackType = (FeedBackModelData.FeedBackType) it.next();
                    Logger.d(this$0.TAG, "feedBack.wideTagId -- " + feedBackType.getWideTagId() + ", tagId == " + this$0.tagId + ", hlth_category == " + feedBackType.getCategory() + ", sub == " + feedBackType.getSubCategory());
                    String str = this$0.TAG;
                    String wideTagContent = feedBackType.getWideTagContent();
                    int wideTagId = feedBackType.getWideTagId();
                    StringBuilder sb = new StringBuilder();
                    sb.append("feedBack string --");
                    sb.append(wideTagContent);
                    sb.append(" >> ");
                    sb.append(wideTagId);
                    Logger.d(str, sb.toString());
                    if (feedBackType.getWideTagId() == this$0.tagId) {
                        Logger.d(this$0.TAG, "feedBack -- " + feedBackType);
                        this$0.feedBackType = feedBackType;
                    }
                }
                FeedBackModelData.FeedBackType feedBackType2 = this$0.feedBackType;
                if (feedBackType2 != null) {
                    String str2 = this$0.TAG;
                    Intrinsics.checkNotNull(feedBackType2);
                    List<FeedBackModelData.FeedBackType.SubTypeItem> tagList = feedBackType2.getTagList();
                    Intrinsics.checkNotNull(tagList);
                    Logger.d(str2, "feedBack list-- " + tagList.get(0));
                    FeedbackTypesAdapter feedbackTypesAdapter = this$0.adapter;
                    Intrinsics.checkNotNull(feedbackTypesAdapter);
                    FeedBackModelData.FeedBackType feedBackType3 = this$0.feedBackType;
                    Intrinsics.checkNotNull(feedBackType3);
                    feedbackTypesAdapter.updateSubData(feedBackType3.getTagList());
                }
            } else {
                Logger.d(this$0.TAG, "it -- " + list);
                FeedbackTypesAdapter feedbackTypesAdapter2 = this$0.adapter;
                Intrinsics.checkNotNull(feedbackTypesAdapter2);
                feedbackTypesAdapter2.updateData(list);
            }
        } else {
            this$0.lambda$onCreate$0();
        }
        return Unit.INSTANCE;
    }

    private final void onMainTypeItemCLick(FeedBackModelData.FeedBackType item) {
        if (item.getTagList() != null) {
            Intrinsics.checkNotNull(item);
            List<FeedBackModelData.FeedBackType.SubTypeItem> tagList = item.getTagList();
            Intrinsics.checkNotNull(tagList);
            if (tagList.size() != 0) {
                Intent intent = new Intent();
                intent.putExtra(FeedbackConstants.KEY_TYPE_ITEM, item);
                intent.setClass(this, FeedbackTypesActivity.class);
                startActivity(intent);
                return;
            }
        }
        getIntent().putExtra(FeedbackConstants.KEY_MAIN_TAG_ID, item.getWideTagId());
        getIntent().putExtra(FeedbackConstants.KEY_SUB_TAG_ID, 0);
        getIntent().putExtra(FeedbackConstants.KEY_SELECTED_TYPE, item.getWideTagContent());
        setResult(100, getIntent());
        lambda$onCreate$0();
    }

    private final void onSubTypeItemClick(FeedBackModelData.FeedBackType.SubTypeItem item) {
        Intent intent = getIntent();
        FeedBackModelData.FeedBackType feedBackType = this.feedBackType;
        intent.putExtra(FeedbackConstants.KEY_MAIN_TAG_ID, feedBackType != null ? Integer.valueOf(feedBackType.getWideTagId()) : null);
        getIntent().putExtra(FeedbackConstants.KEY_SUB_TAG_ID, item.getTagId());
        Intent intent2 = getIntent();
        FeedBackModelData.FeedBackType feedBackType2 = this.feedBackType;
        String wideTagContent = feedBackType2 != null ? feedBackType2.getWideTagContent() : null;
        intent2.putExtra(FeedbackConstants.KEY_SELECTED_TYPE, wideTagContent + "-" + item.getShowContent());
        setResult(100, getIntent());
        finish();
    }

    private final void setAdapter() {
        FeedbackTypesAdapter feedbackTypesAdapter = new FeedbackTypesAdapter(this, (this.feedBackType == null && this.tagId == 0) ? false : true, this.isHideArrow);
        this.adapter = feedbackTypesAdapter;
        Intrinsics.checkNotNull(feedbackTypesAdapter);
        feedbackTypesAdapter.setOnItemClickCallBack(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        linearLayoutManager.setOrientation(1);
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.adapter);
        }
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return hui.j;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return bv1.f4630a;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0081  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws JSONException {
        super.onCreate(savedInstanceState);
        setTitle(a0j.H);
        if (getIntent() != null) {
            this.isHideArrow = true;
            this.feedBackType = (FeedBackModelData.FeedBackType) getIntent().getSerializableExtra(FeedbackConstants.KEY_TYPE_ITEM);
        }
        if (getIntent() != null) {
            this.isHideArrow = true;
            Serializable serializableExtra = getIntent().getSerializableExtra(FeedbackConstants.KEY_TAG_ID);
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type kotlin.Int");
            this.tagId = ((Integer) serializableExtra).intValue();
        }
        this.recyclerView = (RecyclerView) findViewById(cri.common_recycleview);
        if (this.adapter == null) {
            setAdapter();
        }
        if (this.feedBackType != null) {
            FeedbackTypesAdapter feedbackTypesAdapter = this.adapter;
            Intrinsics.checkNotNull(feedbackTypesAdapter);
            FeedBackModelData.FeedBackType feedBackType = this.feedBackType;
            Intrinsics.checkNotNull(feedBackType);
            feedbackTypesAdapter.updateSubData(feedBackType.getTagList());
        } else {
            List<FeedBackModelData.FeedBackType> list = this.feedBackTypeList;
            if (list != null) {
                Intrinsics.checkNotNull(list);
                if (list.size() == 0) {
                    ((FeedbackTypesViewModel) getMViewModel()).loadTypes();
                } else {
                    FeedbackTypesAdapter feedbackTypesAdapter2 = this.adapter;
                    Intrinsics.checkNotNull(feedbackTypesAdapter2);
                    List<FeedBackModelData.FeedBackType> list2 = this.feedBackTypeList;
                    Intrinsics.checkNotNull(list2);
                    feedbackTypesAdapter2.updateData(list2);
                }
            } else {
                ((FeedbackTypesViewModel) getMViewModel()).loadTypes();
            }
        }
        ((FeedbackTypesViewModel) getMViewModel()).getFeedbackList().observe(this, new FeedbackTypesActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: dk9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeedbackTypesActivity.onCreate$lambda$0(this.f15612a, (List) obj);
            }
        }));
    }

    @Override // com.xiaomi.fitness.feedback.bugreport.OnItemClickCallBack
    public void onItemClick(@Nullable View view, @Nullable Object any) {
        if (this.feedBackType == null && this.tagId == 0) {
            Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.xiaomi.fitness.feedback.export.data.FeedBackModelData.FeedBackType");
            onMainTypeItemCLick((FeedBackModelData.FeedBackType) any);
        } else {
            Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.xiaomi.fitness.feedback.export.data.FeedBackModelData.FeedBackType.SubTypeItem");
            onSubTypeItemClick((FeedBackModelData.FeedBackType.SubTypeItem) any);
        }
    }
}
