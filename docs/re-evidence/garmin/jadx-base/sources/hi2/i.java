package hi2;

import android.content.Context;
import android.content.res.Resources;
import d53.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lhi2/i;", "", "<init>", "()V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f83907a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f83908b = new d("StringUtil", null, 2, null);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhi2/i$a;", "", "<init>", "()V", "", "STRING_DEF_TYPE", "Ljava/lang/String;", "Lhi2/d;", "logger", "Lhi2/d;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static String a(String[] strArr) {
            StringBuilder sb3 = new StringBuilder();
            int length = strArr.length;
            boolean z14 = true;
            int i14 = 0;
            while (i14 < length) {
                String str = strArr[i14];
                if (!z14) {
                    sb3.append(' ');
                }
                sb3.append(str);
                i14++;
                z14 = false;
            }
            return sb3.toString();
        }

        public static int b(Context context, String str) {
            Iterator it = w.W(str, new String[]{","}).iterator();
            while (it.hasNext()) {
                int identifier = context.getResources().getIdentifier(w.i0((String) it.next()).toString(), "string", context.getApplicationInfo().packageName);
                if (identifier > 0) {
                    return identifier;
                }
            }
            return context.getResources().getIdentifier(str, "string", context.getApplicationInfo().packageName);
        }

        public static String c(Context context, String str, ArrayList arrayList) {
            context.getClass();
            if (str != null) {
                int i14 = 0;
                try {
                    try {
                        i.f83907a.getClass();
                        int iB = b(context, str);
                        if (iB == 0) {
                            return str;
                        }
                        try {
                            if (arrayList == null) {
                                String string = context.getString(iB);
                                string.getClass();
                                return string;
                            }
                            Object[] array = arrayList.toArray(new String[0]);
                            array.getClass();
                            String string2 = context.getString(iB, a((String[]) array));
                            string2.getClass();
                            return string2;
                        } catch (ClassCastException unused) {
                            i14 = iB;
                            d dVar = i.f83908b;
                            Objects.toString(arrayList);
                            dVar.getClass();
                            String string3 = context.getString(i14);
                            string3.getClass();
                            return string3;
                        } catch (MissingFormatArgumentException unused2) {
                            i14 = iB;
                            d dVar2 = i.f83908b;
                            Objects.toString(arrayList);
                            dVar2.getClass();
                            String string4 = context.getString(i14);
                            string4.getClass();
                            return string4;
                        }
                    } catch (Resources.NotFoundException unused3) {
                        i.f83908b.getClass();
                    }
                } catch (ClassCastException unused4) {
                } catch (MissingFormatArgumentException unused5) {
                }
            }
            return "";
        }

        public static /* synthetic */ String d(a aVar, Context context, String str) {
            aVar.getClass();
            return c(context, str, null);
        }

        private a() {
        }
    }
}
