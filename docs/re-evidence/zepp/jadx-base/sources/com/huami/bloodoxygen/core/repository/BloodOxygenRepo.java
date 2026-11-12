package com.huami.bloodoxygen.core.repository;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodoxygen.core.local.config.BloodOxygen;
import com.huami.bloodoxygen.core.local.database.BloodOxygenDatabase;
import com.huami.bloodoxygen.core.local.database.entity.ClickMeasuredSpo2;
import com.huami.bloodoxygen.core.local.database.entity.Odi;
import com.huami.bloodoxygen.core.local.database.entity.OriginOsaEvent;
import com.huami.bloodoxygen.core.local.database.entity.OriginOsaProcess;
import com.huami.bloodoxygen.core.local.database.entity.OsaEvent;
import com.huami.bloodoxygen.core.local.database.entity.OsaProcess;
import com.huami.bloodoxygen.core.local.database.entity.SyncLog;
import com.huami.bloodoxygen.core.local.kvkit.KvKey;
import com.huami.bloodoxygen.core.remote.api.event.EventApi;
import com.huami.bloodoxygen.core.remote.api.event.EventItem;
import com.huami.bloodoxygen.core.repository.delegate.impl.DataCacheDelegate;
import com.huami.bloodoxygen.core.repository.delegate.impl.HttpDelegate;
import com.huami.bloodoxygen.core.repository.delegate.impl.database.ClickSpo2Delegate;
import com.huami.bloodoxygen.core.repository.delegate.impl.database.OdiDelegate;
import com.huami.bloodoxygen.core.repository.delegate.impl.database.OriginOsaEventDelegate;
import com.huami.bloodoxygen.core.repository.delegate.impl.database.OriginOsaProcessDelegate;
import com.huami.bloodoxygen.core.repository.delegate.impl.database.OsaEventDelegate;
import com.huami.bloodoxygen.core.repository.delegate.impl.database.OsaProcessDelegate;
import com.huami.bloodoxygen.core.repository.delegate.impl.database.SyncLogDelegate;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.IHttpDelegate;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaEventDelegate;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaProcessDelegate;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.database.ISyncLogDelegate;
import com.huami.tools.log.HMLog;
import com.huami.watch.notification.TransportUri;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u0095\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n:\u0002\u0095\u0001B\u0096\u0001\u0012\u0006\u0010t\u001a\u000205\u0012\u0006\u0010x\u001a\u00020u\u0012\u0006\u0010|\u001a\u00020y\u0012\u0007\u0010\u0080\u0001\u001a\u00020}\u0012\n\b\u0002\u0010\u0082\u0001\u001a\u00030\u0081\u0001\u0012\n\b\u0002\u0010\u0084\u0001\u001a\u00030\u0083\u0001\u0012\n\b\u0002\u0010\u0086\u0001\u001a\u00030\u0085\u0001\u0012\n\b\u0002\u0010\u0088\u0001\u001a\u00030\u0087\u0001\u0012\n\b\u0002\u0010\u008a\u0001\u001a\u00030\u0089\u0001\u0012\n\b\u0002\u0010\u008c\u0001\u001a\u00030\u008b\u0001\u0012\n\b\u0002\u0010\u008e\u0001\u001a\u00030\u008d\u0001\u0012\n\b\u0002\u0010\u0090\u0001\u001a\u00030\u008f\u0001\u0012\n\b\u0002\u0010\u0092\u0001\u001a\u00030\u0091\u0001¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0017\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096\u0001J\t\u0010\u0011\u001a\u00020\u0010H\u0096\u0001J\t\u0010\u0012\u001a\u00020\u0010H\u0096\u0001J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013H\u0096\u0001J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096\u0001J\u0015\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0013H\u0096\u0001J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0096\u0001J%\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0096\u0001J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\fH\u0096\u0001J\u0011\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0013H\u0096\u0001J!\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0096\u0001J\u0011\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0096\u0001J\u0017\u0010\"\u001a\u00020\u000e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000bH\u0096\u0001J\t\u0010#\u001a\u00020\u0010H\u0096\u0001J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013H\u0096\u0001J\u000b\u0010%\u001a\u0004\u0018\u00010\u001eH\u0096\u0001J\u0011\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u0013H\u0096\u0001J\u0013\u0010(\u001a\u0004\u0018\u00010\u001e2\u0006\u0010'\u001a\u00020\u0017H\u0096\u0001J\u0019\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00132\u0006\u0010'\u001a\u00020\u0017H\u0096\u0001J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000bH\u0096\u0001J\u001f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0096\u0001J%\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u000b0\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0096\u0001J\u0019\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00132\u0006\u0010'\u001a\u00020\u0017H\u0096\u0001J\u0017\u00100\u001a\u00020\u000e2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u000bH\u0096\u0001J\t\u00101\u001a\u00020\u0010H\u0096\u0001J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013H\u0096\u0001J\u000b\u00103\u001a\u0004\u0018\u00010.H\u0096\u0001J\u0011\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u0013H\u0096\u0001J\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020.0\u000b2\u0006\u00106\u001a\u000205H\u0096\u0001J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020.0\u000bH\u0096\u0001J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020.0\u000bH\u0096\u0001J\u001f\u0010:\u001a\b\u0012\u0004\u0012\u00020.0\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0096\u0001J%\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u000b0\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0096\u0001J\u0017\u0010<\u001a\u00020\u00102\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u000bH\u0096\u0001J\u0017\u0010?\u001a\u00020\u000e2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u000bH\u0096\u0001J\t\u0010@\u001a\u00020\u0010H\u0096\u0001J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013H\u0096\u0001J\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020=0\u000b2\u0006\u00106\u001a\u000205H\u0096\u0001J\u000f\u0010C\u001a\b\u0012\u0004\u0012\u00020=0\u000bH\u0096\u0001J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020=0\u000bH\u0096\u0001J\u001f\u0010E\u001a\b\u0012\u0004\u0012\u00020=0\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0096\u0001J%\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\u000b0\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0096\u0001J\u0017\u0010G\u001a\u00020\u00102\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u000bH\u0096\u0001J\u0017\u0010I\u001a\u00020\u000e2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020H0\u000bH\u0096\u0001J\u000f\u0010J\u001a\b\u0012\u0004\u0012\u00020H0\u000bH\u0096\u0001J\u0015\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0\u000b0\u0013H\u0096\u0001J\u001f\u0010L\u001a\b\u0012\u0004\u0012\u00020H0\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0096\u0001J\u0017\u0010N\u001a\u00020\u000e2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020M0\u000bH\u0096\u0001J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020M0\u000bH\u0096\u0001J\u0015\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0\u000b0\u0013H\u0096\u0001J\u001f\u0010Q\u001a\b\u0012\u0004\u0012\u00020M0\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0096\u0001J\u0011\u0010T\u001a\u00020\u000e2\u0006\u0010S\u001a\u00020RH\u0096\u0001J\t\u0010U\u001a\u00020\u0010H\u0096\u0001J\u001b\u0010Y\u001a\u0004\u0018\u00010R2\u0006\u0010W\u001a\u00020V2\u0006\u0010X\u001a\u000205H\u0096\u0001J\u0011\u0010Z\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020VH\u0096\u0001J\u001f\u0010]\u001a\u00020\u000e2\u0006\u0010[\u001a\u00020V2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00170\u000bH\u0096\u0001JG\u0010c\u001a\b\u0012\u0004\u0012\u00020b0\u000b2\u0006\u0010\u0018\u001a\u0002052\u0006\u0010\u0019\u001a\u0002052\b\b\u0002\u0010W\u001a\u00020V2\b\b\u0002\u0010^\u001a\u00020\u000e2\b\b\u0002\u0010_\u001a\u00020\u000e2\b\b\u0002\u0010a\u001a\u00020`H\u0096\u0001J\u0017\u0010e\u001a\u00020\u000e2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020b0\u000bH\u0096\u0001J\u001b\u0010f\u001a\u00020\u000e2\u0010\b\u0002\u0010>\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010\u000bH\u0096\u0001J\u001b\u0010g\u001a\u00020\u000e2\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u000bH\u0096\u0001JK\u0010j\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010a\u001a\u00020`2\b\b\u0002\u0010_\u001a\u00020\u000e2\b\b\u0002\u0010^\u001a\u00020\u000e2\b\b\u0002\u0010h\u001a\u00020\u000e2\b\b\u0002\u0010i\u001a\u00020\u000eH\u0096\u0001JQ\u0010k\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010a\u001a\u00020`2\b\b\u0002\u0010_\u001a\u00020\u000e2\b\b\u0002\u0010^\u001a\u00020\u000e2\b\b\u0002\u0010h\u001a\u00020\u000e2\b\b\u0002\u0010i\u001a\u00020\u000eH\u0096\u0001JQ\u0010l\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010a\u001a\u00020`2\b\b\u0002\u0010_\u001a\u00020\u000e2\b\b\u0002\u0010^\u001a\u00020\u000e2\b\b\u0002\u0010h\u001a\u00020\u000e2\b\b\u0002\u0010i\u001a\u00020\u000eH\u0096\u0001JQ\u0010m\u001a\b\u0012\u0004\u0012\u00020=0\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010a\u001a\u00020`2\b\b\u0002\u0010_\u001a\u00020\u000e2\b\b\u0002\u0010^\u001a\u00020\u000e2\b\b\u0002\u0010h\u001a\u00020\u000e2\b\b\u0002\u0010i\u001a\u00020\u000eH\u0096\u0001JQ\u0010n\u001a\b\u0012\u0004\u0012\u00020.0\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010a\u001a\u00020`2\b\b\u0002\u0010_\u001a\u00020\u000e2\b\b\u0002\u0010^\u001a\u00020\u000e2\b\b\u0002\u0010h\u001a\u00020\u000e2\b\b\u0002\u0010i\u001a\u00020\u000eH\u0096\u0001J2\u0010p\u001a\u00020\u000e2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020H0\u000b2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020M0\u000bH\u0016J\b\u0010q\u001a\u00020\u0010H\u0016R\u0016\u0010t\u001a\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010x\u001a\u00020u8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010|\u001a\u00020y8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0017\u0010\u0080\u0001\u001a\u00020}8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007f¨\u0006\u0096\u0001"}, d2 = {"Lcom/huami/bloodoxygen/core/repository/BloodOxygenRepo;", "Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;", "Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/database/IClickSpo2Delegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/database/IOdiDelegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/database/IOsaProcessDelegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/database/IOsaEventDelegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/database/IOriginOsaProcessDelegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/database/IOriginOsaEventDelegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/database/ISyncLogDelegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/IHttpDelegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/IDataCacheDelegate;", "", "Lcom/huami/bloodoxygen/core/local/database/entity/ClickMeasuredSpo2;", "clickSpo2List", "", "addLocalClickSpo2s", "", "clearInvalidClickSpo2", "clearLocalClickSpo2", "Lkotlinx/coroutines/flow/Flow;", "getIfLocalClickSpo2ExistsFlow", "getLocalClickSpo2ShouldUpload", "getLocalClickSpo2ShouldUploadFlow", "", "from", "to", "getLocalClickSpo2s", "getLocalClickSpo2sFlow", "getLocalLatestClickSpo2", "getLocalLatestClickSpo2Flow", "Lcom/huami/bloodoxygen/core/local/database/entity/Odi;", "odi", "addLocalOdi", "odis", "addLocalOdis", "clearLocalOdi", "getIfLocalOdiExistsFlow", "getLocalLatestOdi", "getLocalLatestOdiFlow", "timestamp", "getLocalOdi", "getLocalOdiFlow", "getLocalOdiShouldUpload", "getLocalOdis", "getLocalOdisFlow", "getLocalValidOdiFlow", "Lcom/huami/bloodoxygen/core/local/database/entity/OsaProcess;", "osaProcesses", "addLocalOsaProcesses", "clearLocalOsaProcess", "getIfLocalOsaProcessExistsFlow", "getLocalLatestOsaProcess", "getLocalLatestOsaProcessFlow", "", "sleepDate", "getLocalOsaProcessBySleepDate", "getLocalOsaProcessShouldDelete", "getLocalOsaProcessShouldUpload", "getLocalOsaProcesses", "getLocalOsaProcessesFlow", "removeLocalOsaProcess", "Lcom/huami/bloodoxygen/core/local/database/entity/OsaEvent;", "osaEvents", "addLocalOsaEvents", "clearLocalOsaEvent", "getIfLocalOsaEventExistsFlow", "getLocalOsaEventBySleepDate", "getLocalOsaEventShouldDelete", "getLocalOsaEventShouldUpload", "getLocalOsaEvents", "getLocalOsaEventsFlow", "removeLocalOsaEvent", "Lcom/huami/bloodoxygen/core/local/database/entity/OriginOsaProcess;", "addLocalOriginOsaProcesses", "getLocalOriginOsaProcessShouldUpload", "getLocalOriginOsaProcessShouldUploadFlow", "getLocalOriginOsaProcesses", "Lcom/huami/bloodoxygen/core/local/database/entity/OriginOsaEvent;", "addLocalOriginOsaEvents", "getLocalOriginOsaEventShouldUpload", "getLocalOriginOsaEventShouldUploadFlow", "getLocalOriginOsaEvents", "Lcom/huami/bloodoxygen/core/local/database/entity/SyncLog;", "syncLog", "addSyncLog", "clearSyncLog", "Lcom/huami/bloodoxygen/core/local/config/BloodOxygen$SubType;", "type", "date", "getSyncLog", "ifSyncLogExists", "subType", "timestamps", "deleteEvents", "syncNext", "reverse", "", "limit", "Lcom/huami/bloodoxygen/core/remote/api/event/EventItem;", "getDateEvents", "events", "uploadEvents", "deleteOsaEvents", "deleteOsaProcesses", "direct", "saveSyncLogEvenWhenDirect", "fetchAllTypeData", "fetchClickSpo2", "fetchOdi", "fetchOsaEvent", "fetchOsaProcess", "clickSpo2s", TransportUri.ACTION_ADD, "clear", "a", "Ljava/lang/String;", "userId", "Lcom/huami/bloodoxygen/core/local/database/BloodOxygenDatabase;", "b", "Lcom/huami/bloodoxygen/core/local/database/BloodOxygenDatabase;", "database", "Lcom/huami/bloodoxygen/core/remote/api/event/EventApi;", "c", "Lcom/huami/bloodoxygen/core/remote/api/event/EventApi;", "eventApi", "Lcom/huami/bloodoxygen/core/local/kvkit/KvKey;", GoogleApiAvailabilityLight.a, "Lcom/huami/bloodoxygen/core/local/kvkit/KvKey;", "kvKey", "Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/ClickSpo2Delegate;", "clickSpo2Delegate", "Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/OdiDelegate;", "odiDelegate", "Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/OsaProcessDelegate;", "osaProcessDelegate", "Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/OsaEventDelegate;", "osaEventDelegate", "Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/OriginOsaProcessDelegate;", "originOsaProcessDelegate", "Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/OriginOsaEventDelegate;", "originOsaEventDelegate", "Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/SyncLogDelegate;", "syncLogDelegate", "Lcom/huami/bloodoxygen/core/repository/delegate/impl/HttpDelegate;", "httpDelegate", "Lcom/huami/bloodoxygen/core/repository/delegate/impl/DataCacheDelegate;", "dataCacheDelegate", "<init>", "(Ljava/lang/String;Lcom/huami/bloodoxygen/core/local/database/BloodOxygenDatabase;Lcom/huami/bloodoxygen/core/remote/api/event/EventApi;Lcom/huami/bloodoxygen/core/local/kvkit/KvKey;Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/ClickSpo2Delegate;Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/OdiDelegate;Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/OsaProcessDelegate;Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/OsaEventDelegate;Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/OriginOsaProcessDelegate;Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/OriginOsaEventDelegate;Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/SyncLogDelegate;Lcom/huami/bloodoxygen/core/repository/delegate/impl/HttpDelegate;Lcom/huami/bloodoxygen/core/repository/delegate/impl/DataCacheDelegate;)V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public final class BloodOxygenRepo implements IBloodOxygenRepo, IClickSpo2Delegate, IOdiDelegate, IOsaProcessDelegate, IOsaEventDelegate, IOriginOsaProcessDelegate, IOriginOsaEventDelegate, ISyncLogDelegate, IHttpDelegate, IDataCacheDelegate {

    @NotNull
    private static final String n = "BloodOxygenRepo";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final BloodOxygenDatabase database;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final EventApi eventApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final KvKey kvKey;
    private final /* synthetic */ ClickSpo2Delegate e;
    private final /* synthetic */ OdiDelegate f;
    private final /* synthetic */ OsaProcessDelegate g;
    private final /* synthetic */ OsaEventDelegate h;
    private final /* synthetic */ OriginOsaProcessDelegate i;
    private final /* synthetic */ OriginOsaEventDelegate j;
    private final /* synthetic */ SyncLogDelegate k;
    private final /* synthetic */ HttpDelegate l;
    private final /* synthetic */ DataCacheDelegate m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "add data error " + this.a.getMessage();
        }
    }

    public BloodOxygenRepo(@NotNull String str, @NotNull BloodOxygenDatabase bloodOxygenDatabase, @NotNull EventApi eventApi, @NotNull KvKey kvKey, @NotNull ClickSpo2Delegate clickSpo2Delegate, @NotNull OdiDelegate odiDelegate, @NotNull OsaProcessDelegate osaProcessDelegate, @NotNull OsaEventDelegate osaEventDelegate, @NotNull OriginOsaProcessDelegate originOsaProcessDelegate, @NotNull OriginOsaEventDelegate originOsaEventDelegate, @NotNull SyncLogDelegate syncLogDelegate, @NotNull HttpDelegate httpDelegate, @NotNull DataCacheDelegate dataCacheDelegate) {
        this.userId = str;
        this.database = bloodOxygenDatabase;
        this.eventApi = eventApi;
        this.kvKey = kvKey;
        this.e = clickSpo2Delegate;
        this.f = odiDelegate;
        this.g = osaProcessDelegate;
        this.h = osaEventDelegate;
        this.i = originOsaProcessDelegate;
        this.j = originOsaEventDelegate;
        this.k = syncLogDelegate;
        this.l = httpDelegate;
        this.m = dataCacheDelegate;
    }

    @Override // com.huami.bloodoxygen.core.repository.IBloodOxygenRepo
    public boolean add(@NotNull List<ClickMeasuredSpo2> clickSpo2s, @NotNull List<OriginOsaProcess> osaProcesses, @NotNull List<OriginOsaEvent> osaEvents) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(Boolean.valueOf(addLocalClickSpo2s(clickSpo2s) && addLocalOriginOsaProcesses(osaProcesses) && addLocalOriginOsaEvents(osaEvents)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info(n, new a(thM3848exceptionOrNullimpl));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = bool;
        }
        return ((Boolean) objM3845constructorimpl).booleanValue();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    public boolean addLocalClickSpo2s(@NotNull List<ClickMeasuredSpo2> clickSpo2List) {
        return this.e.addLocalClickSpo2s(clickSpo2List);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    public boolean addLocalOdi(@NotNull Odi odi) {
        return this.f.addLocalOdi(odi);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    public boolean addLocalOdis(@NotNull List<Odi> odis) {
        return this.f.addLocalOdis(odis);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaEventDelegate
    public boolean addLocalOriginOsaEvents(@NotNull List<OriginOsaEvent> osaEvents) {
        return this.j.addLocalOriginOsaEvents(osaEvents);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaProcessDelegate
    public boolean addLocalOriginOsaProcesses(@NotNull List<OriginOsaProcess> osaProcesses) {
        return this.i.addLocalOriginOsaProcesses(osaProcesses);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate
    public boolean addLocalOsaEvents(@NotNull List<OsaEvent> osaEvents) {
        return this.h.addLocalOsaEvents(osaEvents);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    public boolean addLocalOsaProcesses(@NotNull List<OsaProcess> osaProcesses) {
        return this.g.addLocalOsaProcesses(osaProcesses);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.ISyncLogDelegate
    public boolean addSyncLog(@NotNull SyncLog syncLog) {
        return this.k.addSyncLog(syncLog);
    }

    @Override // com.huami.bloodoxygen.core.repository.IBloodOxygenRepo
    public void clear() {
        clearLocalClickSpo2();
        clearSyncLog();
        clearLocalOdi();
        clearLocalOsaEvent();
        clearLocalOsaProcess();
        this.kvKey.clear();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    public void clearInvalidClickSpo2() {
        this.e.clearInvalidClickSpo2();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    public void clearLocalClickSpo2() {
        this.e.clearLocalClickSpo2();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    public void clearLocalOdi() {
        this.f.clearLocalOdi();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate
    public void clearLocalOsaEvent() {
        this.h.clearLocalOsaEvent();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    public void clearLocalOsaProcess() {
        this.g.clearLocalOsaProcess();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.ISyncLogDelegate
    public void clearSyncLog() {
        this.k.clearSyncLog();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IHttpDelegate
    public boolean deleteEvents(@NotNull BloodOxygen.SubType subType, @NotNull List<Long> timestamps) {
        return this.l.deleteEvents(subType, timestamps);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate
    public boolean deleteOsaEvents(@Nullable List<OsaEvent> osaEvents) {
        return this.m.deleteOsaEvents(osaEvents);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate
    public boolean deleteOsaProcesses(@Nullable List<OsaProcess> osaProcesses) {
        return this.m.deleteOsaProcesses(osaProcesses);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate
    public void fetchAllTypeData(long from, long to, int limit, boolean reverse, boolean syncNext, boolean direct, boolean saveSyncLogEvenWhenDirect) {
        this.m.fetchAllTypeData(from, to, limit, reverse, syncNext, direct, saveSyncLogEvenWhenDirect);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate
    @NotNull
    public List<ClickMeasuredSpo2> fetchClickSpo2(long from, long to, int limit, boolean reverse, boolean syncNext, boolean direct, boolean saveSyncLogEvenWhenDirect) {
        return this.m.fetchClickSpo2(from, to, limit, reverse, syncNext, direct, saveSyncLogEvenWhenDirect);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate
    @NotNull
    public List<Odi> fetchOdi(long from, long to, int limit, boolean reverse, boolean syncNext, boolean direct, boolean saveSyncLogEvenWhenDirect) {
        return this.m.fetchOdi(from, to, limit, reverse, syncNext, direct, saveSyncLogEvenWhenDirect);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate
    @NotNull
    public List<OsaEvent> fetchOsaEvent(long from, long to, int limit, boolean reverse, boolean syncNext, boolean direct, boolean saveSyncLogEvenWhenDirect) {
        return this.m.fetchOsaEvent(from, to, limit, reverse, syncNext, direct, saveSyncLogEvenWhenDirect);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate
    @NotNull
    public List<OsaProcess> fetchOsaProcess(long from, long to, int limit, boolean reverse, boolean syncNext, boolean direct, boolean saveSyncLogEvenWhenDirect) {
        return this.m.fetchOsaProcess(from, to, limit, reverse, syncNext, direct, saveSyncLogEvenWhenDirect);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IHttpDelegate
    @NotNull
    public List<EventItem> getDateEvents(@NotNull String from, @NotNull String to, @NotNull BloodOxygen.SubType type, boolean syncNext, boolean reverse, int limit) {
        return this.l.getDateEvents(from, to, type, syncNext, reverse, limit);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    @NotNull
    public Flow<Boolean> getIfLocalClickSpo2ExistsFlow() {
        return this.e.getIfLocalClickSpo2ExistsFlow();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    @NotNull
    public Flow<Boolean> getIfLocalOdiExistsFlow() {
        return this.f.getIfLocalOdiExistsFlow();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate
    @NotNull
    public Flow<Boolean> getIfLocalOsaEventExistsFlow() {
        return this.h.getIfLocalOsaEventExistsFlow();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    @NotNull
    public Flow<Boolean> getIfLocalOsaProcessExistsFlow() {
        return this.g.getIfLocalOsaProcessExistsFlow();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    @NotNull
    public List<ClickMeasuredSpo2> getLocalClickSpo2ShouldUpload() {
        return this.e.getLocalClickSpo2ShouldUpload();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    @NotNull
    public Flow<List<ClickMeasuredSpo2>> getLocalClickSpo2ShouldUploadFlow() {
        return this.e.getLocalClickSpo2ShouldUploadFlow();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    @NotNull
    public List<ClickMeasuredSpo2> getLocalClickSpo2s(long from, long to) {
        return this.e.getLocalClickSpo2s(from, to);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    @NotNull
    public Flow<List<ClickMeasuredSpo2>> getLocalClickSpo2sFlow(long from, long to) {
        return this.e.getLocalClickSpo2sFlow(from, to);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    @Nullable
    public ClickMeasuredSpo2 getLocalLatestClickSpo2() {
        return this.e.getLocalLatestClickSpo2();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    @NotNull
    public Flow<ClickMeasuredSpo2> getLocalLatestClickSpo2Flow() {
        return this.e.getLocalLatestClickSpo2Flow();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    @NotNull
    public Flow<ClickMeasuredSpo2> getLocalLatestClickSpo2Flow(long from, long to) {
        return this.e.getLocalLatestClickSpo2Flow(from, to);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    @Nullable
    public Odi getLocalLatestOdi() {
        return this.f.getLocalLatestOdi();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    @NotNull
    public Flow<Odi> getLocalLatestOdiFlow() {
        return this.f.getLocalLatestOdiFlow();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    @Nullable
    public OsaProcess getLocalLatestOsaProcess() {
        return this.g.getLocalLatestOsaProcess();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    @NotNull
    public Flow<OsaProcess> getLocalLatestOsaProcessFlow() {
        return this.g.getLocalLatestOsaProcessFlow();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    @Nullable
    public Odi getLocalOdi(long timestamp) {
        return this.f.getLocalOdi(timestamp);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    @NotNull
    public Flow<Odi> getLocalOdiFlow(long timestamp) {
        return this.f.getLocalOdiFlow(timestamp);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    @NotNull
    public List<Odi> getLocalOdiShouldUpload() {
        return this.f.getLocalOdiShouldUpload();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    @NotNull
    public List<Odi> getLocalOdis(long from, long to) {
        return this.f.getLocalOdis(from, to);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    @NotNull
    public Flow<List<Odi>> getLocalOdisFlow(long from, long to) {
        return this.f.getLocalOdisFlow(from, to);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaEventDelegate
    @NotNull
    public List<OriginOsaEvent> getLocalOriginOsaEventShouldUpload() {
        return this.j.getLocalOriginOsaEventShouldUpload();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaEventDelegate
    @NotNull
    public Flow<List<OriginOsaEvent>> getLocalOriginOsaEventShouldUploadFlow() {
        return this.j.getLocalOriginOsaEventShouldUploadFlow();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaEventDelegate
    @NotNull
    public List<OriginOsaEvent> getLocalOriginOsaEvents(long from, long to) {
        return this.j.getLocalOriginOsaEvents(from, to);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaProcessDelegate
    @NotNull
    public List<OriginOsaProcess> getLocalOriginOsaProcessShouldUpload() {
        return this.i.getLocalOriginOsaProcessShouldUpload();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaProcessDelegate
    @NotNull
    public Flow<List<OriginOsaProcess>> getLocalOriginOsaProcessShouldUploadFlow() {
        return this.i.getLocalOriginOsaProcessShouldUploadFlow();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaProcessDelegate
    @NotNull
    public List<OriginOsaProcess> getLocalOriginOsaProcesses(long from, long to) {
        return this.i.getLocalOriginOsaProcesses(from, to);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate
    @NotNull
    public List<OsaEvent> getLocalOsaEventBySleepDate(@NotNull String sleepDate) {
        return this.h.getLocalOsaEventBySleepDate(sleepDate);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate
    @NotNull
    public List<OsaEvent> getLocalOsaEventShouldDelete() {
        return this.h.getLocalOsaEventShouldDelete();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate
    @NotNull
    public List<OsaEvent> getLocalOsaEventShouldUpload() {
        return this.h.getLocalOsaEventShouldUpload();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate
    @NotNull
    public List<OsaEvent> getLocalOsaEvents(long from, long to) {
        return this.h.getLocalOsaEvents(from, to);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate
    @NotNull
    public Flow<List<OsaEvent>> getLocalOsaEventsFlow(long from, long to) {
        return this.h.getLocalOsaEventsFlow(from, to);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    @NotNull
    public List<OsaProcess> getLocalOsaProcessBySleepDate(@NotNull String sleepDate) {
        return this.g.getLocalOsaProcessBySleepDate(sleepDate);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    @NotNull
    public List<OsaProcess> getLocalOsaProcessShouldDelete() {
        return this.g.getLocalOsaProcessShouldDelete();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    @NotNull
    public List<OsaProcess> getLocalOsaProcessShouldUpload() {
        return this.g.getLocalOsaProcessShouldUpload();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    @NotNull
    public List<OsaProcess> getLocalOsaProcesses(long from, long to) {
        return this.g.getLocalOsaProcesses(from, to);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    @NotNull
    public Flow<List<OsaProcess>> getLocalOsaProcessesFlow(long from, long to) {
        return this.g.getLocalOsaProcessesFlow(from, to);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    @NotNull
    public Flow<Odi> getLocalValidOdiFlow(long timestamp) {
        return this.f.getLocalValidOdiFlow(timestamp);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.ISyncLogDelegate
    @Nullable
    public SyncLog getSyncLog(@NotNull BloodOxygen.SubType type, @NotNull String date) {
        return this.k.getSyncLog(type, date);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.ISyncLogDelegate
    public boolean ifSyncLogExists(@NotNull BloodOxygen.SubType type) {
        return this.k.ifSyncLogExists(type);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate
    public void removeLocalOsaEvent(@NotNull List<OsaEvent> osaEvents) {
        this.h.removeLocalOsaEvent(osaEvents);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    public void removeLocalOsaProcess(@NotNull List<OsaProcess> osaProcesses) {
        this.g.removeLocalOsaProcess(osaProcesses);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IHttpDelegate
    public boolean uploadEvents(@NotNull List<EventItem> events) {
        return this.l.uploadEvents(events);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BloodOxygenRepo(String str, BloodOxygenDatabase bloodOxygenDatabase, EventApi eventApi, KvKey kvKey, ClickSpo2Delegate clickSpo2Delegate, OdiDelegate odiDelegate, OsaProcessDelegate osaProcessDelegate, OsaEventDelegate osaEventDelegate, OriginOsaProcessDelegate originOsaProcessDelegate, OriginOsaEventDelegate originOsaEventDelegate, SyncLogDelegate syncLogDelegate, HttpDelegate httpDelegate, DataCacheDelegate dataCacheDelegate, int i, DefaultConstructorMarker defaultConstructorMarker) {
        ClickSpo2Delegate clickSpo2Delegate2 = (i & 16) != 0 ? new ClickSpo2Delegate(str, bloodOxygenDatabase.clickMeasureSpo2Dao()) : clickSpo2Delegate;
        OdiDelegate odiDelegate2 = (i & 32) != 0 ? new OdiDelegate(str, bloodOxygenDatabase.odiDao()) : odiDelegate;
        OsaProcessDelegate osaProcessDelegate2 = (i & 64) != 0 ? new OsaProcessDelegate(str, bloodOxygenDatabase.osaProcessDao()) : osaProcessDelegate;
        OsaEventDelegate osaEventDelegate2 = (i & 128) != 0 ? new OsaEventDelegate(str, bloodOxygenDatabase.osaEventDao()) : osaEventDelegate;
        OriginOsaProcessDelegate originOsaProcessDelegate2 = (i & 256) != 0 ? new OriginOsaProcessDelegate(str, bloodOxygenDatabase.originOsaProcessDao()) : originOsaProcessDelegate;
        OriginOsaEventDelegate originOsaEventDelegate2 = (i & 512) != 0 ? new OriginOsaEventDelegate(str, bloodOxygenDatabase.originOsaEventDao()) : originOsaEventDelegate;
        SyncLogDelegate syncLogDelegate2 = (i & 1024) != 0 ? new SyncLogDelegate(str, bloodOxygenDatabase.syncLogDao()) : syncLogDelegate;
        HttpDelegate httpDelegate2 = (i & 2048) != 0 ? new HttpDelegate(eventApi) : httpDelegate;
        this(str, bloodOxygenDatabase, eventApi, kvKey, clickSpo2Delegate2, odiDelegate2, osaProcessDelegate2, osaEventDelegate2, originOsaProcessDelegate2, originOsaEventDelegate2, syncLogDelegate2, httpDelegate2, (i & 4096) != 0 ? new DataCacheDelegate(str, syncLogDelegate2, odiDelegate2, clickSpo2Delegate2, osaProcessDelegate2, osaEventDelegate2, httpDelegate2) : dataCacheDelegate);
    }
}
