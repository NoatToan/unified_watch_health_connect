package com.huami.device.feature.notification.appnotify;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.feature.notification.module.INotificationModule;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0007J'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00042\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\f\u0010\u0014\u001a\u00020\u0004*\u00020\u000bH\u0007J\b\u0010\u0015\u001a\u00020\u0011H\u0007J\b\u0010\u0016\u001a\u00020\u0011H\u0007J\u0006\u0010\u0017\u001a\u00020\bJ\u0016\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u001d\u0010\u0019\u001a\u00020\u00022\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\bR\u0016\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0016\u0010#\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0016\u0010$\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u001d¨\u0006)"}, d2 = {"Lcom/huami/device/feature/notification/appnotify/LinkageNotificationCenter;", "", "", "c", "", "linkageNotifications", GoogleApiAvailabilityLight.a, "b", "", "id", "deleteAlertOnPhone", "Landroid/service/notification/StatusBarNotification;", "sbn", "handleNotificationRemoved", "key", "", "sbns", "", "a", "(Ljava/lang/String;[Landroid/service/notification/StatusBarNotification;)Z", "getNotificationKey", "useNotificationKey", "supportLinkageNotification", "getAvailableId", "saveKeyId", "initIdKeyMap", "([Landroid/service/notification/StatusBarNotification;)V", "uniqueId", "TAG", "Ljava/lang/String;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "idKeyMap", LogUtil.I, "DIGIT_0", "DIGIT_1", "DIGIT_2", "e", "KEY_LINKAGE_NOTIFICATIONS", "<init>", "()V", "notification_release"}, k = 1, mv = {1, 5, 1})
public final class LinkageNotificationCenter {

    @NotNull
    public static final LinkageNotificationCenter INSTANCE;

    @NotNull
    public static final String TAG = "LinkageNotificationCenter";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final ConcurrentHashMap<Integer, String> idKeyMap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int DIGIT_0 = 0;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int DIGIT_1 = 1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final int DIGIT_2 = 2;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_LINKAGE_NOTIFICATIONS = "KEY_LINKAGE_NOTIFICATION";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("notification config: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ NumberFormatException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(NumberFormatException numberFormatException) {
            super(0);
            this.a = numberFormatException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("parse id exception: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("key not found for id: ", Integer.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("delete id on phone: ", Integer.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "deleteAlertOnPhone, listener is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getLocalizedMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ Map.Entry<Integer, String> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Map.Entry<Integer, String> entry) {
            super(0);
            this.a = entry;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "notification to be delete, id: " + this.a.getKey().intValue() + ", key: " + this.a.getValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, int i) {
            super(0);
            this.a = str;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "save notification key: " + this.a + ", id: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("linked notifications: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "setLinkageNotifications, listener is null";
        }
    }

