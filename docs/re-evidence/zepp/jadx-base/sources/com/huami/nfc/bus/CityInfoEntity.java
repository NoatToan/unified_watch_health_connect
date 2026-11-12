package com.huami.nfc.bus;

import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import com.loc.z;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0003\b\u008a\u0001\b\u0086\b\u0018\u00002\u00020\u0001Bå\u0002\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\u0006\u0010-\u001a\u00020\u0002\u0012\u0006\u0010.\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020\u0002\u0012\u0006\u00100\u001a\u00020\u0002\u0012\u0006\u00101\u001a\u00020\u0002\u0012\u0006\u00102\u001a\u00020\u0002\u0012\u0006\u00103\u001a\u00020\u0002\u0012\u0006\u00104\u001a\u00020\f\u0012\b\b\u0002\u00105\u001a\u00020\u000e\u0012\b\u00106\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u00107\u001a\u00020\u0002\u0012\b\u00108\u001a\u0004\u0018\u00010\u0002\u0012\b\u00109\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010=\u001a\u00020\u0017\u0012\b\u0010>\u001a\u0004\u0018\u00010\f\u0012\b\u0010?\u001a\u0004\u0018\u00010\f\u0012\b\u0010@\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010I\u001a\u0004\u0018\u00010\f\u0012\b\u0010J\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f¢\u0006\u0006\b§\u0001\u0010¨\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0017HÆ\u0003J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001fHÆ\u0003J\u0012\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010\u001aJ\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010\u001aJ\u0012\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b)\u0010\u001aJ\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001fHÆ\u0003J\u009a\u0003\u0010M\u001a\u00020\u00002\b\b\u0002\u0010+\u001a\u00020\u00022\b\b\u0002\u0010,\u001a\u00020\u00022\b\b\u0002\u0010-\u001a\u00020\u00022\b\b\u0002\u0010.\u001a\u00020\u00022\b\b\u0002\u0010/\u001a\u00020\u00022\b\b\u0002\u00100\u001a\u00020\u00022\b\b\u0002\u00101\u001a\u00020\u00022\b\b\u0002\u00102\u001a\u00020\u00022\b\b\u0002\u00103\u001a\u00020\u00022\b\b\u0002\u00104\u001a\u00020\f2\b\b\u0002\u00105\u001a\u00020\u000e2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u00107\u001a\u00020\u00022\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010=\u001a\u00020\u00172\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001fHÆ\u0001¢\u0006\u0004\bM\u0010NJ\t\u0010O\u001a\u00020\u0002HÖ\u0001J\t\u0010P\u001a\u00020\u0017HÖ\u0001J\u0013\u0010R\u001a\u00020\f2\b\u0010Q\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010+\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001c\u0010,\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010T\u001a\u0004\bX\u0010VR\u001c\u0010-\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010T\u001a\u0004\bZ\u0010VR\u001c\u0010.\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010T\u001a\u0004\b\\\u0010VR\u001c\u0010/\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010T\u001a\u0004\b^\u0010VR\u001c\u00100\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010T\u001a\u0004\b`\u0010VR\u001c\u00101\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010T\u001a\u0004\bb\u0010VR\u001c\u00102\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010T\u001a\u0004\bd\u0010VR\u001c\u00103\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\be\u0010T\u001a\u0004\bf\u0010VR\u001c\u00104\u001a\u00020\f8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u001c\u00105\u001a\u00020\u000e8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u001e\u00106\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bo\u0010T\u001a\u0004\bp\u0010VR\u001c\u00107\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bq\u0010T\u001a\u0004\br\u0010VR\u001e\u00108\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bs\u0010T\u001a\u0004\bt\u0010VR\u001e\u00109\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bu\u0010T\u001a\u0004\bv\u0010VR\u001e\u0010:\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bw\u0010T\u001a\u0004\bx\u0010VR\u001e\u0010;\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\by\u0010T\u001a\u0004\bz\u0010VR\u001e\u0010<\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b{\u0010T\u001a\u0004\b|\u0010VR\u001d\u0010=\u001a\u00020\u00178\u0006@\u0007X\u0087\u0004¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R!\u0010>\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010\u001aR!\u0010?\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0084\u0001\u0010\u0082\u0001\u001a\u0005\b\u0085\u0001\u0010\u001aR!\u0010@\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010\u001dR \u0010A\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u000e\n\u0006\b\u0089\u0001\u0010\u0082\u0001\u001a\u0004\bA\u0010\u001aR0\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R!\u0010C\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0090\u0001\u0010\u0082\u0001\u001a\u0005\b\u0091\u0001\u0010\u001aR \u0010D\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010T\u001a\u0005\b\u0093\u0001\u0010VR \u0010E\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010T\u001a\u0005\b\u0095\u0001\u0010VR \u0010F\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010T\u001a\u0005\b\u0097\u0001\u0010VR \u0010G\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010T\u001a\u0005\b\u0099\u0001\u0010VR \u0010H\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010T\u001a\u0005\b\u009b\u0001\u0010VR!\u0010I\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u009c\u0001\u0010\u0082\u0001\u001a\u0005\b\u009d\u0001\u0010\u001aR!\u0010J\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u009e\u0001\u0010\u0082\u0001\u001a\u0005\b\u009f\u0001\u0010\u001aR)\u0010K\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0006\b \u0001\u0010\u0082\u0001\u001a\u0005\b¡\u0001\u0010\u001a\"\u0006\b¢\u0001\u0010£\u0001R0\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b¤\u0001\u0010\u008b\u0001\u001a\u0006\b¥\u0001\u0010\u008d\u0001\"\u0006\b¦\u0001\u0010\u008f\u0001¨\u0006©\u0001"}, d2 = {"Lcom/huami/nfc/bus/CityInfoEntity;", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "", "component10", "", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "", "component19", "component20", "()Ljava/lang/Boolean;", "component21", "component22", "()Ljava/lang/Long;", "component23", "", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "cityName", "cardName", "appCode", "aid", "busCode", "cardCode", "serviceScope", "openedImgUrl", "unopenedImgUrl", "hasSubCity", "openTime", "cardId", "status", "orderId", "xiaomiCityCode", "fetchApduMode", "xmCardStatus", "xmActionToken", "type", "shiftEnable", "shiftOrderNo", StatEvent.SPORT_TP_VALUE_BALANCE, "isRecommend", "paymentChannelList", "openFeeRefundApplyFlg", "packageName", "appName", "redirectTo", "serviceContact", "parentAppCode", "xmReturnCardFlg", "xmReturnFeeFlg", "refundEnable", "refundAccountCollectModes", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)Lcom/huami/nfc/bus/CityInfoEntity;", "toString", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getCityName", "()Ljava/lang/String;", "b", "getCardName", "c", "getAppCode", GoogleApiAvailabilityLight.a, "getAid", "e", "getBusCode", "f", "getCardCode", "g", "getServiceScope", "h", "getOpenedImgUrl", "i", "getUnopenedImgUrl", z.j, "Z", "getHasSubCity", "()Z", hl.k, "J", "getOpenTime", "()J", "l", "getCardId", "m", "getStatus", GoogleApiAvailabilityLight.b, "getOrderId", "o", "getXiaomiCityCode", b.r, "getFetchApduMode", DTransferConstants.SEARCH_KEY, "getXmCardStatus", "r", "getXmActionToken", SOAP.XMLNS, LogUtil.I, "getType", "()I", "t", "Ljava/lang/Boolean;", "getShiftEnable", "u", "getShiftOrderNo", "v", "Ljava/lang/Long;", "getBalance", "w", "x", "Ljava/util/List;", "getPaymentChannelList", "()Ljava/util/List;", "setPaymentChannelList", "(Ljava/util/List;)V", "y", "getOpenFeeRefundApplyFlg", "z", "getPackageName", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getAppName", "B", "getRedirectTo", "C", "getServiceContact", LogUtil.D, "getParentAppCode", "E", "getXmReturnCardFlg", "F", "getXmReturnFeeFlg", "G", "getRefundEnable", "setRefundEnable", "(Ljava/lang/Boolean;)V", "H", "getRefundAccountCollectModes", "setRefundAccountCollectModes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CityInfoEntity {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
    @SerializedName("appName")
    @Nullable
    private final String appName;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
    @SerializedName("redirectTo")
    @Nullable
    private final String redirectTo;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
    @SerializedName("serviceContact")
    @Nullable
    private final String serviceContact;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata and from toString */
    @SerializedName("parentAppCode")
    @Nullable
    private final String parentAppCode;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata and from toString */
    @SerializedName("xmReturnCardFlg")
    @Nullable
    private final Boolean xmReturnCardFlg;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata and from toString */
    @SerializedName("xmReturnFeeFlg")
    @Nullable
    private final Boolean xmReturnFeeFlg;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata and from toString */
    @SerializedName("refundEnable")
    @Nullable
    private Boolean refundEnable;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata and from toString */
    @SerializedName("refundAccountCollectModes")
    @Nullable
    private List<String> refundAccountCollectModes;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("cityName")
    @NotNull
    private final String cityName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("cardName")
    @NotNull
    private final String cardName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("appCode")
    @NotNull
    private final String appCode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("aid")
    @NotNull
    private final String aid;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("busCode")
    @NotNull
    private final String busCode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("cardCode")
    @NotNull
    private final String cardCode;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("serviceScope")
    @NotNull
    private final String serviceScope;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName("openedImgUrl")
    @NotNull
    private final String openedImgUrl;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @SerializedName("unopenedImgUrl")
    @NotNull
    private final String unopenedImgUrl;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @SerializedName("hasSubCity")
    private final boolean hasSubCity;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @SerializedName("openTime")
    private final long openTime;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @SerializedName("cardId")
    @Nullable
    private final String cardId;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @SerializedName("cardStatus")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    @SerializedName("orderId")
    @Nullable
    private final String orderId;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @SerializedName("xiaomiCardName")
    @Nullable
    private final String xiaomiCityCode;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    @SerializedName("fetchApduMode")
    @Nullable
    private final String fetchApduMode;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
    @SerializedName("xmCardStatus")
    @Nullable
    private final String xmCardStatus;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
    @SerializedName("xmActionToken")
    @Nullable
    private final String xmActionToken;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata and from toString */
    @SerializedName("cardGroup")
    private final int type;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata and from toString */
    @SerializedName("shiftEnable")
    @Nullable
    private final Boolean shiftEnable;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata and from toString */
    @SerializedName("shiftOrderNo")
    @Nullable
    private final Boolean shiftOrderNo;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata and from toString */
    @SerializedName(StatEvent.SPORT_TP_VALUE_BALANCE)
    @Nullable
    private final Long balance;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata and from toString */
    @SerializedName(WatchFaceDetailActivity.FROM_RECOMMEND)
    @Nullable
    private final Boolean isRecommend;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata and from toString */
    @SerializedName("paymentChannels")
    @Nullable
    private List<String> paymentChannelList;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata and from toString */
    @SerializedName("openFeeRefundApplyFlg")
    @Nullable
    private final Boolean openFeeRefundApplyFlg;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata and from toString */
    @SerializedName("packageName")
    @Nullable
    private final String packageName;

    public CityInfoEntity(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, boolean z, long j, @Nullable String str10, @NotNull String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, int i, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Long l, @Nullable Boolean bool3, @Nullable List<String> list, @Nullable Boolean bool4, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Boolean bool7, @Nullable List<String> list2) {
        this.cityName = str;
        this.cardName = str2;
        this.appCode = str3;
        this.aid = str4;
        this.busCode = str5;
        this.cardCode = str6;
        this.serviceScope = str7;
        this.openedImgUrl = str8;
        this.unopenedImgUrl = str9;
        this.hasSubCity = z;
        this.openTime = j;
        this.cardId = str10;
        this.status = str11;
        this.orderId = str12;
        this.xiaomiCityCode = str13;
        this.fetchApduMode = str14;
        this.xmCardStatus = str15;
        this.xmActionToken = str16;
        this.type = i;
        this.shiftEnable = bool;
        this.shiftOrderNo = bool2;
        this.balance = l;
        this.isRecommend = bool3;
        this.paymentChannelList = list;
        this.openFeeRefundApplyFlg = bool4;
        this.packageName = str17;
        this.appName = str18;
        this.redirectTo = str19;
        this.serviceContact = str20;
        this.parentAppCode = str21;
        this.xmReturnCardFlg = bool5;
        this.xmReturnFeeFlg = bool6;
        this.refundEnable = bool7;
        this.refundAccountCollectModes = list2;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCityName() {
        return this.cityName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getHasSubCity() {
        return this.hasSubCity;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getOpenTime() {
        return this.openTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getXiaomiCityCode() {
        return this.xiaomiCityCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getFetchApduMode() {
        return this.fetchApduMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getXmCardStatus() {
        return this.xmCardStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getXmActionToken() {
        return this.xmActionToken;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Boolean getShiftEnable() {
        return this.shiftEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Boolean getShiftOrderNo() {
        return this.shiftOrderNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Long getBalance() {
        return this.balance;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Boolean getIsRecommend() {
        return this.isRecommend;
    }

    @Nullable
    public final List<String> component24() {
        return this.paymentChannelList;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Boolean getOpenFeeRefundApplyFlg() {
        return this.openFeeRefundApplyFlg;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getRedirectTo() {
        return this.redirectTo;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getServiceContact() {
        return this.serviceContact;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppCode() {
        return this.appCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getParentAppCode() {
        return this.parentAppCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final Boolean getXmReturnCardFlg() {
        return this.xmReturnCardFlg;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final Boolean getXmReturnFeeFlg() {
        return this.xmReturnFeeFlg;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final Boolean getRefundEnable() {
        return this.refundEnable;
    }

    @Nullable
    public final List<String> component34() {
        return this.refundAccountCollectModes;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAid() {
        return this.aid;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBusCode() {
        return this.busCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCardCode() {
        return this.cardCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getServiceScope() {
        return this.serviceScope;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getOpenedImgUrl() {
        return this.openedImgUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getUnopenedImgUrl() {
        return this.unopenedImgUrl;
    }

    @NotNull
    public final CityInfoEntity copy(@NotNull String cityName, @NotNull String cardName, @NotNull String appCode, @NotNull String aid, @NotNull String busCode, @NotNull String cardCode, @NotNull String serviceScope, @NotNull String openedImgUrl, @NotNull String unopenedImgUrl, boolean hasSubCity, long openTime, @Nullable String cardId, @NotNull String status, @Nullable String orderId, @Nullable String xiaomiCityCode, @Nullable String fetchApduMode, @Nullable String xmCardStatus, @Nullable String xmActionToken, int type, @Nullable Boolean shiftEnable, @Nullable Boolean shiftOrderNo, @Nullable Long balance, @Nullable Boolean isRecommend, @Nullable List<String> paymentChannelList, @Nullable Boolean openFeeRefundApplyFlg, @Nullable String packageName, @Nullable String appName, @Nullable String redirectTo, @Nullable String serviceContact, @Nullable String parentAppCode, @Nullable Boolean xmReturnCardFlg, @Nullable Boolean xmReturnFeeFlg, @Nullable Boolean refundEnable, @Nullable List<String> refundAccountCollectModes) {
        return new CityInfoEntity(cityName, cardName, appCode, aid, busCode, cardCode, serviceScope, openedImgUrl, unopenedImgUrl, hasSubCity, openTime, cardId, status, orderId, xiaomiCityCode, fetchApduMode, xmCardStatus, xmActionToken, type, shiftEnable, shiftOrderNo, balance, isRecommend, paymentChannelList, openFeeRefundApplyFlg, packageName, appName, redirectTo, serviceContact, parentAppCode, xmReturnCardFlg, xmReturnFeeFlg, refundEnable, refundAccountCollectModes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CityInfoEntity)) {
            return false;
        }
        CityInfoEntity cityInfoEntity = (CityInfoEntity) other;
        return Intrinsics.areEqual(this.cityName, cityInfoEntity.cityName) && Intrinsics.areEqual(this.cardName, cityInfoEntity.cardName) && Intrinsics.areEqual(this.appCode, cityInfoEntity.appCode) && Intrinsics.areEqual(this.aid, cityInfoEntity.aid) && Intrinsics.areEqual(this.busCode, cityInfoEntity.busCode) && Intrinsics.areEqual(this.cardCode, cityInfoEntity.cardCode) && Intrinsics.areEqual(this.serviceScope, cityInfoEntity.serviceScope) && Intrinsics.areEqual(this.openedImgUrl, cityInfoEntity.openedImgUrl) && Intrinsics.areEqual(this.unopenedImgUrl, cityInfoEntity.unopenedImgUrl) && this.hasSubCity == cityInfoEntity.hasSubCity && this.openTime == cityInfoEntity.openTime && Intrinsics.areEqual(this.cardId, cityInfoEntity.cardId) && Intrinsics.areEqual(this.status, cityInfoEntity.status) && Intrinsics.areEqual(this.orderId, cityInfoEntity.orderId) && Intrinsics.areEqual(this.xiaomiCityCode, cityInfoEntity.xiaomiCityCode) && Intrinsics.areEqual(this.fetchApduMode, cityInfoEntity.fetchApduMode) && Intrinsics.areEqual(this.xmCardStatus, cityInfoEntity.xmCardStatus) && Intrinsics.areEqual(this.xmActionToken, cityInfoEntity.xmActionToken) && this.type == cityInfoEntity.type && Intrinsics.areEqual(this.shiftEnable, cityInfoEntity.shiftEnable) && Intrinsics.areEqual(this.shiftOrderNo, cityInfoEntity.shiftOrderNo) && Intrinsics.areEqual(this.balance, cityInfoEntity.balance) && Intrinsics.areEqual(this.isRecommend, cityInfoEntity.isRecommend) && Intrinsics.areEqual(this.paymentChannelList, cityInfoEntity.paymentChannelList) && Intrinsics.areEqual(this.openFeeRefundApplyFlg, cityInfoEntity.openFeeRefundApplyFlg) && Intrinsics.areEqual(this.packageName, cityInfoEntity.packageName) && Intrinsics.areEqual(this.appName, cityInfoEntity.appName) && Intrinsics.areEqual(this.redirectTo, cityInfoEntity.redirectTo) && Intrinsics.areEqual(this.serviceContact, cityInfoEntity.serviceContact) && Intrinsics.areEqual(this.parentAppCode, cityInfoEntity.parentAppCode) && Intrinsics.areEqual(this.xmReturnCardFlg, cityInfoEntity.xmReturnCardFlg) && Intrinsics.areEqual(this.xmReturnFeeFlg, cityInfoEntity.xmReturnFeeFlg) && Intrinsics.areEqual(this.refundEnable, cityInfoEntity.refundEnable) && Intrinsics.areEqual(this.refundAccountCollectModes, cityInfoEntity.refundAccountCollectModes);
    }

    @NotNull
    public final String getAid() {
        return this.aid;
    }

    @NotNull
    public final String getAppCode() {
        return this.appCode;
    }

    @Nullable
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    public final Long getBalance() {
        return this.balance;
    }

    @NotNull
    public final String getBusCode() {
        return this.busCode;
    }

    @NotNull
    public final String getCardCode() {
        return this.cardCode;
    }

    @Nullable
    public final String getCardId() {
        return this.cardId;
    }

    @NotNull
    public final String getCardName() {
        return this.cardName;
    }

    @NotNull
    public final String getCityName() {
        return this.cityName;
    }

    @Nullable
    public final String getFetchApduMode() {
        return this.fetchApduMode;
    }

    public final boolean getHasSubCity() {
        return this.hasSubCity;
    }

    @Nullable
    public final Boolean getOpenFeeRefundApplyFlg() {
        return this.openFeeRefundApplyFlg;
    }

    public final long getOpenTime() {
        return this.openTime;
    }

    @NotNull
    public final String getOpenedImgUrl() {
        return this.openedImgUrl;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    public final String getParentAppCode() {
        return this.parentAppCode;
    }

    @Nullable
    public final List<String> getPaymentChannelList() {
        return this.paymentChannelList;
    }

    @Nullable
    public final String getRedirectTo() {
        return this.redirectTo;
    }

    @Nullable
    public final List<String> getRefundAccountCollectModes() {
        return this.refundAccountCollectModes;
    }

    @Nullable
    public final Boolean getRefundEnable() {
        return this.refundEnable;
    }

    @Nullable
    public final String getServiceContact() {
        return this.serviceContact;
    }

    @NotNull
    public final String getServiceScope() {
        return this.serviceScope;
    }

    @Nullable
    public final Boolean getShiftEnable() {
        return this.shiftEnable;
    }

    @Nullable
    public final Boolean getShiftOrderNo() {
        return this.shiftOrderNo;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final String getUnopenedImgUrl() {
        return this.unopenedImgUrl;
    }

    @Nullable
    public final String getXiaomiCityCode() {
        return this.xiaomiCityCode;
    }

    @Nullable
    public final String getXmActionToken() {
        return this.xmActionToken;
    }

    @Nullable
    public final String getXmCardStatus() {
        return this.xmCardStatus;
    }

    @Nullable
    public final Boolean getXmReturnCardFlg() {
        return this.xmReturnCardFlg;
    }

    @Nullable
    public final Boolean getXmReturnFeeFlg() {
        return this.xmReturnFeeFlg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v104 */
    /* JADX WARN: Type inference failed for: r1v105 */
    /* JADX WARN: Type inference failed for: r1v17, types: [int] */
    public int hashCode() {
        int iHashCode = ((((((((((((((((this.cityName.hashCode() * 31) + this.cardName.hashCode()) * 31) + this.appCode.hashCode()) * 31) + this.aid.hashCode()) * 31) + this.busCode.hashCode()) * 31) + this.cardCode.hashCode()) * 31) + this.serviceScope.hashCode()) * 31) + this.openedImgUrl.hashCode()) * 31) + this.unopenedImgUrl.hashCode()) * 31;
        boolean z = this.hasSubCity;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iA = (((iHashCode + r1) * 31) + defpackage.b.a(this.openTime)) * 31;
        String str = this.cardId;
        int iHashCode2 = (((iA + (str == null ? 0 : str.hashCode())) * 31) + this.status.hashCode()) * 31;
        String str2 = this.orderId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.xiaomiCityCode;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fetchApduMode;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.xmCardStatus;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.xmActionToken;
        int iHashCode7 = (((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.type) * 31;
        Boolean bool = this.shiftEnable;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.shiftOrderNo;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l = this.balance;
        int iHashCode10 = (iHashCode9 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool3 = this.isRecommend;
        int iHashCode11 = (iHashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<String> list = this.paymentChannelList;
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool4 = this.openFeeRefundApplyFlg;
        int iHashCode13 = (iHashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str7 = this.packageName;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.appName;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.redirectTo;
        int iHashCode16 = (iHashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.serviceContact;
        int iHashCode17 = (iHashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.parentAppCode;
        int iHashCode18 = (iHashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool5 = this.xmReturnCardFlg;
        int iHashCode19 = (iHashCode18 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.xmReturnFeeFlg;
        int iHashCode20 = (iHashCode19 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.refundEnable;
        int iHashCode21 = (iHashCode20 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        List<String> list2 = this.refundAccountCollectModes;
        return iHashCode21 + (list2 != null ? list2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isRecommend() {
        return this.isRecommend;
    }

    public final void setPaymentChannelList(@Nullable List<String> list) {
        this.paymentChannelList = list;
    }

    public final void setRefundAccountCollectModes(@Nullable List<String> list) {
        this.refundAccountCollectModes = list;
    }

    public final void setRefundEnable(@Nullable Boolean bool) {
        this.refundEnable = bool;
    }

    @NotNull
    public String toString() {
        return "CityInfoEntity(cityName=" + this.cityName + ", cardName=" + this.cardName + ", appCode=" + this.appCode + ", aid=" + this.aid + ", busCode=" + this.busCode + ", cardCode=" + this.cardCode + ", serviceScope=" + this.serviceScope + ", openedImgUrl=" + this.openedImgUrl + ", unopenedImgUrl=" + this.unopenedImgUrl + ", hasSubCity=" + this.hasSubCity + ", openTime=" + this.openTime + ", cardId=" + ((Object) this.cardId) + ", status=" + this.status + ", orderId=" + ((Object) this.orderId) + ", xiaomiCityCode=" + ((Object) this.xiaomiCityCode) + ", fetchApduMode=" + ((Object) this.fetchApduMode) + ", xmCardStatus=" + ((Object) this.xmCardStatus) + ", xmActionToken=" + ((Object) this.xmActionToken) + ", type=" + this.type + ", shiftEnable=" + this.shiftEnable + ", shiftOrderNo=" + this.shiftOrderNo + ", balance=" + this.balance + ", isRecommend=" + this.isRecommend + ", paymentChannelList=" + this.paymentChannelList + ", openFeeRefundApplyFlg=" + this.openFeeRefundApplyFlg + ", packageName=" + ((Object) this.packageName) + ", appName=" + ((Object) this.appName) + ", redirectTo=" + ((Object) this.redirectTo) + ", serviceContact=" + ((Object) this.serviceContact) + ", parentAppCode=" + ((Object) this.parentAppCode) + ", xmReturnCardFlg=" + this.xmReturnCardFlg + ", xmReturnFeeFlg=" + this.xmReturnFeeFlg + ", refundEnable=" + this.refundEnable + ", refundAccountCollectModes=" + this.refundAccountCollectModes + ')';
    }

    public /* synthetic */ CityInfoEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, long j, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i, Boolean bool, Boolean bool2, Long l, Boolean bool3, List list, Boolean bool4, String str17, String str18, String str19, String str20, String str21, Boolean bool5, Boolean bool6, Boolean bool7, List list2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, z, (i2 & 1024) != 0 ? 0L : j, str10, str11, str12, str13, str14, str15, str16, i, bool, bool2, l, (4194304 & i2) != 0 ? Boolean.FALSE : bool3, (8388608 & i2) != 0 ? null : list, (16777216 & i2) != 0 ? Boolean.FALSE : bool4, (33554432 & i2) != 0 ? null : str17, (67108864 & i2) != 0 ? null : str18, (134217728 & i2) != 0 ? null : str19, (268435456 & i2) != 0 ? null : str20, (i2 & 536870912) != 0 ? null : str21, bool5, bool6, (i3 & 1) != 0 ? null : bool7, (i3 & 2) != 0 ? null : list2);
    }
}
