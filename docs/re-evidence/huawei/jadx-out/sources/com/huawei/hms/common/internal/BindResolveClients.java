package com.huawei.hms.common.internal;

import java.util.ArrayList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public class BindResolveClients {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f13048b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<ResolveClientBean> f13049a;

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final BindResolveClients f13050a = new BindResolveClients();
    }

    public static BindResolveClients getInstance() {
        return b.f13050a;
    }

    public boolean isClientRegistered(ResolveClientBean resolveClientBean) {
        boolean zContains;
        synchronized (f13048b) {
            zContains = this.f13049a.contains(resolveClientBean);
        }
        return zContains;
    }

    public void notifyClientReconnect() {
        synchronized (f13048b) {
            ListIterator<ResolveClientBean> listIterator = this.f13049a.listIterator();
            while (listIterator.hasNext()) {
                listIterator.next().clientReconnect();
            }
            this.f13049a.clear();
        }
    }

    public void register(ResolveClientBean resolveClientBean) {
        if (resolveClientBean == null) {
            return;
        }
        synchronized (f13048b) {
            if (!this.f13049a.contains(resolveClientBean)) {
                this.f13049a.add(resolveClientBean);
            }
        }
    }

    public void unRegister(ResolveClientBean resolveClientBean) {
        if (resolveClientBean == null) {
            return;
        }
        synchronized (f13048b) {
            if (this.f13049a.contains(resolveClientBean)) {
                ListIterator<ResolveClientBean> listIterator = this.f13049a.listIterator();
                while (listIterator.hasNext()) {
                    if (resolveClientBean.equals(listIterator.next())) {
                        listIterator.remove();
                        break;
                    }
                }
            }
        }
    }

    public void unRegisterAll() {
        synchronized (f13048b) {
            this.f13049a.clear();
        }
    }

    private BindResolveClients() {
        this.f13049a = new ArrayList<>();
    }
}
