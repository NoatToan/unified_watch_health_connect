package com.xiaomi.fitness.feedback.ui;

import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.feedback.bugreport.BaseFeedbackModel;
import com.xiaomi.fitness.feedback.export.data.FeedBackModelData;
import com.xiaomi.fitness.feedback.request.FeedbackRequest;
import com.xiaomi.fitness.feedback.request.TagsResult;
import com.xiaomi.fitness.feedback.util.FeedbackConstants;
import com.xiaomi.fitness.net.response.ApiException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\n\u001a\u00020\u000b2\u001a\b\u0004\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u000b0\rH\u0086\bø\u0001\u0000R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/feedback/ui/FeedbackModel;", "Lcom/xiaomi/fitness/feedback/bugreport/BaseFeedbackModel;", "<init>", "()V", "mRequest", "Lcom/xiaomi/fitness/feedback/request/FeedbackRequest;", "getMRequest", "()Lcom/xiaomi/fitness/feedback/request/FeedbackRequest;", "setMRequest", "(Lcom/xiaomi/fitness/feedback/request/FeedbackRequest;)V", "loadTypes", "", "block", "Lkotlin/Function1;", "", "Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData$FeedBackType;", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FeedbackModel extends BaseFeedbackModel {
    public FeedbackRequest mRequest;

    @NotNull
    public final FeedbackRequest getMRequest() {
        FeedbackRequest feedbackRequest = this.mRequest;
        if (feedbackRequest != null) {
            return feedbackRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRequest");
        return null;
    }

    public final void loadTypes(@NotNull final Function1<? super List<FeedBackModelData.FeedBackType>, Unit> block) throws JSONException {
        Intrinsics.checkNotNullParameter(block, "block");
        JSONObject jSONObject = new JSONObject();
        if (AppUtil.INSTANCE.isPlayChannel()) {
            jSONObject.put(FeedbackConstants.KEY_MODULE_ID, 273);
        } else {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(400);
            jSONArray.put(401);
            jSONObject.put("module_ids", jSONArray);
        }
        getMRequest().getFeedbackTypes(getLifecycleOwner(), jSONObject, new Function1<List<? extends TagsResult.Tag>, Unit>() { // from class: com.xiaomi.fitness.feedback.ui.FeedbackModel.loadTypes.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TagsResult.Tag> list) {
                invoke2((List<TagsResult.Tag>) list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<TagsResult.Tag> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ArrayList arrayList = new ArrayList();
                Iterator<T> it2 = it.iterator();
                while (it2.hasNext()) {
                    arrayList.addAll(((TagsResult.Tag) it2.next()).getTags());
                }
                block.invoke(arrayList);
            }
        }, new Function1<ApiException, Unit>() { // from class: com.xiaomi.fitness.feedback.ui.FeedbackModel.loadTypes.2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiException apiException) {
                invoke2(apiException);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ApiException it) {
                Intrinsics.checkNotNullParameter(it, "it");
                StringBuilder sb = new StringBuilder();
                sb.append("loadTypes: ");
                sb.append(it);
            }
        });
    }

    public final void setMRequest(@NotNull FeedbackRequest feedbackRequest) {
        Intrinsics.checkNotNullParameter(feedbackRequest, "<set-?>");
        this.mRequest = feedbackRequest;
    }
}
