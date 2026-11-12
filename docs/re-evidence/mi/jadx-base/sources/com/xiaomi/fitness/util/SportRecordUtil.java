package com.xiaomi.fitness.util;

import android.app.Application;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.LongSparseArray;
import com.google.android.material.timepicker.TimeModel;
import com.mi.health.map.data.GpsValues;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.data.common.data.sport.util.SportReportComputeUtil;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.FitnessRecordKey;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.detail.GpsValuesExKt;
import com.xiaomi.fitness.detail.data.BasicItemInfo;
import com.xiaomi.fitness.detail.util.SportRecordConstants;
import com.xiaomi.fitness.detail.util.SportShareUtil;
import com.xiaomi.fitness.sport_eco.SportConstants;
import com.xiaomi.wearable.gpsalgorithm.impl.FitnessSportNativeAlgo;
import com.xiaomi.wearable.gpsalgorithm.utils.SportRecordComputeUtil;
import defpackage.byi;
import defpackage.j1j;
import defpackage.oyi;
import defpackage.pz6;
import defpackage.xr5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\bI\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0007J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000bJ(\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000bH\u0002J(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000bH\u0002J\u001c\u0010\u0015\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010\u0016\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ$\u0010\u0017\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0018\u001a\u00020\u000bJ\u001c\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0002\u0010\u001cJ\u001c\u0010\u001d\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010\u001e\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010\u001f\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010 \u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010!\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010\"\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010#\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010$\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010%\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010&\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010'\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010(\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010)\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010*\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010+\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010,\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010-\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010.\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010/\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u00100\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u00101\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u00102\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u00103\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u00104\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u00105\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u00106\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u00107\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u00108\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u00109\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010:\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010;\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010<\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010=\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010>\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010?\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010@\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010A\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010B\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010C\u001a\u00020\u00132\u0006\u0010D\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010E\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010F\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010G\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010H\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010I\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010J\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010K\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010L\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010M\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010N\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010O\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010P\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010Q\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010R\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010S\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010T\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010U\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010V\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010W\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010X\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010Y\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001e\u0010Z\u001a\u00020\u00132\u0006\u0010D\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u001e\u0010[\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0016\u0010\\\u001a\b\u0012\u0004\u0012\u00020^0]2\u0006\u0010_\u001a\u00020`H\u0002J:\u0010a\u001a\u00020`2\u0006\u0010_\u001a\u00020`2\u0018\u0010b\u001a\u0014\u0012\u0004\u0012\u00020d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010]0c2\b\u0010D\u001a\u0004\u0018\u00010\rH\u0086@¢\u0006\u0002\u0010eJ;\u0010f\u001a\u00020\u00132\u0018\u0010b\u001a\u0014\u0012\u0004\u0012\u00020d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010]0c2\b\u0010g\u001a\u0004\u0018\u00010h2\b\u0010i\u001a\u0004\u0018\u00010hH\u0002¢\u0006\u0002\u0010jJ\"\u0010k\u001a\u00020\u00132\u0018\u0010b\u001a\u0014\u0012\u0004\u0012\u00020d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010]0cH\u0003J4\u0010l\u001a\u00020\u00132$\u0010m\u001a \u0012\u0004\u0012\u00020\u0007\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010]0n0n2\u0006\u0010o\u001a\u00020\rJB\u0010p\u001a\u0014\u0012\u0004\u0012\u00020d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010]0n2\u0006\u0010D\u001a\u00020\r2\u0018\u0010m\u001a\u0014\u0012\u0004\u0012\u00020d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010]0n2\u0006\u0010q\u001a\u00020\u000bJ\u001c\u0010r\u001a\b\u0012\u0004\u0012\u00020^0]2\f\u0010s\u001a\b\u0012\u0004\u0012\u00020^0tH\u0002J:\u0010u\u001a\b\u0012\u0004\u0012\u00020^0t2\u0006\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u00020w2\f\u0010y\u001a\b\u0012\u0004\u0012\u00020^0t2\f\u0010z\u001a\b\u0012\u0004\u0012\u00020^0]H\u0002J\u001e\u0010{\u001a\u00020\u00072\u0006\u0010|\u001a\u00020w2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020^0]H\u0002J$\u0010~\u001a\u00020\u000b2\u0006\u0010|\u001a\u00020w2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020^0]2\u0006\u0010\u007f\u001a\u00020\u0007J\u001b\u0010\u0080\u0001\u001a\u00020\u00052\u0007\u0010\u0081\u0001\u001a\u00020h2\u0007\u0010\u0082\u0001\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0083\u0001"}, d2 = {"Lcom/xiaomi/fitness/util/SportRecordUtil;", "", "<init>", "()V", "TAG", "", "MOVE_MEAN_WINDOW_LENGTH", "", "getMapMarginViewHeight", "getMapMarginViewHeightWithStatueBar", "addFirstBasicItemInfo", "", "sportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "basicList", "", "Lcom/xiaomi/fitness/detail/data/BasicItemInfo;", "shareType", "addDistance", "", "addDepth", "addDuration", "addValidDuration", "addCalories", "isFirstData", "addTotalCalories", "report", "getTriathlonCalories", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)Ljava/lang/Integer;", "addAvgPace", "addAvgEqualPace", "addAvgSpeed", "addMaxSpeed", "addAvgRate", "addTotalGolfScores", "addSwingSpeed", "addAvgSwingTime", "addAvgDownSwingTime", "addAvgSwingRhythm", "addCounts", "addSteps", "addRiseHeight", "addFallHeight", "addAvgHeight", "addSwimPosture", "addTurnCount", "addAvgRowFreq", "addAvgStrokeFreq", "addSwingCount", "addMaxSlope", "addAvgResistance", "addAvgCadence", "addAvgPower", "addAvgStress", "addStumbleTimes", "addTotalPunchCount", "addPerfectPunchCount", "addGoodPunchCount", "addMissPunchCount", "addMaxPunchIntensity", "addMaxPunchComboCount", "addPunchHitRate", "addStepCadence", "addAvgStepLength", "addAvgSwolf", "addBestSwolf", "addGroupRestDuration", "addTriathlonChangeDuration", "sportBasicReport", "addHangInAirDuration", "addRunDistance", "addShootCount", "addDribbleDuration", "addForehandSwingCount", "addBackhandSwingCount", "addSmashBallCount", "addServeBallCount", "addAvgSkipFreq", "addBestSkipFreq", "addLayOars", "addPullOars", "addRecoveryHrm", "addEnergyWorking", "addTotalClimbing", "addMaxHrm", "addBestRowFreq", "addAvgStartingHeight", "addMinStartingHeight", "addSportRunningTechnology", "addSportRunningStepSpeed", "addTriathlonSportDuration", "addGroupSportDuration", "getIntegerKilometerPoints", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "gpsValues", "Lcom/mi/health/map/data/GpsValues;", "insertIntegerValues", "resultMap", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "(Lcom/mi/health/map/data/GpsValues;Ljava/util/Map;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "computeStepFrequency", Constants.KEY_RECHARGE_MAXVALUE, "", Constants.KEY_RECHARGE_MINVALUE, "(Ljava/util/Map;Ljava/lang/Float;Ljava/lang/Float;)V", "computeStepsLength", "computeTriathlonPaceAndSpeed", "map", "", "mBasicReport", "computeDistanceList", "valueFromGpsFile", "getListFromSparseArray", "sparseArray", "Landroid/util/LongSparseArray;", "expendXAisValue", "sportStartTime", "", "sportEndTime", "originalValues", "sportingList", "isInSport", SportConstants.KEY_TIMESTAMP, "sportList", "gpsIsInSport", "pauseIndex", "getPluralsFloatUnit", "floatValue", "pluralsResourceId", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportRecordUtil {

    @NotNull
    public static final SportRecordUtil INSTANCE = new SportRecordUtil();
    private static final int MOVE_MEAN_WINDOW_LENGTH = 10;

    @NotNull
    private static final String TAG = "SportRecordUtil";

    /* JADX INFO: renamed from: com.xiaomi.fitness.util.SportRecordUtil$insertIntegerValues$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.util.SportRecordUtil", f = "SportRecordUtil.kt", i = {0, 1}, l = {874, 876}, m = "insertIntegerValues", n = {"gpsValues", "gpsValues"}, s = {"L$0", "L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportRecordUtil.this.insertIntegerValues(null, null, null, this);
        }
    }

    private SportRecordUtil() {
    }

    private final void addDepth(SportBasicReport sportValues, List<BasicItemInfo> basicList, boolean shareType) {
        if (sportValues.getMaxDivingDepth() != null) {
            Float maxDivingDepth = sportValues.getMaxDivingDepth();
            Intrinsics.checkNotNull(maxDivingDepth);
            String strG = xr5.g(2, maxDivingDepth.floatValue());
            Resources resources = AppUtil.getApp().getResources();
            int i = oyi.n;
            Float maxDivingDepth2 = sportValues.getMaxDivingDepth();
            Intrinsics.checkNotNull(maxDivingDepth2);
            String quantityString = resources.getQuantityString(i, (int) maxDivingDepth2.floatValue());
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            int i2 = j1j.n5;
            Intrinsics.checkNotNull(strG);
            basicList.add(new BasicItemInfo(i2, strG, quantityString, 0, null, null, 56, null));
        }
    }

    public static /* synthetic */ void addDepth$default(SportRecordUtil sportRecordUtil, SportBasicReport sportBasicReport, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        sportRecordUtil.addDepth(sportBasicReport, list, z);
    }

    private final void addDistance(SportBasicReport sportValues, List<BasicItemInfo> basicList, boolean shareType) {
        String strE;
        String quantityString;
        int i;
        if (sportValues.getDistance() != null) {
            Integer correctedDistance = sportValues.getCorrectedDistance();
            Integer distance = (correctedDistance == null || correctedDistance.intValue() <= 0) ? sportValues.getDistance() : sportValues.getCorrectedDistance();
            if (sportValues.getProtoType() == 10 || sportValues.getProtoType() == 9) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Intrinsics.checkNotNull(distance);
                strE = String.format(TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{distance}, 1));
                Intrinsics.checkNotNullExpressionValue(strE, "format(...)");
            } else {
                Intrinsics.checkNotNull(distance);
                strE = pz6.e(distance.intValue());
            }
            String str = strE;
            if (sportValues.getProtoType() == 10 || sportValues.getProtoType() == 9) {
                quantityString = shareType ? AppUtil.getApp().getResources().getQuantityString(byi.j, distance.intValue()) : AppUtil.getApp().getResources().getQuantityString(byi.a0, distance.intValue());
            } else {
                quantityString = pz6.h(distance.intValue(), shareType);
            }
            String str2 = quantityString;
            if (sportValues.getSportType() == 708 || sportValues.getSportType() == 709) {
                i = j1j.m7;
            } else {
                i = sportValues.getProtoType() == 25 ? j1j.n5 : j1j.P;
            }
            int i2 = i;
            Intrinsics.checkNotNull(str);
            Intrinsics.checkNotNull(str2);
            basicList.add(new BasicItemInfo(i2, str, str2, 0, null, null, 56, null));
        }
    }

    public static /* synthetic */ void addDistance$default(SportRecordUtil sportRecordUtil, SportBasicReport sportBasicReport, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        sportRecordUtil.addDistance(sportBasicReport, list, z);
    }

    public static /* synthetic */ boolean addFirstBasicItemInfo$default(SportRecordUtil sportRecordUtil, SportBasicReport sportBasicReport, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return sportRecordUtil.addFirstBasicItemInfo(sportBasicReport, list, z);
    }

    private final void addGroupSportDuration(SportBasicReport sportValues, List<BasicItemInfo> basicList) {
        Integer totalRestDuration = sportValues.getTotalRestDuration();
        if (totalRestDuration == null || totalRestDuration.intValue() == 0) {
            return;
        }
        int duration = sportValues.getDuration();
        Integer totalRestDuration2 = sportValues.getTotalRestDuration();
        Intrinsics.checkNotNull(totalRestDuration2);
        basicList.add(new BasicItemInfo(j1j.W1, TimeDateUtil.getTimeStrWithSecDef(duration - totalRestDuration2.intValue()), "", 0, null, null, 56, null));
    }

    private final void addTriathlonSportDuration(SportBasicReport sportBasicReport, List<BasicItemInfo> basicList) {
        Integer changeDuration = sportBasicReport.getChangeDuration();
        if (changeDuration != null) {
            basicList.add(new BasicItemInfo(j1j.F0, TimeDateUtil.getTimeStrWithSecDef(sportBasicReport.getDuration() - changeDuration.intValue()), "", 0, null, null, 56, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void computeStepFrequency(Map<SportRecordKey, List<Object>> resultMap, Float maxValue, Float minValue) {
        List<Object> list = resultMap.get(SportRecordKey.Step);
        if (list != null) {
            resultMap.put(SportRecordKey.StepsFrequency, SportRecordComputeUtil.INSTANCE.computeFrequency(list, maxValue, minValue));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated(message = "unused,不需要app计算步幅")
    private final void computeStepsLength(Map<SportRecordKey, List<Object>> resultMap) {
        List<SportRecordItem> listComputeStepLength;
        SportRecordKey sportRecordKey = SportRecordKey.Distance;
        if (resultMap.containsKey(sportRecordKey)) {
            SportRecordKey sportRecordKey2 = SportRecordKey.Step;
            if (resultMap.containsKey(sportRecordKey2)) {
                List<Object> list = resultMap.get(sportRecordKey);
                List<Object> list2 = resultMap.get(sportRecordKey2);
                if (list == null || list2 == null || (listComputeStepLength = SportRecordComputeUtil.INSTANCE.computeStepLength(list2, list)) == null) {
                    return;
                }
                resultMap.put(SportRecordKey.StepsLength, listComputeStepLength);
            }
        }
    }

    private final LongSparseArray<SportRecordItem> expendXAisValue(long sportStartTime, long sportEndTime, LongSparseArray<SportRecordItem> originalValues, List<SportRecordItem> sportingList) {
        int i = (int) (sportEndTime - sportStartTime);
        for (int i2 = 0; i2 < i; i2++) {
            long j = sportStartTime + ((long) i2);
            if (isInSport(j, sportingList) != -1 && originalValues.get(j) == null) {
                originalValues.put(j, new SportRecordItem(j, j + 1, Float.valueOf(0.0f), 0, 0, 24, null));
            }
        }
        return originalValues;
    }

    private final List<SportRecordItem> getIntegerKilometerPoints(GpsValues gpsValues) {
        ArrayList arrayList = new ArrayList();
        int size = gpsValues.originalLocationList.size();
        FitnessSportNativeAlgo fitnessSportNativeAlgo = new FitnessSportNativeAlgo(null);
        int i = 0;
        long j = size > 0 ? gpsValues.originalLocationList.get(0).startTimeStamp : 0L;
        float f = 0.0f;
        int i2 = 1;
        while (i < size) {
            Location location = gpsValues.originalLocationList.get(i);
            int i3 = i2 * 1000;
            Location locationComputeSportInfoByGps = fitnessSportNativeAlgo.computeSportInfoByGps(location);
            double d = locationComputeSportInfoByGps != null ? locationComputeSportInfoByGps.distance : 0.0d;
            if (f <= i3 && ((double) f) + d >= i3) {
                arrayList.add(new SportRecordItem(j, location.timeStamp, Float.valueOf(i2), 0, 0, 24, null));
                i2++;
                j = location.timeStamp;
            }
            f += (float) d;
            i++;
            size = size;
            fitnessSportNativeAlgo = fitnessSportNativeAlgo;
        }
        int i4 = size;
        if (f >= 1000.0f) {
            f -= (i2 - 1) * 1000;
        }
        if (f >= 995.0f) {
            arrayList.add(new SportRecordItem(j, gpsValues.originalLocationList.get(i4 - 1).startTimeStamp, Float.valueOf(i2), 0, 0, 24, null));
        }
        return arrayList;
    }

    private final List<SportRecordItem> getListFromSparseArray(LongSparseArray<SportRecordItem> sparseArray) {
        if (sparseArray.size() == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int size = sparseArray.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(sparseArray.valueAt(i));
        }
        return arrayList;
    }

    private final String getPluralsFloatUnit(float floatValue, int pluralsResourceId) {
        Application app = AppUtil.getApp();
        String quantityString = app.getResources().getQuantityString(pluralsResourceId, xr5.j(floatValue));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0078  */
    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    private final Integer getTriathlonCalories(SportBasicReport report) {
        int iIntValue;
        boolean z;
        boolean z2 = true;
        if (report.getOpenSwimmingReport() != null) {
            SportBasicReport openSwimmingReport = report.getOpenSwimmingReport();
            Intrinsics.checkNotNull(openSwimmingReport);
            if (openSwimmingReport.getTotalCal() != null) {
                SportBasicReport openSwimmingReport2 = report.getOpenSwimmingReport();
                Intrinsics.checkNotNull(openSwimmingReport2);
                Integer totalCal = openSwimmingReport2.getTotalCal();
                Intrinsics.checkNotNull(totalCal);
                iIntValue = totalCal.intValue();
                z = true;
            } else {
                iIntValue = 0;
                z = false;
            }
        } else {
            iIntValue = 0;
            z = false;
        }
        if (report.getOutdoorRidingReport() != null) {
            SportBasicReport outdoorRidingReport = report.getOutdoorRidingReport();
            Intrinsics.checkNotNull(outdoorRidingReport);
            if (outdoorRidingReport.getTotalCal() != null) {
                SportBasicReport outdoorRidingReport2 = report.getOutdoorRidingReport();
                Intrinsics.checkNotNull(outdoorRidingReport2);
                Integer totalCal2 = outdoorRidingReport2.getTotalCal();
                Intrinsics.checkNotNull(totalCal2);
                iIntValue += totalCal2.intValue();
                z = true;
            }
        }
        if (report.getOutdoorRunningReport() != null) {
            SportBasicReport outdoorRunningReport = report.getOutdoorRunningReport();
            Intrinsics.checkNotNull(outdoorRunningReport);
            if (outdoorRunningReport.getTotalCal() != null) {
                SportBasicReport outdoorRunningReport2 = report.getOutdoorRunningReport();
                Intrinsics.checkNotNull(outdoorRunningReport2);
                Integer totalCal3 = outdoorRunningReport2.getTotalCal();
                Intrinsics.checkNotNull(totalCal3);
                iIntValue += totalCal3.intValue();
            } else {
                z2 = z;
            }
        } else {
            z2 = z;
        }
        if (z2) {
            return Integer.valueOf(iIntValue);
        }
        return null;
    }

    private final int isInSport(long timeStamp, List<SportRecordItem> sportList) {
        if (sportList.isEmpty()) {
            return -1;
        }
        int size = sportList.size();
        for (int i = 0; i < size; i++) {
            SportRecordItem sportRecordItem = sportList.get(i);
            if (timeStamp >= sportRecordItem.getStartTime() && timeStamp < sportRecordItem.getEndTime()) {
                return (int) (sportRecordItem.getEndTime() - timeStamp);
            }
        }
        return -1;
    }

    public final void addAvgCadence(@NotNull SportBasicReport report, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(report, "report");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (report.getAvgCycleCadence() != null) {
            Integer avgCycleCadence = report.getAvgCycleCadence();
            Intrinsics.checkNotNull(avgCycleCadence);
            if (avgCycleCadence.intValue() > 0) {
                basicList.add(new BasicItemInfo(j1j.j1, String.valueOf(report.getAvgCycleCadence()), "", 0, null, null, 56, null));
            }
        }
    }

    public final void addAvgDownSwingTime(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getAvgDownSwingDuration() != null) {
            String strValueOf = String.valueOf(sportValues.getAvgDownSwingDuration());
            Float avgDownSwingDuration = sportValues.getAvgDownSwingDuration();
            Intrinsics.checkNotNull(avgDownSwingDuration);
            basicList.add(new BasicItemInfo(j1j.W, strValueOf, getPluralsFloatUnit(avgDownSwingDuration.floatValue(), byi.m), 0, null, null, 56, null));
        }
    }

    public final void addAvgEqualPace(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Integer avgEqualPace;
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getAvgEqualPace() != null) {
            Integer avgEqualPace2 = sportValues.getAvgEqualPace();
            Intrinsics.checkNotNull(avgEqualPace2);
            if (avgEqualPace2.intValue() <= 0 || (avgEqualPace = sportValues.getAvgEqualPace()) == null) {
                return;
            }
            String sportPaceStrWithSecDef = TimeDateUtil.getSportPaceStrWithSecDef(avgEqualPace.intValue());
            if (TextUtils.isEmpty(sportPaceStrWithSecDef)) {
                return;
            }
            basicList.add(new BasicItemInfo(j1j.l6, sportPaceStrWithSecDef, "", BasicItemInfo.INSTANCE.getSPORT_DATA_INFO_PACE(), null, null, 48, null));
        }
    }

    public final void addAvgHeight(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        Float avgHeight = sportValues.getAvgHeight();
        if (avgHeight != null) {
            float fFloatValue = avgHeight.floatValue();
            if (fFloatValue > 0.0f) {
                String strF = xr5.f(fFloatValue);
                int i = (int) fFloatValue;
                String quantityString = ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), oyi.g, i, Integer.valueOf(i));
                int i2 = j1j.p3;
                Intrinsics.checkNotNull(strF);
                basicList.add(new BasicItemInfo(i2, strF, quantityString, 0, null, null, 56, null));
            }
        }
    }

    public final void addAvgPace(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Integer avgPace;
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getDistance() == null || (avgPace = SportReportComputeUtil.INSTANCE.getAvgPace(sportValues)) == null) {
            return;
        }
        String sportPaceStrWithSecDef = TimeDateUtil.getSportPaceStrWithSecDef(avgPace.intValue());
        if (TextUtils.isEmpty(sportPaceStrWithSecDef)) {
            return;
        }
        basicList.add(new BasicItemInfo(j1j.T, sportPaceStrWithSecDef, "", BasicItemInfo.INSTANCE.getSPORT_DATA_INFO_PACE(), null, null, 48, null));
    }

    public final void addAvgPower(@NotNull SportBasicReport report, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(report, "report");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (report.getAvgPower() != null) {
            Integer avgPower = report.getAvgPower();
            Intrinsics.checkNotNull(avgPower);
            if (avgPower.intValue() > 0) {
                Application application = ApplicationExtKt.getApplication();
                int i = byi.P;
                Integer avgPower2 = report.getAvgPower();
                Intrinsics.checkNotNull(avgPower2);
                int iIntValue = avgPower2.intValue();
                Integer avgPower3 = report.getAvgPower();
                Intrinsics.checkNotNull(avgPower3);
                avgPower3.intValue();
                basicList.add(new BasicItemInfo(j1j.D6, String.valueOf(report.getAvgPower()), ResourceExtKt.getQuantityString(application, i, iIntValue, avgPower3), 0, null, null, 56, null));
                return;
            }
        }
        if (report.getAvgRunningPower() != null) {
            Integer avgRunningPower = report.getAvgRunningPower();
            Intrinsics.checkNotNull(avgRunningPower);
            if (avgRunningPower.intValue() > 0) {
                Application application2 = ApplicationExtKt.getApplication();
                int i2 = byi.P;
                Integer avgRunningPower2 = report.getAvgRunningPower();
                Intrinsics.checkNotNull(avgRunningPower2);
                int iIntValue2 = avgRunningPower2.intValue();
                Integer avgRunningPower3 = report.getAvgRunningPower();
                Intrinsics.checkNotNull(avgRunningPower3);
                avgRunningPower3.intValue();
                basicList.add(new BasicItemInfo(j1j.D6, String.valueOf(report.getAvgRunningPower()), ResourceExtKt.getQuantityString(application2, i2, iIntValue2, avgRunningPower3), 0, null, null, 56, null));
            }
        }
    }

    public final void addAvgRate(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getAvgHr() != null) {
            Integer avgHr = sportValues.getAvgHr();
            if (avgHr != null && avgHr.intValue() == 0) {
                return;
            }
            basicList.add(new BasicItemInfo(j1j.X, String.valueOf(sportValues.getAvgHr()), ResourceExtKt.getString(j1j.Q6), 0, null, null, 56, null));
        }
    }

    public final void addAvgResistance(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getAvgResistance() != null) {
            Integer avgResistance = sportValues.getAvgResistance();
            Intrinsics.checkNotNull(avgResistance);
            if (avgResistance.intValue() > 0) {
                basicList.add(new BasicItemInfo(j1j.L2, String.valueOf(sportValues.getAvgResistance()), "", 0, null, null, 56, null));
            }
        }
    }

    public final void addAvgRowFreq(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        Integer avgRowFreq = sportValues.getAvgRowFreq();
        if (avgRowFreq != null) {
            basicList.add(new BasicItemInfo(j1j.S9, avgRowFreq.toString(), "", 0, null, null, 56, null));
        }
    }

    public final void addAvgSkipFreq(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getAvgSkipFreq() != null) {
            basicList.add(new BasicItemInfo(j1j.r3, String.valueOf(sportValues.getAvgSkipFreq()), "", BasicItemInfo.INSTANCE.getSPORT_DATA_INFO_AVG_SKIP_FREQ(), null, null, 48, null));
        }
    }

    public final void addAvgSpeed(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getDistance() != null) {
            Float avgSpeed = SportReportComputeUtil.INSTANCE.getAvgSpeed(sportValues);
            Intrinsics.checkNotNull(avgSpeed);
            String strG = xr5.g(1, avgSpeed.floatValue());
            if (TextUtils.isEmpty(strG) || avgSpeed.floatValue() <= 0.0f) {
                return;
            }
            if (sportValues.getSportType() == 708 || sportValues.getSportType() == 709) {
                int i = j1j.F6;
                Intrinsics.checkNotNull(strG);
                basicList.add(new BasicItemInfo(i, strG, ResourceExtKt.getString(j1j.J), 0, null, null, 56, null));
            } else {
                int i2 = j1j.b0;
                Intrinsics.checkNotNull(strG);
                basicList.add(new BasicItemInfo(i2, strG, ResourceExtKt.getString(j1j.J), 0, null, null, 56, null));
            }
        }
    }

    public final void addAvgStartingHeight(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getAvgStartingHeight() != null) {
            basicList.add(new BasicItemInfo(j1j.s3, String.valueOf(sportValues.getAvgStartingHeight()), "", 0, null, null, 56, null));
        }
    }

    public final void addAvgStepLength(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        Integer avgStepLength = SportReportComputeUtil.getAvgStepLength(sportValues);
        if (avgStepLength != null) {
            basicList.add(new BasicItemInfo(j1j.w3, avgStepLength.toString(), ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), byi.l, avgStepLength.intValue(), avgStepLength), BasicItemInfo.INSTANCE.getSPORT_DATA_INFO_STEP_LENGTH(), SportRecordConstants.INSTANCE.getUnderstandSportTypeUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), FitnessRecordKey.stride), null, 32, null));
        }
    }

    public final void addAvgStress(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getAvgStress() != null) {
            basicList.add(new BasicItemInfo(j1j.M2, String.valueOf(sportValues.getAvgStress()), "", 0, null, null, 56, null));
        }
    }

    public final void addAvgStrokeFreq(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        Integer avgStrokeFeq = SportReportComputeUtil.getAvgStrokeFeq(sportValues);
        if (avgStrokeFeq != null) {
            basicList.add(new BasicItemInfo(j1j.S9, avgStrokeFeq.toString(), "", 0, null, null, 56, null));
        }
    }

    public final void addAvgSwingRhythm(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getAvgSwingRhythm() != null) {
            basicList.add(new BasicItemInfo(j1j.N2, String.valueOf(sportValues.getAvgSwingRhythm()), "", 0, null, null, 56, null));
        }
    }

    public final void addAvgSwingTime(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getAvgBackSwingDuration() != null) {
            String strValueOf = String.valueOf(sportValues.getAvgBackSwingDuration());
            Float avgDownSwingDuration = sportValues.getAvgDownSwingDuration();
            Intrinsics.checkNotNull(avgDownSwingDuration);
            basicList.add(new BasicItemInfo(j1j.V, strValueOf, getPluralsFloatUnit(avgDownSwingDuration.floatValue(), byi.m), 0, null, null, 56, null));
        }
    }

    public final void addAvgSwolf(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getAvgSwolf() != null) {
            basicList.add(new BasicItemInfo(j1j.M9, String.valueOf(sportValues.getAvgSwolf()), "", BasicItemInfo.INSTANCE.getSPORT_DATA_INFO_AVG_SWOLF(), SportRecordConstants.INSTANCE.getUnderstandSportTypeUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), "swolf"), null, 32, null));
        }
    }

    public final void addBackhandSwingCount(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getBackhandSwingCount() != null) {
            basicList.add(new BasicItemInfo(j1j.e9, String.valueOf(sportValues.getBackhandSwingCount()), "", 0, null, null, 56, null));
        }
    }

    public final void addBestRowFreq(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getBestRowFreq() != null) {
            basicList.add(new BasicItemInfo(j1j.W2, String.valueOf(sportValues.getBestRowFreq()), "", 0, null, null, 56, null));
        }
    }

    public final void addBestSkipFreq(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getBestSkipFreq() != null) {
            basicList.add(new BasicItemInfo(j1j.D3, String.valueOf(sportValues.getBestSkipFreq()), "", BasicItemInfo.INSTANCE.getSPORT_DATA_INFO_BEST_SKIP_FREQ(), null, null, 48, null));
        }
    }

    public final void addBestSwolf(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getBestSwolf() != null) {
            basicList.add(new BasicItemInfo(j1j.N9, String.valueOf(sportValues.getBestSwolf()), "", BasicItemInfo.INSTANCE.getSPORT_DATA_INFO_BEST_SWOLF(), null, null, 48, null));
        }
    }

    public final void addCalories(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList, boolean isFirstData) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        Integer calories = sportValues.getCalories();
        if (calories != null) {
            String quantityString = isFirstData ? AppUtil.getApp().getResources().getQuantityString(byi.common_unit_calorie, calories.intValue(), calories) : AppUtil.getApp().getResources().getQuantityString(byi.i, calories.intValue(), calories);
            Intrinsics.checkNotNull(quantityString);
            basicList.add(new BasicItemInfo(j1j.O, calories.toString(), quantityString, 0, null, null, 56, null));
        }
    }

    public final void addCounts(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        int iIntValue;
        int iIntValue2;
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        Integer rowCount = sportValues.getRowCount();
        if (rowCount != null && (iIntValue2 = rowCount.intValue()) > 0) {
            basicList.add(new BasicItemInfo(j1j.D0, String.valueOf(iIntValue2), "", 0, null, null, 56, null));
        }
        Integer strokeCount = sportValues.getStrokeCount();
        if (strokeCount != null && (iIntValue = strokeCount.intValue()) > 0) {
            basicList.add(new BasicItemInfo(j1j.v8, String.valueOf(iIntValue), "", 0, null, null, 56, null));
        }
        int forceFrisbeeThrowingCount = sportValues.getForceFrisbeeThrowingCount();
        if (forceFrisbeeThrowingCount > 0) {
            String quantityString = AppUtil.getApp().getResources().getQuantityString(byi.R, forceFrisbeeThrowingCount);
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            basicList.add(new BasicItemInfo(byi.R, String.valueOf(forceFrisbeeThrowingCount), "", 0, null, quantityString, 24, null));
        }
    }

    public final void addDribbleDuration(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getDribbleDuration() != null) {
            Integer dribbleDuration = sportValues.getDribbleDuration();
            Intrinsics.checkNotNull(dribbleDuration);
            basicList.add(new BasicItemInfo(j1j.R2, TimeDateUtil.getTimeStrWithSecDef(dribbleDuration.intValue()), "", 0, null, null, 56, null));
        }
    }

    public final void addDuration(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        String timeStrWithSecDef = TimeDateUtil.getTimeStrWithSecDef(sportValues.getDuration());
        if (TextUtils.isEmpty(timeStrWithSecDef)) {
            return;
        }
        if (sportValues.getProtoType() != 25) {
            basicList.add(new BasicItemInfo(j1j.Q, timeStrWithSecDef, "", 0, null, null, 56, null));
            return;
        }
        if (sportValues.getTotalDivingDuration() != null) {
            Integer totalDivingDuration = sportValues.getTotalDivingDuration();
            Intrinsics.checkNotNull(totalDivingDuration);
            timeStrWithSecDef = TimeDateUtil.getTimeStrWithSecDef(totalDivingDuration.intValue());
        }
        basicList.add(new BasicItemInfo(j1j.Y3, timeStrWithSecDef, "", 0, null, null, 56, null));
    }

    public final void addEnergyWorking(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        Integer energyWorking = sportValues.getEnergyWorking();
        if (energyWorking != null) {
            int iIntValue = energyWorking.intValue() / 1000;
            Intrinsics.checkNotNullExpressionValue(AppUtil.getApp().getResources().getQuantityString(byi.y, iIntValue), "getQuantityString(...)");
            basicList.add(new BasicItemInfo(j1j.o6, String.valueOf(iIntValue), "", 0, null, null, 56, null));
        }
    }

    public final void addFallHeight(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        Float fallHeight = sportValues.getFallHeight();
        if (fallHeight != null) {
            float fFloatValue = fallHeight.floatValue();
            if (fFloatValue > 0.0f) {
                String strF = xr5.f(fFloatValue);
                int i = (int) fFloatValue;
                String quantityString = ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), oyi.g, i, Integer.valueOf(i));
                int i2 = j1j.Y;
                Intrinsics.checkNotNull(strF);
                basicList.add(new BasicItemInfo(i2, strF, quantityString, 0, null, null, 56, null));
            }
        }
    }

    public final boolean addFirstBasicItemInfo(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList, boolean shareType) {
        Integer gymTrainingTotalTimes;
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getDistance() != null) {
            Integer distance = sportValues.getDistance();
            Intrinsics.checkNotNull(distance);
            if (distance.intValue() > 0) {
                addDistance(sportValues, basicList, shareType);
                return false;
            }
        }
        if (sportValues.getSportType() == 14) {
            int i = byi.T;
            Integer skipCount = sportValues.getSkipCount();
            String strValueOf = String.valueOf(skipCount != null ? skipCount.intValue() : 0);
            Application application = ApplicationExtKt.getApplication();
            int i2 = byi.common_unit_rope_count;
            Integer skipCount2 = sportValues.getSkipCount();
            int iIntValue = skipCount2 != null ? skipCount2.intValue() : 0;
            Integer skipCount3 = sportValues.getSkipCount();
            String quantityString = ResourceExtKt.getQuantityString(application, i2, iIntValue, Integer.valueOf(skipCount3 != null ? skipCount3.intValue() : 0));
            Application application2 = ApplicationExtKt.getApplication();
            int i3 = byi.T;
            Integer skipCount4 = sportValues.getSkipCount();
            int iIntValue2 = skipCount4 != null ? skipCount4.intValue() : 0;
            Integer skipCount5 = sportValues.getSkipCount();
            basicList.add(new BasicItemInfo(i, strValueOf, quantityString, 0, null, ResourceExtKt.getQuantityString(application2, i3, iIntValue2, Integer.valueOf(skipCount5 != null ? skipCount5.intValue() : 0)), 24, null));
            return false;
        }
        if ((sportValues.getSportType() != 313 || (gymTrainingTotalTimes = sportValues.getGymTrainingTotalTimes()) == null || gymTrainingTotalTimes.intValue() <= 0) && sportValues.getSportType() != 334) {
            if (sportValues.getSportType() == 116 || sportValues.getSportType() == 117 || sportValues.getSportType() == 118) {
                addDepth(sportValues, basicList, shareType);
                return false;
            }
            addCalories(sportValues, basicList, !shareType);
            return true;
        }
        int i4 = byi.v;
        Integer gymTrainingTotalTimes2 = sportValues.getGymTrainingTotalTimes();
        String strValueOf2 = String.valueOf(gymTrainingTotalTimes2 != null ? gymTrainingTotalTimes2.intValue() : 0);
        Application application3 = ApplicationExtKt.getApplication();
        int i5 = byi.v;
        Integer gymTrainingTotalTimes3 = sportValues.getGymTrainingTotalTimes();
        basicList.add(new BasicItemInfo(i4, strValueOf2, StringsKt__StringsKt.trim((CharSequence) ResourceExtKt.getQuantityString(application3, i5, gymTrainingTotalTimes3 != null ? gymTrainingTotalTimes3.intValue() : 0, "")).toString(), 0, null, ApplicationExtKt.getApplication().getString(j1j.oa), 24, null));
        return false;
    }

    public final void addForehandSwingCount(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getForehandSwingCount() != null) {
            basicList.add(new BasicItemInfo(j1j.f9, String.valueOf(sportValues.getForehandSwingCount()), "", 0, null, null, 56, null));
        }
    }

    public final void addGoodPunchCount(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getGoodPunchCount() != null) {
            basicList.add(new BasicItemInfo(j1j.U4, String.valueOf(sportValues.getGoodPunchCount()), "", 0, null, null, 56, null));
        }
    }

    public final void addGroupRestDuration(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        Integer totalRestDuration = sportValues.getTotalRestDuration();
        if (totalRestDuration == null || totalRestDuration.intValue() == 0) {
            return;
        }
        basicList.add(new BasicItemInfo(j1j.W1, TimeDateUtil.getTimeStrWithSecDef(totalRestDuration.intValue()), "", 0, null, null, 56, null));
    }

    public final void addHangInAirDuration(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getHangInAirDuration() != null) {
            Integer hangInAirDuration = sportValues.getHangInAirDuration();
            int i = j1j.Z4;
            Intrinsics.checkNotNull(hangInAirDuration);
            basicList.add(new BasicItemInfo(i, TimeDateUtil.getTimeStrWithSecDef(hangInAirDuration.intValue()), "", 0, null, null, 56, null));
        }
    }

    public final void addLayOars(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getPullOarsDuration() != null) {
            Integer layOarsDuration = sportValues.getLayOarsDuration();
            int i = j1j.C0;
            Intrinsics.checkNotNull(layOarsDuration);
            basicList.add(new BasicItemInfo(i, TimeDateUtil.getTimeStrWithSecDef(layOarsDuration.intValue()), "", 0, null, null, 56, null));
        }
    }

    public final void addMaxHrm(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getAvgHr() != null) {
            String strValueOf = String.valueOf(sportValues.getAvgHr());
            Resources resources = AppUtil.getApp().getResources();
            int i = byi.common_unit_heart_rate;
            Integer avgHr = sportValues.getAvgHr();
            Intrinsics.checkNotNull(avgHr);
            String quantityString = resources.getQuantityString(i, avgHr.intValue());
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            basicList.add(new BasicItemInfo(j1j.P7, strValueOf, quantityString, 0, null, null, 56, null));
        }
    }

    public final void addMaxPunchComboCount(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getMaxPunchComboCount() != null) {
            basicList.add(new BasicItemInfo(j1j.s5, String.valueOf(sportValues.getMaxPunchComboCount()), "", 0, null, null, 56, null));
        }
    }

    public final void addMaxPunchIntensity(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getMaxPunchIntensity() != null) {
            basicList.add(new BasicItemInfo(j1j.u5, String.valueOf(sportValues.getMaxPunchIntensity()), "", 0, null, null, 56, null));
        }
    }

    public final void addMaxSlope(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getMaxSlope() != null) {
            basicList.add(new BasicItemInfo(j1j.s7, sportValues.getMaxSlope() + "°", "", 0, null, null, 56, null));
        }
    }

    public final void addMaxSpeed(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getDistance() == null || sportValues.getMaxSpeed() == null) {
            return;
        }
        Float maxSpeed = sportValues.getMaxSpeed();
        Intrinsics.checkNotNull(maxSpeed);
        String strG = xr5.g(1, maxSpeed.floatValue());
        if (strG == null || strG.length() == 0) {
            return;
        }
        basicList.add(new BasicItemInfo(j1j.G6, strG, ResourceExtKt.getString(j1j.J), 0, null, null, 56, null));
    }

    public final void addMinStartingHeight(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getMinStartingHeight() != null) {
            basicList.add(new BasicItemInfo(j1j.I3, String.valueOf(sportValues.getMinStartingHeight()), "", 0, null, null, 56, null));
        }
    }

    public final void addMissPunchCount(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getMissPunchCount() != null) {
            basicList.add(new BasicItemInfo(j1j.G5, String.valueOf(sportValues.getMissPunchCount()), "", 0, null, null, 56, null));
        }
    }

    public final void addPerfectPunchCount(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getPerfectPunchCount() != null) {
            basicList.add(new BasicItemInfo(j1j.X5, String.valueOf(sportValues.getPerfectPunchCount()), "", 0, null, null, 56, null));
        }
    }

    public final void addPullOars(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getPullOarsDuration() != null) {
            Integer pullOarsDuration = sportValues.getPullOarsDuration();
            int i = j1j.B0;
            Intrinsics.checkNotNull(pullOarsDuration);
            basicList.add(new BasicItemInfo(i, TimeDateUtil.getTimeStrWithSecDef(pullOarsDuration.intValue()), "", 0, null, null, 56, null));
        }
    }

    public final void addPunchHitRate(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getPunchHitRate() != null) {
            basicList.add(new BasicItemInfo(j1j.b6, String.valueOf(sportValues.getPunchHitRate()), "%", 0, null, null, 56, null));
        }
    }

    public final void addRecoveryHrm(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getHrRecoveryRate() != null) {
            Float hrRecoveryRate = sportValues.getHrRecoveryRate();
            Intrinsics.checkNotNull(hrRecoveryRate);
            if (hrRecoveryRate.floatValue() > 0.0f) {
                Float hrRecoveryRate2 = sportValues.getHrRecoveryRate();
                int i = j1j.c6;
                Intrinsics.checkNotNull(hrRecoveryRate2);
                String strF = xr5.f(hrRecoveryRate2.floatValue());
                Intrinsics.checkNotNullExpressionValue(strF, "getDecimalFloatStr(...)");
                basicList.add(new BasicItemInfo(i, strF, "", 0, null, null, 56, null));
            }
        }
    }

    public final void addRiseHeight(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        Float riseHeight = sportValues.getRiseHeight();
        if (riseHeight != null) {
            float fFloatValue = riseHeight.floatValue();
            if (fFloatValue > 0.0f) {
                String strF = xr5.f(fFloatValue);
                int i = (int) fFloatValue;
                String quantityString = ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), oyi.g, i, Integer.valueOf(i));
                int i2 = j1j.Z;
                Intrinsics.checkNotNull(strF);
                basicList.add(new BasicItemInfo(i2, strF, quantityString, 0, null, null, 56, null));
            }
        }
    }

    public final void addRunDistance(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getDistance() != null) {
            Integer correctedDistance = sportValues.getCorrectedDistance();
            Integer distance = (correctedDistance == null || correctedDistance.intValue() <= 0) ? sportValues.getDistance() : sportValues.getCorrectedDistance();
            Intrinsics.checkNotNull(distance);
            String strE = pz6.e(distance.intValue());
            int i = j1j.Y6;
            Intrinsics.checkNotNull(strE);
            basicList.add(new BasicItemInfo(i, strE, "", 0, null, null, 56, null));
        }
    }

    public final void addServeBallCount(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getServeBallCount() != null) {
            Integer serveBallCount = sportValues.getServeBallCount();
            Intrinsics.checkNotNull(serveBallCount);
            if (serveBallCount.intValue() > 0) {
                basicList.add(new BasicItemInfo(j1j.g7, String.valueOf(sportValues.getServeBallCount()), "", 0, null, null, 56, null));
            }
        }
    }

    public final void addShootCount(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getShootCount() != null) {
            basicList.add(new BasicItemInfo(j1j.S2, String.valueOf(sportValues.getShootCount()), "", 0, null, null, 56, null));
        }
    }

    public final void addSmashBallCount(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getSmashBallCount() != null) {
            basicList.add(new BasicItemInfo(j1j.g9, String.valueOf(sportValues.getSmashBallCount()), "", 0, null, null, 56, null));
        }
    }

    public final void addSportRunningStepSpeed(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        Integer avgPace = SportReportComputeUtil.INSTANCE.getAvgPace(sportValues);
        Integer avgCadence = SportReportComputeUtil.getAvgCadence(sportValues);
        if (avgCadence == null || avgPace == null) {
            return;
        }
        basicList.add(new BasicItemInfo(j1j.p8, avgCadence + "/" + TimeDateUtil.getSportPaceStrWithSecDef(avgPace.intValue()), "", 0, null, null, 56, null));
    }

    public final void addSportRunningTechnology(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getValgusRange() != null) {
            basicList.add(new BasicItemInfo(j1j.s8, sportValues.getValgusRange() + "°", "", 0, null, null, 56, null));
        }
    }

    public final void addStepCadence(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        Integer avgCadence = SportReportComputeUtil.getAvgCadence(sportValues);
        if (avgCadence == null || avgCadence.intValue() <= 0) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(AppUtil.getApp().getString(j1j.z9), "getString(...)");
        basicList.add(new BasicItemInfo(j1j.n3, avgCadence.toString(), "", BasicItemInfo.INSTANCE.getSPORT_DATA_INFO_STEPS_FREQ(), SportRecordConstants.INSTANCE.getUnderstandSportTypeUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), FitnessRecordKey.cadence), null, 32, null));
    }

    public final void addSteps(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        Integer steps = sportValues.getSteps();
        if (steps == null || steps.intValue() <= 0) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(AppUtil.getApp().getResources().getQuantityString(byi.common_unit_step, steps.intValue(), steps), "getQuantityString(...)");
        basicList.add(new BasicItemInfo(j1j.t8, steps.toString(), "", 0, null, null, 56, null));
    }

    public final void addStumbleTimes(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        Integer stumbleTimes = sportValues.getStumbleTimes();
        if (stumbleTimes == null || (iIntValue = stumbleTimes.intValue()) <= 0) {
            return;
        }
        String strValueOf = String.valueOf(iIntValue);
        int i = byi.S;
        Application application = ApplicationExtKt.getApplication();
        int i2 = byi.S;
        Integer stumbleTimes2 = sportValues.getStumbleTimes();
        Intrinsics.checkNotNull(stumbleTimes2);
        int iIntValue2 = stumbleTimes2.intValue();
        Integer stumbleTimes3 = sportValues.getStumbleTimes();
        Intrinsics.checkNotNull(stumbleTimes3);
        basicList.add(new BasicItemInfo(i, strValueOf, "", 0, null, ResourceExtKt.getQuantityString(application, i2, iIntValue2, stumbleTimes3), 24, null));
    }

    public final void addSwimPosture(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getMainPosture() != null) {
            SportShareUtil sportShareUtil = SportShareUtil.INSTANCE;
            Integer mainPosture = sportValues.getMainPosture();
            Intrinsics.checkNotNull(mainPosture);
            basicList.add(new BasicItemInfo(j1j.c0, sportShareUtil.getPostureStr(mainPosture.intValue()), "", BasicItemInfo.INSTANCE.getSPORT_INFO_POSTURE(), null, null, 48, null));
        }
    }

    public final void addSwingCount(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getSwingCount() != null) {
            basicList.add(new BasicItemInfo(j1j.h9, String.valueOf(sportValues.getSwingCount()), "", 0, null, null, 56, null));
        }
    }

    public final void addSwingSpeed(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getAvgSwingSpeed() != null) {
            String strValueOf = String.valueOf(sportValues.getAvgSwingSpeed());
            Float avgSwingSpeed = sportValues.getAvgSwingSpeed();
            Intrinsics.checkNotNull(avgSwingSpeed);
            basicList.add(new BasicItemInfo(j1j.a0, strValueOf, getPluralsFloatUnit(avgSwingSpeed.floatValue(), byi.n), 0, null, null, 56, null));
        }
    }

    public final void addTotalCalories(@NotNull SportBasicReport report, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(report, "report");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        Integer totalCal = report.getTotalCal();
        if (totalCal == null && report.getProtoType() == 17) {
            totalCal = getTriathlonCalories(report);
        }
        if (totalCal != null) {
            String quantityString = AppUtil.getApp().getResources().getQuantityString(byi.i, totalCal.intValue(), totalCal);
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            basicList.add(new BasicItemInfo(j1j.U, totalCal.toString(), quantityString, 0, SportRecordConstants.INSTANCE.getUnderstandSportTypeUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), "calorie"), null, 40, null));
        }
    }

    public final void addTotalClimbing(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getTotalClimbing() != null) {
            Long totalClimbing = sportValues.getTotalClimbing();
            Intrinsics.checkNotNull(totalClimbing);
            basicList.add(new BasicItemInfo(j1j.m3, String.valueOf(totalClimbing.longValue()), "", 0, null, null, 56, null));
        }
    }

    public final void addTotalGolfScores(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        basicList.add(new BasicItemInfo(j1j.T4, String.valueOf(sportValues.getGross()), "", 0, null, null, 56, null));
    }

    public final void addTotalPunchCount(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getTotalPunchCount() != null) {
            String strValueOf = String.valueOf(sportValues.getTotalPunchCount());
            int i = byi.U;
            Application application = ApplicationExtKt.getApplication();
            int i2 = byi.U;
            Integer totalPunchCount = sportValues.getTotalPunchCount();
            Intrinsics.checkNotNull(totalPunchCount);
            int iIntValue = totalPunchCount.intValue();
            Integer totalPunchCount2 = sportValues.getTotalPunchCount();
            Intrinsics.checkNotNull(totalPunchCount2);
            basicList.add(new BasicItemInfo(i, strValueOf, "", 0, null, ResourceExtKt.getQuantityString(application, i2, iIntValue, totalPunchCount2), 24, null));
        }
    }

    public final void addTriathlonChangeDuration(@NotNull SportBasicReport sportBasicReport, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportBasicReport, "sportBasicReport");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        Integer changeDuration = sportBasicReport.getChangeDuration();
        if (changeDuration != null) {
            basicList.add(new BasicItemInfo(j1j.w9, TimeDateUtil.getTimeStrWithSecDef(changeDuration.intValue()), "", 0, null, null, 56, null));
        }
    }

    public final void addTurnCount(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getTurnCount() != null) {
            basicList.add(new BasicItemInfo(j1j.J8, String.valueOf(sportValues.getTurnCount()), "", 0, null, null, 56, null));
        }
    }

    public final void addValidDuration(@NotNull SportBasicReport sportValues, @NotNull List<BasicItemInfo> basicList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(basicList, "basicList");
        if (sportValues.getValidDuration() == null) {
            return;
        }
        Integer validDuration = sportValues.getValidDuration();
        Intrinsics.checkNotNull(validDuration);
        String timeStrWithSecDef = TimeDateUtil.getTimeStrWithSecDef(validDuration.intValue());
        if (TextUtils.isEmpty(timeStrWithSecDef)) {
            return;
        }
        basicList.add(new BasicItemInfo(j1j.H6, timeStrWithSecDef, "", 0, null, null, 56, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @NotNull
    public final Map<SportRecordKey, List<Object>> computeDistanceList(@NotNull SportBasicReport sportBasicReport, @NotNull Map<SportRecordKey, ? extends List<? extends Object>> map, boolean valueFromGpsFile) {
        List<? extends Object> list;
        Intrinsics.checkNotNullParameter(sportBasicReport, "sportBasicReport");
        Intrinsics.checkNotNullParameter(map, "map");
        Map<SportRecordKey, List<Object>> mapAsMutableMap = TypeIntrinsics.asMutableMap(map);
        SportRecordKey sportRecordKey = SportRecordKey.Distance;
        if (map.containsKey(sportRecordKey) && (list = map.get(sportRecordKey)) != null) {
            LongSparseArray longSparseArray = new LongSparseArray();
            if (valueFromGpsFile) {
                long startTime = sportBasicReport.getStartTime();
                long endTime = sportBasicReport.getEndTime();
                List<Object> list2 = mapAsMutableMap.get(SportRecordKey.RecordDetailInfo);
                if (list2 != null) {
                    Iterator<? extends Object> it = list.iterator();
                    while (it.hasNext()) {
                        SportRecordItem sportRecordItem = (SportRecordItem) it.next();
                        longSparseArray.put(sportRecordItem.getEndTime(), sportRecordItem);
                    }
                    SportRecordUtil sportRecordUtil = INSTANCE;
                    sportRecordUtil.expendXAisValue(startTime, endTime, longSparseArray, list2);
                    mapAsMutableMap.put(SportRecordKey.Distance, SportParserUtils.INSTANCE.moveMean(sportRecordUtil.getListFromSparseArray(longSparseArray), 10));
                }
            }
        }
        return mapAsMutableMap;
    }

    public final void computeTriathlonPaceAndSpeed(@NotNull Map<Integer, ? extends Map<SportRecordKey, ? extends List<? extends Object>>> map, @NotNull SportBasicReport mBasicReport) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(mBasicReport, "mBasicReport");
        map.get(10);
        map.get(6);
        Map<SportRecordKey, ? extends List<? extends Object>> map2 = map.get(1);
        if (map2 != null) {
            Map<SportRecordKey, List<Object>> mapAsMutableMap = TypeIntrinsics.asMutableMap(map2);
            SportRecordUtil sportRecordUtil = INSTANCE;
            Integer maxCadence = mBasicReport.getMaxCadence();
            Float fValueOf = maxCadence != null ? Float.valueOf(maxCadence.intValue()) : null;
            Integer minCadence = mBasicReport.getMinCadence();
            sportRecordUtil.computeStepFrequency(mapAsMutableMap, fValueOf, minCadence != null ? Float.valueOf(minCadence.intValue()) : null);
        }
    }

    public final int getMapMarginViewHeight() {
        return (DisplayUtil.getScreenHeight() * 3) / 5;
    }

    public final int getMapMarginViewHeightWithStatueBar() {
        return getMapMarginViewHeight() + DisplayUtil.getStatusBarHeight();
    }

    public final boolean gpsIsInSport(long timeStamp, @NotNull List<SportRecordItem> sportList, int pauseIndex) {
        Intrinsics.checkNotNullParameter(sportList, "sportList");
        if (sportList.isEmpty()) {
            return false;
        }
        int size = sportList.size();
        if (size == 1 || pauseIndex >= size) {
            return true;
        }
        SportRecordItem sportRecordItem = sportList.get(pauseIndex);
        if (timeStamp < sportRecordItem.getStartTime() || timeStamp > sportRecordItem.getEndTime()) {
            return pauseIndex == size - 1 && timeStamp >= Math.max(0L, sportRecordItem.getEndTime());
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object insertIntegerValues(@NotNull GpsValues gpsValues, @NotNull Map<SportRecordKey, List<Object>> map, @Nullable SportBasicReport sportBasicReport, @NotNull Continuation<? super GpsValues> continuation) {
        AnonymousClass1 anonymousClass1;
        Integer distance;
        List<Object> list;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            SportRecordKey sportRecordKey = SportRecordKey.WholeKMPoint;
            if (map.containsKey(sportRecordKey)) {
                FitnessLogUtils.w(TAG, "parse kilometer point from record file");
                if (map.get(sportRecordKey) != null) {
                    List<Object> list2 = map.get(sportRecordKey);
                    Intrinsics.checkNotNull(list2, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.data.common.data.sport.SportRecordItem>");
                    list = list2;
                } else {
                    list = null;
                }
            } else if (sportBasicReport == null || (distance = sportBasicReport.getDistance()) == null || distance.intValue() < 1000) {
                list = null;
            } else {
                FitnessLogUtils.w(TAG, "get kilometer point from GPS File, from record file failed!");
                List<SportRecordItem> integerKilometerPoints = getIntegerKilometerPoints(gpsValues);
                map.put(sportRecordKey, integerKilometerPoints);
                list = integerKilometerPoints;
            }
            if (list != null) {
                anonymousClass1.L$0 = gpsValues;
                anonymousClass1.label = 1;
                if (GpsValuesExKt.addIntegerKilometerPoint(gpsValues, list, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                GpsValues gpsValues2 = (GpsValues) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                return gpsValues2;
            }
            gpsValues = (GpsValues) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        anonymousClass1.L$0 = gpsValues;
        anonymousClass1.label = 2;
        return GpsValuesExKt.smooth(gpsValues, anonymousClass1) == coroutine_suspended ? coroutine_suspended : gpsValues;
    }
}
