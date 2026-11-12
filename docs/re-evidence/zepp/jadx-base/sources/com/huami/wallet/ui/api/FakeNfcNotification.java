package com.huami.wallet.ui.api;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.applet.BusCardExtensions;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.huami.tools.analytics.DbUtils;
import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.BusCardSimple2;
import com.huami.wallet.lib.entity.BusSiteInfo;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.TrafficType;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.activity.BusCardDetailActivity;
import com.huami.wallet.ui.api.FakeNfcNotification;
import com.huami.wallet.ui.repository.BusCardRepo;
import com.huami.wallet.ui.utils.KtUtilsKt;
import com.huami.wallet.ui.utils.MoneyUtils;
import com.xiaomi.hm.health.device.event.StatEvent;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001f\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b \u0010!J,\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J:\u0010\u0016\u001a\u00020\t2\b\b\u0001\u0010\u0013\u001a\u00020\u000b2\b\b\u0001\u0010\u0014\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u000bH\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001f¨\u0006#"}, d2 = {"Lcom/huami/wallet/ui/api/FakeNfcNotification;", "Lcom/huami/wallet/ui/api/NfcNotificationApi;", "", "consumption", StatEvent.SPORT_TP_VALUE_BALANCE, "Lcom/huami/wallet/lib/entity/BusSiteInfo;", "busSiteInfo", "Lcom/huami/wallet/lib/entity/BusCardSimple2;", "busCard", "", "i", "", "trafficType", "e", GoogleApiAvailabilityLight.a, "f", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "c", "hci", "cityCode", "aid", "notifySiteInfo", "Lcom/huami/wallet/lib/api/WalletDataSource;", "a", "Lcom/huami/wallet/lib/api/WalletDataSource;", "walletDataSource", "Lcom/huami/wallet/ui/repository/BusCardRepo;", "b", "Lcom/huami/wallet/ui/repository/BusCardRepo;", "busCardRepo", "Landroid/content/Context;", "<init>", "(Lcom/huami/wallet/lib/api/WalletDataSource;Lcom/huami/wallet/ui/repository/BusCardRepo;Landroid/content/Context;)V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class FakeNfcNotification implements NfcNotificationApi {
    public static final int ALERT_BALANCE = 1000;
    public static final int NOTIFY_ID = 902;
    public static final int NOTIFY_REQUEST_CODE = 1991;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WalletDataSource walletDataSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final BusCardRepo busCardRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    public FakeNfcNotification(@NotNull WalletDataSource walletDataSource, @NotNull BusCardRepo busCardRepo, @NotNull Context context) {
        this.walletDataSource = walletDataSource;
        this.busCardRepo = busCardRepo;
        this.context = context;
    }

    private final void c(Context context) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        NotificationChannel notificationChannel = new NotificationChannel("nfc_trade", context.getString(NfcNotificationApi.INSTANCE.getChannelNameResId().getA().intValue()), 4);
        Object systemService = context.getSystemService(SleepHomeActivity.FROM_NOTIFICATION);
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
    }

    private final String d(int balance) {
        if (balance < 1000) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format(this.context.getString(R.string.wl_nfc_site_info_balance_low), Arrays.copyOf(new Object[]{MoneyUtils.formatCentRMB(balance)}, 1));
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        return String.format(this.context.getString(R.string.wl_nfc_site_info_balance_normal), Arrays.copyOf(new Object[]{MoneyUtils.formatCentRMB(balance)}, 1));
    }

    private final String e(String trafficType, int consumption) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(this.context.getString(R.string.wl_nfc_site_info_title), Arrays.copyOf(new Object[]{f(trafficType), MoneyUtils.formatCentRMB(consumption)}, 2));
    }

    private final String f(String trafficType) {
        int i;
        if (Intrinsics.areEqual(trafficType, TrafficType.SUB_WAY.getType())) {
            i = R.string.wl_nfc_site_info_subway;
        } else if (Intrinsics.areEqual(trafficType, TrafficType.BUS.getType())) {
            i = R.string.wl_nfc_site_info_bus;
        } else if (Intrinsics.areEqual(trafficType, TrafficType.FERRY.getType())) {
            i = R.string.wl_nfc_site_info_ferry;
        } else if (Intrinsics.areEqual(trafficType, TrafficType.BRT.getType())) {
            i = R.string.wl_nfc_site_info_brt;
        } else if (Intrinsics.areEqual(trafficType, TrafficType.BUS_OR_BRT.getType())) {
            i = R.string.wl_nfc_site_info_bus_or_brt;
        } else {
            i = Intrinsics.areEqual(trafficType, TrafficType.CONVENIENCE_STORE.getType()) ? R.string.wl_nfc_site_info_convenience_store : R.string.wl_nfc_site_info_subway;
        }
        return this.context.getString(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(Resource resource) {
        return resource.isSuccessful() && !KtUtilsKt.isNullOrEmpty((List) resource.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BusCardSimple2 h(String str, Resource resource) {
        Object next;
        Iterator it2 = ((Iterable) resource.data).iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (m.equals(BusCardExtensions.fromAid(str).getAppCode(), ((BusCardSimple2) next).id, true)) {
                return (BusCardSimple2) next;
            }
        }
        next = null;
        return (BusCardSimple2) next;
    }

    private final void i(@NotNull int consumption, @NotNull int balance, BusSiteInfo busSiteInfo, BusCardSimple2 busCard) {
        c(this.context);
        Intent intent = new Intent(this.context, (Class<?>) BusCardDetailActivity.class);
        intent.putExtra("EXTRA_EXPAND_CARD_ID", busCard.id);
        intent.putExtra(BusCardDetailActivity.EXTRA_EXPAND_CARD_NAME, busCard.name);
        intent.putExtra("EXTRA_EXPAND_CARD_IMG_URL", busCard.imageUrl);
        intent.putExtra(BusCardDetailActivity.EXTRA_EXPAND_CARD_SHIFTENABLE, busCard.shiftEnable.booleanValue());
        intent.putExtra(BusCardDetailActivity.EXTRA_EXPAND_XIAOMI_CARD_NAME, busCard.xiaomiCardName);
        int i = Build.VERSION.SDK_INT;
        PendingIntent activity = PendingIntent.getActivity(this.context, 1991, intent, i >= 23 ? 335544320 : 268435456);
        Object systemService = this.context.getSystemService(SleepHomeActivity.FROM_NOTIFICATION);
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        NotificationCompat.Builder when = new NotificationCompat.Builder(this.context, "nfc_trade").setContentTitle(e(busSiteInfo.getTrafficType(), consumption)).setContentText(((Object) busSiteInfo.getSiteName()) + '\n' + d(balance)).setContentIntent(activity).setDefaults(1).setWhen(System.currentTimeMillis());
        NfcNotificationApi.Companion companion = NfcNotificationApi.INSTANCE;
        NotificationCompat.Builder autoCancel = when.setSmallIcon(companion.getSmallIconResId().getA().intValue()).setLargeIcon(BitmapFactory.decodeResource(this.context.getResources(), companion.getLargeIconResId().getA().intValue())).setAutoCancel(true);
        if (i >= 21) {
            autoCancel.setColor(ContextCompat.getColor(this.context, companion.getIconColorResId().getA().intValue()));
            autoCancel.setSmallIcon(companion.getSmallIconResId().getA().intValue());
        }
        notificationManager.notify(902, autoCancel.build());
    }

    @Override // com.huami.wallet.ui.api.NfcNotificationApi
    public void notifySiteInfo(@NotNull String hci, @NotNull String cityCode, @NotNull int consumption, @NotNull int balance, @NotNull final String aid) {
        Flowable map;
        BusCardSimple2 busCardSimple2;
        BusSiteInfo busSiteInfo = new BusSiteInfo("SUB_WAY", "汽车西站-十里庙", "OUT", "4");
        Flowable flowableFilter = Flowable.fromPublisher(this.walletDataSource.loadOpenedBusCards()).subscribeOn(Schedulers.io()).filter(new Predicate() { // from class: oz1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return FakeNfcNotification.g((Resource) obj);
            }
        });
        if (flowableFilter == null || (map = flowableFilter.map(new Function() { // from class: nz1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return FakeNfcNotification.h(aid, (Resource) obj);
            }
        })) == null || (busCardSimple2 = (BusCardSimple2) map.blockingFirst()) == null) {
            return;
        }
        i(consumption, balance, busSiteInfo, busCardSimple2);
    }
}
