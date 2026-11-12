package com.facebook.internal.logging.dumpsys;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import com.alipay.sdk.m.u.i;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.watch.notification.data.NotificationData;
import com.loc.z;
import com.xiaomi.mipush.sdk.Constants;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.m;
import org.cybergarage.upnp.Argument;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000  2\u00020\u0001:\u0003\u0013\t B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJB\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J(\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0010H\u0002R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001c¨\u0006!"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/EndToEndDumpsysHelper;", "", "", "prefix", "Ljava/io/PrintWriter;", "writer", "", "args", "", "b", "(Ljava/lang/String;Ljava/io/PrintWriter;[Ljava/lang/String;)V", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "leftOffset", "topOffset", "", "withWebView", "withProps", "a", "c", "Lcom/facebook/internal/logging/dumpsys/AndroidRootResolver;", "Lcom/facebook/internal/logging/dumpsys/AndroidRootResolver;", "rootResolver", "Lcom/facebook/internal/logging/dumpsys/WebViewDumpHelper;", "Lcom/facebook/internal/logging/dumpsys/WebViewDumpHelper;", "webViewDumpHelper", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "lithoViewToStringMethod", "<init>", "()V", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@SuppressLint({"HexColorValueUsage", "CatchGeneralException", "BadMethodUse-java.lang.String.length"})
public final class EndToEndDumpsysHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String d = "com.facebook.litho.LithoView";
    private static final String e = "com.facebook.litho.LithoViewTestHelper";
    private static final String f = "viewToStringForE2E";
    private static final String g = "e2e";
    private static final String h = "top-root";
    private static final String i = "all-roots";
    private static final String j = "webview";
    private static final String k = "props";
    private static final String l = "RCTextView";
    private static EndToEndDumpsysHelper m;
    private static Method n;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AndroidRootResolver rootResolver = new AndroidRootResolver();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final WebViewDumpHelper webViewDumpHelper = new WebViewDumpHelper();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Method lithoViewToStringMethod;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b1\u00102J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u001a\u0010\u0016\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\nH\u0002J'\u0010\u001a\u001a\u00020\u00042\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J/\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\"R\u0016\u0010$\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010%\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\"R\u0016\u0010&\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\"R\u0016\u0010'\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\"R\u0016\u0010(\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\"R\u0016\u0010)\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\"R\u0016\u0010*\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\"R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/EndToEndDumpsysHelper$Companion;", "", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "e", "Ljava/io/PrintWriter;", "writer", "", "h", "", "leftOffset", "topOffset", "g", "i", "f", z.j, "", "c", "", "str", "maxLength", "b", "", "args", Argument.ELEM_NAME, GoogleApiAvailabilityLight.a, "([Ljava/lang/String;Ljava/lang/String;)Z", "Landroid/view/accessibility/AccessibilityNodeInfo;", "a", "prefix", "maybeDump", "(Ljava/lang/String;Ljava/io/PrintWriter;[Ljava/lang/String;)Z", "ALL_ROOTS_ARGUMENT", "Ljava/lang/String;", "E2E_ARGUMENT", "LITHO_VIEW_CLASS", "LITHO_VIEW_TEST_HELPER_CLASS", "LITHO_VIEW_TO_STRING_METHOD", "RC_TEXT_VIEW_SIMPLE_CLASS_NAME", "TOP_ROOT_ARGUMENT", "WITH_PROPS_ARGUMENT", "WITH_WEBVIEW_ARGUMENT", "Lcom/facebook/internal/logging/dumpsys/EndToEndDumpsysHelper;", DefaultSettingsSpiCall.n, "Lcom/facebook/internal/logging/dumpsys/EndToEndDumpsysHelper;", "Ljava/lang/reflect/Method;", "rcTextViewGetTextMethod", "Ljava/lang/reflect/Method;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AccessibilityNodeInfo a(View view) {
            if (view == null) {
                return null;
            }
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
            try {
                view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
                return accessibilityNodeInfoObtain;
            } catch (NullPointerException unused) {
                if (accessibilityNodeInfoObtain != null) {
                    accessibilityNodeInfoObtain.recycle();
                }
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(CharSequence str, int maxLength) {
            if (str == null) {
                return "";
            }
            if (str.length() == 0) {
                return "";
            }
            String strReplace$default = m.replace$default(m.replace$default(m.replace$default(str.toString(), " \n", " ", false, 4, (Object) null), "\n", " ", false, 4, (Object) null), "\"", "", false, 4, (Object) null);
            if (str.length() <= maxLength) {
                return strReplace$default;
            }
            StringBuilder sb = new StringBuilder();
            Objects.requireNonNull(strReplace$default, "null cannot be cast to non-null type java.lang.String");
            sb.append(strReplace$default.substring(0, maxLength));
            sb.append("...");
            return sb.toString();
        }

        @SuppressLint({"PrivateApi", "ReflectionMethodUse"})
        private final String c(View view) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            if (EndToEndDumpsysHelper.n == null) {
                EndToEndDumpsysHelper.n = view.getClass().getDeclaredMethod("getText", new Class[0]);
            }
            Method method = EndToEndDumpsysHelper.n;
            Object objInvoke = method != null ? method.invoke(view, new Object[0]) : null;
            if (objInvoke != null) {
                return objInvoke.toString();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(String[] args, String argument) {
            if (args == null) {
                return false;
            }
            for (String str : args) {
                if (m.equals(argument, str, true)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean e(View view) {
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                if (Intrinsics.areEqual(superclass.getName(), EndToEndDumpsysHelper.d)) {
                    return true;
                }
            }
            return false;
        }

        private final void f(PrintWriter writer, View view) {
            Object tag = view.getTag();
            if (!(tag instanceof String)) {
                tag = null;
            }
            String str = (String) tag;
            if (str != null) {
                if (str.length() == 0) {
                    return;
                }
                writer.print(" app:tag/");
                writer.print(b(str, 60));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(PrintWriter writer, View view, int leftOffset, int topOffset) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            writer.print(" ");
            writer.print(iArr[0] - leftOffset);
            writer.print(",");
            writer.print(iArr[1] - topOffset);
            writer.print(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            writer.print((iArr[0] + view.getWidth()) - leftOffset);
            writer.print(",");
            writer.print((iArr[1] + view.getHeight()) - topOffset);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h(PrintWriter writer, View view) {
            writer.print(" ");
            int visibility = view.getVisibility();
            if (visibility == 0) {
                writer.print("V");
            } else if (visibility == 4) {
                writer.print(LogUtil.I);
            } else if (visibility != 8) {
                writer.print(".");
            } else {
                writer.print("G");
            }
            writer.print(view.isFocusable() ? "F" : ".");
            writer.print(view.isEnabled() ? "E" : ".");
            writer.print(".");
            writer.print(view.isHorizontalScrollBarEnabled() ? "H" : ".");
            writer.print(view.isVerticalScrollBarEnabled() ? "V" : ".");
            writer.print(view.isClickable() ? "C" : ".");
            writer.print(view.isLongClickable() ? "L" : ".");
            writer.print(" ");
            writer.print(view.isFocused() ? "F" : ".");
            writer.print(view.isSelected() ? ExifInterface.LATITUDE_SOUTH : ".");
            writer.print(view.isHovered() ? "H" : ".");
            writer.print(view.isActivated() ? ExifInterface.GPS_MEASUREMENT_IN_PROGRESS : ".");
            writer.print(view.isDirty() ? LogUtil.D : ".");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void i(PrintWriter writer, View view) {
            String resourcePackageName;
            try {
                int id = view.getId();
                if (id == -1) {
                    f(writer, view);
                    return;
                }
                writer.append(" #");
                writer.append((CharSequence) Integer.toHexString(id));
                Resources resources = view.getResources();
                if (id > 0 && resources != null) {
                    int i = (-16777216) & id;
                    if (i != 16777216) {
                        resourcePackageName = i != 2130706432 ? resources.getResourcePackageName(id) : "app";
                    } else {
                        resourcePackageName = "android";
                    }
                    writer.print(" ");
                    writer.print(resourcePackageName);
                    writer.print(":");
                    writer.print(resources.getResourceTypeName(id));
                    writer.print(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
                    writer.print(resources.getResourceEntryName(id));
                    return;
                }
                f(writer, view);
            } catch (Exception unused) {
                f(writer, view);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:18:0x003f A[Catch: Exception -> 0x00a0, TryCatch #0 {Exception -> 0x00a0, blocks: (B:3:0x0001, B:5:0x0007, B:39:0x0082, B:44:0x008c, B:6:0x0013, B:8:0x0023, B:9:0x0028, B:11:0x002e, B:13:0x0034, B:18:0x003f, B:20:0x0045, B:25:0x0057, B:32:0x006c, B:35:0x0072, B:36:0x0075), top: B:47:0x0001 }] */
        /* JADX WARN: Code duplicated, block: B:20:0x0045 A[Catch: Exception -> 0x00a0, TryCatch #0 {Exception -> 0x00a0, blocks: (B:3:0x0001, B:5:0x0007, B:39:0x0082, B:44:0x008c, B:6:0x0013, B:8:0x0023, B:9:0x0028, B:11:0x002e, B:13:0x0034, B:18:0x003f, B:20:0x0045, B:25:0x0057, B:32:0x006c, B:35:0x0072, B:36:0x0075), top: B:47:0x0001 }] */
        /* JADX WARN: Code duplicated, block: B:22:0x0052 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:23:0x0054  */
        /* JADX WARN: Code duplicated, block: B:24:0x0056  */
        /* JADX WARN: Code duplicated, block: B:27:0x0063  */
        /* JADX WARN: Code duplicated, block: B:28:0x0065  */
        /* JADX WARN: Code duplicated, block: B:35:0x0072 A[Catch: Exception -> 0x00a0, TryCatch #0 {Exception -> 0x00a0, blocks: (B:3:0x0001, B:5:0x0007, B:39:0x0082, B:44:0x008c, B:6:0x0013, B:8:0x0023, B:9:0x0028, B:11:0x002e, B:13:0x0034, B:18:0x003f, B:20:0x0045, B:25:0x0057, B:32:0x006c, B:35:0x0072, B:36:0x0075), top: B:47:0x0001 }] */
        /* JADX WARN: Code duplicated, block: B:37:0x007f  */
        /* JADX WARN: Code duplicated, block: B:50:0x006f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:51:0x006c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:52:0x006a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:53:0x0071 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:54:0x0068 A[SYNTHETIC] */
        @SuppressLint({"ReflectionMethodUse"})
        public final void j(PrintWriter writer, View view) {
            Object tag;
            String string;
            int length;
            int i;
            boolean z;
            String string2;
            int i2;
            boolean z2;
            try {
                if (view instanceof TextView) {
                    string2 = ((TextView) view).getText().toString();
                } else if (Intrinsics.areEqual(view.getClass().getSimpleName(), EndToEndDumpsysHelper.l)) {
                    string2 = c(view);
                } else {
                    CharSequence contentDescription = view.getContentDescription();
                    String string3 = contentDescription != null ? contentDescription.toString() : null;
                    if (string3 == null) {
                        tag = view.getTag();
                        if (tag != null) {
                            string = tag.toString();
                            length = string.length() - 1;
                            i = 0;
                            z = false;
                            while (i <= length) {
                                if (z) {
                                    i2 = length;
                                } else {
                                    i2 = i;
                                }
                                if (Intrinsics.compare((int) string.charAt(i2), 32) <= 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z) {
                                    if (!z2) {
                                        break;
                                    } else {
                                        length--;
                                    }
                                } else if (z2) {
                                    i++;
                                } else {
                                    z = true;
                                }
                            }
                            string2 = string.subSequence(i, length + 1).toString();
                        } else {
                            string2 = string3;
                        }
                    } else {
                        if (string3.length() == 0) {
                            tag = view.getTag();
                            if (tag != null) {
                                string = tag.toString();
                                length = string.length() - 1;
                                i = 0;
                                z = false;
                                while (i <= length) {
                                    if (z) {
                                        i2 = i;
                                    } else {
                                        i2 = length;
                                    }
                                    if (Intrinsics.compare((int) string.charAt(i2), 32) <= 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z) {
                                        if (z2) {
                                            z = true;
                                        } else {
                                            i++;
                                        }
                                    } else {
                                        if (!z2) {
                                            break;
                                            break;
                                        }
                                        length--;
                                    }
                                }
                                string2 = string.subSequence(i, length + 1).toString();
                            } else {
                                string2 = string3;
                            }
                        } else {
                            string2 = string3;
                        }
                    }
                }
                if (string2 != null) {
                    if (string2.length() == 0) {
                        return;
                    }
                    writer.print(" text=\"");
                    writer.print(b(string2, 600));
                    writer.print("\"");
                }
            } catch (Exception unused) {
            }
        }

        @JvmStatic
        public final boolean maybeDump(@NotNull String prefix, @NotNull PrintWriter writer, @Nullable String[] args) {
            if (args != null) {
                if ((!(args.length == 0)) && Intrinsics.areEqual("e2e", args[0])) {
                    if (EndToEndDumpsysHelper.m == null) {
                        EndToEndDumpsysHelper.m = new EndToEndDumpsysHelper();
                    }
                    EndToEndDumpsysHelper endToEndDumpsysHelper = EndToEndDumpsysHelper.m;
                    if (endToEndDumpsysHelper != null) {
                        endToEndDumpsysHelper.b(prefix, writer, args);
                    }
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"com/facebook/internal/logging/dumpsys/EndToEndDumpsysHelper$a", "", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Lorg/json/JSONObject;", "a", "Ljava/io/PrintWriter;", "writer", "", "b", "Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Field;", "keyedTagsField", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private static Field keyedTagsField;

        @NotNull
        public static final a b = new a();

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mKeyedTags");
                keyedTagsField = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
            } catch (NoSuchFieldException unused) {
            }
        }

        private a() {
        }

        private final JSONObject a(View view) {
            try {
                if (keyedTagsField == null) {
                    Field declaredField = View.class.getDeclaredField("mKeyedTags");
                    keyedTagsField = declaredField;
                    if (declaredField != null) {
                        declaredField.setAccessible(true);
                    }
                }
                Field field = keyedTagsField;
                Object obj = field != null ? field.get(view) : null;
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.util.SparseArray<*>");
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    int size = sparseArray.size();
                    for (int i = 0; i < size; i++) {
                        try {
                            jSONObject.put(ResourcesUtil.getIdStringQuietly(view.getResources(), sparseArray.keyAt(i)), sparseArray.valueAt(i));
                        } catch (JSONException unused) {
                        }
                    }
                } catch (Exception unused2) {
                }
                return jSONObject;
            } catch (Exception unused3) {
                return null;
            }
        }

        public final void b(@NotNull PrintWriter writer, @NotNull View view) {
            Companion companion;
            AccessibilityNodeInfo accessibilityNodeInfoA;
            if (Build.VERSION.SDK_INT >= 21 && (accessibilityNodeInfoA = (companion = EndToEndDumpsysHelper.INSTANCE).a(view)) != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (view instanceof TextView) {
                        jSONObject.put("textColor", ((TextView) view).getTextColors().getDefaultColor());
                        jSONObject.put("textSize", ((TextView) view).getTextSize());
                        jSONObject.put(ViewHierarchyConstants.HINT_KEY, companion.b(((TextView) view).getHint(), 100));
                    }
                    JSONObject jSONObjectA = a(view);
                    if (jSONObjectA != null) {
                        jSONObject.put("keyedTags", jSONObjectA);
                    }
                    JSONArray jSONArray = new JSONArray();
                    Iterator<AccessibilityNodeInfo.AccessibilityAction> it2 = accessibilityNodeInfoA.getActionList().iterator();
                    while (it2.hasNext()) {
                        CharSequence label = it2.next().getLabel();
                        if (label == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        jSONArray.put(EndToEndDumpsysHelper.INSTANCE.b((String) label, 50));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put(NotificationData.WearableExtrasData.KEY_ACTIONS, jSONArray);
                    }
                    Companion companion2 = EndToEndDumpsysHelper.INSTANCE;
                    String strB = companion2.b(accessibilityNodeInfoA.getContentDescription(), 50);
                    if (strB != null) {
                        if (strB.length() > 0) {
                            jSONObject.put("content-description", strB);
                        }
                    }
                    jSONObject.put("accessibility-focused", accessibilityNodeInfoA.isAccessibilityFocused()).put("checkable", accessibilityNodeInfoA.isCheckable()).put("checked", accessibilityNodeInfoA.isChecked()).put("class-name", companion2.b(accessibilityNodeInfoA.getClassName(), 50)).put("clickable", accessibilityNodeInfoA.isClickable()).put("content-invalid", accessibilityNodeInfoA.isContentInvalid()).put("dismissable", accessibilityNodeInfoA.isDismissable()).put("editable", accessibilityNodeInfoA.isEditable()).put(io.flutter.plugins.firebase.crashlytics.Constants.ENABLED, accessibilityNodeInfoA.isEnabled()).put("focusable", accessibilityNodeInfoA.isFocusable()).put("focused", accessibilityNodeInfoA.isFocused()).put("long-clickable", accessibilityNodeInfoA.isLongClickable()).put("multiline", accessibilityNodeInfoA.isMultiLine()).put("password", accessibilityNodeInfoA.isPassword()).put("scrollable", accessibilityNodeInfoA.isScrollable()).put("selected", accessibilityNodeInfoA.isSelected()).put("visible-to-user", accessibilityNodeInfoA.isVisibleToUser());
                    if (Build.VERSION.SDK_INT >= 24) {
                        b.a.a(jSONObject, accessibilityNodeInfoA);
                    }
                } catch (Exception e) {
                    try {
                        jSONObject.put("DUMP-ERROR", EndToEndDumpsysHelper.INSTANCE.b(e.getMessage(), 50));
                    } catch (JSONException unused) {
                    }
                }
                writer.append(" props=\"").append((CharSequence) jSONObject.toString()).append("\"");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"com/facebook/internal/logging/dumpsys/EndToEndDumpsysHelper$b", "", "Lorg/json/JSONObject;", EndToEndDumpsysHelper.k, "Landroid/view/accessibility/AccessibilityNodeInfo;", "nodeInfo", "", "a", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class b {

        @NotNull
        public static final b a = new b();

        private b() {
        }

        public final void a(@NotNull JSONObject props, @NotNull AccessibilityNodeInfo nodeInfo) throws JSONException {
            if (Build.VERSION.SDK_INT < 24) {
                return;
            }
            props.put("context-clickable", nodeInfo.isContextClickable()).put("drawing-order", nodeInfo.getDrawingOrder()).put("important-for-accessibility", nodeInfo.isImportantForAccessibility());
        }
    }

    private final void a(String prefix, PrintWriter writer, View view, int leftOffset, int topOffset, boolean withWebView, boolean withProps) {
        ViewGroup viewGroup;
        int childCount;
        writer.print(prefix);
        if (view == null) {
            writer.println("null");
            return;
        }
        writer.print(view.getClass().getName());
        writer.print("{");
        writer.print(Integer.toHexString(view.hashCode()));
        Companion companion = INSTANCE;
        companion.h(writer, view);
        companion.g(writer, view, leftOffset, topOffset);
        companion.i(writer, view);
        companion.j(writer, view);
        if (withProps && Build.VERSION.SDK_INT >= 21) {
            a.b.b(writer, view);
        }
        writer.println(i.d);
        if (companion.e(view)) {
            c(writer, view, prefix, withProps);
        }
        if (withWebView && (view instanceof WebView)) {
            this.webViewDumpHelper.handle((WebView) view);
        }
        if ((view instanceof ViewGroup) && (childCount = (viewGroup = (ViewGroup) view).getChildCount()) > 0) {
            String str = prefix + "  ";
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            for (int i2 = 0; i2 < childCount; i2++) {
                a(str, writer, viewGroup.getChildAt(i2), iArr[0], iArr[1], withWebView, withProps);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(String prefix, PrintWriter writer, String[] args) {
        View view;
        writer.print(prefix);
        writer.println("Top Level Window View Hierarchy:");
        Companion companion = INSTANCE;
        boolean zD = companion.d(args, i);
        boolean zD2 = companion.d(args, h);
        boolean zD3 = companion.d(args, j);
        boolean zD4 = companion.d(args, k);
        try {
            List<AndroidRootResolver.Root> listListActiveRoots = this.rootResolver.listActiveRoots();
            if (listListActiveRoots != null && !listListActiveRoots.isEmpty()) {
                Collections.reverse(listListActiveRoots);
                WindowManager.LayoutParams layoutParams = null;
                for (AndroidRootResolver.Root root : listListActiveRoots) {
                    if (root != null && (view = root.getCom.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY java.lang.String()) != null && view.getVisibility() == 0) {
                        if (!zD && layoutParams != null && Math.abs(root.getParam().type - layoutParams.type) != 1) {
                            break;
                        }
                        a(prefix + "  ", writer, root.getCom.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY java.lang.String(), 0, 0, zD3, zD4);
                        WindowManager.LayoutParams param = root.getParam();
                        if (zD2) {
                            break;
                        } else {
                            layoutParams = param;
                        }
                    }
                }
                this.webViewDumpHelper.dump(writer);
            }
        } catch (Exception e2) {
            writer.println("Failure in view hierarchy dump: " + e2.getMessage());
        }
    }

    private final void c(PrintWriter writer, View view, String prefix, boolean withProps) {
        try {
            if (this.lithoViewToStringMethod == null) {
                this.lithoViewToStringMethod = Class.forName(e).getDeclaredMethod(f, View.class, Integer.TYPE, Boolean.TYPE);
            }
            Method method = this.lithoViewToStringMethod;
            Object objInvoke = method != null ? method.invoke(null, view, Integer.valueOf((prefix.length() / 2) + 1), Boolean.valueOf(withProps)) : null;
            if (objInvoke == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            writer.append((CharSequence) objInvoke);
        } catch (Exception e2) {
            writer.append((CharSequence) prefix).append("Failed litho view sub hierarch dump: ").append((CharSequence) INSTANCE.b(e2.getMessage(), 100)).println();
        }
    }

    @JvmStatic
    public static final boolean maybeDump(@NotNull String str, @NotNull PrintWriter printWriter, @Nullable String[] strArr) {
        return INSTANCE.maybeDump(str, printWriter, strArr);
    }
}
