package g;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lg/c;", "Lg/a;", "", "", "Landroid/net/Uri;", "<init>", "()V", "a", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class c extends g.a<String, List<Uri>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f74067a = new a(null);

    @Override // g.a
    public final Intent a(Context context, String str) {
        String str2 = str;
        context.getClass();
        str2.getClass();
        Intent intentPutExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str2).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    @Override // g.a
    public final g.a.C1502a<List<Uri>> b(Context context, String str) {
        context.getClass();
        str.getClass();
        return null;
    }

    @Override // g.a
    public final List<Uri> c(int i14, Intent intent) {
        if (i14 != -1) {
            intent = null;
        }
        if (intent != null) {
            f74067a.getClass();
            List<Uri> listA = a.a(intent);
            if (listA != null) {
                return listA;
            }
        }
        return j0.f134944a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg/c$a;", "", "<init>", "()V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static List a(Intent intent) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data = intent.getData();
            if (data != null) {
                linkedHashSet.add(data);
            }
            ClipData clipData = intent.getClipData();
            if (clipData == null && linkedHashSet.isEmpty()) {
                return j0.f134944a;
            }
            if (clipData != null) {
                int itemCount = clipData.getItemCount();
                for (int i14 = 0; i14 < itemCount; i14++) {
                    Uri uri = clipData.getItemAt(i14).getUri();
                    if (uri != null) {
                        linkedHashSet.add(uri);
                    }
                }
            }
            return new ArrayList(linkedHashSet);
        }

        private a() {
        }
    }
}
