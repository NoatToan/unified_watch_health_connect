package com.huawei.hwcloudjs.service.hms;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;

/* JADX INFO: loaded from: classes10.dex */
public class a extends com.huawei.hwcloudjs.e.b.c<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f17133b = "ActivityResultNotifier";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f17134c = new a();

    /* JADX INFO: loaded from: classes37.dex */
    public interface c {
        void a(b bVar);
    }

    public static final class b extends com.huawei.hwcloudjs.e.b.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Intent f17137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f17138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f17139c;

        public int c() {
            return this.f17138b;
        }

        public void b(int i) {
            this.f17138b = i;
        }

        public int b() {
            return this.f17139c;
        }

        public void a(Intent intent) {
            this.f17137a = intent;
        }

        public void a(int i) {
            this.f17139c = i;
        }

        public Intent a() {
            return this.f17137a;
        }
    }

    public void a(Activity activity, Intent intent, int i, c cVar) {
        a().b(new C0179a(i, cVar));
        try {
            activity.startActivityForResult(intent, i);
        } catch (ActivityNotFoundException unused) {
            com.huawei.hwcloudjs.f.d.b(f17133b, "ActivityNotFoundException .. ", true);
        }
    }

    public void a(int i, c cVar) {
        a().b(new C0179a(i, cVar));
    }

    /* JADX INFO: renamed from: com.huawei.hwcloudjs.service.hms.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes37.dex */
    static final class C0179a implements com.huawei.hwcloudjs.e.b.b<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f17135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f17136b;

        @Override // com.huawei.hwcloudjs.e.b.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean onReceive(b bVar) {
            if (this.f17135a != bVar.f17139c) {
                return true;
            }
            this.f17136b.a(bVar);
            return false;
        }

        public C0179a(int i, c cVar) {
            this.f17135a = i;
            this.f17136b = cVar;
        }
    }

    public static a a() {
        return f17134c;
    }
}
