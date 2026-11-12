package com.huami.pai.vo;

import androidx.exifinterface.media.ExifInterface;
import androidx.room.Entity;
import com.amap.api.mapcore.util.hl;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.pai.ext.MathExKt;
import com.loc.z;
import com.xiaomi.hm.health.Constant;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Entity(primaryKeys = {"userId", "timestamp"})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0003\b¹\u0001\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ß\u00012\u00020\u0001:\u0004à\u0001ß\u0001B½\u0002\u0012\u0006\u00100\u001a\u00020\f\u0012\b\b\u0002\u00101\u001a\u00020\f\u0012\b\b\u0002\u00102\u001a\u00020\f\u0012\b\b\u0002\u00103\u001a\u00020\u0011\u0012\b\b\u0002\u00104\u001a\u00020\u0011\u0012\b\b\u0002\u00105\u001a\u00020\u0011\u0012\b\b\u0002\u00106\u001a\u00020\u0015\u0012\b\b\u0002\u00107\u001a\u00020\u0015\u0012\b\b\u0002\u00108\u001a\u00020\u0015\u0012\b\b\u0002\u00109\u001a\u00020\u0011\u0012\b\b\u0002\u0010:\u001a\u00020\u0011\u0012\b\b\u0002\u0010;\u001a\u00020\u0015\u0012\b\b\u0002\u0010<\u001a\u00020\u0015\u0012\b\b\u0002\u0010=\u001a\u00020\u0015\u0012\b\b\u0002\u0010>\u001a\u00020\u0015\u0012\b\b\u0002\u0010?\u001a\u00020\u0015\u0012\b\b\u0002\u0010@\u001a\u00020\u0015\u0012\b\b\u0002\u0010A\u001a\u00020\u0015\u0012\b\b\u0002\u0010B\u001a\u00020\"\u0012\b\b\u0002\u0010C\u001a\u00020\"\u0012\b\b\u0002\u0010D\u001a\u00020\"\u0012\b\b\u0002\u0010E\u001a\u00020\u0015\u0012\b\b\u0002\u0010F\u001a\u00020\u0015\u0012\b\b\u0002\u0010G\u001a\u00020\"\u0012\b\b\u0002\u0010H\u001a\u00020\u0015\u0012\b\b\u0002\u0010I\u001a\u00020\f\u0012\b\b\u0002\u0010J\u001a\u00020\f\u0012\b\b\u0002\u0010K\u001a\u00020\f\u0012\b\b\u0002\u0010L\u001a\u00020\f\u0012\b\b\u0002\u0010M\u001a\u00020\f\u0012\b\b\u0002\u0010N\u001a\u00020\n¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001BØ\u0002\b\u0017\u0012\u0007\u0010Û\u0001\u001a\u00020\u0015\u0012\b\u00100\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u00101\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u00102\u001a\u0004\u0018\u00010\f\u0012\b\b\u0001\u00103\u001a\u00020\u0011\u0012\b\b\u0001\u00104\u001a\u00020\u0011\u0012\b\b\u0001\u00105\u001a\u00020\u0011\u0012\b\b\u0001\u00106\u001a\u00020\u0015\u0012\b\b\u0001\u00107\u001a\u00020\u0015\u0012\b\b\u0001\u00108\u001a\u00020\u0015\u0012\b\b\u0001\u00109\u001a\u00020\u0011\u0012\b\b\u0001\u0010:\u001a\u00020\u0011\u0012\b\b\u0001\u0010;\u001a\u00020\u0015\u0012\b\b\u0001\u0010<\u001a\u00020\u0015\u0012\b\b\u0001\u0010=\u001a\u00020\u0015\u0012\b\b\u0001\u0010>\u001a\u00020\u0015\u0012\b\b\u0001\u0010?\u001a\u00020\u0015\u0012\b\b\u0001\u0010@\u001a\u00020\u0015\u0012\b\b\u0001\u0010A\u001a\u00020\u0015\u0012\b\b\u0001\u0010B\u001a\u00020\"\u0012\b\b\u0001\u0010C\u001a\u00020\"\u0012\b\b\u0001\u0010D\u001a\u00020\"\u0012\b\b\u0001\u0010E\u001a\u00020\u0015\u0012\b\b\u0001\u0010F\u001a\u00020\u0015\u0012\b\b\u0001\u0010G\u001a\u00020\"\u0012\b\b\u0001\u0010H\u001a\u00020\u0015\u0012\n\b\u0001\u0010I\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010J\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010K\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010L\u001a\u0004\u0018\u00010\f\u0012\b\u0010M\u001a\u0004\u0018\u00010\f\u0012\n\u0010Ý\u0001\u001a\u0005\u0018\u00010Ü\u0001¢\u0006\u0006\bÙ\u0001\u0010Þ\u0001J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\t\u0010\u000e\u001a\u00020\fHÆ\u0003J\t\u0010\u000f\u001a\u00020\fHÆ\u0003J\t\u0010\u0010\u001a\u00020\fHÆ\u0003J\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0011HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0011HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0015HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0015HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0015HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0011HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0011HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0015HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0015HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0015HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0015HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0015HÆ\u0003J\t\u0010 \u001a\u00020\u0015HÆ\u0003J\t\u0010!\u001a\u00020\u0015HÆ\u0003J\t\u0010#\u001a\u00020\"HÆ\u0003J\t\u0010$\u001a\u00020\"HÆ\u0003J\t\u0010%\u001a\u00020\"HÆ\u0003J\t\u0010&\u001a\u00020\u0015HÆ\u0003J\t\u0010'\u001a\u00020\u0015HÆ\u0003J\t\u0010(\u001a\u00020\"HÆ\u0003J\t\u0010)\u001a\u00020\u0015HÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003J\t\u0010-\u001a\u00020\fHÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J¿\u0002\u0010O\u001a\u00020\u00002\b\b\u0002\u00100\u001a\u00020\f2\b\b\u0002\u00101\u001a\u00020\f2\b\b\u0002\u00102\u001a\u00020\f2\b\b\u0002\u00103\u001a\u00020\u00112\b\b\u0002\u00104\u001a\u00020\u00112\b\b\u0002\u00105\u001a\u00020\u00112\b\b\u0002\u00106\u001a\u00020\u00152\b\b\u0002\u00107\u001a\u00020\u00152\b\b\u0002\u00108\u001a\u00020\u00152\b\b\u0002\u00109\u001a\u00020\u00112\b\b\u0002\u0010:\u001a\u00020\u00112\b\b\u0002\u0010;\u001a\u00020\u00152\b\b\u0002\u0010<\u001a\u00020\u00152\b\b\u0002\u0010=\u001a\u00020\u00152\b\b\u0002\u0010>\u001a\u00020\u00152\b\b\u0002\u0010?\u001a\u00020\u00152\b\b\u0002\u0010@\u001a\u00020\u00152\b\b\u0002\u0010A\u001a\u00020\u00152\b\b\u0002\u0010B\u001a\u00020\"2\b\b\u0002\u0010C\u001a\u00020\"2\b\b\u0002\u0010D\u001a\u00020\"2\b\b\u0002\u0010E\u001a\u00020\u00152\b\b\u0002\u0010F\u001a\u00020\u00152\b\b\u0002\u0010G\u001a\u00020\"2\b\b\u0002\u0010H\u001a\u00020\u00152\b\b\u0002\u0010I\u001a\u00020\f2\b\b\u0002\u0010J\u001a\u00020\f2\b\b\u0002\u0010K\u001a\u00020\f2\b\b\u0002\u0010L\u001a\u00020\f2\b\b\u0002\u0010M\u001a\u00020\f2\b\b\u0002\u0010N\u001a\u00020\nHÆ\u0001J\t\u0010P\u001a\u00020\u0015HÖ\u0001R\"\u00100\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR(\u00101\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bW\u0010R\u0012\u0004\bZ\u0010[\u001a\u0004\bX\u0010T\"\u0004\bY\u0010VR(\u00102\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\\\u0010R\u0012\u0004\b_\u0010[\u001a\u0004\b]\u0010T\"\u0004\b^\u0010VR(\u00103\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b`\u0010a\u0012\u0004\bf\u0010[\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR(\u00104\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bg\u0010a\u0012\u0004\bj\u0010[\u001a\u0004\bh\u0010c\"\u0004\bi\u0010eR(\u00105\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bk\u0010a\u0012\u0004\bn\u0010[\u001a\u0004\bl\u0010c\"\u0004\bm\u0010eR(\u00106\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bo\u0010p\u0012\u0004\bu\u0010[\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR(\u00107\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bv\u0010p\u0012\u0004\by\u0010[\u001a\u0004\bw\u0010r\"\u0004\bx\u0010tR(\u00108\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bz\u0010p\u0012\u0004\b}\u0010[\u001a\u0004\b{\u0010r\"\u0004\b|\u0010tR*\u00109\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u001a\n\u0004\b~\u0010a\u0012\u0005\b\u0081\u0001\u0010[\u001a\u0004\b\u007f\u0010c\"\u0005\b\u0080\u0001\u0010eR,\u0010:\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0005\b\u0082\u0001\u0010a\u0012\u0005\b\u0085\u0001\u0010[\u001a\u0005\b\u0083\u0001\u0010c\"\u0005\b\u0084\u0001\u0010eR,\u0010;\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0005\b\u0086\u0001\u0010p\u0012\u0005\b\u0089\u0001\u0010[\u001a\u0005\b\u0087\u0001\u0010r\"\u0005\b\u0088\u0001\u0010tR,\u0010<\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0005\b\u008a\u0001\u0010p\u0012\u0005\b\u008d\u0001\u0010[\u001a\u0005\b\u008b\u0001\u0010r\"\u0005\b\u008c\u0001\u0010tR,\u0010=\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0005\b\u008e\u0001\u0010p\u0012\u0005\b\u0091\u0001\u0010[\u001a\u0005\b\u008f\u0001\u0010r\"\u0005\b\u0090\u0001\u0010tR,\u0010>\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0005\b\u0092\u0001\u0010p\u0012\u0005\b\u0095\u0001\u0010[\u001a\u0005\b\u0093\u0001\u0010r\"\u0005\b\u0094\u0001\u0010tR,\u0010?\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0005\b\u0096\u0001\u0010p\u0012\u0005\b\u0099\u0001\u0010[\u001a\u0005\b\u0097\u0001\u0010r\"\u0005\b\u0098\u0001\u0010tR,\u0010@\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0005\b\u009a\u0001\u0010p\u0012\u0005\b\u009d\u0001\u0010[\u001a\u0005\b\u009b\u0001\u0010r\"\u0005\b\u009c\u0001\u0010tR,\u0010A\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0005\b\u009e\u0001\u0010p\u0012\u0005\b¡\u0001\u0010[\u001a\u0005\b\u009f\u0001\u0010r\"\u0005\b \u0001\u0010tR/\u0010B\u001a\u00020\"8\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0006\b¢\u0001\u0010£\u0001\u0012\u0005\b¨\u0001\u0010[\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R/\u0010C\u001a\u00020\"8\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0006\b©\u0001\u0010£\u0001\u0012\u0005\b¬\u0001\u0010[\u001a\u0006\bª\u0001\u0010¥\u0001\"\u0006\b«\u0001\u0010§\u0001R/\u0010D\u001a\u00020\"8\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0006\b\u00ad\u0001\u0010£\u0001\u0012\u0005\b°\u0001\u0010[\u001a\u0006\b®\u0001\u0010¥\u0001\"\u0006\b¯\u0001\u0010§\u0001R,\u0010E\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0005\b±\u0001\u0010p\u0012\u0005\b´\u0001\u0010[\u001a\u0005\b²\u0001\u0010r\"\u0005\b³\u0001\u0010tR,\u0010F\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0005\bµ\u0001\u0010p\u0012\u0005\b¸\u0001\u0010[\u001a\u0005\b¶\u0001\u0010r\"\u0005\b·\u0001\u0010tR/\u0010G\u001a\u00020\"8\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0006\b¹\u0001\u0010£\u0001\u0012\u0005\b¼\u0001\u0010[\u001a\u0006\bº\u0001\u0010¥\u0001\"\u0006\b»\u0001\u0010§\u0001R,\u0010H\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0005\b½\u0001\u0010p\u0012\u0005\bÀ\u0001\u0010[\u001a\u0005\b¾\u0001\u0010r\"\u0005\b¿\u0001\u0010tR,\u0010I\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0005\bÁ\u0001\u0010R\u0012\u0005\bÄ\u0001\u0010[\u001a\u0005\bÂ\u0001\u0010T\"\u0005\bÃ\u0001\u0010VR,\u0010J\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0005\bÅ\u0001\u0010R\u0012\u0005\bÈ\u0001\u0010[\u001a\u0005\bÆ\u0001\u0010T\"\u0005\bÇ\u0001\u0010VR,\u0010K\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0005\bÉ\u0001\u0010R\u0012\u0005\bÌ\u0001\u0010[\u001a\u0005\bÊ\u0001\u0010T\"\u0005\bË\u0001\u0010VR%\u0010L\u001a\u00020\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0015\n\u0005\bÍ\u0001\u0010R\u0012\u0005\bÏ\u0001\u0010[\u001a\u0005\bÎ\u0001\u0010TR%\u0010M\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÐ\u0001\u0010R\u001a\u0005\bÑ\u0001\u0010T\"\u0005\bÒ\u0001\u0010VR.\u0010N\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0006\bÓ\u0001\u0010Ô\u0001\u0012\u0005\bØ\u0001\u0010[\u001a\u0005\bN\u0010Õ\u0001\"\u0006\bÖ\u0001\u0010×\u0001¨\u0006á\u0001"}, d2 = {"Lcom/huami/pai/vo/PAIDataVo;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "other", "", "equals", "", "toString", "component1", "component2", "component3", "", "component4", "component5", "component6", "", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "date", "activityScore", "nextActivityScore", Constant.PAI_KEY_LOW_ZONE_PAI, Constant.PAI_KEY_MEDIUM_ZONE_PAI, Constant.PAI_KEY_HIGH_ZONE_PAI, Constant.PAI_KEY_LOW_ZONE_MINUTES, Constant.PAI_KEY_MEDIUM_ZONE_MINUTES, Constant.PAI_KEY_HIGH_ZONE_MINUTES, Constant.PAI_KEY_DAILY_PAI, "tp", "age", Constant.PAI_KEY_GENDER, Constant.PAI_KEY_LHR, Constant.PAI_KEY_MHR, Constant.PAI_KEY_HHR, Constant.PAI_KEY_RHR, Constant.PAI_KEY_MAX_HR, "timestamp", "time", "timeZone", "index", "version", "uploadTimestamp", "deviceSource", "deviceId", "sn", "userId", "eventType", "subType", "isUpload", "copy", "hashCode", "a", "Ljava/lang/String;", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "b", "getActivityScore", "setActivityScore", "getActivityScore$annotations", "()V", "c", "getNextActivityScore", "setNextActivityScore", "getNextActivityScore$annotations", GoogleApiAvailabilityLight.a, "F", "getLp", "()F", "setLp", "(F)V", "getLp$annotations", "e", "getMp", "setMp", "getMp$annotations", "f", "getHp", "setHp", "getHp$annotations", "g", LogUtil.I, "getLm", "()I", "setLm", "(I)V", "getLm$annotations", "h", "getMm", "setMm", "getMm$annotations", "i", "getHm", "setHm", "getHm$annotations", z.j, "getDp", "setDp", "getDp$annotations", hl.k, "getTp", "setTp", "getTp$annotations", "l", "getAge", "setAge", "getAge$annotations", "m", "getGd", "setGd", "getGd$annotations", GoogleApiAvailabilityLight.b, "getLhr", "setLhr", "getLhr$annotations", "o", "getMhr", "setMhr", "getMhr$annotations", b.r, "getHhr", "setHhr", "getHhr$annotations", DTransferConstants.SEARCH_KEY, "getRestHr", "setRestHr", "getRestHr$annotations", "r", "getMaxHr", "setMaxHr", "getMaxHr$annotations", SOAP.XMLNS, "J", "getTimestamp", "()J", "setTimestamp", "(J)V", "getTimestamp$annotations", "t", "getTime", "setTime", "getTime$annotations", "u", "getTimeZone", "setTimeZone", "getTimeZone$annotations", "v", "getIndex", "setIndex", "getIndex$annotations", "w", "getVersion", "setVersion", "getVersion$annotations", "x", "getUploadTimestamp", "setUploadTimestamp", "getUploadTimestamp$annotations", "y", "getDeviceSource", "setDeviceSource", "getDeviceSource$annotations", "z", "getDeviceId", "setDeviceId", "getDeviceId$annotations", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getSn", "setSn", "getSn$annotations", "B", "getUserId", "setUserId", "getUserId$annotations", "C", "getEventType", "getEventType$annotations", LogUtil.D, "getSubType", "setSubType", "E", "Z", "()Z", "setUpload", "(Z)V", "isUpload$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFFIIIFFIIIIIIIJJJIIJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;FFFIIIFFIIIIIIIJJJIIJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "lib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class PAIDataVo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
    @NotNull
    private String sn;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
    @NotNull
    private String userId;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    private final String eventType;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private String subType;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean isUpload;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private String date;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private String activityScore;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private String nextActivityScore;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private float lp;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private float mp;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private float hp;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private int lm;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private int mm;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private int hm;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    private float dp;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    private float tp;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    private int age;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    private int gd;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    private int lhr;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    private int mhr;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    private int hhr;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
    private int restHr;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
    private int maxHr;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata and from toString */
    private long timestamp;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata and from toString */
    private long time;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata and from toString */
    private long timeZone;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata and from toString */
    private int index;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata and from toString */
    private int version;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata and from toString */
    private long uploadTimestamp;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata and from toString */
    private int deviceSource;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata and from toString */
    @NotNull
    private String deviceId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/pai/vo/PAIDataVo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/pai/vo/PAIDataVo;", "serializer", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<PAIDataVo> serializer() {
            return PAIDataVo$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PAIDataVo(int i, String str, @SerialName("activityScores") String str2, @SerialName("nextActivityScores") String str3, @SerialName("lowZonePai") float f, @SerialName("mediumZonePai") float f2, @SerialName("highZonePai") float f3, @SerialName("lowZoneMinutes") int i2, @SerialName("mediumZoneMinutes") int i3, @SerialName("highZoneMinutes") int i4, @SerialName("dailyPai") float f4, @SerialName("totalPai") float f5, @SerialName("age") int i5, @SerialName("gender") int i6, @SerialName("lowZoneLowerLimit") int i7, @SerialName("mediumZoneLowerLimit") int i8, @SerialName("highZoneLowerLimit") int i9, @SerialName(Constant.PAI_KEY_RHR) int i10, @SerialName(Constant.PAI_KEY_MAX_HR) int i11, @SerialName("timestamp") long j, @SerialName("time") long j2, @SerialName("timeZone") long j3, @SerialName("index") int i12, @SerialName("version") int i13, @SerialName("uploadTimestamp") long j4, @SerialName("deviceSource") int i14, @SerialName("deviceId") String str4, @SerialName("sn") String str5, @SerialName("userId") String str6, @SerialName("eventType") String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, PAIDataVo$$serializer.INSTANCE.getDescriptor());
        }
        this.date = str;
        if ((i & 2) == 0) {
            this.activityScore = "[0,0,0,0,0,0,0]";
        } else {
            this.activityScore = str2;
        }
        if ((i & 4) == 0) {
            this.nextActivityScore = "[0,0,0,0,0,0,0]";
        } else {
            this.nextActivityScore = str3;
        }
        if ((i & 8) == 0) {
            this.lp = 0.0f;
        } else {
            this.lp = f;
        }
        if ((i & 16) == 0) {
            this.mp = 0.0f;
        } else {
            this.mp = f2;
        }
        if ((i & 32) == 0) {
            this.hp = 0.0f;
        } else {
            this.hp = f3;
        }
        if ((i & 64) == 0) {
            this.lm = 0;
        } else {
            this.lm = i2;
        }
        if ((i & 128) == 0) {
            this.mm = 0;
        } else {
            this.mm = i3;
        }
        if ((i & 256) == 0) {
            this.hm = 0;
        } else {
            this.hm = i4;
        }
        if ((i & 512) == 0) {
            this.dp = 0.0f;
        } else {
            this.dp = f4;
        }
        if ((i & 1024) == 0) {
            this.tp = 0.0f;
        } else {
            this.tp = f5;
        }
        if ((i & 2048) == 0) {
            this.age = 0;
        } else {
            this.age = i5;
        }
        if ((i & 4096) == 0) {
            this.gd = 0;
        } else {
            this.gd = i6;
        }
        if ((i & 8192) == 0) {
            this.lhr = 0;
        } else {
            this.lhr = i7;
        }
        if ((i & 16384) == 0) {
            this.mhr = 0;
        } else {
            this.mhr = i8;
        }
        if ((32768 & i) == 0) {
            this.hhr = 0;
        } else {
            this.hhr = i9;
        }
        if ((65536 & i) == 0) {
            this.restHr = -1;
        } else {
            this.restHr = i10;
        }
        if ((131072 & i) == 0) {
            this.maxHr = 0;
        } else {
            this.maxHr = i11;
        }
        if ((262144 & i) == 0) {
            this.timestamp = 0L;
        } else {
            this.timestamp = j;
        }
        if ((524288 & i) == 0) {
            this.time = 0L;
        } else {
            this.time = j2;
        }
        this.timeZone = (1048576 & i) == 0 ? -1L : j3;
        if ((2097152 & i) == 0) {
            this.index = -1;
        } else {
            this.index = i12;
        }
        if ((4194304 & i) == 0) {
            this.version = -1;
        } else {
            this.version = i13;
        }
        this.uploadTimestamp = (8388608 & i) != 0 ? j4 : 0L;
        if ((16777216 & i) == 0) {
            this.deviceSource = -1;
        } else {
            this.deviceSource = i14;
        }
        if ((33554432 & i) == 0) {
            this.deviceId = "";
        } else {
            this.deviceId = str4;
        }
        if ((67108864 & i) == 0) {
            this.sn = "";
        } else {
            this.sn = str5;
        }
        if ((134217728 & i) == 0) {
            this.userId = "";
        } else {
            this.userId = str6;
        }
        if ((268435456 & i) == 0) {
            this.eventType = "";
        } else {
            this.eventType = str7;
        }
        if ((i & 536870912) == 0) {
            this.subType = "";
        } else {
            this.subType = str8;
        }
        this.isUpload = false;
    }

    public static /* synthetic */ PAIDataVo copy$default(PAIDataVo pAIDataVo, String str, String str2, String str3, float f, float f2, float f3, int i, int i2, int i3, float f4, float f5, int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j, long j2, long j3, int i11, int i12, long j4, int i13, String str4, String str5, String str6, String str7, String str8, boolean z, int i14, Object obj) {
        String str9 = (i14 & 1) != 0 ? pAIDataVo.date : str;
        String str10 = (i14 & 2) != 0 ? pAIDataVo.activityScore : str2;
        String str11 = (i14 & 4) != 0 ? pAIDataVo.nextActivityScore : str3;
        float f6 = (i14 & 8) != 0 ? pAIDataVo.lp : f;
        float f7 = (i14 & 16) != 0 ? pAIDataVo.mp : f2;
        float f8 = (i14 & 32) != 0 ? pAIDataVo.hp : f3;
        int i15 = (i14 & 64) != 0 ? pAIDataVo.lm : i;
        int i16 = (i14 & 128) != 0 ? pAIDataVo.mm : i2;
        int i17 = (i14 & 256) != 0 ? pAIDataVo.hm : i3;
        float f9 = (i14 & 512) != 0 ? pAIDataVo.dp : f4;
        float f10 = (i14 & 1024) != 0 ? pAIDataVo.tp : f5;
        int i18 = (i14 & 2048) != 0 ? pAIDataVo.age : i4;
        int i19 = (i14 & 4096) != 0 ? pAIDataVo.gd : i5;
        return pAIDataVo.copy(str9, str10, str11, f6, f7, f8, i15, i16, i17, f9, f10, i18, i19, (i14 & 8192) != 0 ? pAIDataVo.lhr : i6, (i14 & 16384) != 0 ? pAIDataVo.mhr : i7, (i14 & 32768) != 0 ? pAIDataVo.hhr : i8, (i14 & 65536) != 0 ? pAIDataVo.restHr : i9, (i14 & 131072) != 0 ? pAIDataVo.maxHr : i10, (i14 & 262144) != 0 ? pAIDataVo.timestamp : j, (i14 & 524288) != 0 ? pAIDataVo.time : j2, (i14 & 1048576) != 0 ? pAIDataVo.timeZone : j3, (i14 & 2097152) != 0 ? pAIDataVo.index : i11, (4194304 & i14) != 0 ? pAIDataVo.version : i12, (i14 & 8388608) != 0 ? pAIDataVo.uploadTimestamp : j4, (i14 & 16777216) != 0 ? pAIDataVo.deviceSource : i13, (33554432 & i14) != 0 ? pAIDataVo.deviceId : str4, (i14 & 67108864) != 0 ? pAIDataVo.sn : str5, (i14 & AMapEngineUtils.HALF_MAX_P20_WIDTH) != 0 ? pAIDataVo.userId : str6, (i14 & 268435456) != 0 ? pAIDataVo.eventType : str7, (i14 & 536870912) != 0 ? pAIDataVo.subType : str8, (i14 & 1073741824) != 0 ? pAIDataVo.isUpload : z);
    }

    @SerialName("activityScores")
    public static /* synthetic */ void getActivityScore$annotations() {
    }

    @SerialName("age")
    public static /* synthetic */ void getAge$annotations() {
    }

    @SerialName("deviceId")
    public static /* synthetic */ void getDeviceId$annotations() {
    }

    @SerialName("deviceSource")
    public static /* synthetic */ void getDeviceSource$annotations() {
    }

    @SerialName("dailyPai")
    public static /* synthetic */ void getDp$annotations() {
    }

    @SerialName("eventType")
    public static /* synthetic */ void getEventType$annotations() {
    }

    @SerialName("gender")
    public static /* synthetic */ void getGd$annotations() {
    }

    @SerialName("highZoneLowerLimit")
    public static /* synthetic */ void getHhr$annotations() {
    }

    @SerialName("highZoneMinutes")
    public static /* synthetic */ void getHm$annotations() {
    }

    @SerialName("highZonePai")
    public static /* synthetic */ void getHp$annotations() {
    }

    @SerialName("index")
    public static /* synthetic */ void getIndex$annotations() {
    }

    @SerialName("lowZoneLowerLimit")
    public static /* synthetic */ void getLhr$annotations() {
    }

    @SerialName("lowZoneMinutes")
    public static /* synthetic */ void getLm$annotations() {
    }

    @SerialName("lowZonePai")
    public static /* synthetic */ void getLp$annotations() {
    }

    @SerialName(Constant.PAI_KEY_MAX_HR)
    public static /* synthetic */ void getMaxHr$annotations() {
    }

    @SerialName("mediumZoneLowerLimit")
    public static /* synthetic */ void getMhr$annotations() {
    }

    @SerialName("mediumZoneMinutes")
    public static /* synthetic */ void getMm$annotations() {
    }

    @SerialName("mediumZonePai")
    public static /* synthetic */ void getMp$annotations() {
    }

    @SerialName("nextActivityScores")
    public static /* synthetic */ void getNextActivityScore$annotations() {
    }

    @SerialName(Constant.PAI_KEY_RHR)
    public static /* synthetic */ void getRestHr$annotations() {
    }

    @SerialName("sn")
    public static /* synthetic */ void getSn$annotations() {
    }

    @SerialName("time")
    public static /* synthetic */ void getTime$annotations() {
    }

    @SerialName("timeZone")
    public static /* synthetic */ void getTimeZone$annotations() {
    }

    @SerialName("timestamp")
    public static /* synthetic */ void getTimestamp$annotations() {
    }

    @SerialName("totalPai")
    public static /* synthetic */ void getTp$annotations() {
    }

    @SerialName("uploadTimestamp")
    public static /* synthetic */ void getUploadTimestamp$annotations() {
    }

    @SerialName("userId")
    public static /* synthetic */ void getUserId$annotations() {
    }

    @SerialName("version")
    public static /* synthetic */ void getVersion$annotations() {
    }

    @Transient
    public static /* synthetic */ void isUpload$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull PAIDataVo self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.date);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.activityScore, "[0,0,0,0,0,0,0]")) {
            output.encodeStringElement(serialDesc, 1, self.activityScore);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.nextActivityScore, "[0,0,0,0,0,0,0]")) {
            output.encodeStringElement(serialDesc, 2, self.nextActivityScore);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual((Object) Float.valueOf(self.lp), (Object) Float.valueOf(0.0f))) {
            output.encodeFloatElement(serialDesc, 3, self.lp);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !Intrinsics.areEqual((Object) Float.valueOf(self.mp), (Object) Float.valueOf(0.0f))) {
            output.encodeFloatElement(serialDesc, 4, self.mp);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !Intrinsics.areEqual((Object) Float.valueOf(self.hp), (Object) Float.valueOf(0.0f))) {
            output.encodeFloatElement(serialDesc, 5, self.hp);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.lm != 0) {
            output.encodeIntElement(serialDesc, 6, self.lm);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.mm != 0) {
            output.encodeIntElement(serialDesc, 7, self.mm);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.hm != 0) {
            output.encodeIntElement(serialDesc, 8, self.hm);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || !Intrinsics.areEqual((Object) Float.valueOf(self.dp), (Object) Float.valueOf(0.0f))) {
            output.encodeFloatElement(serialDesc, 9, self.dp);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || !Intrinsics.areEqual((Object) Float.valueOf(self.tp), (Object) Float.valueOf(0.0f))) {
            output.encodeFloatElement(serialDesc, 10, self.tp);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.age != 0) {
            output.encodeIntElement(serialDesc, 11, self.age);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.gd != 0) {
            output.encodeIntElement(serialDesc, 12, self.gd);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.lhr != 0) {
            output.encodeIntElement(serialDesc, 13, self.lhr);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.mhr != 0) {
            output.encodeIntElement(serialDesc, 14, self.mhr);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.hhr != 0) {
            output.encodeIntElement(serialDesc, 15, self.hhr);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.restHr != -1) {
            output.encodeIntElement(serialDesc, 16, self.restHr);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17) || self.maxHr != 0) {
            output.encodeIntElement(serialDesc, 17, self.maxHr);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 18) || self.timestamp != 0) {
            output.encodeLongElement(serialDesc, 18, self.timestamp);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 19) || self.time != 0) {
            output.encodeLongElement(serialDesc, 19, self.time);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 20) || self.timeZone != -1) {
            output.encodeLongElement(serialDesc, 20, self.timeZone);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 21) || self.index != -1) {
            output.encodeIntElement(serialDesc, 21, self.index);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 22) || self.version != -1) {
            output.encodeIntElement(serialDesc, 22, self.version);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 23) || self.uploadTimestamp != 0) {
            output.encodeLongElement(serialDesc, 23, self.uploadTimestamp);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 24) || self.deviceSource != -1) {
            output.encodeIntElement(serialDesc, 24, self.deviceSource);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 25) || !Intrinsics.areEqual(self.deviceId, "")) {
            output.encodeStringElement(serialDesc, 25, self.deviceId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 26) || !Intrinsics.areEqual(self.sn, "")) {
            output.encodeStringElement(serialDesc, 26, self.sn);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 27) || !Intrinsics.areEqual(self.userId, "")) {
            output.encodeStringElement(serialDesc, 27, self.userId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 28) || !Intrinsics.areEqual(self.eventType, "")) {
            output.encodeStringElement(serialDesc, 28, self.eventType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 29) || !Intrinsics.areEqual(self.subType, "")) {
            output.encodeStringElement(serialDesc, 29, self.subType);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final float getDp() {
        return this.dp;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final float getTp() {
        return this.tp;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getAge() {
        return this.age;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getGd() {
        return this.gd;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getLhr() {
        return this.lhr;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getMhr() {
        return this.mhr;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getHhr() {
        return this.hhr;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getRestHr() {
        return this.restHr;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getMaxHr() {
        return this.maxHr;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getActivityScore() {
        return this.activityScore;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final long getTimeZone() {
        return this.timeZone;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final long getUploadTimestamp() {
        return this.uploadTimestamp;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNextActivityScore() {
        return this.nextActivityScore;
    }

    @NotNull
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final boolean getIsUpload() {
        return this.isUpload;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getLp() {
        return this.lp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getMp() {
        return this.mp;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getHp() {
        return this.hp;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getLm() {
        return this.lm;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getMm() {
        return this.mm;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getHm() {
        return this.hm;
    }

    @NotNull
    public final PAIDataVo copy(@NotNull String date, @NotNull String activityScore, @NotNull String nextActivityScore, float lp, float mp, float hp, int lm, int mm, int hm, float dp, float tp, int age, int gd, int lhr, int mhr, int hhr, int restHr, int maxHr, long timestamp, long time, long timeZone, int index, int version, long uploadTimestamp, int deviceSource, @NotNull String deviceId, @NotNull String sn, @NotNull String userId, @NotNull String eventType, @NotNull String subType, boolean isUpload) {
        return new PAIDataVo(date, activityScore, nextActivityScore, lp, mp, hp, lm, mm, hm, dp, tp, age, gd, lhr, mhr, hhr, restHr, maxHr, timestamp, time, timeZone, index, version, uploadTimestamp, deviceSource, deviceId, sn, userId, eventType, subType, isUpload);
    }

    public boolean equals(@Nullable Object other) {
        int i;
        int i2;
        if (!(other instanceof PAIDataVo)) {
            return false;
        }
        PAIDataVo pAIDataVo = (PAIDataVo) other;
        return (Intrinsics.areEqual(this.activityScore, pAIDataVo.activityScore) && Intrinsics.areEqual(this.nextActivityScore, pAIDataVo.nextActivityScore) && MathExKt.equal(this.lp, pAIDataVo.lp) && Float.valueOf(this.mp).equals(Float.valueOf(pAIDataVo.mp)) && MathExKt.equal(this.hp, pAIDataVo.hp) && this.lm == pAIDataVo.lm && this.mm == pAIDataVo.mm && this.hm == pAIDataVo.hm) && (MathExKt.equal(this.dp, pAIDataVo.dp) && MathExKt.equal(this.tp, pAIDataVo.tp) && this.age == pAIDataVo.age && this.gd == pAIDataVo.gd && this.lhr == pAIDataVo.lhr && this.mhr == pAIDataVo.mhr && this.hhr == pAIDataVo.hhr && this.restHr == pAIDataVo.restHr && this.maxHr == pAIDataVo.maxHr) && ((this.timestamp > pAIDataVo.timestamp ? 1 : (this.timestamp == pAIDataVo.timestamp ? 0 : -1)) == 0 && (this.timeZone > pAIDataVo.timeZone ? 1 : (this.timeZone == pAIDataVo.timeZone ? 0 : -1)) == 0 && this.index == pAIDataVo.index && (i = this.version) == (i2 = pAIDataVo.version) && i == i2 && this.deviceSource == pAIDataVo.deviceSource && Intrinsics.areEqual(this.deviceId, pAIDataVo.deviceId) && Intrinsics.areEqual(this.sn, pAIDataVo.sn));
    }

    @NotNull
    public final String getActivityScore() {
        return this.activityScore;
    }

    public final int getAge() {
        return this.age;
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    public final float getDp() {
        return this.dp;
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    public final int getGd() {
        return this.gd;
    }

    public final int getHhr() {
        return this.hhr;
    }

    public final int getHm() {
        return this.hm;
    }

    public final float getHp() {
        return this.hp;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getLhr() {
        return this.lhr;
    }

    public final int getLm() {
        return this.lm;
    }

    public final float getLp() {
        return this.lp;
    }

    public final int getMaxHr() {
        return this.maxHr;
    }

    public final int getMhr() {
        return this.mhr;
    }

    public final int getMm() {
        return this.mm;
    }

    public final float getMp() {
        return this.mp;
    }

    @NotNull
    public final String getNextActivityScore() {
        return this.nextActivityScore;
    }

    public final int getRestHr() {
        return this.restHr;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    public final String getSubType() {
        return this.subType;
    }

    public final long getTime() {
        return this.time;
    }

    public final long getTimeZone() {
        return this.timeZone;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final float getTp() {
        return this.tp;
    }

    public final long getUploadTimestamp() {
        return this.uploadTimestamp;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public final int getVersion() {
        return this.version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v61, types: [int] */
    /* JADX WARN: Type inference failed for: r1v46, types: [int] */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.date.hashCode() * 31) + this.activityScore.hashCode()) * 31) + this.nextActivityScore.hashCode()) * 31) + Float.floatToIntBits(this.lp)) * 31) + Float.floatToIntBits(this.mp)) * 31) + Float.floatToIntBits(this.hp)) * 31) + this.lm) * 31) + this.mm) * 31) + this.hm) * 31) + Float.floatToIntBits(this.dp)) * 31) + Float.floatToIntBits(this.tp)) * 31) + this.age) * 31) + this.gd) * 31) + this.lhr) * 31) + this.mhr) * 31) + this.hhr) * 31) + this.restHr) * 31) + this.maxHr) * 31) + defpackage.b.a(this.timestamp)) * 31) + defpackage.b.a(this.time)) * 31) + defpackage.b.a(this.timeZone)) * 31) + this.index) * 31) + this.version) * 31) + defpackage.b.a(this.uploadTimestamp)) * 31) + this.deviceSource) * 31) + this.deviceId.hashCode()) * 31) + this.sn.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.eventType.hashCode()) * 31) + this.subType.hashCode()) * 31;
        boolean z = this.isUpload;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final boolean isUpload() {
        return this.isUpload;
    }

    public final void setActivityScore(@NotNull String str) {
        this.activityScore = str;
    }

    public final void setAge(int i) {
        this.age = i;
    }

    public final void setDate(@NotNull String str) {
        this.date = str;
    }

    public final void setDeviceId(@NotNull String str) {
        this.deviceId = str;
    }

    public final void setDeviceSource(int i) {
        this.deviceSource = i;
    }

    public final void setDp(float f) {
        this.dp = f;
    }

    public final void setGd(int i) {
        this.gd = i;
    }

    public final void setHhr(int i) {
        this.hhr = i;
    }

    public final void setHm(int i) {
        this.hm = i;
    }

    public final void setHp(float f) {
        this.hp = f;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setLhr(int i) {
        this.lhr = i;
    }

    public final void setLm(int i) {
        this.lm = i;
    }

    public final void setLp(float f) {
        this.lp = f;
    }

    public final void setMaxHr(int i) {
        this.maxHr = i;
    }

    public final void setMhr(int i) {
        this.mhr = i;
    }

    public final void setMm(int i) {
        this.mm = i;
    }

    public final void setMp(float f) {
        this.mp = f;
    }

    public final void setNextActivityScore(@NotNull String str) {
        this.nextActivityScore = str;
    }

    public final void setRestHr(int i) {
        this.restHr = i;
    }

    public final void setSn(@NotNull String str) {
        this.sn = str;
    }

    public final void setSubType(@NotNull String str) {
        this.subType = str;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setTimeZone(long j) {
        this.timeZone = j;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    public final void setTp(float f) {
        this.tp = f;
    }

    public final void setUpload(boolean z) {
        this.isUpload = z;
    }

    public final void setUploadTimestamp(long j) {
        this.uploadTimestamp = j;
    }

    public final void setUserId(@NotNull String str) {
        this.userId = str;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    @NotNull
    public String toString() {
        return "PAIDataVo(date='" + this.date + "', activityScore='" + this.activityScore + "', nextActivityScore='" + this.nextActivityScore + "', lp=" + this.lp + ", mp=" + this.mp + ", hp=" + this.hp + ", lm=" + this.lm + ", mm=" + this.mm + ", hm=" + this.hm + ", dp=" + this.dp + ", tp=" + this.tp + ", age=" + this.age + ", gd=" + this.gd + ", lhr=" + this.lhr + ", mhr=" + this.mhr + ", hhr=" + this.hhr + ", restHr=" + this.restHr + ", maxHr=" + this.maxHr + ", timestamp=" + this.timestamp + ", time=" + this.time + ", timeZone=" + this.timeZone + ", index=" + this.index + ", version=" + this.version + ", uploadTimestamp=" + this.uploadTimestamp + ", deviceSource=" + this.deviceSource + ", deviceId='" + this.deviceId + "', sn='" + this.sn + "', userId='" + this.userId + "')";
    }

    public PAIDataVo(@NotNull String str, @NotNull String str2, @NotNull String str3, float f, float f2, float f3, int i, int i2, int i3, float f4, float f5, int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j, long j2, long j3, int i11, int i12, long j4, int i13, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z) {
        this.date = str;
        this.activityScore = str2;
        this.nextActivityScore = str3;
        this.lp = f;
        this.mp = f2;
        this.hp = f3;
        this.lm = i;
        this.mm = i2;
        this.hm = i3;
        this.dp = f4;
        this.tp = f5;
        this.age = i4;
        this.gd = i5;
        this.lhr = i6;
        this.mhr = i7;
        this.hhr = i8;
        this.restHr = i9;
        this.maxHr = i10;
        this.timestamp = j;
        this.time = j2;
        this.timeZone = j3;
        this.index = i11;
        this.version = i12;
        this.uploadTimestamp = j4;
        this.deviceSource = i13;
        this.deviceId = str4;
        this.sn = str5;
        this.userId = str6;
        this.eventType = str7;
        this.subType = str8;
        this.isUpload = z;
    }

    public /* synthetic */ PAIDataVo(String str, String str2, String str3, float f, float f2, float f3, int i, int i2, int i3, float f4, float f5, int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j, long j2, long j3, int i11, int i12, long j4, int i13, String str4, String str5, String str6, String str7, String str8, boolean z, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i14 & 2) != 0 ? "[0,0,0,0,0,0,0]" : str2, (i14 & 4) == 0 ? str3 : "[0,0,0,0,0,0,0]", (i14 & 8) != 0 ? 0.0f : f, (i14 & 16) != 0 ? 0.0f : f2, (i14 & 32) != 0 ? 0.0f : f3, (i14 & 64) != 0 ? 0 : i, (i14 & 128) != 0 ? 0 : i2, (i14 & 256) != 0 ? 0 : i3, (i14 & 512) != 0 ? 0.0f : f4, (i14 & 1024) == 0 ? f5 : 0.0f, (i14 & 2048) != 0 ? 0 : i4, (i14 & 4096) != 0 ? 0 : i5, (i14 & 8192) != 0 ? 0 : i6, (i14 & 16384) != 0 ? 0 : i7, (i14 & 32768) != 0 ? 0 : i8, (i14 & 65536) != 0 ? -1 : i9, (i14 & 131072) != 0 ? 0 : i10, (i14 & 262144) != 0 ? 0L : j, (i14 & 524288) != 0 ? 0L : j2, (i14 & 1048576) != 0 ? -1L : j3, (i14 & 2097152) != 0 ? -1 : i11, (i14 & 4194304) != 0 ? -1 : i12, (i14 & 8388608) == 0 ? j4 : 0L, (i14 & 16777216) == 0 ? i13 : -1, (i14 & 33554432) != 0 ? "" : str4, (i14 & 67108864) != 0 ? "" : str5, (i14 & AMapEngineUtils.HALF_MAX_P20_WIDTH) != 0 ? "" : str6, (i14 & 268435456) != 0 ? "" : str7, (i14 & 536870912) == 0 ? str8 : "", (i14 & 1073741824) == 0 ? z : false);
    }
}
