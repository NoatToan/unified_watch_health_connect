package defpackage;

import android.app.AppOpsManager;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public class zr1 {

    public class a extends ytc.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f41588a;

        public a(b bVar) {
            this.f41588a = bVar;
        }

        @Override // defpackage.ytc
        public void R3(Message message) {
            try {
                this.f41588a.a(message.arg1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public interface b {
        void a(int i);
    }

    public static int a(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return ((AppOpsManager) context.getSystemService("appops")).checkOpNoThrow(10008, Process.myUid(), context.getPackageName());
        } catch (Exception unused) {
            return -1;
        }
    }

    public static void b(boolean z, Context context, b bVar) {
        if (context == null) {
            return;
        }
        ContentResolver contentResolver = context.getContentResolver();
        Bundle bundle = new Bundle();
        if (bVar != null) {
            bundle.putBinder("callback", new a(bVar).asBinder());
        }
        try {
            contentResolver.call(Uri.parse("content://com.lbe.security.miui.autostartmgr"), z ? "openAutoStart" : "closeAutoStart", (String) null, bundle);
        } catch (Exception unused) {
            if (bVar != null) {
                bVar.a(-1);
            }
        }
    }
}