    static {
        LinkageNotificationCenter linkageNotificationCenter = new LinkageNotificationCenter();
        INSTANCE = linkageNotificationCenter;
        idKeyMap = new ConcurrentHashMap<>();
        String strB = linkageNotificationCenter.b();
        HMLog.info(TAG, new a(strB));
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        Iterator it2 = StringsKt__StringsKt.split$default((CharSequence) strB, new String[]{";"}, false, 0, 6, (Object) null).iterator();
        while (it2.hasNext()) {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) it2.next(), new String[]{","}, false, 0, 6, (Object) null);
            if (listSplit$default.size() == 2) {
                try {
                    int iIntValue = Integer.valueOf((String) listSplit$default.get(0)).intValue();
                    idKeyMap.put(Integer.valueOf(iIntValue), (String) listSplit$default.get(1));
                } catch (NumberFormatException e2) {
                    HMLog.info(TAG, new b(e2));
                }
            }
        }
    }

    private LinkageNotificationCenter() {
    }

    private final boolean a(String key, StatusBarNotification[] sbns) {
        if (sbns != null) {
            for (StatusBarNotification statusBarNotification : sbns) {
                if (Intrinsics.areEqual(getNotificationKey(statusBarNotification), key)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final String b() {
        SharedPreferences sharedPreferences;
        INotificationModule listener = NotificationManager.getInstance().getListener();
        if (listener == null || (sharedPreferences = listener.getSharedPreferences()) == null) {
            return null;
        }
        return sharedPreferences.getString(KEY_LINKAGE_NOTIFICATIONS, "");
    }

    private final void c() {
        ConcurrentHashMap<Integer, String> concurrentHashMap = idKeyMap;
        if (concurrentHashMap.isEmpty()) {
            d("");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, String> entry : concurrentHashMap.entrySet()) {
            sb.append(entry.getKey().intValue() + ',' + entry.getValue() + ';');
        }
        d(sb.toString());
    }

    private final void d(String linkageNotifications) {
        HMLog.info(TAG, new i(linkageNotifications));
        INotificationModule listener = NotificationManager.getInstance().getListener();
        if (listener == null) {
            listener = null;
        } else {
            SharedPreferences.Editor editorEdit = listener.getSharedPreferences().edit();
            editorEdit.putString(KEY_LINKAGE_NOTIFICATIONS, linkageNotifications);
            editorEdit.apply();
        }
        if (listener == null) {
            HMLog.info(TAG, j.a);
        }
    }

    @JvmStatic
    public static final void deleteAlertOnPhone(int id) {
        ConcurrentHashMap<Integer, String> concurrentHashMap = idKeyMap;
        String str = concurrentHashMap.get(Integer.valueOf(id));
        if (TextUtils.isEmpty(str)) {
            HMLog.info(TAG, new c(id));
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, String> entry : concurrentHashMap.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if (Intrinsics.areEqual(entry.getValue(), str)) {
                arrayList.add(Integer.valueOf(iIntValue));
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            idKeyMap.remove(Integer.valueOf(((Number) it2.next()).intValue()));
        }
        LinkageNotificationCenter linkageNotificationCenter = INSTANCE;
        HMLog.info(TAG, new d(id));
        linkageNotificationCenter.c();
        INotificationModule listener = NotificationManager.getInstance().getListener();
        if (listener == null) {
            listener = null;
        } else {
            Intent intent = new Intent(NotificationListener.ACTION_NOTIFICATION);
            intent.putExtra(NotificationListener.EXTRA_WHAT, 0);
            intent.putExtra(NotificationListener.EXTRA_NOTIFICATION_KEY, str);
            LocalBroadcastManager.getInstance(listener.context()).sendBroadcast(intent);
        }
        if (listener == null) {
            HMLog.info(TAG, e.a);
        }
    }

    @JvmStatic
    @NotNull
    public static final String getNotificationKey(@NotNull StatusBarNotification statusBarNotification) {
        if (useNotificationKey()) {
            return statusBarNotification.getKey();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.isEmpty(statusBarNotification.getPackageName()) ? "null" : statusBarNotification.getPackageName());
        sb.append(AESEncryptionHelper.SEPARATOR);
        sb.append(TextUtils.isEmpty(statusBarNotification.getTag()) ? "null" : statusBarNotification.getTag());
        sb.append(AESEncryptionHelper.SEPARATOR);
        sb.append(statusBarNotification.getId());
        sb.append(AESEncryptionHelper.SEPARATOR);
        return sb.toString();
    }

    @JvmStatic
    public static final void handleNotificationRemoved(@NotNull StatusBarNotification sbn) {
        String notificationKey = getNotificationKey(sbn);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, String> entry : idKeyMap.entrySet()) {
            if (Intrinsics.areEqual(entry.getValue(), notificationKey)) {
                HMLog.info(TAG, new g(entry));
                arrayList.add(entry.getKey());
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            idKeyMap.remove(Integer.valueOf(iIntValue));
            BusinessProcessing.INSTANCE.deleteFromDevice(iIntValue);
        }
    }

    @JvmStatic
    public static final boolean supportLinkageNotification() {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        INotificationModule listener = NotificationManager.getInstance().getListener();
        return listener == null ? false : listener.hasFeatureLinkageNotification();
    }

    @JvmStatic
    public static final boolean useNotificationKey() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public final int getAvailableId() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap<Integer, String> concurrentHashMap = idKeyMap;
        if (concurrentHashMap.size() == 0) {
            return 0;
        }
        try {
            if (concurrentHashMap.keySet().size() == 1) {
                arrayList.addAll(concurrentHashMap.keySet());
            } else {
                arrayList.addAll(CollectionsKt___CollectionsKt.sortedWith(concurrentHashMap.keySet(), new Comparator() { // from class: com.huami.device.feature.notification.appnotify.LinkageNotificationCenter$getAvailableId$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues((Integer) t, (Integer) t2);
                    }
                }));
            }
            if (arrayList.size() == 0 || ((Number) arrayList.get(0)).intValue() > 0) {
                return 0;
            }
        } catch (Exception e2) {
            HMLog.info(TAG, new f(e2));
        }
        int size = arrayList.size();
        if (1 < size) {
            int i2 = 1;
            while (true) {
                int i3 = i2 + 1;
                int iIntValue = ((Number) arrayList.get(i2 - 1)).intValue();
                if (((Number) arrayList.get(i2)).intValue() - iIntValue > 1) {
                    return iIntValue + 1;
                }
                if (i3 < size) {
                    i2 = i3;
                }
            }
        }
        return ((Number) CollectionsKt.last((List) arrayList)).intValue() + 1;
    }

    public final void initIdKeyMap(@Nullable StatusBarNotification[] sbns) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, String> entry : idKeyMap.entrySet()) {
            if (!INSTANCE.a(entry.getValue(), sbns)) {
                arrayList.add(entry.getKey());
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            idKeyMap.remove(Integer.valueOf(((Number) it2.next()).intValue()));
        }
    }

    public final void saveKeyId(@NotNull String key, int id) {
        HMLog.info(TAG, new h(key, id));
        if (TextUtils.isEmpty(key)) {
            return;
        }
        idKeyMap.put(Integer.valueOf(id), key);
        c();
    }

    @Nullable
    public final String getNotificationKey(int uniqueId) {
        return idKeyMap.get(Integer.valueOf(uniqueId));
    }
}
