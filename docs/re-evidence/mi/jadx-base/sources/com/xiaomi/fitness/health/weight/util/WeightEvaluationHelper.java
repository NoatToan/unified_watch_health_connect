package com.xiaomi.fitness.health.weight.util;

import android.content.res.Resources;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.baseui.widget.PercentLevel;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import com.xiaomi.fitness.health.weight.bean.WeightDataItem;
import com.xiaomi.fitness.health.weight.bean.WeightEvaluateDetail;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.util.HealthUtil;
import defpackage.c0j;
import defpackage.iji;
import defpackage.qxi;
import defpackage.xr5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\bE\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002§\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^J\u0014\u0010_\u001a\b\u0012\u0004\u0012\u00020a0`2\u0006\u0010]\u001a\u00020^J(\u0010b\u001a\b\u0012\u0004\u0012\u00020a0`2\u0006\u0010]\u001a\u00020^2\b\b\u0002\u0010c\u001a\u00020d2\b\b\u0002\u0010e\u001a\u00020\\J\u0016\u0010f\u001a\u00020\u00132\u0006\u0010g\u001a\u00020\u00132\u0006\u0010h\u001a\u00020\u0013J\u0018\u0010i\u001a\u00020\u00132\u0006\u0010j\u001a\u00020\\2\u0006\u0010h\u001a\u00020\u0013H\u0002J\u0018\u0010k\u001a\u00020\u00132\u0006\u0010g\u001a\u00020\u00132\u0006\u0010l\u001a\u00020\u0013H\u0002J\u001e\u0010m\u001a\u00020a2\u0006\u0010n\u001a\u00020o2\u0006\u0010p\u001a\u00020q2\u0006\u0010]\u001a\u00020^J\"\u0010r\u001a\u0004\u0018\u00010s2\u0006\u0010n\u001a\u00020o2\u0006\u0010t\u001a\u00020q2\u0006\u0010]\u001a\u00020^H\u0002J\u0010\u0010u\u001a\u00020\\2\u0006\u0010v\u001a\u00020oH\u0002J\u0016\u0010w\u001a\b\u0012\u0004\u0012\u00020o0`2\u0006\u0010]\u001a\u00020^H\u0002J \u0010x\u001a\u00020\\2\u0006\u0010n\u001a\u00020o2\u0006\u0010y\u001a\u00020o2\u0006\u0010]\u001a\u00020^H\u0002J \u0010z\u001a\u00020o2\u0006\u0010n\u001a\u00020o2\u0006\u0010t\u001a\u00020\u00132\u0006\u0010]\u001a\u00020^H\u0002J \u0010{\u001a\u00020\u00132\u0006\u0010n\u001a\u00020o2\u0006\u0010t\u001a\u00020\u00132\u0006\u0010]\u001a\u00020^H\u0002J\u0018\u0010|\u001a\u00020\u00052\u0006\u0010n\u001a\u00020o2\u0006\u0010t\u001a\u00020qH\u0002J\u0010\u0010}\u001a\u00020\u00052\u0006\u0010t\u001a\u00020\u0013H\u0002J\u0018\u0010~\u001a\u00020\u00052\b\b\u0002\u0010\u007f\u001a\u00020o2\u0006\u0010t\u001a\u00020\u0013J\u0011\u0010\u0080\u0001\u001a\u00020\u00052\u0006\u0010n\u001a\u00020oH\u0002J\u0019\u0010\u0081\u0001\u001a\u00020\u00052\u0006\u0010n\u001a\u00020o2\u0006\u0010]\u001a\u00020^H\u0002J \u0010\u0082\u0001\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010`2\u0006\u0010n\u001a\u00020o2\u0006\u0010]\u001a\u00020^H\u0002J\u001a\u0010\u0084\u0001\u001a\u00020\u00162\u0006\u0010n\u001a\u00020o2\u0007\u0010\u0085\u0001\u001a\u00020\u0016H\u0002J'\u0010\u0086\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0087\u00012\u0006\u0010n\u001a\u00020o2\u0007\u0010\u0085\u0001\u001a\u00020\u0016H\u0002J\u0011\u0010\u0088\u0001\u001a\u00020\u00072\u0006\u0010n\u001a\u00020oH\u0002J,\u0010\u0089\u0001\u001a\u00020\u00162\u0007\u0010\u008a\u0001\u001a\u00020\\2\u0007\u0010\u008b\u0001\u001a\u00020o2\u0007\u0010\u008c\u0001\u001a\u00020\u00132\u0006\u0010g\u001a\u00020\u0013H\u0002J\u001b\u0010\u008d\u0001\u001a\u00020\u00162\u0007\u0010\u008e\u0001\u001a\u00020\u00132\u0007\u0010\u008f\u0001\u001a\u00020\u0013H\u0002J\u001b\u0010\u0090\u0001\u001a\u00020\u00132\u0006\u0010t\u001a\u00020\u00132\b\b\u0002\u0010\u007f\u001a\u00020oH\u0002J,\u0010\u0091\u0001\u001a\u00020\u00162\u0007\u0010\u008a\u0001\u001a\u00020\\2\u0006\u0010h\u001a\u00020\u00132\u0007\u0010\u008b\u0001\u001a\u00020o2\u0007\u0010\u008c\u0001\u001a\u00020\u0013H\u0002J,\u0010\u0092\u0001\u001a\u00020\u00162\u0007\u0010\u008a\u0001\u001a\u00020\\2\u0007\u0010\u008b\u0001\u001a\u00020o2\u0007\u0010\u008c\u0001\u001a\u00020\u00132\u0006\u0010g\u001a\u00020\u0013H\u0002J\u001b\u0010\u0093\u0001\u001a\u00020\u00162\u0007\u0010\u008e\u0001\u001a\u00020\u00132\u0007\u0010\u008f\u0001\u001a\u00020\u0013H\u0002J,\u0010\u0094\u0001\u001a\u00020\u00162\u0007\u0010\u008a\u0001\u001a\u00020\\2\u0007\u0010\u008b\u0001\u001a\u00020o2\u0007\u0010\u008c\u0001\u001a\u00020\u00132\u0006\u0010g\u001a\u00020\u0013H\u0002J#\u0010\u0095\u0001\u001a\u00020\u00162\u0007\u0010\u008a\u0001\u001a\u00020\\2\u0007\u0010\u008b\u0001\u001a\u00020o2\u0006\u0010g\u001a\u00020\u0013H\u0002J\u0019\u0010\u0096\u0001\u001a\u00020\u00162\u0006\u0010n\u001a\u00020o2\u0006\u0010]\u001a\u00020^H\u0002J#\u0010\u0097\u0001\u001a\u00020\u00162\u0007\u0010\u008a\u0001\u001a\u00020\\2\u0007\u0010\u008b\u0001\u001a\u00020o2\u0006\u0010h\u001a\u00020\u0013H\u0002J#\u0010\u0098\u0001\u001a\u00020\u00162\u0007\u0010\u008a\u0001\u001a\u00020\\2\u0007\u0010\u008b\u0001\u001a\u00020o2\u0006\u0010g\u001a\u00020\u0013H\u0002J,\u0010\u0099\u0001\u001a\u00020\u00162\u0007\u0010\u008a\u0001\u001a\u00020\\2\u0007\u0010\u008b\u0001\u001a\u00020o2\u0007\u0010\u009a\u0001\u001a\u00020\u00132\u0006\u0010g\u001a\u00020\u0013H\u0002J\u001b\u0010\u009b\u0001\u001a\u00020\u00162\u0007\u0010\u008e\u0001\u001a\u00020\u00132\u0007\u0010\u008f\u0001\u001a\u00020\u0013H\u0002J$\u0010\u009c\u0001\u001a\u00020\u00162\u0007\u0010\u008a\u0001\u001a\u00020\\2\u0007\u0010\u008b\u0001\u001a\u00020o2\u0007\u0010\u008c\u0001\u001a\u00020\u0013H\u0002J\u001a\u0010\u009d\u0001\u001a\u00020\u00162\u0007\u0010\u009e\u0001\u001a\u00020o2\u0006\u0010j\u001a\u00020\\H\u0002J\u0011\u0010\u009f\u0001\u001a\u00020\u00162\u0006\u0010j\u001a\u00020\\H\u0002J\u0019\u0010 \u0001\u001a\u00020\u00072\u0006\u0010n\u001a\u00020o2\u0006\u0010]\u001a\u00020^H\u0002J$\u0010¡\u0001\u001a\u0004\u0018\u00010\u00052\u0006\u0010]\u001a\u00020^2\u0006\u0010n\u001a\u00020o2\u0007\u0010¢\u0001\u001a\u00020oH\u0002J\u000f\u0010£\u0001\u001a\u00020\u00132\u0006\u0010h\u001a\u00020\u0013J\t\u0010¤\u0001\u001a\u00020\u0013H\u0002J\u0019\u0010¥\u0001\u001a\u00020o2\u0007\u0010¦\u0001\u001a\u00020o2\u0007\u0010\u008b\u0001\u001a\u00020oR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006¨\u0001"}, d2 = {"Lcom/xiaomi/fitness/health/weight/util/WeightEvaluationHelper;", "", "<init>", "()V", "TAG", "", "COMMON_TWO_SEGMENT_COLOR", "", "COMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH", "getCOMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH", "()[I", "COMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_GOOD", "COMMON_FOUR_SEGMENT_COLOR_LOW_TO_WARNING", "COMMON_FOUR_SEGMENT_COLOR_NORMAL_TO_DANGEROUS", "COMMON_THREE_SEGMENT_SHORT_DESC", "getCOMMON_THREE_SEGMENT_SHORT_DESC", "COMMON_THREE_SEGMENT_SHORT_DESC_V1", "getCOMMON_THREE_SEGMENT_SHORT_DESC_V1", "BMI_LEVEL_1", "", "BMI_LEVEL_2", "BMI_AXIS_VALUE", "", "BMI_SEGMENT_SHORT_DESC", "BMI_SEGMENT_SHORT_DESC_V1", "BMI_SEGMENT_DETAIL_DESC", "BMI_SEGMENT_DETAIL_DESC_V1", "BODY_WATER_RATE_AXIS_VALUE_M", "BODY_WATER_RATE_AXIS_VALUE_F", "BODY_WATER_RATE_SHORT_DESC", "BODY_WATER_RATE_DETAIL_DESC", "BODY_WATER_RATE_DETAIL_DESC_V1", "FAT_RATE_AXIS_VALUE_AGE_18_39_M", "FAT_RATE_AXIS_VALUE_AGE_40_59_M", "FAT_RATE_AXIS_VALUE_AGE_60_M", "FAT_RATE_AXIS_VALUE_AGE_18_39_F", "FAT_RATE_AXIS_VALUE_AGE_40_59_F", "FAT_RATE_AXIS_VALUE_AGE_60_F", "FAT_RATE_SHORT_DESC", "FAT_RATE_SHORT_DESC_V1", "FAT_RATE_DETAIL_DESC", "FAT_MASS_DETAIL_DESC", "FAT_RATE_DETAIL_DESC_V1", "FAT_MASS_DETAIL_DESC_V1", "MUSCLE_RATE_AXIS_VALUE_M", "MUSCLE_RATE_AXIS_VALUE_F", "MUSCLE_RATE_DETAIL_DESC", "MUSCLE_MASS_HEIGHT_160_M", "MUSCLE_MASS_HEIGHT_160_170_M", "MUSCLE_MASS_HEIGHT_170_M", "MUSCLE_MASS_HEIGHT_150_F", "MUSCLE_MASS_HEIGHT_150_160_F", "MUSCLE_MASS_HEIGHT_160_F", "MUSCLE_MASS_DETAIL_DESC", "MUSCLE_MASS_DETAIL_DESC_V1", "PROTEIN_RATE_AXIS_VALUE", "PROTEIN_RATE_DETAIL_DESC", "PROTEIN_RATE_DETAIL_DESC_V1", "BONE_SALT_MASS_WEIGHT_BELOW_60_M", "BONE_SALT_MASS_WEIGHT_UP_60_M", "BONE_SALT_MASS_WEIGHT_45_F", "BONE_SALT_MASS_WEIGHT_45_60_F", "BONE_SALT_MASS_WEIGHT_60_F", "BONE_SALT_MASS_SHORT_DESC", "BONE_SALT_MASS_DETAIL_DESC", "BONE_SALT_MASS_DETAIL_DESC_V1", "VISCERAL_FAT_AXIS_VALUE", "VISCERAL_FAT_SEGMENT_SHORT_DESC", "VISCERAL_FAT_SEGMENT_DETAIL_DESC", "VISCERAL_FAT_SEGMENT_DETAIL_DESC_V1", "LIMB_SKELETAL_MUSCLE_AXIS_VALUE_M", "LIMB_SKELETAL_MUSCLE_AXIS_VALUE_F", "LIMB_SKELETAL_MUSCLE_SHORT_DESC", "LIMB_SKELETAL_MUSCLE_DETAIL_DESC", "BASAL_METABOLISM_AGE_29_M", "BASAL_METABOLISM_AGE_30_49_M", "BASAL_METABOLISM_AGE_50_69_M", "BASAL_METABOLISM_AGE_70_M", "BASAL_METABOLISM_AGE_29_F", "BASAL_METABOLISM_AGE_30_49_F", "BASAL_METABOLISM_AGE_50_69_F", "BASAL_METABOLISM_AGE_70_F", "WHR_AXIS_VALUE_M", "WHR_AXIS_VALUE_F", "WHR_SHORT_DESC", "WHR_DETAIL_DESC", "WHR_DETAIL_DESC_V1", "BMP_AXIS_VALUE", "BMP_DETAIL_DESC", "SKELETAL_MUSCLE_MASS_SHORT_DESC", "SKELETAL_MUSCLE_MASS_DETAIL_DESC", "shouldHideEvaluationIndexCardBasedOnFields", "", "weightItem", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "createIndexEvaluationDataList", "", "Lcom/xiaomi/fitness/health/weight/bean/WeightDataItem;", "createBodyCompositionDataList", "filter", "Lcom/xiaomi/fitness/health/weight/util/WeightEvaluationHelper$FILTER;", "needRemoveDupBodyComposition", "calculateBmi", "weight", "height", "calculateSwt", "isFemale", "calculateWc", "swt", "buildWeightDataByType", "type", "", "num", "", "buildEvaluationData", "Lcom/xiaomi/fitness/health/weight/bean/WeightEvaluateDetail;", "value", "isS400OrElectronicScaleStandards", "scoreStandardType", "getUnSupportedEvaluationTypeList", "getNormalStatus", "shortDescResId", "getBodyEvaluationPosition", "getBodyEvaluationPositionPercent", "formatWeightItemValue", "getWeightControlStr", "formatFloatValue", "scale", "getWeightItemName", "getWeightItemUnit", "getBodyIndexLevelItems", "Lcom/xiaomi/fitness/baseui/widget/PercentLevel;", "getPercentArray", "valueArray", "getValueArrayMaxMin", "Lkotlin/Pair;", "getAxisColorArray", "getMuscleRateAxisArray", "female", "standardType", "standardWeight", "fixAbnormalMuscleRateRange", "min", VibrateModeSetFragment.MAX, "formatFloat", "getMuscleMassAxisArray", "getProteinRateAxisArray", "fixAbnormalProteinRateRange", "getProteinMassAxisArray", "getBoneSaltRateAxisArray", "getAxisValueArray", "getSkeletalMuscleMassAxisArray", "getBoneSaltMassAxisArray", "getWaterRateAxisArray", "realStandardWeight", "fixAbnormalWaterRateRange", "getWaterMassAxisArray", "getFataRateAxisArrayV0", "age", "getFataRateAxisArrayV1", "getAxisShortDescArray", "getDetailDescByType", "position", "getSuggestedWeightByHeight", "getRecommendBMI", "getSomatoTypeDescResId", "somatotype", "FILTER", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWeightEvaluationHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightEvaluationHelper.kt\ncom/xiaomi/fitness/health/weight/util/WeightEvaluationHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1290:1\n774#2:1291\n865#2,2:1292\n774#2:1294\n865#2,2:1295\n13517#3,3:1297\n13517#3,3:1300\n13517#3,3:1303\n13517#3,3:1306\n*S KotlinDebug\n*F\n+ 1 WeightEvaluationHelper.kt\ncom/xiaomi/fitness/health/weight/util/WeightEvaluationHelper\n*L\n512#1:1291\n512#1:1292,2\n516#1:1294\n516#1:1295,2\n872#1:1297,3\n900#1:1300,3\n1026#1:1303,3\n1049#1:1306,3\n*E\n"})
public final class WeightEvaluationHelper {

    @NotNull
    private static final float[] BASAL_METABOLISM_AGE_29_F;

    @NotNull
    private static final float[] BASAL_METABOLISM_AGE_29_M;

    @NotNull
    private static final float[] BASAL_METABOLISM_AGE_30_49_F;

    @NotNull
    private static final float[] BASAL_METABOLISM_AGE_30_49_M;

    @NotNull
    private static final float[] BASAL_METABOLISM_AGE_50_69_F;

    @NotNull
    private static final float[] BASAL_METABOLISM_AGE_50_69_M;

    @NotNull
    private static final float[] BASAL_METABOLISM_AGE_70_F;

    @NotNull
    private static final float[] BASAL_METABOLISM_AGE_70_M;

    @NotNull
    private static final float[] BMI_AXIS_VALUE;
    private static final float BMI_LEVEL_1 = 18.5f;
    private static final float BMI_LEVEL_2 = 24.0f;

    @NotNull
    private static final int[] BMI_SEGMENT_DETAIL_DESC;

    @NotNull
    private static final int[] BMI_SEGMENT_DETAIL_DESC_V1;

    @NotNull
    private static final int[] BMI_SEGMENT_SHORT_DESC;

    @NotNull
    private static final int[] BMI_SEGMENT_SHORT_DESC_V1;

    @NotNull
    private static final float[] BMP_AXIS_VALUE;

    @NotNull
    private static final int[] BMP_DETAIL_DESC;

    @NotNull
    private static final float[] BODY_WATER_RATE_AXIS_VALUE_F;

    @NotNull
    private static final float[] BODY_WATER_RATE_AXIS_VALUE_M;

    @NotNull
    private static final int[] BODY_WATER_RATE_DETAIL_DESC;

    @NotNull
    private static final int[] BODY_WATER_RATE_DETAIL_DESC_V1;

    @NotNull
    private static final int[] BODY_WATER_RATE_SHORT_DESC;

    @NotNull
    private static final int[] BONE_SALT_MASS_DETAIL_DESC;

    @NotNull
    private static final int[] BONE_SALT_MASS_DETAIL_DESC_V1;

    @NotNull
    private static final int[] BONE_SALT_MASS_SHORT_DESC;

    @NotNull
    private static final float[] BONE_SALT_MASS_WEIGHT_45_60_F;

    @NotNull
    private static final float[] BONE_SALT_MASS_WEIGHT_45_F;

    @NotNull
    private static final float[] BONE_SALT_MASS_WEIGHT_60_F;

    @NotNull
    private static final float[] BONE_SALT_MASS_WEIGHT_BELOW_60_M;

    @NotNull
    private static final float[] BONE_SALT_MASS_WEIGHT_UP_60_M;

    @NotNull
    private static final int[] COMMON_FOUR_SEGMENT_COLOR_LOW_TO_WARNING;

    @NotNull
    private static final int[] COMMON_FOUR_SEGMENT_COLOR_NORMAL_TO_DANGEROUS;

    @NotNull
    private static final int[] COMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_GOOD;

    @NotNull
    private static final int[] COMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH;

    @NotNull
    private static final int[] COMMON_THREE_SEGMENT_SHORT_DESC;

    @NotNull
    private static final int[] COMMON_THREE_SEGMENT_SHORT_DESC_V1;

    @NotNull
    private static final int[] COMMON_TWO_SEGMENT_COLOR;

    @NotNull
    private static final int[] FAT_MASS_DETAIL_DESC;

    @NotNull
    private static final int[] FAT_MASS_DETAIL_DESC_V1;

    @NotNull
    private static final float[] FAT_RATE_AXIS_VALUE_AGE_18_39_F;

    @NotNull
    private static final float[] FAT_RATE_AXIS_VALUE_AGE_18_39_M;

    @NotNull
    private static final float[] FAT_RATE_AXIS_VALUE_AGE_40_59_F;

    @NotNull
    private static final float[] FAT_RATE_AXIS_VALUE_AGE_40_59_M;

    @NotNull
    private static final float[] FAT_RATE_AXIS_VALUE_AGE_60_F;

    @NotNull
    private static final float[] FAT_RATE_AXIS_VALUE_AGE_60_M;

    @NotNull
    private static final int[] FAT_RATE_DETAIL_DESC;

    @NotNull
    private static final int[] FAT_RATE_DETAIL_DESC_V1;

    @NotNull
    private static final int[] FAT_RATE_SHORT_DESC;

    @NotNull
    private static final int[] FAT_RATE_SHORT_DESC_V1;

    @NotNull
    public static final WeightEvaluationHelper INSTANCE = new WeightEvaluationHelper();

    @NotNull
    private static final float[] LIMB_SKELETAL_MUSCLE_AXIS_VALUE_F;

    @NotNull
    private static final float[] LIMB_SKELETAL_MUSCLE_AXIS_VALUE_M;

    @NotNull
    private static final int[] LIMB_SKELETAL_MUSCLE_DETAIL_DESC;

    @NotNull
    private static final int[] LIMB_SKELETAL_MUSCLE_SHORT_DESC;

    @NotNull
    private static final int[] MUSCLE_MASS_DETAIL_DESC;

    @NotNull
    private static final int[] MUSCLE_MASS_DETAIL_DESC_V1;

    @NotNull
    private static final float[] MUSCLE_MASS_HEIGHT_150_160_F;

    @NotNull
    private static final float[] MUSCLE_MASS_HEIGHT_150_F;

    @NotNull
    private static final float[] MUSCLE_MASS_HEIGHT_160_170_M;

    @NotNull
    private static final float[] MUSCLE_MASS_HEIGHT_160_F;

    @NotNull
    private static final float[] MUSCLE_MASS_HEIGHT_160_M;

    @NotNull
    private static final float[] MUSCLE_MASS_HEIGHT_170_M;

    @NotNull
    private static final float[] MUSCLE_RATE_AXIS_VALUE_F;

    @NotNull
    private static final float[] MUSCLE_RATE_AXIS_VALUE_M;

    @NotNull
    private static final int[] MUSCLE_RATE_DETAIL_DESC;

    @NotNull
    private static final float[] PROTEIN_RATE_AXIS_VALUE;

    @NotNull
    private static final int[] PROTEIN_RATE_DETAIL_DESC;

    @NotNull
    private static final int[] PROTEIN_RATE_DETAIL_DESC_V1;

    @NotNull
    private static final int[] SKELETAL_MUSCLE_MASS_DETAIL_DESC;

    @NotNull
    private static final int[] SKELETAL_MUSCLE_MASS_SHORT_DESC;

    @NotNull
    public static final String TAG = "WeightEvaluationHelper";

    @NotNull
    private static final float[] VISCERAL_FAT_AXIS_VALUE;

    @NotNull
    private static final int[] VISCERAL_FAT_SEGMENT_DETAIL_DESC;

    @NotNull
    private static final int[] VISCERAL_FAT_SEGMENT_DETAIL_DESC_V1;

    @NotNull
    private static final int[] VISCERAL_FAT_SEGMENT_SHORT_DESC;

    @NotNull
    private static final float[] WHR_AXIS_VALUE_F;

    @NotNull
    private static final float[] WHR_AXIS_VALUE_M;

    @NotNull
    private static final int[] WHR_DETAIL_DESC;

    @NotNull
    private static final int[] WHR_DETAIL_DESC_V1;

    @NotNull
    private static final int[] WHR_SHORT_DESC;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/health/weight/util/WeightEvaluationHelper$FILTER;", "", "<init>", "(Ljava/lang/String;I)V", "ABNORMAL_DATA", "NORMAL_DATA", "NONE", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum FILTER {
        ABNORMAL_DATA,
        NORMAL_DATA,
        NONE;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<FILTER> getEntries() {
            return $ENTRIES;
        }
    }

    static {
        int i = iji.v0;
        int i2 = iji.w0;
        COMMON_TWO_SEGMENT_COLOR = new int[]{i, i2};
        int i3 = iji.u0;
        COMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH = new int[]{i, i2, i3};
        COMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_GOOD = new int[]{i, i2, iji.t0};
        int i4 = iji.x0;
        COMMON_FOUR_SEGMENT_COLOR_LOW_TO_WARNING = new int[]{i, i2, i3, i4};
        COMMON_FOUR_SEGMENT_COLOR_NORMAL_TO_DANGEROUS = new int[]{i2, i3, i4, iji.s0};
        int i5 = c0j.d3;
        int i6 = c0j.f3;
        int i7 = c0j.b3;
        COMMON_THREE_SEGMENT_SHORT_DESC = new int[]{i5, i6, i7};
        int i8 = c0j.h3;
        COMMON_THREE_SEGMENT_SHORT_DESC_V1 = new int[]{i5, i8, i7};
        BMI_AXIS_VALUE = new float[]{BMI_LEVEL_1, BMI_LEVEL_2, 28.0f};
        BMI_SEGMENT_SHORT_DESC = new int[]{c0j.s4, c0j.p4, c0j.r4, c0j.q4};
        int i9 = c0j.np;
        BMI_SEGMENT_SHORT_DESC_V1 = new int[]{i5, i8, i7, i9};
        BMI_SEGMENT_DETAIL_DESC = new int[]{c0j.H2, c0j.F2, c0j.E2, c0j.G2};
        BMI_SEGMENT_DETAIL_DESC_V1 = new int[]{c0j.To, c0j.Uo, c0j.So, c0j.Vo};
        BODY_WATER_RATE_AXIS_VALUE_M = new float[]{55.0f, 65.0f};
        BODY_WATER_RATE_AXIS_VALUE_F = new float[]{45.0f, 60.0f};
        int i10 = c0j.c3;
        int i11 = c0j.a3;
        BODY_WATER_RATE_SHORT_DESC = new int[]{i10, i8, i11};
        BODY_WATER_RATE_DETAIL_DESC = new int[]{c0j.k4, c0j.l4, c0j.j4};
        BODY_WATER_RATE_DETAIL_DESC_V1 = new int[]{c0j.fp, c0j.gp, c0j.ep};
        FAT_RATE_AXIS_VALUE_AGE_18_39_M = new float[]{10.0f, 21.0f, 26.0f};
        FAT_RATE_AXIS_VALUE_AGE_40_59_M = new float[]{11.0f, 22.0f, 27.0f};
        FAT_RATE_AXIS_VALUE_AGE_60_M = new float[]{13.0f, BMI_LEVEL_2, 29.0f};
        FAT_RATE_AXIS_VALUE_AGE_18_39_F = new float[]{20.0f, 34.0f, 39.0f};
        FAT_RATE_AXIS_VALUE_AGE_40_59_F = new float[]{21.0f, 35.0f, 40.0f};
        FAT_RATE_AXIS_VALUE_AGE_60_F = new float[]{22.0f, 36.0f, 41.0f};
        FAT_RATE_SHORT_DESC = new int[]{c0j.i3, i8, c0j.Z2, c0j.g3};
        FAT_RATE_SHORT_DESC_V1 = new int[]{i5, i8, i7, i9};
        FAT_RATE_DETAIL_DESC = new int[]{c0j.V2, c0j.T2, c0j.S2, c0j.U2};
        FAT_MASS_DETAIL_DESC = new int[]{c0j.B8, c0j.y8, c0j.v8, c0j.A8};
        FAT_RATE_DETAIL_DESC_V1 = new int[]{c0j.bp, c0j.cp, c0j.ap, c0j.dp};
        FAT_MASS_DETAIL_DESC_V1 = new int[]{c0j.x8, c0j.z8, c0j.w8, c0j.u8};
        MUSCLE_RATE_AXIS_VALUE_M = new float[]{66.0f, 91.0f};
        MUSCLE_RATE_AXIS_VALUE_F = new float[]{60.8f, 84.5f};
        MUSCLE_RATE_DETAIL_DESC = new int[]{c0j.ha, c0j.ia, c0j.ga};
        MUSCLE_MASS_HEIGHT_160_M = new float[]{38.5f, 46.5f};
        MUSCLE_MASS_HEIGHT_160_170_M = new float[]{44.0f, 52.4f};
        MUSCLE_MASS_HEIGHT_170_M = new float[]{49.4f, 59.4f};
        MUSCLE_MASS_HEIGHT_150_F = new float[]{29.1f, 34.7f};
        MUSCLE_MASS_HEIGHT_150_160_F = new float[]{32.9f, 37.5f};
        MUSCLE_MASS_HEIGHT_160_F = new float[]{36.5f, 42.5f};
        MUSCLE_MASS_DETAIL_DESC = new int[]{c0j.ca, c0j.ea, c0j.aa};
        MUSCLE_MASS_DETAIL_DESC_V1 = new int[]{c0j.da, c0j.fa, c0j.ba};
        PROTEIN_RATE_AXIS_VALUE = new float[]{16.0f, 20.0f};
        PROTEIN_RATE_DETAIL_DESC = new int[]{c0j.w3, c0j.x3, c0j.v3};
        PROTEIN_RATE_DETAIL_DESC_V1 = new int[]{c0j.rp, c0j.sp, c0j.qp};
        BONE_SALT_MASS_WEIGHT_BELOW_60_M = new float[]{2.5f};
        BONE_SALT_MASS_WEIGHT_UP_60_M = new float[]{3.2f};
        BONE_SALT_MASS_WEIGHT_45_F = new float[]{1.8f};
        BONE_SALT_MASS_WEIGHT_45_60_F = new float[]{2.2f};
        BONE_SALT_MASS_WEIGHT_60_F = new float[]{2.5f};
        BONE_SALT_MASS_SHORT_DESC = new int[]{i10, i6};
        BONE_SALT_MASS_DETAIL_DESC = new int[]{c0j.N2, c0j.P2};
        BONE_SALT_MASS_DETAIL_DESC_V1 = new int[]{c0j.O2, c0j.Q2};
        VISCERAL_FAT_AXIS_VALUE = new float[]{4.5f, 9.5f, 14.5f};
        VISCERAL_FAT_SEGMENT_SHORT_DESC = new int[]{c0j.mp, c0j.j3, c0j.e3, c0j.Y2};
        int i12 = c0j.e4;
        int i13 = c0j.g4;
        int i14 = c0j.d4;
        VISCERAL_FAT_SEGMENT_DETAIL_DESC = new int[]{i12, i13, i14, c0j.b4};
        VISCERAL_FAT_SEGMENT_DETAIL_DESC_V1 = new int[]{c0j.f4, i13, i14, c0j.c4};
        LIMB_SKELETAL_MUSCLE_AXIS_VALUE_M = new float[]{7.1f, 8.6f};
        LIMB_SKELETAL_MUSCLE_AXIS_VALUE_F = new float[]{5.5f, 6.5f};
        LIMB_SKELETAL_MUSCLE_SHORT_DESC = new int[]{i5, i8, i7};
        LIMB_SKELETAL_MUSCLE_DETAIL_DESC = new int[]{c0j.w9, c0j.x9, c0j.v9};
        BASAL_METABOLISM_AGE_29_M = new float[]{1318.0f, 1783.0f};
        BASAL_METABOLISM_AGE_30_49_M = new float[]{1275.0f, 1725.0f};
        BASAL_METABOLISM_AGE_50_69_M = new float[]{1148.0f, 1553.0f};
        BASAL_METABOLISM_AGE_70_M = new float[]{1037.0f, 1403.0f};
        BASAL_METABOLISM_AGE_29_F = new float[]{1029.0f, 1392.0f};
        BASAL_METABOLISM_AGE_30_49_F = new float[]{995.0f, 1346.0f};
        BASAL_METABOLISM_AGE_50_69_F = new float[]{944.0f, 1277.0f};
        BASAL_METABOLISM_AGE_70_F = new float[]{859.0f, 1162.0f};
        WHR_AXIS_VALUE_M = new float[]{0.8f, 0.9f};
        WHR_AXIS_VALUE_F = new float[]{0.75f, 0.85f};
        WHR_SHORT_DESC = new int[]{i5, i6, c0j.X2};
        WHR_DETAIL_DESC = new int[]{c0j.Dp, c0j.Fp, c0j.Bp};
        WHR_DETAIL_DESC_V1 = new int[]{c0j.Ep, c0j.Gp, c0j.Cp};
        BMP_AXIS_VALUE = new float[]{60.0f, 100.0f};
        BMP_DETAIL_DESC = new int[]{c0j.Yo, c0j.Zo, c0j.Xo};
        SKELETAL_MUSCLE_MASS_SHORT_DESC = new int[]{i10, i8, i11};
        SKELETAL_MUSCLE_MASS_DETAIL_DESC = new int[]{c0j.vp, c0j.xp, c0j.up};
    }

    private WeightEvaluationHelper() {
    }

    private final WeightEvaluateDetail buildEvaluationData(int type, Number value, WeightItem weightItem) {
        if (getUnSupportedEvaluationTypeList(weightItem).contains(Integer.valueOf(type))) {
            return null;
        }
        List<PercentLevel> bodyIndexLevelItems = getBodyIndexLevelItems(type, weightItem);
        if (bodyIndexLevelItems.isEmpty()) {
            return null;
        }
        int bodyEvaluationPosition = getBodyEvaluationPosition(type, value.floatValue(), weightItem);
        float bodyEvaluationPositionPercent = getBodyEvaluationPositionPercent(type, value.floatValue(), weightItem);
        int[] axisShortDescArray = getAxisShortDescArray(type, weightItem);
        int i = (bodyEvaluationPosition < 0 || bodyEvaluationPosition >= axisShortDescArray.length) ? -1 : axisShortDescArray[bodyEvaluationPosition];
        return new WeightEvaluateDetail(bodyIndexLevelItems, i < 0 ? null : ExtUtilKt.getString(i), getDetailDescByType(weightItem, type, bodyEvaluationPosition), bodyEvaluationPosition, i >= 0 ? Boolean.valueOf(!getNormalStatus(type, i, weightItem)) : null, bodyEvaluationPositionPercent);
    }

    private final float calculateSwt(boolean isFemale, float height) {
        return isFemale ? xr5.e(2, (float) (((double) (height - 70)) * 0.6d)) : xr5.e(2, (float) (((double) (height - 80)) * 0.7d));
    }

    private final float calculateWc(float weight, float swt) {
        return xr5.e(2, swt - weight);
    }

    public static /* synthetic */ List createBodyCompositionDataList$default(WeightEvaluationHelper weightEvaluationHelper, WeightItem weightItem, FILTER filter, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            filter = FILTER.NONE;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return weightEvaluationHelper.createBodyCompositionDataList(weightItem, filter, z);
    }

    private final float[] fixAbnormalMuscleRateRange(float min, float max) {
        if (min > 95.0f) {
            return new float[]{formatFloat$default(this, 95.0f, 0, 2, null), formatFloat$default(this, 97.0f, 0, 2, null)};
        }
        return (min > 95.0f || max <= 97.0f) ? new float[]{formatFloat$default(this, min, 0, 2, null), formatFloat$default(this, max, 0, 2, null)} : new float[]{formatFloat$default(this, min, 0, 2, null), formatFloat$default(this, 97.0f, 0, 2, null)};
    }

    private final float[] fixAbnormalProteinRateRange(float min, float max) {
        if (min > 35.0f) {
            return new float[]{formatFloat$default(this, 35.0f, 0, 2, null), formatFloat$default(this, 40.0f, 0, 2, null)};
        }
        return (min > 35.0f || max <= 40.0f) ? new float[]{formatFloat$default(this, min, 0, 2, null), formatFloat$default(this, max, 0, 2, null)} : new float[]{formatFloat$default(this, min, 0, 2, null), formatFloat$default(this, 40.0f, 0, 2, null)};
    }

    private final float[] fixAbnormalWaterRateRange(float min, float max) {
        if (min > 85.0f) {
            return new float[]{formatFloat$default(this, 85.0f, 0, 2, null), formatFloat$default(this, 90.0f, 0, 2, null)};
        }
        return (min > 85.0f || max <= 90.0f) ? new float[]{formatFloat$default(this, min, 0, 2, null), formatFloat$default(this, max, 0, 2, null)} : new float[]{formatFloat$default(this, min, 0, 2, null), formatFloat$default(this, 90.0f, 0, 2, null)};
    }

    private final float formatFloat(float value, int scale) {
        Float floatOrNull = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(formatFloatValue(scale, value));
        return floatOrNull != null ? floatOrNull.floatValue() : value;
    }

    public static /* synthetic */ float formatFloat$default(WeightEvaluationHelper weightEvaluationHelper, float f, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return weightEvaluationHelper.formatFloat(f, i);
    }

    public static /* synthetic */ String formatFloatValue$default(WeightEvaluationHelper weightEvaluationHelper, int i, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return weightEvaluationHelper.formatFloatValue(i, f);
    }

    private final String formatWeightItemValue(int type, Number value) {
        switch (type) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 18:
            case 20:
                return formatFloatValue(1, value.floatValue());
            case 11:
            case 19:
                return formatFloatValue(2, value.floatValue());
            case 13:
            case 15:
            case 16:
            case 17:
            default:
                return value.toString();
            case 14:
            case 21:
                return formatFloatValue(0, value.floatValue());
            case 22:
                return getWeightControlStr(value.floatValue());
        }
    }

    private final int[] getAxisColorArray(int type) {
        switch (type) {
            case 0:
            case 1:
            case 2:
                return COMMON_FOUR_SEGMENT_COLOR_LOW_TO_WARNING;
            case 3:
            case 4:
            case 5:
            case 6:
            case 20:
                return COMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_GOOD;
            case 7:
            case 8:
            case 13:
            case 14:
            case 15:
            case 21:
                return COMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH;
            case 9:
            case 10:
                return COMMON_TWO_SEGMENT_COLOR;
            case 11:
            case 16:
            case 17:
            case 18:
            case 19:
            default:
                return new int[0];
            case 12:
                return COMMON_FOUR_SEGMENT_COLOR_NORMAL_TO_DANGEROUS;
        }
    }

    private final int[] getAxisShortDescArray(int type, WeightItem weightItem) {
        Integer scoreStandardType = weightItem.getScoreStandardType();
        boolean zIsS400OrElectronicScaleStandards = isS400OrElectronicScaleStandards(scoreStandardType != null ? scoreStandardType.intValue() : 0);
        switch (type) {
            case 0:
                return BMI_SEGMENT_SHORT_DESC_V1;
            case 1:
            case 2:
                return zIsS400OrElectronicScaleStandards ? FAT_RATE_SHORT_DESC_V1 : FAT_RATE_SHORT_DESC;
            case 3:
            case 4:
                return zIsS400OrElectronicScaleStandards ? BODY_WATER_RATE_SHORT_DESC : COMMON_THREE_SEGMENT_SHORT_DESC;
            case 5:
            case 6:
                return BODY_WATER_RATE_SHORT_DESC;
            case 7:
            case 8:
                return zIsS400OrElectronicScaleStandards ? COMMON_THREE_SEGMENT_SHORT_DESC_V1 : COMMON_THREE_SEGMENT_SHORT_DESC;
            case 9:
            case 10:
                return BONE_SALT_MASS_SHORT_DESC;
            case 11:
            case 16:
            case 17:
            case 18:
            case 19:
            default:
                return new int[0];
            case 12:
                return VISCERAL_FAT_SEGMENT_SHORT_DESC;
            case 13:
                return LIMB_SKELETAL_MUSCLE_SHORT_DESC;
            case 14:
                return COMMON_THREE_SEGMENT_SHORT_DESC;
            case 15:
                return zIsS400OrElectronicScaleStandards ? COMMON_THREE_SEGMENT_SHORT_DESC_V1 : WHR_SHORT_DESC;
            case 20:
                return SKELETAL_MUSCLE_MASS_SHORT_DESC;
            case 21:
                return COMMON_THREE_SEGMENT_SHORT_DESC;
        }
    }

    private final float[] getAxisValueArray(int type, WeightItem weightItem) {
        float[] fArrCopyOf;
        boolean zIsFemale = HealthUtil.isFemale();
        int age = HealthUtil.getAge();
        float height = HealthUtil.getHeight();
        Integer scoreStandardType = weightItem.getScoreStandardType();
        int iIntValue = scoreStandardType != null ? scoreStandardType.intValue() : 0;
        Float realStandardWeight = weightItem.getRealStandardWeight();
        float fFloatValue = realStandardWeight != null ? realStandardWeight.floatValue() : 0.0f;
        float weight = weightItem.getWeight();
        switch (type) {
            case 0:
                return BMI_AXIS_VALUE;
            case 1:
                return isS400OrElectronicScaleStandards(iIntValue) ? getFataRateAxisArrayV1(zIsFemale) : getFataRateAxisArrayV0(age, zIsFemale);
            case 2:
                if (isS400OrElectronicScaleStandards(iIntValue)) {
                    float[] fataRateAxisArrayV1 = getFataRateAxisArrayV1(zIsFemale);
                    fArrCopyOf = Arrays.copyOf(fataRateAxisArrayV1, fataRateAxisArrayV1.length);
                    Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
                } else {
                    float[] fataRateAxisArrayV0 = getFataRateAxisArrayV0(age, zIsFemale);
                    fArrCopyOf = Arrays.copyOf(fataRateAxisArrayV0, fataRateAxisArrayV0.length);
                    Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
                }
                int length = fArrCopyOf.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    fArrCopyOf[i2] = formatFloat$default(INSTANCE, (fArrCopyOf[i] * weightItem.getWeight()) / 100, 0, 2, null);
                    i++;
                    i2++;
                }
                return fArrCopyOf;
            case 3:
                return getMuscleRateAxisArray(zIsFemale, iIntValue, fFloatValue, weight);
            case 4:
                return getMuscleMassAxisArray(zIsFemale, height, iIntValue, fFloatValue);
            case 5:
                return getWaterRateAxisArray(zIsFemale, iIntValue, fFloatValue, weight);
            case 6:
                return getWaterMassAxisArray(zIsFemale, iIntValue, fFloatValue);
            case 7:
                return getProteinRateAxisArray(zIsFemale, iIntValue, fFloatValue, weight);
            case 8:
                return getProteinMassAxisArray(zIsFemale, iIntValue, fFloatValue, weight);
            case 9:
                return getBoneSaltMassAxisArray(zIsFemale, iIntValue, weight);
            case 10:
                return getBoneSaltRateAxisArray(zIsFemale, iIntValue, weight);
            case 11:
            case 16:
            case 17:
            case 18:
            case 19:
            default:
                return new float[0];
            case 12:
                return VISCERAL_FAT_AXIS_VALUE;
            case 13:
                return zIsFemale ? LIMB_SKELETAL_MUSCLE_AXIS_VALUE_F : LIMB_SKELETAL_MUSCLE_AXIS_VALUE_M;
            case 14:
                if (zIsFemale) {
                    if (age < 30) {
                        return BASAL_METABOLISM_AGE_29_F;
                    }
                    if (age < 50) {
                        return BASAL_METABOLISM_AGE_30_49_F;
                    }
                    return age < 70 ? BASAL_METABOLISM_AGE_50_69_F : BASAL_METABOLISM_AGE_70_F;
                }
                if (age < 30) {
                    return BASAL_METABOLISM_AGE_29_M;
                }
                if (age < 50) {
                    return BASAL_METABOLISM_AGE_30_49_M;
                }
                return age < 70 ? BASAL_METABOLISM_AGE_50_69_M : BASAL_METABOLISM_AGE_70_M;
            case 15:
                return zIsFemale ? WHR_AXIS_VALUE_F : WHR_AXIS_VALUE_M;
            case 20:
                return getSkeletalMuscleMassAxisArray(zIsFemale, iIntValue, height);
            case 21:
                return BMP_AXIS_VALUE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if (r12 > r13[1]) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int getBodyEvaluationPosition(int r11, float r12, com.xiaomi.fit.fitness.export.data.item.WeightItem r13) {
        /*
            r10 = this;
            float[] r13 = r10.getAxisValueArray(r11, r13)
            int r0 = r13.length
            r1 = -1
            if (r0 != 0) goto La
            goto L8c
        La:
            r0 = 15
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r0 = 14
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = 20
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r0 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r6 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9 = 13
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer[] r2 = new java.lang.Integer[]{r2, r3, r4, r5, r6, r7, r8, r9}
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            boolean r2 = kotlin.collections.ArraysKt.contains(r2, r3)
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L5e
            int r11 = r13.length
            if (r11 == r3) goto L4c
            return r1
        L4c:
            r11 = r13[r5]
            int r11 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r11 >= 0) goto L54
        L52:
            r1 = r5
            goto L8c
        L54:
            r11 = r13[r4]
            int r11 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r11 <= 0) goto L5c
        L5a:
            r1 = r3
            goto L8c
        L5c:
            r1 = r4
            goto L8c
        L5e:
            r2 = 12
            if (r11 != r2) goto L7d
            int r11 = r13.length
            if (r11 == r0) goto L66
            return r1
        L66:
            r11 = r13[r5]
            int r11 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r11 > 0) goto L6d
            goto L52
        L6d:
            r11 = r13[r4]
            int r11 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r11 > 0) goto L74
            goto L5c
        L74:
            r11 = r13[r3]
            int r11 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r11 > 0) goto L7b
            goto L5a
        L7b:
            r1 = r0
            goto L8c
        L7d:
            int r11 = r13.length
            r1 = r5
        L7f:
            if (r5 >= r11) goto L8c
            r0 = r13[r5]
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 < 0) goto L89
            int r1 = r5 + 1
        L89:
            int r5 = r5 + 1
            goto L7f
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.health.weight.util.WeightEvaluationHelper.getBodyEvaluationPosition(int, float, com.xiaomi.fit.fitness.export.data.item.WeightItem):int");
    }

    private final float getBodyEvaluationPositionPercent(int type, float value, WeightItem weightItem) {
        Float second;
        Pair<Float, Float> valueArrayMaxMin = getValueArrayMaxMin(type, getAxisValueArray(type, weightItem));
        if (value >= valueArrayMaxMin.getFirst().floatValue()) {
            if (value > valueArrayMaxMin.getSecond().floatValue()) {
                second = valueArrayMaxMin.getSecond();
            }
            float fFloatValue = (value - valueArrayMaxMin.getFirst().floatValue()) / (valueArrayMaxMin.getSecond().floatValue() - valueArrayMaxMin.getFirst().floatValue());
            Logger.d(TAG, "getBodyEvaluationPositionPercent type:" + type + " result:" + fFloatValue + " minMax:" + valueArrayMaxMin);
            return fFloatValue;
        }
        second = valueArrayMaxMin.getFirst();
        value = second.floatValue();
        float fFloatValue2 = (value - valueArrayMaxMin.getFirst().floatValue()) / (valueArrayMaxMin.getSecond().floatValue() - valueArrayMaxMin.getFirst().floatValue());
        Logger.d(TAG, "getBodyEvaluationPositionPercent type:" + type + " result:" + fFloatValue2 + " minMax:" + valueArrayMaxMin);
        return fFloatValue2;
    }

    private final List<PercentLevel> getBodyIndexLevelItems(int type, WeightItem weightItem) {
        String str;
        ArrayList arrayList = new ArrayList();
        float[] axisValueArray = getAxisValueArray(type, weightItem);
        float[] percentArray = getPercentArray(type, axisValueArray);
        if (axisValueArray.length == 0 || percentArray.length == 0) {
            return arrayList;
        }
        int[] axisColorArray = getAxisColorArray(type);
        int[] axisShortDescArray = getAxisShortDescArray(type, weightItem);
        if (!(axisColorArray.length == axisShortDescArray.length && axisValueArray.length + 1 == axisColorArray.length) && percentArray.length == axisColorArray.length) {
            return arrayList;
        }
        int length = axisColorArray.length;
        for (int i = 0; i < length; i++) {
            PercentLevel percentLevel = new PercentLevel();
            percentLevel.setColor(axisColorArray[i]);
            percentLevel.setLevelDesc(axisShortDescArray[i]);
            if (i < 0 || i >= axisValueArray.length) {
                str = "";
            } else {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                WeightEvaluationHelper weightEvaluationHelper = INSTANCE;
                str = String.format("%s%s", Arrays.copyOf(new Object[]{weightEvaluationHelper.formatWeightItemValue(type, Float.valueOf(axisValueArray[i])), weightEvaluationHelper.getWeightItemUnit(type, weightItem)}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            }
            percentLevel.setItemEndIndexStr(str);
            percentLevel.setPercent(percentArray[i]);
            arrayList.add(percentLevel);
        }
        return arrayList;
    }

    private final float[] getBoneSaltMassAxisArray(boolean female, int standardType, float weight) {
        if (!female) {
            return weight <= 60.0f ? BONE_SALT_MASS_WEIGHT_BELOW_60_M : BONE_SALT_MASS_WEIGHT_UP_60_M;
        }
        if (weight < 45.0f) {
            return BONE_SALT_MASS_WEIGHT_45_F;
        }
        return weight <= 60.0f ? BONE_SALT_MASS_WEIGHT_45_60_F : BONE_SALT_MASS_WEIGHT_60_F;
    }

    private final float[] getBoneSaltRateAxisArray(boolean female, int standardType, float weight) {
        if (!isS400OrElectronicScaleStandards(standardType) || weight <= 0.0f) {
            return new float[0];
        }
        float[] boneSaltMassAxisArray = getBoneSaltMassAxisArray(female, standardType, weight);
        float[] fArrCopyOf = Arrays.copyOf(boneSaltMassAxisArray, boneSaltMassAxisArray.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        int length = fArrCopyOf.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            fArrCopyOf[i2] = formatFloat$default(INSTANCE, (fArrCopyOf[i] * 100.0f) / weight, 0, 2, null);
            i++;
            i2++;
        }
        return fArrCopyOf;
    }

    private final String getDetailDescByType(WeightItem weightItem, int type, int position) {
        int[] iArr;
        String string;
        int[] iArr2;
        Integer scoreStandardType = weightItem.getScoreStandardType();
        boolean zIsS400OrElectronicScaleStandards = isS400OrElectronicScaleStandards(scoreStandardType != null ? scoreStandardType.intValue() : 0);
        switch (type) {
            case 0:
                iArr = zIsS400OrElectronicScaleStandards ? BMI_SEGMENT_DETAIL_DESC_V1 : BMI_SEGMENT_DETAIL_DESC;
                iArr2 = iArr;
                string = null;
                break;
            case 1:
                iArr = zIsS400OrElectronicScaleStandards ? FAT_RATE_DETAIL_DESC_V1 : FAT_RATE_DETAIL_DESC;
                iArr2 = iArr;
                string = null;
                break;
            case 2:
                iArr = zIsS400OrElectronicScaleStandards ? FAT_MASS_DETAIL_DESC_V1 : FAT_MASS_DETAIL_DESC;
                iArr2 = iArr;
                string = null;
                break;
            case 3:
                iArr = zIsS400OrElectronicScaleStandards ? MUSCLE_MASS_DETAIL_DESC_V1 : MUSCLE_RATE_DETAIL_DESC;
                iArr2 = iArr;
                string = null;
                break;
            case 4:
                iArr = zIsS400OrElectronicScaleStandards ? MUSCLE_MASS_DETAIL_DESC_V1 : MUSCLE_MASS_DETAIL_DESC;
                iArr2 = iArr;
                string = null;
                break;
            case 5:
            case 6:
                iArr = zIsS400OrElectronicScaleStandards ? BODY_WATER_RATE_DETAIL_DESC_V1 : BODY_WATER_RATE_DETAIL_DESC;
                iArr2 = iArr;
                string = null;
                break;
            case 7:
            case 8:
                iArr = zIsS400OrElectronicScaleStandards ? PROTEIN_RATE_DETAIL_DESC_V1 : PROTEIN_RATE_DETAIL_DESC;
                iArr2 = iArr;
                string = null;
                break;
            case 9:
            case 10:
                iArr = zIsS400OrElectronicScaleStandards ? BONE_SALT_MASS_DETAIL_DESC_V1 : BONE_SALT_MASS_DETAIL_DESC;
                iArr2 = iArr;
                string = null;
                break;
            case 11:
            case 16:
            case 17:
            case 18:
            case 19:
            default:
                string = null;
                iArr2 = null;
                break;
            case 12:
                iArr = zIsS400OrElectronicScaleStandards ? VISCERAL_FAT_SEGMENT_DETAIL_DESC_V1 : VISCERAL_FAT_SEGMENT_DETAIL_DESC;
                iArr2 = iArr;
                string = null;
                break;
            case 13:
                iArr = LIMB_SKELETAL_MUSCLE_DETAIL_DESC;
                iArr2 = iArr;
                string = null;
                break;
            case 14:
                string = zIsS400OrElectronicScaleStandards ? ExtUtilKt.getString(c0j.a0) : ExtUtilKt.getString(c0j.Z);
                iArr2 = null;
                break;
            case 15:
                iArr = zIsS400OrElectronicScaleStandards ? WHR_DETAIL_DESC_V1 : WHR_DETAIL_DESC;
                iArr2 = iArr;
                string = null;
                break;
            case 20:
                iArr = SKELETAL_MUSCLE_MASS_DETAIL_DESC;
                iArr2 = iArr;
                string = null;
                break;
            case 21:
                iArr = BMP_DETAIL_DESC;
                iArr2 = iArr;
                string = null;
                break;
        }
        if (string != null) {
            return string;
        }
        if (iArr2 == null || position < 0 || position >= iArr2.length) {
            return null;
        }
        return ExtUtilKt.getString(iArr2[position]);
    }

    private final float[] getFataRateAxisArrayV0(int age, boolean isFemale) {
        if (age <= 39) {
            return isFemale ? FAT_RATE_AXIS_VALUE_AGE_18_39_F : FAT_RATE_AXIS_VALUE_AGE_18_39_M;
        }
        if (age < 60) {
            return isFemale ? FAT_RATE_AXIS_VALUE_AGE_40_59_F : FAT_RATE_AXIS_VALUE_AGE_40_59_M;
        }
        return isFemale ? FAT_RATE_AXIS_VALUE_AGE_60_F : FAT_RATE_AXIS_VALUE_AGE_60_M;
    }

    private final float[] getFataRateAxisArrayV1(boolean isFemale) {
        return isFemale ? new float[]{18.0f, 28.0f, 39.0f} : new float[]{10.0f, 20.0f, 26.0f};
    }

    private final float[] getMuscleMassAxisArray(boolean female, float height, int standardType, float standardWeight) {
        if (isS400OrElectronicScaleStandards(standardType) && standardWeight > 0.0f) {
            return female ? new float[]{0.67f * standardWeight, standardWeight * 0.81f} : new float[]{0.72f * standardWeight, standardWeight * 0.91f};
        }
        if (female) {
            if (height < 150.0f) {
                return MUSCLE_MASS_HEIGHT_150_F;
            }
            return height < 160.0f ? MUSCLE_MASS_HEIGHT_150_160_F : MUSCLE_MASS_HEIGHT_160_F;
        }
        if (height < 160.0f) {
            return MUSCLE_MASS_HEIGHT_160_M;
        }
        return height < 170.0f ? MUSCLE_MASS_HEIGHT_160_170_M : MUSCLE_MASS_HEIGHT_170_M;
    }

    private final float[] getMuscleRateAxisArray(boolean female, int standardType, float standardWeight, float weight) {
        if (!isS400OrElectronicScaleStandards(standardType) || standardWeight <= 0.0f || weight <= 0.0f) {
            return female ? MUSCLE_RATE_AXIS_VALUE_F : MUSCLE_RATE_AXIS_VALUE_M;
        }
        float f = standardWeight / weight;
        return female ? fixAbnormalMuscleRateRange(67.0f * f, f * 81.0f) : fixAbnormalMuscleRateRange(72.0f * f, f * 91.0f);
    }

    private final boolean getNormalStatus(int type, int shortDescResId, WeightItem weightItem) {
        int[] axisShortDescArray = getAxisShortDescArray(type, weightItem);
        Integer scoreStandardType = weightItem.getScoreStandardType();
        int iIntValue = scoreStandardType != null ? scoreStandardType.intValue() : 0;
        switch (type) {
            case 0:
                if (shortDescResId != axisShortDescArray[1]) {
                    return false;
                }
                break;
            case 1:
            case 2:
                if (shortDescResId != axisShortDescArray[1]) {
                    return false;
                }
                break;
            case 3:
            case 4:
                if (isS400OrElectronicScaleStandards(iIntValue)) {
                    if (shortDescResId == axisShortDescArray[0]) {
                        return false;
                    }
                } else if (shortDescResId != axisShortDescArray[1]) {
                    return false;
                }
                return true;
            case 5:
            case 6:
                if (shortDescResId == axisShortDescArray[0]) {
                    return false;
                }
                break;
            case 7:
            case 8:
            case 14:
                if (shortDescResId != axisShortDescArray[1]) {
                    return false;
                }
                break;
            case 9:
            case 10:
                if (shortDescResId != axisShortDescArray[1]) {
                    return false;
                }
                break;
            case 11:
            case 16:
            case 17:
            case 18:
            case 19:
            default:
                return false;
            case 12:
                if (shortDescResId != axisShortDescArray[0]) {
                    return false;
                }
                break;
            case 13:
                if (shortDescResId != axisShortDescArray[1]) {
                    return false;
                }
                break;
            case 15:
                if (shortDescResId != axisShortDescArray[1]) {
                    return false;
                }
                break;
            case 20:
                if (shortDescResId == axisShortDescArray[0]) {
                    return false;
                }
                break;
            case 21:
                if (shortDescResId != axisShortDescArray[1]) {
                    return false;
                }
                break;
        }
        return true;
    }

    private final float[] getPercentArray(int type, float[] valueArray) {
        int i = 0;
        if (type == 15) {
            boolean zIsFemale = HealthUtil.isFemale();
            float[] fArr = zIsFemale ? new float[]{0.6f, 0.75f, 0.85f, 1.5f} : new float[]{0.6f, 0.8f, 0.9f, 1.5f};
            float fLast = ArraysKt___ArraysKt.last(fArr) - ArraysKt___ArraysKt.first(fArr);
            return zIsFemale ? new float[]{0.15f / fLast, 0.1f / fLast, 0.65f / fLast} : new float[]{0.2f / fLast, 0.1f / fLast, 0.6f / fLast};
        }
        if (valueArray.length == 0) {
            return new float[0];
        }
        if (valueArray.length == 1) {
            return new float[]{0.5f, 0.5f};
        }
        float[] fArr2 = new float[valueArray.length + 1];
        int length = valueArray.length - 1;
        int length2 = valueArray.length;
        float f = 0.0f;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length2) {
            float f2 = valueArray[i2];
            int i4 = i3 + 1;
            int length3 = valueArray.length;
            int i5 = i3 - 1;
            if (i5 >= 0 && i5 < length3) {
                f += valueArray[i3] - valueArray[i5];
            }
            i2++;
            i3 = i4;
        }
        float f3 = f / length;
        float f4 = f + (2 * f3);
        int length4 = valueArray.length;
        if (length4 >= 0) {
            while (true) {
                if (i == 0 || i == valueArray.length) {
                    fArr2[i] = f3 / f4;
                } else {
                    fArr2[i] = (valueArray[i] - valueArray[i - 1]) / f4;
                }
                if (i == length4) {
                    break;
                }
                i++;
            }
        }
        String string = Arrays.toString(valueArray);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String string2 = Arrays.toString(fArr2);
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Logger.d(TAG, "getPercentArray type " + type + "; valueArray " + string + ";resultArray " + string2 + " leftEndValue: " + f3 + ";sum " + f4);
        return fArr2;
    }

    private final float[] getProteinMassAxisArray(boolean female, int standardType, float standardWeight, float weight) {
        if (!isS400OrElectronicScaleStandards(standardType) || standardWeight <= 0.0f || weight <= 0.0f) {
            return new float[]{0.16f * weight, weight * 0.2f};
        }
        return female ? new float[]{0.12f * standardWeight, standardWeight * 0.205f} : new float[]{0.13f * standardWeight, standardWeight * 0.225f};
    }

    private final float[] getProteinRateAxisArray(boolean female, int standardType, float standardWeight, float weight) {
        if (!isS400OrElectronicScaleStandards(standardType) || standardWeight <= 0.0f) {
            return PROTEIN_RATE_AXIS_VALUE;
        }
        float f = standardWeight / weight;
        return female ? fixAbnormalProteinRateRange(12.0f * f, f * 20.5f) : fixAbnormalProteinRateRange(13.0f * f, f * 22.5f);
    }

    private final float getRecommendBMI() {
        return 21.25f;
    }

    private final float[] getSkeletalMuscleMassAxisArray(boolean female, int standardType, float height) {
        if (!isS400OrElectronicScaleStandards(standardType)) {
            return new float[0];
        }
        if (female) {
            if (height < 150.0f) {
                return new float[]{16.0f, 20.6f};
            }
            return height <= 160.0f ? new float[]{18.9f, 23.7f} : new float[]{22.1f, 30.3f};
        }
        if (height < 160.0f) {
            return new float[]{21.2f, 26.6f};
        }
        return height <= 170.0f ? new float[]{24.8f, 34.6f} : new float[]{29.6f, 43.2f};
    }

    private final List<Integer> getUnSupportedEvaluationTypeList(WeightItem weightItem) {
        Integer scoreStandardType = weightItem.getScoreStandardType();
        return isS400OrElectronicScaleStandards(scoreStandardType != null ? scoreStandardType.intValue() : 0) ? CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{11, 16, 19, 18}) : CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{11, 16, 19, 6, 10, 18, 20, 21});
    }

    private final Pair<Float, Float> getValueArrayMaxMin(int type, float[] valueArray) {
        if (type == 15) {
            return new Pair<>(Float.valueOf(0.6f), Float.valueOf(1.5f));
        }
        float f = 0.0f;
        if (valueArray.length == 0) {
            return new Pair<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
        }
        int i = 0;
        if (valueArray.length == 1) {
            return new Pair<>(Float.valueOf(0.0f), Float.valueOf(2 * valueArray[0]));
        }
        int length = valueArray.length - 1;
        int length2 = valueArray.length;
        int i2 = 0;
        while (i < length2) {
            float f2 = valueArray[i];
            int i3 = i2 + 1;
            int length3 = valueArray.length;
            int i4 = i2 - 1;
            if (i4 >= 0 && i4 < length3) {
                f += valueArray[i2] - valueArray[i4];
            }
            i++;
            i2 = i3;
        }
        float f3 = f / length;
        return new Pair<>(Float.valueOf(ArraysKt___ArraysKt.first(valueArray) - f3), Float.valueOf(ArraysKt___ArraysKt.last(valueArray) + f3));
    }

    private final float[] getWaterMassAxisArray(boolean female, int standardType, float standardWeight) {
        if (!isS400OrElectronicScaleStandards(standardType) || standardWeight <= 0.0f) {
            return new float[0];
        }
        return female ? new float[]{0.51f * standardWeight, standardWeight * 0.62f} : new float[]{0.56f * standardWeight, standardWeight * 0.69f};
    }

    private final float[] getWaterRateAxisArray(boolean female, int standardType, float realStandardWeight, float weight) {
        if (!isS400OrElectronicScaleStandards(standardType) || realStandardWeight <= 0.0f || weight <= 0.0f) {
            return female ? BODY_WATER_RATE_AXIS_VALUE_F : BODY_WATER_RATE_AXIS_VALUE_M;
        }
        float f = realStandardWeight / weight;
        return female ? fixAbnormalWaterRateRange(51.0f * f, f * 62.0f) : fixAbnormalWaterRateRange(56.0f * f, f * 69.0f);
    }

    private final String getWeightControlStr(float value) {
        String floatValue = formatFloatValue(2, value);
        if (value == 0.0f) {
            return ExtUtilKt.getString(c0j.jp);
        }
        if (value <= 0.0f) {
            return floatValue;
        }
        return Marker.ANY_NON_NULL_MARKER + floatValue;
    }

    private final String getWeightItemName(int type) {
        switch (type) {
            case 0:
                return ExtUtilKt.getString(c0j.L2);
            case 1:
                return ExtUtilKt.getString(c0j.W2);
            case 2:
                return ExtUtilKt.getString(c0j.t8);
            case 3:
                return ExtUtilKt.getString(c0j.t3);
            case 4:
                return ExtUtilKt.getString(c0j.Z9);
            case 5:
                return ExtUtilKt.getString(c0j.h4);
            case 6:
                return ExtUtilKt.getString(c0j.s3);
            case 7:
                return ExtUtilKt.getString(c0j.Ab);
            case 8:
                return ExtUtilKt.getString(c0j.Bb);
            case 9:
                return ExtUtilKt.getString(c0j.M2);
            case 10:
                return ExtUtilKt.getString(c0j.v4);
            case 11:
                return ExtUtilKt.getString(c0j.tp);
            case 12:
                return ExtUtilKt.getString(c0j.a4);
            case 13:
                return ExtUtilKt.getString(c0j.A9);
            case 14:
                return ExtUtilKt.getString(c0j.K2);
            case 15:
                return ExtUtilKt.getString(c0j.qb);
            case 16:
                return ExtUtilKt.getString(c0j.J2);
            case 17:
                return ExtUtilKt.getString(c0j.Mb);
            case 18:
                return ExtUtilKt.getString(c0j.kp);
            case 19:
                return ExtUtilKt.getString(c0j.yp);
            case 20:
                return ExtUtilKt.getString(c0j.wp);
            case 21:
                return ExtUtilKt.getString(c0j.Wo);
            case 22:
                return ExtUtilKt.getString(c0j.hp);
            default:
                return "";
        }
    }

    private final String getWeightItemUnit(int type, WeightItem weightItem) {
        switch (type) {
            case 0:
            case 12:
            case 13:
            case 15:
            default:
                return "";
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
                return LocaleUtil.INSTANCE.isTR() ? "" : "%";
            case 2:
            case 4:
            case 6:
            case 8:
            case 9:
            case 11:
            case 18:
            case 19:
            case 20:
                return ExtUtilKt.getString(c0j.zp);
            case 14:
            case 17:
                return "kcal";
            case 16:
                Resources resources = ApplicationExtKt.getApplication().getResources();
                int i = qxi.common_unit_year_old;
                Integer bodyAge = weightItem.getBodyAge();
                Intrinsics.checkNotNull(bodyAge);
                String quantityString = resources.getQuantityString(i, bodyAge.intValue());
                Intrinsics.checkNotNull(quantityString);
                return quantityString;
            case 21:
                Resources resources2 = ApplicationExtKt.getApplication().getResources();
                int i2 = qxi.common_unit_heart_rate;
                Integer bmp = weightItem.getBmp();
                String quantityString2 = resources2.getQuantityString(i2, bmp != null ? bmp.intValue() : 0);
                Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
                return quantityString2;
            case 22:
                return (weightItem.getWeightControl() == null || Intrinsics.areEqual(weightItem.getWeightControl(), 0.0f)) ? "" : ExtUtilKt.getString(c0j.zp);
        }
    }

    private final boolean isS400OrElectronicScaleStandards(int scoreStandardType) {
        return scoreStandardType == 1 || scoreStandardType == 3;
    }

    @NotNull
    public final WeightDataItem buildWeightDataByType(int type, @NotNull Number num, @NotNull WeightItem weightItem) {
        Boolean abnormal;
        Intrinsics.checkNotNullParameter(num, "num");
        Intrinsics.checkNotNullParameter(weightItem, "weightItem");
        String weightItemValue = formatWeightItemValue(type, num);
        String weightItemName = getWeightItemName(type);
        String weightItemUnit = getWeightItemUnit(type, weightItem);
        WeightEvaluateDetail weightEvaluateDetailBuildEvaluationData = buildEvaluationData(type, num, weightItem);
        return new WeightDataItem(Integer.valueOf(type), weightItemValue, weightItemUnit, weightItemName, (weightEvaluateDetailBuildEvaluationData == null || (abnormal = weightEvaluateDetailBuildEvaluationData.getAbnormal()) == null) ? false : abnormal.booleanValue(), weightEvaluateDetailBuildEvaluationData != null ? weightEvaluateDetailBuildEvaluationData.getLevelItems() : null, weightEvaluateDetailBuildEvaluationData != null ? weightEvaluateDetailBuildEvaluationData.getEvaluateShortDesc() : null, weightEvaluateDetailBuildEvaluationData != null ? weightEvaluateDetailBuildEvaluationData.getEvaluateDetailDesc() : null, weightEvaluateDetailBuildEvaluationData != null ? weightEvaluateDetailBuildEvaluationData.getCurrentLevelPosition() : -1, weightEvaluateDetailBuildEvaluationData != null ? weightEvaluateDetailBuildEvaluationData.getCurrentLevelPositionPercent() : 0.0f);
    }

    public final float calculateBmi(float weight, float height) {
        if (height == 0.0f) {
            return 0.0f;
        }
        float f = height / 100;
        return xr5.e(1, (weight / f) / f);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    @NotNull
    public final List<WeightDataItem> createBodyCompositionDataList(@NotNull WeightItem weightItem, @NotNull FILTER filter, boolean needRemoveDupBodyComposition) {
        boolean z;
        Intrinsics.checkNotNullParameter(weightItem, "weightItem");
        Intrinsics.checkNotNullParameter(filter, "filter");
        ArrayList arrayList = new ArrayList();
        if (needRemoveDupBodyComposition) {
            Float moistureRate = weightItem.getMoistureRate();
            if ((moistureRate != null ? moistureRate.floatValue() : 0.0f) <= 0.0f) {
                z = false;
            } else {
                Float bodyFatRate = weightItem.getBodyFatRate();
                if ((bodyFatRate != null ? bodyFatRate.floatValue() : 0.0f) <= 0.0f) {
                    z = false;
                } else {
                    Float boneSaltRate = weightItem.getBoneSaltRate();
                    if ((boneSaltRate != null ? boneSaltRate.floatValue() : 0.0f) <= 0.0f) {
                        z = false;
                    } else {
                        Float proteinRate = weightItem.getProteinRate();
                        if ((proteinRate != null ? proteinRate.floatValue() : 0.0f) > 0.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                }
            }
        } else {
            z = false;
        }
        Integer bodyScore = weightItem.getBodyScore();
        int iIntValue = bodyScore != null ? bodyScore.intValue() : 0;
        Integer scoreStandardType = weightItem.getScoreStandardType();
        boolean z2 = scoreStandardType != null && scoreStandardType.intValue() == 2;
        if (iIntValue <= 0) {
            float height = HealthUtil.getHeight();
            if (height > 0.0f && !z2) {
                arrayList.add(buildWeightDataByType(11, Float.valueOf(getSuggestedWeightByHeight(height / 100.0f)), weightItem));
            }
            Float bmi = weightItem.getBmi();
            float fFloatValue = bmi != null ? bmi.floatValue() : 0.0f;
            if (fFloatValue <= 0.0f) {
                fFloatValue = calculateBmi(weightItem.getWeight(), HealthUtil.getHeight());
            }
            arrayList.add(buildWeightDataByType(0, Float.valueOf(fFloatValue), weightItem));
            Float bodyFatRate2 = weightItem.getBodyFatRate();
            float fFloatValue2 = bodyFatRate2 != null ? bodyFatRate2.floatValue() : 0.0f;
            if (!z && fFloatValue2 > 0.0f) {
                arrayList.add(buildWeightDataByType(1, Float.valueOf(fFloatValue2), weightItem));
            }
            if (z2) {
                Float standardWeightV2 = weightItem.getStandardWeightV2();
                float fFloatValue3 = standardWeightV2 != null ? standardWeightV2.floatValue() : 0.0f;
                if (fFloatValue3 <= 0.0f) {
                    fFloatValue3 = calculateSwt(HealthUtil.isFemale(), HealthUtil.getHeight());
                }
                arrayList.add(buildWeightDataByType(19, Float.valueOf(fFloatValue3), weightItem));
                Float weightControl = weightItem.getWeightControl();
                float fFloatValue4 = weightControl != null ? weightControl.floatValue() : 0.0f;
                if (fFloatValue4 <= 0.0f) {
                    fFloatValue4 = calculateWc(weightItem.getWeight(), fFloatValue3);
                }
                arrayList.add(buildWeightDataByType(22, Float.valueOf(fFloatValue4), weightItem));
            }
        }
        weightItem.getScoreStandardType();
        Float fatMass = weightItem.getFatMass();
        float fFloatValue5 = fatMass != null ? fatMass.floatValue() : 0.0f;
        if (fFloatValue5 > 0.0f) {
            arrayList.add(buildWeightDataByType(2, Float.valueOf(fFloatValue5), weightItem));
        }
        Float fatFreeBody = weightItem.getFatFreeBody();
        float fFloatValue6 = fatFreeBody != null ? fatFreeBody.floatValue() : 0.0f;
        if (fFloatValue6 > 0.0f) {
            arrayList.add(buildWeightDataByType(18, Float.valueOf(fFloatValue6), weightItem));
        }
        Float bodyMoistureMass = weightItem.getBodyMoistureMass();
        float fFloatValue7 = bodyMoistureMass != null ? bodyMoistureMass.floatValue() : 0.0f;
        if (fFloatValue7 > 0.0f) {
            arrayList.add(buildWeightDataByType(6, Float.valueOf(fFloatValue7), weightItem));
        }
        Float moistureRate2 = weightItem.getMoistureRate();
        float fFloatValue8 = moistureRate2 != null ? moistureRate2.floatValue() : 0.0f;
        if (!z && fFloatValue8 > 0.0f) {
            arrayList.add(buildWeightDataByType(5, Float.valueOf(fFloatValue8), weightItem));
        }
        Float proteinMass = weightItem.getProteinMass();
        float fFloatValue9 = proteinMass != null ? proteinMass.floatValue() : 0.0f;
        if (fFloatValue9 > 0.0f) {
            arrayList.add(buildWeightDataByType(8, Float.valueOf(fFloatValue9), weightItem));
        }
        Float proteinRate2 = weightItem.getProteinRate();
        float fFloatValue10 = proteinRate2 != null ? proteinRate2.floatValue() : 0.0f;
        if (!z && fFloatValue10 > 0.0f) {
            arrayList.add(buildWeightDataByType(7, Float.valueOf(fFloatValue10), weightItem));
        }
        Float muscleMass = weightItem.getMuscleMass();
        float fFloatValue11 = muscleMass != null ? muscleMass.floatValue() : 0.0f;
        if (fFloatValue11 > 0.0f) {
            arrayList.add(buildWeightDataByType(4, Float.valueOf(fFloatValue11), weightItem));
        }
        Float muscleRate = weightItem.getMuscleRate();
        float fFloatValue12 = muscleRate != null ? muscleRate.floatValue() : 0.0f;
        if (fFloatValue12 > 0.0f) {
            arrayList.add(buildWeightDataByType(3, Float.valueOf(fFloatValue12), weightItem));
        }
        Float skeletalMuscleMass = weightItem.getSkeletalMuscleMass();
        float fFloatValue13 = skeletalMuscleMass != null ? skeletalMuscleMass.floatValue() : 0.0f;
        if (fFloatValue13 > 0.0f) {
            arrayList.add(buildWeightDataByType(20, Float.valueOf(fFloatValue13), weightItem));
        }
        Float boneSaltMass = weightItem.getBoneSaltMass();
        float fFloatValue14 = boneSaltMass != null ? boneSaltMass.floatValue() : 0.0f;
        if (fFloatValue14 > 0.0f) {
            arrayList.add(buildWeightDataByType(9, Float.valueOf(fFloatValue14), weightItem));
        }
        Float boneSaltRate2 = weightItem.getBoneSaltRate();
        float fFloatValue15 = boneSaltRate2 != null ? boneSaltRate2.floatValue() : 0.0f;
        if (!z && fFloatValue15 > 0.0f) {
            arrayList.add(buildWeightDataByType(10, Float.valueOf(fFloatValue15), weightItem));
        }
        Float visceralFat = weightItem.getVisceralFat();
        float fFloatValue16 = visceralFat != null ? visceralFat.floatValue() : 0.0f;
        if (fFloatValue16 > 0.0f) {
            arrayList.add(buildWeightDataByType(12, Float.valueOf(fFloatValue16), weightItem));
        }
        Integer basalMetabolism = weightItem.getBasalMetabolism();
        int iIntValue2 = basalMetabolism != null ? basalMetabolism.intValue() : 0;
        if (iIntValue2 > 0) {
            arrayList.add(buildWeightDataByType(14, Integer.valueOf(iIntValue2), weightItem));
        }
        Integer bmp = weightItem.getBmp();
        int iIntValue3 = bmp != null ? bmp.intValue() : 0;
        if (iIntValue3 > 0) {
            arrayList.add(buildWeightDataByType(21, Integer.valueOf(iIntValue3), weightItem));
        }
        if (filter == FILTER.ABNORMAL_DATA) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((WeightDataItem) obj).getItemAbnormal()) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
        if (filter != FILTER.NORMAL_DATA) {
            return arrayList;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!((WeightDataItem) obj2).getItemAbnormal()) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    @NotNull
    public final List<WeightDataItem> createIndexEvaluationDataList(@NotNull WeightItem weightItem) {
        Intrinsics.checkNotNullParameter(weightItem, "weightItem");
        ArrayList arrayList = new ArrayList();
        Float whr = weightItem.getWhr();
        float fFloatValue = whr != null ? whr.floatValue() : 0.0f;
        if (fFloatValue > 0.0f) {
            arrayList.add(buildWeightDataByType(15, Float.valueOf(fFloatValue), weightItem));
        }
        Float limbsSkeletalMuscleIndex = weightItem.getLimbsSkeletalMuscleIndex();
        float fFloatValue2 = limbsSkeletalMuscleIndex != null ? limbsSkeletalMuscleIndex.floatValue() : 0.0f;
        if (fFloatValue2 > 0.0f) {
            arrayList.add(buildWeightDataByType(13, Float.valueOf(fFloatValue2), weightItem));
        }
        Integer bodyAge = weightItem.getBodyAge();
        int iIntValue = bodyAge != null ? bodyAge.intValue() : 0;
        if (iIntValue > 0) {
            arrayList.add(buildWeightDataByType(16, Integer.valueOf(iIntValue), weightItem));
        }
        Integer recommendedCaloriesIntake = weightItem.getRecommendedCaloriesIntake();
        int iIntValue2 = recommendedCaloriesIntake != null ? recommendedCaloriesIntake.intValue() : 0;
        if (iIntValue2 > 0) {
            arrayList.add(buildWeightDataByType(17, Integer.valueOf(iIntValue2), weightItem));
        }
        Float realStandardWeight = weightItem.getRealStandardWeight();
        float fFloatValue3 = realStandardWeight != null ? realStandardWeight.floatValue() : 0.0f;
        if (fFloatValue3 > 0.0f) {
            arrayList.add(buildWeightDataByType(19, Float.valueOf(fFloatValue3), weightItem));
        }
        return arrayList;
    }

    @NotNull
    public final String formatFloatValue(int scale, float value) {
        if (scale == 1) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(Double.parseDouble(String.valueOf(value)))}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        if (scale != 2) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format(Locale.getDefault(), "%.0f", Arrays.copyOf(new Object[]{Double.valueOf(Double.parseDouble(String.valueOf(value)))}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            return str2;
        }
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        String str3 = String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(Double.parseDouble(String.valueOf(value)))}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        return str3;
    }

    @NotNull
    public final int[] getCOMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH() {
        return COMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH;
    }

    @NotNull
    public final int[] getCOMMON_THREE_SEGMENT_SHORT_DESC() {
        return COMMON_THREE_SEGMENT_SHORT_DESC;
    }

    @NotNull
    public final int[] getCOMMON_THREE_SEGMENT_SHORT_DESC_V1() {
        return COMMON_THREE_SEGMENT_SHORT_DESC_V1;
    }

    public final int getSomatoTypeDescResId(int somatotype, int standardType) {
        if (isS400OrElectronicScaleStandards(standardType)) {
            switch (somatotype) {
                case -5:
                    return c0j.Z3;
                case -4:
                    return c0j.Y3;
                case -3:
                    return c0j.S3;
                case -2:
                    return c0j.X3;
                case -1:
                    return c0j.W3;
                case 0:
                    return c0j.T3;
                case 1:
                    return c0j.U3;
                case 2:
                    return c0j.V3;
                case 3:
                    return c0j.G3;
                case 4:
                    return c0j.H3;
                default:
                    return 0;
            }
        }
        switch (somatotype) {
            case -5:
                return c0j.R3;
            case -4:
                return c0j.P3;
            case -3:
                return c0j.L3;
            case -2:
                return c0j.K3;
            case -1:
                return c0j.Q3;
            case 0:
                return c0j.J3;
            case 1:
                return c0j.M3;
            case 2:
                return c0j.O3;
            case 3:
                return c0j.I3;
            case 4:
                return c0j.N3;
            default:
                return 0;
        }
    }

    public final float getSuggestedWeightByHeight(float height) {
        return height * height * getRecommendBMI();
    }

    public final boolean shouldHideEvaluationIndexCardBasedOnFields(@NotNull WeightItem weightItem) {
        Integer standardWeight;
        Integer recommendedCaloriesIntake;
        Integer bodyAge;
        Intrinsics.checkNotNullParameter(weightItem, "weightItem");
        return (weightItem.getLimbsSkeletalMuscleIndex() == null || Intrinsics.areEqual(weightItem.getLimbsSkeletalMuscleIndex(), 0.0f)) && (weightItem.getBodyAge() == null || ((bodyAge = weightItem.getBodyAge()) != null && bodyAge.intValue() == 0)) && (weightItem.getRecommendedCaloriesIntake() == null || ((recommendedCaloriesIntake = weightItem.getRecommendedCaloriesIntake()) != null && recommendedCaloriesIntake.intValue() == 0)) && (weightItem.getWhr() == null || Intrinsics.areEqual(weightItem.getWhr(), 0.0f)) && (weightItem.getSomatotype() == null) && (weightItem.getStandardWeight() == null || ((standardWeight = weightItem.getStandardWeight()) != null && standardWeight.intValue() == 0));
    }
}
