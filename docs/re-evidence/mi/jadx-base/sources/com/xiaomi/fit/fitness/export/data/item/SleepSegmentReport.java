package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import com.mi.fitness.netproxy.NetProxyComponentKt;
import com.xiaomi.fit.data.common.data.daily.SleepAssistItemInfo;
import com.xiaomi.fit.data.common.data.daily.SleepStateItem;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimedValue;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.parser.schema.DailyReportKey;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import com.xiaomi.fitness.health.hrm.StepHrmDetailFragment;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import com.xiaomi.onetrack.OneTrack;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b`\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b-\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0002Ë\u0001B\u008f\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)\u0012\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)\u0012\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)\u0012\u0016\b\u0002\u0010-\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0.\u0018\u00010)\u0012\u0016\b\u0002\u0010/\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0.\u0018\u00010)\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u000101\u0012\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010)\u0012\u0010\b\u0002\u00104\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010)¢\u0006\u0004\b5\u00106J\b\u0010\u0093\u0001\u001a\u00030\u0094\u0001J\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001J\u0007\u0010\u0096\u0001\u001a\u00020\tJ\t\u0010\u0097\u0001\u001a\u00020\u0006H\u0016J\u0012\u0010\u0098\u0001\u001a\u00030\u0099\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\n\u0010\u009a\u0001\u001a\u00030\u009b\u0001H\u0016J\u0013\u0010\u009c\u0001\u001a\u00020\t2\u0007\u0010\u009d\u0001\u001a\u00020\u0000H\u0096\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\n\u0010\u009e\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0006HÂ\u0003J\n\u0010 \u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\tHÆ\u0003J\u0011\u0010¢\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010BJ\u0011\u0010£\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010GJ\u0011\u0010¤\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010GJ\n\u0010¥\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010¦\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010§\u0001\u001a\u00020\tHÆ\u0003J\n\u0010¨\u0001\u001a\u00020\tHÆ\u0003J\n\u0010©\u0001\u001a\u00020\tHÆ\u0003J\u0011\u0010ª\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010BJ\u0011\u0010«\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010BJ\u0011\u0010¬\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010BJ\u0011\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010BJ\u0012\u0010®\u0001\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0003J\u0011\u0010¯\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010BJ\u0011\u0010°\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010BJ\u0011\u0010±\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010BJ\u0011\u0010²\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010BJ\u0011\u0010³\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010BJ\u0011\u0010´\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010BJ\u0011\u0010µ\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010BJ\u0011\u0010¶\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010BJ\u0011\u0010·\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010BJ\u0011\u0010¸\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010BJ\u0011\u0010¹\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010BJ\u0011\u0010º\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010GJ\u0011\u0010»\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010GJ\u0011\u0010¼\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010GJ\u0011\u0010½\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010GJ\u0012\u0010¾\u0001\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)HÆ\u0003J\u0012\u0010¿\u0001\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)HÆ\u0003J\u0012\u0010À\u0001\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)HÆ\u0003J\u0018\u0010Á\u0001\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0.\u0018\u00010)HÆ\u0003J\u0018\u0010Â\u0001\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0.\u0018\u00010)HÆ\u0003J\f\u0010Ã\u0001\u001a\u0004\u0018\u000101HÆ\u0003J\u0012\u0010Ä\u0001\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010)HÆ\u0003J\u0012\u0010Å\u0001\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010)HÆ\u0003J\u009a\u0004\u0010Æ\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)2\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)2\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)2\u0016\b\u0002\u0010-\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0.\u0018\u00010)2\u0016\b\u0002\u0010/\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0.\u0018\u00010)2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010)2\u0010\b\u0002\u00104\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010)HÆ\u0001¢\u0006\u0003\u0010Ç\u0001J\u0017\u0010È\u0001\u001a\u00030\u0094\u00012\n\u0010\u009d\u0001\u001a\u0005\u0018\u00010É\u0001HÖ\u0003J\n\u0010Ê\u0001\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010J\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010J\u001a\u0004\bK\u0010G\"\u0004\bL\u0010IR\u001e\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010:\"\u0004\bN\u0010<R\u001e\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010:\"\u0004\bP\u0010<R\u001e\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010>\"\u0004\bR\u0010@R\u001e\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010>\"\u0004\bT\u0010@R\u001e\u0010\u0011\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010>\"\u0004\bV\u0010@R\"\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bW\u0010B\"\u0004\bX\u0010DR\"\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bY\u0010B\"\u0004\bZ\u0010DR\"\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\b[\u0010B\"\u0004\b\\\u0010DR\"\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\b]\u0010B\"\u0004\b^\u0010DR&\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bc\u0010B\"\u0004\bd\u0010DR\"\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\be\u0010B\"\u0004\bf\u0010DR\"\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bg\u0010B\"\u0004\bh\u0010DR\"\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bi\u0010B\"\u0004\bj\u0010DR\"\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bk\u0010B\"\u0004\bl\u0010DR\"\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bm\u0010B\"\u0004\bn\u0010DR\"\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bo\u0010B\"\u0004\bp\u0010DR\"\u0010 \u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bq\u0010B\"\u0004\br\u0010DR\"\u0010!\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bs\u0010B\"\u0004\bt\u0010DR\"\u0010\"\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bu\u0010B\"\u0004\bv\u0010DR\"\u0010#\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bw\u0010B\"\u0004\bx\u0010DR\"\u0010$\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010J\u001a\u0004\by\u0010G\"\u0004\bz\u0010IR\"\u0010%\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010J\u001a\u0004\b{\u0010G\"\u0004\b|\u0010IR\"\u0010&\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010J\u001a\u0004\b}\u0010G\"\u0004\b~\u0010IR#\u0010'\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0011\n\u0002\u0010J\u001a\u0004\b\u007f\u0010G\"\u0005\b\u0080\u0001\u0010IR$\u0010(\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010`\"\u0005\b\u0082\u0001\u0010bR$\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010`\"\u0005\b\u0084\u0001\u0010bR$\u0010,\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010`\"\u0005\b\u0086\u0001\u0010bR*\u0010-\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0.\u0018\u00010)X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010`\"\u0005\b\u0088\u0001\u0010bR*\u0010/\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0.\u0018\u00010)X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010`\"\u0005\b\u008a\u0001\u0010bR \u00100\u001a\u0004\u0018\u000101X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R$\u00102\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010)X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0001\u0010`\"\u0005\b\u0090\u0001\u0010bR$\u00104\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010)X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0001\u0010`\"\u0005\b\u0092\u0001\u0010b¨\u0006Ì\u0001"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "builder", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport$Builder;", "time", "", "protoTime", "tzIn15Min", "", "version", "deviceBedTime", "deviceWakeupTime", "bedTime", "wakeupTime", "sleepDuration", "deepDuration", "lightDuration", "remDuration", "wakeDuration", "wakeCount", "sleepTraceDuration", "sleepItems", "", "Lcom/xiaomi/fit/data/common/data/daily/SleepStateItem;", "breathQuality", "avgBreathRate", "avgHr", "maxHr", "minHr", FitnessReportKey.avgSpo2, FitnessReportKey.maxSpo2, FitnessReportKey.minSpo2, "snoreDuration", "dreamTalkCount", DailyReportKey.sleepEfficiency, "entrySleepDuration", "linBedDuration", DailyReportKey.goBedTime, "leaveBedTime", "hrRecords", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimesDataRecordInt;", "spo2Records", "breathRateRecords", "hrDetailRecords", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimedValue;", "spo2DetailRecords", "snoreRecordInfo", "Lcom/xiaomi/fit/data/common/data/daily/SleepAssistItemInfo;", "snoreAudioList", "Lcom/xiaomi/fit/fitness/export/data/item/SnoreDreamTalkAudio;", "dreamTalkAudioList", "<init>", "(Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport$Builder;JJILjava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;JJIIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/xiaomi/fit/data/common/data/daily/SleepAssistItemInfo;Ljava/util/List;Ljava/util/List;)V", "getBuilder", "()Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport$Builder;", "getProtoTime", "()J", "setProtoTime", "(J)V", "getTzIn15Min", "()I", "setTzIn15Min", "(I)V", "getVersion", "()Ljava/lang/Integer;", "setVersion", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDeviceBedTime", "()Ljava/lang/Long;", "setDeviceBedTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getDeviceWakeupTime", "setDeviceWakeupTime", "getBedTime", "setBedTime", "getWakeupTime", "setWakeupTime", "getSleepDuration", "setSleepDuration", "getDeepDuration", "setDeepDuration", "getLightDuration", "setLightDuration", "getRemDuration", "setRemDuration", "getWakeDuration", "setWakeDuration", "getWakeCount", "setWakeCount", "getSleepTraceDuration", "setSleepTraceDuration", "getSleepItems", "()Ljava/util/List;", "setSleepItems", "(Ljava/util/List;)V", "getBreathQuality", "setBreathQuality", "getAvgBreathRate", "setAvgBreathRate", "getAvgHr", "setAvgHr", "getMaxHr", "setMaxHr", "getMinHr", "setMinHr", "getAvgSpo2", "setAvgSpo2", "getMaxSpo2", "setMaxSpo2", "getMinSpo2", "setMinSpo2", "getSnoreDuration", "setSnoreDuration", "getDreamTalkCount", "setDreamTalkCount", "getSleepEfficiency", "setSleepEfficiency", "getEntrySleepDuration", "setEntrySleepDuration", "getLinBedDuration", "setLinBedDuration", "getGoBedTime", "setGoBedTime", "getLeaveBedTime", "setLeaveBedTime", "getHrRecords", "setHrRecords", "getSpo2Records", "setSpo2Records", "getBreathRateRecords", "setBreathRateRecords", "getHrDetailRecords", "setHrDetailRecords", "getSpo2DetailRecords", "setSpo2DetailRecords", "getSnoreRecordInfo", "()Lcom/xiaomi/fit/data/common/data/daily/SleepAssistItemInfo;", "setSnoreRecordInfo", "(Lcom/xiaomi/fit/data/common/data/daily/SleepAssistItemInfo;)V", "getSnoreAudioList", "setSnoreAudioList", "getDreamTalkAudioList", "setDreamTalkAudioList", "hasStageData", "", "audioDataIsEmpty", "getStageCount", "getTimestamp", "setTimestamp", "", "toString", "", "compareTo", "other", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "copy", "(Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport$Builder;JJILjava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;JJIIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/xiaomi/fit/data/common/data/daily/SleepAssistItemInfo;Ljava/util/List;Ljava/util/List;)Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "equals", "", "hashCode", "Builder", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepSegmentReport extends DailyRecordItem implements Comparable<SleepSegmentReport> {

    @SerializedName("avg_breath")
    @Nullable
    private Integer avgBreathRate;

    @SerializedName(StepHrmDetailFragment.KEY_AVG_HR)
    @Nullable
    private Integer avgHr;

    @SerializedName("avg_spo2")
    @Nullable
    private Integer avgSpo2;

    @SerializedName("bedtime")
    private long bedTime;

    @SerializedName("breath_quality")
    @Nullable
    private Integer breathQuality;

    @Nullable
    private transient List<TimesDataRecordInt> breathRateRecords;

    @NotNull
    private final transient Builder builder;

    @SerializedName("sleep_deep_duration")
    private int deepDuration;

    @SerializedName("device_bedtime")
    @Nullable
    private Long deviceBedTime;

    @SerializedName("device_wake_up_time")
    @Nullable
    private Long deviceWakeupTime;

    @Nullable
    private List<SnoreDreamTalkAudio> dreamTalkAudioList;

    @SerializedName("total_dream_talk")
    @Nullable
    private Integer dreamTalkCount;

    @SerializedName("sleep_duration")
    @Nullable
    private Long entrySleepDuration;

    @SerializedName("bed_timestamp")
    @Nullable
    private Long goBedTime;

    @Nullable
    private transient List<TimedValue<Integer>> hrDetailRecords;

    @Nullable
    private transient List<TimesDataRecordInt> hrRecords;

    @SerializedName("out_bed_timestamp")
    @Nullable
    private Long leaveBedTime;

    @SerializedName("sleep_light_duration")
    private int lightDuration;

    @SerializedName("bed_duration")
    @Nullable
    private Long linBedDuration;

    @SerializedName("max_hr")
    @Nullable
    private Integer maxHr;

    @SerializedName(FitnessPersistKey.ReportMaxSpo2)
    @Nullable
    private Integer maxSpo2;

    @SerializedName("min_hr")
    @Nullable
    private Integer minHr;

    @SerializedName(FitnessPersistKey.ReportMinSpo2)
    @Nullable
    private Integer minSpo2;
    private long protoTime;

    @SerializedName("sleep_rem_duration")
    @Nullable
    private Integer remDuration;

    @SerializedName("duration")
    private int sleepDuration;

    @SerializedName(Feature.SLEEP_EFFICIENCY)
    @Nullable
    private Integer sleepEfficiency;

    @SerializedName("items")
    @Nullable
    private List<SleepStateItem> sleepItems;

    @SerializedName("sleep_trace_duration")
    @Nullable
    private Integer sleepTraceDuration;

    @Nullable
    private List<SnoreDreamTalkAudio> snoreAudioList;

    @SerializedName("total_snore_time")
    @Nullable
    private Integer snoreDuration;

    @Nullable
    private SleepAssistItemInfo snoreRecordInfo;

    @Nullable
    private transient List<TimedValue<Integer>> spo2DetailRecords;

    @Nullable
    private transient List<TimesDataRecordInt> spo2Records;
    private transient long time;

    @SerializedName("timezone")
    private int tzIn15Min;

    @SerializedName("version")
    @Nullable
    private Integer version;

    @SerializedName("awake_count")
    @Nullable
    private Integer wakeCount;

    @SerializedName("sleep_awake_duration")
    @Nullable
    private Integer wakeDuration;

    @SerializedName("wake_up_time")
    private long wakeupTime;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b(\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010e\u001a\u00020\u00002\b\u0010f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010gJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010gJ\u0015\u0010\u000e\u001a\u00020\u00002\b\u0010h\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010iJ\u0015\u0010\u0015\u001a\u00020\u00002\b\u0010h\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010iJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010h\u001a\u00020\u000fJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010h\u001a\u00020\u000fJ\u000e\u0010 \u001a\u00020\u00002\u0006\u0010j\u001a\u00020\u0005J\u000e\u0010k\u001a\u00020\u00002\u0006\u0010j\u001a\u00020\u0005J\u000e\u0010l\u001a\u00020\u00002\u0006\u0010j\u001a\u00020\u0005J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010j\u001a\u00020\u0005J\u000e\u0010.\u001a\u00020\u00002\u0006\u0010j\u001a\u00020\u0005J\u000e\u00101\u001a\u00020\u00002\u0006\u0010m\u001a\u00020\u0005J\u000e\u00104\u001a\u00020\u00002\u0006\u0010j\u001a\u00020\u0005J\u000e\u0010n\u001a\u00020\u00002\u0006\u0010o\u001a\u000209J\u0016\u0010p\u001a\u00020\u00002\u000e\u0010q\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010rJ\u001e\u0010s\u001a\u00020\u00002\u0006\u0010t\u001a\u00020\u00052\u0006\u0010u\u001a\u00020\u00052\u0006\u0010v\u001a\u00020\u0005J\u001e\u0010w\u001a\u00020\u00002\u0006\u0010t\u001a\u00020\u00052\u0006\u0010u\u001a\u00020\u00052\u0006\u0010v\u001a\u00020\u0005J\u000e\u0010P\u001a\u00020\u00002\u0006\u0010x\u001a\u00020\u0005J\u000e\u0010S\u001a\u00020\u00002\u0006\u0010y\u001a\u00020\u0005J\u0015\u0010V\u001a\u00020\u00002\b\u0010z\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010gJ\u0015\u0010Y\u001a\u00020\u00002\b\u0010h\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010iJ\u0015\u0010\\\u001a\u00020\u00002\b\u0010h\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010iJ\u0015\u0010_\u001a\u00020\u00002\b\u0010h\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010iJ\u0015\u0010b\u001a\u00020\u00002\b\u0010h\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010iJ\u0006\u0010{\u001a\u00020|R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001a\u0010 \u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\u001a\u0010(\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R\u001e\u0010+\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\tR\u001e\u0010.\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b/\u0010\u0007\"\u0004\b0\u0010\tR\u001e\u00101\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b2\u0010\u0007\"\u0004\b3\u0010\tR\u001e\u00104\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b5\u0010\u0007\"\u0004\b6\u0010\tR\"\u00107\u001a\n\u0012\u0004\u0012\u000209\u0018\u000108X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001e\u0010>\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b?\u0010\u0007\"\u0004\b@\u0010\tR\u001e\u0010A\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\bB\u0010\u0007\"\u0004\bC\u0010\tR\u001e\u0010D\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\bE\u0010\u0007\"\u0004\bF\u0010\tR\u001e\u0010G\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\bH\u0010\u0007\"\u0004\bI\u0010\tR\u001e\u0010J\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\bK\u0010\u0007\"\u0004\bL\u0010\tR\u001e\u0010M\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\bN\u0010\u0007\"\u0004\bO\u0010\tR\u001e\u0010P\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\bQ\u0010\u0007\"\u0004\bR\u0010\tR\u001e\u0010S\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\bT\u0010\u0007\"\u0004\bU\u0010\tR\u001e\u0010V\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\bW\u0010\u0007\"\u0004\bX\u0010\tR\u001e\u0010Y\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\bZ\u0010\u0011\"\u0004\b[\u0010\u0013R\u001e\u0010\\\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b]\u0010\u0011\"\u0004\b^\u0010\u0013R\u001e\u0010_\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b`\u0010\u0011\"\u0004\ba\u0010\u0013R\u001e\u0010b\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\bc\u0010\u0011\"\u0004\bd\u0010\u0013¨\u0006}"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport$Builder;", "", "<init>", "()V", "tzIn15Min", "", "getTzIn15Min", "()Ljava/lang/Integer;", "setTzIn15Min", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "version", "getVersion", "setVersion", "deviceBedTime", "", "getDeviceBedTime", "()Ljava/lang/Long;", "setDeviceBedTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "deviceWakeupTime", "getDeviceWakeupTime", "setDeviceWakeupTime", "bedTime", "getBedTime", "()J", "setBedTime", "(J)V", "wakeupTime", "getWakeupTime", "setWakeupTime", "sleepDuration", "getSleepDuration", "()I", "setSleepDuration", "(I)V", "deepDuration", "getDeepDuration", "setDeepDuration", "lightDuration", "getLightDuration", "setLightDuration", "remDuration", "getRemDuration", "setRemDuration", "wakeDuration", "getWakeDuration", "setWakeDuration", "wakeCount", "getWakeCount", "setWakeCount", "sleepTraceDuration", "getSleepTraceDuration", "setSleepTraceDuration", "sleepStates", "", "Lcom/xiaomi/fit/data/common/data/daily/SleepStateItem;", "getSleepStates", "()Ljava/util/List;", "setSleepStates", "(Ljava/util/List;)V", "avgHr", "getAvgHr", "setAvgHr", "maxHr", "getMaxHr", "setMaxHr", "minHr", "getMinHr", "setMinHr", FitnessReportKey.avgSpo2, "getAvgSpo2", "setAvgSpo2", FitnessReportKey.maxSpo2, "getMaxSpo2", "setMaxSpo2", FitnessReportKey.minSpo2, "getMinSpo2", "setMinSpo2", "breathQuality", "getBreathQuality", "setBreathQuality", "avgBreathRate", "getAvgBreathRate", "setAvgBreathRate", DailyReportKey.sleepEfficiency, "getSleepEfficiency", "setSleepEfficiency", "entrySleepDuration", "getEntrySleepDuration", "setEntrySleepDuration", "linBedDuration", "getLinBedDuration", "setLinBedDuration", DailyReportKey.goBedTime, "getGoBedTime", "setGoBedTime", "leaveBedTime", "getLeaveBedTime", "setLeaveBedTime", "tzOffsetIn15Min", "offset", "(Ljava/lang/Integer;)Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport$Builder;", "time", "(Ljava/lang/Long;)Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport$Builder;", "duration", "deepSleepDuration", "lightSleepDuration", "count", "addSleepState", "sleepItem", "setSleepState", "items", "", "hr", "avg", VibrateModeSetFragment.MAX, "min", "spo2", "quality", "rate", "efficiency", OneTrack.Param.BUILD, "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        @Nullable
        private Integer avgBreathRate;

        @Nullable
        private Integer avgHr;

        @Nullable
        private Integer avgSpo2;
        private long bedTime;

        @Nullable
        private Integer breathQuality;
        private int deepDuration;

        @Nullable
        private Long deviceBedTime;

        @Nullable
        private Long deviceWakeupTime;

        @Nullable
        private Long entrySleepDuration;

        @Nullable
        private Long goBedTime;

        @Nullable
        private Long leaveBedTime;
        private int lightDuration;

        @Nullable
        private Long linBedDuration;

        @Nullable
        private Integer maxHr;

        @Nullable
        private Integer maxSpo2;

        @Nullable
        private Integer minHr;

        @Nullable
        private Integer minSpo2;

        @Nullable
        private Integer remDuration;
        private int sleepDuration;

        @Nullable
        private Integer sleepEfficiency;

        @Nullable
        private List<SleepStateItem> sleepStates;

        @Nullable
        private Integer sleepTraceDuration;

        @Nullable
        private Integer tzIn15Min;

        @Nullable
        private Integer version;

        @Nullable
        private Integer wakeCount;

        @Nullable
        private Integer wakeDuration;
        private long wakeupTime;

        @NotNull
        public final Builder addSleepState(@NotNull SleepStateItem sleepItem) {
            Intrinsics.checkNotNullParameter(sleepItem, "sleepItem");
            if (this.sleepStates == null) {
                this.sleepStates = new LinkedList();
            }
            List<SleepStateItem> list = this.sleepStates;
            Intrinsics.checkNotNull(list);
            list.add(sleepItem);
            return this;
        }

        @NotNull
        public final Builder avgBreathRate(int rate) {
            this.avgBreathRate = Integer.valueOf(rate);
            return this;
        }

        @NotNull
        public final Builder bedTime(long time) {
            this.bedTime = time;
            return this;
        }

        @NotNull
        public final Builder breathQuality(int quality) {
            this.breathQuality = Integer.valueOf(quality);
            return this;
        }

        @NotNull
        public final SleepSegmentReport build() {
            return new SleepSegmentReport(this, 0L, 0L, 0, null, null, null, 0L, 0L, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 255, null);
        }

        @NotNull
        public final Builder deepSleepDuration(int duration) {
            this.deepDuration = duration;
            return this;
        }

        @NotNull
        public final Builder deviceBedTime(@Nullable Long time) {
            this.deviceBedTime = time;
            return this;
        }

        @NotNull
        public final Builder deviceWakeupTime(@Nullable Long time) {
            this.deviceWakeupTime = time;
            return this;
        }

        @NotNull
        public final Builder entrySleepDuration(@Nullable Long time) {
            this.entrySleepDuration = time;
            return this;
        }

        @Nullable
        public final Integer getAvgBreathRate() {
            return this.avgBreathRate;
        }

        @Nullable
        public final Integer getAvgHr() {
            return this.avgHr;
        }

        @Nullable
        public final Integer getAvgSpo2() {
            return this.avgSpo2;
        }

        public final long getBedTime() {
            return this.bedTime;
        }

        @Nullable
        public final Integer getBreathQuality() {
            return this.breathQuality;
        }

        public final int getDeepDuration() {
            return this.deepDuration;
        }

        @Nullable
        public final Long getDeviceBedTime() {
            return this.deviceBedTime;
        }

        @Nullable
        public final Long getDeviceWakeupTime() {
            return this.deviceWakeupTime;
        }

        @Nullable
        public final Long getEntrySleepDuration() {
            return this.entrySleepDuration;
        }

        @Nullable
        public final Long getGoBedTime() {
            return this.goBedTime;
        }

        @Nullable
        public final Long getLeaveBedTime() {
            return this.leaveBedTime;
        }

        public final int getLightDuration() {
            return this.lightDuration;
        }

        @Nullable
        public final Long getLinBedDuration() {
            return this.linBedDuration;
        }

        @Nullable
        public final Integer getMaxHr() {
            return this.maxHr;
        }

        @Nullable
        public final Integer getMaxSpo2() {
            return this.maxSpo2;
        }

        @Nullable
        public final Integer getMinHr() {
            return this.minHr;
        }

        @Nullable
        public final Integer getMinSpo2() {
            return this.minSpo2;
        }

        @Nullable
        public final Integer getRemDuration() {
            return this.remDuration;
        }

        public final int getSleepDuration() {
            return this.sleepDuration;
        }

        @Nullable
        public final Integer getSleepEfficiency() {
            return this.sleepEfficiency;
        }

        @Nullable
        public final List<SleepStateItem> getSleepStates() {
            return this.sleepStates;
        }

        @Nullable
        public final Integer getSleepTraceDuration() {
            return this.sleepTraceDuration;
        }

        @Nullable
        public final Integer getTzIn15Min() {
            return this.tzIn15Min;
        }

        @Nullable
        public final Integer getVersion() {
            return this.version;
        }

        @Nullable
        public final Integer getWakeCount() {
            return this.wakeCount;
        }

        @Nullable
        public final Integer getWakeDuration() {
            return this.wakeDuration;
        }

        public final long getWakeupTime() {
            return this.wakeupTime;
        }

        @NotNull
        public final Builder goBedTime(@Nullable Long time) {
            this.goBedTime = time;
            return this;
        }

        @NotNull
        public final Builder hr(int avg, int max, int min) {
            this.avgHr = Integer.valueOf(avg);
            this.maxHr = Integer.valueOf(max);
            this.minHr = Integer.valueOf(min);
            return this;
        }

        @NotNull
        public final Builder leaveBedTime(@Nullable Long time) {
            this.leaveBedTime = time;
            return this;
        }

        @NotNull
        public final Builder lightSleepDuration(int duration) {
            this.lightDuration = duration;
            return this;
        }

        @NotNull
        public final Builder linBedDuration(@Nullable Long time) {
            this.linBedDuration = time;
            return this;
        }

        @NotNull
        public final Builder remDuration(int duration) {
            this.remDuration = Integer.valueOf(duration);
            return this;
        }

        public final void setAvgBreathRate(@Nullable Integer num) {
            this.avgBreathRate = num;
        }

        public final void setAvgHr(@Nullable Integer num) {
            this.avgHr = num;
        }

        public final void setAvgSpo2(@Nullable Integer num) {
            this.avgSpo2 = num;
        }

        public final void setBedTime(long j) {
            this.bedTime = j;
        }

        public final void setBreathQuality(@Nullable Integer num) {
            this.breathQuality = num;
        }

        public final void setDeepDuration(int i) {
            this.deepDuration = i;
        }

        public final void setDeviceBedTime(@Nullable Long l) {
            this.deviceBedTime = l;
        }

        public final void setDeviceWakeupTime(@Nullable Long l) {
            this.deviceWakeupTime = l;
        }

        public final void setEntrySleepDuration(@Nullable Long l) {
            this.entrySleepDuration = l;
        }

        public final void setGoBedTime(@Nullable Long l) {
            this.goBedTime = l;
        }

        public final void setLeaveBedTime(@Nullable Long l) {
            this.leaveBedTime = l;
        }

        public final void setLightDuration(int i) {
            this.lightDuration = i;
        }

        public final void setLinBedDuration(@Nullable Long l) {
            this.linBedDuration = l;
        }

        public final void setMaxHr(@Nullable Integer num) {
            this.maxHr = num;
        }

        public final void setMaxSpo2(@Nullable Integer num) {
            this.maxSpo2 = num;
        }

        public final void setMinHr(@Nullable Integer num) {
            this.minHr = num;
        }

        public final void setMinSpo2(@Nullable Integer num) {
            this.minSpo2 = num;
        }

        public final void setRemDuration(@Nullable Integer num) {
            this.remDuration = num;
        }

        public final void setSleepDuration(int i) {
            this.sleepDuration = i;
        }

        public final void setSleepEfficiency(@Nullable Integer num) {
            this.sleepEfficiency = num;
        }

        @NotNull
        public final Builder setSleepState(@Nullable List<SleepStateItem> items) {
            List<SleepStateItem> list = this.sleepStates;
            if (list != null) {
                Intrinsics.checkNotNull(list);
                list.clear();
                this.sleepStates = null;
            }
            this.sleepStates = TypeIntrinsics.asMutableList(items);
            return this;
        }

        public final void setSleepStates(@Nullable List<SleepStateItem> list) {
            this.sleepStates = list;
        }

        public final void setSleepTraceDuration(@Nullable Integer num) {
            this.sleepTraceDuration = num;
        }

        public final void setTzIn15Min(@Nullable Integer num) {
            this.tzIn15Min = num;
        }

        public final void setVersion(@Nullable Integer num) {
            this.version = num;
        }

        public final void setWakeCount(@Nullable Integer num) {
            this.wakeCount = num;
        }

        public final void setWakeDuration(@Nullable Integer num) {
            this.wakeDuration = num;
        }

        public final void setWakeupTime(long j) {
            this.wakeupTime = j;
        }

        @NotNull
        public final Builder sleepDuration(int duration) {
            this.sleepDuration = duration;
            return this;
        }

        @NotNull
        public final Builder sleepEfficiency(@Nullable Integer efficiency) {
            this.sleepEfficiency = efficiency;
            return this;
        }

        @NotNull
        public final Builder sleepTraceDuration(int duration) {
            this.sleepTraceDuration = Integer.valueOf(duration);
            return this;
        }

        @NotNull
        public final Builder spo2(int avg, int max, int min) {
            this.avgSpo2 = Integer.valueOf(avg);
            this.maxSpo2 = Integer.valueOf(max);
            this.minSpo2 = Integer.valueOf(min);
            return this;
        }

        @NotNull
        public final Builder tzOffsetIn15Min(@Nullable Integer offset) {
            this.tzIn15Min = offset;
            return this;
        }

        @NotNull
        public final Builder version(@Nullable Integer version) {
            this.version = version;
            return this;
        }

        @NotNull
        public final Builder wakeCount(int count) {
            this.wakeCount = Integer.valueOf(count);
            return this;
        }

        @NotNull
        public final Builder wakeDuration(int duration) {
            this.wakeDuration = Integer.valueOf(duration);
            return this;
        }

        @NotNull
        public final Builder wakeupTime(long time) {
            this.wakeupTime = time;
            return this;
        }
    }

    public /* synthetic */ SleepSegmentReport(Builder builder, long j, long j2, int i, Integer num, Long l, Long l2, long j3, long j4, int i2, int i3, int i4, Integer num2, Integer num3, Integer num4, Integer num5, List list, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Long l3, Long l4, Long l5, Long l6, List list2, List list3, List list4, List list5, List list6, SleepAssistItemInfo sleepAssistItemInfo, List list7, List list8, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder, (i5 & 2) != 0 ? 0L : j, (i5 & 4) != 0 ? 0L : j2, (i5 & 8) != 0 ? 0 : i, (i5 & 16) != 0 ? 0 : num, (i5 & 32) != 0 ? null : l, (i5 & 64) != 0 ? null : l2, (i5 & 128) != 0 ? 0L : j3, (i5 & 256) != 0 ? 0L : j4, (i5 & 512) != 0 ? 0 : i2, (i5 & 1024) != 0 ? 0 : i3, (i5 & 2048) != 0 ? 0 : i4, (i5 & 4096) != 0 ? null : num2, (i5 & 8192) != 0 ? null : num3, (i5 & 16384) != 0 ? null : num4, (i5 & 32768) != 0 ? null : num5, (i5 & 65536) != 0 ? null : list, (i5 & 131072) != 0 ? null : num6, (i5 & 262144) != 0 ? null : num7, (i5 & 524288) != 0 ? null : num8, (i5 & EventRecurrence.TH) != 0 ? null : num9, (i5 & 2097152) != 0 ? null : num10, (i5 & 4194304) != 0 ? null : num11, (i5 & NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY) != 0 ? null : num12, (i5 & 16777216) != 0 ? null : num13, (i5 & 33554432) != 0 ? null : num14, (i5 & 67108864) != 0 ? null : num15, (i5 & 134217728) != 0 ? null : num16, (i5 & 268435456) != 0 ? null : l3, (i5 & 536870912) != 0 ? null : l4, (i5 & 1073741824) != 0 ? null : l5, (i5 & Integer.MIN_VALUE) != 0 ? null : l6, (i6 & 1) != 0 ? null : list2, (i6 & 2) != 0 ? null : list3, (i6 & 4) != 0 ? null : list4, (i6 & 8) != 0 ? null : list5, (i6 & 16) != 0 ? null : list6, (i6 & 32) != 0 ? null : sleepAssistItemInfo, (i6 & 64) != 0 ? null : list7, (i6 & 128) != 0 ? null : list8);
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final long getTime() {
        return this.time;
    }

    public final boolean audioDataIsEmpty() {
        List<SnoreDreamTalkAudio> list;
        List<SnoreDreamTalkAudio> list2;
        return this.snoreRecordInfo == null && ((list = this.snoreAudioList) == null || list.isEmpty()) && ((list2 = this.dreamTalkAudioList) == null || list2.isEmpty());
    }

    @NotNull
    public final Builder builder() {
        Builder builderLightSleepDuration = new Builder().tzOffsetIn15Min(Integer.valueOf(this.tzIn15Min)).version(this.version).deviceBedTime(this.deviceBedTime).deviceWakeupTime(this.deviceWakeupTime).bedTime(this.bedTime).wakeupTime(this.wakeupTime).sleepDuration(this.sleepDuration).deepSleepDuration(this.deepDuration).lightSleepDuration(this.lightDuration);
        Integer num = this.remDuration;
        if (num != null) {
            Intrinsics.checkNotNull(num);
            builderLightSleepDuration.remDuration(num.intValue());
        }
        Integer num2 = this.wakeCount;
        if (num2 != null) {
            Intrinsics.checkNotNull(num2);
            builderLightSleepDuration.wakeCount(num2.intValue());
        }
        Integer num3 = this.wakeDuration;
        if (num3 != null) {
            Intrinsics.checkNotNull(num3);
            builderLightSleepDuration.wakeDuration(num3.intValue());
        }
        Integer num4 = this.sleepTraceDuration;
        if (num4 != null) {
            Intrinsics.checkNotNull(num4);
            builderLightSleepDuration.sleepTraceDuration(num4.intValue());
        }
        List<SleepStateItem> list = this.sleepItems;
        if (list != null) {
            builderLightSleepDuration.setSleepState(list);
        }
        Integer num5 = this.avgHr;
        if (num5 != null) {
            Intrinsics.checkNotNull(num5);
            int iIntValue = num5.intValue();
            Integer num6 = this.maxHr;
            Intrinsics.checkNotNull(num6);
            int iIntValue2 = num6.intValue();
            Integer num7 = this.minHr;
            Intrinsics.checkNotNull(num7);
            builderLightSleepDuration.hr(iIntValue, iIntValue2, num7.intValue());
        }
        Integer num8 = this.avgSpo2;
        if (num8 != null) {
            Intrinsics.checkNotNull(num8);
            int iIntValue3 = num8.intValue();
            Integer num9 = this.maxSpo2;
            Intrinsics.checkNotNull(num9);
            int iIntValue4 = num9.intValue();
            Integer num10 = this.minSpo2;
            Intrinsics.checkNotNull(num10);
            builderLightSleepDuration.spo2(iIntValue3, iIntValue4, num10.intValue());
        }
        Integer num11 = this.breathQuality;
        if (num11 != null) {
            Intrinsics.checkNotNull(num11);
            builderLightSleepDuration.breathQuality(num11.intValue());
        }
        Integer num12 = this.avgBreathRate;
        if (num12 != null) {
            Intrinsics.checkNotNull(num12);
            builderLightSleepDuration.avgBreathRate(num12.intValue());
        }
        Long l = this.entrySleepDuration;
        if (l != null) {
            Intrinsics.checkNotNull(l);
            builderLightSleepDuration.entrySleepDuration(l);
        }
        Integer num13 = this.sleepEfficiency;
        if (num13 != null) {
            Intrinsics.checkNotNull(num13);
            builderLightSleepDuration.sleepEfficiency(num13);
        }
        Long l2 = this.linBedDuration;
        if (l2 != null) {
            Intrinsics.checkNotNull(l2);
            builderLightSleepDuration.linBedDuration(l2);
        }
        Long l3 = this.leaveBedTime;
        if (l3 != null) {
            builderLightSleepDuration.leaveBedTime(l3);
        }
        Long l4 = this.goBedTime;
        if (l4 != null) {
            builderLightSleepDuration.goBedTime(l4);
        }
        return builderLightSleepDuration;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Builder getBuilder() {
        return this.builder;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getSleepDuration() {
        return this.sleepDuration;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getDeepDuration() {
        return this.deepDuration;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getLightDuration() {
        return this.lightDuration;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getRemDuration() {
        return this.remDuration;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getWakeDuration() {
        return this.wakeDuration;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getWakeCount() {
        return this.wakeCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Integer getSleepTraceDuration() {
        return this.sleepTraceDuration;
    }

    @Nullable
    public final List<SleepStateItem> component17() {
        return this.sleepItems;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Integer getBreathQuality() {
        return this.breathQuality;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Integer getAvgBreathRate() {
        return this.avgBreathRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Integer getAvgHr() {
        return this.avgHr;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Integer getMaxHr() {
        return this.maxHr;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Integer getMinHr() {
        return this.minHr;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Integer getAvgSpo2() {
        return this.avgSpo2;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Integer getMaxSpo2() {
        return this.maxSpo2;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Integer getMinSpo2() {
        return this.minSpo2;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Integer getSnoreDuration() {
        return this.snoreDuration;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Integer getDreamTalkCount() {
        return this.dreamTalkCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Integer getSleepEfficiency() {
        return this.sleepEfficiency;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Long getEntrySleepDuration() {
        return this.entrySleepDuration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getProtoTime() {
        return this.protoTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Long getLinBedDuration() {
        return this.linBedDuration;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final Long getGoBedTime() {
        return this.goBedTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final Long getLeaveBedTime() {
        return this.leaveBedTime;
    }

    @Nullable
    public final List<TimesDataRecordInt> component33() {
        return this.hrRecords;
    }

    @Nullable
    public final List<TimesDataRecordInt> component34() {
        return this.spo2Records;
    }

    @Nullable
    public final List<TimesDataRecordInt> component35() {
        return this.breathRateRecords;
    }

    @Nullable
    public final List<TimedValue<Integer>> component36() {
        return this.hrDetailRecords;
    }

    @Nullable
    public final List<TimedValue<Integer>> component37() {
        return this.spo2DetailRecords;
    }

    @Nullable
    /* JADX INFO: renamed from: component38, reason: from getter */
    public final SleepAssistItemInfo getSnoreRecordInfo() {
        return this.snoreRecordInfo;
    }

    @Nullable
    public final List<SnoreDreamTalkAudio> component39() {
        return this.snoreAudioList;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTzIn15Min() {
        return this.tzIn15Min;
    }

    @Nullable
    public final List<SnoreDreamTalkAudio> component40() {
        return this.dreamTalkAudioList;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getDeviceBedTime() {
        return this.deviceBedTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getDeviceWakeupTime() {
        return this.deviceWakeupTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getBedTime() {
        return this.bedTime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getWakeupTime() {
        return this.wakeupTime;
    }

    @NotNull
    public final SleepSegmentReport copy(@NotNull Builder builder, long time, long protoTime, int tzIn15Min, @Nullable Integer version, @Nullable Long deviceBedTime, @Nullable Long deviceWakeupTime, long bedTime, long wakeupTime, int sleepDuration, int deepDuration, int lightDuration, @Nullable Integer remDuration, @Nullable Integer wakeDuration, @Nullable Integer wakeCount, @Nullable Integer sleepTraceDuration, @Nullable List<SleepStateItem> sleepItems, @Nullable Integer breathQuality, @Nullable Integer avgBreathRate, @Nullable Integer avgHr, @Nullable Integer maxHr, @Nullable Integer minHr, @Nullable Integer avgSpo2, @Nullable Integer maxSpo2, @Nullable Integer minSpo2, @Nullable Integer snoreDuration, @Nullable Integer dreamTalkCount, @Nullable Integer sleepEfficiency, @Nullable Long entrySleepDuration, @Nullable Long linBedDuration, @Nullable Long goBedTime, @Nullable Long leaveBedTime, @Nullable List<TimesDataRecordInt> hrRecords, @Nullable List<TimesDataRecordInt> spo2Records, @Nullable List<TimesDataRecordInt> breathRateRecords, @Nullable List<TimedValue<Integer>> hrDetailRecords, @Nullable List<TimedValue<Integer>> spo2DetailRecords, @Nullable SleepAssistItemInfo snoreRecordInfo, @Nullable List<SnoreDreamTalkAudio> snoreAudioList, @Nullable List<SnoreDreamTalkAudio> dreamTalkAudioList) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return new SleepSegmentReport(builder, time, protoTime, tzIn15Min, version, deviceBedTime, deviceWakeupTime, bedTime, wakeupTime, sleepDuration, deepDuration, lightDuration, remDuration, wakeDuration, wakeCount, sleepTraceDuration, sleepItems, breathQuality, avgBreathRate, avgHr, maxHr, minHr, avgSpo2, maxSpo2, minSpo2, snoreDuration, dreamTalkCount, sleepEfficiency, entrySleepDuration, linBedDuration, goBedTime, leaveBedTime, hrRecords, spo2Records, breathRateRecords, hrDetailRecords, spo2DetailRecords, snoreRecordInfo, snoreAudioList, dreamTalkAudioList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepSegmentReport)) {
            return false;
        }
        SleepSegmentReport sleepSegmentReport = (SleepSegmentReport) other;
        return Intrinsics.areEqual(this.builder, sleepSegmentReport.builder) && this.time == sleepSegmentReport.time && this.protoTime == sleepSegmentReport.protoTime && this.tzIn15Min == sleepSegmentReport.tzIn15Min && Intrinsics.areEqual(this.version, sleepSegmentReport.version) && Intrinsics.areEqual(this.deviceBedTime, sleepSegmentReport.deviceBedTime) && Intrinsics.areEqual(this.deviceWakeupTime, sleepSegmentReport.deviceWakeupTime) && this.bedTime == sleepSegmentReport.bedTime && this.wakeupTime == sleepSegmentReport.wakeupTime && this.sleepDuration == sleepSegmentReport.sleepDuration && this.deepDuration == sleepSegmentReport.deepDuration && this.lightDuration == sleepSegmentReport.lightDuration && Intrinsics.areEqual(this.remDuration, sleepSegmentReport.remDuration) && Intrinsics.areEqual(this.wakeDuration, sleepSegmentReport.wakeDuration) && Intrinsics.areEqual(this.wakeCount, sleepSegmentReport.wakeCount) && Intrinsics.areEqual(this.sleepTraceDuration, sleepSegmentReport.sleepTraceDuration) && Intrinsics.areEqual(this.sleepItems, sleepSegmentReport.sleepItems) && Intrinsics.areEqual(this.breathQuality, sleepSegmentReport.breathQuality) && Intrinsics.areEqual(this.avgBreathRate, sleepSegmentReport.avgBreathRate) && Intrinsics.areEqual(this.avgHr, sleepSegmentReport.avgHr) && Intrinsics.areEqual(this.maxHr, sleepSegmentReport.maxHr) && Intrinsics.areEqual(this.minHr, sleepSegmentReport.minHr) && Intrinsics.areEqual(this.avgSpo2, sleepSegmentReport.avgSpo2) && Intrinsics.areEqual(this.maxSpo2, sleepSegmentReport.maxSpo2) && Intrinsics.areEqual(this.minSpo2, sleepSegmentReport.minSpo2) && Intrinsics.areEqual(this.snoreDuration, sleepSegmentReport.snoreDuration) && Intrinsics.areEqual(this.dreamTalkCount, sleepSegmentReport.dreamTalkCount) && Intrinsics.areEqual(this.sleepEfficiency, sleepSegmentReport.sleepEfficiency) && Intrinsics.areEqual(this.entrySleepDuration, sleepSegmentReport.entrySleepDuration) && Intrinsics.areEqual(this.linBedDuration, sleepSegmentReport.linBedDuration) && Intrinsics.areEqual(this.goBedTime, sleepSegmentReport.goBedTime) && Intrinsics.areEqual(this.leaveBedTime, sleepSegmentReport.leaveBedTime) && Intrinsics.areEqual(this.hrRecords, sleepSegmentReport.hrRecords) && Intrinsics.areEqual(this.spo2Records, sleepSegmentReport.spo2Records) && Intrinsics.areEqual(this.breathRateRecords, sleepSegmentReport.breathRateRecords) && Intrinsics.areEqual(this.hrDetailRecords, sleepSegmentReport.hrDetailRecords) && Intrinsics.areEqual(this.spo2DetailRecords, sleepSegmentReport.spo2DetailRecords) && Intrinsics.areEqual(this.snoreRecordInfo, sleepSegmentReport.snoreRecordInfo) && Intrinsics.areEqual(this.snoreAudioList, sleepSegmentReport.snoreAudioList) && Intrinsics.areEqual(this.dreamTalkAudioList, sleepSegmentReport.dreamTalkAudioList);
    }

    @Nullable
    public final Integer getAvgBreathRate() {
        return this.avgBreathRate;
    }

    @Nullable
    public final Integer getAvgHr() {
        return this.avgHr;
    }

    @Nullable
    public final Integer getAvgSpo2() {
        return this.avgSpo2;
    }

    public final long getBedTime() {
        return this.bedTime;
    }

    @Nullable
    public final Integer getBreathQuality() {
        return this.breathQuality;
    }

    @Nullable
    public final List<TimesDataRecordInt> getBreathRateRecords() {
        return this.breathRateRecords;
    }

    @NotNull
    public final Builder getBuilder() {
        return this.builder;
    }

    public final int getDeepDuration() {
        return this.deepDuration;
    }

    @Nullable
    public final Long getDeviceBedTime() {
        return this.deviceBedTime;
    }

    @Nullable
    public final Long getDeviceWakeupTime() {
        return this.deviceWakeupTime;
    }

    @Nullable
    public final List<SnoreDreamTalkAudio> getDreamTalkAudioList() {
        return this.dreamTalkAudioList;
    }

    @Nullable
    public final Integer getDreamTalkCount() {
        return this.dreamTalkCount;
    }

    @Nullable
    public final Long getEntrySleepDuration() {
        return this.entrySleepDuration;
    }

    @Nullable
    public final Long getGoBedTime() {
        return this.goBedTime;
    }

    @Nullable
    public final List<TimedValue<Integer>> getHrDetailRecords() {
        return this.hrDetailRecords;
    }

    @Nullable
    public final List<TimesDataRecordInt> getHrRecords() {
        return this.hrRecords;
    }

    @Nullable
    public final Long getLeaveBedTime() {
        return this.leaveBedTime;
    }

    public final int getLightDuration() {
        return this.lightDuration;
    }

    @Nullable
    public final Long getLinBedDuration() {
        return this.linBedDuration;
    }

    @Nullable
    public final Integer getMaxHr() {
        return this.maxHr;
    }

    @Nullable
    public final Integer getMaxSpo2() {
        return this.maxSpo2;
    }

    @Nullable
    public final Integer getMinHr() {
        return this.minHr;
    }

    @Nullable
    public final Integer getMinSpo2() {
        return this.minSpo2;
    }

    public final long getProtoTime() {
        return this.protoTime;
    }

    @Nullable
    public final Integer getRemDuration() {
        return this.remDuration;
    }

    public final int getSleepDuration() {
        return this.sleepDuration;
    }

    @Nullable
    public final Integer getSleepEfficiency() {
        return this.sleepEfficiency;
    }

    @Nullable
    public final List<SleepStateItem> getSleepItems() {
        return this.sleepItems;
    }

    @Nullable
    public final Integer getSleepTraceDuration() {
        return this.sleepTraceDuration;
    }

    @Nullable
    public final List<SnoreDreamTalkAudio> getSnoreAudioList() {
        return this.snoreAudioList;
    }

    @Nullable
    public final Integer getSnoreDuration() {
        return this.snoreDuration;
    }

    @Nullable
    public final SleepAssistItemInfo getSnoreRecordInfo() {
        return this.snoreRecordInfo;
    }

    @Nullable
    public final List<TimedValue<Integer>> getSpo2DetailRecords() {
        return this.spo2DetailRecords;
    }

    @Nullable
    public final List<TimesDataRecordInt> getSpo2Records() {
        return this.spo2Records;
    }

    public final int getStageCount() {
        int i = this.lightDuration > 0 ? 1 : 0;
        if (this.deepDuration > 0) {
            i++;
        }
        Integer num = this.remDuration;
        if (num != null) {
            Intrinsics.checkNotNull(num);
            if (num.intValue() > 0) {
                i++;
            }
        }
        Integer num2 = this.wakeDuration;
        if (num2 == null) {
            return i;
        }
        Intrinsics.checkNotNull(num2);
        return num2.intValue() > 0 ? i + 1 : i;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        if (this.time <= 0) {
            this.time = this.wakeupTime;
        }
        return this.time;
    }

    public final int getTzIn15Min() {
        return this.tzIn15Min;
    }

    @Nullable
    public final Integer getVersion() {
        return this.version;
    }

    @Nullable
    public final Integer getWakeCount() {
        return this.wakeCount;
    }

    @Nullable
    public final Integer getWakeDuration() {
        return this.wakeDuration;
    }

    public final long getWakeupTime() {
        return this.wakeupTime;
    }

    public final boolean hasStageData() {
        List<SleepStateItem> list = this.sleepItems;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            if ((!list.isEmpty()) && getStageCount() >= 2) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((((this.builder.hashCode() * 31) + Long.hashCode(this.time)) * 31) + Long.hashCode(this.protoTime)) * 31) + Integer.hashCode(this.tzIn15Min)) * 31;
        Integer num = this.version;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.deviceBedTime;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.deviceWakeupTime;
        int iHashCode4 = (((((((((((iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31) + Long.hashCode(this.bedTime)) * 31) + Long.hashCode(this.wakeupTime)) * 31) + Integer.hashCode(this.sleepDuration)) * 31) + Integer.hashCode(this.deepDuration)) * 31) + Integer.hashCode(this.lightDuration)) * 31;
        Integer num2 = this.remDuration;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.wakeDuration;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.wakeCount;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.sleepTraceDuration;
        int iHashCode8 = (iHashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        List<SleepStateItem> list = this.sleepItems;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num6 = this.breathQuality;
        int iHashCode10 = (iHashCode9 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.avgBreathRate;
        int iHashCode11 = (iHashCode10 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.avgHr;
        int iHashCode12 = (iHashCode11 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.maxHr;
        int iHashCode13 = (iHashCode12 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.minHr;
        int iHashCode14 = (iHashCode13 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.avgSpo2;
        int iHashCode15 = (iHashCode14 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.maxSpo2;
        int iHashCode16 = (iHashCode15 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.minSpo2;
        int iHashCode17 = (iHashCode16 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.snoreDuration;
        int iHashCode18 = (iHashCode17 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.dreamTalkCount;
        int iHashCode19 = (iHashCode18 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.sleepEfficiency;
        int iHashCode20 = (iHashCode19 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Long l3 = this.entrySleepDuration;
        int iHashCode21 = (iHashCode20 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.linBedDuration;
        int iHashCode22 = (iHashCode21 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.goBedTime;
        int iHashCode23 = (iHashCode22 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.leaveBedTime;
        int iHashCode24 = (iHashCode23 + (l6 == null ? 0 : l6.hashCode())) * 31;
        List<TimesDataRecordInt> list2 = this.hrRecords;
        int iHashCode25 = (iHashCode24 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TimesDataRecordInt> list3 = this.spo2Records;
        int iHashCode26 = (iHashCode25 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TimesDataRecordInt> list4 = this.breathRateRecords;
        int iHashCode27 = (iHashCode26 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<TimedValue<Integer>> list5 = this.hrDetailRecords;
        int iHashCode28 = (iHashCode27 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<TimedValue<Integer>> list6 = this.spo2DetailRecords;
        int iHashCode29 = (iHashCode28 + (list6 == null ? 0 : list6.hashCode())) * 31;
        SleepAssistItemInfo sleepAssistItemInfo = this.snoreRecordInfo;
        int iHashCode30 = (iHashCode29 + (sleepAssistItemInfo == null ? 0 : sleepAssistItemInfo.hashCode())) * 31;
        List<SnoreDreamTalkAudio> list7 = this.snoreAudioList;
        int iHashCode31 = (iHashCode30 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<SnoreDreamTalkAudio> list8 = this.dreamTalkAudioList;
        return iHashCode31 + (list8 != null ? list8.hashCode() : 0);
    }

    public final void setAvgBreathRate(@Nullable Integer num) {
        this.avgBreathRate = num;
    }

    public final void setAvgHr(@Nullable Integer num) {
        this.avgHr = num;
    }

    public final void setAvgSpo2(@Nullable Integer num) {
        this.avgSpo2 = num;
    }

    public final void setBedTime(long j) {
        this.bedTime = j;
    }

    public final void setBreathQuality(@Nullable Integer num) {
        this.breathQuality = num;
    }

    public final void setBreathRateRecords(@Nullable List<TimesDataRecordInt> list) {
        this.breathRateRecords = list;
    }

    public final void setDeepDuration(int i) {
        this.deepDuration = i;
    }

    public final void setDeviceBedTime(@Nullable Long l) {
        this.deviceBedTime = l;
    }

    public final void setDeviceWakeupTime(@Nullable Long l) {
        this.deviceWakeupTime = l;
    }

    public final void setDreamTalkAudioList(@Nullable List<SnoreDreamTalkAudio> list) {
        this.dreamTalkAudioList = list;
    }

    public final void setDreamTalkCount(@Nullable Integer num) {
        this.dreamTalkCount = num;
    }

    public final void setEntrySleepDuration(@Nullable Long l) {
        this.entrySleepDuration = l;
    }

    public final void setGoBedTime(@Nullable Long l) {
        this.goBedTime = l;
    }

    public final void setHrDetailRecords(@Nullable List<TimedValue<Integer>> list) {
        this.hrDetailRecords = list;
    }

    public final void setHrRecords(@Nullable List<TimesDataRecordInt> list) {
        this.hrRecords = list;
    }

    public final void setLeaveBedTime(@Nullable Long l) {
        this.leaveBedTime = l;
    }

    public final void setLightDuration(int i) {
        this.lightDuration = i;
    }

    public final void setLinBedDuration(@Nullable Long l) {
        this.linBedDuration = l;
    }

    public final void setMaxHr(@Nullable Integer num) {
        this.maxHr = num;
    }

    public final void setMaxSpo2(@Nullable Integer num) {
        this.maxSpo2 = num;
    }

    public final void setMinHr(@Nullable Integer num) {
        this.minHr = num;
    }

    public final void setMinSpo2(@Nullable Integer num) {
        this.minSpo2 = num;
    }

    public final void setProtoTime(long j) {
        this.protoTime = j;
    }

    public final void setRemDuration(@Nullable Integer num) {
        this.remDuration = num;
    }

    public final void setSleepDuration(int i) {
        this.sleepDuration = i;
    }

    public final void setSleepEfficiency(@Nullable Integer num) {
        this.sleepEfficiency = num;
    }

    public final void setSleepItems(@Nullable List<SleepStateItem> list) {
        this.sleepItems = list;
    }

    public final void setSleepTraceDuration(@Nullable Integer num) {
        this.sleepTraceDuration = num;
    }

    public final void setSnoreAudioList(@Nullable List<SnoreDreamTalkAudio> list) {
        this.snoreAudioList = list;
    }

    public final void setSnoreDuration(@Nullable Integer num) {
        this.snoreDuration = num;
    }

    public final void setSnoreRecordInfo(@Nullable SleepAssistItemInfo sleepAssistItemInfo) {
        this.snoreRecordInfo = sleepAssistItemInfo;
    }

    public final void setSpo2DetailRecords(@Nullable List<TimedValue<Integer>> list) {
        this.spo2DetailRecords = list;
    }

    public final void setSpo2Records(@Nullable List<TimesDataRecordInt> list) {
        this.spo2Records = list;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public void setTimestamp(long time) {
        this.time = time;
    }

    public final void setTzIn15Min(int i) {
        this.tzIn15Min = i;
    }

    public final void setVersion(@Nullable Integer num) {
        this.version = num;
    }

    public final void setWakeCount(@Nullable Integer num) {
        this.wakeCount = num;
    }

    public final void setWakeDuration(@Nullable Integer num) {
        this.wakeDuration = num;
    }

    public final void setWakeupTime(long j) {
        this.wakeupTime = j;
    }

    @NotNull
    public String toString() {
        String sid = getSid();
        long j = this.bedTime;
        long j2 = 1000;
        String date = TimeUtils.formatDate("yyyy-MM-dd HH:mm:ss", Long.valueOf(j * j2));
        long j3 = this.wakeupTime;
        String date2 = TimeUtils.formatDate("yyyy-MM-dd HH:mm:ss", Long.valueOf(j2 * j3));
        int i = this.tzIn15Min;
        int i2 = this.sleepDuration;
        Integer num = this.maxHr;
        Integer num2 = this.minHr;
        Integer num3 = this.avgHr;
        Integer num4 = this.maxSpo2;
        Integer num5 = this.minSpo2;
        Integer num6 = this.avgSpo2;
        int i3 = this.lightDuration;
        int i4 = this.deepDuration;
        Integer num7 = this.remDuration;
        Integer num8 = this.wakeCount;
        Integer num9 = this.wakeDuration;
        Integer num10 = this.snoreDuration;
        Integer num11 = this.dreamTalkCount;
        List<SleepStateItem> list = this.sleepItems;
        Integer numValueOf = list != null ? Integer.valueOf(list.size()) : null;
        Integer num12 = this.breathQuality;
        Integer num13 = this.avgBreathRate;
        int stageCount = getStageCount();
        SleepAssistItemInfo sleepAssistItemInfo = this.snoreRecordInfo;
        return "SleepSegmentReport{sid = " + sid + ", bedTime = " + j + ", bedTime = " + date + ", wakeupTime = " + j3 + ", wakeupTime = " + date2 + ", tzIn15Min = " + i + ", duration = " + i2 + ", maxHr = " + num + ", minHr = " + num2 + ", avgHr = " + num3 + ", maxSpo2 = " + num4 + ", minSpo2 = " + num5 + ", avgSpo2 = " + num6 + ", lightDuration = " + i3 + ", deepDuration = " + i4 + ", remDuration = " + num7 + ", wakeCount = " + num8 + ", wakeDuration = " + num9 + "，snoreDuration = " + num10 + "，dreamTalkCount = " + num11 + ", sleepItems = " + list + ", sleepItems.size = " + numValueOf + ", breathQuality = " + num12 + ", avgBreathRate =" + num13 + ", stageCount = " + stageCount + ", snoreRecordInfo = " + (sleepAssistItemInfo != null ? sleepAssistItemInfo.toString() : null) + ", hrRecords = " + this.hrRecords + ", spo2Records = " + this.spo2Records + ", sleepEfficiency = " + this.sleepEfficiency + ", linBedDuration = " + this.linBedDuration + ", entrySleepDuration = " + this.entrySleepDuration + ", leaveBedTime = " + this.leaveBedTime + ", goBedTime = " + this.goBedTime + "}";
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull SleepSegmentReport other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return (int) (this.bedTime - other.bedTime);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepSegmentReport(@NotNull Builder builder, long j, long j2, int i, @Nullable Integer num, @Nullable Long l, @Nullable Long l2, long j3, long j4, int i2, int i3, int i4, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable List<SleepStateItem> list, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15, @Nullable Integer num16, @Nullable Long l3, @Nullable Long l4, @Nullable Long l5, @Nullable Long l6, @Nullable List<TimesDataRecordInt> list2, @Nullable List<TimesDataRecordInt> list3, @Nullable List<TimesDataRecordInt> list4, @Nullable List<TimedValue<Integer>> list5, @Nullable List<TimedValue<Integer>> list6, @Nullable SleepAssistItemInfo sleepAssistItemInfo, @Nullable List<SnoreDreamTalkAudio> list7, @Nullable List<SnoreDreamTalkAudio> list8) {
        int iIntValue;
        super(null);
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.builder = builder;
        this.time = j;
        this.protoTime = j2;
        this.tzIn15Min = i;
        this.version = num;
        this.deviceBedTime = l;
        this.deviceWakeupTime = l2;
        this.bedTime = j3;
        this.wakeupTime = j4;
        this.sleepDuration = i2;
        this.deepDuration = i3;
        this.lightDuration = i4;
        this.remDuration = num2;
        this.wakeDuration = num3;
        this.wakeCount = num4;
        this.sleepTraceDuration = num5;
        this.sleepItems = list;
        this.breathQuality = num6;
        this.avgBreathRate = num7;
        this.avgHr = num8;
        this.maxHr = num9;
        this.minHr = num10;
        this.avgSpo2 = num11;
        this.maxSpo2 = num12;
        this.minSpo2 = num13;
        this.snoreDuration = num14;
        this.dreamTalkCount = num15;
        this.sleepEfficiency = num16;
        this.entrySleepDuration = l3;
        this.linBedDuration = l4;
        this.goBedTime = l5;
        this.leaveBedTime = l6;
        this.hrRecords = list2;
        this.spo2Records = list3;
        this.breathRateRecords = list4;
        this.hrDetailRecords = list5;
        this.spo2DetailRecords = list6;
        this.snoreRecordInfo = sleepAssistItemInfo;
        this.snoreAudioList = list7;
        this.dreamTalkAudioList = list8;
        this.protoTime = builder.getWakeupTime();
        if (builder.getTzIn15Min() == null) {
            iIntValue = 0;
        } else {
            Integer tzIn15Min = builder.getTzIn15Min();
            Intrinsics.checkNotNull(tzIn15Min);
            iIntValue = tzIn15Min.intValue();
        }
        this.tzIn15Min = iIntValue;
        this.version = builder.getVersion();
        this.deviceBedTime = builder.getDeviceBedTime();
        this.deviceWakeupTime = builder.getDeviceWakeupTime();
        this.bedTime = builder.getBedTime();
        this.wakeupTime = builder.getWakeupTime();
        this.sleepDuration = builder.getSleepDuration();
        this.deepDuration = builder.getDeepDuration();
        this.lightDuration = builder.getLightDuration();
        this.remDuration = builder.getRemDuration();
        this.wakeDuration = builder.getWakeDuration();
        this.wakeCount = builder.getWakeCount();
        this.sleepTraceDuration = builder.getSleepTraceDuration();
        this.sleepItems = builder.getSleepStates();
        this.avgHr = builder.getAvgHr();
        this.maxHr = builder.getMaxHr();
        this.minHr = builder.getMinHr();
        this.avgSpo2 = builder.getAvgSpo2();
        this.maxSpo2 = builder.getMaxSpo2();
        this.minSpo2 = builder.getMinSpo2();
        this.breathQuality = builder.getBreathQuality();
        this.avgBreathRate = builder.getAvgBreathRate();
        this.linBedDuration = builder.getLinBedDuration();
        this.entrySleepDuration = builder.getEntrySleepDuration();
        this.sleepEfficiency = builder.getSleepEfficiency();
        this.goBedTime = builder.getGoBedTime();
        this.leaveBedTime = builder.getLeaveBedTime();
    }
}
