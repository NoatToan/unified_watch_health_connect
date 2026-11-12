package com.huami.training.utils;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.stats.CodePackage;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CalculationEventBuilder;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.analytics.builder.ExceptionEventBuilder;
import com.huami.tools.analytics.DbUtils;
import com.huami.training.dto.PromotePlace;
import com.huami.training.vo.TagVo;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0003\b\u00ad\u0001\bÀ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002J\"\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002J3\u0010\f\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\f\u0010\u000f\u001a\u00020\u0004*\u00020\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u0012\u001a\u00020\u0003J\u0006\u0010\u0013\u001a\u00020\u0003J\u0010\u0010\u0015\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0007J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0007J\"\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0007J\"\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0007J\u0006\u0010\u001d\u001a\u00020\u0003J\u0006\u0010\u001e\u001a\u00020\u0003J\u000e\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0004J\u000e\u0010 \u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\nJ\u000e\u0010!\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\nJ\u0006\u0010\"\u001a\u00020\u0003J\u0006\u0010#\u001a\u00020\u0003J\u0010\u0010%\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010\u0004J\u0016\u0010)\u001a\u00020\u00032\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&J\"\u0010,\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010\u0017\u001a\u00020\u0007J\"\u0010-\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010\u0017\u001a\u00020\u0007J\u0010\u0010.\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010\u0004J\u0010\u00100\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010\u0004J\u0010\u00101\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004J\u0006\u00102\u001a\u00020\u0003J\u0006\u00103\u001a\u00020\u0003J\"\u00105\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u00104\u001a\u0004\u0018\u00010\u0004J\"\u00106\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*2\b\u0010$\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004J\u0006\u00107\u001a\u00020\u0003J\u0006\u00108\u001a\u00020\u0003J\u0006\u00109\u001a\u00020\u0003J\u0010\u0010:\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010\u0004J\"\u0010<\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010;\u001a\u0004\u0018\u00010\u0004J\"\u0010=\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u00020*2\b\u0010;\u001a\u0004\u0018\u00010\u0004J\u001a\u0010?\u001a\u00020\u00032\b\u0010>\u001a\u0004\u0018\u00010\u00042\b\u0010;\u001a\u0004\u0018\u00010\u0004J\u0018\u0010@\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u00020*J\u0018\u0010A\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u00020*J\u0006\u0010B\u001a\u00020\u0003J\u0006\u0010C\u001a\u00020\u0003J\u0006\u0010D\u001a\u00020\u0003J\u0006\u0010E\u001a\u00020\u0003J\u0006\u0010F\u001a\u00020\u0003J\u000e\u0010G\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nJ\u0017\u0010H\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\bH\u0010IJ\u000e\u0010J\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nJ\u0017\u0010K\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\bK\u0010IJ\u0006\u0010L\u001a\u00020\u0003J\u0006\u0010M\u001a\u00020\u0003J\u000e\u0010O\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\nJ\u001e\u0010Q\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010P\u001a\u00020\u000eJ\u001e\u0010R\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010P\u001a\u00020\u000eJ\u0006\u0010S\u001a\u00020\u0003J\u000e\u0010T\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\nR\u0016\u0010V\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010UR\u0016\u0010X\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bW\u0010UR\u0016\u0010Y\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010UR\u0016\u0010[\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bZ\u0010UR\u0016\u0010\\\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0002\u0010UR\u0016\u0010]\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010UR\u0016\u0010_\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b^\u0010UR\u0016\u0010a\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b`\u0010UR\u0016\u0010c\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bb\u0010UR\u0016\u0010e\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bd\u0010UR\u0016\u0010g\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bf\u0010UR\u0016\u0010i\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bh\u0010UR\u0016\u0010k\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bj\u0010UR\u0016\u0010m\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bl\u0010UR\u0016\u0010o\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bn\u0010UR\u0016\u0010q\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bp\u0010UR\u0016\u0010s\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\br\u0010UR\u0016\u0010u\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bt\u0010UR\u0016\u0010w\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bv\u0010UR\u0016\u0010y\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bx\u0010UR\u0016\u0010{\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bz\u0010UR\u0016\u0010}\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b|\u0010UR\u0016\u0010\u007f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b~\u0010UR\u0018\u0010\u0081\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010UR\u0018\u0010\u0083\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010UR\u0018\u0010\u0085\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010UR\u0018\u0010\u0087\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010UR\u0018\u0010\u0089\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010UR\u0018\u0010\u008b\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010UR\u0018\u0010\u008d\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010UR\u0018\u0010\u008f\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010UR\u0018\u0010\u0091\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010UR\u0018\u0010\u0093\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010UR\u0018\u0010\u0095\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010UR\u0018\u0010\u0097\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010UR\u0018\u0010\u0099\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010UR\u0018\u0010\u009b\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010UR\u0018\u0010\u009d\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010UR\u0018\u0010\u009f\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u009e\u0001\u0010UR\u0018\u0010 \u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010UR\u0018\u0010¢\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b¡\u0001\u0010UR\u0018\u0010¤\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b£\u0001\u0010UR\u0018\u0010¦\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b¥\u0001\u0010UR\u0018\u0010¨\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b§\u0001\u0010UR\u0018\u0010ª\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b©\u0001\u0010UR\u0018\u0010¬\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b«\u0001\u0010UR\u0018\u0010®\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u00ad\u0001\u0010UR\u0018\u0010°\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b¯\u0001\u0010UR\u0018\u0010²\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b±\u0001\u0010UR\u0018\u0010´\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b³\u0001\u0010UR\u0018\u0010¶\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\bµ\u0001\u0010UR\u0018\u0010¸\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b·\u0001\u0010UR\u0018\u0010º\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b¹\u0001\u0010UR\u0018\u0010¼\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b»\u0001\u0010UR\u0018\u0010¾\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b½\u0001\u0010UR\u0018\u0010À\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b¿\u0001\u0010UR\u0018\u0010Â\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\bÁ\u0001\u0010UR\u0018\u0010Ä\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\bÃ\u0001\u0010UR\u0018\u0010Æ\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\bÅ\u0001\u0010UR\u0018\u0010È\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\bÇ\u0001\u0010UR\u0018\u0010Ê\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\bÉ\u0001\u0010UR\u0018\u0010Ì\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\bË\u0001\u0010UR\u0018\u0010Î\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\bÍ\u0001\u0010UR\u0018\u0010Ð\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\bÏ\u0001\u0010UR\u0018\u0010Ò\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\bÑ\u0001\u0010UR\u0018\u0010Ô\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\bÓ\u0001\u0010U¨\u0006×\u0001"}, d2 = {"Lcom/huami/training/utils/AnalyticsHelper;", "", "e", "", "", DbUtils.Const.Columns.Event.EVENT_ID, "fr", "", "isAlsoIdentified", "c", "", BloodPressureConst.ParamKey.PLANID, "a", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Z)V", "Lcom/huami/training/dto/PromotePlace;", "f", "tag", "countKingKongIconClicked", "recordDefaultSearchCourseEvent", "countSearchAction", "courseId", "countSearchListItemVisit", "id", "isSpecial", "countTopicEvent", "countTopicVisit", "isLeft", "countTopicShortVisit", "countTopicShort", "countStartTraining", "countContinueCourse", "countCourseClickedInCourseJoinPage", "countJoinedCourseClickedInFitness", "countJoinedCourseVisitInFitness", "countCourseMore", "countCourseMoreInFitness", "tagName", "countCourseTag", "", "Lcom/huami/training/vo/TagVo;", AnalyticsHelper.TAGS, "countCourseTagVisit", "", "position", "countBannerHot", "countBannerItemVisit", "countSearchCourseTag", "searchKey", "countSearchEvent", "countSearchResultClicked", "countCourseMoreVisit", "countCourseMoreVisitInFitness", "labelName", "countCourseTodayClicked", "countCourseVisitInTag", "countAddCourseClicked", "countAddCourseVisitInFitness", "countAddCourseClickedInFitness", "countSearchTagVisit", "pageType", "countAllCourseListItemVisit", "countAllCourseListItemClicked", "pageName", "countCourseTabItemVisit", "countLookItemClicked", "countLookItemVisit", "countLookLoadMore", "countStartPlanVisitInFitness", "countStartPlanVisitInCourse", "countStartPlanClickInFitness", "countStartPlanClickInCourse", "countContinuePlanVisitInFitness", "countContinuePlanVisitInCourse", "(Ljava/lang/Long;)V", "countContinuePlanClickInFitness", "countContinuePlanClickInCourse", "countCourseContinueVisit", "countMainCourseVisit", "duration", "calculationMainCoursePageDuration", "promotePlace", "countPromotionalCourseVisit", "countPromotionalCourseClick", "countFitPageVisit", "calculationFitPageDuration", "Ljava/lang/String;", "debugTag", "b", AnalyticsHelper.COURSE_SEARCH_C, AnalyticsHelper.COURSE_LIST_C, GoogleApiAvailabilityLight.a, AnalyticsHelper.COURSE_LIST_V, AnalyticsHelper.COURSE_CAROUSEL_C, AnalyticsHelper.COURSE_CAROUSEL_V, "g", AnalyticsHelper.COURSE_SPECIAL_C, "h", AnalyticsHelper.COURSE_SPECIAL_V, "i", AnalyticsHelper.COURSE_CONTINUE_C, z.j, AnalyticsHelper.PLAN_START_C, hl.k, AnalyticsHelper.PLAN_START_V, "l", AnalyticsHelper.PLAN_CONTINUE_C, "m", AnalyticsHelper.PLAN_CONTINUE_V, "n", AnalyticsHelper.COURSE_MORE_C, "o", AnalyticsHelper.COURSE_MORE_V, b.r, "COURSE_C", DTransferConstants.SEARCH_KEY, "COURSE_V", "r", AnalyticsHelper.COURSE_ADD_V, SOAP.XMLNS, AnalyticsHelper.COURSE_ADD_C, "t", AnalyticsHelper.COURSE_SEARCH_TAGS_C, "u", AnalyticsHelper.COURSE_SEARCH_PAGE_C, "v", AnalyticsHelper.COURSE_SEARCH_PAGE_V, "w", AnalyticsHelper.COURSE_TAGS_V, "x", AnalyticsHelper.COURSE_LIST_TAB_V, "y", AnalyticsHelper.COURSE_LOAD_E, "z", AnalyticsHelper.COURSE_CONTINUE_V, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "BASE_TAB_V", "B", "BASE_TAB_T", "C", "SPORT_TOP_TAB_V", LogUtil.D, "SPORT_TOP_TAB_T", "E", "ID", "F", "FR", "G", "TP", "H", "TAG", LogUtil.I, "N", "J", "TAGS", "K", "TIME", "L", "WALK", "M", "WALK_AFTER", "RIDE", "O", "RIDE_AFTER", "P", "RUN", "Q", "RUN_OUTER", "R", "RUN_OUTER_AFTER", ExifInterface.LATITUDE_SOUTH, "RUN_INNER", ExifInterface.GPS_DIRECTION_TRUE, "RUN_INNER_AFTER", "U", CodePackage.FITNESS, "V", "FITNESS_AFTER", "W", "START", "X", "CONTINUE", "Y", "COURSE_TOP", "Z", "COURSE", "a0", "SPECIAL", "b0", "V_LONG", "c0", "LEFT_SHORT", "d0", "RIGHT_SHORT", "e0", "TODAY", "f0", "HOT", "g0", "POS", "h0", ViewHierarchyConstants.SEARCH, "i0", "COURSE_SEARCH", "j0", "COURSE_LIST", "k0", "KINGKONG", "l0", "COURSE_JOIN", "m0", "FITNESS_JOIN", "n0", "LOOK", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class AnalyticsHelper {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private static final String BASE_TAB_V = "BASE_TAB_V";

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private static final String BASE_TAB_T = "BASE_TAB_T";

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    private static final String SPORT_TOP_TAB_V = "SPORT_TOP_TAB_V";

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private static final String SPORT_TOP_TAB_T = "SPORT_TOP_TAB_T";

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    private static final String ID = "id";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    private static final String FR = "fr";

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    private static final String TP = "tp";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "tag";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    private static final String N = "n";

    @NotNull
    public static final AnalyticsHelper INSTANCE = new AnalyticsHelper();

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    private static final String TAGS = "tags";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    private static final String TIME = "time";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    private static final String WALK = "walk";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @NotNull
    private static final String WALK_AFTER = "finish_walk";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @NotNull
    private static final String RIDE = "ride";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @NotNull
    private static final String RIDE_AFTER = "finish_ride";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @NotNull
    private static final String RUN = "run";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @NotNull
    private static final String RUN_OUTER = "run_outer";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    private static final String RUN_OUTER_AFTER = "finish_run_outer";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    private static final String RUN_INNER = "run_inner";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    private static final String RUN_INNER_AFTER = "finish_run_inner";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    private static final String FITNESS = "fitness";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @NotNull
    private static final String FITNESS_AFTER = "finish_fitness";

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @NotNull
    private static final String START = "start";

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @NotNull
    private static final String CONTINUE = "continue";

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @NotNull
    private static final String COURSE_TOP = "course_top";

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @NotNull
    private static final String COURSE = "course";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String debugTag = "AnalyticsHelper";

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    @NotNull
    private static final String SPECIAL = "special";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String COURSE_SEARCH_C = "COURSE_SEARCH_C";

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    @NotNull
    private static final String V_LONG = "long";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String COURSE_LIST_C = "COURSE_LIST_C";

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    @NotNull
    private static final String LEFT_SHORT = "left_short";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String COURSE_LIST_V = "COURSE_LIST_V";

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    @NotNull
    private static final String RIGHT_SHORT = "right_short";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String COURSE_CAROUSEL_C = "COURSE_CAROUSEL_C";

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    @NotNull
    private static final String TODAY = "today";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final String COURSE_CAROUSEL_V = "COURSE_CAROUSEL_V";

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    @NotNull
    private static final String HOT = "hot";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final String COURSE_SPECIAL_C = "COURSE_SPECIAL_C";

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    @NotNull
    private static final String POS = "pos";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private static final String COURSE_SPECIAL_V = "COURSE_SPECIAL_V";

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    @NotNull
    private static final String SEARCH = "search";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private static final String COURSE_CONTINUE_C = "COURSE_CONTINUE_C";

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    @NotNull
    private static final String COURSE_SEARCH = "course_search";

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private static final String PLAN_START_C = "PLAN_START_C";

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    @NotNull
    private static final String COURSE_LIST = "course_list";

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private static final String PLAN_START_V = "PLAN_START_V";

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    @NotNull
    private static final String KINGKONG = "kingkong";

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private static final String PLAN_CONTINUE_C = "PLAN_CONTINUE_C";

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    @NotNull
    private static final String COURSE_JOIN = "course_join";

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private static final String PLAN_CONTINUE_V = "PLAN_CONTINUE_V";

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    @NotNull
    private static final String FITNESS_JOIN = "fitness_join";

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private static final String COURSE_MORE_C = "COURSE_MORE_C";

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    @NotNull
    private static final String LOOK = "look";

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private static final String COURSE_MORE_V = "COURSE_MORE_V";

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private static final String COURSE_C = "COURSE_C";

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private static final String COURSE_V = "COURSE_V";

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private static final String COURSE_ADD_V = "COURSE_ADD_V";

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private static final String COURSE_ADD_C = "COURSE_ADD_C";

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private static final String COURSE_SEARCH_TAGS_C = "COURSE_SEARCH_TAGS_C";

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private static final String COURSE_SEARCH_PAGE_C = "COURSE_SEARCH_PAGE_C";

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private static final String COURSE_SEARCH_PAGE_V = "COURSE_SEARCH_PAGE_V";

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private static final String COURSE_TAGS_V = "COURSE_TAGS_V";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private static final String COURSE_LIST_TAB_V = "COURSE_LIST_TAB_V";

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private static final String COURSE_LOAD_E = "COURSE_LOAD_E";

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private static final String COURSE_CONTINUE_V = "COURSE_CONTINUE_V";

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PromotePlace.values().length];
            iArr[PromotePlace.BEFORE_RUNNING_INDOOR.ordinal()] = 1;
            iArr[PromotePlace.BEFORE_RUNNING_OUTDOOR.ordinal()] = 2;
            iArr[PromotePlace.BEFORE_RACE_WALKING.ordinal()] = 3;
            iArr[PromotePlace.AFTER_RACE_WALKING.ordinal()] = 4;
            iArr[PromotePlace.AFTER_RUNNING_INDOOR.ordinal()] = 5;
            iArr[PromotePlace.AFTER_RUNNING_OUTDOOR.ordinal()] = 6;
            iArr[PromotePlace.BEFORE_CYCLING.ordinal()] = 7;
            iArr[PromotePlace.AFTER_CYCLING.ordinal()] = 8;
            iArr[PromotePlace.BEFORE_FITNESS.ordinal()] = 9;
            iArr[PromotePlace.AFTER_FITNESS.ordinal()] = 10;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/training/vo/TagVo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<TagVo, CharSequence> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull TagVo tagVo) {
            return tagVo.getName();
        }
    }

    private AnalyticsHelper() {
    }

    private final void a(Long planId, String eventId, String fr, boolean isAlsoIdentified) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(eventId);
        countEventBuilder.setAnonymous(true);
        countEventBuilder.setIdentified(isAlsoIdentified);
        countEventBuilder.addExtra("id", String.valueOf(planId));
        countEventBuilder.addExtra("fr", fr);
        Unit unit = Unit.INSTANCE;
        e(countEventBuilder);
    }

    public static /* synthetic */ void b(AnalyticsHelper analyticsHelper, Long l, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        analyticsHelper.a(l, str, str2, z);
    }

    private final void c(String eventId, String fr, boolean isAlsoIdentified) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(eventId);
        countEventBuilder.setAnonymous(true);
        countEventBuilder.setIdentified(isAlsoIdentified);
        countEventBuilder.addExtra("fr", fr);
        Unit unit = Unit.INSTANCE;
        e(countEventBuilder);
    }

    public static /* synthetic */ void countBannerHot$default(AnalyticsHelper analyticsHelper, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        analyticsHelper.countBannerHot(str, i, z);
    }

    public static /* synthetic */ void countBannerItemVisit$default(AnalyticsHelper analyticsHelper, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        analyticsHelper.countBannerItemVisit(str, i, z);
    }

    public static /* synthetic */ void countTopicEvent$default(AnalyticsHelper analyticsHelper, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        analyticsHelper.countTopicEvent(str, z);
    }

    public static /* synthetic */ void countTopicShort$default(AnalyticsHelper analyticsHelper, boolean z, String str, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        analyticsHelper.countTopicShort(z, str, z2);
    }

    public static /* synthetic */ void countTopicShortVisit$default(AnalyticsHelper analyticsHelper, boolean z, String str, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        analyticsHelper.countTopicShortVisit(z, str, z2);
    }

    public static /* synthetic */ void countTopicVisit$default(AnalyticsHelper analyticsHelper, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        analyticsHelper.countTopicVisit(str, z);
    }

    public static /* synthetic */ void d(AnalyticsHelper analyticsHelper, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        analyticsHelper.c(str, str2, z);
    }

    private final void e(Object e) {
        try {
            if (e instanceof CountEventBuilder) {
                Analytics.recordEvent((CountEventBuilder) e);
            } else if (e instanceof CalculationEventBuilder) {
                Analytics.recordEvent((CalculationEventBuilder) e);
            } else if (e instanceof ExceptionEventBuilder) {
                Analytics.recordEvent((ExceptionEventBuilder) e);
            } else {
                Log.e(debugTag, "no analytics type.");
            }
        } catch (Throwable th) {
            Log.e(debugTag, "error", th);
        }
    }

    private final String f(PromotePlace promotePlace) {
        switch (WhenMappings.$EnumSwitchMapping$0[promotePlace.ordinal()]) {
            case 1:
                return "run_inner";
            case 2:
                return "run_outer";
            case 3:
                return "walk";
            case 4:
                return "finish_walk";
            case 5:
                return "finish_run_inner";
            case 6:
                return "finish_run_outer";
            case 7:
                return "ride";
            case 8:
                return "finish_ride";
            case 9:
                return "fitness";
            case 10:
                return "finish_fitness";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void calculationFitPageDuration(long duration) {
        CalculationEventBuilder calculationEventBuilder = new CalculationEventBuilder("SPORT_TOP_TAB_T", duration);
        calculationEventBuilder.addExtra("fr", "fitness");
        calculationEventBuilder.addExtra("time", String.valueOf(duration));
        Unit unit = Unit.INSTANCE;
        e(calculationEventBuilder);
    }

    public final void calculationMainCoursePageDuration(long duration) {
        CalculationEventBuilder calculationEventBuilder = new CalculationEventBuilder("BASE_TAB_T", duration);
        calculationEventBuilder.setAnonymous(true);
        calculationEventBuilder.setIdentified(true);
        calculationEventBuilder.addExtra("tp", "course");
        calculationEventBuilder.addExtra("time", String.valueOf(duration));
        Unit unit = Unit.INSTANCE;
        e(calculationEventBuilder);
    }

    public final void countAddCourseClicked() {
        e(new CountEventBuilder(COURSE_ADD_C).setAnonymous(true).setIdentified(true).addExtra("fr", COURSE_JOIN));
    }

    public final void countAddCourseClickedInFitness() {
        e(new CountEventBuilder(COURSE_ADD_C).setAnonymous(true).setIdentified(true).addExtra("fr", FITNESS_JOIN));
    }

    public final void countAddCourseVisitInFitness() {
        e(new CountEventBuilder(COURSE_ADD_V).addExtra("fr", FITNESS_JOIN));
    }

    public final void countAllCourseListItemClicked(@Nullable String courseId, int position, @Nullable String pageType) {
        boolean z = true;
        int i = position + 1;
        CountEventBuilder countEventBuilder = new CountEventBuilder("COURSE_C");
        if (pageType != null && pageType.length() != 0) {
            z = false;
        }
        if (z) {
            pageType = "ALL";
        }
        e(countEventBuilder.addExtra("fr", pageType).addExtra("id", courseId).addExtra("pos", String.valueOf(i)));
    }

    public final void countAllCourseListItemVisit(int position, @Nullable String courseId, @Nullable String pageType) {
        boolean z = true;
        CountEventBuilder countEventBuilderAddExtra = new CountEventBuilder("COURSE_V").addExtra("pos", String.valueOf(position + 1)).addExtra("id", courseId);
        if (pageType != null && pageType.length() != 0) {
            z = false;
        }
        if (z) {
            pageType = "ALL";
        }
        e(countEventBuilderAddExtra.addExtra("fr", pageType));
    }

    public final void countBannerHot(@Nullable String id, int position, boolean isSpecial) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(COURSE_CAROUSEL_C);
        countEventBuilder.setAnonymous(true);
        countEventBuilder.setIdentified(true);
        countEventBuilder.addExtra("pos", String.valueOf(position + 1));
        countEventBuilder.addExtra("id", id);
        countEventBuilder.addExtra("fr", HOT);
        e(countEventBuilder.addExtra("tp", isSpecial ? SPECIAL : "course"));
    }

    public final void countBannerItemVisit(@Nullable String id, int position, boolean isSpecial) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(COURSE_CAROUSEL_V);
        countEventBuilder.setAnonymous(true);
        countEventBuilder.setIdentified(true);
        countEventBuilder.addExtra("pos", String.valueOf(position + 1));
        countEventBuilder.addExtra("id", id);
        countEventBuilder.addExtra("fr", HOT);
        e(countEventBuilder.addExtra("tp", isSpecial ? SPECIAL : "course"));
    }

    public final void countContinueCourse() {
        e(new CountEventBuilder(COURSE_CONTINUE_C).addExtra("fr", "course"));
    }

    public final void countContinuePlanClickInCourse(@Nullable Long planId) {
        b(this, planId, PLAN_CONTINUE_C, "course", false, 8, null);
    }

    public final void countContinuePlanClickInFitness(long planId) {
        a(Long.valueOf(planId), PLAN_CONTINUE_C, "fitness", true);
    }

    public final void countContinuePlanVisitInCourse(@Nullable Long planId) {
        b(this, planId, PLAN_CONTINUE_V, "course", false, 8, null);
    }

    public final void countContinuePlanVisitInFitness(long planId) {
        a(Long.valueOf(planId), PLAN_CONTINUE_V, "fitness", true);
    }

    public final void countCourseClickedInCourseJoinPage(@NotNull String courseId) {
        e(new CountEventBuilder("COURSE_C").setAnonymous(true).setIdentified(true).addExtra("id", courseId).addExtra("fr", COURSE_JOIN));
    }

    public final void countCourseContinueVisit() {
        e(new CountEventBuilder(COURSE_CONTINUE_V).addExtra("fr", "course"));
    }

    public final void countCourseMore() {
        e(new CountEventBuilder(COURSE_MORE_C).addExtra("fr", TODAY));
    }

    public final void countCourseMoreInFitness() {
        e(new CountEventBuilder(COURSE_MORE_C).addExtra("fr", FITNESS_JOIN));
    }

    public final void countCourseMoreVisit() {
        e(new CountEventBuilder(COURSE_MORE_V).addExtra("fr", TODAY));
    }

    public final void countCourseMoreVisitInFitness() {
        e(new CountEventBuilder(COURSE_MORE_V).setAnonymous(true).setIdentified(true).addExtra("fr", FITNESS_JOIN));
    }

    public final void countCourseTabItemVisit(@Nullable String pageName, @Nullable String pageType) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(COURSE_LIST_TAB_V);
        if (pageType == null || pageType.length() == 0) {
            pageType = "ALL";
        }
        e(countEventBuilder.addExtra("fr", pageType).addExtra("n", pageName));
    }

    public final void countCourseTag(@Nullable String tagName) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(COURSE_LIST_C);
        countEventBuilder.setAnonymous(true);
        countEventBuilder.setIdentified(true);
        countEventBuilder.addExtra("fr", TODAY);
        countEventBuilder.addExtra("tp", "tag");
        e(countEventBuilder.addExtra("n", tagName));
    }

    public final void countCourseTagVisit(@Nullable List<TagVo> tags) {
        e(new CountEventBuilder(COURSE_TAGS_V).setAnonymous(true).setIdentified(true).addExtra(TAGS, tags == null ? null : CollectionsKt___CollectionsKt.joinToString$default(tags, null, null, null, 0, null, a.a, 31, null)));
    }

    public final void countCourseTodayClicked(int position, @Nullable String courseId, @Nullable String labelName) {
        CountEventBuilder countEventBuilder = new CountEventBuilder("COURSE_C");
        countEventBuilder.setAnonymous(true);
        countEventBuilder.setIdentified(true);
        countEventBuilder.addExtra("pos", String.valueOf(position + 1));
        countEventBuilder.addExtra("id", courseId);
        countEventBuilder.addExtra("fr", TODAY);
        e(countEventBuilder.addExtra("n", labelName));
    }

    public final void countCourseVisitInTag(int position, @Nullable String tagName, @Nullable String courseId) {
        e(new CountEventBuilder("COURSE_V").setAnonymous(true).setIdentified(true).addExtra("fr", TODAY).addExtra("n", tagName).addExtra("id", courseId).addExtra("pos", String.valueOf(position + 1)));
    }

    public final void countFitPageVisit() {
        CountEventBuilder countEventBuilder = new CountEventBuilder("SPORT_TOP_TAB_V");
        countEventBuilder.addExtra("fr", "fitness");
        Unit unit = Unit.INSTANCE;
        e(countEventBuilder);
    }

    public final void countJoinedCourseClickedInFitness(long courseId) {
        e(new CountEventBuilder("COURSE_C").setAnonymous(true).setIdentified(true).addExtra("id", String.valueOf(courseId)).addExtra("fr", FITNESS_JOIN));
    }

    public final void countJoinedCourseVisitInFitness(long courseId) {
        e(new CountEventBuilder("COURSE_V").setAnonymous(true).setIdentified(true).addExtra("id", String.valueOf(courseId)).addExtra("fr", FITNESS_JOIN));
    }

    public final void countKingKongIconClicked(@Nullable String tag) {
        boolean z = true;
        CountEventBuilder countEventBuilderAddExtra = new CountEventBuilder(COURSE_LIST_C).setAnonymous(true).setIdentified(true).addExtra("fr", KINGKONG);
        if (tag != null && tag.length() != 0) {
            z = false;
        }
        if (z) {
            tag = "ALL";
        }
        e(countEventBuilderAddExtra.addExtra("tp", tag));
    }

    public final void countLookItemClicked(@Nullable String courseId, int position) {
        CountEventBuilder countEventBuilder = new CountEventBuilder("COURSE_C");
        countEventBuilder.setAnonymous(true);
        countEventBuilder.setIdentified(true);
        countEventBuilder.addExtra("id", courseId);
        countEventBuilder.addExtra("pos", String.valueOf(position + 1));
        e(countEventBuilder.addExtra("fr", LOOK));
    }

    public final void countLookItemVisit(@Nullable String courseId, int position) {
        CountEventBuilder countEventBuilder = new CountEventBuilder("COURSE_V");
        countEventBuilder.setAnonymous(true);
        countEventBuilder.setIdentified(true);
        countEventBuilder.addExtra("id", courseId);
        countEventBuilder.addExtra("pos", String.valueOf(position + 1));
        e(countEventBuilder.addExtra("fr", LOOK));
    }

    public final void countLookLoadMore() {
        e(new CountEventBuilder(COURSE_LOAD_E));
    }

    public final void countMainCourseVisit() {
        CountEventBuilder countEventBuilder = new CountEventBuilder("BASE_TAB_V");
        countEventBuilder.addExtra("tp", "course");
        Unit unit = Unit.INSTANCE;
        countEventBuilder.setIdentified(true);
        e(countEventBuilder);
    }

    public final void countPromotionalCourseClick(int position, long courseId, @NotNull PromotePlace promotePlace) {
        CountEventBuilder countEventBuilder = new CountEventBuilder("COURSE_C");
        countEventBuilder.setAnonymous(true);
        countEventBuilder.setIdentified(true);
        countEventBuilder.addExtra("pos", String.valueOf(position));
        countEventBuilder.addExtra("id", String.valueOf(courseId));
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[promotePlace.ordinal()];
        countEventBuilder.addExtra("fr", (i == 1 || i == 2) ? "run" : INSTANCE.f(promotePlace));
        int i2 = iArr[promotePlace.ordinal()];
        String strF = (i2 == 1 || i2 == 2) ? INSTANCE.f(promotePlace) : null;
        if (strF != null) {
            countEventBuilder.addExtra("tp", strF);
        }
        Unit unit = Unit.INSTANCE;
        e(countEventBuilder);
    }

    public final void countPromotionalCourseVisit(int position, long courseId, @NotNull PromotePlace promotePlace) {
        CountEventBuilder countEventBuilder = new CountEventBuilder("COURSE_V");
        countEventBuilder.setAnonymous(true);
        countEventBuilder.setIdentified(true);
        countEventBuilder.addExtra("pos", String.valueOf(position + 1));
        countEventBuilder.addExtra("id", String.valueOf(courseId));
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[promotePlace.ordinal()];
        countEventBuilder.addExtra("fr", (i == 1 || i == 2) ? "run" : INSTANCE.f(promotePlace));
        int i2 = iArr[promotePlace.ordinal()];
        String strF = (i2 == 1 || i2 == 2) ? INSTANCE.f(promotePlace) : null;
        if (strF != null) {
            countEventBuilder.addExtra("tp", strF);
        }
        Unit unit = Unit.INSTANCE;
        e(countEventBuilder);
    }

    public final void countSearchAction() {
        e(new CountEventBuilder(COURSE_SEARCH_C).addExtra("fr", COURSE_LIST));
    }

    public final void countSearchCourseTag(@Nullable String tagName) {
        e(new CountEventBuilder(COURSE_SEARCH_TAGS_C).setAnonymous(true).setIdentified(true).addExtra("n", tagName));
    }

    public final void countSearchEvent(@Nullable String searchKey) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(COURSE_SEARCH_PAGE_C);
        countEventBuilder.setAnonymous(true);
        countEventBuilder.setIdentified(true);
        countEventBuilder.addExtra("tp", "search");
        e(countEventBuilder.addExtra("n", searchKey));
    }

    public final void countSearchListItemVisit(@Nullable String courseId) {
        e(new CountEventBuilder("COURSE_V").setAnonymous(true).setIdentified(true).addExtra("id", courseId).addExtra("fr", COURSE_SEARCH));
    }

    public final void countSearchResultClicked(@Nullable String courseId) {
        CountEventBuilder countEventBuilder = new CountEventBuilder("COURSE_C");
        countEventBuilder.setAnonymous(true);
        countEventBuilder.setIdentified(true);
        countEventBuilder.addExtra("id", courseId);
        e(countEventBuilder.addExtra("fr", COURSE_SEARCH));
    }

    public final void countSearchTagVisit(@Nullable String tags) {
        e(new CountEventBuilder(COURSE_SEARCH_PAGE_V).setAnonymous(true).setIdentified(true).addExtra(TAGS, tags));
    }

    public final void countStartPlanClickInCourse() {
        d(this, PLAN_START_C, "course", false, 4, null);
    }

    public final void countStartPlanClickInFitness() {
        c(PLAN_START_C, "fitness", true);
    }

    public final void countStartPlanVisitInCourse() {
        d(this, PLAN_START_V, "course", false, 4, null);
    }

    public final void countStartPlanVisitInFitness() {
        c(PLAN_START_V, "fitness", true);
    }

    public final void countStartTraining() {
        e(new CountEventBuilder(PLAN_START_C).addExtra("fr", "course"));
    }

    public final void countTopicEvent(@NotNull String id, boolean isSpecial) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(COURSE_SPECIAL_C);
        countEventBuilder.setAnonymous(true);
        countEventBuilder.setIdentified(true);
        String str = SPECIAL;
        countEventBuilder.addExtra("fr", SPECIAL);
        countEventBuilder.addExtra("pos", "long");
        countEventBuilder.addExtra("id", id);
        if (!isSpecial) {
            str = "course";
        }
        e(countEventBuilder.addExtra("tp", str));
    }

    public final void countTopicShort(boolean isLeft, @NotNull String id, boolean isSpecial) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(COURSE_SPECIAL_C);
        countEventBuilder.setAnonymous(true);
        countEventBuilder.setIdentified(true);
        String str = SPECIAL;
        countEventBuilder.addExtra("fr", SPECIAL);
        if (isLeft) {
            countEventBuilder.addExtra("pos", LEFT_SHORT);
        } else {
            countEventBuilder.addExtra("pos", RIGHT_SHORT);
        }
        countEventBuilder.addExtra("id", id);
        if (!isSpecial) {
            str = "course";
        }
        e(countEventBuilder.addExtra("tp", str));
    }

    public final void countTopicShortVisit(boolean isLeft, @NotNull String id, boolean isSpecial) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(COURSE_SPECIAL_V);
        countEventBuilder.setAnonymous(true);
        countEventBuilder.setIdentified(true);
        String str = SPECIAL;
        countEventBuilder.addExtra("fr", SPECIAL);
        countEventBuilder.addExtra("pos", isLeft ? LEFT_SHORT : RIGHT_SHORT);
        countEventBuilder.addExtra("id", id);
        if (!isSpecial) {
            str = "course";
        }
        e(countEventBuilder.addExtra("tp", str));
    }

    public final void countTopicVisit(@NotNull String id, boolean isSpecial) {
        CountEventBuilder identified = new CountEventBuilder(COURSE_SPECIAL_V).setAnonymous(true).setIdentified(true);
        String str = SPECIAL;
        CountEventBuilder countEventBuilderAddExtra = identified.addExtra("fr", SPECIAL).addExtra("pos", "long").addExtra("id", id);
        if (!isSpecial) {
            str = "course";
        }
        e(countEventBuilderAddExtra.addExtra("tp", str));
    }

    public final void recordDefaultSearchCourseEvent() {
        e(new CountEventBuilder(COURSE_SEARCH_C).addExtra("fr", COURSE_TOP));
    }
}
