package com.huami.wallet.ui.repository;

import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.Notice;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.ui.repository.NoticeRepo;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/huami/wallet/ui/repository/NoticeRepo;", "", "", "c", "preLoad", "dispose", "Lcom/huami/wallet/lib/api/WalletDataSource;", "a", "Lcom/huami/wallet/lib/api/WalletDataSource;", "mWalletDataSource2", "", "Lcom/huami/wallet/lib/entity/Notice;", "b", "Ljava/util/List;", "getNotices", "()Ljava/util/List;", "setNotices", "(Ljava/util/List;)V", "notices", "Lio/reactivex/disposables/Disposable;", "Lio/reactivex/disposables/Disposable;", "disposbale", "walletDataSource2", "<init>", "(Lcom/huami/wallet/lib/api/WalletDataSource;)V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class NoticeRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private WalletDataSource mWalletDataSource2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private List<Notice> notices;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Disposable disposbale;

    public NoticeRepo(@NotNull WalletDataSource walletDataSource) {
        this.mWalletDataSource2 = walletDataSource;
    }

    private final void c() {
        WalletDataSource walletDataSource = this.mWalletDataSource2;
        this.disposbale = Flowable.fromPublisher(walletDataSource == null ? null : walletDataSource.loadNotices()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: sf5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NoticeRepo.d(this.a, (Resource) obj);
            }
        }, new Consumer() { // from class: tf5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NoticeRepo.e((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(NoticeRepo noticeRepo, Resource resource) {
        if ((resource == null ? null : resource.status) == Status.SUCCESS) {
            noticeRepo.setNotices((List) resource.data);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Throwable th) {
    }

    public final void dispose() {
        Disposable disposable = this.disposbale;
        if (disposable == null) {
            return;
        }
        disposable.dispose();
    }

    @Nullable
    public final List<Notice> getNotices() {
        return this.notices;
    }

    public final void preLoad() {
        c();
    }

    public final void setNotices(@Nullable List<Notice> list) {
        this.notices = list;
    }
}
