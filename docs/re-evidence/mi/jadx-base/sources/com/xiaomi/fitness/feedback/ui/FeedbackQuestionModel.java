package com.xiaomi.fitness.feedback.ui;

import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.feedback.bugreport.BaseFeedbackModel;
import com.xiaomi.fitness.feedback.bugreport.DeviceData;
import com.xiaomi.fitness.feedback.eco.EcoFeedbackSupporter;
import com.xiaomi.fitness.feedback.export.data.FeedBackModelData;
import com.xiaomi.fitness.feedback.request.FeedbackRequest;
import com.xiaomi.fitness.feedback.request.TagsResult;
import com.xiaomi.fitness.feedback.util.FeedbackConstants;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.a0j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\n\u001a\u00020\u000b2\u001a\b\u0004\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u000b0\rH\u0086\bø\u0001\u0000J'\u0010\u0010\u001a\u00020\u000b2\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000e\u0012\u0004\u0012\u00020\u000b0\rH\u0000¢\u0006\u0002\b\u0012J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000eH\u0002J4\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u000e2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J.\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/feedback/ui/FeedbackQuestionModel;", "Lcom/xiaomi/fitness/feedback/bugreport/BaseFeedbackModel;", "<init>", "()V", "mRequest", "Lcom/xiaomi/fitness/feedback/request/FeedbackRequest;", "getMRequest", "()Lcom/xiaomi/fitness/feedback/request/FeedbackRequest;", "setMRequest", "(Lcom/xiaomi/fitness/feedback/request/FeedbackRequest;)V", "loadTypes", "", "block", "Lkotlin/Function1;", "", "Lcom/xiaomi/fitness/feedback/request/TagsResult$Tag;", "loadItemInfos", "Lcom/xiaomi/fitness/feedback/ui/FeedbackItemInfo;", "loadItemInfos$feedback_chinaProductRelease", "getItems", "moduleId", "", "types", "Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData$FeedBackType;", "getSubItems", "tagList", "Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData$FeedBackType$SubTypeItem;", "localDevice", "Lcom/xiaomi/fitness/feedback/bugreport/DeviceData;", "getDeviceQuestionItems", "tags", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFeedbackQuestionModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedbackQuestionModel.kt\ncom/xiaomi/fitness/feedback/ui/FeedbackQuestionModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,171:1\n33#1,20:172\n1863#2,2:192\n1863#2,2:194\n1863#2,2:196\n*S KotlinDebug\n*F\n+ 1 FeedbackQuestionModel.kt\ncom/xiaomi/fitness/feedback/ui/FeedbackQuestionModel\n*L\n55#1:172,20\n112#1:192,2\n134#1:194,2\n158#1:196,2\n*E\n"})
public final class FeedbackQuestionModel extends BaseFeedbackModel {
    public FeedbackRequest mRequest;

