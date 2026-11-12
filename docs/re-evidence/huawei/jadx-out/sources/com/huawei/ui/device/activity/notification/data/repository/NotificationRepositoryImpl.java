package com.huawei.ui.device.activity.notification.data.repository;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.device.activity.notification.data.StorageType;
import com.huawei.ui.device.activity.notification.data.storage.NotificationCallback;
import com.huawei.ui.device.activity.notification.data.storage.NotificationResult;
import com.huawei.ui.device.activity.notification.data.storage.NotificationStorage;
import defpackage.cio;
import defpackage.eei;
import defpackage.lzj;
import defpackage.qxr;
import defpackage.qxs;
import defpackage.qyb;
import defpackage.qyd;
import defpackage.qye;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes16.dex */
public class NotificationRepositoryImpl implements NotificationRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24548a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24549c;

    @Override // com.huawei.ui.device.activity.notification.data.repository.NotificationRepository
    public void updateNotificationAppAuthorization(lzj lzjVar, boolean z, NotificationCallback<Boolean> notificationCallback) {
        c(lzjVar, z, false, notificationCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final lzj lzjVar, final boolean z, boolean z2, final NotificationCallback<Boolean> notificationCallback) {
        LogUtil.a("NotificationRepositoryImpl", lzjVar.d(), " updateAppSwitch:", Boolean.valueOf(z));
        lzjVar.e(z ? 1 : 0);
        qxr.b(StorageType.LOCAL).saveAppSwitch(lzjVar, null);
        qxr.b(StorageType.SYSTEM).saveAppSwitch(lzjVar, null);
        qxr.b(StorageType.DATABASE).saveAppSwitch(lzjVar, new NotificationCallback<lzj>() { // from class: com.huawei.ui.device.activity.notification.data.repository.NotificationRepositoryImpl.3
            @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(lzj lzjVar2) {
                qxr.b(StorageType.DEVICE).saveAppSwitch(lzjVar, null);
                NotificationCallback notificationCallback2 = notificationCallback;
                if (notificationCallback2 != null) {
                    notificationCallback2.onSuccess(Boolean.valueOf(z));
                }
            }

            @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
            public void onError(NotificationResult notificationResult, String str) {
                NotificationCallback notificationCallback2 = notificationCallback;
                if (notificationCallback2 != null) {
                    notificationCallback2.onError(notificationResult, str);
                }
            }
        });
        if (z2) {
            return;
        }
        qxr.b(StorageType.DATA_PLATFORM).saveAppSwitch(lzjVar, null);
    }

    @Override // com.huawei.ui.device.activity.notification.data.repository.NotificationRepository
    public void loadNotificationAppList(NotificationCallback<List<lzj>> notificationCallback) {
        LogUtil.a("NotificationRepositoryImpl", "loadAppList:");
        qxr.b(StorageType.SYSTEM).getAppSwitch(null, new a(StorageType.SYSTEM, notificationCallback));
    }

    class a extends ChainCallback<List<lzj>, List<lzj>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f24555b;

        public a(StorageType storageType, NotificationCallback<List<lzj>> notificationCallback) {
            super(storageType, notificationCallback);
            this.f24555b = System.currentTimeMillis();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<lzj> list) {
            int i = AnonymousClass1.f24550b[this.mType.ordinal()];
            if (i == 1) {
                LogUtil.a("NotificationRepositoryImpl", "LoadAppListCallback SYSTEM  successfully");
                if (list != null) {
                    List<lzj> listD = NotificationRepositoryImpl.this.d(list, 1);
                    ReleaseLogUtil.d("R_NotificationRepositoryImpl", "create app list cost:", Long.valueOf(System.currentTimeMillis() - this.f24555b));
                    this.callback.onSuccess((T) listD);
                    setType(StorageType.DATA_PLATFORM);
                    qxr.b(StorageType.DATA_PLATFORM).getAppSwitch(listD, this);
                    return;
                }
                this.callback.onError(NotificationResult.GENERAL_ERROR, "");
                return;
            }
            if (i != 2) {
                return;
            }
            LogUtil.a("NotificationRepositoryImpl", "LoadAppListCallback DATA_PLATFORM  successfully");
            if (list == null) {
                return;
            }
            this.callback.onSuccess((T) NotificationRepositoryImpl.this.d(list, 0));
            for (lzj lzjVar : list) {
                NotificationRepositoryImpl.this.c(lzjVar, 1 == lzjVar.e(), true, null);
            }
            NotificationStorage notificationStorageB = qxr.b(StorageType.LOCAL);
            if (notificationStorageB instanceof qye) {
                qye qyeVar = (qye) notificationStorageB;
                qyeVar.d();
                qyeVar.e();
            }
        }

        @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
        public void onError(NotificationResult notificationResult, String str) {
            if (this.callback != null) {
                this.callback.onError(notificationResult, str);
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.device.activity.notification.data.repository.NotificationRepositoryImpl$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f24550b;

        static {
            int[] iArr = new int[StorageType.values().length];
            f24550b = iArr;
            try {
                iArr[StorageType.SYSTEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24550b[StorageType.DATA_PLATFORM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24550b[StorageType.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24550b[StorageType.DATABASE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<lzj> d(List<lzj> list, int i) {
        LogUtil.a("NotificationRepositoryImpl", "sortAppByAuthorizeStatus");
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList();
        for (lzj lzjVar : list) {
            if (b(lzjVar, i) == 1) {
                lzjVar.e(1);
                LogUtil.a("NotificationRepositoryImpl", lzjVar.d(), ":AUTHORIZED");
                arrayList.add(lzjVar);
            } else {
                lzjVar.e(0);
                LogUtil.a("NotificationRepositoryImpl", lzjVar.d(), ":UNAUTHORIZED");
                arrayList2.add(lzjVar);
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    private int b(lzj lzjVar, int i) {
        if (i == 1) {
            return qxr.b(StorageType.LOCAL).getAppSwitch(lzjVar.f());
        }
        if (i == 0) {
            return lzjVar.e();
        }
        return 0;
    }

    @Override // com.huawei.ui.device.activity.notification.data.repository.NotificationRepository
    public void loadNotificationMainSwitchStatus(NotificationCallback<Boolean> notificationCallback) {
        LogUtil.a("NotificationRepositoryImpl", "loadMainSwitch:");
        NotificationStorage notificationStorageB = qxr.b(StorageType.SYSTEM);
        if ((!(notificationStorageB instanceof qyd) || !((qyd) notificationStorageB).e()) && !CommonUtil.bg()) {
            notificationCallback.onError(NotificationResult.MAIN_STATUS_ERR, "运动健康app的通知使用权未打开");
            this.f24549c = false;
            qxr.b(StorageType.LOCAL).saveMainSwitch(0, null);
            qxr.b(StorageType.DATABASE).saveMainSwitch(0, new NotificationCallback<Integer>() { // from class: com.huawei.ui.device.activity.notification.data.repository.NotificationRepositoryImpl.4
                @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
                public void onError(NotificationResult notificationResult, String str) {
                }

                @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Integer num) {
                    qxr.b(StorageType.DEVICE).saveMainSwitch(0, null);
                    ((qyb) qxr.b(StorageType.DEVICE)).c(NotificationRepositoryImpl.this.f24549c, qxr.b(StorageType.LOCAL).getAppSwitch(cio.d) == 1);
                }
            });
            return;
        }
        qxr.b(StorageType.DATA_PLATFORM).getMainSwitch(new e(StorageType.DATA_PLATFORM, notificationCallback));
    }

    class e extends ChainCallback<Boolean, Boolean> {
        public e(StorageType storageType, NotificationCallback<Boolean> notificationCallback) {
            super(storageType, notificationCallback);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Boolean bool) {
            this.callback.onSuccess((T) bool);
            NotificationRepositoryImpl.this.f24549c = Boolean.TRUE.equals(bool);
            NotificationRepositoryImpl notificationRepositoryImpl = NotificationRepositoryImpl.this;
            notificationRepositoryImpl.saveNotificationMainSwitchStatus(notificationRepositoryImpl.f24549c, null);
        }

        @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
        public void onError(NotificationResult notificationResult, String str) {
            int i = AnonymousClass1.f24550b[this.mType.ordinal()];
            if (i == 1) {
                LogUtil.a("NotificationRepositoryImpl", "LoadMainSwitchCallback SYSTEM err");
                this.callback.onError(notificationResult, str);
            } else if (i == 2) {
                LogUtil.a("NotificationRepositoryImpl", "LoadMainSwitchCallback DATA_PLATFORM err");
                setType(StorageType.LOCAL);
                qxr.b(StorageType.LOCAL).getMainSwitch(this);
            } else {
                if (i != 3) {
                    return;
                }
                LogUtil.a("NotificationRepositoryImpl", "LoadMainSwitchCallback LOCAL err");
                setType(StorageType.SYSTEM);
                qxr.b(StorageType.SYSTEM).getMainSwitch(this);
            }
        }
    }

    @Override // com.huawei.ui.device.activity.notification.data.repository.NotificationRepository
    public void saveNotificationMainSwitchStatus(boolean z, NotificationCallback<Boolean> notificationCallback) {
        LogUtil.a("NotificationRepositoryImpl", "saveMainSwitch:", Boolean.valueOf(z));
        qxr.b(StorageType.SYSTEM).saveMainSwitch(z ? 1 : 0, new b(z, StorageType.SYSTEM, notificationCallback));
    }

    class b extends ChainCallback<Boolean, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f24556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f24557b;

        public b(boolean z, StorageType storageType, NotificationCallback<Boolean> notificationCallback) {
            super(storageType, notificationCallback);
            this.f24557b = z;
            this.f24556a = z ? 1 : 0;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Integer num) {
            int i = AnonymousClass1.f24550b[this.mType.ordinal()];
            if (i == 1) {
                LogUtil.a("NotificationRepositoryImpl", "UpdateMainSwitchCallback SYSTEM saved successfully");
                setType(StorageType.LOCAL);
                qxr.b(StorageType.LOCAL).saveMainSwitch(this.f24556a, this);
                return;
            }
            if (i == 2) {
                LogUtil.a("NotificationRepositoryImpl", "UpdateMainSwitchCallback DATA_PLATFORM saved successfully");
                NotificationRepositoryImpl.this.f24549c = this.f24557b;
                qxr.b(StorageType.DEVICE).saveMainSwitch(this.f24556a, null);
                ((qyb) qxr.b(StorageType.DEVICE)).c(NotificationRepositoryImpl.this.f24549c, qxr.b(StorageType.LOCAL).getAppSwitch(cio.d) == 1);
                if (this.callback != 0) {
                    this.callback.onSuccess((T) Boolean.valueOf(this.f24557b));
                    return;
                }
                return;
            }
            if (i == 3) {
                LogUtil.a("NotificationRepositoryImpl", "UpdateMainSwitchCallback LOCAL saved successfully");
                setType(StorageType.DATABASE);
                qxr.b(StorageType.DATABASE).saveMainSwitch(this.f24556a, this);
            } else {
                if (i != 4) {
                    return;
                }
                LogUtil.a("NotificationRepositoryImpl", "UpdateMainSwitchCallback DATABASE saved successfully");
                setType(StorageType.DATA_PLATFORM);
                qxr.b(StorageType.DATA_PLATFORM).saveMainSwitch(this.f24556a, this);
            }
        }

        @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
        public void onError(NotificationResult notificationResult, String str) {
            if (this.callback != null) {
                this.callback.onError(notificationResult, str);
            }
        }
    }

    @Override // com.huawei.ui.device.activity.notification.data.repository.NotificationRepository
    public void loadNotificationRemindMode(final NotificationCallback<Integer> notificationCallback) {
        LogUtil.a("NotificationRepositoryImpl", "getNotifyReminderMode:");
        this.f24548a = loadSwitchSyncVersion();
        qxr.b(StorageType.DATA_PLATFORM).getNotifyReminderMode(this.f24548a, new NotificationCallback<Integer>() { // from class: com.huawei.ui.device.activity.notification.data.repository.NotificationRepositoryImpl.2
            @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Integer num) {
                notificationCallback.onSuccess(num);
                NotificationRepositoryImpl.this.setNotificationRemindMode(num == null ? 0 : num.intValue(), null);
            }

            @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
            public void onError(NotificationResult notificationResult, String str) {
                NotificationCallback notificationCallback2 = notificationCallback;
                if (notificationCallback2 != null) {
                    notificationCallback2.onError(notificationResult, str);
                }
            }
        });
    }

    @Override // com.huawei.ui.device.activity.notification.data.repository.NotificationRepository
    public int loadSwitchSyncVersion() {
        LogUtil.a("NotificationRepositoryImpl", "loadSwitchSyncVersion:");
        NotificationStorage notificationStorageB = qxr.b(StorageType.DEVICE);
        qyb qybVar = notificationStorageB instanceof qyb ? (qyb) notificationStorageB : null;
        NotificationStorage notificationStorageB2 = qxr.b(StorageType.SYSTEM);
        qyd qydVar = notificationStorageB2 instanceof qyd ? (qyd) notificationStorageB2 : null;
        if (qydVar == null || !qydVar.a() || qybVar == null || !qybVar.a()) {
            return (qybVar == null || !qybVar.c() || eei.e() == 1) ? 0 : 2;
        }
        return 3;
    }

    @Override // com.huawei.ui.device.activity.notification.data.repository.NotificationRepository
    public void syncSwitchStatusToCloud() {
        NotificationStorage notificationStorageB = qxr.b(StorageType.DATA_PLATFORM);
        if (notificationStorageB instanceof qxs) {
            ((qxs) notificationStorageB).c();
        }
    }

    @Override // com.huawei.ui.device.activity.notification.data.repository.NotificationRepository
    public void setNotificationRemindMode(final int i, final NotificationCallback<Boolean> notificationCallback) {
        LogUtil.a("NotificationRepositoryImpl", "setNotifyReminderMode:", Integer.valueOf(i));
        qxr.b(StorageType.DATA_PLATFORM).setNotifyReminderMode(i, new NotificationCallback<Boolean>() { // from class: com.huawei.ui.device.activity.notification.data.repository.NotificationRepositoryImpl.5
            @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Boolean bool) {
                qxr.b(StorageType.DEVICE).setNotifyReminderMode(i, null);
                if (NotificationRepositoryImpl.this.f24548a == 3) {
                    qxr.b(StorageType.SYSTEM).setNotifyReminderMode(i, null);
                }
                NotificationCallback notificationCallback2 = notificationCallback;
                if (notificationCallback2 != null) {
                    notificationCallback2.onSuccess(bool);
                }
            }

            @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
            public void onError(NotificationResult notificationResult, String str) {
                NotificationCallback notificationCallback2 = notificationCallback;
                if (notificationCallback2 != null) {
                    notificationCallback2.onError(notificationResult, str);
                }
            }
        });
    }

    @Override // com.huawei.ui.device.activity.notification.data.repository.NotificationRepository
    public boolean isNotificationEnabledInSystem(String str, int i) {
        NotificationStorage notificationStorageB = qxr.b(StorageType.SYSTEM);
        if (notificationStorageB instanceof qyd) {
            return ((qyd) notificationStorageB).e(str, i);
        }
        return false;
    }

    static abstract class ChainCallback<T, V> implements NotificationCallback<V> {
        protected final NotificationCallback<T> callback;
        protected StorageType mType;

        public ChainCallback(StorageType storageType, NotificationCallback<T> notificationCallback) {
            this.callback = notificationCallback;
            this.mType = storageType;
        }

        public void setType(StorageType storageType) {
            this.mType = storageType;
        }
    }

    public /* synthetic */ void c(boolean z, lzj lzjVar) {
        c(lzjVar, z, true, null);
    }

    @Override // com.huawei.ui.device.activity.notification.data.repository.NotificationRepository
    public void updateAllAppAuthorization(List<lzj> list, final boolean z, NotificationCallback<Boolean> notificationCallback) {
        list.forEach(new Consumer() { // from class: qxt
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.e.c(z, (lzj) obj);
            }
        });
        NotificationStorage notificationStorageB = qxr.b(StorageType.DATA_PLATFORM);
        if (notificationStorageB instanceof qxs) {
            ((qxs) notificationStorageB).b(list);
        }
        notificationCallback.onSuccess(true);
    }
}
