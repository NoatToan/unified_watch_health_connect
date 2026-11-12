package com.xiaomi.fitness.common.utils;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.text.style.RelativeSizeSpan;
import com.google.android.material.timepicker.TimeModel;
import com.miui.tsmclient.util.StringUtils;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.sport_eco.SportConstants;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.oyi;
import defpackage.rzi;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.Months;
import org.joda.time.Weeks;
import org.joda.time.Years;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\b?\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\r\n\u0002\b\u001c\n\u0002\u0010\u0015\n\u0002\bH\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b/\bÆ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\bÅ\u0002\u0010µ\u0002J!\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u0006\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\nJ!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u0007J+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0006\u0010\u000eJ+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0006\u0010\u000fJ!\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0017\u0010\u0014J\u0019\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u001b\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001b\u0010\u0016J\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001d\u0010\u0016J!\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u0007J\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001f\u0010\u0016J!\u0010!\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b!\u0010\u0007J\u0019\u0010\"\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\"\u0010\u0014J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0002H\u0007¢\u0006\u0004\b$\u0010\u0016J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b%\u0010\u0014J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0002H\u0007¢\u0006\u0004\b%\u0010\u0016J+\u0010)\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010\u00042\b\u0010(\u001a\u0004\u0018\u00010'H\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b+\u0010\u0014J\u0017\u0010+\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0002H\u0007¢\u0006\u0004\b+\u0010\u0016J\u0017\u0010,\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b,\u0010\u0014J\u0017\u0010-\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0002H\u0007¢\u0006\u0004\b-\u0010\u0016J\u0017\u0010,\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0002H\u0007¢\u0006\u0004\b,\u0010\u0016J\u0017\u0010/\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b/\u0010\u0014J\u0017\u00100\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b0\u0010\u0014J\u0017\u00100\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0002H\u0007¢\u0006\u0004\b0\u0010\u0016J\u0017\u00101\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b1\u0010\u0014J!\u00105\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u00022\b\b\u0002\u00104\u001a\u000203H\u0007¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0002H\u0007¢\u0006\u0004\b7\u0010\u0016J\u0017\u00108\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0002H\u0007¢\u0006\u0004\b8\u0010\u0016J\u001f\u0010;\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u0010H\u0007¢\u0006\u0004\b;\u0010<J\u001f\u0010=\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u0002H\u0007¢\u0006\u0004\b=\u0010>J\u001f\u0010=\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u0010H\u0007¢\u0006\u0004\b=\u0010<J\u0017\u0010?\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0002H\u0007¢\u0006\u0004\b?\u0010\u0016J!\u0010?\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0002H\u0007¢\u0006\u0004\bA\u0010\u0016J\u0017\u0010B\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0002H\u0007¢\u0006\u0004\bB\u0010\u0016J\u0017\u0010C\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0002H\u0007¢\u0006\u0004\bC\u0010\u0016J\u0017\u0010D\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0002H\u0007¢\u0006\u0004\bD\u0010\u0016J\u0017\u0010E\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0002H\u0007¢\u0006\u0004\bE\u0010\u0016J\u0017\u0010F\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\bF\u0010\u0014J\u0017\u0010F\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0002H\u0007¢\u0006\u0004\bF\u0010\u0016J\u001f\u0010J\u001a\u00020I2\u0006\u0010G\u001a\u00020\u00102\u0006\u0010H\u001a\u00020\u0010H\u0007¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\bL\u0010\u0014J\u0017\u0010M\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\bM\u0010\u0014J#\u0010N\u001a\u00020I2\b\u0010G\u001a\u0004\u0018\u00010\u00102\b\u0010H\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\bN\u0010KJ\u001f\u0010N\u001a\u00020I2\u0006\u0010O\u001a\u00020\u00022\u0006\u0010P\u001a\u00020\u0002H\u0007¢\u0006\u0004\bN\u0010QJ\u0017\u0010S\u001a\u0002032\u0006\u0010R\u001a\u00020\u0010H\u0007¢\u0006\u0004\bS\u0010TJ\u0017\u0010S\u001a\u0002032\u0006\u0010#\u001a\u00020\u0002H\u0007¢\u0006\u0004\bS\u0010UJ\u0017\u0010V\u001a\u0002032\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\bV\u0010TJ\u001f\u0010Y\u001a\u0002032\u0006\u0010W\u001a\u00020\u00102\u0006\u0010X\u001a\u00020\u0010H\u0007¢\u0006\u0004\bY\u0010ZJ\u001f\u0010\\\u001a\u0002032\u0006\u0010R\u001a\u00020\u00102\u0006\u0010[\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\\\u0010ZJ\u001f\u0010]\u001a\u0002032\u0006\u0010G\u001a\u00020\u00102\u0006\u0010H\u001a\u00020\u0010H\u0007¢\u0006\u0004\b]\u0010ZJ\u001f\u0010_\u001a\u0002032\u0006\u0010W\u001a\u00020\u00102\u0006\u0010^\u001a\u00020\u0010H\u0007¢\u0006\u0004\b_\u0010ZJ\u001d\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00100`2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\ba\u0010bJ\u0017\u0010c\u001a\u0002032\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\bc\u0010TJ\u0017\u0010d\u001a\u0002032\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\bd\u0010TJ\u0017\u0010e\u001a\u00020I2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\be\u0010fJ+\u0010h\u001a\u00020I2\b\u0010G\u001a\u0004\u0018\u00010\u00102\b\u0010H\u001a\u0004\u0018\u00010\u00102\u0006\u0010g\u001a\u00020IH\u0007¢\u0006\u0004\bh\u0010iJ\u0017\u0010j\u001a\u00020\u00102\u0006\u0010R\u001a\u00020\u0010H\u0002¢\u0006\u0004\bj\u0010kJ\u0017\u0010l\u001a\u00020\u00102\u0006\u0010R\u001a\u00020\u0010H\u0007¢\u0006\u0004\bl\u0010kJ\u0017\u0010m\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\bm\u0010nJ\u0017\u0010o\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\bo\u0010nJ\u0017\u0010p\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\bp\u0010qJ\u0017\u0010r\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\br\u0010qJ\u0017\u0010s\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0002H\u0007¢\u0006\u0004\bs\u0010tJ\u0017\u0010s\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\bs\u0010qJ\u0017\u0010v\u001a\u00020\b2\u0006\u0010u\u001a\u00020\u0002H\u0007¢\u0006\u0004\bv\u0010wJ\u0019\u0010x\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\bx\u0010qJ\u0019\u0010z\u001a\u00020\u00102\b\u0010y\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\bz\u0010kJ\u0019\u0010{\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b{\u0010kJ\u0019\u0010|\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b|\u0010qJ\u0019\u0010}\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b}\u0010kJ\u0019\u0010~\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b~\u0010kJ\u0017\u0010\u007f\u001a\u00020\u00022\u0006\u0010y\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u007f\u0010qJ\u0017\u0010\u007f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u007f\u0010tJ!\u0010\u0080\u0001\u001a\u0002032\u0006\u0010R\u001a\u00020\u00102\u0006\u0010[\u001a\u00020\u0010H\u0007¢\u0006\u0005\b\u0080\u0001\u0010ZJ\u0019\u0010\u0081\u0001\u001a\u0002032\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0005\b\u0081\u0001\u0010UJ\u0019\u0010\u0082\u0001\u001a\u0002032\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0005\b\u0082\u0001\u0010TJ\u001a\u0010\u0083\u0001\u001a\u00020I2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\"\u0010\u0086\u0001\u001a\u0002032\u0006\u0010\u0011\u001a\u00020\u00102\u0007\u0010\u0085\u0001\u001a\u00020\u0010H\u0007¢\u0006\u0005\b\u0086\u0001\u0010ZJ\u0019\u0010\u0087\u0001\u001a\u0002032\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0005\b\u0087\u0001\u0010TJ\u0019\u0010\u0087\u0001\u001a\u0002032\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0005\b\u0087\u0001\u0010UJ\u001a\u0010\u0089\u0001\u001a\u0002032\u0007\u0010\u0088\u0001\u001a\u00020\u0010H\u0007¢\u0006\u0005\b\u0089\u0001\u0010TJ\u0019\u0010\u008a\u0001\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0005\b\u008a\u0001\u0010kJ\"\u0010\u008c\u0001\u001a\u0002032\u0007\u0010\u008b\u0001\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0005\b\u008c\u0001\u0010ZJ$\u0010\u008c\u0001\u001a\u0002032\u0007\u0010\u008d\u0001\u001a\u00020\u00022\u0007\u0010\u008e\u0001\u001a\u00020\u0002H\u0007¢\u0006\u0006\b\u008c\u0001\u0010\u008f\u0001J\u001b\u0010\u0091\u0001\u001a\u00020\u00042\u0007\u0010\u0090\u0001\u001a\u00020IH\u0007¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J&\u0010\u0094\u0001\u001a\u00020\u00042\u0007\u0010\u0090\u0001\u001a\u00020I2\t\b\u0002\u0010\u0093\u0001\u001a\u000203H\u0007¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001JA\u0010\u009a\u0001\u001a\u00020\u00042\u0007\u0010\u0096\u0001\u001a\u00020I2\u0007\u0010\u0097\u0001\u001a\u00020\u00042\u0007\u0010\u0098\u0001\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u00042\t\b\u0002\u0010\u0093\u0001\u001a\u000203H\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u001a\u0010\u009c\u0001\u001a\u00020\u00042\u0006\u0010#\u001a\u00020IH\u0007¢\u0006\u0006\b\u009c\u0001\u0010\u0092\u0001J5\u0010\u009d\u0001\u001a\u00020\u00042\u0006\u0010#\u001a\u00020I2\u0007\u0010\u0097\u0001\u001a\u00020\u00042\u0007\u0010\u0098\u0001\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u0004H\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u001c\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00042\u0006\u0010#\u001a\u00020IH\u0007¢\u0006\u0006\b\u009f\u0001\u0010\u0092\u0001J;\u0010¥\u0001\u001a\u00020\u00042\b\u0010¡\u0001\u001a\u00030 \u00012\t\u0010¢\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010£\u0001\u001a\u0004\u0018\u00010\u00042\u0007\u0010¤\u0001\u001a\u00020\u0004H\u0002¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u001a\u0010§\u0001\u001a\u00020\u00042\u0006\u0010#\u001a\u00020IH\u0007¢\u0006\u0006\b§\u0001\u0010\u0092\u0001J&\u0010¬\u0001\u001a\u00030«\u00012\u0007\u0010¨\u0001\u001a\u00020I2\b\u0010ª\u0001\u001a\u00030©\u0001H\u0007¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J$\u0010°\u0001\u001a\u0002032\u0007\u0010®\u0001\u001a\u00020\u00022\u0007\u0010¯\u0001\u001a\u00020\u0002H\u0007¢\u0006\u0006\b°\u0001\u0010\u008f\u0001J\u001b\u0010²\u0001\u001a\u0002032\u0007\u0010±\u0001\u001a\u00020IH\u0002¢\u0006\u0006\b²\u0001\u0010³\u0001J\u001a\u0010µ\u0001\u001a\u00020\u00042\u0007\u0010´\u0001\u001a\u00020\u0002H\u0007¢\u0006\u0005\bµ\u0001\u0010\u0016JF\u0010»\u0001\u001a\u00020\u00042\b\u0010¶\u0001\u001a\u00030 \u00012\u0007\u0010·\u0001\u001a\u00020\u00022\t\b\u0002\u0010¸\u0001\u001a\u00020I2\t\b\u0002\u0010¹\u0001\u001a\u00020I2\t\b\u0002\u0010º\u0001\u001a\u00020IH\u0007¢\u0006\u0006\b»\u0001\u0010¼\u0001J%\u0010»\u0001\u001a\u00020\u00042\b\u0010¶\u0001\u001a\u00030 \u00012\u0007\u0010·\u0001\u001a\u00020\u0002H\u0007¢\u0006\u0006\b»\u0001\u0010½\u0001JF\u0010¿\u0001\u001a\u00020\u00042\b\u0010¶\u0001\u001a\u00030 \u00012\u0007\u0010¾\u0001\u001a\u00020\u00022\t\b\u0002\u0010¸\u0001\u001a\u00020I2\t\b\u0002\u0010¹\u0001\u001a\u00020I2\t\b\u0002\u0010º\u0001\u001a\u00020IH\u0007¢\u0006\u0006\b¿\u0001\u0010¼\u0001J%\u0010¿\u0001\u001a\u00020\u00042\b\u0010¶\u0001\u001a\u00030 \u00012\u0007\u0010¾\u0001\u001a\u00020\u0002H\u0007¢\u0006\u0006\b¿\u0001\u0010½\u0001JF\u0010Â\u0001\u001a\u00020\u00042\b\u0010À\u0001\u001a\u00030 \u00012\u0007\u0010Á\u0001\u001a\u00020\u00022\t\b\u0002\u0010¸\u0001\u001a\u00020I2\t\b\u0002\u0010¹\u0001\u001a\u00020I2\t\b\u0002\u0010º\u0001\u001a\u00020IH\u0007¢\u0006\u0006\bÂ\u0001\u0010¼\u0001J%\u0010Â\u0001\u001a\u00020\u00042\b\u0010À\u0001\u001a\u00030 \u00012\u0007\u0010Á\u0001\u001a\u00020\u0002H\u0007¢\u0006\u0006\bÂ\u0001\u0010½\u0001J%\u0010Ã\u0001\u001a\u00020\u00042\b\u0010À\u0001\u001a\u00030 \u00012\u0007\u0010Á\u0001\u001a\u00020\u0002H\u0007¢\u0006\u0006\bÃ\u0001\u0010½\u0001J%\u0010Ä\u0001\u001a\u00020\u00042\b\u0010À\u0001\u001a\u00030 \u00012\u0007\u0010Á\u0001\u001a\u00020\u0002H\u0007¢\u0006\u0006\bÄ\u0001\u0010½\u0001J\u0012\u0010Å\u0001\u001a\u00020\u0002H\u0007¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J\u001c\u0010É\u0001\u001a\u00030È\u00012\u0007\u0010Ç\u0001\u001a\u00020\u0002H\u0002¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J\u0019\u0010Ë\u0001\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0002H\u0007¢\u0006\u0005\bË\u0001\u0010\u0016J/\u0010Í\u0001\u001a\u00020\u00042\b\u0010¡\u0001\u001a\u00030 \u00012\u0007\u0010Ì\u0001\u001a\u00020I2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0006\bÍ\u0001\u0010Î\u0001J\u0017\u0010Ï\u0001\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0005\bÏ\u0001\u0010\u0016J\u0017\u0010Ð\u0001\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0005\bÐ\u0001\u0010\u0016J\u0017\u0010Ñ\u0001\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0005\bÑ\u0001\u0010\u0016J&\u0010Ô\u0001\u001a\u00020\u00022\t\u0010Ò\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010Ó\u0001\u001a\u0004\u0018\u00010\u0004¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001J\u0017\u0010Ö\u0001\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0002¢\u0006\u0005\bÖ\u0001\u0010\u0016J\u0019\u0010Ø\u0001\u001a\u00020\u00042\u0007\u0010×\u0001\u001a\u00020I¢\u0006\u0006\bØ\u0001\u0010\u0092\u0001J\u0015\u0010L\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\bL\u0010\u0016J\u0015\u0010M\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\bM\u0010\u0016J \u0010Ú\u0001\u001a\u00020I2\u0007\u0010Ù\u0001\u001a\u00020\u00022\u0006\u0010P\u001a\u00020\u0002¢\u0006\u0005\bÚ\u0001\u0010QJ\u001f\u0010Û\u0001\u001a\u00020I2\u0006\u0010G\u001a\u00020\u00102\u0006\u0010H\u001a\u00020\u0010¢\u0006\u0005\bÛ\u0001\u0010KJ \u0010Û\u0001\u001a\u00020I2\u0007\u0010Ù\u0001\u001a\u00020\u00022\u0006\u0010P\u001a\u00020\u0002¢\u0006\u0005\bÛ\u0001\u0010QJ\u001f\u0010Ü\u0001\u001a\u00020I2\u0006\u0010O\u001a\u00020\u00022\u0006\u0010P\u001a\u00020\u0002¢\u0006\u0005\bÜ\u0001\u0010QJ\u0017\u0010Ý\u0001\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0005\bÝ\u0001\u0010tJ\u0017\u0010Ý\u0001\u001a\u00020\u00022\u0006\u0010R\u001a\u00020\u0010¢\u0006\u0005\bÝ\u0001\u0010qJ\u0017\u0010Þ\u0001\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0005\bÞ\u0001\u0010tJ\u0017\u0010Þ\u0001\u001a\u00020\u00022\u0006\u0010R\u001a\u00020\u0010¢\u0006\u0005\bÞ\u0001\u0010qJ\u0017\u0010ß\u0001\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0005\bß\u0001\u0010tJ\u0017\u0010à\u0001\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0005\bà\u0001\u0010tJ\u0017\u0010á\u0001\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0005\bá\u0001\u0010tJ\u0017\u0010â\u0001\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0005\bâ\u0001\u0010tJ\u0017\u0010â\u0001\u001a\u00020\u00022\u0006\u0010R\u001a\u00020\u0010¢\u0006\u0005\bâ\u0001\u0010qJ\u0017\u0010ã\u0001\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0005\bã\u0001\u0010tJ$\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00100`2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010g\u001a\u00020I¢\u0006\u0005\ba\u0010ä\u0001J,\u0010ç\u0001\u001a\u00020I2\u000f\u0010å\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100`2\t\u0010æ\u0001\u001a\u0004\u0018\u00010\u0010¢\u0006\u0006\bç\u0001\u0010è\u0001J\u0017\u0010é\u0001\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0005\bé\u0001\u0010qJ\u0017\u0010é\u0001\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0002¢\u0006\u0005\bé\u0001\u0010tJ!\u0010ë\u0001\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00022\u0007\u0010ê\u0001\u001a\u00020I¢\u0006\u0006\bë\u0001\u0010ì\u0001J\u0018\u0010î\u0001\u001a\u00020\u00022\u0007\u0010í\u0001\u001a\u00020\u0002¢\u0006\u0005\bî\u0001\u0010tJ!\u0010ð\u0001\u001a\u00020\u00042\u0006\u0010#\u001a\u00020I2\u0007\u0010ï\u0001\u001a\u000203¢\u0006\u0006\bð\u0001\u0010\u0095\u0001J\u0018\u0010ñ\u0001\u001a\u00020\u00042\u0006\u0010.\u001a\u00020I¢\u0006\u0006\bñ\u0001\u0010\u0092\u0001J\u0019\u0010ó\u0001\u001a\u00020\u00042\u0007\u0010ò\u0001\u001a\u00020I¢\u0006\u0006\bó\u0001\u0010\u0092\u0001J\"\u0010ñ\u0001\u001a\u00020\u00042\u0007\u0010ô\u0001\u001a\u00020I2\u0007\u0010õ\u0001\u001a\u00020I¢\u0006\u0006\bñ\u0001\u0010ö\u0001J\"\u0010ø\u0001\u001a\u00020\u00042\u0007\u0010õ\u0001\u001a\u00020I2\u0007\u0010÷\u0001\u001a\u00020I¢\u0006\u0006\bø\u0001\u0010ö\u0001J&\u0010û\u0001\u001a\u00020\u00042\t\u0010ù\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010ú\u0001\u001a\u0004\u0018\u00010\u0004¢\u0006\u0006\bû\u0001\u0010ü\u0001J\u0019\u0010ý\u0001\u001a\u00020\u00042\u0007\u0010õ\u0001\u001a\u00020I¢\u0006\u0006\bý\u0001\u0010\u0092\u0001J\"\u0010\u0080\u0002\u001a\u00020\u00022\u0007\u0010þ\u0001\u001a\u00020\u00022\u0007\u0010ÿ\u0001\u001a\u00020\u0002¢\u0006\u0006\b\u0080\u0002\u0010\u0081\u0002J\u0018\u0010\u0082\u0002\u001a\u00020I2\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0006\b\u0082\u0002\u0010\u0084\u0001J\u0019\u0010\u0083\u0002\u001a\u00020I2\u0007\u0010Á\u0001\u001a\u00020\u0002¢\u0006\u0006\b\u0083\u0002\u0010\u0084\u0001J\"\u0010\u0083\u0002\u001a\u00020I2\u0007\u0010±\u0001\u001a\u00020I2\u0007\u0010\u0084\u0002\u001a\u00020I¢\u0006\u0006\b\u0083\u0002\u0010\u0085\u0002J\u0018\u0010\u0086\u0002\u001a\u00020I2\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0006\b\u0086\u0002\u0010\u0084\u0001J\u0018\u0010\u0087\u0002\u001a\u00020I2\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0006\b\u0087\u0002\u0010\u0084\u0001J\u0018\u0010\u0088\u0002\u001a\u00020I2\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0006\b\u0088\u0002\u0010\u0084\u0001J\u0017\u0010\u0089\u0002\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0002¢\u0006\u0005\b\u0089\u0002\u0010\u0016J\u0017\u0010\u008a\u0002\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0002¢\u0006\u0005\b\u008a\u0002\u0010\u0016J\u001c\u0010\u008b\u0002\u001a\u0002032\n\u0010¡\u0001\u001a\u0005\u0018\u00010 \u0001¢\u0006\u0006\b\u008b\u0002\u0010\u008c\u0002J\u0017\u0010\u008d\u0002\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0002¢\u0006\u0005\b\u008d\u0002\u0010\u0016J\"\u0010\u008f\u0002\u001a\u00020\u00042\u0007\u0010ô\u0001\u001a\u00020I2\u0007\u0010\u008e\u0002\u001a\u00020I¢\u0006\u0006\b\u008f\u0002\u0010ö\u0001J\u001a\u0010\u0092\u0002\u001a\u00030\u0091\u00022\u0007\u0010\u0090\u0002\u001a\u00020\u0002¢\u0006\u0006\b\u0092\u0002\u0010\u0093\u0002J#\u0010\u0095\u0002\u001a\u00020\u00022\u0007\u0010\u0090\u0002\u001a\u00020\u00022\b\u0010\u0094\u0002\u001a\u00030\u0091\u0002¢\u0006\u0006\b\u0095\u0002\u0010\u0096\u0002J\u001b\u0010\u0098\u0002\u001a\u00030\u0097\u00022\b\u0010\u0094\u0002\u001a\u00030\u0091\u0002¢\u0006\u0006\b\u0098\u0002\u0010\u0099\u0002J\u001a\u0010\u009a\u0002\u001a\u00020\u00042\b\u0010¶\u0001\u001a\u00030 \u0001¢\u0006\u0006\b\u009a\u0002\u0010\u009b\u0002J\u0010\u0010\u009c\u0002\u001a\u00020\u0002¢\u0006\u0006\b\u009c\u0002\u0010Æ\u0001J\u0010\u0010\u009d\u0002\u001a\u00020\u0004¢\u0006\u0006\b\u009d\u0002\u0010\u009e\u0002R\u0017\u0010\u009f\u0002\u001a\u00020\u00028\u0006X\u0086T¢\u0006\b\n\u0006\b\u009f\u0002\u0010 \u0002R\u0017\u0010¡\u0002\u001a\u00020\u00028\u0006X\u0086T¢\u0006\b\n\u0006\b¡\u0002\u0010 \u0002R\u0017\u0010¢\u0002\u001a\u00020I8\u0006X\u0086T¢\u0006\b\n\u0006\b¢\u0002\u0010£\u0002R\u0017\u0010¤\u0002\u001a\u00020I8\u0006X\u0086T¢\u0006\b\n\u0006\b¤\u0002\u0010£\u0002R\u0017\u0010¥\u0002\u001a\u00020I8\u0006X\u0086T¢\u0006\b\n\u0006\b¥\u0002\u0010£\u0002R\u0017\u0010¦\u0002\u001a\u00020I8\u0006X\u0086T¢\u0006\b\n\u0006\b¦\u0002\u0010£\u0002R\u0017\u0010§\u0002\u001a\u00020I8\u0006X\u0086T¢\u0006\b\n\u0006\b§\u0002\u0010£\u0002R\u0017\u0010¨\u0002\u001a\u00020I8\u0006X\u0086T¢\u0006\b\n\u0006\b¨\u0002\u0010£\u0002R\u0017\u0010©\u0002\u001a\u00020I8\u0002X\u0082T¢\u0006\b\n\u0006\b©\u0002\u0010£\u0002R\u0017\u0010ª\u0002\u001a\u00020I8\u0006X\u0086T¢\u0006\b\n\u0006\bª\u0002\u0010£\u0002R\u0017\u0010«\u0002\u001a\u00020I8\u0006X\u0086T¢\u0006\b\n\u0006\b«\u0002\u0010£\u0002R\u0017\u0010¬\u0002\u001a\u00020I8\u0006X\u0086T¢\u0006\b\n\u0006\b¬\u0002\u0010£\u0002R\u0017\u0010\u00ad\u0002\u001a\u00020I8\u0006X\u0086T¢\u0006\b\n\u0006\b\u00ad\u0002\u0010£\u0002R\u0017\u0010®\u0002\u001a\u00020I8\u0006X\u0086T¢\u0006\b\n\u0006\b®\u0002\u0010£\u0002R\u0017\u0010¯\u0002\u001a\u00020I8\u0006X\u0086T¢\u0006\b\n\u0006\b¯\u0002\u0010£\u0002R\u0017\u0010°\u0002\u001a\u00020I8\u0006X\u0086T¢\u0006\b\n\u0006\b°\u0002\u0010£\u0002R\u0017\u0010±\u0002\u001a\u00020I8\u0006X\u0086T¢\u0006\b\n\u0006\b±\u0002\u0010£\u0002R\u001f\u0010²\u0002\u001a\u0002038FX\u0087\u0004¢\u0006\u0010\u0012\u0006\b´\u0002\u0010µ\u0002\u001a\u0006\b²\u0002\u0010³\u0002R\u001f\u0010¸\u0002\u001a\u00020\u00048FX\u0087\u0004¢\u0006\u0010\u0012\u0006\b·\u0002\u0010µ\u0002\u001a\u0006\b¶\u0002\u0010\u009e\u0002R\u001f\u0010»\u0002\u001a\u00020\u00048FX\u0087\u0004¢\u0006\u0010\u0012\u0006\bº\u0002\u0010µ\u0002\u001a\u0006\b¹\u0002\u0010\u009e\u0002R\u001f\u0010¿\u0002\u001a\u00020I8FX\u0087\u0004¢\u0006\u0010\u0012\u0006\b¾\u0002\u0010µ\u0002\u001a\u0006\b¼\u0002\u0010½\u0002R\u0014\u0010Á\u0002\u001a\u00020\u00048F¢\u0006\b\u001a\u0006\bÀ\u0002\u0010\u009e\u0002R\u0015\u0010Ä\u0002\u001a\u00030\u0091\u00028F¢\u0006\b\u001a\u0006\bÂ\u0002\u0010Ã\u0002¨\u0006Æ\u0002"}, d2 = {"Lcom/xiaomi/fitness/common/utils/TimeDateUtil;", "", "", "timestamp", "", "patternStr", "getDateStr", "(JLjava/lang/String;)Ljava/lang/String;", "Ljava/util/TimeZone;", "timeZone", "(Ljava/util/TimeZone;Ljava/lang/String;)Ljava/lang/String;", "getDate24HStr", "Ljava/util/Locale;", "locale", "(JLjava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "(JLjava/lang/String;Ljava/util/TimeZone;)Ljava/lang/String;", "Lorg/joda/time/LocalDate;", "localDate", "(Lorg/joda/time/LocalDate;Ljava/lang/String;)Ljava/lang/String;", "getDateYYYYFormat", "(Lorg/joda/time/LocalDate;)Ljava/lang/String;", "mills", "(J)Ljava/lang/String;", "getDayFormat", "skeleton", "getDayFormatPetternStr", "(Ljava/lang/String;)Ljava/lang/String;", "getDateYYYYMMddLocalFormat", "millis", "getDateYYYYMMdd", "format", "getDateMdFormat", "formatStr", "getDateFormated", "getDateYYYYMMLocalFormat", "time", "getDateyyyyMMddHHmmFormat", "getDateMMddFormat", "formatPattern", "Lorg/joda/time/DateTimeZone;", "dateTimeZone", "getTimeStrWithTimeZone", "(JLjava/lang/String;Lorg/joda/time/DateTimeZone;)Ljava/lang/String;", "getDateMMddNumberFormat", "getDateMMddSimpleFormat", "getDateMMddSimpleFormatMills", "seconds", "getDateMMddAndWeekSimpleFormat", "getDateMMSimpleFormat", "getDateMMFormat", SportConstants.KEY_TIMESTAMP, "", "needFollowSystemHour", "getDateYYYYMMDDHHmmLocalFormat", "(JZ)Ljava/lang/String;", "getHHmmLocalFormat", "getDateYYYYMMDDLocalFormat", StatConstants.PARAM_START, StatConstants.PARAM_END, "getDateRangeFormat", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)Ljava/lang/String;", "getDateRangeMMddFormat", "(JJ)Ljava/lang/String;", "getDateYYYYMMDDHHmmssLocalFormat", "(JLjava/util/TimeZone;)Ljava/lang/String;", "getDateHHmmFormat", "getDate12HHmmFormatWithoutAM", "getDateHHmm24Format", "getDateHHmm12Format", "getDateHHmmssFormat", "getDateSimpleLocalFormat", "date1", "date2", "", "getIntervalMonths", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)I", "getWeekStr", "getWeekSimpleStr", "getIntervalDay", "mills1", "mills2", "(JJ)I", DialWidgetType.DATE, "isToday", "(Lorg/joda/time/LocalDate;)Z", "(J)Z", "isAfterToday", "currentMonth", "nextMonth", "isNextMonth", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)Z", "compareDate", "isSameMonthLocalDate", "isEqualsMonth", "lastMonth", "isLastMonth", "", "getMonthLocalDateCalendar", "(Lorg/joda/time/LocalDate;)Ljava/util/List;", "isSameWeekWithToday", "isThisYear", "getDayWeek", "(Lorg/joda/time/LocalDate;)I", "type", "getIntervalWeek", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;I)I", "getSunFirstDayOfWeek", "(Lorg/joda/time/LocalDate;)Lorg/joda/time/LocalDate;", "getMonFirstDayOfWeek", "timestampToLocalDateInner", "(J)Lorg/joda/time/LocalDate;", "timestampToLocalDate", "localDateToTimestampInner", "(Lorg/joda/time/LocalDate;)J", "localDateToTimestamp", "changZeroOfTheDay", "(J)J", "zoneOffsetInSec", "getTimeZone", "(J)Ljava/util/TimeZone;", "getNextWeekMondayTime", "localDateParam", "getNextWeekMonday", "getWeekMonday", "getNextMonthFirstDayOfTime", "getFirstDayOfNextMonth", "getFirstDayOfMonth", "getFirstDayOfMonthTime", "isSameLocalDate", "isEndHourOfTheDay", "isLastDayOfMonth", "getHourOfTheDay", "(J)I", "localDateCompare", "isSameMonth", "isFuture", "localDateEntry", "isSunday", "getFirstMonthOfTheYear", "compareLocalDate", "isSameYear", "year1", "year2", "(JJ)Z", "timeDuration", "getTimeStrWithSecDef", "(I)Ljava/lang/String;", "withHours", "getTimeStrWithHourSecDef", "(IZ)Ljava/lang/String;", "sleepTime", "hourUnit", "minUnit", "scdUnit", "getTimeStrWithSec", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;", "getSportPaceStrWithSecDef", "getPaceStrWithSec", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getZNTimeWithSec", "Landroid/content/Context;", "context", "hourStr", "minStr", "secondStr", "getHourMinSecondStr", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getZNTimeWithMin", "durationInMin", "", "sizeRatio", "", "getHHmmDurationSpannableWithMin", "(IF)Ljava/lang/CharSequence;", "endTime", "startTime", "isEndTimeAfterStart", "year", "isLeapYear", "(I)Z", "t1", "getTimeStr", "cxt", "timeInMinute", "mixedStyle", "hourOnlyStyle", "minOnlyStyle", "getHMFormatInMinutes", "(Landroid/content/Context;JIII)Ljava/lang/String;", "(Landroid/content/Context;J)Ljava/lang/String;", "timeInSecond", "getHMFormatInSecond", "ctx", "timeInMillis", "getHMFormatInMillis", "getDurationHrMinSecInMills", "getDurationHrMinSecInMills2", "getCurrentHourTime", "()J", "ms", "", "getHourMinuteAndSecond", "(J)[I", "getDateMMDDHHmmLocalFormat", "minutes", "minutesToLocalizedTime", "(Landroid/content/Context;ILjava/util/TimeZone;)Ljava/lang/String;", "getDurationStr", "getDurationStrHour", "getDateMMDDLocalFormat", "_date", "pattern", "dateToMs", "(Ljava/lang/String;Ljava/lang/String;)J", "getDateSimpleLocalFormatS", "day", "getDayOfMonthSuffix", "millis1", "yearsBetween", "monthsBetween", "weeksBetween", "atStartOfDay", "atStartOfMonth", "atEndOfMonth", "atStartOfWeek", "atEndOfWeek", "atStartOfYear", "atEndOfYear", "(Lorg/joda/time/LocalDate;I)Ljava/util/List;", "dateList", "mSelectDate", "getWeekOfMonth", "(Ljava/util/List;Lorg/joda/time/LocalDate;)I", "changZeroOfTheDayInner", "tzOffsetInSec", "changeZeroOfTheDay", "(JI)J", "offsetMillis", "getStartOfDayTimestamp", "isSimple", "getZNTimeWithMinute", "getZNTimeStrWithHrAndMin", "mins", "getZNTimeStrWithHrAndMinInMins", "hour", "min", "(II)Ljava/lang/String;", "second", "getZNTimeStrWithMinAndSec", "str1", "str2", "spliceTime", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getZNTimeDDHHMM", "Msec1", "Msec2", "getBetweenDays", "(JJ)J", "getMonth", "getDaysOfMonth", "month", "(II)I", "getDayOfWeek", "getDayOfMonth", "getMonthOfYear", "getTimePeriod", "getTimePeriodAndTime", "is12HourFormat", "(Landroid/content/Context;)Z", "getLastUpdateTimeStr", "minute", "getTimeByHourMinute", "timeInMills", "Ljava/util/Calendar;", "getZeroCalendarOf", "(J)Ljava/util/Calendar;", "calendar", "getZeroStartOf", "(JLjava/util/Calendar;)J", "", "zeroCalendar", "(Ljava/util/Calendar;)V", "getZeroHM", "(Landroid/content/Context;)Ljava/lang/String;", "getCurrentInitTime", "getTodayDate", "()Ljava/lang/String;", "TIME_DAY", "J", "TIME_HOUR", "TIME_HOUR_INT", "I", "TIME_MIN_INT", "TIME_HOUR_MIN", "NUM_DAY_OF_WEEK", "NUM_HOUR_OF_DAY", "NUM_MONTH_OF_YEAR", "MONDAY", "STYLE_H_LONG_M_LONG", "STYLE_H_LONG_M_SHORT", "STYLE_H_SHORT_M_LONG", "STYLE_H_SHORT_M_SHORT", "HOUR_LONG", "HOUR_SHORT", "MIN_LONG", "MIN_SHORT", "isLanguageEn", "()Z", "isLanguageEn$annotations", "()V", "getDateMMDDFormatPattern", "getDateMMDDFormatPattern$annotations", "dateMMDDFormatPattern", "getDateHHmmWithoutAMFFormatPattern", "getDateHHmmWithoutAMFFormatPattern$annotations", "dateHHmmWithoutAMFFormatPattern", "getTodayWeek", "()I", "getTodayWeek$annotations", "todayWeek", "getCurrentTimeID", "currentTimeID", "getZeroOfToday", "()Ljava/util/Calendar;", "zeroOfToday", "<init>", "common_release"}, k = 1, mv = {2, 0, 0})
public final class TimeDateUtil {
    public static final int HOUR_LONG = 0;
    public static final int HOUR_SHORT = 1;

