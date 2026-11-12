package com.xiaomi.fitness.feedback.eco;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.ProductManager;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.feedback.bugreport.DeviceData;
import com.xiaomi.fitness.feedback.bugreport.FeedbackDeviceInfo;
import com.xiaomi.fitness.feedback.eco.EcoFeedbackSupporter;
import com.xiaomi.fitness.feedback.export.data.FeedBackModelData;
import com.xiaomi.fitness.feedback.request.TagsResult;
import com.xiaomi.fitness.feedback.ui.FeedbackItemInfo;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.RNDeviceModel;
import com.xiaomi.fitness.rn.export.bean.RNDevice;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/fitness/feedback/eco/EcoFeedbackSupporter;", "", "<init>", "()V", "Companion", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcoFeedbackSupporter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "EcoFeedbackSupporter";
    private static final int TYPE_FAT_SCALE = 11;
    private static final int TYPE_JUMP_ROPE = 10;
    private static final int TYPE_TREADMILL = 8;

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f22\u0010\u0011\u001a.\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u00010\u0015j\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u0001`\u0012¢\u0006\u0002\u0010\u0016JY\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f22\u0010\u0011\u001a.\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u00010\u0015j\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u0001`\u0012H\u0002¢\u0006\u0002\u0010\u0016JY\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f22\u0010\u0011\u001a.\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u00010\u0015j\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u0001`\u0012H\u0002¢\u0006\u0002\u0010\u0016JY\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f22\u0010\u0011\u001a.\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u00010\u0015j\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u0001`\u0012H\u0002¢\u0006\u0002\u0010\u0016J\u001c\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000fJ\u001e\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\r2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000fH\u0002J\u001e\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\r2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000fH\u0002J\u001e\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\r2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000fH\u0002J\u001e\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\r2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000fH\u0002J*\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00132\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/feedback/eco/EcoFeedbackSupporter$Companion;", "", "<init>", "()V", "TAG", "", "TYPE_TREADMILL", "", "TYPE_JUMP_ROPE", "TYPE_FAT_SCALE", "addEcoDevice", "", "feedBack", "Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData$FeedBackType;", "dataList", "", "Lcom/xiaomi/fitness/feedback/bugreport/FeedbackDeviceInfo;", "tagMap", "Lkotlin/collections/HashMap;", "", "Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData$FeedBackType$SubTypeItem;", "Ljava/util/HashMap;", "(Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData$FeedBackType;Ljava/util/List;Ljava/util/HashMap;)V", "addTreadmill", "addFatScale", "addRope", "tag", "Lcom/xiaomi/fitness/feedback/request/TagsResult$Tag;", "deviceTags", "Lcom/xiaomi/fitness/feedback/ui/FeedbackItemInfo;", "type", "addMiJiaDevice", "getSubItems", "deviceData", "Lcom/xiaomi/fitness/feedback/bugreport/DeviceData;", "isEcoIot", "", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nEcoFeedbackSupporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoFeedbackSupporter.kt\ncom/xiaomi/fitness/feedback/eco/EcoFeedbackSupporter$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n1863#2,2:315\n1863#2,2:318\n1863#2,2:320\n1863#2,2:322\n1863#2,2:324\n1755#2,3:326\n1863#2,2:329\n1#3:317\n*S KotlinDebug\n*F\n+ 1 EcoFeedbackSupporter.kt\ncom/xiaomi/fitness/feedback/eco/EcoFeedbackSupporter$Companion\n*L\n77#1:315,2\n124#1:318,2\n146#1:320,2\n195#1:322,2\n239#1:324,2\n266#1:326,3\n299#1:329,2\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean addEcoDevice$lambda$7$lambda$6(FeedBackModelData.FeedBackType type, RNDeviceModel deviceModel) {
            Intrinsics.checkNotNullParameter(type, "$type");
            Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
            return Intrinsics.areEqual(DeviceModelExtKt.getModel(deviceModel), type.getModel());
        }

        private final void addFatScale(final FeedBackModelData.FeedBackType feedBack, List<FeedbackDeviceInfo> dataList, HashMap<String, List<FeedBackModelData.FeedBackType.SubTypeItem>> tagMap) {
            EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).findDeviceModel(new Function1() { // from class: it7
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(EcoFeedbackSupporter.Companion.addFatScale$lambda$2(feedBack, (EcoDeviceModel) obj));
                }
            });
            if (ecoDeviceModel == null) {
                return;
            }
            dataList.add(new FeedbackDeviceInfo(new DeviceData(null, ecoDeviceModel), 13, feedBack.getWideTagContent(), 0, feedBack.getWideTagId(), feedBack.getWideTagContent(), false, false, 200, null));
            List<FeedBackModelData.FeedBackType.SubTypeItem> tagList = feedBack.getTagList();
            if (tagList == null || tagMap == null) {
                return;
            }
            tagMap.put(feedBack.getWideTagContent(), tagList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean addFatScale$lambda$2(FeedBackModelData.FeedBackType feedBack, EcoDeviceModel it) {
            Intrinsics.checkNotNullParameter(feedBack, "$feedBack");
            Intrinsics.checkNotNullParameter(it, "it");
            return Intrinsics.areEqual(feedBack.getSubCategory(), it.getProduct().getSubcategory());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean addFatScale$lambda$9(FeedBackModelData.FeedBackType type, EcoDeviceModel it) {
            Intrinsics.checkNotNullParameter(type, "$type");
            Intrinsics.checkNotNullParameter(it, "it");
            return Intrinsics.areEqual(type.getSubCategory(), it.getProduct().getSubcategory());
        }

        private final void addMiJiaDevice(FeedBackModelData.FeedBackType type, List<FeedbackItemInfo> deviceTags) {
            String name;
            for (T t : RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).getDeviceModels()) {
                String model = t.getProduct().getModel();
                List<FeedbackItemInfo> list = deviceTags;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            DeviceData deviceData = ((FeedbackItemInfo) it.next()).getDeviceData();
                            if (Intrinsics.areEqual(deviceData != null ? deviceData.getModel() : null, model)) {
                                Logger.i(EcoFeedbackSupporter.TAG, "addMiJiaDevice has match model is " + t.getProduct().getModel());
                            }
                        }
                    }
                }
                Product product = t.getDeviceInfo().getProduct();
                Integer iotSubCategoryId = product != null ? product.getIotSubCategoryId() : null;
                Logger.i(EcoFeedbackSupporter.TAG, "addMiJiaDevice iotSubCategoryId is " + iotSubCategoryId + ",model is " + DeviceModelExtKt.getModel(t));
                if (Intrinsics.areEqual(type.getSubCategory(), "iot_device_" + iotSubCategoryId)) {
                    Logger.i(EcoFeedbackSupporter.TAG, "addMiJiaDevice info is " + t.getProduct().getModel());
                    DeviceData deviceData2 = new DeviceData(null, t);
                    String productName = t.getProduct().getProductName();
                    if (productName == null) {
                        RNDevice device = t.getDevice();
                        String name2 = device != null ? device.getName() : null;
                        name = name2 == null ? t.getDeviceInfo().getName() : name2;
                    } else {
                        name = productName;
                    }
                    FeedbackItemInfo feedbackItemInfo = new FeedbackItemInfo(11, name, 239, type.getWideTagId(), 0, deviceData2, getSubItems(type, deviceData2, true), false, true, 144, null);
                    Logger.d(EcoFeedbackSupporter.TAG, "addMiJiaDevice equipment info is " + feedbackItemInfo);
                    deviceTags.add(feedbackItemInfo);
                }
            }
        }

        private final void addRope(FeedBackModelData.FeedBackType feedBack, List<FeedbackDeviceInfo> dataList, HashMap<String, List<FeedBackModelData.FeedBackType.SubTypeItem>> tagMap) {
            for (WearableProduct wearableProduct : ProductManager.DefaultImpls.getProductList$default(DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE), null, 1, null)) {
                if (wearableProduct.getType() == 10) {
                    DeviceData deviceData = new DeviceData(wearableProduct, null);
                    deviceData.setModel(wearableProduct.getModel());
                    deviceData.setProductName(wearableProduct.getProductName());
                    deviceData.setProductId(wearableProduct.getProductId());
                    FeedbackDeviceInfo feedbackDeviceInfo = new FeedbackDeviceInfo(deviceData, 12, feedBack.getWideTagContent(), 0, feedBack.getWideTagId(), feedBack.getWideTagContent(), false, false, 200, null);
                    Logger.d(EcoFeedbackSupporter.TAG, "equipment info is " + feedbackDeviceInfo);
                    dataList.add(feedbackDeviceInfo);
                }
            }
            List<FeedBackModelData.FeedBackType.SubTypeItem> tagList = feedBack.getTagList();
            if (tagList == null || tagMap == null) {
                return;
            }
            tagMap.put(feedBack.getWideTagContent(), tagList);
        }

        private final void addTreadmill(FeedBackModelData.FeedBackType feedBack, List<FeedbackDeviceInfo> dataList, HashMap<String, List<FeedBackModelData.FeedBackType.SubTypeItem>> tagMap) {
            for (WearableProduct wearableProduct : ProductManager.DefaultImpls.getProductList$default(DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE), null, 1, null)) {
                if (wearableProduct.getType() == 8) {
                    DeviceData deviceData = new DeviceData(wearableProduct, null);
                    deviceData.setModel(wearableProduct.getModel());
                    deviceData.setProductName(wearableProduct.getProductName());
                    deviceData.setProductId(wearableProduct.getProductId());
                    FeedbackDeviceInfo feedbackDeviceInfo = new FeedbackDeviceInfo(deviceData, 11, feedBack.getWideTagContent(), 0, feedBack.getWideTagId(), feedBack.getWideTagContent(), false, false, 200, null);
                    Logger.d(EcoFeedbackSupporter.TAG, "equipment info is " + feedbackDeviceInfo);
                    dataList.add(feedbackDeviceInfo);
                }
            }
            List<FeedBackModelData.FeedBackType.SubTypeItem> tagList = feedBack.getTagList();
            if (tagList == null || tagMap == null) {
                return;
            }
            tagMap.put(feedBack.getWideTagContent(), tagList);
        }

        private final List<FeedbackItemInfo> getSubItems(FeedBackModelData.FeedBackType type, DeviceData deviceData, boolean isEcoIot) {
            List<FeedBackModelData.FeedBackType.SubTypeItem> tagList = type.getTagList();
            if (tagList == null || tagList.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            List<FeedBackModelData.FeedBackType.SubTypeItem> tagList2 = type.getTagList();
            Intrinsics.checkNotNull(tagList2);
            for (FeedBackModelData.FeedBackType.SubTypeItem subTypeItem : tagList2) {
                arrayList.add(new FeedbackItemInfo(12, subTypeItem.getShowContent(), type.getWideTagId(), subTypeItem.getTagId(), 0, deviceData, null, subTypeItem.getHasFaq(), isEcoIot, 80, null));
            }
            return arrayList;
        }

        public static /* synthetic */ List getSubItems$default(Companion companion, FeedBackModelData.FeedBackType feedBackType, DeviceData deviceData, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            return companion.getSubItems(feedBackType, deviceData, z);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x004a  */
        /* JADX WARN: Instruction removed from duplicated block: B:22:0x004a, please report this as an issue */
        public final void addEcoDevice(@NotNull FeedBackModelData.FeedBackType feedBack, @NotNull List<FeedbackDeviceInfo> dataList, @Nullable HashMap<String, List<FeedBackModelData.FeedBackType.SubTypeItem>> tagMap) {
            Intrinsics.checkNotNullParameter(feedBack, "feedBack");
            Intrinsics.checkNotNullParameter(dataList, "dataList");
            String subCategory = feedBack.getSubCategory();
            if (subCategory == null) {
                Logger.i("This subcategory(" + subCategory + ") is not supported", new Object[0]);
            } else {
                int iHashCode = subCategory.hashCode();
                if (iHashCode != -78115034) {
                    if (iHashCode != 277381284) {
                        if (iHashCode == 1639539805 && subCategory.equals("rop_skipping")) {
                            addRope(feedBack, dataList, tagMap);
                        } else {
                            Logger.i("This subcategory(" + subCategory + ") is not supported", new Object[0]);
                        }
                    } else if (subCategory.equals("fat_scale")) {
                        addFatScale(feedBack, dataList, tagMap);
                    } else {
                        Logger.i("This subcategory(" + subCategory + ") is not supported", new Object[0]);
                    }
                } else if (subCategory.equals("treadmill")) {
                    addTreadmill(feedBack, dataList, tagMap);
                } else {
                    Logger.i("This subcategory(" + subCategory + ") is not supported", new Object[0]);
                }
            }
            Logger.d(EcoFeedbackSupporter.TAG, "showContent is " + feedBack.getWideTagContent());
        }

        public final void addEcoDevice(@NotNull TagsResult.Tag tag, @NotNull List<FeedbackItemInfo> deviceTags) {
            String name;
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(deviceTags, "deviceTags");
            for (final FeedBackModelData.FeedBackType feedBackType : tag.getTags()) {
                String model = feedBackType.getModel();
                if (model != null && model.length() != 0) {
                    RNDeviceModel rNDeviceModel = (RNDeviceModel) RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).findDeviceModel(new Function1() { // from class: kt7
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return Boolean.valueOf(EcoFeedbackSupporter.Companion.addEcoDevice$lambda$7$lambda$6(feedBackType, (RNDeviceModel) obj));
                        }
                    });
                    if (rNDeviceModel != null) {
                        DeviceData deviceData = new DeviceData(null, rNDeviceModel);
                        Product product = rNDeviceModel.getDeviceInfo().getProduct();
                        Integer iotSubCategoryId = product != null ? product.getIotSubCategoryId() : null;
                        boolean zAreEqual = Intrinsics.areEqual(feedBackType.getSubCategory(), "iot_device_" + iotSubCategoryId);
                        Logger.i(EcoFeedbackSupporter.TAG, "addEcoDevice iotSubCategoryId is " + iotSubCategoryId + ",model is " + deviceData.getModel() + ",isEcoIot is " + zAreEqual);
                        String productName = rNDeviceModel.getProduct().getProductName();
                        if (productName == null) {
                            RNDevice device = rNDeviceModel.getDevice();
                            String name2 = device != null ? device.getName() : null;
                            name = name2 == null ? rNDeviceModel.getDeviceInfo().getName() : name2;
                        } else {
                            name = productName;
                        }
                        FeedbackItemInfo feedbackItemInfo = new FeedbackItemInfo(11, name, 239, feedBackType.getWideTagId(), 0, deviceData, EcoFeedbackSupporter.INSTANCE.getSubItems(feedBackType, deviceData, zAreEqual), false, zAreEqual, 144, null);
                        Logger.d(EcoFeedbackSupporter.TAG, "equipment info is " + feedbackItemInfo);
                        deviceTags.add(feedbackItemInfo);
                    } else {
                        Logger.i("by model match,but Can not find device with " + feedBackType.getModel(), new Object[0]);
                    }
                    EcoFeedbackSupporter.INSTANCE.addMiJiaDevice(feedBackType, deviceTags);
                } else if (Intrinsics.areEqual(feedBackType.getCategory(), "equipment")) {
                    String subCategory = feedBackType.getSubCategory();
                    if (subCategory != null) {
                        int iHashCode = subCategory.hashCode();
                        if (iHashCode != -78115034) {
                            if (iHashCode != 277381284) {
                                if (iHashCode == 1639539805 && subCategory.equals("rop_skipping")) {
                                    EcoFeedbackSupporter.INSTANCE.addRope(feedBackType, deviceTags);
                                }
                            } else if (subCategory.equals("fat_scale")) {
                                EcoFeedbackSupporter.INSTANCE.addFatScale(feedBackType, deviceTags);
                            }
                        } else if (subCategory.equals("treadmill")) {
                            EcoFeedbackSupporter.INSTANCE.addTreadmill(feedBackType, deviceTags);
                        }
                    }
                    Logger.i("This subcategory(" + feedBackType.getSubCategory() + ") is not supported", new Object[0]);
                } else {
                    Logger.i("This category(" + feedBackType.getCategory() + ") is not supported", new Object[0]);
                }
            }
        }

        private final void addFatScale(final FeedBackModelData.FeedBackType type, List<FeedbackItemInfo> deviceTags) {
            EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).findDeviceModel(new Function1() { // from class: jt7
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(EcoFeedbackSupporter.Companion.addFatScale$lambda$9(type, (EcoDeviceModel) obj));
                }
            });
            if (ecoDeviceModel == null) {
                return;
            }
            DeviceData deviceData = new DeviceData(null, ecoDeviceModel);
            deviceTags.add(new FeedbackItemInfo(11, type.getWideTagContent(), 239, type.getWideTagId(), 0, deviceData, getSubItems$default(this, type, deviceData, false, 4, null), false, false, 400, null));
        }

        private final void addRope(FeedBackModelData.FeedBackType type, List<FeedbackItemInfo> deviceTags) {
            for (WearableProduct wearableProduct : ProductManager.DefaultImpls.getProductList$default(DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE), null, 1, null)) {
                if (wearableProduct.getType() == 10) {
                    DeviceData deviceData = new DeviceData(wearableProduct, null);
                    deviceData.setModel(wearableProduct.getModel());
                    deviceData.setProductName(wearableProduct.getProductName());
                    deviceData.setProductId(wearableProduct.getProductId());
                    FeedbackItemInfo feedbackItemInfo = new FeedbackItemInfo(11, type.getWideTagContent(), 239, type.getWideTagId(), 0, deviceData, getSubItems$default(EcoFeedbackSupporter.INSTANCE, type, deviceData, false, 4, null), false, false, 400, null);
                    Logger.d(EcoFeedbackSupporter.TAG, "equipment info is " + feedbackItemInfo);
                    deviceTags.add(feedbackItemInfo);
                }
            }
        }

        private final void addTreadmill(FeedBackModelData.FeedBackType type, List<FeedbackItemInfo> deviceTags) {
            for (WearableProduct wearableProduct : ProductManager.DefaultImpls.getProductList$default(DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE), null, 1, null)) {
                if (wearableProduct.getType() == 8) {
                    DeviceData deviceData = new DeviceData(wearableProduct, null);
                    deviceData.setModel(wearableProduct.getModel());
                    deviceData.setProductName(wearableProduct.getProductName());
                    deviceData.setProductId(wearableProduct.getProductId());
                    FeedbackItemInfo feedbackItemInfo = new FeedbackItemInfo(11, type.getWideTagContent(), 239, type.getWideTagId(), 0, deviceData, getSubItems$default(EcoFeedbackSupporter.INSTANCE, type, deviceData, false, 4, null), false, false, 400, null);
                    Logger.d(EcoFeedbackSupporter.TAG, "equipment info is " + feedbackItemInfo);
                    deviceTags.add(feedbackItemInfo);
                }
            }
        }
    }
}
