package com.xiaomi.fitness.electronic.scale.data;

import com.mi.fitness.netproxy.NetProxyComponentKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import defpackage.bx7;
import defpackage.lx7;
import defpackage.rw7;
import defpackage.sw7;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0005\n\u0002\b(\n\u0002\u0010\t\n\u0003\b×\u0001\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 ¦\u00022\u00020\u0001:\u0002¦\u0002B\u009b\u0005\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010\"\u001a\u00020\u0007\u0012\b\b\u0002\u0010#\u001a\u00020\u0007\u0012\b\b\u0002\u0010$\u001a\u00020\u0003\u0012\b\b\u0002\u0010%\u001a\u00020\u001e\u0012\b\b\u0002\u0010&\u001a\u00020\u001e\u0012\b\b\u0002\u0010'\u001a\u00020\u001e\u0012\b\b\u0002\u0010(\u001a\u00020\u001e\u0012\b\b\u0002\u0010)\u001a\u00020\u001e\u0012\b\b\u0002\u0010*\u001a\u00020\u001e\u0012\b\b\u0002\u0010+\u001a\u00020\u001e\u0012\b\b\u0002\u0010,\u001a\u00020\u001e\u0012\b\b\u0002\u0010-\u001a\u00020\u001e\u0012\b\b\u0002\u0010.\u001a\u00020\u001e\u0012\b\b\u0002\u0010/\u001a\u00020\u001e\u0012\b\b\u0002\u00100\u001a\u00020\u001e\u0012\b\b\u0002\u00101\u001a\u00020 \u0012\b\b\u0002\u00102\u001a\u00020 \u0012\b\b\u0002\u00103\u001a\u00020 \u0012\b\b\u0002\u00104\u001a\u00020 \u0012\b\b\u0002\u00105\u001a\u00020 \u0012\b\b\u0002\u00106\u001a\u00020 \u0012\b\b\u0002\u00107\u001a\u00020\u0007\u0012\b\b\u0002\u00108\u001a\u00020\u0007\u0012\b\b\u0002\u00109\u001a\u00020\u0007\u0012\b\b\u0002\u0010:\u001a\u00020\u0003\u0012\b\b\u0002\u0010;\u001a\u00020\u0003\u0012\b\b\u0002\u0010<\u001a\u00020\u0003\u0012\b\b\u0002\u0010=\u001a\u00020\u0003\u0012\b\b\u0002\u0010>\u001a\u00020\u0003\u0012\b\b\u0002\u0010?\u001a\u00020\u0003\u0012\b\b\u0002\u0010@\u001a\u00020\u0003\u0012\b\b\u0002\u0010A\u001a\u00020\u0003\u0012\b\b\u0002\u0010B\u001a\u00020\u0003\u0012\b\b\u0002\u0010C\u001a\u00020\u0003\u0012\b\b\u0002\u0010D\u001a\u00020\u0003\u0012\b\b\u0002\u0010E\u001a\u00020\u0003\u0012\b\b\u0002\u0010F\u001a\u00020\u0005\u0012\b\b\u0002\u0010G\u001a\u00020\u0005\u0012\b\b\u0002\u0010H\u001a\u00020I¢\u0006\u0004\bJ\u0010KJ\u0007\u0010Ü\u0001\u001a\u00020\u0005J\n\u0010Ý\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Þ\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010ß\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010à\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010á\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010â\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010ã\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010ä\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010å\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010æ\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010ç\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010è\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010é\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010ê\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010ë\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010ì\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010í\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010î\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010ï\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010ð\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010ñ\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010ò\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010ó\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010ô\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010õ\u0001\u001a\u00020\u001eHÆ\u0003J\n\u0010ö\u0001\u001a\u00020 HÆ\u0003J\n\u0010÷\u0001\u001a\u00020 HÆ\u0003J\n\u0010ø\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010ù\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010ú\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010û\u0001\u001a\u00020\u001eHÆ\u0003J\n\u0010ü\u0001\u001a\u00020\u001eHÆ\u0003J\n\u0010ý\u0001\u001a\u00020\u001eHÆ\u0003J\n\u0010þ\u0001\u001a\u00020\u001eHÆ\u0003J\n\u0010ÿ\u0001\u001a\u00020\u001eHÆ\u0003J\n\u0010\u0080\u0002\u001a\u00020\u001eHÆ\u0003J\n\u0010\u0081\u0002\u001a\u00020\u001eHÆ\u0003J\n\u0010\u0082\u0002\u001a\u00020\u001eHÆ\u0003J\n\u0010\u0083\u0002\u001a\u00020\u001eHÆ\u0003J\n\u0010\u0084\u0002\u001a\u00020\u001eHÆ\u0003J\n\u0010\u0085\u0002\u001a\u00020\u001eHÆ\u0003J\n\u0010\u0086\u0002\u001a\u00020\u001eHÆ\u0003J\n\u0010\u0087\u0002\u001a\u00020 HÆ\u0003J\n\u0010\u0088\u0002\u001a\u00020 HÆ\u0003J\n\u0010\u0089\u0002\u001a\u00020 HÆ\u0003J\n\u0010\u008a\u0002\u001a\u00020 HÆ\u0003J\n\u0010\u008b\u0002\u001a\u00020 HÆ\u0003J\n\u0010\u008c\u0002\u001a\u00020 HÆ\u0003J\n\u0010\u008d\u0002\u001a\u00020\u0007HÆ\u0003J\n\u0010\u008e\u0002\u001a\u00020\u0007HÆ\u0003J\n\u0010\u008f\u0002\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0090\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0091\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0092\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0093\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0094\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0095\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0096\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0097\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0098\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0099\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009a\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009b\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009c\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010\u009d\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010\u009e\u0002\u001a\u00020IHÆ\u0003J\u009e\u0005\u0010\u009f\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\u00072\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u001e2\b\b\u0002\u0010&\u001a\u00020\u001e2\b\b\u0002\u0010'\u001a\u00020\u001e2\b\b\u0002\u0010(\u001a\u00020\u001e2\b\b\u0002\u0010)\u001a\u00020\u001e2\b\b\u0002\u0010*\u001a\u00020\u001e2\b\b\u0002\u0010+\u001a\u00020\u001e2\b\b\u0002\u0010,\u001a\u00020\u001e2\b\b\u0002\u0010-\u001a\u00020\u001e2\b\b\u0002\u0010.\u001a\u00020\u001e2\b\b\u0002\u0010/\u001a\u00020\u001e2\b\b\u0002\u00100\u001a\u00020\u001e2\b\b\u0002\u00101\u001a\u00020 2\b\b\u0002\u00102\u001a\u00020 2\b\b\u0002\u00103\u001a\u00020 2\b\b\u0002\u00104\u001a\u00020 2\b\b\u0002\u00105\u001a\u00020 2\b\b\u0002\u00106\u001a\u00020 2\b\b\u0002\u00107\u001a\u00020\u00072\b\b\u0002\u00108\u001a\u00020\u00072\b\b\u0002\u00109\u001a\u00020\u00072\b\b\u0002\u0010:\u001a\u00020\u00032\b\b\u0002\u0010;\u001a\u00020\u00032\b\b\u0002\u0010<\u001a\u00020\u00032\b\b\u0002\u0010=\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\u00032\b\b\u0002\u0010?\u001a\u00020\u00032\b\b\u0002\u0010@\u001a\u00020\u00032\b\b\u0002\u0010A\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u00032\b\b\u0002\u0010C\u001a\u00020\u00032\b\b\u0002\u0010D\u001a\u00020\u00032\b\b\u0002\u0010E\u001a\u00020\u00032\b\b\u0002\u0010F\u001a\u00020\u00052\b\b\u0002\u0010G\u001a\u00020\u00052\b\b\u0002\u0010H\u001a\u00020IHÆ\u0001J\u0017\u0010 \u0002\u001a\u00030¡\u00022\n\u0010¢\u0002\u001a\u0005\u0018\u00010£\u0002HÖ\u0003J\n\u0010¤\u0002\u001a\u00020\u0003HÖ\u0001J\n\u0010¥\u0002\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010M\"\u0004\bY\u0010OR\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010U\"\u0004\b[\u0010WR\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010U\"\u0004\b]\u0010WR\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010U\"\u0004\b_\u0010WR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010U\"\u0004\ba\u0010WR\u001a\u0010\r\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010U\"\u0004\bc\u0010WR\u001a\u0010\u000e\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010U\"\u0004\be\u0010WR\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010U\"\u0004\bg\u0010WR\u001a\u0010\u0010\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010U\"\u0004\bi\u0010WR\u001a\u0010\u0011\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010U\"\u0004\bk\u0010WR\u001a\u0010\u0012\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010U\"\u0004\bm\u0010WR\u001a\u0010\u0013\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010U\"\u0004\bo\u0010WR\u001a\u0010\u0014\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010U\"\u0004\bq\u0010WR\u001a\u0010\u0015\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010U\"\u0004\bs\u0010WR\u001a\u0010\u0016\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010U\"\u0004\bu\u0010WR\u001a\u0010\u0017\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010U\"\u0004\bw\u0010WR\u001a\u0010\u0018\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010U\"\u0004\by\u0010WR\u001a\u0010\u0019\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010U\"\u0004\b{\u0010WR\u001a\u0010\u001a\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010U\"\u0004\b}\u0010WR\u001a\u0010\u001b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010U\"\u0004\b\u007f\u0010WR\u001c\u0010\u001c\u001a\u00020\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010U\"\u0005\b\u0081\u0001\u0010WR\u001e\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001e\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001e\u0010!\u001a\u00020 X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008a\u0001\u0010\u0087\u0001\"\u0006\b\u008b\u0001\u0010\u0089\u0001R\u001c\u0010\"\u001a\u00020\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008c\u0001\u0010U\"\u0005\b\u008d\u0001\u0010WR\u001c\u0010#\u001a\u00020\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010U\"\u0005\b\u008f\u0001\u0010WR\u001c\u0010$\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u0010M\"\u0005\b\u0091\u0001\u0010OR\u001e\u0010%\u001a\u00020\u001eX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0092\u0001\u0010\u0083\u0001\"\u0006\b\u0093\u0001\u0010\u0085\u0001R\u001e\u0010&\u001a\u00020\u001eX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0094\u0001\u0010\u0083\u0001\"\u0006\b\u0095\u0001\u0010\u0085\u0001R\u001e\u0010'\u001a\u00020\u001eX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u0083\u0001\"\u0006\b\u0097\u0001\u0010\u0085\u0001R\u001e\u0010(\u001a\u00020\u001eX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0098\u0001\u0010\u0083\u0001\"\u0006\b\u0099\u0001\u0010\u0085\u0001R\u001e\u0010)\u001a\u00020\u001eX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009a\u0001\u0010\u0083\u0001\"\u0006\b\u009b\u0001\u0010\u0085\u0001R\u001e\u0010*\u001a\u00020\u001eX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009c\u0001\u0010\u0083\u0001\"\u0006\b\u009d\u0001\u0010\u0085\u0001R\u001e\u0010+\u001a\u00020\u001eX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009e\u0001\u0010\u0083\u0001\"\u0006\b\u009f\u0001\u0010\u0085\u0001R\u001e\u0010,\u001a\u00020\u001eX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b \u0001\u0010\u0083\u0001\"\u0006\b¡\u0001\u0010\u0085\u0001R\u001e\u0010-\u001a\u00020\u001eX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¢\u0001\u0010\u0083\u0001\"\u0006\b£\u0001\u0010\u0085\u0001R\u001e\u0010.\u001a\u00020\u001eX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¤\u0001\u0010\u0083\u0001\"\u0006\b¥\u0001\u0010\u0085\u0001R\u001e\u0010/\u001a\u00020\u001eX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¦\u0001\u0010\u0083\u0001\"\u0006\b§\u0001\u0010\u0085\u0001R\u001e\u00100\u001a\u00020\u001eX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¨\u0001\u0010\u0083\u0001\"\u0006\b©\u0001\u0010\u0085\u0001R\u001e\u00101\u001a\u00020 X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bª\u0001\u0010\u0087\u0001\"\u0006\b«\u0001\u0010\u0089\u0001R\u001e\u00102\u001a\u00020 X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¬\u0001\u0010\u0087\u0001\"\u0006\b\u00ad\u0001\u0010\u0089\u0001R\u001e\u00103\u001a\u00020 X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b®\u0001\u0010\u0087\u0001\"\u0006\b¯\u0001\u0010\u0089\u0001R\u001e\u00104\u001a\u00020 X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b°\u0001\u0010\u0087\u0001\"\u0006\b±\u0001\u0010\u0089\u0001R\u001e\u00105\u001a\u00020 X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b²\u0001\u0010\u0087\u0001\"\u0006\b³\u0001\u0010\u0089\u0001R\u001e\u00106\u001a\u00020 X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b´\u0001\u0010\u0087\u0001\"\u0006\bµ\u0001\u0010\u0089\u0001R\u001c\u00107\u001a\u00020\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¶\u0001\u0010U\"\u0005\b·\u0001\u0010WR\u001c\u00108\u001a\u00020\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¸\u0001\u0010U\"\u0005\b¹\u0001\u0010WR\u001c\u00109\u001a\u00020\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bº\u0001\u0010U\"\u0005\b»\u0001\u0010WR\u001c\u0010:\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¼\u0001\u0010M\"\u0005\b½\u0001\u0010OR\u001c\u0010;\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¾\u0001\u0010M\"\u0005\b¿\u0001\u0010OR\u001c\u0010<\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÀ\u0001\u0010M\"\u0005\bÁ\u0001\u0010OR\u001c\u0010=\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÂ\u0001\u0010M\"\u0005\bÃ\u0001\u0010OR\u001c\u0010>\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÄ\u0001\u0010M\"\u0005\bÅ\u0001\u0010OR\u001c\u0010?\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÆ\u0001\u0010M\"\u0005\bÇ\u0001\u0010OR\u001c\u0010@\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÈ\u0001\u0010M\"\u0005\bÉ\u0001\u0010OR\u001c\u0010A\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÊ\u0001\u0010M\"\u0005\bË\u0001\u0010OR\u001c\u0010B\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÌ\u0001\u0010M\"\u0005\bÍ\u0001\u0010OR\u001c\u0010C\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÎ\u0001\u0010M\"\u0005\bÏ\u0001\u0010OR\u001c\u0010D\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÐ\u0001\u0010M\"\u0005\bÑ\u0001\u0010OR\u001c\u0010E\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÒ\u0001\u0010M\"\u0005\bÓ\u0001\u0010OR\u001c\u0010F\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÔ\u0001\u0010Q\"\u0005\bÕ\u0001\u0010SR\u001c\u0010G\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÖ\u0001\u0010Q\"\u0005\b×\u0001\u0010SR\u001e\u0010H\u001a\u00020IX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bØ\u0001\u0010Ù\u0001\"\u0006\bÚ\u0001\u0010Û\u0001¨\u0006§\u0002"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "Ljava/io/Serializable;", "version", "", "userId", "", "weight", "", "heartRate", "bfp", "bmi", "slm", "bmc", "bwm", "bwp", "pm", "bfm", "limBmi", "lam", "ram", "llm", "rlm", "tm", "lafm", "rafm", "llfm", "rlfm", "tfm", "bmr", "vfr", "", "ma", "", "sbc", "sbw", "whr", "cin", "lams", "rams", "llms", "rlms", "tms", "lafms", "rafms", "llfms", "rlfms", "tfms", "bt", "bs", "eoma", "eoml", "eomb", "eofa", "eofl", "eofb", "wControl", "mControl", "fControl", "measuringImpedance1", "measuringImpedance2", "measuringImpedance3", "measuringImpedance4", "measuringImpedance5", "measuringImpedance6", "measuringImpedance7", "measuringImpedance8", "measuringImpedance9", "measuringImpedance10", "measuringImpedance11", "measuringImpedance12", "virtualId", "sn", "time", "", "<init>", "(ILjava/lang/String;FIFFFFFFFFFFFFFFFFFFFFSBBFFISSSSSSSSSSSSBBBBBBFFFIIIIIIIIIIIILjava/lang/String;Ljava/lang/String;J)V", "getVersion", "()I", "setVersion", "(I)V", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "getWeight", "()F", "setWeight", "(F)V", "getHeartRate", "setHeartRate", "getBfp", "setBfp", "getBmi", "setBmi", "getSlm", "setSlm", "getBmc", "setBmc", "getBwm", "setBwm", "getBwp", "setBwp", "getPm", "setPm", "getBfm", "setBfm", "getLimBmi", "setLimBmi", "getLam", "setLam", "getRam", "setRam", "getLlm", "setLlm", "getRlm", "setRlm", "getTm", "setTm", "getLafm", "setLafm", "getRafm", "setRafm", "getLlfm", "setLlfm", "getRlfm", "setRlfm", "getTfm", "setTfm", "getBmr", "setBmr", "getVfr", "()S", "setVfr", "(S)V", "getMa", "()B", "setMa", "(B)V", "getSbc", "setSbc", "getSbw", "setSbw", "getWhr", "setWhr", "getCin", "setCin", "getLams", "setLams", "getRams", "setRams", "getLlms", "setLlms", "getRlms", "setRlms", "getTms", "setTms", "getLafms", "setLafms", "getRafms", "setRafms", "getLlfms", "setLlfms", "getRlfms", "setRlfms", "getTfms", "setTfms", "getBt", "setBt", "getBs", "setBs", "getEoma", "setEoma", "getEoml", "setEoml", "getEomb", "setEomb", "getEofa", "setEofa", "getEofl", "setEofl", "getEofb", "setEofb", "getWControl", "setWControl", "getMControl", "setMControl", "getFControl", "setFControl", "getMeasuringImpedance1", "setMeasuringImpedance1", "getMeasuringImpedance2", "setMeasuringImpedance2", "getMeasuringImpedance3", "setMeasuringImpedance3", "getMeasuringImpedance4", "setMeasuringImpedance4", "getMeasuringImpedance5", "setMeasuringImpedance5", "getMeasuringImpedance6", "setMeasuringImpedance6", "getMeasuringImpedance7", "setMeasuringImpedance7", "getMeasuringImpedance8", "setMeasuringImpedance8", "getMeasuringImpedance9", "setMeasuringImpedance9", "getMeasuringImpedance10", "setMeasuringImpedance10", "getMeasuringImpedance11", "setMeasuringImpedance11", "getMeasuringImpedance12", "setMeasuringImpedance12", "getVirtualId", "setVirtualId", "getSn", "setSn", "getTime", "()J", "setTime", "(J)V", "spliceAllProperties", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "copy", "equals", "", "other", "", "hashCode", "toString", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WeightResult implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private float bfm;
    private float bfp;
    private float bmc;
    private float bmi;
    private float bmr;
    private short bs;
    private short bt;
    private float bwm;
    private float bwp;
    private int cin;
    private byte eofa;
    private byte eofb;
    private byte eofl;
    private byte eoma;
    private byte eomb;
    private byte eoml;
    private float fControl;
    private int heartRate;
    private float lafm;
    private short lafms;
    private float lam;
    private short lams;
    private float limBmi;
    private float llfm;
    private short llfms;
    private float llm;
    private short llms;
    private float mControl;
    private byte ma;
    private int measuringImpedance1;
    private int measuringImpedance10;
    private int measuringImpedance11;
    private int measuringImpedance12;
    private int measuringImpedance2;
    private int measuringImpedance3;
    private int measuringImpedance4;
    private int measuringImpedance5;
    private int measuringImpedance6;
    private int measuringImpedance7;
    private int measuringImpedance8;
    private int measuringImpedance9;
    private float pm;
    private float rafm;
    private short rafms;
    private float ram;
    private short rams;
    private float rlfm;
    private short rlfms;
    private float rlm;
    private short rlms;
    private byte sbc;
    private float sbw;
    private float slm;

    @NotNull
    private String sn;
    private float tfm;
    private short tfms;
    private long time;
    private float tm;
    private short tms;

    @NotNull
    private String userId;
    private int version;
    private short vfr;

    @NotNull
    private String virtualId;
    private float wControl;
    private float weight;
    private float whr;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ7\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/data/WeightResult$Companion;", "", "Lrw7;", "bodyComposition", "", "virtualId", "", "weight", "did", "", "time", "Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "bodyCompositionToWeightResult", "(Lrw7;Ljava/lang/String;FLjava/lang/String;J)Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "Lbx7;", "updateHistoryDataToWeightResult", "(Lbx7;Ljava/lang/String;FLjava/lang/String;J)Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "<init>", "()V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ WeightResult bodyCompositionToWeightResult$default(Companion companion, rw7 rw7Var, String str, float f, String str2, long j, int i, Object obj) {
            if ((i & 16) != 0) {
                j = System.currentTimeMillis();
            }
            return companion.bodyCompositionToWeightResult(rw7Var, str, f, str2, j);
        }

        public static /* synthetic */ WeightResult updateHistoryDataToWeightResult$default(Companion companion, bx7 bx7Var, String str, float f, String str2, long j, int i, Object obj) {
            if ((i & 16) != 0) {
                j = System.currentTimeMillis();
            }
            return companion.updateHistoryDataToWeightResult(bx7Var, str, f, str2, j);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x005a  */
        /* JADX WARN: Code duplicated, block: B:85:0x0332  */
        @NotNull
        public final WeightResult bodyCompositionToWeightResult(@Nullable rw7 bodyComposition, @NotNull String virtualId, float weight, @NotNull String did, long time) {
            String str;
            EcoDeviceInfo deviceInfo;
            EcoDeviceInfo deviceInfo2;
            String str2;
            EcoDeviceInfo deviceInfo3;
            EcoDeviceInfo deviceInfo4;
            Intrinsics.checkNotNullParameter(virtualId, "virtualId");
            Intrinsics.checkNotNullParameter(did, "did");
            if (bodyComposition == null) {
                String userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
                EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
                EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion).getDeviceModel(did);
                if (ecoDeviceModel == null || (deviceInfo3 = ecoDeviceModel.getDeviceInfo()) == null || deviceInfo3.getSn() == null) {
                    str2 = "0";
                } else {
                    EcoDeviceModel ecoDeviceModel2 = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion).getDeviceModel(did);
                    String sn = (ecoDeviceModel2 == null || (deviceInfo4 = ecoDeviceModel2.getDeviceInfo()) == null) ? null : deviceInfo4.getSn();
                    if (sn == null) {
                        str2 = "0";
                    } else {
                        str2 = sn;
                    }
                }
                return new WeightResult(1, userId, weight, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (short) 0, (byte) 0, (byte) 0, 0.0f, 0.0f, 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, virtualId, str2, time, -8, Integer.MAX_VALUE, 0, null);
            }
            String userId2 = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
            int i = bodyComposition.f32963k;
            lx7 lx7Var = bodyComposition.j;
            float f = 10;
            float f2 = lx7Var.c / f;
            float f3 = lx7Var.o / f;
            float f4 = lx7Var.d / f;
            float f5 = lx7Var.f / f;
            float f6 = lx7Var.i / f;
            float f7 = lx7Var.e / f;
            float f8 = lx7Var.g / f;
            float f9 = lx7Var.j / f;
            float f10 = lx7Var.m / f;
            float f11 = lx7Var.u / f;
            float f12 = lx7Var.v / f;
            float f13 = lx7Var.w / f;
            float f14 = lx7Var.x / f;
            float f15 = lx7Var.y / f;
            float f16 = lx7Var.J / f;
            float f17 = lx7Var.K / f;
            float f18 = lx7Var.L / f;
            float f19 = lx7Var.M / f;
            float f20 = lx7Var.N / f;
            float f21 = lx7Var.h;
            short s = (short) (((short) lx7Var.l) / 10);
            byte b2 = (byte) (lx7Var.f25514k / 10);
            byte b3 = (byte) (lx7Var.n / 10);
            float f22 = lx7Var.q / f;
            float f23 = lx7Var.s / f;
            int i2 = lx7Var.t;
            short s2 = (short) (((short) lx7Var.E) / 10);
            short s3 = (short) (((short) lx7Var.F) / 10);
            short s4 = (short) (((short) lx7Var.G) / 10);
            short s5 = (short) (((short) lx7Var.H) / 10);
            short s6 = (short) (((short) lx7Var.I) / 10);
            short s7 = (short) (((short) lx7Var.T) / 10);
            short s8 = (short) (((short) lx7Var.U) / 10);
            short s9 = (short) (((short) lx7Var.V) / 10);
            short s10 = (short) (((short) lx7Var.W) / 10);
            short s11 = (short) (((short) lx7Var.X) / 10);
            short s12 = (short) (((short) lx7Var.p) / 10);
            short s13 = (short) (((short) lx7Var.f25515r) / 10);
            byte b4 = (byte) (lx7Var.Y / 10);
            byte b5 = (byte) (lx7Var.Z / 10);
            byte b6 = (byte) (lx7Var.a0 / 10);
            byte b7 = (byte) (lx7Var.b0 / 10);
            byte b8 = (byte) (lx7Var.c0 / 10);
            byte b9 = (byte) (lx7Var.d0 / 10);
            float f24 = ((short) lx7Var.e0) / f;
            float f25 = ((short) lx7Var.g0) / f;
            float f26 = ((short) lx7Var.f0) / f;
            sw7 sw7Var = bodyComposition.h;
            Integer numValueOf = sw7Var != null ? Integer.valueOf(sw7Var.c) : null;
            Intrinsics.checkNotNull(numValueOf);
            int iIntValue = numValueOf.intValue();
            sw7 sw7Var2 = bodyComposition.h;
            Integer numValueOf2 = sw7Var2 != null ? Integer.valueOf(sw7Var2.d) : null;
            Intrinsics.checkNotNull(numValueOf2);
            int iIntValue2 = numValueOf2.intValue();
            sw7 sw7Var3 = bodyComposition.h;
            Integer numValueOf3 = sw7Var3 != null ? Integer.valueOf(sw7Var3.e) : null;
            Intrinsics.checkNotNull(numValueOf3);
            int iIntValue3 = numValueOf3.intValue();
            sw7 sw7Var4 = bodyComposition.h;
            Integer numValueOf4 = sw7Var4 != null ? Integer.valueOf(sw7Var4.f) : null;
            Intrinsics.checkNotNull(numValueOf4);
            int iIntValue4 = numValueOf4.intValue();
            sw7 sw7Var5 = bodyComposition.h;
            Integer numValueOf5 = sw7Var5 != null ? Integer.valueOf(sw7Var5.g) : null;
            Intrinsics.checkNotNull(numValueOf5);
            int iIntValue5 = numValueOf5.intValue();
            sw7 sw7Var6 = bodyComposition.h;
            Integer numValueOf6 = sw7Var6 != null ? Integer.valueOf(sw7Var6.h) : null;
            Intrinsics.checkNotNull(numValueOf6);
            int iIntValue6 = numValueOf6.intValue();
            sw7 sw7Var7 = bodyComposition.i;
            Integer numValueOf7 = sw7Var7 != null ? Integer.valueOf(sw7Var7.c) : null;
            Intrinsics.checkNotNull(numValueOf7);
            int iIntValue7 = numValueOf7.intValue();
            sw7 sw7Var8 = bodyComposition.i;
            Integer numValueOf8 = sw7Var8 != null ? Integer.valueOf(sw7Var8.d) : null;
            Intrinsics.checkNotNull(numValueOf8);
            int iIntValue8 = numValueOf8.intValue();
            sw7 sw7Var9 = bodyComposition.i;
            Integer numValueOf9 = sw7Var9 != null ? Integer.valueOf(sw7Var9.e) : null;
            Intrinsics.checkNotNull(numValueOf9);
            int iIntValue9 = numValueOf9.intValue();
            sw7 sw7Var10 = bodyComposition.i;
            Integer numValueOf10 = sw7Var10 != null ? Integer.valueOf(sw7Var10.f) : null;
            Intrinsics.checkNotNull(numValueOf10);
            int iIntValue10 = numValueOf10.intValue();
            sw7 sw7Var11 = bodyComposition.i;
            Integer numValueOf11 = sw7Var11 != null ? Integer.valueOf(sw7Var11.g) : null;
            Intrinsics.checkNotNull(numValueOf11);
            int iIntValue11 = numValueOf11.intValue();
            sw7 sw7Var12 = bodyComposition.i;
            Integer numValueOf12 = sw7Var12 != null ? Integer.valueOf(sw7Var12.h) : null;
            Intrinsics.checkNotNull(numValueOf12);
            int iIntValue12 = numValueOf12.intValue();
            EcoDeviceManager.Companion companion2 = EcoDeviceManager.INSTANCE;
            EcoDeviceModel ecoDeviceModel3 = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion2).getDeviceModel(did);
            if (ecoDeviceModel3 == null || (deviceInfo = ecoDeviceModel3.getDeviceInfo()) == null || deviceInfo.getSn() == null) {
                str = "0";
            } else {
                EcoDeviceModel ecoDeviceModel4 = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion2).getDeviceModel(did);
                String sn2 = (ecoDeviceModel4 == null || (deviceInfo2 = ecoDeviceModel4.getDeviceInfo()) == null) ? null : deviceInfo2.getSn();
                if (sn2 == null) {
                    str = "0";
                } else {
                    str = sn2;
                }
            }
            return new WeightResult(1, userId2, weight, i, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, s, b2, b3, f22, f23, i2, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, b4, b5, b6, b7, b8, b9, f24, f25, f26, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, iIntValue7, iIntValue8, iIntValue9, iIntValue10, iIntValue11, iIntValue12, virtualId, str, time);
        }

        /* JADX WARN: Code duplicated, block: B:64:0x0266  */
        @NotNull
        public final WeightResult updateHistoryDataToWeightResult(@NotNull bx7 bodyComposition, @NotNull String virtualId, float weight, @NotNull String did, long time) {
            String str;
            EcoDeviceInfo deviceInfo;
            EcoDeviceInfo deviceInfo2;
            Intrinsics.checkNotNullParameter(bodyComposition, "bodyComposition");
            Intrinsics.checkNotNullParameter(virtualId, "virtualId");
            Intrinsics.checkNotNullParameter(did, "did");
            String userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
            int i = bodyComposition.l;
            lx7 lx7Var = bodyComposition.j;
            float f = 10;
            float f2 = lx7Var.c / f;
            float f3 = lx7Var.o / f;
            float f4 = lx7Var.d / f;
            float f5 = lx7Var.f / f;
            float f6 = lx7Var.i / f;
            float f7 = lx7Var.e / f;
            float f8 = lx7Var.g / f;
            float f9 = lx7Var.j / f;
            float f10 = lx7Var.m / f;
            float f11 = lx7Var.u / f;
            float f12 = lx7Var.v / f;
            float f13 = lx7Var.w / f;
            float f14 = lx7Var.x / f;
            float f15 = lx7Var.y / f;
            float f16 = lx7Var.J / f;
            float f17 = lx7Var.K / f;
            float f18 = lx7Var.L / f;
            float f19 = lx7Var.M / f;
            float f20 = lx7Var.N / f;
            float f21 = lx7Var.h;
            short s = (short) (((short) lx7Var.l) / 10);
            byte b2 = (byte) (lx7Var.f25514k / 10);
            byte b3 = (byte) (lx7Var.n / 10);
            float f22 = lx7Var.q / f;
            float f23 = lx7Var.s / f;
            int i2 = lx7Var.t;
            short s2 = (short) (((short) lx7Var.E) / 10);
            short s3 = (short) (((short) lx7Var.F) / 10);
            short s4 = (short) (((short) lx7Var.G) / 10);
            short s5 = (short) (((short) lx7Var.H) / 10);
            short s6 = (short) (((short) lx7Var.I) / 10);
            short s7 = (short) (((short) lx7Var.T) / 10);
            short s8 = (short) (((short) lx7Var.U) / 10);
            short s9 = (short) (((short) lx7Var.V) / 10);
            short s10 = (short) (((short) lx7Var.W) / 10);
            short s11 = (short) (((short) lx7Var.X) / 10);
            short s12 = (short) (((short) lx7Var.p) / 10);
            short s13 = (short) (((short) lx7Var.f25515r) / 10);
            byte b4 = (byte) (lx7Var.Y / 10);
            byte b5 = (byte) (lx7Var.Z / 10);
            byte b6 = (byte) (lx7Var.a0 / 10);
            byte b7 = (byte) (lx7Var.b0 / 10);
            byte b8 = (byte) (lx7Var.c0 / 10);
            byte b9 = (byte) (lx7Var.d0 / 10);
            float f24 = ((short) lx7Var.e0) / f;
            float f25 = ((short) lx7Var.g0) / f;
            float f26 = ((short) lx7Var.f0) / f;
            sw7 sw7Var = bodyComposition.h;
            String sn = null;
            Integer numValueOf = sw7Var != null ? Integer.valueOf(sw7Var.c) : null;
            Intrinsics.checkNotNull(numValueOf);
            int iIntValue = numValueOf.intValue();
            sw7 sw7Var2 = bodyComposition.h;
            Integer numValueOf2 = sw7Var2 != null ? Integer.valueOf(sw7Var2.d) : null;
            Intrinsics.checkNotNull(numValueOf2);
            int iIntValue2 = numValueOf2.intValue();
            sw7 sw7Var3 = bodyComposition.h;
            Integer numValueOf3 = sw7Var3 != null ? Integer.valueOf(sw7Var3.e) : null;
            Intrinsics.checkNotNull(numValueOf3);
            int iIntValue3 = numValueOf3.intValue();
            sw7 sw7Var4 = bodyComposition.h;
            Integer numValueOf4 = sw7Var4 != null ? Integer.valueOf(sw7Var4.f) : null;
            Intrinsics.checkNotNull(numValueOf4);
            int iIntValue4 = numValueOf4.intValue();
            sw7 sw7Var5 = bodyComposition.h;
            Integer numValueOf5 = sw7Var5 != null ? Integer.valueOf(sw7Var5.g) : null;
            Intrinsics.checkNotNull(numValueOf5);
            int iIntValue5 = numValueOf5.intValue();
            sw7 sw7Var6 = bodyComposition.h;
            Integer numValueOf6 = sw7Var6 != null ? Integer.valueOf(sw7Var6.h) : null;
            Intrinsics.checkNotNull(numValueOf6);
            int iIntValue6 = numValueOf6.intValue();
            sw7 sw7Var7 = bodyComposition.i;
            Integer numValueOf7 = sw7Var7 != null ? Integer.valueOf(sw7Var7.c) : null;
            Intrinsics.checkNotNull(numValueOf7);
            int iIntValue7 = numValueOf7.intValue();
            sw7 sw7Var8 = bodyComposition.i;
            Integer numValueOf8 = sw7Var8 != null ? Integer.valueOf(sw7Var8.d) : null;
            Intrinsics.checkNotNull(numValueOf8);
            int iIntValue8 = numValueOf8.intValue();
            sw7 sw7Var9 = bodyComposition.i;
            Integer numValueOf9 = sw7Var9 != null ? Integer.valueOf(sw7Var9.e) : null;
            Intrinsics.checkNotNull(numValueOf9);
            int iIntValue9 = numValueOf9.intValue();
            sw7 sw7Var10 = bodyComposition.i;
            Integer numValueOf10 = sw7Var10 != null ? Integer.valueOf(sw7Var10.f) : null;
            Intrinsics.checkNotNull(numValueOf10);
            int iIntValue10 = numValueOf10.intValue();
            sw7 sw7Var11 = bodyComposition.i;
            Integer numValueOf11 = sw7Var11 != null ? Integer.valueOf(sw7Var11.g) : null;
            Intrinsics.checkNotNull(numValueOf11);
            int iIntValue11 = numValueOf11.intValue();
            sw7 sw7Var12 = bodyComposition.i;
            Integer numValueOf12 = sw7Var12 != null ? Integer.valueOf(sw7Var12.h) : null;
            Intrinsics.checkNotNull(numValueOf12);
            int iIntValue12 = numValueOf12.intValue();
            EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
            EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion).getDeviceModel(did);
            if (ecoDeviceModel == null || (deviceInfo = ecoDeviceModel.getDeviceInfo()) == null || deviceInfo.getSn() == null) {
                str = "0";
            } else {
                EcoDeviceModel ecoDeviceModel2 = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion).getDeviceModel(did);
                if (ecoDeviceModel2 != null && (deviceInfo2 = ecoDeviceModel2.getDeviceInfo()) != null) {
                    sn = deviceInfo2.getSn();
                }
                if (sn == null) {
                    str = "0";
                } else {
                    str = sn;
                }
            }
            return new WeightResult(1, userId, weight, i, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, s, b2, b3, f22, f23, i2, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, b4, b5, b6, b7, b8, b9, f24, f25, f26, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, iIntValue7, iIntValue8, iIntValue9, iIntValue10, iIntValue11, iIntValue12, virtualId, str, time);
        }
    }

    public WeightResult() {
        this(0, null, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (short) 0, (byte) 0, (byte) 0, 0.0f, 0.0f, 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0L, -1, -1, 3, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final float getBwp() {
        return this.bwp;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final float getPm() {
        return this.pm;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final float getBfm() {
        return this.bfm;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final float getLimBmi() {
        return this.limBmi;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final float getLam() {
        return this.lam;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final float getRam() {
        return this.ram;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final float getLlm() {
        return this.llm;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final float getRlm() {
        return this.rlm;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final float getTm() {
        return this.tm;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final float getLafm() {
        return this.lafm;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final float getRafm() {
        return this.rafm;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final float getLlfm() {
        return this.llfm;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final float getRlfm() {
        return this.rlfm;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final float getTfm() {
        return this.tfm;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final float getBmr() {
        return this.bmr;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final short getVfr() {
        return this.vfr;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final byte getMa() {
        return this.ma;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final byte getSbc() {
        return this.sbc;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final float getSbw() {
        return this.sbw;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final float getWhr() {
        return this.whr;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final int getCin() {
        return this.cin;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final short getLams() {
        return this.lams;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final short getRams() {
        return this.rams;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final short getLlms() {
        return this.llms;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final short getRlms() {
        return this.rlms;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final short getTms() {
        return this.tms;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final short getLafms() {
        return this.lafms;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final short getRafms() {
        return this.rafms;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final short getLlfms() {
        return this.llfms;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final short getRlfms() {
        return this.rlfms;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getHeartRate() {
        return this.heartRate;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final short getTfms() {
        return this.tfms;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final short getBt() {
        return this.bt;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final short getBs() {
        return this.bs;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final byte getEoma() {
        return this.eoma;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final byte getEoml() {
        return this.eoml;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final byte getEomb() {
        return this.eomb;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final byte getEofa() {
        return this.eofa;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final byte getEofl() {
        return this.eofl;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final byte getEofb() {
        return this.eofb;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final float getWControl() {
        return this.wControl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getBfp() {
        return this.bfp;
    }

    /* JADX INFO: renamed from: component50, reason: from getter */
    public final float getMControl() {
        return this.mControl;
    }

    /* JADX INFO: renamed from: component51, reason: from getter */
    public final float getFControl() {
        return this.fControl;
    }

    /* JADX INFO: renamed from: component52, reason: from getter */
    public final int getMeasuringImpedance1() {
        return this.measuringImpedance1;
    }

    /* JADX INFO: renamed from: component53, reason: from getter */
    public final int getMeasuringImpedance2() {
        return this.measuringImpedance2;
    }

    /* JADX INFO: renamed from: component54, reason: from getter */
    public final int getMeasuringImpedance3() {
        return this.measuringImpedance3;
    }

    /* JADX INFO: renamed from: component55, reason: from getter */
    public final int getMeasuringImpedance4() {
        return this.measuringImpedance4;
    }

    /* JADX INFO: renamed from: component56, reason: from getter */
    public final int getMeasuringImpedance5() {
        return this.measuringImpedance5;
    }

    /* JADX INFO: renamed from: component57, reason: from getter */
    public final int getMeasuringImpedance6() {
        return this.measuringImpedance6;
    }

    /* JADX INFO: renamed from: component58, reason: from getter */
    public final int getMeasuringImpedance7() {
        return this.measuringImpedance7;
    }

    /* JADX INFO: renamed from: component59, reason: from getter */
    public final int getMeasuringImpedance8() {
        return this.measuringImpedance8;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getBmi() {
        return this.bmi;
    }

    /* JADX INFO: renamed from: component60, reason: from getter */
    public final int getMeasuringImpedance9() {
        return this.measuringImpedance9;
    }

    /* JADX INFO: renamed from: component61, reason: from getter */
    public final int getMeasuringImpedance10() {
        return this.measuringImpedance10;
    }

    /* JADX INFO: renamed from: component62, reason: from getter */
    public final int getMeasuringImpedance11() {
        return this.measuringImpedance11;
    }

    /* JADX INFO: renamed from: component63, reason: from getter */
    public final int getMeasuringImpedance12() {
        return this.measuringImpedance12;
    }

    @NotNull
    /* JADX INFO: renamed from: component64, reason: from getter */
    public final String getVirtualId() {
        return this.virtualId;
    }

    @NotNull
    /* JADX INFO: renamed from: component65, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    /* JADX INFO: renamed from: component66, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getSlm() {
        return this.slm;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final float getBmc() {
        return this.bmc;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final float getBwm() {
        return this.bwm;
    }

    @NotNull
    public final WeightResult copy(int version, @NotNull String userId, float weight, int heartRate, float bfp, float bmi, float slm, float bmc, float bwm, float bwp, float pm, float bfm, float limBmi, float lam, float ram, float llm, float rlm, float tm, float lafm, float rafm, float llfm, float rlfm, float tfm, float bmr, short vfr, byte ma, byte sbc, float sbw, float whr, int cin, short lams, short rams, short llms, short rlms, short tms, short lafms, short rafms, short llfms, short rlfms, short tfms, short bt, short bs, byte eoma, byte eoml, byte eomb, byte eofa, byte eofl, byte eofb, float wControl, float mControl, float fControl, int measuringImpedance1, int measuringImpedance2, int measuringImpedance3, int measuringImpedance4, int measuringImpedance5, int measuringImpedance6, int measuringImpedance7, int measuringImpedance8, int measuringImpedance9, int measuringImpedance10, int measuringImpedance11, int measuringImpedance12, @NotNull String virtualId, @NotNull String sn, long time) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(virtualId, "virtualId");
        Intrinsics.checkNotNullParameter(sn, "sn");
        return new WeightResult(version, userId, weight, heartRate, bfp, bmi, slm, bmc, bwm, bwp, pm, bfm, limBmi, lam, ram, llm, rlm, tm, lafm, rafm, llfm, rlfm, tfm, bmr, vfr, ma, sbc, sbw, whr, cin, lams, rams, llms, rlms, tms, lafms, rafms, llfms, rlfms, tfms, bt, bs, eoma, eoml, eomb, eofa, eofl, eofb, wControl, mControl, fControl, measuringImpedance1, measuringImpedance2, measuringImpedance3, measuringImpedance4, measuringImpedance5, measuringImpedance6, measuringImpedance7, measuringImpedance8, measuringImpedance9, measuringImpedance10, measuringImpedance11, measuringImpedance12, virtualId, sn, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeightResult)) {
            return false;
        }
        WeightResult weightResult = (WeightResult) other;
        return this.version == weightResult.version && Intrinsics.areEqual(this.userId, weightResult.userId) && Float.compare(this.weight, weightResult.weight) == 0 && this.heartRate == weightResult.heartRate && Float.compare(this.bfp, weightResult.bfp) == 0 && Float.compare(this.bmi, weightResult.bmi) == 0 && Float.compare(this.slm, weightResult.slm) == 0 && Float.compare(this.bmc, weightResult.bmc) == 0 && Float.compare(this.bwm, weightResult.bwm) == 0 && Float.compare(this.bwp, weightResult.bwp) == 0 && Float.compare(this.pm, weightResult.pm) == 0 && Float.compare(this.bfm, weightResult.bfm) == 0 && Float.compare(this.limBmi, weightResult.limBmi) == 0 && Float.compare(this.lam, weightResult.lam) == 0 && Float.compare(this.ram, weightResult.ram) == 0 && Float.compare(this.llm, weightResult.llm) == 0 && Float.compare(this.rlm, weightResult.rlm) == 0 && Float.compare(this.tm, weightResult.tm) == 0 && Float.compare(this.lafm, weightResult.lafm) == 0 && Float.compare(this.rafm, weightResult.rafm) == 0 && Float.compare(this.llfm, weightResult.llfm) == 0 && Float.compare(this.rlfm, weightResult.rlfm) == 0 && Float.compare(this.tfm, weightResult.tfm) == 0 && Float.compare(this.bmr, weightResult.bmr) == 0 && this.vfr == weightResult.vfr && this.ma == weightResult.ma && this.sbc == weightResult.sbc && Float.compare(this.sbw, weightResult.sbw) == 0 && Float.compare(this.whr, weightResult.whr) == 0 && this.cin == weightResult.cin && this.lams == weightResult.lams && this.rams == weightResult.rams && this.llms == weightResult.llms && this.rlms == weightResult.rlms && this.tms == weightResult.tms && this.lafms == weightResult.lafms && this.rafms == weightResult.rafms && this.llfms == weightResult.llfms && this.rlfms == weightResult.rlfms && this.tfms == weightResult.tfms && this.bt == weightResult.bt && this.bs == weightResult.bs && this.eoma == weightResult.eoma && this.eoml == weightResult.eoml && this.eomb == weightResult.eomb && this.eofa == weightResult.eofa && this.eofl == weightResult.eofl && this.eofb == weightResult.eofb && Float.compare(this.wControl, weightResult.wControl) == 0 && Float.compare(this.mControl, weightResult.mControl) == 0 && Float.compare(this.fControl, weightResult.fControl) == 0 && this.measuringImpedance1 == weightResult.measuringImpedance1 && this.measuringImpedance2 == weightResult.measuringImpedance2 && this.measuringImpedance3 == weightResult.measuringImpedance3 && this.measuringImpedance4 == weightResult.measuringImpedance4 && this.measuringImpedance5 == weightResult.measuringImpedance5 && this.measuringImpedance6 == weightResult.measuringImpedance6 && this.measuringImpedance7 == weightResult.measuringImpedance7 && this.measuringImpedance8 == weightResult.measuringImpedance8 && this.measuringImpedance9 == weightResult.measuringImpedance9 && this.measuringImpedance10 == weightResult.measuringImpedance10 && this.measuringImpedance11 == weightResult.measuringImpedance11 && this.measuringImpedance12 == weightResult.measuringImpedance12 && Intrinsics.areEqual(this.virtualId, weightResult.virtualId) && Intrinsics.areEqual(this.sn, weightResult.sn) && this.time == weightResult.time;
    }

    public final float getBfm() {
        return this.bfm;
    }

    public final float getBfp() {
        return this.bfp;
    }

    public final float getBmc() {
        return this.bmc;
    }

    public final float getBmi() {
        return this.bmi;
    }

    public final float getBmr() {
        return this.bmr;
    }

    public final short getBs() {
        return this.bs;
    }

    public final short getBt() {
        return this.bt;
    }

    public final float getBwm() {
        return this.bwm;
    }

    public final float getBwp() {
        return this.bwp;
    }

    public final int getCin() {
        return this.cin;
    }

    public final byte getEofa() {
        return this.eofa;
    }

    public final byte getEofb() {
        return this.eofb;
    }

    public final byte getEofl() {
        return this.eofl;
    }

    public final byte getEoma() {
        return this.eoma;
    }

    public final byte getEomb() {
        return this.eomb;
    }

    public final byte getEoml() {
        return this.eoml;
    }

    public final float getFControl() {
        return this.fControl;
    }

    public final int getHeartRate() {
        return this.heartRate;
    }

    public final float getLafm() {
        return this.lafm;
    }

    public final short getLafms() {
        return this.lafms;
    }

    public final float getLam() {
        return this.lam;
    }

    public final short getLams() {
        return this.lams;
    }

    public final float getLimBmi() {
        return this.limBmi;
    }

    public final float getLlfm() {
        return this.llfm;
    }

    public final short getLlfms() {
        return this.llfms;
    }

    public final float getLlm() {
        return this.llm;
    }

    public final short getLlms() {
        return this.llms;
    }

    public final float getMControl() {
        return this.mControl;
    }

    public final byte getMa() {
        return this.ma;
    }

    public final int getMeasuringImpedance1() {
        return this.measuringImpedance1;
    }

    public final int getMeasuringImpedance10() {
        return this.measuringImpedance10;
    }

    public final int getMeasuringImpedance11() {
        return this.measuringImpedance11;
    }

    public final int getMeasuringImpedance12() {
        return this.measuringImpedance12;
    }

    public final int getMeasuringImpedance2() {
        return this.measuringImpedance2;
    }

    public final int getMeasuringImpedance3() {
        return this.measuringImpedance3;
    }

    public final int getMeasuringImpedance4() {
        return this.measuringImpedance4;
    }

    public final int getMeasuringImpedance5() {
        return this.measuringImpedance5;
    }

    public final int getMeasuringImpedance6() {
        return this.measuringImpedance6;
    }

    public final int getMeasuringImpedance7() {
        return this.measuringImpedance7;
    }

    public final int getMeasuringImpedance8() {
        return this.measuringImpedance8;
    }

    public final int getMeasuringImpedance9() {
        return this.measuringImpedance9;
    }

    public final float getPm() {
        return this.pm;
    }

    public final float getRafm() {
        return this.rafm;
    }

    public final short getRafms() {
        return this.rafms;
    }

    public final float getRam() {
        return this.ram;
    }

    public final short getRams() {
        return this.rams;
    }

    public final float getRlfm() {
        return this.rlfm;
    }

    public final short getRlfms() {
        return this.rlfms;
    }

    public final float getRlm() {
        return this.rlm;
    }

    public final short getRlms() {
        return this.rlms;
    }

    public final byte getSbc() {
        return this.sbc;
    }

    public final float getSbw() {
        return this.sbw;
    }

    public final float getSlm() {
        return this.slm;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    public final float getTfm() {
        return this.tfm;
    }

    public final short getTfms() {
        return this.tfms;
    }

    public final long getTime() {
        return this.time;
    }

    public final float getTm() {
        return this.tm;
    }

    public final short getTms() {
        return this.tms;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public final int getVersion() {
        return this.version;
    }

    public final short getVfr() {
        return this.vfr;
    }

    @NotNull
    public final String getVirtualId() {
        return this.virtualId;
    }

    public final float getWControl() {
        return this.wControl;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final float getWhr() {
        return this.whr;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.version) * 31) + this.userId.hashCode()) * 31) + Float.hashCode(this.weight)) * 31) + Integer.hashCode(this.heartRate)) * 31) + Float.hashCode(this.bfp)) * 31) + Float.hashCode(this.bmi)) * 31) + Float.hashCode(this.slm)) * 31) + Float.hashCode(this.bmc)) * 31) + Float.hashCode(this.bwm)) * 31) + Float.hashCode(this.bwp)) * 31) + Float.hashCode(this.pm)) * 31) + Float.hashCode(this.bfm)) * 31) + Float.hashCode(this.limBmi)) * 31) + Float.hashCode(this.lam)) * 31) + Float.hashCode(this.ram)) * 31) + Float.hashCode(this.llm)) * 31) + Float.hashCode(this.rlm)) * 31) + Float.hashCode(this.tm)) * 31) + Float.hashCode(this.lafm)) * 31) + Float.hashCode(this.rafm)) * 31) + Float.hashCode(this.llfm)) * 31) + Float.hashCode(this.rlfm)) * 31) + Float.hashCode(this.tfm)) * 31) + Float.hashCode(this.bmr)) * 31) + Short.hashCode(this.vfr)) * 31) + Byte.hashCode(this.ma)) * 31) + Byte.hashCode(this.sbc)) * 31) + Float.hashCode(this.sbw)) * 31) + Float.hashCode(this.whr)) * 31) + Integer.hashCode(this.cin)) * 31) + Short.hashCode(this.lams)) * 31) + Short.hashCode(this.rams)) * 31) + Short.hashCode(this.llms)) * 31) + Short.hashCode(this.rlms)) * 31) + Short.hashCode(this.tms)) * 31) + Short.hashCode(this.lafms)) * 31) + Short.hashCode(this.rafms)) * 31) + Short.hashCode(this.llfms)) * 31) + Short.hashCode(this.rlfms)) * 31) + Short.hashCode(this.tfms)) * 31) + Short.hashCode(this.bt)) * 31) + Short.hashCode(this.bs)) * 31) + Byte.hashCode(this.eoma)) * 31) + Byte.hashCode(this.eoml)) * 31) + Byte.hashCode(this.eomb)) * 31) + Byte.hashCode(this.eofa)) * 31) + Byte.hashCode(this.eofl)) * 31) + Byte.hashCode(this.eofb)) * 31) + Float.hashCode(this.wControl)) * 31) + Float.hashCode(this.mControl)) * 31) + Float.hashCode(this.fControl)) * 31) + Integer.hashCode(this.measuringImpedance1)) * 31) + Integer.hashCode(this.measuringImpedance2)) * 31) + Integer.hashCode(this.measuringImpedance3)) * 31) + Integer.hashCode(this.measuringImpedance4)) * 31) + Integer.hashCode(this.measuringImpedance5)) * 31) + Integer.hashCode(this.measuringImpedance6)) * 31) + Integer.hashCode(this.measuringImpedance7)) * 31) + Integer.hashCode(this.measuringImpedance8)) * 31) + Integer.hashCode(this.measuringImpedance9)) * 31) + Integer.hashCode(this.measuringImpedance10)) * 31) + Integer.hashCode(this.measuringImpedance11)) * 31) + Integer.hashCode(this.measuringImpedance12)) * 31) + this.virtualId.hashCode()) * 31) + this.sn.hashCode()) * 31) + Long.hashCode(this.time);
    }

    public final void setBfm(float f) {
        this.bfm = f;
    }

    public final void setBfp(float f) {
        this.bfp = f;
    }

    public final void setBmc(float f) {
        this.bmc = f;
    }

    public final void setBmi(float f) {
        this.bmi = f;
    }

    public final void setBmr(float f) {
        this.bmr = f;
    }

    public final void setBs(short s) {
        this.bs = s;
    }

    public final void setBt(short s) {
        this.bt = s;
    }

    public final void setBwm(float f) {
        this.bwm = f;
    }

    public final void setBwp(float f) {
        this.bwp = f;
    }

    public final void setCin(int i) {
        this.cin = i;
    }

    public final void setEofa(byte b2) {
        this.eofa = b2;
    }

    public final void setEofb(byte b2) {
        this.eofb = b2;
    }

    public final void setEofl(byte b2) {
        this.eofl = b2;
    }

    public final void setEoma(byte b2) {
        this.eoma = b2;
    }

    public final void setEomb(byte b2) {
        this.eomb = b2;
    }

    public final void setEoml(byte b2) {
        this.eoml = b2;
    }

    public final void setFControl(float f) {
        this.fControl = f;
    }

    public final void setHeartRate(int i) {
        this.heartRate = i;
    }

    public final void setLafm(float f) {
        this.lafm = f;
    }

    public final void setLafms(short s) {
        this.lafms = s;
    }

    public final void setLam(float f) {
        this.lam = f;
    }

    public final void setLams(short s) {
        this.lams = s;
    }

    public final void setLimBmi(float f) {
        this.limBmi = f;
    }

    public final void setLlfm(float f) {
        this.llfm = f;
    }

    public final void setLlfms(short s) {
        this.llfms = s;
    }

    public final void setLlm(float f) {
        this.llm = f;
    }

    public final void setLlms(short s) {
        this.llms = s;
    }

    public final void setMControl(float f) {
        this.mControl = f;
    }

    public final void setMa(byte b2) {
        this.ma = b2;
    }

    public final void setMeasuringImpedance1(int i) {
        this.measuringImpedance1 = i;
    }

    public final void setMeasuringImpedance10(int i) {
        this.measuringImpedance10 = i;
    }

    public final void setMeasuringImpedance11(int i) {
        this.measuringImpedance11 = i;
    }

    public final void setMeasuringImpedance12(int i) {
        this.measuringImpedance12 = i;
    }

    public final void setMeasuringImpedance2(int i) {
        this.measuringImpedance2 = i;
    }

    public final void setMeasuringImpedance3(int i) {
        this.measuringImpedance3 = i;
    }

    public final void setMeasuringImpedance4(int i) {
        this.measuringImpedance4 = i;
    }

    public final void setMeasuringImpedance5(int i) {
        this.measuringImpedance5 = i;
    }

    public final void setMeasuringImpedance6(int i) {
        this.measuringImpedance6 = i;
    }

    public final void setMeasuringImpedance7(int i) {
        this.measuringImpedance7 = i;
    }

    public final void setMeasuringImpedance8(int i) {
        this.measuringImpedance8 = i;
    }

    public final void setMeasuringImpedance9(int i) {
        this.measuringImpedance9 = i;
    }

    public final void setPm(float f) {
        this.pm = f;
    }

    public final void setRafm(float f) {
        this.rafm = f;
    }

    public final void setRafms(short s) {
        this.rafms = s;
    }

    public final void setRam(float f) {
        this.ram = f;
    }

    public final void setRams(short s) {
        this.rams = s;
    }

    public final void setRlfm(float f) {
        this.rlfm = f;
    }

    public final void setRlfms(short s) {
        this.rlfms = s;
    }

    public final void setRlm(float f) {
        this.rlm = f;
    }

    public final void setRlms(short s) {
        this.rlms = s;
    }

    public final void setSbc(byte b2) {
        this.sbc = b2;
    }

    public final void setSbw(float f) {
        this.sbw = f;
    }

    public final void setSlm(float f) {
        this.slm = f;
    }

    public final void setSn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sn = str;
    }

    public final void setTfm(float f) {
        this.tfm = f;
    }

    public final void setTfms(short s) {
        this.tfms = s;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setTm(float f) {
        this.tm = f;
    }

    public final void setTms(short s) {
        this.tms = s;
    }

    public final void setUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    public final void setVfr(short s) {
        this.vfr = s;
    }

    public final void setVirtualId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.virtualId = str;
    }

    public final void setWControl(float f) {
        this.wControl = f;
    }

    public final void setWeight(float f) {
        this.weight = f;
    }

    public final void setWhr(float f) {
        this.whr = f;
    }

    @NotNull
    public final String spliceAllProperties() {
        int i = this.version;
        String str = this.userId;
        float f = this.weight;
        int i2 = this.heartRate;
        float f2 = this.bfp;
        float f3 = this.bmi;
        float f4 = this.slm;
        float f5 = this.bmc;
        float f6 = this.bwm;
        float f7 = this.bwp;
        float f8 = this.pm;
        float f9 = this.bfm;
        float f10 = this.limBmi;
        float f11 = this.lam;
        float f12 = this.ram;
        float f13 = this.llm;
        float f14 = this.rlm;
        float f15 = this.tm;
        float f16 = this.lafm;
        float f17 = this.rafm;
        float f18 = this.llfm;
        float f19 = this.rlfm;
        float f20 = this.tfm;
        float f21 = this.bmr;
        short s = this.vfr;
        byte b2 = this.ma;
        byte b3 = this.sbc;
        float f22 = this.sbw;
        float f23 = this.whr;
        int i3 = this.cin;
        short s2 = this.lams;
        short s3 = this.rams;
        short s4 = this.llms;
        short s5 = this.rlms;
        short s6 = this.tms;
        short s7 = this.lafms;
        short s8 = this.rafms;
        short s9 = this.llfms;
        short s10 = this.rlfms;
        short s11 = this.tfms;
        short s12 = this.bt;
        short s13 = this.bs;
        byte b4 = this.eoma;
        byte b5 = this.eoml;
        byte b6 = this.eomb;
        byte b7 = this.eofa;
        byte b8 = this.eofl;
        byte b9 = this.eofb;
        return i + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + str + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + f + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + i2 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + f2 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + f3 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + f4 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + f5 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + f6 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + f7 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + f8 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + f9 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + f10 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + f11 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + f12 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + f13 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + f14 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + f15 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + f16 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + f17 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + f18 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + f19 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + f20 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + f21 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + ((int) s) + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + ((int) b2) + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + ((int) b3) + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + f22 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + f23 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + i3 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + ((int) s2) + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + ((int) s3) + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + ((int) s4) + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + ((int) s5) + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + ((int) s6) + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + ((int) s7) + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + ((int) s8) + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + ((int) s9) + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + ((int) s10) + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + ((int) s11) + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + ((int) s12) + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + ((int) s13) + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + ((int) b4) + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + ((int) b5) + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + ((int) b6) + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + ((int) b7) + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + ((int) b8) + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + ((int) b9) + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + this.wControl + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + this.mControl + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + this.fControl + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + this.measuringImpedance1 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + this.measuringImpedance2 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + this.measuringImpedance3 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + this.measuringImpedance4 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + this.measuringImpedance5 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + this.measuringImpedance6 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + this.measuringImpedance7 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + this.measuringImpedance8 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + this.measuringImpedance9 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + this.measuringImpedance10 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + this.measuringImpedance11 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + this.measuringImpedance12 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + this.virtualId + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + this.sn;
    }

    @NotNull
    public String toString() {
        int i = this.version;
        String str = this.userId;
        float f = this.weight;
        int i2 = this.heartRate;
        float f2 = this.bfp;
        float f3 = this.bmi;
        float f4 = this.slm;
        float f5 = this.bmc;
        float f6 = this.bwm;
        float f7 = this.bwp;
        float f8 = this.pm;
        float f9 = this.bfm;
        float f10 = this.limBmi;
        float f11 = this.lam;
        float f12 = this.ram;
        float f13 = this.llm;
        float f14 = this.rlm;
        float f15 = this.tm;
        float f16 = this.lafm;
        float f17 = this.rafm;
        float f18 = this.llfm;
        float f19 = this.rlfm;
        float f20 = this.tfm;
        float f21 = this.bmr;
        short s = this.vfr;
        byte b2 = this.ma;
        byte b3 = this.sbc;
        float f22 = this.sbw;
        float f23 = this.whr;
        int i3 = this.cin;
        short s2 = this.lams;
        short s3 = this.rams;
        short s4 = this.llms;
        short s5 = this.rlms;
        short s6 = this.tms;
        short s7 = this.lafms;
        short s8 = this.rafms;
        short s9 = this.llfms;
        short s10 = this.rlfms;
        short s11 = this.tfms;
        short s12 = this.bt;
        short s13 = this.bs;
        byte b4 = this.eoma;
        byte b5 = this.eoml;
        byte b6 = this.eomb;
        byte b7 = this.eofa;
        byte b8 = this.eofl;
        byte b9 = this.eofb;
        return "WeightResult(version=" + i + ", userId=" + str + ", weight=" + f + ", heartRate=" + i2 + ", bfp=" + f2 + ", bmi=" + f3 + ", slm=" + f4 + ", bmc=" + f5 + ", bwm=" + f6 + ", bwp=" + f7 + ", pm=" + f8 + ", bfm=" + f9 + ", limBmi=" + f10 + ", lam=" + f11 + ", ram=" + f12 + ", llm=" + f13 + ", rlm=" + f14 + ", tm=" + f15 + ", lafm=" + f16 + ", rafm=" + f17 + ", llfm=" + f18 + ", rlfm=" + f19 + ", tfm=" + f20 + ", bmr=" + f21 + ", vfr=" + ((int) s) + ", ma=" + ((int) b2) + ", sbc=" + ((int) b3) + ", sbw=" + f22 + ", whr=" + f23 + ", cin=" + i3 + ", lams=" + ((int) s2) + ", rams=" + ((int) s3) + ", llms=" + ((int) s4) + ", rlms=" + ((int) s5) + ", tms=" + ((int) s6) + ", lafms=" + ((int) s7) + ", rafms=" + ((int) s8) + ", llfms=" + ((int) s9) + ", rlfms=" + ((int) s10) + ", tfms=" + ((int) s11) + ", bt=" + ((int) s12) + ", bs=" + ((int) s13) + ", eoma=" + ((int) b4) + ", eoml=" + ((int) b5) + ", eomb=" + ((int) b6) + ", eofa=" + ((int) b7) + ", eofl=" + ((int) b8) + ", eofb=" + ((int) b9) + ", wControl=" + this.wControl + ", mControl=" + this.mControl + ", fControl=" + this.fControl + ", measuringImpedance1=" + this.measuringImpedance1 + ", measuringImpedance2=" + this.measuringImpedance2 + ", measuringImpedance3=" + this.measuringImpedance3 + ", measuringImpedance4=" + this.measuringImpedance4 + ", measuringImpedance5=" + this.measuringImpedance5 + ", measuringImpedance6=" + this.measuringImpedance6 + ", measuringImpedance7=" + this.measuringImpedance7 + ", measuringImpedance8=" + this.measuringImpedance8 + ", measuringImpedance9=" + this.measuringImpedance9 + ", measuringImpedance10=" + this.measuringImpedance10 + ", measuringImpedance11=" + this.measuringImpedance11 + ", measuringImpedance12=" + this.measuringImpedance12 + ", virtualId=" + this.virtualId + ", sn=" + this.sn + ", time=" + this.time + ")";
    }

    public WeightResult(int i, @NotNull String userId, float f, int i2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, short s, byte b2, byte b3, float f22, float f23, int i3, short s2, short s3, short s4, short s5, short s6, short s7, short s8, short s9, short s10, short s11, short s12, short s13, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, float f24, float f25, float f26, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, @NotNull String virtualId, @NotNull String sn, long j) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(virtualId, "virtualId");
        Intrinsics.checkNotNullParameter(sn, "sn");
        this.version = i;
        this.userId = userId;
        this.weight = f;
        this.heartRate = i2;
        this.bfp = f2;
        this.bmi = f3;
        this.slm = f4;
        this.bmc = f5;
        this.bwm = f6;
        this.bwp = f7;
        this.pm = f8;
        this.bfm = f9;
        this.limBmi = f10;
        this.lam = f11;
        this.ram = f12;
        this.llm = f13;
        this.rlm = f14;
        this.tm = f15;
        this.lafm = f16;
        this.rafm = f17;
        this.llfm = f18;
        this.rlfm = f19;
        this.tfm = f20;
        this.bmr = f21;
        this.vfr = s;
        this.ma = b2;
        this.sbc = b3;
        this.sbw = f22;
        this.whr = f23;
        this.cin = i3;
        this.lams = s2;
        this.rams = s3;
        this.llms = s4;
        this.rlms = s5;
        this.tms = s6;
        this.lafms = s7;
        this.rafms = s8;
        this.llfms = s9;
        this.rlfms = s10;
        this.tfms = s11;
        this.bt = s12;
        this.bs = s13;
        this.eoma = b4;
        this.eoml = b5;
        this.eomb = b6;
        this.eofa = b7;
        this.eofl = b8;
        this.eofb = b9;
        this.wControl = f24;
        this.mControl = f25;
        this.fControl = f26;
        this.measuringImpedance1 = i4;
        this.measuringImpedance2 = i5;
        this.measuringImpedance3 = i6;
        this.measuringImpedance4 = i7;
        this.measuringImpedance5 = i8;
        this.measuringImpedance6 = i9;
        this.measuringImpedance7 = i10;
        this.measuringImpedance8 = i11;
        this.measuringImpedance9 = i12;
        this.measuringImpedance10 = i13;
        this.measuringImpedance11 = i14;
        this.measuringImpedance12 = i15;
        this.virtualId = virtualId;
        this.sn = sn;
        this.time = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WeightResult(int i, String str, float f, int i2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, short s, byte b2, byte b3, float f22, float f23, int i3, short s2, short s3, short s4, short s5, short s6, short s7, short s8, short s9, short s10, short s11, short s12, short s13, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, float f24, float f25, float f26, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, String str2, String str3, long j, int i16, int i17, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        String str4 = "";
        this((i16 & 1) != 0 ? 0 : i, (i16 & 2) != 0 ? "" : str, (i16 & 4) != 0 ? 0.0f : f, (i16 & 8) != 0 ? 0 : i2, (i16 & 16) != 0 ? 0.0f : f2, (i16 & 32) != 0 ? 0.0f : f3, (i16 & 64) != 0 ? 0.0f : f4, (i16 & 128) != 0 ? 0.0f : f5, (i16 & 256) != 0 ? 0.0f : f6, (i16 & 512) != 0 ? 0.0f : f7, (i16 & 1024) != 0 ? 0.0f : f8, (i16 & 2048) != 0 ? 0.0f : f9, (i16 & 4096) != 0 ? 0.0f : f10, (i16 & 8192) != 0 ? 0.0f : f11, (i16 & 16384) != 0 ? 0.0f : f12, (i16 & 32768) != 0 ? 0.0f : f13, (i16 & 65536) != 0 ? 0.0f : f14, (i16 & 131072) != 0 ? 0.0f : f15, (i16 & 262144) != 0 ? 0.0f : f16, (i16 & 524288) != 0 ? 0.0f : f17, (i16 & EventRecurrence.TH) != 0 ? 0.0f : f18, (i16 & 2097152) != 0 ? 0.0f : f19, (i16 & 4194304) != 0 ? 0.0f : f20, (i16 & NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY) != 0 ? 0.0f : f21, (i16 & 16777216) != 0 ? (short) 0 : s, (i16 & 33554432) != 0 ? (byte) 0 : b2, (i16 & 67108864) != 0 ? (byte) 0 : b3, (i16 & 134217728) != 0 ? 0.0f : f22, (i16 & 268435456) != 0 ? 0.0f : f23, (i16 & 536870912) != 0 ? 0 : i3, (i16 & 1073741824) != 0 ? (short) 0 : s2, (i16 & Integer.MIN_VALUE) != 0 ? (short) 0 : s3, (i17 & 1) != 0 ? (short) 0 : s4, (i17 & 2) != 0 ? (short) 0 : s5, (i17 & 4) != 0 ? (short) 0 : s6, (i17 & 8) != 0 ? (short) 0 : s7, (i17 & 16) != 0 ? (short) 0 : s8, (i17 & 32) != 0 ? (short) 0 : s9, (i17 & 64) != 0 ? (short) 0 : s10, (i17 & 128) != 0 ? (short) 0 : s11, (i17 & 256) != 0 ? (short) 0 : s12, (i17 & 512) != 0 ? (short) 0 : s13, (i17 & 1024) != 0 ? (byte) 0 : b4, (i17 & 2048) != 0 ? (byte) 0 : b5, (i17 & 4096) != 0 ? (byte) 0 : b6, (i17 & 8192) != 0 ? (byte) 0 : b7, (i17 & 16384) != 0 ? (byte) 0 : b8, (i17 & 32768) != 0 ? (byte) 0 : b9, (i17 & 65536) != 0 ? 0.0f : f24, (i17 & 131072) != 0 ? 0.0f : f25, (i17 & 262144) != 0 ? 0.0f : f26, (i17 & 524288) != 0 ? 0 : i4, (i17 & EventRecurrence.TH) != 0 ? 0 : i5, (i17 & 2097152) != 0 ? 0 : i6, (i17 & 4194304) != 0 ? 0 : i7, (i17 & NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY) != 0 ? 0 : i8, (i17 & 16777216) != 0 ? 0 : i9, (i17 & 33554432) != 0 ? 0 : i10, (i17 & 67108864) != 0 ? 0 : i11, (i17 & 134217728) != 0 ? 0 : i12, (i17 & 268435456) != 0 ? 0 : i13, (i17 & 536870912) != 0 ? 0 : i14, (i17 & 1073741824) != 0 ? 0 : i15, (i17 & Integer.MIN_VALUE) != 0 ? str4 : str2, (i18 & 1) == 0 ? str3 : "", (i18 & 2) != 0 ? System.currentTimeMillis() : j);
    }
}