    @NotNull
    public static final TimeDateUtil INSTANCE = new TimeDateUtil();
    public static final int MIN_LONG = 0;
    public static final int MIN_SHORT = 1;
    private static final int MONDAY = 301;
    public static final int NUM_DAY_OF_WEEK = 7;
    public static final int NUM_HOUR_OF_DAY = 24;
    public static final int NUM_MONTH_OF_YEAR = 12;
    public static final int STYLE_H_LONG_M_LONG = 0;
    public static final int STYLE_H_LONG_M_SHORT = 1;
    public static final int STYLE_H_SHORT_M_LONG = 2;
    public static final int STYLE_H_SHORT_M_SHORT = 3;
    public static final long TIME_DAY = 86400;
    public static final long TIME_HOUR = 3600;
    public static final int TIME_HOUR_INT = 3600;
    public static final int TIME_HOUR_MIN = 60;
    public static final int TIME_MIN_INT = 60;

    private TimeDateUtil() {
    }

    @JvmStatic
    public static final long changZeroOfTheDay(long time) {
        long j = 1000;
        return INSTANCE.changZeroOfTheDayInner(time * j) / j;
    }

    @JvmStatic
    public static final long getCurrentHourTime() {
        DateTime dateTime = new DateTime();
        return (dateTime.withMillisOfDay(0).getMillis() / ((long) 1000)) + ((long) (dateTime.getHourOfDay() * 3600));
    }

