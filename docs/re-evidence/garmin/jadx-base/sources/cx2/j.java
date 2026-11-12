package cx2;

import android.content.Context;
import android.content.res.Resources;
import d53.k;
import d53.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IllegalFormatConversionException;
import java.util.IllegalFormatPrecisionException;
import java.util.MissingFormatArgumentException;
import java.util.UnknownFormatConversionException;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcx2/j;", "", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f56682a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f56683b = new h("StringUtil", null, 2, null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcx2/j$a;", "", "<init>", "()V", "Lcx2/h;", "logger", "Lcx2/h;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static String a(Context context, String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
            context.getClass();
            if (str != null || str2 != null) {
                try {
                    try {
                        if (str == null) {
                            if (str2 != null) {
                                return c(context, str2, arrayList2);
                            }
                            j.f56683b.getClass();
                            return null;
                        }
                        com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
                        HashMap<String, String> map = com.garmin.realtimesettings.app.initialization.b.f52594f;
                        if (map.isEmpty()) {
                            map = null;
                        }
                        if (map == null) {
                            j.f56683b.getClass();
                            return null;
                        }
                        String str3 = map.get(g.a(str));
                        String strV = str3 != null ? u.v(str3, "\\n", "\n", false) : null;
                        if (strV != null && strV.length() != 0) {
                            j.f56682a.getClass();
                            return d(map, strV, arrayList, arrayList2);
                        }
                        j.f56683b.getClass();
                        return null;
                    } catch (Resources.NotFoundException unused) {
                        j.f56683b.d(null, "getGSUPTranslatedString: did not find handle in app " + ((Object) str2) + StringUtils.SPACE + arrayList2);
                        return null;
                    } catch (ClassCastException unused2) {
                        j.f56683b.d(null, "getGSUPTranslatedString: Wrong cast exception " + ((Object) str2) + StringUtils.SPACE + arrayList2);
                        return null;
                    } catch (IllegalFormatConversionException unused3) {
                        j.f56683b.d(null, "getGSUPTranslatedString: Wrong format exception for " + ((Object) str2) + StringUtils.SPACE + arrayList2);
                        return null;
                    } catch (IllegalFormatPrecisionException unused4) {
                        j.f56683b.d(null, "getGSUPTranslatedString: Conversion does not support a precision for " + ((Object) str2) + StringUtils.SPACE + arrayList2);
                        return null;
                    } catch (MissingFormatArgumentException unused5) {
                        j.f56683b.d(null, "getGSUPTranslatedString: Wrong format exception " + ((Object) str2) + StringUtils.SPACE + arrayList2);
                        return null;
                    } catch (UnknownFormatConversionException unused6) {
                        j.f56683b.d(null, "getGSUPTranslatedString: unable to get the correct format of valarg " + ((Object) str2) + StringUtils.SPACE + arrayList2);
                        return null;
                    }
                } catch (Resources.NotFoundException unused7) {
                    str2 = null;
                    j.f56683b.d(null, "getGSUPTranslatedString: did not find handle in app " + ((Object) str2) + StringUtils.SPACE + arrayList2);
                    return null;
                } catch (ClassCastException unused8) {
                    str2 = null;
                    j.f56683b.d(null, "getGSUPTranslatedString: Wrong cast exception " + ((Object) str2) + StringUtils.SPACE + arrayList2);
                    return null;
                } catch (IllegalFormatConversionException unused9) {
                    str2 = null;
                    j.f56683b.d(null, "getGSUPTranslatedString: Wrong format exception for " + ((Object) str2) + StringUtils.SPACE + arrayList2);
                    return null;
                } catch (IllegalFormatPrecisionException unused10) {
                    str2 = null;
                    j.f56683b.d(null, "getGSUPTranslatedString: Conversion does not support a precision for " + ((Object) str2) + StringUtils.SPACE + arrayList2);
                    return null;
                } catch (MissingFormatArgumentException unused11) {
                    str2 = null;
                    j.f56683b.d(null, "getGSUPTranslatedString: Wrong format exception " + ((Object) str2) + StringUtils.SPACE + arrayList2);
                    return null;
                } catch (UnknownFormatConversionException unused12) {
                    str2 = null;
                    j.f56683b.d(null, "getGSUPTranslatedString: unable to get the correct format of valarg " + ((Object) str2) + StringUtils.SPACE + arrayList2);
                    return null;
                }
            }
            return null;
        }

        public static /* synthetic */ String b(a aVar, Context context, String str) {
            aVar.getClass();
            return a(context, str, null, null, null);
        }

        public static String c(Context context, String str, ArrayList arrayList) {
            int identifier = context.getResources().getIdentifier(str, "string", context.getApplicationInfo().packageName);
            if (arrayList == null || arrayList.isEmpty()) {
                String string = context.getString(identifier);
                string.getClass();
                return string;
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            String string2 = context.getString(identifier, Arrays.copyOf(strArr, strArr.length));
            string2.getClass();
            return string2;
        }

        public static String d(HashMap map, String str, ArrayList arrayList, ArrayList arrayList2) {
            int i14 = 17;
            if (arrayList != null && !arrayList.isEmpty() && arrayList2 != null && !arrayList2.isEmpty()) {
                String[] strArr = null;
                if (arrayList.size() == arrayList2.size()) {
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        Object obj = arrayList.get(i15);
                        obj.getClass();
                        Object obj2 = arrayList2.get(i15);
                        obj2.getClass();
                        String str2 = (String) obj2;
                        String strA = g.a((String) obj);
                        String str3 = (String) map.get(strA);
                        if (str3 != null) {
                            arrayList3.add(str3);
                        } else {
                            j.f56683b.d(null, "getValArgsTranslated: Unable to get translation for " + strA + " so use fall back.");
                            arrayList3.add(str2);
                        }
                    }
                    j.f56683b.getClass();
                    strArr = (String[]) arrayList3.toArray(new String[0]);
                }
                if (strArr != null) {
                    x0 x0Var = x0.f105818a;
                    j.f56682a.getClass();
                    String strE = new k("%[0-9]+").e(new com.google.maps.android.compose.clustering.d(i14), str);
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
                    return String.format(strE, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                }
            }
            if (arrayList2 == null || arrayList2.isEmpty()) {
                return str;
            }
            x0 x0Var2 = x0.f105818a;
            String strE2 = new k("%[0-9]+").e(new com.google.maps.android.compose.clustering.d(i14), str);
            String[] strArr2 = (String[]) arrayList2.toArray(new String[0]);
            Object[] objArrCopyOf2 = Arrays.copyOf(strArr2, strArr2.length);
            return String.format(strE2, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
        }

        private a() {
        }
    }
}
