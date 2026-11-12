package com.huami.message.api.pojo;

import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.message.api.WebConst;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
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
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b4\n\u0002\u0010\u000b\n\u0002\b_\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ®\u00012\u00020\u0001:\u0004¯\u0001®\u0001B×\u0002\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u00109\u001a\u00020\u0016\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\f¢\u0006\u0006\b¨\u0001\u0010©\u0001Bî\u0002\b\u0017\u0012\u0007\u0010ª\u0001\u001a\u00020\t\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u00101\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u00102\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u00103\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u00104\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u00105\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u00106\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u00107\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u00108\u001a\u0004\u0018\u00010\f\u0012\b\b\u0001\u00109\u001a\u00020\u0016\u0012\n\b\u0001\u0010:\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010;\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010<\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010=\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010>\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010?\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010@\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010A\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010B\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010C\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010D\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010E\u001a\u0004\u0018\u00010\f\u0012\n\u0010¬\u0001\u001a\u0005\u0018\u00010«\u0001¢\u0006\u0006\b¨\u0001\u0010\u00ad\u0001J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0016HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003JÞ\u0002\u0010F\u001a\u00020\u00002\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00106\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\f2\b\b\u0002\u00109\u001a\u00020\u00162\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\bF\u0010GJ\t\u0010H\u001a\u00020\fHÖ\u0001J\t\u0010I\u001a\u00020\tHÖ\u0001J\u0013\u0010L\u001a\u00020K2\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010*\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bM\u0010N\u0012\u0004\bP\u0010Q\u001a\u0004\bO\u0010\u000bR$\u0010+\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bR\u0010S\u0012\u0004\bV\u0010Q\u001a\u0004\bT\u0010UR$\u0010,\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bW\u0010S\u0012\u0004\bY\u0010Q\u001a\u0004\bX\u0010UR$\u0010-\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bZ\u0010S\u0012\u0004\b\\\u0010Q\u001a\u0004\b[\u0010UR$\u0010.\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b]\u0010S\u0012\u0004\b_\u0010Q\u001a\u0004\b^\u0010UR$\u0010/\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b`\u0010S\u0012\u0004\bb\u0010Q\u001a\u0004\ba\u0010UR$\u00100\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bc\u0010S\u0012\u0004\be\u0010Q\u001a\u0004\bd\u0010UR$\u00101\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bf\u0010S\u0012\u0004\bh\u0010Q\u001a\u0004\bg\u0010UR$\u00102\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bi\u0010S\u0012\u0004\bk\u0010Q\u001a\u0004\bj\u0010UR$\u00103\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bl\u0010S\u0012\u0004\bn\u0010Q\u001a\u0004\bm\u0010UR$\u00104\u001a\u0004\u0018\u00010\u00168\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bo\u0010p\u0012\u0004\br\u0010Q\u001a\u0004\bq\u0010\u0018R$\u00105\u001a\u0004\u0018\u00010\u00168\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bs\u0010p\u0012\u0004\bu\u0010Q\u001a\u0004\bt\u0010\u0018R$\u00106\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bv\u0010S\u0012\u0004\bx\u0010Q\u001a\u0004\bw\u0010UR$\u00107\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\by\u0010S\u0012\u0004\b{\u0010Q\u001a\u0004\bz\u0010UR$\u00108\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b|\u0010S\u0012\u0004\b~\u0010Q\u001a\u0004\b}\u0010UR&\u00109\u001a\u00020\u00168\u0006@\u0007X\u0087\u0004¢\u0006\u0016\n\u0005\b\u007f\u0010\u0080\u0001\u0012\u0005\b\u0083\u0001\u0010Q\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R'\u0010:\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010S\u0012\u0005\b\u0086\u0001\u0010Q\u001a\u0005\b\u0085\u0001\u0010UR'\u0010;\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010S\u0012\u0005\b\u0089\u0001\u0010Q\u001a\u0005\b\u0088\u0001\u0010UR'\u0010<\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010S\u0012\u0005\b\u008c\u0001\u0010Q\u001a\u0005\b\u008b\u0001\u0010UR'\u0010=\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010S\u0012\u0005\b\u008f\u0001\u0010Q\u001a\u0005\b\u008e\u0001\u0010UR'\u0010>\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0090\u0001\u0010S\u0012\u0005\b\u0092\u0001\u0010Q\u001a\u0005\b\u0091\u0001\u0010UR'\u0010?\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0093\u0001\u0010S\u0012\u0005\b\u0095\u0001\u0010Q\u001a\u0005\b\u0094\u0001\u0010UR'\u0010@\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0096\u0001\u0010S\u0012\u0005\b\u0098\u0001\u0010Q\u001a\u0005\b\u0097\u0001\u0010UR'\u0010A\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0099\u0001\u0010S\u0012\u0005\b\u009b\u0001\u0010Q\u001a\u0005\b\u009a\u0001\u0010UR'\u0010B\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0015\n\u0005\b\u009c\u0001\u0010S\u0012\u0005\b\u009e\u0001\u0010Q\u001a\u0005\b\u009d\u0001\u0010UR'\u0010C\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0015\n\u0005\b\u009f\u0001\u0010S\u0012\u0005\b¡\u0001\u0010Q\u001a\u0005\b \u0001\u0010UR'\u0010D\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0015\n\u0005\b¢\u0001\u0010S\u0012\u0005\b¤\u0001\u0010Q\u001a\u0005\b£\u0001\u0010UR'\u0010E\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0015\n\u0005\b¥\u0001\u0010S\u0012\u0005\b§\u0001\u0010Q\u001a\u0005\b¦\u0001\u0010U¨\u0006°\u0001"}, d2 = {"Lcom/huami/message/api/pojo/SubMessageBean;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "()Ljava/lang/Integer;", "", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "", "component11", "()Ljava/lang/Long;", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "count", "dataType", "day", "description", "followeeId", "from", "fromFirstCommentId", "fromPostId", "fromSecondCommentId", "fromTopicId", "generateTime", "generatedTime", "hrvType", "iconUrl", ParamKey.memberId, WebConst.QueryParam.MESSAGE_ID, WebConst.QueryParam.MESSAGE_SUB_TYPE, "nickName", WebConst.QueryParam.NOTICE_TYPE, "status", "subType", "text", "title", "type", "resourceType", "resource", "subText", "followStatus", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huami/message/api/pojo/SubMessageBean;", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/Integer;", "getCount", "getCount$annotations", "()V", "b", "Ljava/lang/String;", "getDataType", "()Ljava/lang/String;", "getDataType$annotations", "c", "getDay", "getDay$annotations", GoogleApiAvailabilityLight.a, "getDescription", "getDescription$annotations", "e", "getFolloweeId", "getFolloweeId$annotations", "f", "getFrom", "getFrom$annotations", "g", "getFromFirstCommentId", "getFromFirstCommentId$annotations", "h", "getFromPostId", "getFromPostId$annotations", "i", "getFromSecondCommentId", "getFromSecondCommentId$annotations", z.j, "getFromTopicId", "getFromTopicId$annotations", hl.k, "Ljava/lang/Long;", "getGenerateTime", "getGenerateTime$annotations", "l", "getGeneratedTime", "getGeneratedTime$annotations", "m", "getHrvType", "getHrvType$annotations", GoogleApiAvailabilityLight.b, "getIconUrl", "getIconUrl$annotations", "o", "getMemberId", "getMemberId$annotations", b.r, "J", "getMessageId", "()J", "getMessageId$annotations", DTransferConstants.SEARCH_KEY, "getMessageSubType", "getMessageSubType$annotations", "r", "getNickName", "getNickName$annotations", SOAP.XMLNS, "getNoticeType", "getNoticeType$annotations", "t", "getStatus", "getStatus$annotations", "u", "getSubType", "getSubType$annotations", "v", "getText", "getText$annotations", "w", "getTitle", "getTitle$annotations", "x", "getType", "getType$annotations", "y", "getResourceType", "getResourceType$annotations", "z", "getResource", "getResource$annotations", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getSubText", "getSubText$annotations", "B", "getFollowStatus", "getFollowStatus$annotations", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "common-message_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class SubMessageBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
    @Nullable
    private final String subText;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
    @Nullable
    private final String followStatus;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer count;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String dataType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String day;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final String description;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final String followeeId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final String from;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private final String fromFirstCommentId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private final String fromPostId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private final String fromSecondCommentId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private final String fromTopicId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long generateTime;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long generatedTime;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @Nullable
    private final String hrvType;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    @Nullable
    private final String iconUrl;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @Nullable
    private final String memberId;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    private final long messageId;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
    @Nullable
    private final String messageSubType;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
    @Nullable
    private final String nickName;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata and from toString */
    @Nullable
    private final String noticeType;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata and from toString */
    @Nullable
    private final String status;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata and from toString */
    @Nullable
    private final String subType;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata and from toString */
    @Nullable
    private final String text;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata and from toString */
    @Nullable
    private final String title;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata and from toString */
    @Nullable
    private final String type;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata and from toString */
    @Nullable
    private final String resourceType;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata and from toString */
    @Nullable
    private final String resource;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/message/api/pojo/SubMessageBean$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/message/api/pojo/SubMessageBean;", "serializer", "<init>", "()V", "common-message_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<SubMessageBean> serializer() {
            return SubMessageBean$$serializer.INSTANCE;
        }
    }

    public SubMessageBean() {
        this((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ SubMessageBean(int i, @SerialName("count") Integer num, @SerialName("dataType") String str, @SerialName("day") String str2, @SerialName("description") String str3, @SerialName("followeeId") String str4, @SerialName("from") String str5, @SerialName("fromFirstCommentId") String str6, @SerialName("fromPostId") String str7, @SerialName("fromSecondCommentId") String str8, @SerialName("fromTopicId") String str9, @SerialName("generateTime") Long l, @SerialName("generatedTime") Long l2, @SerialName("hrvType") String str10, @SerialName("iconUrl") String str11, @SerialName(ParamKey.memberId) String str12, @SerialName(WebConst.QueryParam.MESSAGE_ID) long j, @SerialName(WebConst.QueryParam.MESSAGE_SUB_TYPE) String str13, @SerialName("nickName") String str14, @SerialName(WebConst.QueryParam.NOTICE_TYPE) String str15, @SerialName("status") String str16, @SerialName("subType") String str17, @SerialName("text") String str18, @SerialName("title") String str19, @SerialName("type") String str20, @SerialName("resourceType") String str21, @SerialName("resource") String str22, @SerialName("subText") String str23, @SerialName("followStatus") String str24, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, SubMessageBean$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.count = null;
        } else {
            this.count = num;
        }
        if ((i & 2) == 0) {
            this.dataType = null;
        } else {
            this.dataType = str;
        }
        if ((i & 4) == 0) {
            this.day = null;
        } else {
            this.day = str2;
        }
        if ((i & 8) == 0) {
            this.description = null;
        } else {
            this.description = str3;
        }
        if ((i & 16) == 0) {
            this.followeeId = null;
        } else {
            this.followeeId = str4;
        }
        if ((i & 32) == 0) {
            this.from = null;
        } else {
            this.from = str5;
        }
        if ((i & 64) == 0) {
            this.fromFirstCommentId = null;
        } else {
            this.fromFirstCommentId = str6;
        }
        if ((i & 128) == 0) {
            this.fromPostId = null;
        } else {
            this.fromPostId = str7;
        }
        if ((i & 256) == 0) {
            this.fromSecondCommentId = null;
        } else {
            this.fromSecondCommentId = str8;
        }
        if ((i & 512) == 0) {
            this.fromTopicId = null;
        } else {
            this.fromTopicId = str9;
        }
        if ((i & 1024) == 0) {
            this.generateTime = null;
        } else {
            this.generateTime = l;
        }
        if ((i & 2048) == 0) {
            this.generatedTime = null;
        } else {
            this.generatedTime = l2;
        }
        if ((i & 4096) == 0) {
            this.hrvType = null;
        } else {
            this.hrvType = str10;
        }
        if ((i & 8192) == 0) {
            this.iconUrl = null;
        } else {
            this.iconUrl = str11;
        }
        if ((i & 16384) == 0) {
            this.memberId = null;
        } else {
            this.memberId = str12;
        }
        this.messageId = (32768 & i) == 0 ? 0L : j;
        if ((65536 & i) == 0) {
            this.messageSubType = null;
        } else {
            this.messageSubType = str13;
        }
        if ((131072 & i) == 0) {
            this.nickName = null;
        } else {
            this.nickName = str14;
        }
        if ((262144 & i) == 0) {
            this.noticeType = null;
        } else {
            this.noticeType = str15;
        }
        if ((524288 & i) == 0) {
            this.status = null;
        } else {
            this.status = str16;
        }
        if ((1048576 & i) == 0) {
            this.subType = null;
        } else {
            this.subType = str17;
        }
        if ((2097152 & i) == 0) {
            this.text = null;
        } else {
            this.text = str18;
        }
        if ((4194304 & i) == 0) {
            this.title = null;
        } else {
            this.title = str19;
        }
        if ((8388608 & i) == 0) {
            this.type = null;
        } else {
            this.type = str20;
        }
        if ((16777216 & i) == 0) {
            this.resourceType = null;
        } else {
            this.resourceType = str21;
        }
        if ((33554432 & i) == 0) {
            this.resource = null;
        } else {
            this.resource = str22;
        }
        if ((67108864 & i) == 0) {
            this.subText = null;
        } else {
            this.subText = str23;
        }
        if ((i & AMapEngineUtils.HALF_MAX_P20_WIDTH) == 0) {
            this.followStatus = null;
        } else {
            this.followStatus = str24;
        }
    }

    @SerialName("count")
    public static /* synthetic */ void getCount$annotations() {
    }

    @SerialName("dataType")
    public static /* synthetic */ void getDataType$annotations() {
    }

    @SerialName("day")
    public static /* synthetic */ void getDay$annotations() {
    }

    @SerialName("description")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @SerialName("followStatus")
    public static /* synthetic */ void getFollowStatus$annotations() {
    }

    @SerialName("followeeId")
    public static /* synthetic */ void getFolloweeId$annotations() {
    }

    @SerialName("from")
    public static /* synthetic */ void getFrom$annotations() {
    }

    @SerialName("fromFirstCommentId")
    public static /* synthetic */ void getFromFirstCommentId$annotations() {
    }

    @SerialName("fromPostId")
    public static /* synthetic */ void getFromPostId$annotations() {
    }

    @SerialName("fromSecondCommentId")
    public static /* synthetic */ void getFromSecondCommentId$annotations() {
    }

    @SerialName("fromTopicId")
    public static /* synthetic */ void getFromTopicId$annotations() {
    }

    @SerialName("generateTime")
    public static /* synthetic */ void getGenerateTime$annotations() {
    }

    @SerialName("generatedTime")
    public static /* synthetic */ void getGeneratedTime$annotations() {
    }

    @SerialName("hrvType")
    public static /* synthetic */ void getHrvType$annotations() {
    }

    @SerialName("iconUrl")
    public static /* synthetic */ void getIconUrl$annotations() {
    }

    @SerialName(ParamKey.memberId)
    public static /* synthetic */ void getMemberId$annotations() {
    }

    @SerialName(WebConst.QueryParam.MESSAGE_ID)
    public static /* synthetic */ void getMessageId$annotations() {
    }

    @SerialName(WebConst.QueryParam.MESSAGE_SUB_TYPE)
    public static /* synthetic */ void getMessageSubType$annotations() {
    }

    @SerialName("nickName")
    public static /* synthetic */ void getNickName$annotations() {
    }

    @SerialName(WebConst.QueryParam.NOTICE_TYPE)
    public static /* synthetic */ void getNoticeType$annotations() {
    }

    @SerialName("resource")
    public static /* synthetic */ void getResource$annotations() {
    }

    @SerialName("resourceType")
    public static /* synthetic */ void getResourceType$annotations() {
    }

    @SerialName("status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    @SerialName("subText")
    public static /* synthetic */ void getSubText$annotations() {
    }

    @SerialName("subType")
    public static /* synthetic */ void getSubType$annotations() {
    }

    @SerialName("text")
    public static /* synthetic */ void getText$annotations() {
    }

    @SerialName("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @SerialName("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull SubMessageBean self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.count != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.count);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.dataType != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.dataType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.day != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.day);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.description != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.description);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.followeeId != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.followeeId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.from != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.from);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.fromFirstCommentId != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.fromFirstCommentId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.fromPostId != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.fromPostId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.fromSecondCommentId != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.fromSecondCommentId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.fromTopicId != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.fromTopicId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.generateTime != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, LongSerializer.INSTANCE, self.generateTime);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.generatedTime != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, LongSerializer.INSTANCE, self.generatedTime);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.hrvType != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, StringSerializer.INSTANCE, self.hrvType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.iconUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, self.iconUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.memberId != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, StringSerializer.INSTANCE, self.memberId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.messageId != 0) {
            output.encodeLongElement(serialDesc, 15, self.messageId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.messageSubType != null) {
            output.encodeNullableSerializableElement(serialDesc, 16, StringSerializer.INSTANCE, self.messageSubType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17) || self.nickName != null) {
            output.encodeNullableSerializableElement(serialDesc, 17, StringSerializer.INSTANCE, self.nickName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 18) || self.noticeType != null) {
            output.encodeNullableSerializableElement(serialDesc, 18, StringSerializer.INSTANCE, self.noticeType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 19) || self.status != null) {
            output.encodeNullableSerializableElement(serialDesc, 19, StringSerializer.INSTANCE, self.status);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 20) || self.subType != null) {
            output.encodeNullableSerializableElement(serialDesc, 20, StringSerializer.INSTANCE, self.subType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 21) || self.text != null) {
            output.encodeNullableSerializableElement(serialDesc, 21, StringSerializer.INSTANCE, self.text);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 22) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 22, StringSerializer.INSTANCE, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 23) || self.type != null) {
            output.encodeNullableSerializableElement(serialDesc, 23, StringSerializer.INSTANCE, self.type);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 24) || self.resourceType != null) {
            output.encodeNullableSerializableElement(serialDesc, 24, StringSerializer.INSTANCE, self.resourceType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 25) || self.resource != null) {
            output.encodeNullableSerializableElement(serialDesc, 25, StringSerializer.INSTANCE, self.resource);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 26) || self.subText != null) {
            output.encodeNullableSerializableElement(serialDesc, 26, StringSerializer.INSTANCE, self.subText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 27) || self.followStatus != null) {
            output.encodeNullableSerializableElement(serialDesc, 27, StringSerializer.INSTANCE, self.followStatus);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getFromTopicId() {
        return this.fromTopicId;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getGenerateTime() {
        return this.generateTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getGeneratedTime() {
        return this.generatedTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getHrvType() {
        return this.hrvType;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getMemberId() {
        return this.memberId;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final long getMessageId() {
        return this.messageId;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getMessageSubType() {
        return this.messageSubType;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getNoticeType() {
        return this.noticeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDataType() {
        return this.dataType;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getResourceType() {
        return this.resourceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getResource() {
        return this.resource;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getSubText() {
        return this.subText;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getFollowStatus() {
        return this.followStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDay() {
        return this.day;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFolloweeId() {
        return this.followeeId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFromFirstCommentId() {
        return this.fromFirstCommentId;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFromPostId() {
        return this.fromPostId;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getFromSecondCommentId() {
        return this.fromSecondCommentId;
    }

    @NotNull
    public final SubMessageBean copy(@Nullable Integer count, @Nullable String dataType, @Nullable String day, @Nullable String description, @Nullable String followeeId, @Nullable String from, @Nullable String fromFirstCommentId, @Nullable String fromPostId, @Nullable String fromSecondCommentId, @Nullable String fromTopicId, @Nullable Long generateTime, @Nullable Long generatedTime, @Nullable String hrvType, @Nullable String iconUrl, @Nullable String memberId, long messageId, @Nullable String messageSubType, @Nullable String nickName, @Nullable String noticeType, @Nullable String status, @Nullable String subType, @Nullable String text, @Nullable String title, @Nullable String type, @Nullable String resourceType, @Nullable String resource, @Nullable String subText, @Nullable String followStatus) {
        return new SubMessageBean(count, dataType, day, description, followeeId, from, fromFirstCommentId, fromPostId, fromSecondCommentId, fromTopicId, generateTime, generatedTime, hrvType, iconUrl, memberId, messageId, messageSubType, nickName, noticeType, status, subType, text, title, type, resourceType, resource, subText, followStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubMessageBean)) {
            return false;
        }
        SubMessageBean subMessageBean = (SubMessageBean) other;
        return Intrinsics.areEqual(this.count, subMessageBean.count) && Intrinsics.areEqual(this.dataType, subMessageBean.dataType) && Intrinsics.areEqual(this.day, subMessageBean.day) && Intrinsics.areEqual(this.description, subMessageBean.description) && Intrinsics.areEqual(this.followeeId, subMessageBean.followeeId) && Intrinsics.areEqual(this.from, subMessageBean.from) && Intrinsics.areEqual(this.fromFirstCommentId, subMessageBean.fromFirstCommentId) && Intrinsics.areEqual(this.fromPostId, subMessageBean.fromPostId) && Intrinsics.areEqual(this.fromSecondCommentId, subMessageBean.fromSecondCommentId) && Intrinsics.areEqual(this.fromTopicId, subMessageBean.fromTopicId) && Intrinsics.areEqual(this.generateTime, subMessageBean.generateTime) && Intrinsics.areEqual(this.generatedTime, subMessageBean.generatedTime) && Intrinsics.areEqual(this.hrvType, subMessageBean.hrvType) && Intrinsics.areEqual(this.iconUrl, subMessageBean.iconUrl) && Intrinsics.areEqual(this.memberId, subMessageBean.memberId) && this.messageId == subMessageBean.messageId && Intrinsics.areEqual(this.messageSubType, subMessageBean.messageSubType) && Intrinsics.areEqual(this.nickName, subMessageBean.nickName) && Intrinsics.areEqual(this.noticeType, subMessageBean.noticeType) && Intrinsics.areEqual(this.status, subMessageBean.status) && Intrinsics.areEqual(this.subType, subMessageBean.subType) && Intrinsics.areEqual(this.text, subMessageBean.text) && Intrinsics.areEqual(this.title, subMessageBean.title) && Intrinsics.areEqual(this.type, subMessageBean.type) && Intrinsics.areEqual(this.resourceType, subMessageBean.resourceType) && Intrinsics.areEqual(this.resource, subMessageBean.resource) && Intrinsics.areEqual(this.subText, subMessageBean.subText) && Intrinsics.areEqual(this.followStatus, subMessageBean.followStatus);
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final String getDataType() {
        return this.dataType;
    }

    @Nullable
    public final String getDay() {
        return this.day;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getFollowStatus() {
        return this.followStatus;
    }

    @Nullable
    public final String getFolloweeId() {
        return this.followeeId;
    }

    @Nullable
    public final String getFrom() {
        return this.from;
    }

    @Nullable
    public final String getFromFirstCommentId() {
        return this.fromFirstCommentId;
    }

    @Nullable
    public final String getFromPostId() {
        return this.fromPostId;
    }

    @Nullable
    public final String getFromSecondCommentId() {
        return this.fromSecondCommentId;
    }

    @Nullable
    public final String getFromTopicId() {
        return this.fromTopicId;
    }

    @Nullable
    public final Long getGenerateTime() {
        return this.generateTime;
    }

    @Nullable
    public final Long getGeneratedTime() {
        return this.generatedTime;
    }

    @Nullable
    public final String getHrvType() {
        return this.hrvType;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getMemberId() {
        return this.memberId;
    }

    public final long getMessageId() {
        return this.messageId;
    }

    @Nullable
    public final String getMessageSubType() {
        return this.messageSubType;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    public final String getNoticeType() {
        return this.noticeType;
    }

    @Nullable
    public final String getResource() {
        return this.resource;
    }

    @Nullable
    public final String getResourceType() {
        return this.resourceType;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getSubText() {
        return this.subText;
    }

    @Nullable
    public final String getSubType() {
        return this.subType;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        Integer num = this.count;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.dataType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.day;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.followeeId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.from;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fromFirstCommentId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.fromPostId;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.fromSecondCommentId;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.fromTopicId;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l = this.generateTime;
        int iHashCode11 = (iHashCode10 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.generatedTime;
        int iHashCode12 = (iHashCode11 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str10 = this.hrvType;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.iconUrl;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.memberId;
        int iHashCode15 = (((iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31) + defpackage.b.a(this.messageId)) * 31;
        String str13 = this.messageSubType;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.nickName;
        int iHashCode17 = (iHashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.noticeType;
        int iHashCode18 = (iHashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.status;
        int iHashCode19 = (iHashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.subType;
        int iHashCode20 = (iHashCode19 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.text;
        int iHashCode21 = (iHashCode20 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.title;
        int iHashCode22 = (iHashCode21 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.type;
        int iHashCode23 = (iHashCode22 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.resourceType;
        int iHashCode24 = (iHashCode23 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.resource;
        int iHashCode25 = (iHashCode24 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.subText;
        int iHashCode26 = (iHashCode25 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.followStatus;
        return iHashCode26 + (str24 != null ? str24.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SubMessageBean(count=" + this.count + ", dataType=" + ((Object) this.dataType) + ", day=" + ((Object) this.day) + ", description=" + ((Object) this.description) + ", followeeId=" + ((Object) this.followeeId) + ", from=" + ((Object) this.from) + ", fromFirstCommentId=" + ((Object) this.fromFirstCommentId) + ", fromPostId=" + ((Object) this.fromPostId) + ", fromSecondCommentId=" + ((Object) this.fromSecondCommentId) + ", fromTopicId=" + ((Object) this.fromTopicId) + ", generateTime=" + this.generateTime + ", generatedTime=" + this.generatedTime + ", hrvType=" + ((Object) this.hrvType) + ", iconUrl=" + ((Object) this.iconUrl) + ", memberId=" + ((Object) this.memberId) + ", messageId=" + this.messageId + ", messageSubType=" + ((Object) this.messageSubType) + ", nickName=" + ((Object) this.nickName) + ", noticeType=" + ((Object) this.noticeType) + ", status=" + ((Object) this.status) + ", subType=" + ((Object) this.subType) + ", text=" + ((Object) this.text) + ", title=" + ((Object) this.title) + ", type=" + ((Object) this.type) + ", resourceType=" + ((Object) this.resourceType) + ", resource=" + ((Object) this.resource) + ", subText=" + ((Object) this.subText) + ", followStatus=" + ((Object) this.followStatus) + ')';
    }

    public SubMessageBean(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Long l, @Nullable Long l2, @Nullable String str10, @Nullable String str11, @Nullable String str12, long j, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24) {
        this.count = num;
        this.dataType = str;
        this.day = str2;
        this.description = str3;
        this.followeeId = str4;
        this.from = str5;
        this.fromFirstCommentId = str6;
        this.fromPostId = str7;
        this.fromSecondCommentId = str8;
        this.fromTopicId = str9;
        this.generateTime = l;
        this.generatedTime = l2;
        this.hrvType = str10;
        this.iconUrl = str11;
        this.memberId = str12;
        this.messageId = j;
        this.messageSubType = str13;
        this.nickName = str14;
        this.noticeType = str15;
        this.status = str16;
        this.subType = str17;
        this.text = str18;
        this.title = str19;
        this.type = str20;
        this.resourceType = str21;
        this.resource = str22;
        this.subText = str23;
        this.followStatus = str24;
    }

    public /* synthetic */ SubMessageBean(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l, Long l2, String str10, String str11, String str12, long j, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : l, (i & 2048) != 0 ? null : l2, (i & 4096) != 0 ? null : str10, (i & 8192) != 0 ? null : str11, (i & 16384) != 0 ? null : str12, (i & 32768) != 0 ? 0L : j, (i & 65536) != 0 ? null : str13, (i & 131072) != 0 ? null : str14, (i & 262144) != 0 ? null : str15, (i & 524288) != 0 ? null : str16, (i & 1048576) != 0 ? null : str17, (i & 2097152) != 0 ? null : str18, (i & 4194304) != 0 ? null : str19, (i & 8388608) != 0 ? null : str20, (i & 16777216) != 0 ? null : str21, (i & 33554432) != 0 ? null : str22, (i & 67108864) != 0 ? null : str23, (i & AMapEngineUtils.HALF_MAX_P20_WIDTH) != 0 ? null : str24);
    }
}