    @JvmStatic
    @NotNull
    public static final String getDate12HHmmFormatWithoutAM(long timeStamp) {
        return getDateStr(timeStamp, getDateHHmmWithoutAMFFormatPattern());
    }

    @JvmStatic
    @NotNull
    public static final String getDate24HStr(long timestamp, @Nullable String patternStr) {
        String str = new SimpleDateFormat(patternStr).format(new Date(timestamp * ((long) 1000)));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @JvmStatic
    @NotNull
    public static final String getDateFormated(long millis, @Nullable String formatStr) {
        String str = new SimpleDateFormat(formatStr, Locale.US).format(Long.valueOf(millis));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @JvmStatic
    @NotNull
    public static final String getDateHHmm12Format(long timeStamp) {
        return getDateStr(timeStamp, "hh:mm aa");
    }

    @JvmStatic
    @NotNull
    public static final String getDateHHmm24Format(long timeStamp) {
        return getDateStr(timeStamp, TimeUtils.FORMAT_H_M);
    }

    @JvmStatic
    @NotNull
    public static final String getDateHHmmFormat(long timeStamp) {
        return DateFormat.is24HourFormat(AppUtil.getApp()) ? getDateStr(timeStamp, TimeUtils.FORMAT_H_M) : getDateStr(timeStamp, "hh:mm aa");
    }

    @NotNull
    public static final String getDateHHmmWithoutAMFFormatPattern() {
        return DateFormat.is24HourFormat(AppUtil.getApp()) ? TimeUtils.FORMAT_H_M : "hh:mm";
    }

    @JvmStatic
    public static /* synthetic */ void getDateHHmmWithoutAMFFormatPattern$annotations() {
    }

    @JvmStatic
    @NotNull
    public static final String getDateHHmmssFormat(long timeStamp) {
        return getDateStr(timeStamp, StringUtils.EXPECT_TIME_FORMAT);
    }

    @NotNull
    public static final String getDateMMDDFormatPattern() {
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(Locale.getDefault(), "MMMMd");
        Intrinsics.checkNotNullExpressionValue(bestDateTimePattern, "getBestDateTimePattern(...)");
        return bestDateTimePattern;
    }

    @JvmStatic
    public static /* synthetic */ void getDateMMDDFormatPattern$annotations() {
    }

    @JvmStatic
    @NotNull
    public static final String getDateMMDDHHmmLocalFormat(long timeStamp) {
        return getDateStr(timeStamp, AppUtil.getApp().getString(rzi.e));
    }

    @JvmStatic
    @NotNull
    public static final String getDateMMFormat(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        Application app = AppUtil.getApp();
        if (isLanguageEn()) {
            return getDateStr(localDate, "MMMM");
        }
        String dateTime = DateUtils.formatDateTime(app, INSTANCE.localDateToTimestampInner(localDate), 65576);
        Intrinsics.checkNotNull(dateTime);
        return dateTime;
    }

    @JvmStatic
    @NotNull
    public static final String getDateMMSimpleFormat(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        return getDateStr(localDate, "MMM");
    }

    @JvmStatic
    @NotNull
    public static final String getDateMMddAndWeekSimpleFormat(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        return getDateStr(localDate, AppUtil.getApp().getString(rzi.g));
    }

    @JvmStatic
    @NotNull
    public static final String getDateMMddFormat(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        String dateTime = DateUtils.formatDateTime(AppUtil.getApp(), INSTANCE.localDateToTimestampInner(localDate), 24);
        Intrinsics.checkNotNullExpressionValue(dateTime, "formatDateTime(...)");
        return dateTime;
    }

    @JvmStatic
    @NotNull
    public static final String getDateMMddNumberFormat(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        String dateTime = DateUtils.formatDateTime(AppUtil.getApp(), INSTANCE.localDateToTimestampInner(localDate), 131096);
        Intrinsics.checkNotNullExpressionValue(dateTime, "formatDateTime(...)");
        return dateTime;
    }

    @JvmStatic
    @NotNull
    public static final String getDateMMddSimpleFormat(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        return getDateStr(localDate, AppUtil.getApp().getString(rzi.f));
    }

    @JvmStatic
    @NotNull
    public static final String getDateMMddSimpleFormatMills(long mills) {
        return getDateMMddSimpleFormat(new LocalDate(mills));
    }

    @JvmStatic
    @NotNull
    public static final String getDateMdFormat(long millis) {
        return getDateFormated(millis, AppUtil.getApp().getString(rzi.f));
    }

    @JvmStatic
    @NotNull
    public static final String getDateRangeFormat(@NotNull LocalDate start, @NotNull LocalDate end) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Application app = AppUtil.getApp();
        TimeDateUtil timeDateUtil = INSTANCE;
        String dateRange = DateUtils.formatDateRange(app, timeDateUtil.localDateToTimestampInner(start), timeDateUtil.localDateToTimestampInner(end), 20);
        Intrinsics.checkNotNullExpressionValue(dateRange, "formatDateRange(...)");
        return dateRange;
    }

    @JvmStatic
    @NotNull
    public static final String getDateRangeMMddFormat(long start, long end) {
        Application app = AppUtil.getApp();
        TimeDateUtil timeDateUtil = INSTANCE;
        String dateRange = DateUtils.formatDateRange(app, timeDateUtil.localDateToTimestampInner(new LocalDate(start)), timeDateUtil.localDateToTimestampInner(new LocalDate(end)), 16);
        Intrinsics.checkNotNullExpressionValue(dateRange, "formatDateRange(...)");
        return dateRange;
    }

    @JvmStatic
    @NotNull
    public static final String getDateSimpleLocalFormat(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        String dateTime = DateUtils.formatDateTime(AppUtil.getApp(), INSTANCE.localDateToTimestampInner(localDate), 131076);
        Intrinsics.checkNotNullExpressionValue(dateTime, "formatDateTime(...)");
        return dateTime;
    }

    @JvmStatic
    @NotNull
    public static final String getDateStr(long timestamp, @Nullable String patternStr) {
        return getDateStr(timestamp, patternStr, Locale.getDefault());
    }

    @JvmStatic
    @NotNull
    public static final String getDateYYYYFormat(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        String string = localDate.toString(DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyy"));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @JvmStatic
    @NotNull
    public static final String getDateYYYYMMDDHHmmLocalFormat(long timeStamp, boolean needFollowSystemHour) {
        int i = 128;
        if (needFollowSystemHour && !DateFormat.is24HourFormat(ApplicationExtKt.getApplication())) {
            i = 64;
        }
        String dateTime = DateUtils.formatDateTime(AppUtil.getApp(), timeStamp * ((long) 1000), i | 131093);
        Intrinsics.checkNotNullExpressionValue(dateTime, "formatDateTime(...)");
        return dateTime;
    }

    public static /* synthetic */ String getDateYYYYMMDDHHmmLocalFormat$default(long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return getDateYYYYMMDDHHmmLocalFormat(j, z);
    }

    @JvmStatic
    @NotNull
    public static final String getDateYYYYMMDDHHmmssLocalFormat(long timeStamp) {
        return getDateStr(timeStamp, "yyyy-MM-dd HH:mm:ss");
    }

    @JvmStatic
    @NotNull
    public static final String getDateYYYYMMDDLocalFormat(long timeStamp) {
        String dateTime = DateUtils.formatDateTime(AppUtil.getApp(), timeStamp * ((long) 1000), 131092);
        Intrinsics.checkNotNullExpressionValue(dateTime, "formatDateTime(...)");
        return dateTime;
    }

    @JvmStatic
    @NotNull
    public static final String getDateYYYYMMLocalFormat(@Nullable LocalDate localDate) {
        Application app = AppUtil.getApp();
        if (localDate == null) {
            return "";
        }
        String dateTime = DateUtils.formatDateTime(app, INSTANCE.localDateToTimestampInner(localDate), 36);
        Intrinsics.checkNotNullExpressionValue(dateTime, "formatDateTime(...)");
        return dateTime;
    }

    @JvmStatic
    @NotNull
    public static final String getDateYYYYMMdd(long millis) {
        return getDateYYYYMMdd(millis, "yyyy-MM-dd");
    }

    public static /* synthetic */ String getDateYYYYMMdd$default(long j, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "yyyy-MM-dd";
        }
        return getDateYYYYMMdd(j, str);
    }

    @JvmStatic
    @NotNull
    public static final String getDateYYYYMMddLocalFormat(@Nullable LocalDate localDate) {
        Application app = AppUtil.getApp();
        if (localDate == null) {
            return "";
        }
        String dateTime = DateUtils.formatDateTime(app, INSTANCE.localDateToTimestampInner(localDate), 4);
        Intrinsics.checkNotNull(dateTime);
        return dateTime;
    }

    @JvmStatic
    @NotNull
    public static final String getDateyyyyMMddHHmmFormat(long time) {
        String dateTime = DateUtils.formatDateTime(AppUtil.getApp(), time, 149);
        Intrinsics.checkNotNullExpressionValue(dateTime, "formatDateTime(...)");
        return dateTime;
    }

    @JvmStatic
    @NotNull
    public static final String getDayFormat(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        if (!isLanguageEn()) {
            String string = localDate.toString(getDayFormatPetternStr(PluginDeviceInfo.FICONOFF));
            Intrinsics.checkNotNull(string);
            return string;
        }
        int dayOfMonth = localDate.getDayOfMonth();
        return dayOfMonth + INSTANCE.getDayOfMonthSuffix(dayOfMonth);
    }

    @JvmStatic
    @NotNull
    public static final String getDayFormatPetternStr(@Nullable String skeleton) {
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(Locale.getDefault(), skeleton);
        Intrinsics.checkNotNullExpressionValue(bestDateTimePattern, "getBestDateTimePattern(...)");
        return bestDateTimePattern;
    }

    @JvmStatic
    public static final int getDayWeek(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        return localDate.getWeekOfWeekyear();
    }

    @JvmStatic
    @NotNull
    public static final String getDurationHrMinSecInMills(@NotNull Context ctx, long timeInMillis) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Objects.requireNonNull(ctx);
        Resources resources = ctx.getResources();
        int[] hourMinuteAndSecond = INSTANCE.getHourMinuteAndSecond(timeInMillis);
        int i = hourMinuteAndSecond[0];
        int i2 = hourMinuteAndSecond[1];
        int i3 = hourMinuteAndSecond[2];
        if (i == 0) {
            String quantityString = resources.getQuantityString(oyi.q, i2, Integer.valueOf(i2));
            Intrinsics.checkNotNull(quantityString);
            return quantityString;
        }
        String quantityString2 = resources.getQuantityString(oyi.j, i, Integer.valueOf(i));
        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
        String quantityString3 = resources.getQuantityString(oyi.f29823r, i2, Integer.valueOf(i2));
        Intrinsics.checkNotNullExpressionValue(quantityString3, "getQuantityString(...)");
        String quantityString4 = resources.getQuantityString(oyi.t, i3, Integer.valueOf(i3));
        Intrinsics.checkNotNullExpressionValue(quantityString4, "getQuantityString(...)");
        String string = resources.getString(rzi.common_time_join_str1, quantityString2, quantityString3, quantityString4);
        Intrinsics.checkNotNull(string);
        return string;
    }

    @JvmStatic
    @NotNull
    public static final String getDurationHrMinSecInMills2(@NotNull Context ctx, long timeInMillis) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Objects.requireNonNull(ctx);
        Resources resources = ctx.getResources();
        int[] hourMinuteAndSecond = INSTANCE.getHourMinuteAndSecond(timeInMillis);
        int i = hourMinuteAndSecond[0];
        int i2 = hourMinuteAndSecond[1];
        int i3 = hourMinuteAndSecond[2];
        if (i == 0) {
            String quantityString = resources.getQuantityString(oyi.t, i3, Integer.valueOf(i3));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            String quantityString2 = resources.getQuantityString(oyi.f29823r, i2, Integer.valueOf(i2));
            Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
            String string = resources.getString(rzi.common_time_join_str, quantityString2, quantityString);
            Intrinsics.checkNotNull(string);
            return string;
        }
        String quantityString3 = resources.getQuantityString(oyi.j, i, Integer.valueOf(i));
        Intrinsics.checkNotNullExpressionValue(quantityString3, "getQuantityString(...)");
        String quantityString4 = resources.getQuantityString(oyi.f29823r, i2, Integer.valueOf(i2));
        Intrinsics.checkNotNullExpressionValue(quantityString4, "getQuantityString(...)");
        String quantityString5 = resources.getQuantityString(oyi.t, i3, Integer.valueOf(i3));
        Intrinsics.checkNotNullExpressionValue(quantityString5, "getQuantityString(...)");
        String string2 = resources.getString(rzi.common_time_join_str1, quantityString3, quantityString4, quantityString5);
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    @JvmStatic
    @NotNull
    public static final LocalDate getFirstDayOfMonth(@Nullable LocalDate localDate) {
        long firstDayOfMonthTime;
        if (localDate == null) {
            LocalDate localDateNow = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
            firstDayOfMonthTime = getFirstDayOfMonthTime(localDateNow);
        } else {
            firstDayOfMonthTime = getFirstDayOfMonthTime(localDate);
        }
        return timestampToLocalDate(firstDayOfMonthTime);
    }

    @JvmStatic
    public static final long getFirstDayOfMonthTime(@NotNull LocalDate localDateParam) {
        Intrinsics.checkNotNullParameter(localDateParam, "localDateParam");
        LocalDate localDateMinusDays = localDateParam.minusDays(localDateParam.getDayOfMonth() - 1);
        Intrinsics.checkNotNull(localDateMinusDays);
        return changZeroOfTheDay(localDateMinusDays);
    }

    @JvmStatic
    @NotNull
    public static final LocalDate getFirstDayOfNextMonth(@Nullable LocalDate localDate) {
        if (localDate == null) {
            localDate = LocalDate.now();
        }
        return timestampToLocalDate(getNextMonthFirstDayOfTime(localDate));
    }

    @JvmStatic
    @NotNull
    public static final LocalDate getFirstMonthOfTheYear(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        return getFirstDayOfMonth(localDate.minusMonths(localDate.getMonthOfYear() - 1));
    }

    @JvmStatic
    @NotNull
    public static final CharSequence getHHmmDurationSpannableWithMin(int durationInMin, float sizeRatio) {
        SpannableString spannableString;
        String quantityString;
        String quantityString2;
        Application app = AppUtil.getApp();
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(sizeRatio);
        RelativeSizeSpan relativeSizeSpan2 = new RelativeSizeSpan(sizeRatio);
        int i = durationInMin / 60;
        int i2 = durationInMin % 60;
        SpannableString spannableString2 = new SpannableString("");
        SpannableString spannableString3 = new SpannableString("");
        if (i > 0) {
            quantityString = app.getResources().getQuantityString(oyi.f29822k, i, Integer.valueOf(i));
            quantityString2 = i2 > 0 ? app.getResources().getQuantityString(oyi.f29823r, i2, Integer.valueOf(i2)) : "";
            spannableString = new SpannableString(quantityString);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) quantityString, str, 0, false, 6, (Object) null);
            spannableString.setSpan(relativeSizeSpan, iIndexOf$default, str.length() + iIndexOf$default, 17);
        } else {
            spannableString = spannableString2;
            quantityString = "";
            quantityString2 = quantityString;
        }
        if (i2 >= 0) {
            quantityString2 = app.getResources().getQuantityString(oyi.f29823r, i2, Integer.valueOf(i2));
            spannableString3 = new SpannableString(quantityString2);
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) quantityString2, str2, 0, false, 6, (Object) null);
            spannableString3.setSpan(relativeSizeSpan2, iIndexOf$default2, str2.length() + iIndexOf$default2, 17);
        }
        if (durationInMin == 0) {
            String quantityString3 = app.getResources().getQuantityString(oyi.i, 1);
            Intrinsics.checkNotNullExpressionValue(quantityString3, "getQuantityString(...)");
            quantityString = "-" + quantityString3;
            SpannableString spannableString4 = new SpannableString(quantityString);
            int iIndexOf$default3 = StringsKt__StringsKt.indexOf$default((CharSequence) quantityString, "-", 0, false, 6, (Object) null);
            spannableString4.setSpan(relativeSizeSpan, iIndexOf$default3, iIndexOf$default3 + 1, 17);
            String quantityString4 = app.getResources().getQuantityString(oyi.p, 1);
            Intrinsics.checkNotNullExpressionValue(quantityString4, "getQuantityString(...)");
            String str3 = "-" + quantityString4;
            SpannableString spannableString5 = new SpannableString(str3);
            quantityString2 = str3;
            int iIndexOf$default4 = StringsKt__StringsKt.indexOf$default((CharSequence) quantityString2, "-", 0, false, 6, (Object) null);
            spannableString5.setSpan(relativeSizeSpan2, iIndexOf$default4, iIndexOf$default4 + 1, 17);
            spannableString = spannableString4;
            spannableString3 = spannableString5;
        }
        if (!TextUtils.isEmpty(quantityString) && !TextUtils.isEmpty(quantityString2)) {
            return TextUtils.concat(spannableString, spannableString3);
        }
        if (TextUtils.isEmpty(quantityString)) {
            return spannableString3;
        }
        return TextUtils.isEmpty(quantityString2) ? spannableString : "";
    }

    @JvmStatic
    @NotNull
    public static final String getHHmmLocalFormat(long timeStamp) {
        String dateTime = DateUtils.formatDateTime(AppUtil.getApp(), timeStamp * ((long) 1000), 129);
        Intrinsics.checkNotNullExpressionValue(dateTime, "formatDateTime(...)");
        return dateTime;
    }

    @JvmStatic
    @NotNull
    public static final String getHMFormatInMillis(@NotNull Context ctx, long timeInMillis, int mixedStyle, int hourOnlyStyle, int minOnlyStyle) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Resources resources = ctx.getResources();
        int[] hourMinuteAndSecond = INSTANCE.getHourMinuteAndSecond(timeInMillis);
        int i = hourMinuteAndSecond[0];
        int i2 = hourMinuteAndSecond[1];
        if (i == 0) {
            String quantityString = resources.getQuantityString(minOnlyStyle == 1 ? oyi.f29823r : oyi.q, i2, Integer.valueOf(i2));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            return quantityString;
        }
        if (i2 == 0) {
            String quantityString2 = resources.getQuantityString(hourOnlyStyle == 1 ? oyi.f29822k : oyi.j, i, Integer.valueOf(i));
            Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
            return quantityString2;
        }
        int i3 = (mixedStyle == 2 || mixedStyle == 3) ? oyi.f29822k : oyi.j;
        int i4 = (mixedStyle == 1 || mixedStyle == 3) ? oyi.f29823r : oyi.q;
        String quantityString3 = resources.getQuantityString(i3, i, Integer.valueOf(i));
        Intrinsics.checkNotNullExpressionValue(quantityString3, "getQuantityString(...)");
        String quantityString4 = resources.getQuantityString(i4, i2, Integer.valueOf(i2));
        Intrinsics.checkNotNullExpressionValue(quantityString4, "getQuantityString(...)");
        String string = resources.getString(rzi.common_time_join_str, quantityString3, quantityString4);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public static /* synthetic */ String getHMFormatInMillis$default(Context context, long j, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i = 3;
        }
        return getHMFormatInMillis(context, j, i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0 : i3);
    }

    @JvmStatic
    @NotNull
    public static final String getHMFormatInMinutes(@NotNull Context cxt, long timeInMinute, int mixedStyle, int hourOnlyStyle, int minOnlyStyle) {
        Intrinsics.checkNotNullParameter(cxt, "cxt");
        return getHMFormatInSecond(cxt, timeInMinute * ((long) 60), mixedStyle, hourOnlyStyle, minOnlyStyle);
    }

    public static /* synthetic */ String getHMFormatInMinutes$default(Context context, long j, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i = 3;
        }
        return getHMFormatInMinutes(context, j, i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0 : i3);
    }

    @JvmStatic
    @NotNull
    public static final String getHMFormatInSecond(@NotNull Context cxt, long timeInSecond, int mixedStyle, int hourOnlyStyle, int minOnlyStyle) {
        Intrinsics.checkNotNullParameter(cxt, "cxt");
        return getHMFormatInMillis(cxt, timeInSecond * ((long) 1000), mixedStyle, hourOnlyStyle, minOnlyStyle);
    }

    public static /* synthetic */ String getHMFormatInSecond$default(Context context, long j, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i = 3;
        }
        return getHMFormatInSecond(context, j, i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0 : i3);
    }

    private final String getHourMinSecondStr(Context context, String hourStr, String minStr, String secondStr) {
        if (TextUtils.isEmpty(hourStr) && TextUtils.isEmpty(minStr) && TextUtils.isEmpty(secondStr)) {
            return "";
        }
        if (TextUtils.isEmpty(hourStr)) {
            String string = context.getString(rzi.common_time_join_str, minStr, secondStr);
            Intrinsics.checkNotNull(string);
            return string;
        }
        if (TextUtils.isEmpty(secondStr)) {
            String string2 = context.getString(rzi.common_time_join_str, hourStr, minStr);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        String string3 = context.getString(rzi.common_time_join_str1, hourStr, minStr, secondStr);
        Intrinsics.checkNotNull(string3);
        return string3;
    }

    private final int[] getHourMinuteAndSecond(long ms) {
        int[] iArr = new int[3];
        if (ms <= 0) {
            return iArr;
        }
        int i = (int) (ms / ((long) 1000));
        int i2 = i / 60;
        iArr[0] = i2 / 60;
        iArr[1] = i2 % 60;
        iArr[2] = i % 60;
        return iArr;
    }

    @JvmStatic
    public static final int getHourOfTheDay(long timestamp) {
        int iChangZeroOfTheDay = (int) (timestamp - changZeroOfTheDay(timestampToLocalDate(timestamp)));
        if (iChangZeroOfTheDay % 3600 != 0) {
            return -1;
        }
        return iChangZeroOfTheDay / 3600;
    }

    @JvmStatic
    public static final int getIntervalDay(@Nullable LocalDate date1, @Nullable LocalDate date2) {
        return Days.daysBetween(date1, date2).getDays();
    }

    @JvmStatic
    public static final int getIntervalMonths(@NotNull LocalDate date1, @NotNull LocalDate date2) {
        Intrinsics.checkNotNullParameter(date1, "date1");
        Intrinsics.checkNotNullParameter(date2, "date2");
        return Months.monthsBetween(date1.withDayOfMonth(1), date2.withDayOfMonth(1)).getMonths();
    }

    @JvmStatic
    public static final int getIntervalWeek(@Nullable LocalDate date1, @Nullable LocalDate date2, int type) {
        LocalDate sunFirstDayOfWeek;
        LocalDate sunFirstDayOfWeek2;
        if (type == 301) {
            Intrinsics.checkNotNull(date1);
            sunFirstDayOfWeek = getMonFirstDayOfWeek(date1);
            Intrinsics.checkNotNull(date2);
            sunFirstDayOfWeek2 = getMonFirstDayOfWeek(date2);
        } else {
            TimeDateUtil timeDateUtil = INSTANCE;
            Intrinsics.checkNotNull(date1);
            sunFirstDayOfWeek = timeDateUtil.getSunFirstDayOfWeek(date1);
            Intrinsics.checkNotNull(date2);
            sunFirstDayOfWeek2 = timeDateUtil.getSunFirstDayOfWeek(date2);
        }
        return Weeks.weeksBetween(sunFirstDayOfWeek, sunFirstDayOfWeek2).getWeeks();
    }

    @JvmStatic
    @NotNull
    public static final LocalDate getMonFirstDayOfWeek(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        LocalDate localDateWithMinimumValue = date.dayOfWeek().withMinimumValue();
        Intrinsics.checkNotNullExpressionValue(localDateWithMinimumValue, "withMinimumValue(...)");
        return localDateWithMinimumValue;
    }

    @JvmStatic
    @NotNull
    public static final List<LocalDate> getMonthLocalDateCalendar(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        return INSTANCE.getMonthLocalDateCalendar(localDate, 301);
    }

    @JvmStatic
    public static final long getNextMonthFirstDayOfTime(@Nullable LocalDate localDate) {
        if (localDate == null) {
            localDate = LocalDate.now().plusMonths(1);
        }
        return changZeroOfTheDay(getFirstDayOfMonth(localDate));
    }

    private final LocalDate getNextWeekMonday(LocalDate localDateParam) {
        if (localDateParam == null) {
            localDateParam = LocalDate.now();
        }
        LocalDate localDatePlusDays = localDateParam.plusDays(8 - localDateParam.getDayOfWeek());
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        return localDatePlusDays;
    }

    @JvmStatic
    public static final long getNextWeekMondayTime(@Nullable LocalDate localDate) {
        TimeDateUtil timeDateUtil = INSTANCE;
        if (localDate == null) {
            localDate = LocalDate.now();
        }
        return changZeroOfTheDay(timeDateUtil.getNextWeekMonday(localDate));
    }

    private final String getPaceStrWithSec(int time, String hourUnit, String minUnit, String scdUnit) {
        String str;
        String str2;
        int i = time / 3600;
        String str3 = "";
        if (i > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str4 = String.format(TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
            str = str4 + hourUnit;
        } else {
            str = "";
        }
        int i2 = time % 3600;
        int i3 = i2 / 60;
        if (i3 > 0) {
            if (i > 0) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String str5 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1));
                Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
                str2 = str5 + minUnit;
            } else {
                StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                String str6 = String.format(TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1));
                Intrinsics.checkNotNullExpressionValue(str6, "format(...)");
                str2 = str6 + minUnit;
            }
            str3 = str2;
        }
        StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
        String str7 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i2 % 60)}, 1));
        Intrinsics.checkNotNullExpressionValue(str7, "format(...)");
        String str8 = str7 + scdUnit;
        if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(str3)) {
            str3 = "00" + minUnit;
        }
        return str + str3 + str8;
    }

    @JvmStatic
    @NotNull
    public static final String getSportPaceStrWithSecDef(int time) {
        return time > 3600 ? INSTANCE.getPaceStrWithSec(time, ":", "'", "\"") : INSTANCE.getPaceStrWithSec(time, ":", "'", "\"");
    }

    private final LocalDate getSunFirstDayOfWeek(LocalDate date) {
        if (date.dayOfWeek().get() == 7) {
            return date;
        }
        LocalDate localDateWithDayOfWeek = date.minusWeeks(1).withDayOfWeek(7);
        Intrinsics.checkNotNull(localDateWithDayOfWeek);
        return localDateWithDayOfWeek;
    }

    @JvmStatic
    @NotNull
    public static final String getTimeStr(long t1) {
        return getDateStr(t1, "yyyy-MM-dd HH:mm:ss");
    }

    @JvmStatic
    @NotNull
    public static final String getTimeStrWithHourSecDef(int timeDuration, boolean withHours) {
        return INSTANCE.getTimeStrWithSec(timeDuration, ":", ":", "", withHours);
    }

    public static /* synthetic */ String getTimeStrWithHourSecDef$default(int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        return getTimeStrWithHourSecDef(i, z);
    }

    private final String getTimeStrWithSec(int sleepTime, String hourUnit, String minUnit, String scdUnit, boolean withHours) {
        String str;
        String str2;
        StringBuilder sb;
        int i = sleepTime / 3600;
        boolean z = withHours || i > 0;
        String str3 = "00";
        if (i >= 10) {
            str = i + hourUnit;
        } else if (i > 0) {
            str = "0" + i + hourUnit;
        } else if (i == 0) {
            str = "00" + minUnit;
        } else {
            str = "00";
        }
        int i2 = sleepTime % 3600;
        int i3 = i2 / 60;
        if (i3 >= 10) {
            str2 = i3 + minUnit;
        } else if (i3 > 0) {
            str2 = "0" + i3 + minUnit;
        } else if (i3 == 0) {
            str2 = "00" + minUnit;
        } else {
            str2 = "00";
        }
        int i4 = i2 % 60;
        if (i4 >= 10) {
            str3 = i4 + scdUnit;
        } else if (i4 > 0) {
            str3 = "0" + i4 + scdUnit;
        } else if (i4 == 0) {
            str3 = "00" + scdUnit;
        }
        if (z) {
            sb = new StringBuilder();
            sb.append(str);
        } else {
            sb = new StringBuilder();
        }
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static /* synthetic */ String getTimeStrWithSec$default(TimeDateUtil timeDateUtil, int i, String str, String str2, String str3, boolean z, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            z = true;
        }
        return timeDateUtil.getTimeStrWithSec(i, str, str2, str3, z);
    }

    @JvmStatic
    @NotNull
    public static final String getTimeStrWithSecDef(int timeDuration) {
        return getTimeStrWithSec$default(INSTANCE, timeDuration, ":", ":", "", false, 16, null);
    }

    @JvmStatic
    @NotNull
    public static final String getTimeStrWithTimeZone(long time, @Nullable String formatPattern, @Nullable DateTimeZone dateTimeZone) {
        String string = new LocalDateTime(time, dateTimeZone).toString(formatPattern);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @JvmStatic
    @NotNull
    public static final TimeZone getTimeZone(long zoneOffsetInSec) {
        Object objValueOf;
        String str = zoneOffsetInSec >= 0 ? Marker.ANY_NON_NULL_MARKER : "-";
        int minutes = (int) TimeUnit.SECONDS.toMinutes(Math.abs(zoneOffsetInSec));
        int i = minutes / 60;
        int i2 = minutes % 60;
        if (i2 < 10) {
            objValueOf = "0" + i2;
        } else {
            objValueOf = Integer.valueOf(i2);
        }
        TimeZone timeZone = TimeZone.getTimeZone("GMT" + str + i + ":" + objValueOf);
        Intrinsics.checkNotNullExpressionValue(timeZone, "getTimeZone(...)");
        return timeZone;
    }

    public static final int getTodayWeek() {
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        return getDayWeek(localDateNow);
    }

    @JvmStatic
    public static /* synthetic */ void getTodayWeek$annotations() {
    }

    @JvmStatic
    @NotNull
    public static final LocalDate getWeekMonday(@Nullable LocalDate localDate) {
        if (localDate == null) {
            LocalDate localDateMinusDays = LocalDate.now().minusDays(LocalDate.now().getDayOfWeek() - 1);
            Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "minusDays(...)");
            return localDateMinusDays;
        }
        LocalDate localDateMinusDays2 = localDate.minusDays(localDate.getDayOfWeek() - 1);
        Intrinsics.checkNotNull(localDateMinusDays2);
        return localDateMinusDays2;
    }

    @JvmStatic
    @NotNull
    public static final String getZNTimeWithMin(int time) {
        return INSTANCE.getZNTimeWithMinute(time, true);
    }

    @JvmStatic
    @Nullable
    public static final String getZNTimeWithSec(int time) {
        Application app = AppUtil.getApp();
        int i = time / 3600;
        String quantityString = i > 0 ? app.getResources().getQuantityString(oyi.f29822k, i, Integer.valueOf(i)) : "";
        int i2 = time % 3600;
        int i3 = i2 / 60;
        String quantityString2 = i3 > 0 ? app.getResources().getQuantityString(oyi.f29823r, i3, Integer.valueOf(i3)) : "";
        int i4 = i2 % 60;
        String quantityString3 = i4 > 0 ? app.getResources().getQuantityString(oyi.t, i4, Integer.valueOf(i4)) : "";
        if (!TextUtils.isEmpty(quantityString) && TextUtils.isEmpty(quantityString2)) {
            quantityString2 = app.getResources().getQuantityString(oyi.f29823r, 0, 0);
        }
        String hourMinSecondStr = INSTANCE.getHourMinSecondStr(app, quantityString, quantityString2, quantityString3);
        return TextUtils.isEmpty(hourMinSecondStr) ? app.getResources().getQuantityString(oyi.t, 0, 0) : hourMinSecondStr;
    }

    @JvmStatic
    public static final boolean isAfterToday(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        return localDate.isAfter(LocalDate.now());
    }

    @JvmStatic
    public static final boolean isEndHourOfTheDay(long timestamp) {
        if (timestamp % ((long) 3600) != 0) {
            return false;
        }
        return timestampToLocalDate(timestamp).getDayOfWeek() != timestampToLocalDate(timestamp - TIME_HOUR).getDayOfWeek();
    }

    @JvmStatic
    public static final boolean isEndTimeAfterStart(long endTime, long startTime) {
        return timestampToLocalDate(endTime).isAfter(timestampToLocalDate(startTime));
    }

    @JvmStatic
    public static final boolean isEqualsMonth(@NotNull LocalDate date1, @NotNull LocalDate date2) {
        Intrinsics.checkNotNullParameter(date1, "date1");
        Intrinsics.checkNotNullParameter(date2, "date2");
        return date1.getYear() == date2.getYear() && date1.getMonthOfYear() == date2.getMonthOfYear();
    }

    @JvmStatic
    public static final boolean isFuture(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        return localDate.isAfter(LocalDate.now());
    }

    public static final boolean isLanguageEn() {
        String language = AppUtil.getApp().getResources().getConfiguration().locale.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = language.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "en", false, 2, (Object) null);
    }

    @JvmStatic
    public static /* synthetic */ void isLanguageEn$annotations() {
    }

    @JvmStatic
    public static final boolean isLastDayOfMonth(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        return localDate.getMonthOfYear() != localDate.plusDays(1).getMonthOfYear();
    }

    @JvmStatic
    public static final boolean isLastMonth(@NotNull LocalDate currentMonth, @NotNull LocalDate lastMonth) {
        Intrinsics.checkNotNullParameter(currentMonth, "currentMonth");
        Intrinsics.checkNotNullParameter(lastMonth, "lastMonth");
        return lastMonth.plusMonths(1).getMonthOfYear() == currentMonth.getMonthOfYear();
    }

    private final boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    @JvmStatic
    public static final boolean isNextMonth(@NotNull LocalDate currentMonth, @NotNull LocalDate nextMonth) {
        Intrinsics.checkNotNullParameter(currentMonth, "currentMonth");
        Intrinsics.checkNotNullParameter(nextMonth, "nextMonth");
        return nextMonth.minusMonths(1).getMonthOfYear() == currentMonth.getMonthOfYear();
    }

    @JvmStatic
    public static final boolean isSameLocalDate(@NotNull LocalDate date, @NotNull LocalDate compareDate) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(compareDate, "compareDate");
        return date.getYear() == compareDate.getYear() && date.getMonthOfYear() == compareDate.getMonthOfYear() && date.getDayOfMonth() == compareDate.getDayOfMonth();
    }

    @JvmStatic
    public static final boolean isSameMonth(@NotNull LocalDate localDate, @NotNull LocalDate localDateCompare) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        Intrinsics.checkNotNullParameter(localDateCompare, "localDateCompare");
        return localDate.getYear() == localDateCompare.getYear() && localDate.getMonthOfYear() == localDateCompare.getMonthOfYear();
    }

    @JvmStatic
    public static final boolean isSameMonthLocalDate(@NotNull LocalDate date, @NotNull LocalDate compareDate) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(compareDate, "compareDate");
        return date.getYear() == compareDate.getYear() && date.getMonthOfYear() == compareDate.getMonthOfYear();
    }

    @JvmStatic
    public static final boolean isSameWeekWithToday(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        return INSTANCE.isThisYear(localDate) && getDayWeek(localDate) == getTodayWeek();
    }

    @JvmStatic
    public static final boolean isSameYear(@NotNull LocalDate compareLocalDate, @NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(compareLocalDate, "compareLocalDate");
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        return compareLocalDate.getYear() == localDate.getYear();
    }

    @JvmStatic
    public static final boolean isSunday(@NotNull LocalDate localDateEntry) {
        Intrinsics.checkNotNullParameter(localDateEntry, "localDateEntry");
        return localDateEntry.getDayOfWeek() == 7;
    }

    private final boolean isThisYear(LocalDate localDate) {
        return localDate.getYear() == LocalDate.now().getYear();
    }

    @JvmStatic
    public static final boolean isToday(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return Intrinsics.areEqual(new LocalDate(), date);
    }

    @JvmStatic
    public static final long localDateToTimestamp(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        return INSTANCE.localDateToTimestampInner(localDate) / ((long) 1000);
    }

    private final long localDateToTimestampInner(LocalDate localDate) {
        return localDate.toDateTimeAtCurrentTime().getMillis();
    }

    @JvmStatic
    @NotNull
    public static final String minutesToLocalizedTime(@NotNull Context context, int minutes, @NotNull TimeZone timeZone) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        int i = ((minutes % 1440) + 1440) % 1440;
        LocalTime localTimeOf = LocalTime.of(i / 60, i % 60);
        if (DateFormat.is24HourFormat(context)) {
            String str = localTimeOf.format(DateTimeFormatter.ofPattern(TimeUtils.FORMAT_H_M, Locale.getDefault()).withZone(timeZone.toZoneId()));
            Intrinsics.checkNotNull(str);
            return str;
        }
        String str2 = localTimeOf.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.getDefault()).withZone(timeZone.toZoneId()));
        Intrinsics.checkNotNull(str2);
        return str2;
    }

    public static /* synthetic */ String minutesToLocalizedTime$default(Context context, int i, TimeZone timeZone, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            timeZone = TimeZone.getDefault();
        }
        return minutesToLocalizedTime(context, i, timeZone);
    }

    @JvmStatic
    @NotNull
    public static final LocalDate timestampToLocalDate(long timestamp) {
        return timestampToLocalDateInner(timestamp * ((long) 1000));
    }

    @JvmStatic
    @NotNull
    public static final LocalDate timestampToLocalDateInner(long timestamp) {
        LocalDate localDate = Instant.ofEpochMilli(timestamp).toDateTime().toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
        return localDate;
    }

    public final long atEndOfMonth(long mills) {
        LocalDate localDatePlusMonths = new LocalDate(mills).plusMonths(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusMonths, "plusMonths(...)");
        return atStartOfMonth(localDatePlusMonths);
    }

    public final long atEndOfWeek(long mills) {
        return atStartOfWeek(mills) + 604800000;
    }

    public final long atEndOfYear(long mills) {
        LocalDate localDatePlusYears = new LocalDate(mills).plusYears(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusYears, "plusYears(...)");
        return atStartOfYear(localDatePlusYears);
    }

    public final long atStartOfDay(long mills) {
        return new LocalDate(mills).toDateTimeAtStartOfDay().getMillis();
    }

    public final long atStartOfMonth(long mills) {
        LocalDate localDateWithDayOfMonth = new LocalDate(mills).withDayOfMonth(1);
        Intrinsics.checkNotNullExpressionValue(localDateWithDayOfMonth, "withDayOfMonth(...)");
        return atStartOfDay(localDateWithDayOfMonth);
    }

    public final long atStartOfWeek(long mills) {
        LocalDate localDateWithDayOfWeek = new LocalDate(mills).withDayOfWeek(1);
        Intrinsics.checkNotNullExpressionValue(localDateWithDayOfWeek, "withDayOfWeek(...)");
        return atStartOfDay(localDateWithDayOfWeek);
    }

    public final long atStartOfYear(long mills) {
        LocalDate localDateWithDayOfYear = new LocalDate(mills).withDayOfYear(1);
        Intrinsics.checkNotNullExpressionValue(localDateWithDayOfYear, "withDayOfYear(...)");
        return atStartOfDay(localDateWithDayOfYear);
    }

    public final long changZeroOfTheDayInner(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        String str = new SimpleDateFormat("yyyy-MM-dd 00:00:00", Locale.getDefault()).format(new Date(localDateToTimestampInner(localDate)));
        try {
            return Timestamp.valueOf(str).getTime();
        } catch (Exception e) {
            throw new RuntimeException("changZeroOfTheDayInner " + str, e);
        }
    }

    public final long changeZeroOfTheDay(long time, int tzOffsetInSec) {
        Calendar calendar = Calendar.getInstance(getTimeZone(tzOffsetInSec));
        long j = 1000;
        calendar.setTimeInMillis(time * j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return calendar.getTimeInMillis() / j;
    }

    public final long dateToMs(@Nullable String _date, @Nullable String pattern) {
        try {
            return new SimpleDateFormat(pattern, Locale.getDefault()).parse(_date).getTime();
        } catch (Exception unused) {
            return 0L;
        }
    }

    public final long getBetweenDays(long Msec1, long Msec2) {
        return ((Msec1 - Msec2) + ((long) 1000000)) / ((long) 86400000);
    }

    public final long getCurrentInitTime() {
        return new DateTime().withMillisOfDay(0).getMillis() / ((long) 1000);
    }

    @NotNull
    public final String getCurrentTimeID() {
        String id = TimeZone.getDefault().getID();
        Intrinsics.checkNotNullExpressionValue(id, "getID(...)");
        return id;
    }

    @NotNull
    public final String getDateMMDDLocalFormat(long mills) {
        String dateTime = DateUtils.formatDateTime(AppUtil.getApp(), mills, 131096);
        Intrinsics.checkNotNullExpressionValue(dateTime, "formatDateTime(...)");
        return dateTime;
    }

    @NotNull
    public final String getDateSimpleLocalFormatS(long timeStamp) {
        String dateTime = DateUtils.formatDateTime(AppUtil.getApp(), timeStamp, 131076);
        Intrinsics.checkNotNullExpressionValue(dateTime, "formatDateTime(...)");
        return dateTime;
    }

    public final int getDayOfMonth(long mills) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mills);
        return calendar.get(5);
    }

    @NotNull
    public final String getDayOfMonthSuffix(int day) {
        String string;
        Application app = AppUtil.getApp();
        if (day < 1 || day > 31) {
            return "";
        }
        if (day >= 11 && day <= 13) {
            String string2 = app.getString(rzi.d);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        int i = day % 10;
        if (i == 1) {
            string = app.getString(rzi.f33099a);
        } else if (i != 2) {
            string = i != 3 ? app.getString(rzi.d) : app.getString(rzi.c);
        } else {
            string = app.getString(rzi.f33100b);
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final int getDayOfWeek(long mills) {
        return new LocalDate(mills).getDayOfWeek();
    }

    public final int getDaysOfMonth(long timeInMillis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeInMillis);
        return calendar.getActualMaximum(5);
    }

    @NotNull
    public final String getDurationStr(long mills) {
        long j = 60;
        long j2 = (mills / ((long) 1000)) % j;
        long j3 = (mills / ((long) 60000)) % j;
        long j4 = (mills / ((long) 3600000)) % ((long) 24);
        if (j4 > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(j3), Long.valueOf(j2)}, 3));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j2)}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    @NotNull
    public final String getDurationStrHour(long mills) {
        long j = 60;
        long j2 = (mills / ((long) 1000)) % j;
        long j3 = (mills / ((long) 60000)) % j;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf((mills / ((long) 3600000)) % ((long) 24)), Long.valueOf(j3), Long.valueOf(j2)}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final String getLastUpdateTimeStr(long time) {
        Application app = AppUtil.getApp();
        if (time < 60) {
            String string = app.getString(rzi.m);
            Intrinsics.checkNotNull(string);
            return string;
        }
        if (time < 86400) {
            String string2 = app.getString(rzi.n, getZNTimeWithMin((int) (time / ((long) 60))));
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        if (time >= 259200) {
            return getDateYYYYMMDDHHmmLocalFormat$default(time, false, 2, null);
        }
        int i = (int) (time / 86400);
        String quantityString = app.getResources().getQuantityString(oyi.h, i, Integer.valueOf(i));
        Intrinsics.checkNotNull(quantityString);
        return quantityString;
    }

    public final int getMonth(long mills) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mills);
        return calendar.get(2);
    }

    public final int getMonthOfYear(long mills) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mills);
        return calendar.get(2);
    }

    public final long getStartOfDayTimestamp(long offsetMillis) {
        long j = 1000;
        int i = (int) ((offsetMillis / j) / ((long) 3600));
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT" + (i >= 0 ? Marker.ANY_NON_NULL_MARKER : "") + i));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis() / j;
    }

    @NotNull
    public final String getTimeByHourMinute(int hour, int minute) {
        String strValueOf = String.valueOf(hour);
        String strValueOf2 = String.valueOf(minute);
        if (hour < 10) {
            strValueOf = "0" + strValueOf;
        }
        if (minute < 10) {
            strValueOf2 = "0" + strValueOf2;
        }
        return strValueOf + ":" + strValueOf2;
    }

    @NotNull
    public final String getTimePeriod(long time) {
        int hourOfDay = new DateTime(time * ((long) 1000)).getHourOfDay();
        Application app = AppUtil.getApp();
        if (hourOfDay >= 0 && hourOfDay <= 6) {
            String string = app.getString(rzi.i);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (hourOfDay > 6 && hourOfDay < 12) {
            String string2 = app.getString(rzi.j);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (hourOfDay == 12) {
            String string3 = app.getString(rzi.l);
            Intrinsics.checkNotNull(string3);
            return string3;
        }
        if (hourOfDay < 13 || hourOfDay > 18) {
            String string4 = app.getString(rzi.f33101k);
            Intrinsics.checkNotNull(string4);
            return string4;
        }
        String string5 = app.getString(rzi.h);
        Intrinsics.checkNotNull(string5);
        return string5;
    }

    @NotNull
    public final String getTimePeriodAndTime(long time) {
        String string = AppUtil.getApp().getString(rzi.common_join_str, getTimePeriod(time), getDateStr(time, "hh:mm"));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @NotNull
    public final String getTodayDate() {
        String str = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final int getWeekOfMonth(@NotNull List<LocalDate> dateList, @Nullable LocalDate mSelectDate) {
        Intrinsics.checkNotNullParameter(dateList, "dateList");
        int iIndexOf = dateList.indexOf(mSelectDate);
        if (iIndexOf < 0) {
            return -1;
        }
        int i = iIndexOf % 7;
        int i2 = iIndexOf / 7;
        return i == 0 ? i2 : i2 + 1;
    }

    @NotNull
    public final String getWeekSimpleStr(long timestamp) {
        String dateTime = DateUtils.formatDateTime(AppUtil.getApp(), timestamp, 32770);
        Intrinsics.checkNotNullExpressionValue(dateTime, "formatDateTime(...)");
        return dateTime;
    }

    @NotNull
    public final String getWeekStr(long timestamp) {
        String dateTime = DateUtils.formatDateTime(AppUtil.getApp(), timestamp, 2);
        Intrinsics.checkNotNullExpressionValue(dateTime, "formatDateTime(...)");
        return dateTime;
    }

    @NotNull
    public final String getZNTimeDDHHMM(int min) {
        String string;
        Resources resources = AppUtil.getApp().getResources();
        if (min <= 0) {
            String quantityString = resources.getQuantityString(oyi.c, min, Integer.valueOf(min));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            return quantityString;
        }
        TimeUnit timeUnit = TimeUnit.MINUTES;
        long j = min;
        int days = (int) timeUnit.toDays(j);
        int hours = (int) (timeUnit.toHours(j) - ((long) (days * 24)));
        int i = (min - (days * 1440)) - (hours * 60);
        String quantityString2 = "";
        String quantityString3 = days > 0 ? resources.getQuantityString(oyi.f29820a, days, Integer.valueOf(days)) : "";
        String quantityString4 = hours > 0 ? resources.getQuantityString(oyi.f29821b, hours, Integer.valueOf(hours)) : "";
        if (i > 0) {
            quantityString2 = (TextUtils.isEmpty(quantityString3) && TextUtils.isEmpty(quantityString4)) ? resources.getQuantityString(oyi.d, i, Integer.valueOf(i)) : resources.getQuantityString(oyi.c, i, Integer.valueOf(i));
        }
        if (quantityString3.length() == 0) {
            string = quantityString4.length() == 0 ? quantityString2 : quantityString4;
        } else {
            string = quantityString3;
        }
        if (quantityString3.length() != 0 && quantityString4.length() != 0) {
            string = resources.getString(rzi.common_time_join_str, string, quantityString4);
        }
        return (quantityString4.length() == 0 || quantityString2.length() == 0) ? string : resources.getString(rzi.common_time_join_str, string, quantityString2);
    }

    @NotNull
    public final String getZNTimeStrWithHrAndMin(int seconds) {
        int i = seconds / 60;
        return getZNTimeStrWithHrAndMin(i / 60, i % 60);
    }

    @NotNull
    public final String getZNTimeStrWithHrAndMinInMins(int mins) {
        return getZNTimeStrWithHrAndMin(mins / 60, mins % 60);
    }

    @NotNull
    public final String getZNTimeStrWithMinAndSec(int min, int second) {
        String quantityString;
        Application app = AppUtil.getApp();
        String quantityString2 = "";
        if (min > 0) {
            quantityString2 = app.getResources().getQuantityString(oyi.q, min, Integer.valueOf(min));
            quantityString = second > 0 ? app.getResources().getQuantityString(oyi.u, second, Integer.valueOf(second)) : "";
        } else {
            quantityString = second > 0 ? app.getResources().getQuantityString(oyi.t, second, Integer.valueOf(second)) : "";
        }
        if (!TextUtils.isEmpty(quantityString2) || !TextUtils.isEmpty(quantityString)) {
            return spliceTime(quantityString2, quantityString);
        }
        String quantityString3 = app.getResources().getQuantityString(oyi.q, 0, 0);
        Intrinsics.checkNotNullExpressionValue(quantityString3, "getQuantityString(...)");
        return quantityString3;
    }

    @NotNull
    public final String getZNTimeWithMinute(int time, boolean isSimple) {
        String quantityString;
        Application app = AppUtil.getApp();
        int i = time / 60;
        int i2 = time % 60;
        String str = "";
        if (i > 0) {
            String quantityString2 = app.getResources().getQuantityString(oyi.f29822k, i, Integer.valueOf(i));
            quantityString = i2 > 0 ? app.getResources().getQuantityString(oyi.f29823r, i2, Integer.valueOf(i2)) : "";
            str = quantityString2;
        } else {
            quantityString = i2 >= 0 ? app.getResources().getQuantityString(oyi.q, i2, Integer.valueOf(i2)) : "";
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(quantityString)) {
            return (!TextUtils.isEmpty(str) && TextUtils.isEmpty(quantityString)) ? str : quantityString;
        }
        String string = app.getString(rzi.common_time_join_str, str, quantityString);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @NotNull
    public final Calendar getZeroCalendarOf(long timeInMills) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeInMills);
        Intrinsics.checkNotNull(calendar);
        zeroCalendar(calendar);
        return calendar;
    }

    @NotNull
    public final String getZeroHM(@NotNull Context cxt) {
        Intrinsics.checkNotNullParameter(cxt, "cxt");
        Resources resources = cxt.getResources();
        String quantityString = resources.getQuantityString(oyi.f29822k, 0, 0);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        String quantityString2 = resources.getQuantityString(oyi.f29823r, 0, 0);
        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
        String string = resources.getString(rzi.common_time_join_str, quantityString, quantityString2);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @NotNull
    public final Calendar getZeroOfToday() {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNull(calendar);
        zeroCalendar(calendar);
        return calendar;
    }

    public final long getZeroStartOf(long timeInMills, @NotNull Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        calendar.setTimeInMillis(timeInMills);
        zeroCalendar(calendar);
        return calendar.getTimeInMillis() / ((long) 1000);
    }

    public final boolean is12HourFormat(@Nullable Context context) {
        return !DateFormat.is24HourFormat(context);
    }

    public final int monthsBetween(@NotNull LocalDate date1, @NotNull LocalDate date2) {
        Intrinsics.checkNotNullParameter(date1, "date1");
        Intrinsics.checkNotNullParameter(date2, "date2");
        return Math.abs(Months.monthsBetween(date1.withDayOfMonth(1), date2.withDayOfMonth(1)).getMonths());
    }

    @NotNull
    public final String spliceTime(@Nullable String str1, @Nullable String str2) {
        String string = AppUtil.getApp().getString(rzi.common_time_join_str, str1, str2);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public final int weeksBetween(long mills1, long mills2) {
        return Math.abs(Weeks.weeksBetween(new LocalDate(mills1).withDayOfWeek(1), new LocalDate(mills2).withDayOfWeek(1)).getWeeks());
    }

    public final int yearsBetween(long millis1, long mills2) {
        return Math.abs(Years.yearsBetween(new LocalDate(millis1).withDayOfYear(1), new LocalDate(mills2).withDayOfYear(1)).getYears());
    }

    public final void zeroCalendar(@NotNull Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    @JvmStatic
    public static final long changZeroOfTheDay(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        return INSTANCE.atStartOfDay(localDate) / ((long) 1000);
    }

    @JvmStatic
    @NotNull
    public static final String getDateMMSimpleFormat(long mills) {
        return getDateMMSimpleFormat(new LocalDate(mills));
    }

    @JvmStatic
    @NotNull
    public static final String getDateStr(@Nullable TimeZone timeZone, @Nullable String patternStr) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patternStr);
        Date date = new Date();
        simpleDateFormat.setTimeZone(timeZone);
        String str = simpleDateFormat.format(date);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @JvmStatic
    @NotNull
    public static final String getDateYYYYMMDDHHmmssLocalFormat(long timeStamp, @Nullable TimeZone timeZone) {
        return getDateStr(timeStamp, "yyyy-MM-dd HH:mm:ss", timeZone);
    }

    @JvmStatic
    @NotNull
    public static final String getDateYYYYMMdd(long millis, @NotNull String format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = new SimpleDateFormat(format, Locale.US).format(new Date(millis));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @JvmStatic
    @NotNull
    public static final String getHMFormatInMinutes(@NotNull Context cxt, long timeInMinute) {
        Intrinsics.checkNotNullParameter(cxt, "cxt");
        return getHMFormatInSecond(cxt, timeInMinute * ((long) 60), 3, 0, 0);
    }

    @JvmStatic
    @NotNull
    public static final String getHMFormatInSecond(@NotNull Context cxt, long timeInSecond) {
        Intrinsics.checkNotNullParameter(cxt, "cxt");
        return getHMFormatInMillis(cxt, timeInSecond * ((long) 1000), 3, 0, 0);
    }

    @JvmStatic
    public static final int getIntervalDay(long mills1, long mills2) {
        return getIntervalDay(new LocalDate(mills1), new LocalDate(mills2));
    }

    @JvmStatic
    public static final boolean isFuture(long timestamp) {
        return new LocalDate(timestamp * ((long) 1000)).isAfter(LocalDate.now());
    }

    @JvmStatic
    public static final boolean isSameYear(long year1, long year2) {
        return isSameYear(new LocalDate(year1), new LocalDate(year2));
    }

    @JvmStatic
    public static final boolean isToday(long time) {
        return Intrinsics.areEqual(new LocalDate(), timestampToLocalDate(time));
    }

    public final long atStartOfDay(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return date.toDateTimeAtStartOfDay(DateTimeZone.forID(TimeZone.getDefault().getID())).getMillis();
    }

    public final long atStartOfMonth(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        LocalDate localDateWithDayOfMonth = date.withDayOfMonth(1);
        Intrinsics.checkNotNullExpressionValue(localDateWithDayOfMonth, "withDayOfMonth(...)");
        return atStartOfDay(localDateWithDayOfMonth);
    }

    public final long atStartOfYear(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        LocalDate localDateWithDayOfYear = date.withDayOfYear(1);
        Intrinsics.checkNotNullExpressionValue(localDateWithDayOfYear, "withDayOfYear(...)");
        return atStartOfDay(localDateWithDayOfYear);
    }

    @NotNull
    public final List<LocalDate> getMonthLocalDateCalendar(@NotNull LocalDate localDate, int type) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        LocalDate localDatePlusMonths = localDate.plusMonths(-1);
        LocalDate localDatePlusMonths2 = localDate.plusMonths(1);
        int maximumValue = localDate.dayOfMonth().getMaximumValue();
        int maximumValue2 = localDatePlusMonths.dayOfMonth().getMaximumValue();
        int dayOfWeek = new LocalDate(localDate.getYear(), localDate.getMonthOfYear(), 1).getDayOfWeek();
        int dayOfWeek2 = new LocalDate(localDate.getYear(), localDate.getMonthOfYear(), maximumValue).getDayOfWeek();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (type == 301) {
            int i2 = dayOfWeek - 1;
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add(new LocalDate(localDatePlusMonths.getYear(), localDatePlusMonths.getMonthOfYear(), maximumValue2 - ((dayOfWeek - i3) - 2)));
            }
            int i4 = 0;
            while (i4 < maximumValue) {
                i4++;
                arrayList.add(new LocalDate(localDate.getYear(), localDate.getMonthOfYear(), i4));
            }
            int i5 = 7 - dayOfWeek2;
            int i6 = 0;
            while (i6 < i5) {
                i6++;
                arrayList.add(new LocalDate(localDatePlusMonths2.getYear(), localDatePlusMonths2.getMonthOfYear(), i6));
            }
        } else {
            if (dayOfWeek != 7) {
                for (int i7 = 0; i7 < dayOfWeek; i7++) {
                    arrayList.add(new LocalDate(localDatePlusMonths.getYear(), localDatePlusMonths.getMonthOfYear(), maximumValue2 - ((dayOfWeek - i7) - 1)));
                }
            }
            int i8 = 0;
            while (i8 < maximumValue) {
                i8++;
                arrayList.add(new LocalDate(localDate.getYear(), localDate.getMonthOfYear(), i8));
            }
            if (dayOfWeek2 == 7) {
                dayOfWeek2 = 0;
            }
            int i9 = 6 - dayOfWeek2;
            int i10 = 0;
            while (i10 < i9) {
                i10++;
                arrayList.add(new LocalDate(localDatePlusMonths2.getYear(), localDatePlusMonths2.getMonthOfYear(), i10));
            }
        }
        if (arrayList.size() == 28) {
            while (i < 7) {
                i++;
                arrayList.add(new LocalDate(localDatePlusMonths2.getYear(), localDatePlusMonths2.getMonthOfYear(), i));
            }
        }
        return arrayList;
    }

    public final int monthsBetween(long millis1, long mills2) {
        return monthsBetween(new LocalDate(millis1), new LocalDate(mills2));
    }

    @JvmStatic
    @NotNull
    public static final String getDateMMddSimpleFormat(long seconds) {
        return getDateMMddSimpleFormat(new LocalDate(seconds * ((long) 1000)));
    }

    @JvmStatic
    @NotNull
    public static final String getDateYYYYFormat(long mills) {
        return getDateYYYYFormat(new LocalDate(mills));
    }

    @JvmStatic
    @NotNull
    public static final String getWeekSimpleStr(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        TimeDateUtil timeDateUtil = INSTANCE;
        return timeDateUtil.getWeekSimpleStr(timeDateUtil.localDateToTimestampInner(localDate));
    }

    @JvmStatic
    @NotNull
    public static final String getWeekStr(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        TimeDateUtil timeDateUtil = INSTANCE;
        return timeDateUtil.getWeekStr(timeDateUtil.localDateToTimestampInner(localDate));
    }

    @JvmStatic
    @NotNull
    public static final String getDateMMddFormat(long time) {
        return getDateMMddFormat(timestampToLocalDate(time));
    }

    @JvmStatic
    @NotNull
    public static final String getDateMMddNumberFormat(long mills) {
        return getDateMMddNumberFormat(new LocalDate(mills));
    }

    @JvmStatic
    @NotNull
    public static final String getDateSimpleLocalFormat(long timeStamp) {
        String dateTime = DateUtils.formatDateTime(AppUtil.getApp(), timeStamp * ((long) 1000), 131076);
        Intrinsics.checkNotNullExpressionValue(dateTime, "formatDateTime(...)");
        return dateTime;
    }

    @JvmStatic
    public static final long getFirstDayOfMonthTime(long timestamp) {
        LocalDate localDateTimestampToLocalDate = timestampToLocalDate(timestamp);
        LocalDate localDateMinusDays = localDateTimestampToLocalDate.minusDays(localDateTimestampToLocalDate.getDayOfMonth() - 1);
        Intrinsics.checkNotNull(localDateMinusDays);
        return changZeroOfTheDay(localDateMinusDays);
    }

    public final int getDaysOfMonth(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, year);
        calendar.set(2, month - 1);
        return calendar.getActualMaximum(5);
    }

    @NotNull
    public final String getZNTimeStrWithHrAndMin(int hour, int min) {
        String quantityString;
        Application app = AppUtil.getApp();
        String quantityString2 = "";
        if (hour > 0) {
            String quantityString3 = app.getResources().getQuantityString(oyi.j, hour, Integer.valueOf(hour));
            if (min > 0) {
                quantityString2 = app.getResources().getQuantityString(oyi.s, min, Integer.valueOf(min));
            }
            String str = quantityString2;
            quantityString2 = quantityString3;
            quantityString = str;
        } else if (min <= 0) {
            quantityString = "";
        } else {
            quantityString = app.getResources().getQuantityString(oyi.q, min, Integer.valueOf(min));
        }
        if (TextUtils.isEmpty(quantityString2) && TextUtils.isEmpty(quantityString)) {
            String quantityString4 = app.getResources().getQuantityString(oyi.q, 0, 0);
            Intrinsics.checkNotNullExpressionValue(quantityString4, "getQuantityString(...)");
            return quantityString4;
        }
        return spliceTime(quantityString2, quantityString);
    }

    @JvmStatic
    @NotNull
    public static final String getDateRangeMMddFormat(@NotNull LocalDate start, @NotNull LocalDate end) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Application app = AppUtil.getApp();
        TimeDateUtil timeDateUtil = INSTANCE;
        String dateRange = DateUtils.formatDateRange(app, timeDateUtil.localDateToTimestampInner(start), timeDateUtil.localDateToTimestampInner(end), 24);
        Intrinsics.checkNotNullExpressionValue(dateRange, "formatDateRange(...)");
        return dateRange;
    }

    @JvmStatic
    @NotNull
    public static final String getDateStr(long timestamp, @Nullable String patternStr, @Nullable Locale locale) {
        String str = new SimpleDateFormat(patternStr, locale).format(new Date(timestamp * ((long) 1000)));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @JvmStatic
    @NotNull
    public static final String getDateYYYYMMddLocalFormat(long millis) {
        return getDateYYYYMMddLocalFormat(new LocalDate(millis));
    }

    public final long changZeroOfTheDayInner(long time) {
        String str = new SimpleDateFormat("yyyy-MM-dd 00:00:00", Locale.getDefault()).format(new Date(time));
        try {
            return Timestamp.valueOf(str).getTime();
        } catch (Exception e) {
            throw new RuntimeException("changZeroOfTheDayInner param time " + str, e);
        }
    }

    @JvmStatic
    @NotNull
    public static final String getDateStr(long timestamp, @Nullable String patternStr, @Nullable TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patternStr, Locale.getDefault());
        Date date = new Date(timestamp * ((long) 1000));
        simpleDateFormat.setTimeZone(timeZone);
        String str = simpleDateFormat.format(date);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @JvmStatic
    @NotNull
    public static final String getDateStr(@NotNull LocalDate localDate, @Nullable String patternStr) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        return getDateStr(localDateToTimestamp(localDate), patternStr);
    }

    @JvmStatic
    @NotNull
    public static final String getHMFormatInMillis(@NotNull Context ctx, long timeInMillis) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        return getHMFormatInMillis(ctx, timeInMillis, 3, 0, 0);
    }
}
