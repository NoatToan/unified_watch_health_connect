package com.xiaomi.fitness.watch.face.export.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.feedback.util.FeedbackConstants;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.j5f;
import defpackage.k5f;
import defpackage.m5f;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bc\b\u0086\b\u0018\u0000 \u0092\u00012\u00020\u0001:\u0012\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u0092\u0001B¯\u0002\u0012\b\u0010;\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010<\u001a\u00020\u000f\u0012\b\u0010=\u001a\u0004\u0018\u00010\f\u0012\b\u0010>\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010?\u001a\u00020\u000f\u0012\u0006\u0010@\u001a\u00020\u000f\u0012\u0006\u0010A\u001a\u00020\u0017\u0012\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\u0006\u0010C\u001a\u00020\f\u0012\u0006\u0010D\u001a\u00020\f\u0012\u0006\u0010E\u001a\u00020\f\u0012\b\u0010F\u001a\u0004\u0018\u00010\f\u0012\b\u0010G\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010H\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010I\u001a\u0004\u0018\u00010\f\u0012\b\u0010J\u001a\u0004\u0018\u00010\f\u0012\b\u0010K\u001a\u0004\u0018\u00010\f\u0012\b\u0010L\u001a\u0004\u0018\u00010\f\u0012\b\u0010M\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010N\u001a\u00020\f\u0012\u0006\u0010O\u001a\u00020\u0017\u0012\b\u0010P\u001a\u0004\u0018\u00010\f\u0012\b\u0010Q\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010R\u001a\u00020\u000f\u0012\u000e\u0010S\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\u001a\u0012\u000e\u0010T\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u001a\u0012\b\u0010U\u001a\u0004\u0018\u000103\u0012\u0006\u0010V\u001a\u00020\u000f\u0012\u0006\u0010W\u001a\u00020\u000f\u0012\b\u0010X\u001a\u0004\u0018\u000108¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0004J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u000eJ\u0010\u0010\u001f\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u000eJ\u0010\u0010 \u001a\u00020\fHÆ\u0003¢\u0006\u0004\b \u0010\u000eJ\u0012\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b!\u0010\u000eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b$\u0010\u0014J\u0012\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b%\u0010\u000eJ\u0012\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010\u000eJ\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010\u000eJ\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010\u000eJ\u0012\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b)\u0010\u000eJ\u0010\u0010*\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b*\u0010\u000eJ\u0010\u0010+\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\b+\u0010\u0019J\u0012\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b,\u0010\u000eJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b-\u0010#J\u0010\u0010.\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b.\u0010\u0011J\u0018\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b0\u0010\u001dJ\u0018\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b2\u0010\u001dJ\u0012\u00104\u001a\u0004\u0018\u000103HÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b6\u0010\u0011J\u0010\u00107\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b7\u0010\u0011J\u0012\u00109\u001a\u0004\u0018\u000108HÆ\u0003¢\u0006\u0004\b9\u0010:Jò\u0002\u0010Y\u001a\u00020\u00002\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010<\u001a\u00020\u000f2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010?\u001a\u00020\u000f2\b\b\u0002\u0010@\u001a\u00020\u000f2\b\b\u0002\u0010A\u001a\u00020\u00172\u0010\b\u0002\u0010B\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\b\b\u0002\u0010C\u001a\u00020\f2\b\b\u0002\u0010D\u001a\u00020\f2\b\b\u0002\u0010E\u001a\u00020\f2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010N\u001a\u00020\f2\b\b\u0002\u0010O\u001a\u00020\u00172\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010R\u001a\u00020\u000f2\u0010\b\u0002\u0010S\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\u001a2\u0010\b\u0002\u0010T\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u001a2\n\b\u0002\u0010U\u001a\u0004\u0018\u0001032\b\b\u0002\u0010V\u001a\u00020\u000f2\b\b\u0002\u0010W\u001a\u00020\u000f2\n\b\u0002\u0010X\u001a\u0004\u0018\u000108HÆ\u0001¢\u0006\u0004\bY\u0010ZJ\u0010\u0010[\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b[\u0010\u000eJ\u0010\u0010\\\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\\\u0010\u0011J\u001a\u0010^\u001a\u00020\u00022\b\u0010]\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b^\u0010_R\u0019\u0010;\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b;\u0010`\u001a\u0004\ba\u0010\u000eR\u0017\u0010<\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b<\u0010b\u001a\u0004\bc\u0010\u0011R\u0019\u0010=\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b=\u0010`\u001a\u0004\bd\u0010\u000eR\u0019\u0010>\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b>\u0010e\u001a\u0004\bf\u0010\u0014R\u0017\u0010?\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b?\u0010b\u001a\u0004\bg\u0010\u0011R\u0017\u0010@\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b@\u0010b\u001a\u0004\bh\u0010\u0011R\u0017\u0010A\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bA\u0010i\u001a\u0004\bj\u0010\u0019R\u001f\u0010B\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\bB\u0010k\u001a\u0004\bl\u0010\u001dR\u0017\u0010C\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bC\u0010`\u001a\u0004\bm\u0010\u000eR\u0017\u0010D\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bD\u0010`\u001a\u0004\bn\u0010\u000eR\u0017\u0010E\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bE\u0010`\u001a\u0004\bo\u0010\u000eR\u0019\u0010F\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bF\u0010`\u001a\u0004\bp\u0010\u000eR\u001c\u0010G\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010q\u001a\u0004\br\u0010#R\u0019\u0010H\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bH\u0010e\u001a\u0004\bs\u0010\u0014R\u0019\u0010I\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bI\u0010`\u001a\u0004\bt\u0010\u000eR\u0019\u0010J\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bJ\u0010`\u001a\u0004\bu\u0010\u000eR\u0019\u0010K\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bK\u0010`\u001a\u0004\bv\u0010\u000eR\u0019\u0010L\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bL\u0010`\u001a\u0004\bw\u0010\u000eR\u0019\u0010M\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bM\u0010`\u001a\u0004\bx\u0010\u000eR\u0017\u0010N\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bN\u0010`\u001a\u0004\by\u0010\u000eR\u0017\u0010O\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bO\u0010i\u001a\u0004\bz\u0010\u0019R\u0019\u0010P\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bP\u0010`\u001a\u0004\b{\u0010\u000eR\u0019\u0010Q\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bQ\u0010q\u001a\u0004\b|\u0010#R\u0017\u0010R\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bR\u0010b\u001a\u0004\b}\u0010\u0011R\u001f\u0010S\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\bS\u0010k\u001a\u0004\b~\u0010\u001dR\u001f\u0010T\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\bT\u0010k\u001a\u0004\b\u007f\u0010\u001dR\u001b\u0010U\u001a\u0004\u0018\u0001038\u0006¢\u0006\u000e\n\u0005\bU\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u00105R\u001b\u0010V\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\r\n\u0004\bV\u0010b\u001a\u0005\b\u0082\u0001\u0010\u0011R\u0018\u0010W\u001a\u00020\u000f8\u0006¢\u0006\r\n\u0004\bW\u0010b\u001a\u0005\b\u0083\u0001\u0010\u0011R\u001b\u0010X\u001a\u0004\u0018\u0001088\u0006¢\u0006\u000e\n\u0005\bX\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010:R'\u0010\u0086\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0086\u0001\u0010b\u001a\u0005\b\u0087\u0001\u0010\u0011\"\u0006\b\u0088\u0001\u0010\u0089\u0001R'\u0010\u008a\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u008a\u0001\u0010`\u001a\u0005\b\u008b\u0001\u0010\u000e\"\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0013\u0010\u008f\u0001\u001a\u00020\u00178F¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010\u0019¨\u0006\u009b\u0001"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "", "", "isPurchaseFace", "()Z", "canPurchase", "isVip", "isWhiteListFace", "buyWithVip", "Lm5f;", "toMarket", "()Lm5f;", "", "component1", "()Ljava/lang/String;", "", "component2", "()I", "component3", "component4", "()Ljava/lang/Integer;", "component5", "component6", "", "component7", "()J", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData$Attribute;", "component8", "()Ljava/util/List;", "component9", "component10", "component11", "component12", "component13", "()Ljava/lang/Long;", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData$Tag;", "component25", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData$Icon;", "component26", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData$Category;", "component27", "()Lcom/xiaomi/fitness/watch/face/export/data/FaceData$Category;", "component28", "component29", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData$BleExt;", "component30", "()Lcom/xiaomi/fitness/watch/face/export/data/FaceData$BleExt;", "spu_id", "spu_version", OneTrack.Param.SKU_ID, "purchase_type", "purchase_status", "status", Constants.KEY_PRICE, "attribute_list", "id", "display_name", "icon", "aod_icon", "version_code", "power_level", "package_name", "package_name_hash", "introduction", "publish_name", "config_file", "file_hash", "file_size", "file_hash_v2", "file_size_v2", "download_count", FeedbackConstants.KEY_TAG_LIST, "icon_list", "category", "contentSource", "acq_method", "ble_ext", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;IIJLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Long;ILjava/util/List;Ljava/util/List;Lcom/xiaomi/fitness/watch/face/export/data/FaceData$Category;IILcom/xiaomi/fitness/watch/face/export/data/FaceData$BleExt;)Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSpu_id", "I", "getSpu_version", "getSku_id", "Ljava/lang/Integer;", "getPurchase_type", "getPurchase_status", "getStatus", "J", "getPrice", "Ljava/util/List;", "getAttribute_list", "getId", "getDisplay_name", "getIcon", "getAod_icon", "Ljava/lang/Long;", "getVersion_code", "getPower_level", "getPackage_name", "getPackage_name_hash", "getIntroduction", "getPublish_name", "getConfig_file", "getFile_hash", "getFile_size", "getFile_hash_v2", "getFile_size_v2", "getDownload_count", "getTag_list", "getIcon_list", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData$Category;", "getCategory", "getContentSource", "getAcq_method", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData$BleExt;", "getBle_ext", "tabId", "getTabId", "setTabId", "(I)V", "tabName", "getTabName", "setTabName", "(Ljava/lang/String;)V", "getFileSize", "fileSize", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;IIJLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Long;ILjava/util/List;Ljava/util/List;Lcom/xiaomi/fitness/watch/face/export/data/FaceData$Category;IILcom/xiaomi/fitness/watch/face/export/data/FaceData$BleExt;)V", "Companion", "Tag", "Category", "Icon", "BleExt", "Functions", "IdList", "BgStyle", "Attribute", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final /* data */ class FaceData {
    public static final int POWER_LEVEL_HIGH = 3;
    public static final int POWER_LEVEL_LOW = 1;
    public static final int POWER_LEVEL_MEDIUM = 2;
    private final int acq_method;

    @Nullable
    private final String aod_icon;

    @Nullable
    private final List<Attribute> attribute_list;

    @Nullable
    private final BleExt ble_ext;

    @Nullable
    private final Category category;

    @Nullable
    private final String config_file;

    @SerializedName("content_source")
    private final int contentSource;

    @NotNull
    private final String display_name;
    private final int download_count;

    @NotNull
    private final String file_hash;

    @Nullable
    private final String file_hash_v2;
    private final long file_size;

    @Nullable
    private final Long file_size_v2;

    @NotNull
    private final String icon;

    @Nullable
    private final List<Icon> icon_list;

    @NotNull
    private final String id;

    @Nullable
    private final String introduction;

    @Nullable
    private final String package_name;

    @Nullable
    private final String package_name_hash;

    @Nullable
    private final Integer power_level;
    private final long price;

    @Nullable
    private final String publish_name;
    private final int purchase_status;

    @Nullable
    private final Integer purchase_type;

    @Nullable
    private final String sku_id;

    @Nullable
    private final String spu_id;
    private final int spu_version;
    private final int status;
    private int tabId;

    @NotNull
    private String tabName;

    @Nullable
    private final List<Tag> tag_list;

    @SerializedName("watch_face_version")
    @Nullable
    private final Long version_code;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/data/FaceData$Attribute;", "", "attribute_name", "", "attribute_value_name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAttribute_name", "()Ljava/lang/String;", "getAttribute_value_name", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Attribute {

        @NotNull
        private final String attribute_name;

        @NotNull
        private final String attribute_value_name;

        public Attribute(@NotNull String attribute_name, @NotNull String attribute_value_name) {
            Intrinsics.checkNotNullParameter(attribute_name, "attribute_name");
            Intrinsics.checkNotNullParameter(attribute_value_name, "attribute_value_name");
            this.attribute_name = attribute_name;
            this.attribute_value_name = attribute_value_name;
        }

        public static /* synthetic */ Attribute copy$default(Attribute attribute, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = attribute.attribute_name;
            }
            if ((i & 2) != 0) {
                str2 = attribute.attribute_value_name;
            }
            return attribute.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAttribute_name() {
            return this.attribute_name;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAttribute_value_name() {
            return this.attribute_value_name;
        }

        @NotNull
        public final Attribute copy(@NotNull String attribute_name, @NotNull String attribute_value_name) {
            Intrinsics.checkNotNullParameter(attribute_name, "attribute_name");
            Intrinsics.checkNotNullParameter(attribute_value_name, "attribute_value_name");
            return new Attribute(attribute_name, attribute_value_name);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Attribute)) {
                return false;
            }
            Attribute attribute = (Attribute) other;
            return Intrinsics.areEqual(this.attribute_name, attribute.attribute_name) && Intrinsics.areEqual(this.attribute_value_name, attribute.attribute_value_name);
        }

        @NotNull
        public final String getAttribute_name() {
            return this.attribute_name;
        }

        @NotNull
        public final String getAttribute_value_name() {
            return this.attribute_value_name;
        }

        public int hashCode() {
            return (this.attribute_name.hashCode() * 31) + this.attribute_value_name.hashCode();
        }

        @NotNull
        public String toString() {
            return "Attribute(attribute_name=" + this.attribute_name + ", attribute_value_name=" + this.attribute_value_name + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u000eHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/data/FaceData$BgStyle;", "Landroid/os/Parcelable;", "id", "", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getId", "()Ljava/lang/String;", "getStyle", "describeContents", "", "writeToParcel", "", "dest", "flags", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "CREATOR", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BgStyle implements Parcelable {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String id;

        @NotNull
        private final String style;

        /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.export.data.FaceData$BgStyle$CREATOR, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/data/FaceData$BgStyle$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData$BgStyle;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/watch/face/export/data/FaceData$BgStyle;", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion implements Parcelable.Creator<BgStyle> {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public BgStyle createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BgStyle(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public BgStyle[] newArray(int size) {
                return new BgStyle[size];
            }
        }

        public BgStyle(@NotNull String id, @NotNull String style) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(style, "style");
            this.id = id;
            this.style = style;
        }

        public static /* synthetic */ BgStyle copy$default(BgStyle bgStyle, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bgStyle.id;
            }
            if ((i & 2) != 0) {
                str2 = bgStyle.style;
            }
            return bgStyle.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @NotNull
        public final BgStyle copy(@NotNull String id, @NotNull String style) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(style, "style");
            return new BgStyle(id, style);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BgStyle)) {
                return false;
            }
            BgStyle bgStyle = (BgStyle) other;
            return Intrinsics.areEqual(this.id, bgStyle.id) && Intrinsics.areEqual(this.style, bgStyle.style);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final String getStyle() {
            return this.style;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.style.hashCode();
        }

        @NotNull
        public String toString() {
            return "BgStyle(id=" + this.id + ", style=" + this.style + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.id);
            dest.writeString(this.style);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public BgStyle(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Intrinsics.checkNotNull(string);
            String string2 = parcel.readString();
            Intrinsics.checkNotNull(string2);
            this(string, string2);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u000200J\u0006\u00102\u001a\u000200J\u0006\u00103\u001a\u000200J\u000e\u00108\u001a\u00020\b2\u0006\u00109\u001a\u00020\bJ\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u0016\u0010=\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0016\u0010>\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010 J\t\u0010?\u001a\u00020\bHÆ\u0003J\t\u0010@\u001a\u00020\bHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\u0016\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010*J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\u0016\u0010F\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010G\u001a\u0004\u0018\u00010\bHÆ\u0003JÀ\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010IJ\u0013\u0010J\u001a\u0002002\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010L\u001a\u00020\u0003HÖ\u0001J\t\u0010M\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u001b\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u001b\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0019R\u001b\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b-\u0010\u001dR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0011\u00104\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u00106\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b6\u00105R\u0011\u00107\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b7\u00105¨\u0006N"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/data/FaceData$BleExt;", "", "type", "", "album_picture_type", "album_portrait_type", "bg_colors", "", "", "functions", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData$Functions;", "bottom_background", "upper_background", "icon_style", "", "icon_color", "bg_img", "bg_styles", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData$BgStyle;", "support_element_colour", "element_colours", "firmware_version", "<init>", "(III[Ljava/lang/String;[Lcom/xiaomi/fitness/watch/face/export/data/FaceData$Functions;Ljava/lang/String;Ljava/lang/String;[I[II[Lcom/xiaomi/fitness/watch/face/export/data/FaceData$BgStyle;I[Ljava/lang/String;Ljava/lang/String;)V", "getType", "()I", "getAlbum_picture_type", "getAlbum_portrait_type", "getBg_colors", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getFunctions", "()[Lcom/xiaomi/fitness/watch/face/export/data/FaceData$Functions;", "[Lcom/xiaomi/fitness/watch/face/export/data/FaceData$Functions;", "getBottom_background", "()Ljava/lang/String;", "getUpper_background", "getIcon_style", "()[I", "getIcon_color", "getBg_img", "getBg_styles", "()[Lcom/xiaomi/fitness/watch/face/export/data/FaceData$BgStyle;", "[Lcom/xiaomi/fitness/watch/face/export/data/FaceData$BgStyle;", "getSupport_element_colour", "getElement_colours", "getFirmware_version", "canEdit", "", "hasBgColor", "hasBgImg", "hasSpirit", "isMultiPhotoFace", "()Z", "isPortraitFace", "isLiteralFace", "getStyleUrl", "styleId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(III[Ljava/lang/String;[Lcom/xiaomi/fitness/watch/face/export/data/FaceData$Functions;Ljava/lang/String;Ljava/lang/String;[I[II[Lcom/xiaomi/fitness/watch/face/export/data/FaceData$BgStyle;I[Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/fitness/watch/face/export/data/FaceData$BleExt;", "equals", "other", "hashCode", "toString", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BleExt {
        private final int album_picture_type;
        private final int album_portrait_type;

        @Nullable
        private final String[] bg_colors;
        private final int bg_img;

        @Nullable
        private final BgStyle[] bg_styles;

        @NotNull
        private final String bottom_background;

        @Nullable
        private final String[] element_colours;

        @Nullable
        private final String firmware_version;

        @Nullable
        private final Functions[] functions;

        @Nullable
        private final int[] icon_color;

        @Nullable
        private final int[] icon_style;
        private final int support_element_colour;
        private final int type;

        @NotNull
        private final String upper_background;

        public BleExt(int i, int i2, int i3, @Nullable String[] strArr, @Nullable Functions[] functionsArr, @NotNull String bottom_background, @NotNull String upper_background, @Nullable int[] iArr, @Nullable int[] iArr2, int i4, @Nullable BgStyle[] bgStyleArr, int i5, @Nullable String[] strArr2, @Nullable String str) {
            Intrinsics.checkNotNullParameter(bottom_background, "bottom_background");
            Intrinsics.checkNotNullParameter(upper_background, "upper_background");
            this.type = i;
            this.album_picture_type = i2;
            this.album_portrait_type = i3;
            this.bg_colors = strArr;
            this.functions = functionsArr;
            this.bottom_background = bottom_background;
            this.upper_background = upper_background;
            this.icon_style = iArr;
            this.icon_color = iArr2;
            this.bg_img = i4;
            this.bg_styles = bgStyleArr;
            this.support_element_colour = i5;
            this.element_colours = strArr2;
            this.firmware_version = str;
        }

        public final boolean canEdit() {
            return this.type == 1;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final int getBg_img() {
            return this.bg_img;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final BgStyle[] getBg_styles() {
            return this.bg_styles;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final int getSupport_element_colour() {
            return this.support_element_colour;
        }

        @Nullable
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final String[] getElement_colours() {
            return this.element_colours;
        }

        @Nullable
        /* JADX INFO: renamed from: component14, reason: from getter */
        public final String getFirmware_version() {
            return this.firmware_version;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getAlbum_picture_type() {
            return this.album_picture_type;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getAlbum_portrait_type() {
            return this.album_portrait_type;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String[] getBg_colors() {
            return this.bg_colors;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Functions[] getFunctions() {
            return this.functions;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getBottom_background() {
            return this.bottom_background;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getUpper_background() {
            return this.upper_background;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final int[] getIcon_style() {
            return this.icon_style;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final int[] getIcon_color() {
            return this.icon_color;
        }

        @NotNull
        public final BleExt copy(int type, int album_picture_type, int album_portrait_type, @Nullable String[] bg_colors, @Nullable Functions[] functions, @NotNull String bottom_background, @NotNull String upper_background, @Nullable int[] icon_style, @Nullable int[] icon_color, int bg_img, @Nullable BgStyle[] bg_styles, int support_element_colour, @Nullable String[] element_colours, @Nullable String firmware_version) {
            Intrinsics.checkNotNullParameter(bottom_background, "bottom_background");
            Intrinsics.checkNotNullParameter(upper_background, "upper_background");
            return new BleExt(type, album_picture_type, album_portrait_type, bg_colors, functions, bottom_background, upper_background, icon_style, icon_color, bg_img, bg_styles, support_element_colour, element_colours, firmware_version);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BleExt)) {
                return false;
            }
            BleExt bleExt = (BleExt) other;
            return this.type == bleExt.type && this.album_picture_type == bleExt.album_picture_type && this.album_portrait_type == bleExt.album_portrait_type && Intrinsics.areEqual(this.bg_colors, bleExt.bg_colors) && Intrinsics.areEqual(this.functions, bleExt.functions) && Intrinsics.areEqual(this.bottom_background, bleExt.bottom_background) && Intrinsics.areEqual(this.upper_background, bleExt.upper_background) && Intrinsics.areEqual(this.icon_style, bleExt.icon_style) && Intrinsics.areEqual(this.icon_color, bleExt.icon_color) && this.bg_img == bleExt.bg_img && Intrinsics.areEqual(this.bg_styles, bleExt.bg_styles) && this.support_element_colour == bleExt.support_element_colour && Intrinsics.areEqual(this.element_colours, bleExt.element_colours) && Intrinsics.areEqual(this.firmware_version, bleExt.firmware_version);
        }

        public final int getAlbum_picture_type() {
            return this.album_picture_type;
        }

        public final int getAlbum_portrait_type() {
            return this.album_portrait_type;
        }

        @Nullable
        public final String[] getBg_colors() {
            return this.bg_colors;
        }

        public final int getBg_img() {
            return this.bg_img;
        }

        @Nullable
        public final BgStyle[] getBg_styles() {
            return this.bg_styles;
        }

        @NotNull
        public final String getBottom_background() {
            return this.bottom_background;
        }

        @Nullable
        public final String[] getElement_colours() {
            return this.element_colours;
        }

        @Nullable
        public final String getFirmware_version() {
            return this.firmware_version;
        }

        @Nullable
        public final Functions[] getFunctions() {
            return this.functions;
        }

        @Nullable
        public final int[] getIcon_color() {
            return this.icon_color;
        }

        @Nullable
        public final int[] getIcon_style() {
            return this.icon_style;
        }

        @NotNull
        public final String getStyleUrl(@NotNull String styleId) {
            Intrinsics.checkNotNullParameter(styleId, "styleId");
            BgStyle[] bgStyleArr = this.bg_styles;
            if (bgStyleArr == null) {
                return this.upper_background;
            }
            Iterator it = ArrayIteratorKt.iterator(bgStyleArr);
            while (it.hasNext()) {
                BgStyle bgStyle = (BgStyle) it.next();
                if (Intrinsics.areEqual(styleId, bgStyle.getId())) {
                    return bgStyle.getStyle();
                }
            }
            return this.upper_background;
        }

        public final int getSupport_element_colour() {
            return this.support_element_colour;
        }

        public final int getType() {
            return this.type;
        }

        @NotNull
        public final String getUpper_background() {
            return this.upper_background;
        }

        public final boolean hasBgColor() {
            String[] strArr = this.bg_colors;
            return !(strArr == null || strArr.length == 0);
        }

        public final boolean hasBgImg() {
            return this.bg_img == 1;
        }

        public final boolean hasSpirit() {
            return canEdit() && this.support_element_colour != 0;
        }

        public int hashCode() {
            int iHashCode = ((((Integer.hashCode(this.type) * 31) + Integer.hashCode(this.album_picture_type)) * 31) + Integer.hashCode(this.album_portrait_type)) * 31;
            String[] strArr = this.bg_colors;
            int iHashCode2 = (iHashCode + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
            Functions[] functionsArr = this.functions;
            int iHashCode3 = (((((iHashCode2 + (functionsArr == null ? 0 : Arrays.hashCode(functionsArr))) * 31) + this.bottom_background.hashCode()) * 31) + this.upper_background.hashCode()) * 31;
            int[] iArr = this.icon_style;
            int iHashCode4 = (iHashCode3 + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
            int[] iArr2 = this.icon_color;
            int iHashCode5 = (((iHashCode4 + (iArr2 == null ? 0 : Arrays.hashCode(iArr2))) * 31) + Integer.hashCode(this.bg_img)) * 31;
            BgStyle[] bgStyleArr = this.bg_styles;
            int iHashCode6 = (((iHashCode5 + (bgStyleArr == null ? 0 : Arrays.hashCode(bgStyleArr))) * 31) + Integer.hashCode(this.support_element_colour)) * 31;
            String[] strArr2 = this.element_colours;
            int iHashCode7 = (iHashCode6 + (strArr2 == null ? 0 : Arrays.hashCode(strArr2))) * 31;
            String str = this.firmware_version;
            return iHashCode7 + (str != null ? str.hashCode() : 0);
        }

        public final boolean isLiteralFace() {
            return this.type == 5;
        }

        public final boolean isMultiPhotoFace() {
            return this.album_picture_type == 1;
        }

        public final boolean isPortraitFace() {
            return this.album_portrait_type == 1;
        }

        @NotNull
        public String toString() {
            return "BleExt(type=" + this.type + ", album_picture_type=" + this.album_picture_type + ", album_portrait_type=" + this.album_portrait_type + ", bg_colors=" + Arrays.toString(this.bg_colors) + ", functions=" + Arrays.toString(this.functions) + ", bottom_background=" + this.bottom_background + ", upper_background=" + this.upper_background + ", icon_style=" + Arrays.toString(this.icon_style) + ", icon_color=" + Arrays.toString(this.icon_color) + ", bg_img=" + this.bg_img + ", bg_styles=" + Arrays.toString(this.bg_styles) + ", support_element_colour=" + this.support_element_colour + ", element_colours=" + Arrays.toString(this.element_colours) + ", firmware_version=" + this.firmware_version + ")";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/data/FaceData$Category;", "", "id", "", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Category {

        @NotNull
        private final String id;

        @NotNull
        private final String name;

        public Category(@NotNull String id, @NotNull String name) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            this.id = id;
            this.name = name;
        }

        public static /* synthetic */ Category copy$default(Category category, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = category.id;
            }
            if ((i & 2) != 0) {
                str2 = category.name;
            }
            return category.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final Category copy(@NotNull String id, @NotNull String name) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            return new Category(id, name);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Category)) {
                return false;
            }
            Category category = (Category) other;
            return Intrinsics.areEqual(this.id, category.id) && Intrinsics.areEqual(this.name, category.name);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.name.hashCode();
        }

        @NotNull
        public String toString() {
            return "Category(id=" + this.id + ", name=" + this.name + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0016\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J>\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001b\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/data/FaceData$Functions;", "", "id", "", "x", "", "y", "id_list", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData$IdList;", "<init>", "(IFF[Lcom/xiaomi/fitness/watch/face/export/data/FaceData$IdList;)V", "getId", "()I", "setId", "(I)V", "getX", "()F", "getY", "getId_list", "()[Lcom/xiaomi/fitness/watch/face/export/data/FaceData$IdList;", "[Lcom/xiaomi/fitness/watch/face/export/data/FaceData$IdList;", "component1", "component2", "component3", "component4", "copy", "(IFF[Lcom/xiaomi/fitness/watch/face/export/data/FaceData$IdList;)Lcom/xiaomi/fitness/watch/face/export/data/FaceData$Functions;", "equals", "", "other", "hashCode", "toString", "", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Functions {
        private int id;

        @Nullable
        private final IdList[] id_list;
        private final float x;
        private final float y;

        public Functions(int i, float f, float f2, @Nullable IdList[] idListArr) {
            this.id = i;
            this.x = f;
            this.y = f2;
            this.id_list = idListArr;
        }

        public static /* synthetic */ Functions copy$default(Functions functions, int i, float f, float f2, IdList[] idListArr, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = functions.id;
            }
            if ((i2 & 2) != 0) {
                f = functions.x;
            }
            if ((i2 & 4) != 0) {
                f2 = functions.y;
            }
            if ((i2 & 8) != 0) {
                idListArr = functions.id_list;
            }
            return functions.copy(i, f, f2, idListArr);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getY() {
            return this.y;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final IdList[] getId_list() {
            return this.id_list;
        }

        @NotNull
        public final Functions copy(int id, float x, float y, @Nullable IdList[] id_list) {
            return new Functions(id, x, y, id_list);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Functions)) {
                return false;
            }
            Functions functions = (Functions) other;
            return this.id == functions.id && Float.compare(this.x, functions.x) == 0 && Float.compare(this.y, functions.y) == 0 && Intrinsics.areEqual(this.id_list, functions.id_list);
        }

        public final int getId() {
            return this.id;
        }

        @Nullable
        public final IdList[] getId_list() {
            return this.id_list;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public int hashCode() {
            int iHashCode = ((((Integer.hashCode(this.id) * 31) + Float.hashCode(this.x)) * 31) + Float.hashCode(this.y)) * 31;
            IdList[] idListArr = this.id_list;
            return iHashCode + (idListArr == null ? 0 : Arrays.hashCode(idListArr));
        }

        public final void setId(int i) {
            this.id = i;
        }

        @NotNull
        public String toString() {
            return "Functions(id=" + this.id + ", x=" + this.x + ", y=" + this.y + ", id_list=" + Arrays.toString(this.id_list) + ")";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/data/FaceData$Icon;", "", "icon", "", "aod_icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Ljava/lang/String;", "getAod_icon", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Icon {

        @NotNull
        private final String aod_icon;

        @NotNull
        private final String icon;

        public Icon(@NotNull String icon, @NotNull String aod_icon) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(aod_icon, "aod_icon");
            this.icon = icon;
            this.aod_icon = aod_icon;
        }

        public static /* synthetic */ Icon copy$default(Icon icon, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = icon.icon;
            }
            if ((i & 2) != 0) {
                str2 = icon.aod_icon;
            }
            return icon.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAod_icon() {
            return this.aod_icon;
        }

        @NotNull
        public final Icon copy(@NotNull String icon, @NotNull String aod_icon) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(aod_icon, "aod_icon");
            return new Icon(icon, aod_icon);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) other;
            return Intrinsics.areEqual(this.icon, icon.icon) && Intrinsics.areEqual(this.aod_icon, icon.aod_icon);
        }

        @NotNull
        public final String getAod_icon() {
            return this.aod_icon;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public int hashCode() {
            return (this.icon.hashCode() * 31) + this.aod_icon.hashCode();
        }

        @NotNull
        public String toString() {
            return "Icon(icon=" + this.icon + ", aod_icon=" + this.aod_icon + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/data/FaceData$IdList;", "", "id", "", "<init>", "(I)V", "getId", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IdList {
        private final int id;

        public IdList(int i) {
            this.id = i;
        }

        public static /* synthetic */ IdList copy$default(IdList idList, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = idList.id;
            }
            return idList.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @NotNull
        public final IdList copy(int id) {
            return new IdList(id);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IdList) && this.id == ((IdList) other).id;
        }

        public final int getId() {
            return this.id;
        }

        public int hashCode() {
            return Integer.hashCode(this.id);
        }

        @NotNull
        public String toString() {
            return "IdList(id=" + this.id + ")";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/data/FaceData$Tag;", "", FeedbackConstants.KEY_TAG_ID, "", "tag_name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTag_id", "()Ljava/lang/String;", "getTag_name", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Tag {

        @NotNull
        private final String tag_id;

        @NotNull
        private final String tag_name;

        public Tag(@NotNull String tag_id, @NotNull String tag_name) {
            Intrinsics.checkNotNullParameter(tag_id, "tag_id");
            Intrinsics.checkNotNullParameter(tag_name, "tag_name");
            this.tag_id = tag_id;
            this.tag_name = tag_name;
        }

        public static /* synthetic */ Tag copy$default(Tag tag, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tag.tag_id;
            }
            if ((i & 2) != 0) {
                str2 = tag.tag_name;
            }
            return tag.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTag_id() {
            return this.tag_id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTag_name() {
            return this.tag_name;
        }

        @NotNull
        public final Tag copy(@NotNull String tag_id, @NotNull String tag_name) {
            Intrinsics.checkNotNullParameter(tag_id, "tag_id");
            Intrinsics.checkNotNullParameter(tag_name, "tag_name");
            return new Tag(tag_id, tag_name);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tag)) {
                return false;
            }
            Tag tag = (Tag) other;
            return Intrinsics.areEqual(this.tag_id, tag.tag_id) && Intrinsics.areEqual(this.tag_name, tag.tag_name);
        }

        @NotNull
        public final String getTag_id() {
            return this.tag_id;
        }

        @NotNull
        public final String getTag_name() {
            return this.tag_name;
        }

        public int hashCode() {
            return (this.tag_id.hashCode() * 31) + this.tag_name.hashCode();
        }

        @NotNull
        public String toString() {
            return "Tag(tag_id=" + this.tag_id + ", tag_name=" + this.tag_name + ")";
        }
    }

    public FaceData(@Nullable String str, int i, @Nullable String str2, @Nullable Integer num, int i2, int i3, long j, @Nullable List<Attribute> list, @NotNull String id, @NotNull String display_name, @NotNull String icon, @Nullable String str3, @Nullable Long l, @Nullable Integer num2, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @NotNull String file_hash, long j2, @Nullable String str9, @Nullable Long l2, int i4, @Nullable List<Tag> list2, @Nullable List<Icon> list3, @Nullable Category category, int i5, int i6, @Nullable BleExt bleExt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(display_name, "display_name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(file_hash, "file_hash");
        this.spu_id = str;
        this.spu_version = i;
        this.sku_id = str2;
        this.purchase_type = num;
        this.purchase_status = i2;
        this.status = i3;
        this.price = j;
        this.attribute_list = list;
        this.id = id;
        this.display_name = display_name;
        this.icon = icon;
        this.aod_icon = str3;
        this.version_code = l;
        this.power_level = num2;
        this.package_name = str4;
        this.package_name_hash = str5;
        this.introduction = str6;
        this.publish_name = str7;
        this.config_file = str8;
        this.file_hash = file_hash;
        this.file_size = j2;
        this.file_hash_v2 = str9;
        this.file_size_v2 = l2;
        this.download_count = i4;
        this.tag_list = list2;
        this.icon_list = list3;
        this.category = category;
        this.contentSource = i5;
        this.acq_method = i6;
        this.ble_ext = bleExt;
        this.tabName = "";
    }

    public final boolean buyWithVip() {
        return this.acq_method == 1;
    }

    public final boolean canPurchase() {
        return isPurchaseFace() && this.purchase_status == 0;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSpu_id() {
        return this.spu_id;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDisplay_name() {
        return this.display_name;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getAod_icon() {
        return this.aod_icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Long getVersion_code() {
        return this.version_code;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getPower_level() {
        return this.power_level;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getPackage_name() {
        return this.package_name;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getPackage_name_hash() {
        return this.package_name_hash;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getIntroduction() {
        return this.introduction;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getPublish_name() {
        return this.publish_name;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getConfig_file() {
        return this.config_file;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSpu_version() {
        return this.spu_version;
    }

    @NotNull
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getFile_hash() {
        return this.file_hash;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final long getFile_size() {
        return this.file_size;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getFile_hash_v2() {
        return this.file_hash_v2;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Long getFile_size_v2() {
        return this.file_size_v2;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final int getDownload_count() {
        return this.download_count;
    }

    @Nullable
    public final List<Tag> component25() {
        return this.tag_list;
    }

    @Nullable
    public final List<Icon> component26() {
        return this.icon_list;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Category getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final int getContentSource() {
        return this.contentSource;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final int getAcq_method() {
        return this.acq_method;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSku_id() {
        return this.sku_id;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final BleExt getBle_ext() {
        return this.ble_ext;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getPurchase_type() {
        return this.purchase_type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPurchase_status() {
        return this.purchase_status;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getPrice() {
        return this.price;
    }

    @Nullable
    public final List<Attribute> component8() {
        return this.attribute_list;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final FaceData copy(@Nullable String spu_id, int spu_version, @Nullable String sku_id, @Nullable Integer purchase_type, int purchase_status, int status, long price, @Nullable List<Attribute> attribute_list, @NotNull String id, @NotNull String display_name, @NotNull String icon, @Nullable String aod_icon, @Nullable Long version_code, @Nullable Integer power_level, @Nullable String package_name, @Nullable String package_name_hash, @Nullable String introduction, @Nullable String publish_name, @Nullable String config_file, @NotNull String file_hash, long file_size, @Nullable String file_hash_v2, @Nullable Long file_size_v2, int download_count, @Nullable List<Tag> tag_list, @Nullable List<Icon> icon_list, @Nullable Category category, int contentSource, int acq_method, @Nullable BleExt ble_ext) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(display_name, "display_name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(file_hash, "file_hash");
        return new FaceData(spu_id, spu_version, sku_id, purchase_type, purchase_status, status, price, attribute_list, id, display_name, icon, aod_icon, version_code, power_level, package_name, package_name_hash, introduction, publish_name, config_file, file_hash, file_size, file_hash_v2, file_size_v2, download_count, tag_list, icon_list, category, contentSource, acq_method, ble_ext);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceData)) {
            return false;
        }
        FaceData faceData = (FaceData) other;
        return Intrinsics.areEqual(this.spu_id, faceData.spu_id) && this.spu_version == faceData.spu_version && Intrinsics.areEqual(this.sku_id, faceData.sku_id) && Intrinsics.areEqual(this.purchase_type, faceData.purchase_type) && this.purchase_status == faceData.purchase_status && this.status == faceData.status && this.price == faceData.price && Intrinsics.areEqual(this.attribute_list, faceData.attribute_list) && Intrinsics.areEqual(this.id, faceData.id) && Intrinsics.areEqual(this.display_name, faceData.display_name) && Intrinsics.areEqual(this.icon, faceData.icon) && Intrinsics.areEqual(this.aod_icon, faceData.aod_icon) && Intrinsics.areEqual(this.version_code, faceData.version_code) && Intrinsics.areEqual(this.power_level, faceData.power_level) && Intrinsics.areEqual(this.package_name, faceData.package_name) && Intrinsics.areEqual(this.package_name_hash, faceData.package_name_hash) && Intrinsics.areEqual(this.introduction, faceData.introduction) && Intrinsics.areEqual(this.publish_name, faceData.publish_name) && Intrinsics.areEqual(this.config_file, faceData.config_file) && Intrinsics.areEqual(this.file_hash, faceData.file_hash) && this.file_size == faceData.file_size && Intrinsics.areEqual(this.file_hash_v2, faceData.file_hash_v2) && Intrinsics.areEqual(this.file_size_v2, faceData.file_size_v2) && this.download_count == faceData.download_count && Intrinsics.areEqual(this.tag_list, faceData.tag_list) && Intrinsics.areEqual(this.icon_list, faceData.icon_list) && Intrinsics.areEqual(this.category, faceData.category) && this.contentSource == faceData.contentSource && this.acq_method == faceData.acq_method && Intrinsics.areEqual(this.ble_ext, faceData.ble_ext);
    }

    public final int getAcq_method() {
        return this.acq_method;
    }

    @Nullable
    public final String getAod_icon() {
        return this.aod_icon;
    }

    @Nullable
    public final List<Attribute> getAttribute_list() {
        return this.attribute_list;
    }

    @Nullable
    public final BleExt getBle_ext() {
        return this.ble_ext;
    }

    @Nullable
    public final Category getCategory() {
        return this.category;
    }

    @Nullable
    public final String getConfig_file() {
        return this.config_file;
    }

    public final int getContentSource() {
        return this.contentSource;
    }

    @NotNull
    public final String getDisplay_name() {
        return this.display_name;
    }

    public final int getDownload_count() {
        return this.download_count;
    }

    public final long getFileSize() {
        String did;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(companion);
        if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
            did = "";
        }
        if ((deviceManagerExtKt.getDeviceCapability(did) & 4194304) != 4194304) {
            return this.file_size;
        }
        Long l = this.file_size_v2;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    @NotNull
    public final String getFile_hash() {
        return this.file_hash;
    }

    @Nullable
    public final String getFile_hash_v2() {
        return this.file_hash_v2;
    }

    public final long getFile_size() {
        return this.file_size;
    }

    @Nullable
    public final Long getFile_size_v2() {
        return this.file_size_v2;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final List<Icon> getIcon_list() {
        return this.icon_list;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getIntroduction() {
        return this.introduction;
    }

    @Nullable
    public final String getPackage_name() {
        return this.package_name;
    }

    @Nullable
    public final String getPackage_name_hash() {
        return this.package_name_hash;
    }

    @Nullable
    public final Integer getPower_level() {
        return this.power_level;
    }

    public final long getPrice() {
        return this.price;
    }

    @Nullable
    public final String getPublish_name() {
        return this.publish_name;
    }

    public final int getPurchase_status() {
        return this.purchase_status;
    }

    @Nullable
    public final Integer getPurchase_type() {
        return this.purchase_type;
    }

    @Nullable
    public final String getSku_id() {
        return this.sku_id;
    }

    @Nullable
    public final String getSpu_id() {
        return this.spu_id;
    }

    public final int getSpu_version() {
        return this.spu_version;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getTabId() {
        return this.tabId;
    }

    @NotNull
    public final String getTabName() {
        return this.tabName;
    }

    @Nullable
    public final List<Tag> getTag_list() {
        return this.tag_list;
    }

    @Nullable
    public final Long getVersion_code() {
        return this.version_code;
    }

    public int hashCode() {
        String str = this.spu_id;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.spu_version)) * 31;
        String str2 = this.sku_id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.purchase_type;
        int iHashCode3 = (((((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.purchase_status)) * 31) + Integer.hashCode(this.status)) * 31) + Long.hashCode(this.price)) * 31;
        List<Attribute> list = this.attribute_list;
        int iHashCode4 = (((((((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31) + this.id.hashCode()) * 31) + this.display_name.hashCode()) * 31) + this.icon.hashCode()) * 31;
        String str3 = this.aod_icon;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.version_code;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.power_level;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.package_name;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.package_name_hash;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.introduction;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.publish_name;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.config_file;
        int iHashCode12 = (((((iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.file_hash.hashCode()) * 31) + Long.hashCode(this.file_size)) * 31;
        String str9 = this.file_hash_v2;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l2 = this.file_size_v2;
        int iHashCode14 = (((iHashCode13 + (l2 == null ? 0 : l2.hashCode())) * 31) + Integer.hashCode(this.download_count)) * 31;
        List<Tag> list2 = this.tag_list;
        int iHashCode15 = (iHashCode14 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Icon> list3 = this.icon_list;
        int iHashCode16 = (iHashCode15 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Category category = this.category;
        int iHashCode17 = (((((iHashCode16 + (category == null ? 0 : category.hashCode())) * 31) + Integer.hashCode(this.contentSource)) * 31) + Integer.hashCode(this.acq_method)) * 31;
        BleExt bleExt = this.ble_ext;
        return iHashCode17 + (bleExt != null ? bleExt.hashCode() : 0);
    }

    public final boolean isPurchaseFace() {
        Integer num = this.purchase_type;
        return (num == null || num == null || num.intValue() != 21) ? false : true;
    }

    public final boolean isVip() {
        return isPurchaseFace() && this.purchase_status == 2;
    }

    public final boolean isWhiteListFace() {
        return this.status == 100;
    }

    public final void setTabId(int i) {
        this.tabId = i;
    }

    public final void setTabName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tabName = str;
    }

    @NotNull
    public final m5f toMarket() {
        k5f k5fVar = new k5f();
        k5fVar.c = this.package_name;
        k5fVar.d = this.package_name_hash;
        Long l = this.version_code;
        k5fVar.e = l != null ? l.longValue() : 0L;
        j5f j5fVar = new j5f();
        j5fVar.e = 1;
        j5fVar.r(this.package_name);
        j5fVar.s(this.config_file);
        j5fVar.q(k5fVar);
        m5f m5fVar = new m5f();
        m5fVar.r(j5fVar);
        return m5fVar;
    }

    @NotNull
    public String toString() {
        return "FaceData(spu_id=" + this.spu_id + ", spu_version=" + this.spu_version + ", sku_id=" + this.sku_id + ", purchase_type=" + this.purchase_type + ", purchase_status=" + this.purchase_status + ", status=" + this.status + ", price=" + this.price + ", attribute_list=" + this.attribute_list + ", id=" + this.id + ", display_name=" + this.display_name + ", icon=" + this.icon + ", aod_icon=" + this.aod_icon + ", version_code=" + this.version_code + ", power_level=" + this.power_level + ", package_name=" + this.package_name + ", package_name_hash=" + this.package_name_hash + ", introduction=" + this.introduction + ", publish_name=" + this.publish_name + ", config_file=" + this.config_file + ", file_hash=" + this.file_hash + ", file_size=" + this.file_size + ", file_hash_v2=" + this.file_hash_v2 + ", file_size_v2=" + this.file_size_v2 + ", download_count=" + this.download_count + ", tag_list=" + this.tag_list + ", icon_list=" + this.icon_list + ", category=" + this.category + ", contentSource=" + this.contentSource + ", acq_method=" + this.acq_method + ", ble_ext=" + this.ble_ext + ")";
    }
}