    /* JADX INFO: renamed from: com.xiaomi.fitness.feedback.ui.FeedbackQuestionModel$loadTypes$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    public static final class AnonymousClass2 implements Function1<ApiException, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<FeedbackItemInfo> getDeviceQuestionItems(int moduleId, List<FeedBackModelData.FeedBackType> tags, DeviceData localDevice) {
        if (tags.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (FeedBackModelData.FeedBackType feedBackType : tags) {
            arrayList.add(new FeedbackItemInfo(12, feedBackType.getWideTagContent(), moduleId, feedBackType.getWideTagId(), 0, localDevice, getSubItems(moduleId, feedBackType.getTagList(), localDevice), false, false, 400, null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<FeedbackItemInfo> getItems(int moduleId, List<FeedBackModelData.FeedBackType> types) {
        ArrayList arrayList = new ArrayList();
        for (FeedBackModelData.FeedBackType feedBackType : types) {
            arrayList.add(new FeedbackItemInfo(12, feedBackType.getWideTagContent(), moduleId, feedBackType.getWideTagId(), 0, null, getSubItems$default(this, moduleId, feedBackType.getTagList(), null, 4, null), false, false, 432, null));
        }
        return arrayList;
    }

    private final List<FeedbackItemInfo> getSubItems(int moduleId, List<FeedBackModelData.FeedBackType.SubTypeItem> tagList, DeviceData localDevice) {
        List<FeedBackModelData.FeedBackType.SubTypeItem> list = tagList;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (FeedBackModelData.FeedBackType.SubTypeItem subTypeItem : tagList) {
            arrayList.add(new FeedbackItemInfo(12, subTypeItem.getShowContent(), moduleId, subTypeItem.getTagId(), 0, localDevice, null, subTypeItem.getHasFaq(), false, 336, null));
        }
        return arrayList;
    }

    public static /* synthetic */ List getSubItems$default(FeedbackQuestionModel feedbackQuestionModel, int i, List list, DeviceData deviceData, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            deviceData = null;
        }
        return feedbackQuestionModel.getSubItems(i, list, deviceData);
    }

    @NotNull
    public final FeedbackRequest getMRequest() {
        FeedbackRequest feedbackRequest = this.mRequest;
        if (feedbackRequest != null) {
            return feedbackRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRequest");
        return null;
    }

    public final void loadItemInfos$feedback_chinaProductRelease(@NotNull final Function1<? super List<FeedbackItemInfo>, Unit> block) throws JSONException {
        Intrinsics.checkNotNullParameter(block, "block");
        JSONObject jSONObject = new JSONObject();
        if (RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(400);
            jSONArray.put(401);
            jSONArray.put(239);
            jSONObject.put("module_ids", jSONArray);
        } else {
            jSONObject.put(FeedbackConstants.KEY_MODULE_ID, 273);
        }
        getMRequest().getFeedbackTypes(getLifecycleOwner(), jSONObject, new Function1<List<? extends TagsResult.Tag>, Unit>() { // from class: com.xiaomi.fitness.feedback.ui.FeedbackQuestionModel$loadItemInfos$$inlined$loadTypes$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TagsResult.Tag> list) {
                invoke2((List<TagsResult.Tag>) list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<TagsResult.Tag> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ArrayList arrayList = new ArrayList();
                List<TagsResult.Tag> list = it;
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.addAll(((TagsResult.Tag) it2.next()).getTags());
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (TagsResult.Tag tag : list) {
                    if (!tag.getTags().isEmpty()) {
                        int moduleId = tag.getModuleId();
                        if (moduleId == 239) {
                            EcoFeedbackSupporter.Companion.addEcoDevice(tag, arrayList4);
                        } else if (moduleId == 400) {
                            arrayList3.add(0, new FeedbackItemInfo(10, ResourceExtKt.getString(a0j.f486b), tag.getModuleId(), 0, 0, null, null, false, false, 504, null));
                            arrayList3.addAll(this.getItems(tag.getModuleId(), tag.getTags()));
                        } else if (moduleId == 401) {
                            Iterable<WearableDeviceModel> deviceModels = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModels();
                            arrayList4.add(0, new FeedbackItemInfo(10, ResourceExtKt.getString(a0j.p), tag.getModuleId(), 0, 0, null, null, false, false, 504, null));
                            for (WearableDeviceModel wearableDeviceModel : deviceModels) {
                                DeviceData deviceData = new DeviceData(null, wearableDeviceModel);
                                int i = 11;
                                int i2 = 0;
                                int i3 = 1;
                                arrayList4.add(new FeedbackItemInfo(i, DeviceModelExtKt.getName(wearableDeviceModel), tag.getModuleId(), i2, i3, deviceData, this.getDeviceQuestionItems(tag.getModuleId(), tag.getTags(), deviceData), false, false, 384, null));
                            }
                        }
                    }
                }
                arrayList2.addAll(arrayList4);
                arrayList2.addAll(arrayList3);
                block.invoke(arrayList2);
            }
        }, AnonymousClass2.INSTANCE);
    }

    public final void loadTypes(@NotNull final Function1<? super List<TagsResult.Tag>, Unit> block) throws JSONException {
        Intrinsics.checkNotNullParameter(block, "block");
        JSONObject jSONObject = new JSONObject();
        if (RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(400);
            jSONArray.put(401);
            jSONArray.put(239);
            jSONObject.put("module_ids", jSONArray);
        } else {
            jSONObject.put(FeedbackConstants.KEY_MODULE_ID, 273);
        }
        getMRequest().getFeedbackTypes(getLifecycleOwner(), jSONObject, new Function1<List<? extends TagsResult.Tag>, Unit>() { // from class: com.xiaomi.fitness.feedback.ui.FeedbackQuestionModel.loadTypes.1
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
                block.invoke(it);
            }
        }, AnonymousClass2.INSTANCE);
    }

    public final void setMRequest(@NotNull FeedbackRequest feedbackRequest) {
        Intrinsics.checkNotNullParameter(feedbackRequest, "<set-?>");
        this.mRequest = feedbackRequest;
    }
}
