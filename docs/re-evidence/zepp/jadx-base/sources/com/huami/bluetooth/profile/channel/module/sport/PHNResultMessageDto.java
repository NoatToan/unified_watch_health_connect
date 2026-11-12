package com.huami.bluetooth.profile.channel.module.sport;

import com.amap.api.mapcore.util.hl;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b>\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u0089\u00012\u00020\u0001:\u0004\u008a\u0001\u0089\u0001BÍ\u0002\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u000b¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001B²\u0002\b\u0017\u0012\u0007\u0010\u0085\u0001\u001a\u00020\u000b\u0012\b\u0010)\u001a\u0004\u0018\u00010\t\u0012\b\u0010*\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010+\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f\u0012\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u0012\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u0012\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u0012\b\u00100\u001a\u0004\u0018\u00010\u000b\u0012\b\u00101\u001a\u0004\u0018\u00010\u000b\u0012\b\u00102\u001a\u0004\u0018\u00010\u000b\u0012\b\u00103\u001a\u0004\u0018\u00010\u000b\u0012\b\u00104\u001a\u0004\u0018\u00010\u000b\u0012\b\u00105\u001a\u0004\u0018\u00010\u0011\u0012\b\u00106\u001a\u0004\u0018\u00010\u0011\u0012\b\u00107\u001a\u0004\u0018\u00010\u0011\u0012\b\u00108\u001a\u0004\u0018\u00010\u000b\u0012\b\u00109\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010=\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010>\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010?\u001a\u0004\u0018\u00010%\u0012\b\u0010@\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010A\u001a\u0004\u0018\u00010\u000b\u0012\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u0001¢\u0006\u0006\b\u0083\u0001\u0010\u0088\u0001J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000fHÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fHÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fHÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fHÆ\u0003J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\rJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\rJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\rJ\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\rJ\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\rJ\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\rJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0012\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b#\u0010\rJ\u0012\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b$\u0010\rJ\u000b\u0010&\u001a\u0004\u0018\u00010%HÆ\u0003J\u0012\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b'\u0010\rJ\u0012\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b(\u0010\rJÔ\u0002\u0010B\u001a\u00020\u00002\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\bB\u0010CJ\t\u0010D\u001a\u00020\tHÖ\u0001J\t\u0010E\u001a\u00020\u000bHÖ\u0001J\u0013\u0010H\u001a\u00020G2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010)\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001b\u0010*\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010\rR\u001b\u0010+\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\bP\u0010N\u001a\u0004\bQ\u0010\rR!\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f8\u0006@\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR!\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f8\u0006@\u0006¢\u0006\f\n\u0004\bV\u0010S\u001a\u0004\bW\u0010UR!\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f8\u0006@\u0006¢\u0006\f\n\u0004\bX\u0010S\u001a\u0004\bY\u0010UR!\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f8\u0006@\u0006¢\u0006\f\n\u0004\bZ\u0010S\u001a\u0004\b[\u0010UR\u001b\u00100\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\\\u0010N\u001a\u0004\b]\u0010\rR\u001b\u00101\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b^\u0010N\u001a\u0004\b_\u0010\rR\u001b\u00102\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b`\u0010N\u001a\u0004\ba\u0010\rR\u001b\u00103\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\bb\u0010N\u001a\u0004\bc\u0010\rR\u001b\u00104\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\bd\u0010N\u001a\u0004\be\u0010\rR\u001b\u00105\u001a\u0004\u0018\u00010\u00118\u0006@\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010\u001bR\u001b\u00106\u001a\u0004\u0018\u00010\u00118\u0006@\u0006¢\u0006\f\n\u0004\bi\u0010g\u001a\u0004\bj\u0010\u001bR\u001b\u00107\u001a\u0004\u0018\u00010\u00118\u0006@\u0006¢\u0006\f\n\u0004\bk\u0010g\u001a\u0004\bl\u0010\u001bR\u001b\u00108\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\bm\u0010N\u001a\u0004\bn\u0010\rR\u001b\u00109\u001a\u0004\u0018\u00010\u00118\u0006@\u0006¢\u0006\f\n\u0004\bo\u0010g\u001a\u0004\bp\u0010\u001bR\u001b\u0010:\u001a\u0004\u0018\u00010\u00118\u0006@\u0006¢\u0006\f\n\u0004\bq\u0010g\u001a\u0004\br\u0010\u001bR\u001b\u0010;\u001a\u0004\u0018\u00010\u00118\u0006@\u0006¢\u0006\f\n\u0004\bs\u0010g\u001a\u0004\bt\u0010\u001bR\u001b\u0010<\u001a\u0004\u0018\u00010\u00118\u0006@\u0006¢\u0006\f\n\u0004\bu\u0010g\u001a\u0004\bv\u0010\u001bR\u001b\u0010=\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\bw\u0010N\u001a\u0004\bx\u0010\rR\u001b\u0010>\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\by\u0010N\u001a\u0004\bz\u0010\rR\u001b\u0010?\u001a\u0004\u0018\u00010%8\u0006@\u0006¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u001c\u0010@\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\r\n\u0004\b\u007f\u0010N\u001a\u0005\b\u0080\u0001\u0010\rR\u001d\u0010A\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010N\u001a\u0005\b\u0082\u0001\u0010\r¨\u0006\u008b\u0001"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sport/PHNResultMessageDto;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "()Ljava/lang/Integer;", "component3", "", "component4", "", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "()Ljava/lang/Float;", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "Lcom/huami/bluetooth/profile/channel/module/sport/PHNExerciseInfoMessageDto;", "component23", "component24", "component25", "version", "daily_trimp_scores", "minutes_over_20m", "trimp_42_days", "atl_42_days", "ctl_42_days", "tsb_42_days", "current_weekday", "flag_tsb_below_20_in_a_week", "flag_tsb_below_20_in_10_days", "flag_tsb_below_20_ever", "flag_historical_trimp", "thelast_historical_trimp_ctl", "thelast_trimp_ctl_last_week", "thelast_trimp_ctl_a_week_before_last_week", "count_daily_exercise", "trimp_weekly_recommend", "trimp_daily_max", "trimp_daily_recommended", "trimp_week_completed", "percent_completed_week_trimp", "percent_completed_daily_trimp", "exercise_recommended_info", "last_update_time", "last_update_time_zone", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/huami/bluetooth/profile/channel/module/sport/PHNExerciseInfoMessageDto;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/huami/bluetooth/profile/channel/module/sport/PHNResultMessageDto;", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "b", "Ljava/lang/Integer;", "getDaily_trimp_scores", "c", "getMinutes_over_20m", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "getTrimp_42_days", "()Ljava/util/List;", "e", "getAtl_42_days", "f", "getCtl_42_days", "g", "getTsb_42_days", "h", "getCurrent_weekday", "i", "getFlag_tsb_below_20_in_a_week", z.j, "getFlag_tsb_below_20_in_10_days", hl.k, "getFlag_tsb_below_20_ever", "l", "getFlag_historical_trimp", "m", "Ljava/lang/Float;", "getThelast_historical_trimp_ctl", GoogleApiAvailabilityLight.b, "getThelast_trimp_ctl_last_week", "o", "getThelast_trimp_ctl_a_week_before_last_week", b.r, "getCount_daily_exercise", DTransferConstants.SEARCH_KEY, "getTrimp_weekly_recommend", "r", "getTrimp_daily_max", SOAP.XMLNS, "getTrimp_daily_recommended", "t", "getTrimp_week_completed", "u", "getPercent_completed_week_trimp", "v", "getPercent_completed_daily_trimp", "w", "Lcom/huami/bluetooth/profile/channel/module/sport/PHNExerciseInfoMessageDto;", "getExercise_recommended_info", "()Lcom/huami/bluetooth/profile/channel/module/sport/PHNExerciseInfoMessageDto;", "x", "getLast_update_time", "y", "getLast_update_time_zone", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/huami/bluetooth/profile/channel/module/sport/PHNExerciseInfoMessageDto;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/huami/bluetooth/profile/channel/module/sport/PHNExerciseInfoMessageDto;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class PHNResultMessageDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final String version;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer daily_trimp_scores;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer minutes_over_20m;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final List<Integer> trimp_42_days;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final List<Float> atl_42_days;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final List<Float> ctl_42_days;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private final List<Float> tsb_42_days;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer current_weekday;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer flag_tsb_below_20_in_a_week;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer flag_tsb_below_20_in_10_days;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer flag_tsb_below_20_ever;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer flag_historical_trimp;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @Nullable
    private final Float thelast_historical_trimp_ctl;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    @Nullable
    private final Float thelast_trimp_ctl_last_week;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @Nullable
    private final Float thelast_trimp_ctl_a_week_before_last_week;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer count_daily_exercise;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
    @Nullable
    private final Float trimp_weekly_recommend;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
    @Nullable
    private final Float trimp_daily_max;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata and from toString */
    @Nullable
    private final Float trimp_daily_recommended;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata and from toString */
    @Nullable
    private final Float trimp_week_completed;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer percent_completed_week_trimp;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer percent_completed_daily_trimp;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata and from toString */
    @Nullable
    private final PHNExerciseInfoMessageDto exercise_recommended_info;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer last_update_time;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer last_update_time_zone;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sport/PHNResultMessageDto$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/bluetooth/profile/channel/module/sport/PHNResultMessageDto;", "serializer", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<PHNResultMessageDto> serializer() {
            return PHNResultMessageDto$$serializer.INSTANCE;
        }
    }

    public PHNResultMessageDto() {
        this((String) null, (Integer) null, (Integer) null, (List) null, (List) null, (List) null, (List) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Float) null, (Float) null, (Float) null, (Integer) null, (Float) null, (Float) null, (Float) null, (Float) null, (Integer) null, (Integer) null, (PHNExerciseInfoMessageDto) null, (Integer) null, (Integer) null, 33554431, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PHNResultMessageDto(int i, String str, Integer num, Integer num2, List list, List list2, List list3, List list4, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Float f, Float f2, Float f3, Integer num8, Float f4, Float f5, Float f6, Float f7, Integer num9, Integer num10, PHNExerciseInfoMessageDto pHNExerciseInfoMessageDto, Integer num11, Integer num12, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, PHNResultMessageDto$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.version = null;
        } else {
            this.version = str;
        }
        if ((i & 2) == 0) {
            this.daily_trimp_scores = null;
        } else {
            this.daily_trimp_scores = num;
        }
        if ((i & 4) == 0) {
            this.minutes_over_20m = null;
        } else {
            this.minutes_over_20m = num2;
        }
        if ((i & 8) == 0) {
            this.trimp_42_days = null;
        } else {
            this.trimp_42_days = list;
        }
        if ((i & 16) == 0) {
            this.atl_42_days = null;
        } else {
            this.atl_42_days = list2;
        }
        if ((i & 32) == 0) {
            this.ctl_42_days = null;
        } else {
            this.ctl_42_days = list3;
        }
        if ((i & 64) == 0) {
            this.tsb_42_days = null;
        } else {
            this.tsb_42_days = list4;
        }
        if ((i & 128) == 0) {
            this.current_weekday = null;
        } else {
            this.current_weekday = num3;
        }
        if ((i & 256) == 0) {
            this.flag_tsb_below_20_in_a_week = null;
        } else {
            this.flag_tsb_below_20_in_a_week = num4;
        }
        if ((i & 512) == 0) {
            this.flag_tsb_below_20_in_10_days = null;
        } else {
            this.flag_tsb_below_20_in_10_days = num5;
        }
        if ((i & 1024) == 0) {
            this.flag_tsb_below_20_ever = null;
        } else {
            this.flag_tsb_below_20_ever = num6;
        }
        if ((i & 2048) == 0) {
            this.flag_historical_trimp = null;
        } else {
            this.flag_historical_trimp = num7;
        }
        if ((i & 4096) == 0) {
            this.thelast_historical_trimp_ctl = null;
        } else {
            this.thelast_historical_trimp_ctl = f;
        }
        if ((i & 8192) == 0) {
            this.thelast_trimp_ctl_last_week = null;
        } else {
            this.thelast_trimp_ctl_last_week = f2;
        }
        if ((i & 16384) == 0) {
            this.thelast_trimp_ctl_a_week_before_last_week = null;
        } else {
            this.thelast_trimp_ctl_a_week_before_last_week = f3;
        }
        if ((32768 & i) == 0) {
            this.count_daily_exercise = null;
        } else {
            this.count_daily_exercise = num8;
        }
        if ((65536 & i) == 0) {
            this.trimp_weekly_recommend = null;
        } else {
            this.trimp_weekly_recommend = f4;
        }
        if ((131072 & i) == 0) {
            this.trimp_daily_max = null;
        } else {
            this.trimp_daily_max = f5;
        }
        if ((262144 & i) == 0) {
            this.trimp_daily_recommended = null;
        } else {
            this.trimp_daily_recommended = f6;
        }
        if ((524288 & i) == 0) {
            this.trimp_week_completed = null;
        } else {
            this.trimp_week_completed = f7;
        }
        if ((1048576 & i) == 0) {
            this.percent_completed_week_trimp = null;
        } else {
            this.percent_completed_week_trimp = num9;
        }
        if ((2097152 & i) == 0) {
            this.percent_completed_daily_trimp = null;
        } else {
            this.percent_completed_daily_trimp = num10;
        }
        if ((4194304 & i) == 0) {
            this.exercise_recommended_info = null;
        } else {
            this.exercise_recommended_info = pHNExerciseInfoMessageDto;
        }
        if ((8388608 & i) == 0) {
            this.last_update_time = null;
        } else {
            this.last_update_time = num11;
        }
        if ((i & 16777216) == 0) {
            this.last_update_time_zone = null;
        } else {
            this.last_update_time_zone = num12;
        }
    }

    @JvmStatic
    public static final void write$Self(@NotNull PHNResultMessageDto self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.version != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.version);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.daily_trimp_scores != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.daily_trimp_scores);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.minutes_over_20m != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.minutes_over_20m);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.trimp_42_days != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, new ArrayListSerializer(IntSerializer.INSTANCE), self.trimp_42_days);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.atl_42_days != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, new ArrayListSerializer(FloatSerializer.INSTANCE), self.atl_42_days);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.ctl_42_days != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, new ArrayListSerializer(FloatSerializer.INSTANCE), self.ctl_42_days);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.tsb_42_days != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, new ArrayListSerializer(FloatSerializer.INSTANCE), self.tsb_42_days);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.current_weekday != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, IntSerializer.INSTANCE, self.current_weekday);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.flag_tsb_below_20_in_a_week != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, IntSerializer.INSTANCE, self.flag_tsb_below_20_in_a_week);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.flag_tsb_below_20_in_10_days != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, IntSerializer.INSTANCE, self.flag_tsb_below_20_in_10_days);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.flag_tsb_below_20_ever != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, IntSerializer.INSTANCE, self.flag_tsb_below_20_ever);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.flag_historical_trimp != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, IntSerializer.INSTANCE, self.flag_historical_trimp);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.thelast_historical_trimp_ctl != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, FloatSerializer.INSTANCE, self.thelast_historical_trimp_ctl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.thelast_trimp_ctl_last_week != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, FloatSerializer.INSTANCE, self.thelast_trimp_ctl_last_week);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.thelast_trimp_ctl_a_week_before_last_week != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, FloatSerializer.INSTANCE, self.thelast_trimp_ctl_a_week_before_last_week);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.count_daily_exercise != null) {
            output.encodeNullableSerializableElement(serialDesc, 15, IntSerializer.INSTANCE, self.count_daily_exercise);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.trimp_weekly_recommend != null) {
            output.encodeNullableSerializableElement(serialDesc, 16, FloatSerializer.INSTANCE, self.trimp_weekly_recommend);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17) || self.trimp_daily_max != null) {
            output.encodeNullableSerializableElement(serialDesc, 17, FloatSerializer.INSTANCE, self.trimp_daily_max);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 18) || self.trimp_daily_recommended != null) {
            output.encodeNullableSerializableElement(serialDesc, 18, FloatSerializer.INSTANCE, self.trimp_daily_recommended);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 19) || self.trimp_week_completed != null) {
            output.encodeNullableSerializableElement(serialDesc, 19, FloatSerializer.INSTANCE, self.trimp_week_completed);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 20) || self.percent_completed_week_trimp != null) {
            output.encodeNullableSerializableElement(serialDesc, 20, IntSerializer.INSTANCE, self.percent_completed_week_trimp);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 21) || self.percent_completed_daily_trimp != null) {
            output.encodeNullableSerializableElement(serialDesc, 21, IntSerializer.INSTANCE, self.percent_completed_daily_trimp);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 22) || self.exercise_recommended_info != null) {
            output.encodeNullableSerializableElement(serialDesc, 22, PHNExerciseInfoMessageDto$$serializer.INSTANCE, self.exercise_recommended_info);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 23) || self.last_update_time != null) {
            output.encodeNullableSerializableElement(serialDesc, 23, IntSerializer.INSTANCE, self.last_update_time);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 24) || self.last_update_time_zone != null) {
            output.encodeNullableSerializableElement(serialDesc, 24, IntSerializer.INSTANCE, self.last_update_time_zone);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getFlag_tsb_below_20_in_10_days() {
        return this.flag_tsb_below_20_in_10_days;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getFlag_tsb_below_20_ever() {
        return this.flag_tsb_below_20_ever;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getFlag_historical_trimp() {
        return this.flag_historical_trimp;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Float getThelast_historical_trimp_ctl() {
        return this.thelast_historical_trimp_ctl;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Float getThelast_trimp_ctl_last_week() {
        return this.thelast_trimp_ctl_last_week;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Float getThelast_trimp_ctl_a_week_before_last_week() {
        return this.thelast_trimp_ctl_a_week_before_last_week;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Integer getCount_daily_exercise() {
        return this.count_daily_exercise;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Float getTrimp_weekly_recommend() {
        return this.trimp_weekly_recommend;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Float getTrimp_daily_max() {
        return this.trimp_daily_max;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Float getTrimp_daily_recommended() {
        return this.trimp_daily_recommended;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getDaily_trimp_scores() {
        return this.daily_trimp_scores;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Float getTrimp_week_completed() {
        return this.trimp_week_completed;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Integer getPercent_completed_week_trimp() {
        return this.percent_completed_week_trimp;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Integer getPercent_completed_daily_trimp() {
        return this.percent_completed_daily_trimp;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final PHNExerciseInfoMessageDto getExercise_recommended_info() {
        return this.exercise_recommended_info;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Integer getLast_update_time() {
        return this.last_update_time;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Integer getLast_update_time_zone() {
        return this.last_update_time_zone;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getMinutes_over_20m() {
        return this.minutes_over_20m;
    }

    @Nullable
    public final List<Integer> component4() {
        return this.trimp_42_days;
    }

    @Nullable
    public final List<Float> component5() {
        return this.atl_42_days;
    }

    @Nullable
    public final List<Float> component6() {
        return this.ctl_42_days;
    }

    @Nullable
    public final List<Float> component7() {
        return this.tsb_42_days;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getCurrent_weekday() {
        return this.current_weekday;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getFlag_tsb_below_20_in_a_week() {
        return this.flag_tsb_below_20_in_a_week;
    }

    @NotNull
    public final PHNResultMessageDto copy(@Nullable String version, @Nullable Integer daily_trimp_scores, @Nullable Integer minutes_over_20m, @Nullable List<Integer> trimp_42_days, @Nullable List<Float> atl_42_days, @Nullable List<Float> ctl_42_days, @Nullable List<Float> tsb_42_days, @Nullable Integer current_weekday, @Nullable Integer flag_tsb_below_20_in_a_week, @Nullable Integer flag_tsb_below_20_in_10_days, @Nullable Integer flag_tsb_below_20_ever, @Nullable Integer flag_historical_trimp, @Nullable Float thelast_historical_trimp_ctl, @Nullable Float thelast_trimp_ctl_last_week, @Nullable Float thelast_trimp_ctl_a_week_before_last_week, @Nullable Integer count_daily_exercise, @Nullable Float trimp_weekly_recommend, @Nullable Float trimp_daily_max, @Nullable Float trimp_daily_recommended, @Nullable Float trimp_week_completed, @Nullable Integer percent_completed_week_trimp, @Nullable Integer percent_completed_daily_trimp, @Nullable PHNExerciseInfoMessageDto exercise_recommended_info, @Nullable Integer last_update_time, @Nullable Integer last_update_time_zone) {
        return new PHNResultMessageDto(version, daily_trimp_scores, minutes_over_20m, trimp_42_days, atl_42_days, ctl_42_days, tsb_42_days, current_weekday, flag_tsb_below_20_in_a_week, flag_tsb_below_20_in_10_days, flag_tsb_below_20_ever, flag_historical_trimp, thelast_historical_trimp_ctl, thelast_trimp_ctl_last_week, thelast_trimp_ctl_a_week_before_last_week, count_daily_exercise, trimp_weekly_recommend, trimp_daily_max, trimp_daily_recommended, trimp_week_completed, percent_completed_week_trimp, percent_completed_daily_trimp, exercise_recommended_info, last_update_time, last_update_time_zone);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PHNResultMessageDto)) {
            return false;
        }
        PHNResultMessageDto pHNResultMessageDto = (PHNResultMessageDto) other;
        return Intrinsics.areEqual(this.version, pHNResultMessageDto.version) && Intrinsics.areEqual(this.daily_trimp_scores, pHNResultMessageDto.daily_trimp_scores) && Intrinsics.areEqual(this.minutes_over_20m, pHNResultMessageDto.minutes_over_20m) && Intrinsics.areEqual(this.trimp_42_days, pHNResultMessageDto.trimp_42_days) && Intrinsics.areEqual(this.atl_42_days, pHNResultMessageDto.atl_42_days) && Intrinsics.areEqual(this.ctl_42_days, pHNResultMessageDto.ctl_42_days) && Intrinsics.areEqual(this.tsb_42_days, pHNResultMessageDto.tsb_42_days) && Intrinsics.areEqual(this.current_weekday, pHNResultMessageDto.current_weekday) && Intrinsics.areEqual(this.flag_tsb_below_20_in_a_week, pHNResultMessageDto.flag_tsb_below_20_in_a_week) && Intrinsics.areEqual(this.flag_tsb_below_20_in_10_days, pHNResultMessageDto.flag_tsb_below_20_in_10_days) && Intrinsics.areEqual(this.flag_tsb_below_20_ever, pHNResultMessageDto.flag_tsb_below_20_ever) && Intrinsics.areEqual(this.flag_historical_trimp, pHNResultMessageDto.flag_historical_trimp) && Intrinsics.areEqual((Object) this.thelast_historical_trimp_ctl, (Object) pHNResultMessageDto.thelast_historical_trimp_ctl) && Intrinsics.areEqual((Object) this.thelast_trimp_ctl_last_week, (Object) pHNResultMessageDto.thelast_trimp_ctl_last_week) && Intrinsics.areEqual((Object) this.thelast_trimp_ctl_a_week_before_last_week, (Object) pHNResultMessageDto.thelast_trimp_ctl_a_week_before_last_week) && Intrinsics.areEqual(this.count_daily_exercise, pHNResultMessageDto.count_daily_exercise) && Intrinsics.areEqual((Object) this.trimp_weekly_recommend, (Object) pHNResultMessageDto.trimp_weekly_recommend) && Intrinsics.areEqual((Object) this.trimp_daily_max, (Object) pHNResultMessageDto.trimp_daily_max) && Intrinsics.areEqual((Object) this.trimp_daily_recommended, (Object) pHNResultMessageDto.trimp_daily_recommended) && Intrinsics.areEqual((Object) this.trimp_week_completed, (Object) pHNResultMessageDto.trimp_week_completed) && Intrinsics.areEqual(this.percent_completed_week_trimp, pHNResultMessageDto.percent_completed_week_trimp) && Intrinsics.areEqual(this.percent_completed_daily_trimp, pHNResultMessageDto.percent_completed_daily_trimp) && Intrinsics.areEqual(this.exercise_recommended_info, pHNResultMessageDto.exercise_recommended_info) && Intrinsics.areEqual(this.last_update_time, pHNResultMessageDto.last_update_time) && Intrinsics.areEqual(this.last_update_time_zone, pHNResultMessageDto.last_update_time_zone);
    }

    @Nullable
    public final List<Float> getAtl_42_days() {
        return this.atl_42_days;
    }

    @Nullable
    public final Integer getCount_daily_exercise() {
        return this.count_daily_exercise;
    }

    @Nullable
    public final List<Float> getCtl_42_days() {
        return this.ctl_42_days;
    }

    @Nullable
    public final Integer getCurrent_weekday() {
        return this.current_weekday;
    }

    @Nullable
    public final Integer getDaily_trimp_scores() {
        return this.daily_trimp_scores;
    }

    @Nullable
    public final PHNExerciseInfoMessageDto getExercise_recommended_info() {
        return this.exercise_recommended_info;
    }

    @Nullable
    public final Integer getFlag_historical_trimp() {
        return this.flag_historical_trimp;
    }

    @Nullable
    public final Integer getFlag_tsb_below_20_ever() {
        return this.flag_tsb_below_20_ever;
    }

    @Nullable
    public final Integer getFlag_tsb_below_20_in_10_days() {
        return this.flag_tsb_below_20_in_10_days;
    }

    @Nullable
    public final Integer getFlag_tsb_below_20_in_a_week() {
        return this.flag_tsb_below_20_in_a_week;
    }

    @Nullable
    public final Integer getLast_update_time() {
        return this.last_update_time;
    }

    @Nullable
    public final Integer getLast_update_time_zone() {
        return this.last_update_time_zone;
    }

    @Nullable
    public final Integer getMinutes_over_20m() {
        return this.minutes_over_20m;
    }

    @Nullable
    public final Integer getPercent_completed_daily_trimp() {
        return this.percent_completed_daily_trimp;
    }

    @Nullable
    public final Integer getPercent_completed_week_trimp() {
        return this.percent_completed_week_trimp;
    }

    @Nullable
    public final Float getThelast_historical_trimp_ctl() {
        return this.thelast_historical_trimp_ctl;
    }

    @Nullable
    public final Float getThelast_trimp_ctl_a_week_before_last_week() {
        return this.thelast_trimp_ctl_a_week_before_last_week;
    }

    @Nullable
    public final Float getThelast_trimp_ctl_last_week() {
        return this.thelast_trimp_ctl_last_week;
    }

    @Nullable
    public final List<Integer> getTrimp_42_days() {
        return this.trimp_42_days;
    }

    @Nullable
    public final Float getTrimp_daily_max() {
        return this.trimp_daily_max;
    }

    @Nullable
    public final Float getTrimp_daily_recommended() {
        return this.trimp_daily_recommended;
    }

    @Nullable
    public final Float getTrimp_week_completed() {
        return this.trimp_week_completed;
    }

    @Nullable
    public final Float getTrimp_weekly_recommend() {
        return this.trimp_weekly_recommend;
    }

    @Nullable
    public final List<Float> getTsb_42_days() {
        return this.tsb_42_days;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.version;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.daily_trimp_scores;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.minutes_over_20m;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<Integer> list = this.trimp_42_days;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<Float> list2 = this.atl_42_days;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Float> list3 = this.ctl_42_days;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<Float> list4 = this.tsb_42_days;
        int iHashCode7 = (iHashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Integer num3 = this.current_weekday;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.flag_tsb_below_20_in_a_week;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.flag_tsb_below_20_in_10_days;
        int iHashCode10 = (iHashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.flag_tsb_below_20_ever;
        int iHashCode11 = (iHashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.flag_historical_trimp;
        int iHashCode12 = (iHashCode11 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Float f = this.thelast_historical_trimp_ctl;
        int iHashCode13 = (iHashCode12 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.thelast_trimp_ctl_last_week;
        int iHashCode14 = (iHashCode13 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.thelast_trimp_ctl_a_week_before_last_week;
        int iHashCode15 = (iHashCode14 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Integer num8 = this.count_daily_exercise;
        int iHashCode16 = (iHashCode15 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Float f4 = this.trimp_weekly_recommend;
        int iHashCode17 = (iHashCode16 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.trimp_daily_max;
        int iHashCode18 = (iHashCode17 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Float f6 = this.trimp_daily_recommended;
        int iHashCode19 = (iHashCode18 + (f6 == null ? 0 : f6.hashCode())) * 31;
        Float f7 = this.trimp_week_completed;
        int iHashCode20 = (iHashCode19 + (f7 == null ? 0 : f7.hashCode())) * 31;
        Integer num9 = this.percent_completed_week_trimp;
        int iHashCode21 = (iHashCode20 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.percent_completed_daily_trimp;
        int iHashCode22 = (iHashCode21 + (num10 == null ? 0 : num10.hashCode())) * 31;
        PHNExerciseInfoMessageDto pHNExerciseInfoMessageDto = this.exercise_recommended_info;
        int iHashCode23 = (iHashCode22 + (pHNExerciseInfoMessageDto == null ? 0 : pHNExerciseInfoMessageDto.hashCode())) * 31;
        Integer num11 = this.last_update_time;
        int iHashCode24 = (iHashCode23 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.last_update_time_zone;
        return iHashCode24 + (num12 != null ? num12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PHNResultMessageDto(version=" + ((Object) this.version) + ", daily_trimp_scores=" + this.daily_trimp_scores + ", minutes_over_20m=" + this.minutes_over_20m + ", trimp_42_days=" + this.trimp_42_days + ", atl_42_days=" + this.atl_42_days + ", ctl_42_days=" + this.ctl_42_days + ", tsb_42_days=" + this.tsb_42_days + ", current_weekday=" + this.current_weekday + ", flag_tsb_below_20_in_a_week=" + this.flag_tsb_below_20_in_a_week + ", flag_tsb_below_20_in_10_days=" + this.flag_tsb_below_20_in_10_days + ", flag_tsb_below_20_ever=" + this.flag_tsb_below_20_ever + ", flag_historical_trimp=" + this.flag_historical_trimp + ", thelast_historical_trimp_ctl=" + this.thelast_historical_trimp_ctl + ", thelast_trimp_ctl_last_week=" + this.thelast_trimp_ctl_last_week + ", thelast_trimp_ctl_a_week_before_last_week=" + this.thelast_trimp_ctl_a_week_before_last_week + ", count_daily_exercise=" + this.count_daily_exercise + ", trimp_weekly_recommend=" + this.trimp_weekly_recommend + ", trimp_daily_max=" + this.trimp_daily_max + ", trimp_daily_recommended=" + this.trimp_daily_recommended + ", trimp_week_completed=" + this.trimp_week_completed + ", percent_completed_week_trimp=" + this.percent_completed_week_trimp + ", percent_completed_daily_trimp=" + this.percent_completed_daily_trimp + ", exercise_recommended_info=" + this.exercise_recommended_info + ", last_update_time=" + this.last_update_time + ", last_update_time_zone=" + this.last_update_time_zone + ')';
    }

    public PHNResultMessageDto(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable List<Integer> list, @Nullable List<Float> list2, @Nullable List<Float> list3, @Nullable List<Float> list4, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Float f, @Nullable Float f2, @Nullable Float f3, @Nullable Integer num8, @Nullable Float f4, @Nullable Float f5, @Nullable Float f6, @Nullable Float f7, @Nullable Integer num9, @Nullable Integer num10, @Nullable PHNExerciseInfoMessageDto pHNExerciseInfoMessageDto, @Nullable Integer num11, @Nullable Integer num12) {
        this.version = str;
        this.daily_trimp_scores = num;
        this.minutes_over_20m = num2;
        this.trimp_42_days = list;
        this.atl_42_days = list2;
        this.ctl_42_days = list3;
        this.tsb_42_days = list4;
        this.current_weekday = num3;
        this.flag_tsb_below_20_in_a_week = num4;
        this.flag_tsb_below_20_in_10_days = num5;
        this.flag_tsb_below_20_ever = num6;
        this.flag_historical_trimp = num7;
        this.thelast_historical_trimp_ctl = f;
        this.thelast_trimp_ctl_last_week = f2;
        this.thelast_trimp_ctl_a_week_before_last_week = f3;
        this.count_daily_exercise = num8;
        this.trimp_weekly_recommend = f4;
        this.trimp_daily_max = f5;
        this.trimp_daily_recommended = f6;
        this.trimp_week_completed = f7;
        this.percent_completed_week_trimp = num9;
        this.percent_completed_daily_trimp = num10;
        this.exercise_recommended_info = pHNExerciseInfoMessageDto;
        this.last_update_time = num11;
        this.last_update_time_zone = num12;
    }

    public /* synthetic */ PHNResultMessageDto(String str, Integer num, Integer num2, List list, List list2, List list3, List list4, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Float f, Float f2, Float f3, Integer num8, Float f4, Float f5, Float f6, Float f7, Integer num9, Integer num10, PHNExerciseInfoMessageDto pHNExerciseInfoMessageDto, Integer num11, Integer num12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : list3, (i & 64) != 0 ? null : list4, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : num4, (i & 512) != 0 ? null : num5, (i & 1024) != 0 ? null : num6, (i & 2048) != 0 ? null : num7, (i & 4096) != 0 ? null : f, (i & 8192) != 0 ? null : f2, (i & 16384) != 0 ? null : f3, (i & 32768) != 0 ? null : num8, (i & 65536) != 0 ? null : f4, (i & 131072) != 0 ? null : f5, (i & 262144) != 0 ? null : f6, (i & 524288) != 0 ? null : f7, (i & 1048576) != 0 ? null : num9, (i & 2097152) != 0 ? null : num10, (i & 4194304) != 0 ? null : pHNExerciseInfoMessageDto, (i & 8388608) != 0 ? null : num11, (i & 16777216) != 0 ? null : num12);
    }
}
