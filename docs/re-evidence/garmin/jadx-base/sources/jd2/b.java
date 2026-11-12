package jd2;

import id2.f;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes11.dex */
public final class b {
    public static final synchronized void a(OkHttpClient okHttpClient, a aVar) {
        try {
            okHttpClient.getClass();
            aVar.getClass();
            List<Interceptor> listInterceptors = okHttpClient.interceptors();
            ArrayList<f> arrayList = new ArrayList();
            for (Object obj : listInterceptors) {
                if (obj instanceof f) {
                    arrayList.add(obj);
                }
            }
            for (f fVar : arrayList) {
                synchronized (fVar) {
                    fVar.f93046b.remove(aVar);
                }
            }
            if (aVar == a.HTTP_EVENTS) {
                hd2.b.f83444a.getClass();
                hd2.b.f83446c = false;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static final void b(OkHttpClient okHttpClient, a aVar) {
        okHttpClient.getClass();
        aVar.getClass();
        List<Interceptor> listInterceptors = okHttpClient.interceptors();
        ArrayList<f> arrayList = new ArrayList();
        for (Object obj : listInterceptors) {
            if (obj instanceof f) {
                arrayList.add(obj);
            }
        }
        for (f fVar : arrayList) {
            synchronized (fVar) {
                fVar.f93046b.add(aVar);
            }
        }
        if (aVar == a.HTTP_EVENTS) {
            hd2.b.f83444a.getClass();
            hd2.b.f83446c = true;
        }
    }
}
