package kotlin;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.core.view.s0;
import androidx.lifecycle.ViewModelStoreOwner;
import b5.e0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.jwk.JWKParameterNames;
import f5.a1;
import f5.b1;
import f5.b2;
import f5.r2;
import f5.t2;
import f5.u2;
import f5.v1;
import f5.w1;
import f5.x1;
import f5.y0;
import h4.r;
import h4.t;
import h5.c0;
import h5.c1;
import h5.e2;
import h5.h0;
import h5.h2;
import h5.m1;
import h5.n1;
import h5.o1;
import h5.q1;
import h5.r1;
import h5.x0;
import h5.y1;
import i3.e5;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import lc.u0;
import m4.j0;
import m4.q0;
import m4.v;
import m4.x;
import o4.l1;
import o4.z;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.w;
import p1.i0;
import p1.i1;
import p1.t0;
import p3.c2;
import p3.d0;
import p3.p0;
import p3.p1;
import p3.x2;
import p5.b0;
import p5.k0;
import p5.y;
import s5.w0;
import w5.u;
import x5.a0;
import x5.f0;
import x5.l0;
import x5.m0;
import x5.n0;
import x5.o0;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000Ð\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f:\u0005+Þ\u0002ß\u0002B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J!\u0010$\u001a\u00020\u001b2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001b0\"¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010&\u001a\u00020\u0013¢\u0006\u0004\b(\u0010)R+\u00101\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R*\u0010;\u001a\u0004\u0018\u0001028\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b3\u00104\u0012\u0004\b9\u0010:\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u0010A\u001a\u00020<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R$\u0010I\u001a\u0004\u0018\u00010B8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010P\u001a\u00020J2\u0006\u0010K\u001a\u00020J8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR+\u0010W\u001a\u00020Q2\u0006\u0010*\u001a\u00020Q8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bR\u0010,\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001a\u0010]\u001a\u00020X8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\"\u0010e\u001a\u00020^8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001a\u0010k\u001a\u00020f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR+\u0010n\u001a\u00020l2\u0006\u0010*\u001a\u00020l8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bm\u0010,\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u001b\u0010u\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010oR\u001a\u0010{\u001a\u00020v8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u0019\u0010\u0081\u0001\u001a\u00020|8\u0006¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R'\u0010\u0088\u0001\u001a\u00030\u0082\u00018\u0016X\u0096\u0004¢\u0006\u0017\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u0012\u0005\b\u0087\u0001\u0010:\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R'\u0010\u008e\u0001\u001a\n\u0012\u0005\u0012\u00030\u0082\u00010\u0089\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R \u0010\u0094\u0001\u001a\u00030\u008f\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R \u0010\u009a\u0001\u001a\u00030\u0095\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R*\u0010¢\u0001\u001a\u00030\u009b\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R \u0010¨\u0001\u001a\u00030£\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R \u0010®\u0001\u001a\u00030©\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R \u0010´\u0001\u001a\u00030¯\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001R3\u0010»\u0001\u001a\u00030µ\u00012\u0007\u0010*\u001a\u00030µ\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b¶\u0001\u0010,\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R \u0010À\u0001\u001a\u00030¼\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\b½\u0001\u0010s\u001a\u0006\b¾\u0001\u0010¿\u0001R\"\u0010Æ\u0001\u001a\u0005\u0018\u00010Á\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÂ\u0001\u0010Ã\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001R \u0010Ì\u0001\u001a\u00030Ç\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÈ\u0001\u0010É\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001R \u0010Ò\u0001\u001a\u00030Í\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÎ\u0001\u0010Ï\u0001\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R \u0010Ø\u0001\u001a\u00030Ó\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÔ\u0001\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001R.\u0010Þ\u0001\u001a\u00020l8V@\u0016X\u0096\u000e¢\u0006\u001d\n\u0006\bÙ\u0001\u0010Ú\u0001\u0012\u0005\bÝ\u0001\u0010:\u001a\u0005\bÛ\u0001\u0010o\"\u0005\bÜ\u0001\u0010qR/\u0010å\u0001\u001a\u00020\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0006\bß\u0001\u0010à\u0001\u0012\u0005\bä\u0001\u0010:\u001a\u0006\bá\u0001\u0010â\u0001\"\u0005\bã\u0001\u0010\u001dR7\u0010ì\u0001\u001a\u0005\u0018\u00010æ\u00012\t\u0010*\u001a\u0005\u0018\u00010æ\u00018B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0005\bç\u0001\u0010,\u001a\u0006\bè\u0001\u0010é\u0001\"\u0006\bê\u0001\u0010ë\u0001R\"\u0010ï\u0001\u001a\u0005\u0018\u00010æ\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\bí\u0001\u0010s\u001a\u0006\bî\u0001\u0010é\u0001R'\u0010ö\u0001\u001a\u00030ð\u00018\u0016X\u0097\u0004¢\u0006\u0017\n\u0006\bñ\u0001\u0010ò\u0001\u0012\u0005\bõ\u0001\u0010:\u001a\u0006\bó\u0001\u0010ô\u0001R3\u0010ý\u0001\u001a\u00030÷\u00012\u0007\u0010*\u001a\u00030÷\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\bø\u0001\u0010,\u001a\u0006\bù\u0001\u0010ú\u0001\"\u0006\bû\u0001\u0010ü\u0001R3\u0010\u0084\u0002\u001a\u00030þ\u00012\u0007\u0010*\u001a\u00030þ\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\bÿ\u0001\u0010,\u001a\u0006\b\u0080\u0002\u0010\u0081\u0002\"\u0006\b\u0082\u0002\u0010\u0083\u0002R \u0010\u008a\u0002\u001a\u00030\u0085\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0086\u0002\u0010\u0087\u0002\u001a\u0006\b\u0088\u0002\u0010\u0089\u0002R \u0010\u0090\u0002\u001a\u00030\u008b\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008c\u0002\u0010\u008d\u0002\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002R \u0010\u0096\u0002\u001a\u00030\u0091\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0092\u0002\u0010\u0093\u0002\u001a\u0006\b\u0094\u0002\u0010\u0095\u0002R'\u0010\u009a\u0002\u001a\u00020l8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b\u0097\u0002\u0010Ú\u0001\u001a\u0005\b\u0098\u0002\u0010o\"\u0005\b\u0099\u0002\u0010qR \u0010 \u0002\u001a\u00030\u009b\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009c\u0002\u0010\u009d\u0002\u001a\u0006\b\u009e\u0002\u0010\u009f\u0002R&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¡\u0002\u0010.\"\u0005\b¢\u0002\u00100R\u0017\u0010¥\u0002\u001a\u00020'8VX\u0096\u0004¢\u0006\b\u001a\u0006\b£\u0002\u0010¤\u0002R\u001f\u0010ª\u0002\u001a\u00030¦\u00028VX\u0096\u0004¢\u0006\u000f\u0012\u0005\b©\u0002\u0010:\u001a\u0006\b§\u0002\u0010¨\u0002R\u0018\u0010®\u0002\u001a\u00030«\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¬\u0002\u0010\u00ad\u0002R*\u0010¯\u0002\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b¯\u0002\u0010°\u0002\u001a\u0006\b±\u0002\u0010²\u0002\"\u0005\b³\u0002\u0010!R\u001a\u0010·\u0002\u001a\u0005\u0018\u00010´\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bµ\u0002\u0010¶\u0002R\u001a\u0010»\u0002\u001a\u0005\u0018\u00010¸\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¹\u0002\u0010º\u0002R\u0018\u0010¿\u0002\u001a\u00030¼\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b½\u0002\u0010¾\u0002R\u0017\u0010Á\u0002\u001a\u00020\u00198VX\u0096\u0004¢\u0006\b\u001a\u0006\bÀ\u0002\u0010â\u0001R\u0016\u0010Ã\u0002\u001a\u00020l8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÂ\u0002\u0010oR\u001f\u0010È\u0002\u001a\u00030Ä\u00028VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bÇ\u0002\u0010:\u001a\u0006\bÅ\u0002\u0010Æ\u0002R\u0018\u0010Ì\u0002\u001a\u00030É\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bÊ\u0002\u0010Ë\u0002R\u0018\u0010Ð\u0002\u001a\u00030Í\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bÎ\u0002\u0010Ï\u0002R\u0018\u0010Ô\u0002\u001a\u00030Ñ\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bÒ\u0002\u0010Ó\u0002R\u0016\u0010Ö\u0002\u001a\u00020l8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÕ\u0002\u0010oR\u0019\u0010Ù\u0002\u001a\u0004\u0018\u00010\u00008VX\u0096\u0004¢\u0006\b\u001a\u0006\b×\u0002\u0010Ø\u0002R\u0018\u0010Ý\u0002\u001a\u00030Ú\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bÛ\u0002\u0010Ü\u0002¨\u0006à\u0002"}, d2 = {"Li5/m;", "Landroid/view/ViewGroup;", "Lh5/o1;", "Lm4/q0;", "Li5/e4;", "Lb5/l;", "Landroidx/lifecycle/n;", "Lh5/m1;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "Lm4/p;", "Lq5/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Li5/s1;", "composeViewContext", "<init>", "(Landroid/content/Context;Li5/s1;)V", "", "getImportantForAutofill", "()I", "Ln4/d;", "getEmbeddedViewFocusRect", "()Ln4/d;", "", "intervalMillis", "", "setAccessibilityEventBatchIntervalMillis", "(J)V", "Lh5/w1$a;", "handler", "setUncaughtExceptionHandler", "(Lh5/w1$a;)V", "Lkotlin/Function1;", "callback", "setOnReadyForComposition", "(Le23/l;)V", "accessibilityId", "Landroid/view/View;", "findViewByAccessibilityIdTraversal", "(I)Landroid/view/View;", "<set-?>", "a", "Lp3/p1;", "get_composeViewContext", "()Li5/s1;", "set_composeViewContext", "(Li5/s1;)V", "_composeViewContext", "Ly4/b;", "d", "Ly4/b;", "getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui", "()Ly4/b;", "setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui", "(Ly4/b;)V", "getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations", "()V", "primaryDirectionalMotionAxisOverride", "Lh5/h0;", JWKParameterNames.RSA_EXPONENT, "Lh5/h0;", "getSharedDrawScope", "()Lh5/h0;", "sharedDrawScope", "Li5/r2$a;", "f", "Li5/r2$a;", "getFrameEndScheduler$ui", "()Li5/r2$a;", "setFrameEndScheduler$ui", "(Li5/r2$a;)V", "frameEndScheduler", "Lb4/f;", "value", "h", "Lb4/f;", "getRetainedValuesStore", "()Lb4/f;", "retainedValuesStore", "Lg6/c;", JWKParameterNames.OCT_KEY_VALUE, "getDensity", "()Lg6/c;", "setDensity", "(Lg6/c;)V", "density", "Lm4/u;", "m", "Lm4/u;", "getFocusOwner", "()Lm4/u;", "focusOwner", "Lt13/g;", JWKParameterNames.RSA_MODULUS, "Lt13/g;", "getCoroutineContext", "()Lt13/g;", "setCoroutineContext", "(Lt13/g;)V", "coroutineContext", "Lk4/a;", "o", "Lk4/a;", "getDragAndDropManager", "()Lk4/a;", "dragAndDropManager", "", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "isAttached", "()Z", "setAttached", "(Z)V", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "Lp3/x3;", "getDerivedIsAttached", "derivedIsAttached", "Li5/a4;", "v", "Li5/a4;", "getViewConfiguration", "()Li5/a4;", "viewConfiguration", "Lf5/v;", "w", "Lf5/v;", "getInsetsListener", "()Lf5/v;", "insetsListener", "Lh5/e0;", "x", "Lh5/e0;", "getRoot", "()Lh5/e0;", "getRoot$annotations", "root", "Lp1/i0;", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "Lp1/i0;", "getLayoutNodes", "()Lp1/i0;", "layoutNodes", "Lq5/e;", "z", "Lq5/e;", "getRectManager", "()Lq5/e;", "rectManager", "Lp5/b0;", "A", "Lp5/b0;", "getSemanticsOwner", "()Lp5/b0;", "semanticsOwner", "Lj4/a;", "C", "Lj4/a;", "getContentCaptureManager$ui", "()Lj4/a;", "setContentCaptureManager$ui", "(Lj4/a;)V", "contentCaptureManager", "Li5/i;", "D", "Li5/i;", "getAccessibilityManager", "()Li5/i;", "accessibilityManager", "Lo4/q0;", "E", "Lo4/q0;", "getGraphicsContext", "()Lo4/q0;", "graphicsContext", "Li4/p;", "F", "Li4/p;", "getAutofillTree", "()Li4/p;", "autofillTree", "Landroid/content/res/Configuration;", "J0", "getConfiguration", "()Landroid/content/res/Configuration;", "setConfiguration", "(Landroid/content/res/Configuration;)V", "configuration", "Lz5/c;", "K0", "getLocaleList", "()Lz5/c;", "localeList", "Li4/b;", "M0", "Li4/b;", "get_autofillManager$ui", "()Li4/b;", "_autofillManager", "Li5/k;", "O0", "Li5/k;", "getClipboardManager", "()Li5/k;", "clipboardManager", "Li5/j;", "P0", "Li5/j;", "getClipboard", "()Li5/j;", "clipboard", "Lh5/r1;", "Q0", "Lh5/r1;", "getSnapshotObserver", "()Lh5/r1;", "snapshotObserver", "R0", "Z", "getShowLayoutBounds", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "showLayoutBounds", "b1", "J", "getLastMatrixRecalculationAnimationTime$ui", "()J", "setLastMatrixRecalculationAnimationTime$ui", "getLastMatrixRecalculationAnimationTime$ui$annotations", "lastMatrixRecalculationAnimationTime", "Li5/m$c;", "e1", "get_viewTreeOwners", "()Li5/m$c;", "set_viewTreeOwners", "(Li5/m$c;)V", "_viewTreeOwners", "f1", "getViewTreeOwners", "viewTreeOwners", "Lw5/p$b;", "l1", "Lw5/p$b;", "getFontLoader", "()Lw5/p$b;", "getFontLoader$annotations", "fontLoader", "Lw5/q$b;", "m1", "getFontFamilyResolver", "()Lw5/q$b;", "setFontFamilyResolver", "(Lw5/q$b;)V", "fontFamilyResolver", "Lg6/o;", "n1", "getLayoutDirection", "()Lg6/o;", "setLayoutDirection", "(Lg6/o;)V", "layoutDirection", "Lw4/a;", "o1", "Lw4/a;", "getHapticFeedBack", "()Lw4/a;", "hapticFeedBack", "Lg5/e;", "q1", "Lg5/e;", "getModifierLocalManager", "()Lg5/e;", "modifierLocalManager", "Li5/q3;", "r1", "Li5/q3;", "getTextToolbar", "()Li5/q3;", "textToolbar", "F1", "getComposeViewContextIncrementedDuringInit$ui", "setComposeViewContextIncrementedDuringInit$ui", "composeViewContextIncrementedDuringInit", "Lb5/x;", "I1", "Lb5/x;", "getPointerIconService", "()Lb5/x;", "pointerIconService", "getComposeViewContext", "setComposeViewContext", "getView", "()Landroid/view/View;", "view", "Li5/h4;", "getWindowInfo", "()Li5/h4;", "getWindowInfo$annotations", "windowInfo", "Lh5/w1;", "getRootForTest", "()Lh5/w1;", "rootForTest", "uncaughtExceptionHandler", "Lh5/w1$a;", "getUncaughtExceptionHandler$ui", "()Lh5/w1$a;", "setUncaughtExceptionHandler$ui", "Li4/i;", "getAutofill", "()Li4/i;", "autofill", "Li4/n;", "getAutofillManager", "()Li4/n;", "autofillManager", "Li5/w0;", "getAndroidViewsHandler$ui", "()Li5/w0;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Lx5/m0;", "getTextInputService", "()Lx5/m0;", "getTextInputService$annotations", "textInputService", "Li5/m3;", "getSoftwareKeyboardController", "()Li5/m3;", "softwareKeyboardController", "Lf5/v1$a;", "getPlacementScope", "()Lf5/v1$a;", "placementScope", "Lx4/c;", "getInputModeManager", "()Lx4/c;", "inputModeManager", "getScrollCaptureInProgress$ui", "scrollCaptureInProgress", "getOutOfFrameExecutor", "()Li5/m;", "outOfFrameExecutor", "Lx5/n0;", "getLegacyTextInputServiceAndroid", "()Lx5/n0;", "legacyTextInputServiceAndroid", "c", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m extends ViewGroup implements o1, q0, e4, b5.l, androidx.lifecycle.n, m1, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, m4.p, q5.b {
    public static final a K1;
    public static Class<?> L1;
    public static Method M1;
    public static Method N1;
    public static final p1.q0<m> O1;
    public static ab2.a P1;
    public static Method Q1;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public final b0 semanticsOwner;
    public boolean A1;
    public final u B;
    public final f2 B1;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public j4.a contentCaptureManager;
    public final o C1;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public final kotlin.i accessibilityManager;
    public final d1 D1;
    public final o4.e E;
    public boolean E1;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public final i4.p autofillTree;

    /* JADX INFO: renamed from: F1, reason: from kotlin metadata */
    public boolean composeViewContextIncrementedDuringInit;
    public final o5.k G1;
    public final b5.m H0;
    public View H1;
    public final p1.q0<n1> I;
    public final e0 I0;
    public final n I1;
    public final c2 J0;
    public int J1;
    public final d0 K0;
    public final i4.a L0;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public final i4.b _autofillManager;
    public boolean N0;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    public final kotlin.k clipboardManager;
    public p1.q0<n1> P;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    public final kotlin.j clipboard;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    public final r1 snapshotObserver;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    public boolean showLayoutBounds;
    public w0 S0;
    public boolean T;
    public g6.a T0;
    public boolean U0;
    public final h5.q0 V0;
    public long W0;
    public final int[] X0;
    public final float[] Y0;
    public final float[] Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f91262a;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final float[] f91263a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f91264b;

    /* JADX INFO: renamed from: b1, reason: collision with root package name and from kotlin metadata */
    public long lastMatrixRecalculationAnimationTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f91266c;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public boolean f91267c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public y4.b primaryDirectionalMotionAxisOverride;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public long f91269d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final h0 sharedDrawScope;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public final c2 f91271e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public r2.a frameEndScheduler;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public final d0 f91273f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public r2.b f91274g;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public e23.l<? super s1, p005kotlin.Unit> f91275g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public b4.f retainedValuesStore;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public n0 f91277h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p13.k<e23.a<p005kotlin.Unit>> f91278i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public m0 f91279i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kotlin.l f91280j;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public final AtomicReference<t<o0>> f91281j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c2 f91282k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f91283k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public u1 f91284k1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f91285l;

    /* JADX INFO: renamed from: l1, reason: collision with root package name and from kotlin metadata */
    public final w5.p.b fontLoader;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v f91287m;

    /* JADX INFO: renamed from: m1, reason: collision with root package name and from kotlin metadata */
    public final p1 fontFamilyResolver;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public t13.g coroutineContext;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public final c2 f91290n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final k4.a dragAndDropManager;

    /* JADX INFO: renamed from: o1, reason: collision with root package name and from kotlin metadata */
    public final w4.a hapticFeedBack;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p2 f91293p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public final x4.d f91294p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c2 f91295q;

    /* JADX INFO: renamed from: q1, reason: collision with root package name and from kotlin metadata */
    public final g5.e modifierLocalManager;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d0 f91297r;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public final p0 f91298r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public MotionEvent f91299s1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z f91300t;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public long f91301t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public final g4<n1> f91302u1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final u0 f91303v;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public final p1.q0<e23.a<p005kotlin.Unit>> f91304v1;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final f5.v insetsListener;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public float f91306w1;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final h5.e0 root;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public float f91308x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final i0<h5.e0> layoutNodes;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public final p f91310y1;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    public final q5.e rectManager;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public final kotlin.l f91312z1;

    @p005kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\bB\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Li5/m$b;", "Lh4/r$c;", "Lm5/a;", "Lh5/y1;", "Ld5/a;", "Lz4/g;", "Lh5/c0;", "Lh5/e2;", "", "<init>", "(Li5/m;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b extends r.c implements m5.a, y1, d5.a, z4.g, c0, e2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f91313a = new e();

        @p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf5/v1$a;", "", "invoke", "(Lf5/v1$a;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        public static final class a extends w implements e23.l<v1.a, p005kotlin.Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ v1 f91315a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v1 v1Var) {
                super(1);
                this.f91315a = v1Var;
            }

            @Override // e23.l
            public final p005kotlin.Unit invoke(v1.a aVar) {
                aVar.r(this.f91315a, 0, 0, 0.0f);
                return p005kotlin.Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: i5.m$b$b, reason: collision with other inner class name */
        @p005kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4/j0;", "it", "", "invoke", "(Lm4/j0;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        public static final class C1749b extends w implements e23.l<j0, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ m4.g f91316a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1749b(m4.g gVar) {
                super(1);
                this.f91316a = gVar;
            }

            @Override // e23.l
            public final Boolean invoke(j0 j0Var) {
                return Boolean.valueOf(j0Var.n1(this.f91316a.f116475a));
            }
        }

        @p005kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4/j0;", "it", "", "invoke", "(Lm4/j0;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        public static final class c extends w implements e23.l<j0, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ m4.g f91317a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(m4.g gVar) {
                super(1);
                this.f91317a = gVar;
            }

            @Override // e23.l
            public final Boolean invoke(j0 j0Var) {
                return Boolean.valueOf(j0Var.n1(this.f91317a.f116475a));
            }
        }

        @p005kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4/j0;", "it", "", "invoke", "(Lm4/j0;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        public static final class d extends w implements e23.l<j0, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ m4.g f91318a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(m4.g gVar) {
                super(1);
                this.f91318a = gVar;
            }

            @Override // e23.l
            public final Boolean invoke(j0 j0Var) {
                return Boolean.valueOf(j0Var.n1(this.f91318a.f116475a));
            }
        }

        @p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf5/e2;", "", "invoke", "(Lf5/e2;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        public static final class e extends w implements e23.l<f5.e2, p005kotlin.Unit> {
            public e() {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final p005kotlin.Unit invoke(f5.e2 e2Var) {
                f5.e2 e2Var2 = e2Var;
                b bVar = b.this;
                m mVar = m.this;
                m mVar2 = m.this;
                if (mVar.getInsetsListener().f69139e.getIntValue() > 0) {
                    i0 i0Var = t2.f69114a;
                    long jA = e2Var2.Y0().a();
                    t0 t0Var = mVar2.getInsetsListener().f69138d;
                    int i14 = (int) (jA >> 32);
                    int i15 = (int) (jA & 4294967295L);
                    for (r2 r2Var : t2.f69115b) {
                        V vD = t0Var.d(r2Var);
                        vD.getClass();
                        u2 u2Var = (u2) vD;
                        t2.a(e2Var2, r2Var.getCurrent(), u2Var.f69131h, i14, i15);
                        if (((Boolean) u2Var.f69125b.getF182175a()).booleanValue()) {
                            t2.a(e2Var2, u2Var.f69129f, u2Var.f69133j, i14, i15);
                            t2.a(e2Var2, u2Var.f69130g, u2Var.f69134k, i14, i15);
                        }
                        t2.a(e2Var2, r2Var.getMaximum(), u2Var.f69132i, i14, i15);
                    }
                    p1.q0<p1<Rect>> q0Var = mVar2.getInsetsListener().f69140f;
                    if (q0Var.e()) {
                        f4.s<x1> sVar = mVar2.getInsetsListener().f69141g;
                        Object[] objArr = q0Var.f134667a;
                        int i16 = q0Var.f134668b;
                        for (int i17 = 0; i17 < i16; i17++) {
                            p1 p1Var = (p1) objArr[i17];
                            x1 x1Var = sVar.get(i17);
                            Rect rect = (Rect) p1Var.getF182175a();
                            e2Var2.V(x1Var.getF69161c(), rect.left);
                            e2Var2.V(x1Var.getF69162d(), rect.top);
                            e2Var2.V(x1Var.getF69163e(), rect.right);
                            e2Var2.V(x1Var.getF69164f(), rect.bottom);
                        }
                    }
                }
                return p005kotlin.Unit.INSTANCE;
            }
        }

        public b() {
        }

        @Override // h5.y1
        public final void D1(k0 k0Var) {
        }

        @Override // z4.g
        public final boolean J(KeyEvent keyEvent) {
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:111:0x0206  */
        /* JADX WARN: Code duplicated, block: B:114:0x0211  */
        @Override // z4.g
        public final boolean M1(KeyEvent keyEvent) {
            m4.g gVarA;
            int i14;
            Boolean boolM;
            int[] iArr = m4.m.f116498a;
            long jA = z4.d.a(keyEvent);
            z4.a.f202280b.getClass();
            if (z4.a.a(jA, z4.a.f202282d)) {
                m4.g.f116466b.getClass();
                gVarA = m4.g.a(m4.g.f116468d);
            } else if (z4.a.a(jA, z4.a.f202283e)) {
                m4.g.f116466b.getClass();
                gVarA = m4.g.a(m4.g.f116467c);
            } else if (z4.a.a(jA, z4.a.f202296r)) {
                if (keyEvent.isShiftPressed()) {
                    m4.g.f116466b.getClass();
                    i14 = m4.g.f116468d;
                } else {
                    m4.g.f116466b.getClass();
                    i14 = m4.g.f116467c;
                }
                gVarA = m4.g.a(i14);
            } else if (z4.a.a(jA, z4.a.f202287i)) {
                m4.g.f116466b.getClass();
                gVarA = m4.g.a(m4.g.f116470f);
            } else if (z4.a.a(jA, z4.a.f202286h)) {
                m4.g.f116466b.getClass();
                gVarA = m4.g.a(m4.g.f116469e);
            } else if (z4.a.a(jA, z4.a.f202284f) || z4.a.a(jA, z4.a.E)) {
                m4.g.f116466b.getClass();
                gVarA = m4.g.a(m4.g.f116471g);
            } else if (z4.a.a(jA, z4.a.f202285g) || z4.a.a(jA, z4.a.F)) {
                m4.g.f116466b.getClass();
                gVarA = m4.g.a(m4.g.f116472h);
            } else if (z4.a.a(jA, z4.a.f202288j) || z4.a.a(jA, z4.a.f202298t) || z4.a.a(jA, z4.a.G)) {
                m4.g.f116466b.getClass();
                gVarA = m4.g.a(m4.g.f116473i);
            } else if (z4.a.a(jA, z4.a.f202281c) || z4.a.a(jA, z4.a.f202301w)) {
                m4.g.f116466b.getClass();
                gVarA = m4.g.a(m4.g.f116474j);
            } else {
                gVarA = null;
            }
            if (gVarA != null) {
                int i15 = gVarA.f116475a;
                int iB = z4.d.b(keyEvent);
                z4.c.f202307b.getClass();
                if (iB == z4.c.f202309d) {
                    boolean z14 = h4.i.f81559a;
                    m mVar = m.this;
                    if (z14) {
                        j0 j0VarF = mVar.getFocusOwner().f();
                        if (j0VarF == null || !j0VarF.f116483a || !mVar.H(i15)) {
                            Boolean boolM2 = mVar.getFocusOwner().m(i15, mVar.getEmbeddedViewFocusRect(), new c(gVarA));
                            if (!(boolM2 != null ? boolM2.booleanValue() : true)) {
                                if (x.a(i15)) {
                                    Integer numC = m4.m.c(i15);
                                    int iIntValue = numC != null ? numC.intValue() : 2;
                                    FocusFinder focusFinder = FocusFinder.getInstance();
                                    View rootView = mVar.getRootView();
                                    rootView.getClass();
                                    View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, mVar.getView(), iIntValue);
                                    if (viewFindNextFocus == null || viewFindNextFocus.equals(mVar)) {
                                        return mVar.getFocusOwner().i(i15);
                                    }
                                }
                            }
                        }
                        return true;
                    }
                    Integer numC2 = m4.m.c(i15);
                    n4.d embeddedViewFocusRect = mVar.getEmbeddedViewFocusRect();
                    Boolean boolM3 = mVar.getFocusOwner().m(i15, embeddedViewFocusRect, new d(gVarA));
                    if (!(boolM3 != null ? boolM3.booleanValue() : true)) {
                        if (x.a(i15)) {
                            if (numC2 != null) {
                                int iIntValue2 = numC2.intValue();
                                FocusFinder focusFinder2 = FocusFinder.getInstance();
                                View viewFindNextFocus2 = mVar;
                                while (true) {
                                    if (viewFindNextFocus2 == null) {
                                        viewFindNextFocus2 = null;
                                        break;
                                    }
                                    View rootView2 = mVar.getRootView();
                                    rootView2.getClass();
                                    viewFindNextFocus2 = focusFinder2.findNextFocus((ViewGroup) rootView2, viewFindNextFocus2, iIntValue2);
                                    if (viewFindNextFocus2 != null && !h0.a(mVar, viewFindNextFocus2)) {
                                        break;
                                    }
                                }
                                if (p005kotlin.jvm.internal.s.g(viewFindNextFocus2, mVar)) {
                                    viewFindNextFocus2 = null;
                                }
                                if (viewFindNextFocus2 != null) {
                                    Rect rectH = embeddedViewFocusRect != null ? l1.h(embeddedViewFocusRect) : null;
                                    if (rectH == null) {
                                        throw e5.m("Invalid rect");
                                    }
                                    View rootView3 = mVar.getRootView();
                                    rootView3.getClass();
                                    ViewGroup viewGroup = (ViewGroup) rootView3;
                                    viewGroup.offsetDescendantRectToMyCoords(mVar.getView(), rectH);
                                    viewGroup.offsetRectIntoDescendantCoords(viewFindNextFocus2, rectH);
                                    if (!m4.m.b(viewFindNextFocus2, numC2, rectH)) {
                                        if (mVar.getFocusOwner().o(i15, false, false)) {
                                            return boolM.booleanValue();
                                        }
                                    }
                                } else if (mVar.getFocusOwner().o(i15, false, false) && (boolM = mVar.getFocusOwner().m(i15, null, new C1749b(gVarA))) != null) {
                                    return boolM.booleanValue();
                                }
                            } else if (mVar.getFocusOwner().o(i15, false, false)) {
                                return boolM.booleanValue();
                            }
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // h5.e2
        public final Object X() {
            return "androidx.compose.ui.layout.WindowInsetsRulers";
        }

        @Override // h5.c0
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final a1 mo5measure3p2s80s(b1 b1Var, y0 y0Var, long j8) {
            v1 v1VarQ = y0Var.Q(j8);
            return b1.Z0(b1Var, v1VarQ.f69144a, v1VarQ.f69145b, this.f91313a, new a(v1VarQ));
        }

        @Override // m5.a
        public final Object s1(c1 c1Var, m5.b bVar, v13.c cVar) {
            long jE = f5.d0.e(c1Var);
            n4.d dVar = (n4.d) bVar.invoke();
            n4.d dVarO = dVar != null ? dVar.o(jE) : null;
            if (dVarO != null) {
                m.this.requestRectangleOnScreen(l1.h(dVarO), false);
            }
            return p005kotlin.Unit.INSTANCE;
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Li5/m$c;", "", "Landroidx/lifecycle/n0;", "lifecycleOwner", "Lnd/e;", "savedStateRegistryOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "viewModelStoreOwner", "<init>", "(Landroidx/lifecycle/n0;Lnd/e;Landroidx/lifecycle/ViewModelStoreOwner;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.lifecycle.n0 f91320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nd.e f91321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ViewModelStoreOwner f91322c;

        public c(androidx.lifecycle.n0 n0Var, nd.e eVar, ViewModelStoreOwner viewModelStoreOwner) {
            this.f91320a = n0Var;
            this.f91321b = eVar;
            this.f91322c = viewModelStoreOwner;
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx4/a;", "it", "", "request-iuPiT84", "(I)Z", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d implements x4.b {
        public d(m mVar) {
        }
    }

    @p005kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class e extends p005kotlin.jvm.internal.q implements e23.a<j4.g> {
        public e(Object obj) {
            super(0, obj, h0.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1);
        }

        @Override // e23.a
        public final j4.g invoke() {
            ContentCaptureSession contentCaptureSessionA;
            View view2 = (View) this.receiver;
            h0.a aVar = h0.f91197a;
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 30) {
                l5.d.a(view2);
            }
            if (i14 < 29 || (contentCaptureSessionA = l5.c.a(view2)) == null) {
                return null;
            }
            return l5.b.f(contentCaptureSessionA, view2);
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class f extends w implements e23.a<Boolean> {
        public f() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.a
        public final Boolean invoke() {
            Boolean bool = (Boolean) m.this.f91295q.getF182175a();
            bool.getClass();
            return bool;
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class g extends w implements e23.a<Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ KeyEvent f91325b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(KeyEvent keyEvent) {
            super(0);
            this.f91325b = keyEvent;
        }

        @Override // e23.a
        public final Boolean invoke() {
            return Boolean.valueOf(m.super.dispatchKeyEvent(this.f91325b));
        }
    }

    @p005kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class h extends p005kotlin.jvm.internal.q implements e23.q<k4.k, n4.g, e23.l<? super q4.f, ? extends p005kotlin.Unit>, Boolean> {
        public h(Object obj) {
            super(3, obj, m.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
        }

        @Override // e23.q
        public final Boolean invoke(k4.k kVar, n4.g gVar, e23.l<? super q4.f, ? extends p005kotlin.Unit> lVar) {
            long j8 = gVar.f123561a;
            e23.l<? super q4.f, ? extends p005kotlin.Unit> lVar2 = lVar;
            m mVar = (m) this.receiver;
            a aVar = m.K1;
            Resources resources = mVar.getContext().getResources();
            k4.b bVar = new k4.b(new g6.d(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j8, lVar2, null);
            return Boolean.valueOf(c0.f91120a.a(mVar, kVar, bVar));
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4/j0;", "it", "", "invoke", "(Lm4/j0;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends w implements e23.l<j0, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r0<j0> f91326a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(r0<j0> r0Var) {
            super(1);
            this.f91326a = r0Var;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, m4.j0] */
        @Override // e23.l
        public final Boolean invoke(j0 j0Var) {
            this.f91326a.f105810a = j0Var;
            return Boolean.TRUE;
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4/j0;", "it", "", "invoke", "(Lm4/j0;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class j extends w implements e23.l<j0, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f91327a = new j();

        public j() {
            super(1);
        }

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Boolean invoke(j0 j0Var) {
            return Boolean.TRUE;
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4/g;", "it", "", "invoke-3ESFkO8", "(I)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class k extends w implements e23.l<m4.g, p005kotlin.Unit> {
        public k() {
            super(1);
        }

        @Override // e23.l
        public final p005kotlin.Unit invoke(m4.g gVar) {
            m.this.getFocusOwner().k(gVar.f116475a, false);
            return p005kotlin.Unit.INSTANCE;
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lz5/c;", "invoke", "()Lz5/c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class l extends w implements e23.a<z5.c> {
        public l() {
            super(0);
        }

        @Override // e23.a
        public final z5.c invoke() {
            h7.g gVarA = h7.e.a(m.this.getConfiguration());
            if (gVarA.f82328a.isEmpty()) {
                gVarA = h7.g.b(LocaleList.getDefault());
            }
            h7.h hVar = gVarA.f82328a;
            int size = hVar.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i14 = 0; i14 < size; i14++) {
                Locale locale = hVar.get(i14);
                locale.getClass();
                arrayList.add(new z5.b(locale));
            }
            return new z5.c(arrayList);
        }
    }

    /* JADX INFO: renamed from: i5.m$m, reason: collision with other inner class name */
    @p005kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li5/v1;", "invoke", "()Li5/v1;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class C1750m extends w implements e23.a<v1> {
        public C1750m() {
            super(0);
        }

        @Override // e23.a
        public final v1 invoke() {
            return x0.a(m.this);
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"i5/m$n", "Lb5/x;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class n implements b5.x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b5.w f91331a;

        public n() {
            b5.w.f15928a.getClass();
            b5.b bVar = b5.w.a.f15930b;
        }

        @Override // b5.x
        public final void a(b5.w wVar) {
            if (wVar == null) {
                b5.w.f15928a.getClass();
                wVar = b5.w.a.f15930b;
            }
            f0.f91175a.a(m.this, wVar);
        }

        @Override // b5.x
        /* JADX INFO: renamed from: b, reason: from getter */
        public final b5.w getF91331a() {
            return this.f91331a;
        }

        @Override // b5.x
        public final void c(b5.w wVar) {
            this.f91331a = wVar;
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class o extends w implements e23.a<p005kotlin.Unit> {
        public o() {
            super(0);
        }

        @Override // e23.a
        public final p005kotlin.Unit invoke() {
            int actionMasked;
            m mVar = m.this;
            MotionEvent motionEvent = mVar.f91299s1;
            if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                mVar.f91301t1 = SystemClock.uptimeMillis();
                mVar.post(mVar.f91310y1);
            }
            return p005kotlin.Unit.INSTANCE;
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"i5/m$p", "Ljava/lang/Runnable;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class p implements Runnable {
        public p() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int actionMasked;
            m mVar = m.this;
            mVar.removeCallbacks(this);
            MotionEvent motionEvent = mVar.f91299s1;
            if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                return;
            }
            int i14 = 7;
            if (actionMasked != 7 && actionMasked != 9) {
                i14 = 2;
            }
            int i15 = i14;
            m mVar2 = m.this;
            mVar2.g0(motionEvent, i15, mVar2.f91301t1, false);
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"i5/m$q", "Lh5/x0;", "Li5/m$b;", "Li5/m;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class q extends x0<b> {
        public q() {
        }

        @Override // h5.x0
        public final r.c create() {
            return m.this.new b();
        }

        @Override // h5.x0
        public final boolean equals(Object obj) {
            return obj == this;
        }

        @Override // h5.x0
        public final int hashCode() {
            return m.this.hashCode();
        }

        @Override // h5.x0
        public final void inspectableProperties(m2 m2Var) {
            m2Var.f91341a = "rootModifier";
        }

        @Override // h5.x0
        public final /* bridge */ /* synthetic */ void update(r.c cVar) {
        }
    }

    /* JADX INFO: renamed from: i5.m$r, reason: from Kotlin metadata */
    @p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "command", "invoke", "(Le23/a;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class Function0 extends w implements e23.l<e23.a<? extends p005kotlin.Unit>, p005kotlin.Unit> {
        public Function0() {
            super(1);
        }

        @Override // e23.l
        public final p005kotlin.Unit invoke(e23.a<? extends p005kotlin.Unit> aVar) {
            e23.a<? extends p005kotlin.Unit> aVar2 = aVar;
            m mVar = m.this;
            mVar.getUncaughtExceptionHandler$ui();
            Handler handler = mVar.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                aVar2.invoke();
            } else {
                Handler handler2 = mVar.getHandler();
                if (handler2 != null) {
                    handler2.post(new com.garmin.android.music.c(aVar2, 3));
                }
            }
            return p005kotlin.Unit.INSTANCE;
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li5/m$c;", "invoke", "()Li5/m$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class s extends w implements e23.a<c> {
        public s() {
            super(0);
        }

        @Override // e23.a
        public final c invoke() {
            return m.this.get_viewTreeOwners();
        }
    }

    static {
        p005kotlin.jvm.internal.j jVar = null;
        K1 = new a(jVar);
        O1 = new p1.q0<>(0, 1, jVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(Context context, s1 s1Var) {
        g6.o oVar;
        int i14;
        super(context);
        this.f91262a = p0.n(s1Var);
        n4.c.f123541b.getClass();
        this.f91264b = n4.c.f123543d;
        int i15 = 1;
        this.f91266c = true;
        boolean z14 = h4.e.f81542d;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        this.sharedDrawScope = z14 ? s1Var.f91460r : new h0(0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
        this.retainedValuesStore = b4.a.f15688a;
        this.f91278i = new p13.k<>();
        int i16 = 0;
        this.f91280j = new kotlin.l(this, i16);
        g6.e eVarB = xy2.b.b(context);
        x2 x2Var = x2.f135386a;
        x2Var.getClass();
        this.f91282k = new c2(eVarB, x2Var);
        this.f91287m = new v(this, this);
        this.coroutineContext = s1Var.f91444b.getF135297x();
        this.dragAndDropManager = new k4.a(new h(this));
        this.f91293p = new p2();
        this.f91295q = p0.n(Boolean.FALSE);
        this.f91297r = p0.f(new f());
        this.f91300t = z14 ? s1Var.f91462t : new z();
        this.f91303v = h4.e.f81543e ? s1Var.f91459q : new u0(ViewConfiguration.get(context));
        this.insetsListener = new f5.v(this);
        h5.e0 e0Var = new h5.e0(false, 0, 3, null);
        e0Var.i(b2.f68904b);
        e0Var.m(getDensity());
        e0Var.d(getViewConfiguration());
        e0Var.f(new q().then(getFocusOwner().getF116530e()).then(getDragAndDropManager().f102800d));
        this.root = e0Var;
        this.layoutNodes = p1.o.a();
        this.rectManager = new q5.e(m328getLayoutNodes(), this);
        this.semanticsOwner = new b0(getRoot(), new p5.h(), m328getLayoutNodes());
        u uVar = new u(this);
        this.B = uVar;
        this.contentCaptureManager = new j4.a(this, new e(this));
        this.accessibilityManager = h4.e.f81541c ? s1Var.f91452j : new kotlin.i(context);
        this.E = new o4.e(this);
        this.autofillTree = new i4.p();
        this.I = new p1.q0<>(i16, i15, objArr4 == true ? 1 : 0);
        this.H0 = new b5.m();
        this.I0 = new e0(getRoot());
        this.J0 = p0.n(new Configuration(context.getResources().getConfiguration()));
        this.K0 = p0.f(new l());
        this.L0 = new i4.a(this, getAutofillTree());
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw e5.m("Autofill service could not be located.");
        }
        this._autofillManager = new i4.b(new i4.v(autofillManager), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        boolean z15 = h4.e.f81544f;
        this.clipboardManager = z15 ? s1Var.f91454l : new kotlin.k(context);
        this.clipboard = z15 ? s1Var.f91455m : new kotlin.j(getClipboardManager());
        this.snapshotObserver = new r1(new Function0());
        this.V0 = new h5.q0(getRoot());
        long j8 = Integer.MAX_VALUE;
        g6.k.a aVar = g6.k.f76003b;
        this.W0 = (j8 & 4294967295L) | (j8 << 32);
        this.X0 = new int[]{0, 0};
        float[] fArrB = o4.a1.b();
        this.Y0 = fArrB;
        this.Z0 = o4.a1.b();
        this.f91263a1 = o4.a1.b();
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.f91269d1 = n4.c.f123542c;
        this.f91271e1 = p0.n(null);
        this.f91273f1 = p0.f(new s());
        this.f91281j1 = new AtomicReference<>(null);
        boolean z16 = h4.e.f81548j;
        this.fontLoader = z16 ? s1Var.f91456n : new i0(context);
        this.fontFamilyResolver = z16 ? s1Var.f91457o : new c2(u.a(context), x2Var);
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = m4.m.f116498a;
        if (layoutDirection != 0) {
            oVar = layoutDirection != 1 ? null : g6.o.Rtl;
        } else {
            oVar = g6.o.Ltr;
        }
        this.f91290n1 = p0.n(oVar == null ? g6.o.Ltr : oVar);
        this.hapticFeedBack = h4.e.f81546h ? s1Var.f91458p : new w4.c(this);
        if (isInTouchMode()) {
            x4.a.f188647b.getClass();
            i14 = x4.a.f188648c;
        } else {
            x4.a.f188647b.getClass();
            i14 = x4.a.f188649d;
        }
        this.f91294p1 = new x4.d(i14, new d(this), objArr3 == true ? 1 : 0);
        this.modifierLocalManager = new g5.e(this);
        this.f91298r1 = new p0(this);
        this.f91302u1 = new g4<>();
        this.f91304v1 = new p1.q0<>(i16, i15, objArr2 == true ? 1 : 0);
        this.f91310y1 = new p();
        this.f91312z1 = new kotlin.l(this, i15);
        this.B1 = new f2(context, new k());
        this.C1 = new o();
        int i17 = Build.VERSION.SDK_INT;
        this.D1 = i17 < 29 ? new e1(fArrB, objArr == true ? 1 : 0) : new f1();
        addOnAttachStateChangeListener(this.contentCaptureManager);
        setWillNotDraw(false);
        setFocusable(true);
        g0.f91189a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        s0.r(this, uVar);
        e4.f91171d0.getClass();
        setOnDragListener(getDragAndDropManager());
        getRoot().q(this);
        if (i17 >= 29) {
            b0.f91086a.a(this);
        }
        if (X()) {
            View view2 = new View(context);
            view2.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view2.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.f91285l = view2;
            addView(view2, -1);
        }
        this.G1 = i17 >= 31 ? new o5.k() : null;
        this.I1 = new n();
    }

    public static final void M(m mVar, int i14, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iB;
        u uVar = mVar.B;
        if (p005kotlin.jvm.internal.s.g(str, uVar.D)) {
            int iB2 = uVar.B.b(i14);
            if (iB2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iB2);
                return;
            }
            return;
        }
        if (!p005kotlin.jvm.internal.s.g(str, uVar.E) || (iB = uVar.C.b(i14)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iB);
    }

    public static void Q(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = viewGroup.getChildAt(i14);
            if (childAt instanceof m) {
                ((m) childAt).p();
            } else if (childAt instanceof ViewGroup) {
                Q((ViewGroup) childAt);
            }
        }
    }

    public static long R(int i14) {
        int mode = View.MeasureSpec.getMode(i14);
        int size = View.MeasureSpec.getSize(i14);
        if (mode == Integer.MIN_VALUE) {
            o13.z.a aVar = o13.z.f128618b;
            return (((long) 0) << 32) | ((long) size);
        }
        if (mode == 0) {
            o13.z.a aVar2 = o13.z.f128618b;
            return (((long) 0) << 32) | ((long) Integer.MAX_VALUE);
        }
        if (mode != 1073741824) {
            j20.x.h();
            return 0L;
        }
        long j8 = size;
        o13.z.a aVar3 = o13.z.f128618b;
        return j8 | (j8 << 32);
    }

    public static View S(int i14, View view2) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (p005kotlin.jvm.internal.s.g(declaredMethod.invoke(view2, null), Integer.valueOf(i14))) {
                return view2;
            }
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View viewS = S(i14, viewGroup.getChildAt(i15));
                    if (viewS != null) {
                        return viewS;
                    }
                }
            }
        }
        return null;
    }

    public static void V(h5.e0 e0Var) {
        e0Var.S();
        q3.c<h5.e0> cVarN = e0Var.N();
        h5.e0[] e0VarArr = cVarN.f142356a;
        int i14 = cVarN.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            V(e0VarArr[i15]);
        }
    }

    public static boolean X() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean Y(MotionEvent motionEvent) {
        boolean z14 = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z14) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i14 = 1; i14 < pointerCount; i14++) {
                z14 = (Float.floatToRawIntBits(motionEvent.getX(i14)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i14)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !v2.f91603a.a(motionEvent, i14));
                if (z14) {
                    break;
                }
            }
        }
        return z14;
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.f91297r.getF182175a()).booleanValue();
    }

    @o13.e
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    private final n0 getLegacyTextInputServiceAndroid() {
        n0 n0Var = this.f91277h1;
        if (n0Var != null) {
            return n0Var;
        }
        n0 n0Var2 = new n0(getView(), this);
        this.f91277h1 = n0Var2;
        return n0Var2;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m325getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @o13.e
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final s1 get_composeViewContext() {
        return (s1) this.f91262a.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final c get_viewTreeOwners() {
        return (c) this.f91271e1.getF182175a();
    }

    private final void setAttached(boolean z14) {
        this.f91295q.setValue(Boolean.valueOf(z14));
    }

    private void setDensity(g6.c cVar) {
        this.f91282k.setValue(cVar);
    }

    private void setFontFamilyResolver(w5.q.b bVar) {
        this.fontFamilyResolver.setValue(bVar);
    }

    private void setLayoutDirection(g6.o oVar) {
        this.f91290n1.setValue(oVar);
    }

    private final void set_composeViewContext(s1 s1Var) {
        this.f91262a.setValue(s1Var);
    }

    private final void set_viewTreeOwners(c cVar) {
        this.f91271e1.setValue(cVar);
    }

    @Override // h5.o1
    public final void A(int i14, h5.e0 e0Var) {
        i4.b bVar = this._autofillManager;
        if (bVar != null) {
            View view2 = bVar.f90826c;
            i4.u uVar = bVar.f90824a;
            p1.j0 j0Var = bVar.f90831h;
            if (j0Var.g(i14)) {
                uVar.d(view2, i14, false);
            }
            p5.q qVarY = e0Var.y();
            if (qVarY == null || !ge1.b.i(qVarY)) {
                return;
            }
            j0Var.b(e0Var.f81761b);
            uVar.d(view2, e0Var.f81761b, true);
        }
    }

    @Override // h5.o1
    public final void B(h5.e0 e0Var, boolean z14, boolean z15) {
        h5.j0 j0Var = e0Var.T;
        h5.q0 q0Var = this.V0;
        if (!z14) {
            q0Var.getClass();
            int i14 = h5.q0.b.f81948a[j0Var.f81841d.ordinal()];
            if (i14 == 1 || i14 == 2 || i14 == 3 || i14 == 4) {
                return;
            }
            if (i14 != 5) {
                u0.r();
                return;
            }
            h5.e0 e0VarK = e0Var.K();
            boolean z16 = e0VarK == null || e0VarK.g();
            if (!z15) {
                if (e0Var.G()) {
                    return;
                }
                if (e0Var.F() && e0Var.g() == z16 && e0Var.g() == j0Var.f81853p.f81971w) {
                    return;
                }
            }
            h5.r0 r0Var = j0Var.f81853p;
            r0Var.f81973y = true;
            r0Var.f81974z = true;
            if (!e0Var.M0 && r0Var.f81971w && z16) {
                if ((e0VarK == null || !e0VarK.F()) && (e0VarK == null || !e0VarK.G())) {
                    q0Var.f81937b.a(e0Var, h5.z.Placement);
                }
                if (q0Var.f81939d) {
                    return;
                }
                e0(null);
                return;
            }
            return;
        }
        h5.p pVar = q0Var.f81937b;
        int i15 = h5.q0.b.f81948a[j0Var.f81841d.ordinal()];
        if (i15 != 1) {
            if (i15 != 2) {
                if (i15 == 3) {
                    return;
                }
                if (i15 != 4 && i15 != 5) {
                    u0.r();
                    return;
                }
            }
            if ((j0Var.f81842e || j0Var.f81843f) && !z15) {
                return;
            }
            j0Var.f81843f = true;
            j0Var.f81844g = true;
            h5.r0 r0Var2 = j0Var.f81853p;
            r0Var2.f81973y = true;
            r0Var2.f81974z = true;
            if (e0Var.M0) {
                return;
            }
            h5.e0 e0VarK2 = e0Var.K();
            if (p005kotlin.jvm.internal.s.g(e0Var.W(), Boolean.TRUE) && ((e0VarK2 == null || !e0VarK2.T.f81842e) && (e0VarK2 == null || !e0VarK2.T.f81843f))) {
                pVar.a(e0Var, h5.z.LookaheadPlacement);
            } else if (e0Var.g() && ((e0VarK2 == null || !e0VarK2.F()) && (e0VarK2 == null || !e0VarK2.G()))) {
                pVar.a(e0Var, h5.z.Placement);
            }
            if (q0Var.f81939d) {
                return;
            }
            e0(null);
        }
    }

    @Override // h5.o1
    public final void C(e23.a<p005kotlin.Unit> aVar) {
        p1.q0<e23.a<p005kotlin.Unit>> q0Var = this.f91304v1;
        if (q0Var.c(aVar) >= 0) {
            return;
        }
        q0Var.g(aVar);
    }

    @Override // h5.o1
    public final void D() {
        u uVar = this.B;
        uVar.f91564x = true;
        boolean z14 = h4.e.f81547i;
        Handler handler = z14 ? uVar.f91542a.getHandler() : uVar.f91548g;
        if (uVar.m() && !uVar.T && handler != null) {
            uVar.T = true;
            handler.post(uVar.Y);
        }
        j4.a aVar = this.contentCaptureManager;
        aVar.f96969g = true;
        Handler handler2 = z14 ? aVar.f96963a.getHandler() : aVar.f96971i;
        if (!aVar.e() || aVar.f96976n || handler2 == null) {
            return;
        }
        aVar.f96976n = true;
        handler2.post(aVar.f96977o);
    }

    @Override // h5.o1
    public final void E(h5.c.b bVar) {
        this.V0.f81941f.b(bVar);
        e0(null);
    }

    @Override // h5.o1
    public final void F(h5.e0 e0Var) {
        u uVar = this.B;
        uVar.f91564x = true;
        if (uVar.m()) {
            uVar.n(e0Var);
        }
        j4.a aVar = this.contentCaptureManager;
        aVar.f96969g = true;
        if (aVar.e()) {
            aVar.f96970h.i(p005kotlin.Unit.INSTANCE);
        }
    }

    @Override // h5.o1
    public final void G(int i14, h5.e0 e0Var) {
        m328getLayoutNodes().g(i14);
        m328getLayoutNodes().i(e0Var.f81761b, e0Var);
    }

    @Override // m4.q0
    public final boolean H(int i14) {
        if (!h4.i.f81559a) {
            m4.g.f116466b.getClass();
            if (i14 == m4.g.f116473i || i14 == m4.g.f116474j) {
                return false;
            }
            Integer numC = m4.m.c(i14);
            if (numC == null) {
                throw e5.m("Invalid focus direction");
            }
            int iIntValue = numC.intValue();
            n4.d embeddedViewFocusRect = getEmbeddedViewFocusRect();
            Rect rectH = embeddedViewFocusRect != null ? l1.h(embeddedViewFocusRect) : null;
            FocusFinder focusFinder = FocusFinder.getInstance();
            View viewFindNextFocus = rectH == null ? focusFinder.findNextFocus(this, findFocus(), iIntValue) : focusFinder.findNextFocusFromRect(this, rectH, iIntValue);
            if (viewFindNextFocus != null) {
                return m4.m.b(viewFindNextFocus, Integer.valueOf(iIntValue), rectH);
            }
            return false;
        }
        m4.g.f116466b.getClass();
        if (i14 == m4.g.f116473i || i14 == m4.g.f116474j) {
            return false;
        }
        Integer numC2 = m4.m.c(i14);
        if (numC2 == null) {
            throw e5.m("Invalid focus direction");
        }
        int iIntValue2 = numC2.intValue();
        j0 j0VarF = getFocusOwner().f();
        if (j0VarF == null) {
            vb.h.z("findNextViewInEmbeddedView called when owner does not have anything focused.");
            return false;
        }
        Integer numC3 = m4.m.c(i14);
        if (numC3 == null) {
            throw e5.m("Invalid focus direction");
        }
        int iIntValue3 = numC3.intValue();
        p002j6.a aVar = h5.k.g(j0VarF).f81775o;
        View view2 = aVar != null ? aVar.getView() : null;
        View viewFindFocus = findFocus();
        FocusFinder focusFinder2 = FocusFinder.getInstance();
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus2 = focusFinder2.findNextFocus((ViewGroup) rootView, viewFindFocus, iIntValue3);
        if (viewFindNextFocus2 == null || view2 == null || !h0.a(view2, viewFindNextFocus2)) {
            viewFindNextFocus2 = null;
        }
        if (viewFindNextFocus2 != null) {
            return m4.m.b(viewFindNextFocus2, Integer.valueOf(iIntValue2), null);
        }
        return false;
    }

    @Override // h5.o1
    public final void I() {
        this.J1--;
        getView().setKeepScreenOn(this.J1 > 0);
    }

    @Override // h5.o1
    public final void J(h5.e0 e0Var) {
        h5.l1 l1Var = this.V0.f81940e;
        l1Var.getClass();
        if (e0Var.L0 > 0) {
            l1Var.f81884a.b(e0Var);
            e0Var.K0 = true;
        }
        e0(null);
    }

    @Override // h5.o1
    public final void K(h5.e0 e0Var, boolean z14) {
        this.V0.g(e0Var, z14);
    }

    @Override // h5.o1
    public final void L(h5.e0 e0Var) {
        i4.b bVar = this._autofillManager;
        if (bVar != null) {
            bVar.f90827d.f142832b.e(e0Var.f81761b, new i4.d(bVar, e0Var));
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    public final int T(MotionEvent motionEvent) {
        int actionMasked;
        MotionEvent motionEvent2;
        m mVar;
        removeCallbacks(this.f91310y1);
        try {
            d0(motionEvent);
            this.f91267c1 = true;
            c(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent3 = this.f91299s1;
                boolean z14 = motionEvent3 != null && motionEvent3.getToolType(0) == 3;
                e0 e0Var = this.I0;
                if (motionEvent3 != null) {
                    try {
                        if (!((motionEvent3.getSource() == motionEvent.getSource() && motionEvent3.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                            motionEvent2 = motionEvent3;
                        } else if (motionEvent3.getButtonState() != 0 || (actionMasked = motionEvent3.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                            motionEvent2 = motionEvent3;
                            if (!e0Var.f15797e) {
                                e0Var.f15795c.f15766a.a();
                                e0Var.f15794b.c();
                            }
                        } else if (motionEvent3.getActionMasked() == 10 || !z14) {
                            motionEvent2 = motionEvent3;
                        } else {
                            g0(motionEvent3, 10, motionEvent3.getEventTime(), true);
                            motionEvent2 = motionEvent3;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    motionEvent2 = motionEvent3;
                }
                boolean z15 = motionEvent.getToolType(0) == 3;
                if (z14 || !z15 || actionMasked2 == 3 || actionMasked2 == 9 || !Z(motionEvent)) {
                    mVar = this;
                } else {
                    mVar = this;
                    mVar.g0(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent4 = mVar.f91299s1;
                if (motionEvent4 != null && motionEvent4.getAction() == 10) {
                    MotionEvent motionEvent5 = mVar.f91299s1;
                    int pointerId = motionEvent5 != null ? motionEvent5.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    b5.m mVar2 = mVar.H0;
                    if (action == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            mVar2.f15839c.delete(pointerId);
                            mVar2.f15838b.delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent6 = mVar.f91299s1;
                        float x14 = motionEvent6 != null ? motionEvent6.getX() : Float.NaN;
                        MotionEvent motionEvent7 = mVar.f91299s1;
                        boolean z16 = (x14 == motionEvent.getX() && (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent8 = mVar.f91299s1;
                        boolean z17 = (motionEvent8 != null ? motionEvent8.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z16 || z17) {
                            if (pointerId >= 0) {
                                mVar2.f15839c.delete(pointerId);
                                mVar2.f15838b.delete(pointerId);
                            }
                            b5.f fVar = e0Var.f15794b;
                            if (fVar.f15801d) {
                                fVar.f15801d = true;
                            } else {
                                fVar.f15804g.f15865a.g();
                            }
                        }
                    }
                }
                mVar.f91299s1 = MotionEvent.obtainNoHistory(motionEvent);
                int iF0 = f0(motionEvent);
                Trace.endSection();
                mVar.f91267c1 = false;
                return iF0;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            this.f91267c1 = false;
            throw th5;
        }
    }

    public final q2 U(androidx.lifecycle.n0 n0Var, ViewModelStoreOwner viewModelStoreOwner) {
        r2.a aVar = this.frameEndScheduler;
        Object obj = null;
        if (n0Var == null || viewModelStoreOwner == null || aVar == null) {
            return null;
        }
        r2 r2Var = (r2) androidx.lifecycle.x1.b.b(androidx.lifecycle.x1.f8070b, viewModelStoreOwner.getF189591b(), new androidx.lifecycle.x1.d()).b(p005kotlin.jvm.internal.s0.f105811a.b(r2.class));
        Object parent = getParent();
        parent.getClass();
        int id3 = ((View) parent).getId();
        i0<p1.q0<r2.b>> i0Var = r2Var.f91425a;
        p1.q0<r2.b> q0VarB = i0Var.b(id3);
        if (q0VarB == null) {
            q0VarB = new p1.q0<>(1);
            i0Var.i(id3, q0VarB);
        }
        p1.q0<r2.b> q0Var = q0VarB;
        Object[] objArr = q0Var.f134667a;
        int i14 = q0Var.f134668b;
        for (int i15 = 0; i15 < i14; i15++) {
            Object obj2 = objArr[i15];
            if (!((r2.b) obj2).f91428c) {
                obj = obj2;
                break;
            }
        }
        r2.b bVar = (r2.b) obj;
        if (bVar == null) {
            bVar = new r2.b();
            q0Var.g(bVar);
        }
        bVar.f91428c = true;
        this.f91274g = bVar;
        return bVar.f91427b;
    }

    public final void W(h5.e0 e0Var) {
        this.V0.r(e0Var, false);
        q3.c<h5.e0> cVarN = e0Var.N();
        h5.e0[] e0VarArr = cVarN.f142356a;
        int i14 = cVarN.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            W(e0VarArr[i15]);
        }
    }

    public final boolean Z(MotionEvent motionEvent) {
        float x14 = motionEvent.getX();
        float y14 = motionEvent.getY();
        return 0.0f <= x14 && x14 <= ((float) getWidth()) && 0.0f <= y14 && y14 <= ((float) getHeight());
    }

    @Override // m4.q0
    public final boolean a() {
        if (h4.i.f81559a) {
            if (isFocused()) {
                return true;
            }
        } else if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final boolean a0(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f91299s1) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i14, int i15) {
        if (!h4.i.f81559a) {
            super.addFocusables(arrayList, i14, i15);
            return;
        }
        if (getFocusOwner().s()) {
            super.addFocusables(arrayList, i14, i15);
            if (getFocusOwner().t() || arrayList == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view2, int i14) {
        view2.getClass();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view2, i14, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray<AutofillValue> sparseArray) {
        e23.l<String, p005kotlin.Unit> lVar;
        p5.q qVarY;
        e23.l lVar2;
        e23.l lVar3;
        i4.b bVar = this._autofillManager;
        if (bVar != null) {
            int size = sparseArray.size();
            for (int i14 = 0; i14 < size; i14++) {
                int iKeyAt = sparseArray.keyAt(i14);
                AutofillValue autofillValue = sparseArray.get(iKeyAt);
                h5.e0 e0VarB = bVar.f90825b.f135953c.b(iKeyAt);
                if (e0VarB != null && (qVarY = e0VarB.y()) != null) {
                    p5.p.f136057a.getClass();
                    p5.a aVar = (p5.a) p5.r.a(qVarY, p5.p.f136064h);
                    if (aVar != null && (lVar3 = (e23.l) aVar.f135946b) != null) {
                        i4.j.f90842a.getClass();
                    }
                    p5.a aVar2 = (p5.a) p5.r.a(qVarY, p5.p.f136065i);
                    if (aVar2 != null && (lVar2 = (e23.l) aVar2.f135946b) != null) {
                    }
                }
            }
        }
        i4.a aVar3 = this.L0;
        if (aVar3 != null) {
            i4.p pVar = aVar3.f90821b;
            if (pVar.f90849a.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i15 = 0; i15 < size2; i15++) {
                int iKeyAt2 = sparseArray.keyAt(i15);
                AutofillValue autofillValue2 = sparseArray.get(iKeyAt2);
                i4.j.f90842a.getClass();
                if (autofillValue2.isText()) {
                    String string = autofillValue2.getTextValue().toString();
                    i4.o oVar = (i4.o) pVar.f90849a.get(Integer.valueOf(iKeyAt2));
                    if (oVar != null && (lVar = oVar.f90848c) != null) {
                        lVar.invoke(string);
                        p005kotlin.Unit unit = p005kotlin.Unit.INSTANCE;
                    }
                } else {
                    if (autofillValue2.isDate()) {
                        throw new o13.o("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new o13.o("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new o13.o("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // m4.q0
    public final void b() {
        if (!isFocused()) {
            boolean z14 = h4.i.f81559a;
            if (!hasFocus()) {
                if (hasFocus()) {
                    View viewFindFocus = findFocus();
                    if (viewFindFocus != null) {
                        viewFindFocus.clearFocus();
                    }
                    clearFocus();
                    return;
                }
                return;
            }
        }
        clearFocus();
    }

    public final void b0(n1 n1Var, boolean z14) {
        boolean z15 = this.T;
        p1.q0<n1> q0Var = this.I;
        if (!z14) {
            if (z15) {
                return;
            }
            q0Var.k(n1Var);
            p1.q0<n1> q0Var2 = this.P;
            if (q0Var2 != null) {
                q0Var2.k(n1Var);
                return;
            }
            return;
        }
        if (!z15) {
            q0Var.g(n1Var);
            return;
        }
        p1.q0<n1> q0Var3 = this.P;
        if (q0Var3 == null) {
            q0Var3 = new p1.q0<>(0, 1, null);
            this.P = q0Var3;
        }
        q0Var3.g(n1Var);
    }

    @Override // h5.o1
    public final void c(boolean z14) {
        o oVar;
        h5.q0 q0Var = this.V0;
        if (q0Var.f81937b.c() || q0Var.f81940e.f81884a.f142358c != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z14) {
                try {
                    oVar = this.C1;
                } finally {
                    Trace.endSection();
                }
            } else {
                oVar = null;
            }
            if (q0Var.l(oVar)) {
                requestLayout();
            }
            q0Var.b(false);
            getRectManager().a();
            if (this.f91283k0) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.f91283k0 = false;
            }
            p005kotlin.Unit unit = p005kotlin.Unit.INSTANCE;
        }
    }

    public final void c0() {
        if (this.f91267c1) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = jCurrentAnimationTimeMillis;
            d1 d1Var = this.D1;
            float[] fArr = this.Z0;
            d1Var.a(this, fArr);
            o3.a(fArr, this.f91263a1);
            ViewParent parent = getParent();
            View view2 = this;
            while (parent instanceof ViewGroup) {
                view2 = (View) parent;
                parent = ((ViewGroup) view2).getParent();
            }
            int[] iArr = this.X0;
            view2.getLocationOnScreen(iArr);
            float f14 = iArr[0];
            float f15 = iArr[1];
            view2.getLocationInWindow(iArr);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14 - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f15 - iArr[1])) & 4294967295L);
            n4.c.a aVar = n4.c.f123541b;
            this.f91269d1 = jFloatToRawIntBits;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i14) {
        return this.B.d(this.f91264b, i14, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i14) {
        return this.B.d(this.f91264b, i14, true);
    }

    @Override // h5.o1
    public final void d(h5.e0 e0Var) {
        m328getLayoutNodes().i(e0Var.f81761b, e0Var);
    }

    public final void d0(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        d1 d1Var = this.D1;
        float[] fArr = this.Z0;
        d1Var.a(this, fArr);
        o3.a(fArr, this.f91263a1);
        float x14 = motionEvent.getX();
        float y14 = motionEvent.getY();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x14)) << 32) | (((long) Float.floatToRawIntBits(y14)) & 4294967295L);
        n4.c.a aVar = n4.c.f123541b;
        long jC = o4.a1.c(jFloatToRawIntBits, fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jC >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jC & 4294967295L));
        this.f91269d1 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        p1.q0<n1> q0Var = this.I;
        if (!isAttachedToWindow()) {
            V(getRoot());
        }
        c(true);
        f4.f.f68735e.getClass();
        f4.l.i().m();
        this.T = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            z zVar = this.f91300t;
            o4.c cVar = zVar.f129040a;
            Canvas canvas2 = cVar.f128816a;
            cVar.f128816a = canvas;
            getRoot().v(cVar, null);
            zVar.f129040a.f128816a = canvas2;
            if (q0Var.e()) {
                int i14 = q0Var.f134668b;
                for (int i15 = 0; i15 < i14; i15++) {
                    q0Var.b(i15).h();
                }
            }
            b4.f91091r.getClass();
            if (b4.f91097z) {
                int iSave = canvas.save();
                canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
                super.dispatchDraw(canvas);
                canvas.restoreToCount(iSave);
            }
            q0Var.j();
            this.T = false;
            p005kotlin.Unit unit = p005kotlin.Unit.INSTANCE;
            Trace.endSection();
            p1.q0<n1> q0Var2 = this.P;
            if (q0Var2 != null) {
                q0Var.i(q0Var2);
                q0Var2.j();
            }
            if (X()) {
                b1.a(this, this.f91306w1);
                View view2 = this.f91285l;
                if (view2 != null) {
                    b1.a(view2, this.f91308x1);
                    if (!Float.isNaN(this.f91308x1)) {
                        view2.invalidate();
                        drawChild(canvas, view2, getDrawingTime());
                    }
                }
                this.f91306w1 = Float.NaN;
                this.f91308x1 = Float.NaN;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x026d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0294  */
    /* JADX WARN: Code duplicated, block: B:122:0x029c  */
    /* JADX WARN: Code duplicated, block: B:59:0x017e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0187  */
    /* JADX WARN: Code duplicated, block: B:63:0x018f  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ce  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        int actionIndex;
        int i14;
        y4.a aVar;
        int i15;
        int i16;
        long jValueAt;
        char c14;
        int i17;
        long eventTime;
        long jFloatToRawIntBits;
        boolean z14;
        int i18;
        boolean z15;
        if (this.A1) {
            kotlin.l lVar = this.f91312z1;
            removeCallbacks(lVar);
            if (motionEvent.getActionMasked() == 8) {
                this.A1 = false;
            } else {
                lVar.run();
            }
        }
        if (Y(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int i19 = 1;
        if (motionEvent.getActionMasked() == 8) {
            if (!motionEvent.isFromSource(4194304)) {
                return (T(motionEvent) & 4) != 0;
            }
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            float f14 = -motionEvent.getAxisValue(26);
            getContext();
            float scaledVerticalScrollFactor = viewConfiguration.getScaledVerticalScrollFactor() * f14;
            getContext();
            return getFocusOwner().p(new d5.b(scaledVerticalScrollFactor, viewConfiguration.getScaledHorizontalScrollFactor() * f14, motionEvent.getEventTime(), motionEvent.getDeviceId()), new kotlin.o(this, motionEvent));
        }
        if (motionEvent.isFromSource(2097152)) {
            y4.b bVar = this.primaryDirectionalMotionAxisOverride;
            b5.m mVar = this.H0;
            p1.z<b5.m.a> zVar = mVar.f15841e;
            SparseLongArray sparseLongArray = mVar.f15838b;
            int actionMasked = motionEvent.getActionMasked();
            mVar.b(motionEvent);
            if (actionMasked == 3) {
                sparseLongArray.clear();
                mVar.f15839c.clear();
                aVar = null;
            } else {
                mVar.a(motionEvent);
                if (actionMasked != 1) {
                    actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
                } else {
                    actionIndex = 0;
                }
                boolean z16 = actionMasked == 0 || actionMasked == 2 || actionMasked == 5;
                int pointerCount = motionEvent.getPointerCount();
                ArrayList arrayList = new ArrayList(pointerCount);
                int i24 = 0;
                while (i24 < pointerCount) {
                    int pointerId = motionEvent.getPointerId(i24);
                    int i25 = i19;
                    int iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
                    if (iIndexOfKey >= 0) {
                        jValueAt = sparseLongArray.valueAt(iIndexOfKey);
                    } else {
                        jValueAt = mVar.f15837a;
                        mVar.f15837a = jValueAt + 1;
                        sparseLongArray.put(pointerId, jValueAt);
                    }
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getX(i24))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY(i24))) & 4294967295L);
                    n4.c.a aVar2 = n4.c.f123541b;
                    boolean z17 = i24 != actionIndex ? i25 : 0;
                    b5.m.a aVarB = zVar.b(jValueAt);
                    if (i24 == actionIndex) {
                        zVar.g(jValueAt);
                    } else {
                        if (z16) {
                            long eventTime2 = 1 | ((motionEvent.getEventTime() & 2147483647L) << i25);
                            b5.m.a.C0224a c0224a = b5.m.a.f15847b;
                            c14 = ' ';
                            short sIntBitsToFloat = (short) Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32));
                            i17 = 65535;
                            short sIntBitsToFloat2 = (short) Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L));
                            c0224a.getClass();
                            zVar.f(jValueAt, b5.m.a.a(eventTime2 | (((long) ((sIntBitsToFloat2 & 65535) | (sIntBitsToFloat << 16))) << 32)));
                        }
                        long eventTime3 = motionEvent.getEventTime();
                        float pressure = motionEvent.getPressure(i24);
                        if (aVarB != null) {
                            eventTime = (aVarB.f15848a >> i25) & 2147483647L;
                        } else {
                            eventTime = motionEvent.getEventTime();
                        }
                        long j8 = eventTime;
                        if (aVarB != null) {
                            int i26 = (int) (aVarB.f15848a >>> c14);
                            b5.m.a.f15847b.getClass();
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits((short) (i26 >>> 16))) << c14) | (((long) Float.floatToRawIntBits((short) (i26 & i17))) & 4294967295L);
                        } else {
                            jFloatToRawIntBits = jFloatToRawIntBits2;
                        }
                        long j14 = jFloatToRawIntBits;
                        if (aVarB != null) {
                            if ((aVarB.f15848a & 1) != 0) {
                                i18 = i25;
                            } else {
                                i18 = 0;
                            }
                            z14 = i18;
                        } else {
                            z14 = 0;
                        }
                        arrayList.add(new y4.d(jValueAt, eventTime3, jFloatToRawIntBits2, z17, pressure, j8, j14, z14, null));
                        i24++;
                        mVar = mVar;
                        i19 = i25;
                        bVar = bVar;
                        actionIndex = actionIndex;
                    }
                    c14 = ' ';
                    i17 = 65535;
                    long eventTime4 = motionEvent.getEventTime();
                    float pressure2 = motionEvent.getPressure(i24);
                    if (aVarB != null) {
                        eventTime = (aVarB.f15848a >> i25) & 2147483647L;
                    } else {
                        eventTime = motionEvent.getEventTime();
                    }
                    long j15 = eventTime;
                    if (aVarB != null) {
                        int i27 = (int) (aVarB.f15848a >>> c14);
                        b5.m.a.f15847b.getClass();
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits((short) (i27 >>> 16))) << c14) | (((long) Float.floatToRawIntBits((short) (i27 & i17))) & 4294967295L);
                    } else {
                        jFloatToRawIntBits = jFloatToRawIntBits2;
                    }
                    long j16 = jFloatToRawIntBits;
                    if (aVarB != null) {
                        if ((aVarB.f15848a & 1) != 0) {
                            i18 = i25;
                        } else {
                            i18 = 0;
                        }
                        z14 = i18;
                    } else {
                        z14 = 0;
                    }
                    arrayList.add(new y4.d(jValueAt, eventTime4, jFloatToRawIntBits2, z17, pressure2, j15, j16, z14, null));
                    i24++;
                    mVar = mVar;
                    i19 = i25;
                    bVar = bVar;
                    actionIndex = actionIndex;
                }
                y4.b bVar2 = bVar;
                int i28 = i19;
                mVar.e(motionEvent);
                if (bVar2 != null) {
                    i14 = bVar2.f194376a;
                } else {
                    if (!motionEvent.isFromSource(2097152)) {
                        vb.h.s("MotionEvent must be a touch navigation source");
                        return false;
                    }
                    InputDevice device = motionEvent.getDevice();
                    if (device != null) {
                        InputDevice.MotionRange motionRange = device.getMotionRange(0);
                        InputDevice.MotionRange motionRange2 = device.getMotionRange(i28);
                        if (motionRange != null && motionRange2 == null) {
                            y4.b.f194373b.getClass();
                            i14 = y4.b.f194374c;
                        } else if (motionRange2 != null && motionRange == null) {
                            y4.b.f194373b.getClass();
                            i14 = y4.b.f194375d;
                        } else if (motionRange == null || motionRange2 == null) {
                            y4.b.f194373b.getClass();
                            i14 = 0;
                        } else {
                            float range = motionRange.getRange();
                            float range2 = motionRange2.getRange();
                            if (range > range2 && (range2 == 0.0f || range / range2 >= 5.0f)) {
                                y4.b.f194373b.getClass();
                                i14 = y4.b.f194374c;
                            } else if (range2 <= range || (range != 0.0f && range2 / range < 5.0f)) {
                                y4.b.f194373b.getClass();
                                i14 = 0;
                            } else {
                                y4.b.f194373b.getClass();
                                i14 = y4.b.f194375d;
                            }
                        }
                    } else {
                        y4.b.f194373b.getClass();
                        i14 = 0;
                    }
                }
                int i29 = i14;
                if (actionMasked == 0) {
                    y4.c.f194377b.getClass();
                    i15 = y4.c.f194378c;
                    i16 = i15;
                } else if (actionMasked == 1) {
                    y4.c.f194377b.getClass();
                    i15 = y4.c.f194379d;
                    i16 = i15;
                } else if (actionMasked == 2) {
                    y4.c.f194377b.getClass();
                    i15 = y4.c.f194380e;
                    i16 = i15;
                } else if (actionMasked == 5) {
                    y4.c.f194377b.getClass();
                    i15 = y4.c.f194378c;
                    i16 = i15;
                } else if (actionMasked != 6) {
                    y4.c.f194377b.getClass();
                    i16 = 0;
                } else {
                    y4.c.f194377b.getClass();
                    i15 = y4.c.f194379d;
                    i16 = i15;
                }
                aVar = new y4.a(arrayList, i16, i29, motionEvent, null);
            }
            f2 f2Var = this.B1;
            if (aVar == null) {
                getFocusOwner().r();
                f2Var.getClass();
                y4.b.f194373b.getClass();
                f2Var.f91179b = 0;
                f2Var.f91180c = true;
                return true;
            }
            boolean zU = getFocusOwner().u(aVar);
            if (h4.i.f81560b) {
                f2Var.getClass();
                MotionEvent motionEvent2 = aVar.f194372c;
                int action = motionEvent2.getAction();
                if (action == 0) {
                    f2Var.f91179b = aVar.f194371b;
                    f2Var.f91180c = false;
                } else if ((action == 1 || action == 2) && zU) {
                    y4.b.f194373b.getClass();
                    f2Var.f91179b = 0;
                    f2Var.f91180c = true;
                }
                f2Var.f91181d.onTouchEvent(motionEvent2);
                z15 = true;
            } else {
                z15 = zU;
            }
            if (z15) {
                return true;
            }
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i14;
        boolean z14 = this.A1;
        kotlin.l lVar = this.f91312z1;
        if (z14) {
            removeCallbacks(lVar);
            lVar.run();
        }
        if (Y(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        u uVar = this.B;
        m mVar = uVar.f91542a;
        AccessibilityManager accessibilityManager = uVar.f91545d;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x14 = motionEvent.getX();
                float y14 = motionEvent.getY();
                mVar.c(true);
                h5.v vVar = new h5.v();
                h5.e0 root = mVar.getRoot();
                long jFloatToRawIntBits = Float.floatToRawIntBits(x14);
                long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(y14)) & 4294967295L;
                n4.c.a aVar = n4.c.f123541b;
                h5.e0.d dVar = h5.e0.N0;
                b5.m0.f15849b.getClass();
                root.P(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), vVar, true);
                p1.q0<Object> q0Var = vVar.f82000a;
                int i15 = q0Var.f134668b - 1;
                while (true) {
                    if (-1 < i15) {
                        Object objB = q0Var.b(i15);
                        objB.getClass();
                        h5.e0 e0VarG = h5.k.g((r.c) objB);
                        if (mVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(e0VarG) == null) {
                            if (e0VarG.P.d(8)) {
                                int iR = uVar.r(e0VarG.f81761b);
                                y yVarA = p5.z.a(e0VarG, false);
                                if (p5.c0.f(yVarA)) {
                                    p5.q qVarK = yVarA.k();
                                    p5.d0.f135959a.getClass();
                                    if (!qVarK.f136085a.b(p5.d0.C)) {
                                        i14 = iR;
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                            i15--;
                        }
                    }
                    i14 = Integer.MIN_VALUE;
                    break;
                }
                mVar.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                int i16 = uVar.f91543b;
                if (i16 != i14) {
                    uVar.f91543b = i14;
                    u.v(uVar, i14, 128, null, 12);
                    u.v(uVar, i16, 256, null, 12);
                }
            } else if (action == 10) {
                int i17 = uVar.f91543b;
                if (i17 == Integer.MIN_VALUE) {
                    mVar.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                } else if (i17 != Integer.MIN_VALUE) {
                    uVar.f91543b = Integer.MIN_VALUE;
                    u.v(uVar, Integer.MIN_VALUE, 128, null, 12);
                    u.v(uVar, i17, 256, null, 12);
                }
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && Z(motionEvent)) {
                if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent2 = this.f91299s1;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f91299s1 = MotionEvent.obtainNoHistory(motionEvent);
                this.A1 = true;
                postDelayed(lVar, 8L);
                return false;
            }
        } else if (!a0(motionEvent)) {
            return false;
        }
        return (T(motionEvent) & 1) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return getFocusOwner().n(keyEvent, new g(keyEvent));
        }
        if (h4.e.f81540b) {
            p2 p2Var = getComposeViewContext().f91461s;
            int metaState = keyEvent.getMetaState();
            p2Var.getClass();
            p2.c(metaState);
        } else {
            int metaState2 = keyEvent.getMetaState();
            this.f91293p.getClass();
            p2.c(metaState2);
        }
        return getFocusOwner().n(keyEvent, m4.t.f116525a) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        return (isFocused() && getFocusOwner().e(keyEvent)) || super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object objA;
        j0 j0VarF;
        if (this.A1) {
            kotlin.l lVar = this.f91312z1;
            removeCallbacks(lVar);
            MotionEvent motionEvent2 = this.f91299s1;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.A1 = false;
            } else {
                lVar.run();
            }
        }
        if (!Y(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || a0(motionEvent))) {
            int iT = T(motionEvent);
            if ((iT & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z14 = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z15 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z14 && z15) {
                Object parent = getParent();
                View view2 = parent instanceof View ? (View) parent : null;
                if (view2 == null || (objA = view2.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    c1.f91121b.getClass();
                    objA = c1.a(c1.f91122c);
                }
                c1.f91121b.getClass();
                if (objA.equals(c1.a(c1.f91122c)) && (j0VarF = getFocusOwner().f()) != null) {
                    c1 c1VarF = h5.k.f(j0VarF);
                    n4.d dVarJ0 = f5.d0.c(c1VarF).j0(c1VarF, true);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L);
                    n4.c.a aVar = n4.c.f123541b;
                    if (!dVarJ0.a(jFloatToRawIntBits)) {
                        getFocusOwner().y(false);
                    }
                }
            }
            if ((iT & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // h5.o1
    public final void e(h5.e0 e0Var) {
        p5.q qVarY;
        i4.b bVar = this._autofillManager;
        if (bVar == null || (qVarY = e0Var.y()) == null || !ge1.b.i(qVarY)) {
            return;
        }
        bVar.f90831h.b(e0Var.f81761b);
        bVar.f90824a.d(bVar.f90826c, e0Var.f81761b, true);
    }

    public final void e0(h5.e0 e0Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (e0Var != null) {
            while (e0Var != null && e0Var.H() == h5.e0.g.InMeasureBlock) {
                if (!this.U0) {
                    h5.e0 e0VarK = e0Var.K();
                    if (e0VarK == null) {
                        break;
                    }
                    long j8 = e0VarK.P.f81682c.f69147d;
                    if (g6.a.h(j8) && g6.a.g(j8)) {
                        break;
                    }
                }
                e0Var = e0Var.K();
            }
            if (e0Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    @Override // b5.n0
    public final long f(long j8) {
        c0();
        long jC = o4.a1.c(j8, this.Z0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f91269d1 >> 32)) + Float.intBitsToFloat((int) (jC >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f91269d1 & 4294967295L)) + Float.intBitsToFloat((int) (jC & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        n4.c.a aVar = n4.c.f123541b;
        return jFloatToRawIntBits;
    }

    public final int f0(MotionEvent motionEvent) {
        b5.d0 d0Var;
        if (this.E1) {
            this.E1 = false;
            if (h4.e.f81540b) {
                p2 p2Var = getComposeViewContext().f91461s;
                int metaState = motionEvent.getMetaState();
                p2Var.getClass();
                p2.c(metaState);
            } else {
                int metaState2 = motionEvent.getMetaState();
                this.f91293p.getClass();
                p2.c(metaState2);
            }
        }
        b5.m mVar = this.H0;
        b5.c0 c0VarC = mVar.c(this, motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        e0 e0Var = this.I0;
        if (c0VarC == null) {
            if (!e0Var.f15797e) {
                e0Var.f15795c.f15766a.a();
                e0Var.f15794b.c();
            }
            return 0;
        }
        List<b5.d0> list = c0VarC.f15770a;
        int size = list.size() - 1;
        if (size < 0) {
            d0Var = null;
            break;
        }
        while (true) {
            int i14 = size - 1;
            d0Var = list.get(size);
            if (d0Var.f15779e && (actionMasked == 0 || actionMasked == 5)) {
                break;
            }
            if (i14 < 0) {
                d0Var = null;
                break;
            }
            size = i14;
        }
        b5.d0 d0Var2 = d0Var;
        if (d0Var2 != null) {
            this.f91264b = d0Var2.f15778d;
        }
        int iA = e0Var.a(c0VarC, this, Z(motionEvent));
        c0VarC.f15771b = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iA & 1) != 0) {
            return iA;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        mVar.f15839c.delete(pointerId);
        mVar.f15838b.delete(pointerId);
        return iA;
    }

    public final View findViewByAccessibilityIdTraversal(int accessibilityId) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return S(accessibilityId, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(accessibilityId));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view2, int i14) {
        n4.d dVarA;
        int i15;
        if (view2 == null || this.V0.f81938c) {
            return super.focusSearch(view2, i14);
        }
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view2, i14);
        if (viewFindNextFocus == null || !h0.a(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view2 != this || (dVarA = getFocusOwner().w()) == null) {
            dVarA = m4.m.a(view2, this);
        }
        m4.g gVarD = m4.m.d(i14);
        if (gVarD != null) {
            i15 = gVarD.f116475a;
        } else {
            m4.g.f116466b.getClass();
            i15 = m4.g.f116472h;
        }
        r0 r0Var = new r0();
        if (getFocusOwner().m(i15, dVarA, new i(r0Var)) == null) {
            return view2;
        }
        if (r0Var.f105810a != 0) {
            if (viewFindNextFocus != null) {
                if (x.a(i15)) {
                    if (!h4.i.f81559a) {
                        return super.focusSearch(view2, i14);
                    }
                } else if (m4.r0.g(m4.m0.b((j0) r0Var.f105810a), m4.m.a(viewFindNextFocus, this), dVarA, i15)) {
                }
            }
            return this;
        }
        if (viewFindNextFocus == null) {
            return super.focusSearch(view2, i14);
        }
        return viewFindNextFocus;
    }

    @Override // q5.b
    public final void g(Object obj) {
        Runnable runnable = obj instanceof Runnable ? (Runnable) obj : null;
        if (runnable == null) {
            return;
        }
        removeCallbacks(runnable);
    }

    public final void g0(MotionEvent motionEvent, int i14, long j8, boolean z14) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i14 != 9 && i14 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i15 = 0; i15 < pointerCount; i15++) {
            pointerPropertiesArr[i15] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i16 = 0; i16 < pointerCount; i16++) {
            pointerCoordsArr[i16] = new MotionEvent.PointerCoords();
        }
        int i17 = 0;
        while (i17 < pointerCount) {
            int i18 = ((actionIndex < 0 || i17 < actionIndex) ? 0 : 1) + i17;
            motionEvent.getPointerProperties(i18, pointerPropertiesArr[i17]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i17];
            motionEvent.getPointerCoords(i18, pointerCoords);
            float f14 = pointerCoords.x;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f14)) << 32);
            n4.c.a aVar = n4.c.f123541b;
            long jF = f(jFloatToRawIntBits);
            pointerCoords.x = Float.intBitsToFloat((int) (jF >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jF & 4294967295L));
            i17++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j8 : motionEvent.getDownTime(), j8, i14, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z14 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        b5.c0 c0VarC = this.H0.c(this, motionEventObtain);
        c0VarC.getClass();
        this.I0.a(c0VarC, this, true);
        motionEventObtain.recycle();
    }

    public final w0 getAndroidViewsHandler$ui() {
        if (this.S0 == null) {
            w0 w0Var = new w0(getContext());
            this.S0 = w0Var;
            addView(w0Var, -1);
            requestLayout();
        }
        w0 w0Var2 = this.S0;
        w0Var2.getClass();
        return w0Var2;
    }

    @Override // h5.o1
    public i4.i getAutofill() {
        return this.L0;
    }

    @Override // h5.o1
    public i4.n getAutofillManager() {
        return this._autofillManager;
    }

    @Override // h5.o1
    public i4.p getAutofillTree() {
        return this.autofillTree;
    }

    public final s1 getComposeViewContext() {
        return get_composeViewContext();
    }

    /* JADX INFO: renamed from: getComposeViewContextIncrementedDuringInit$ui, reason: from getter */
    public final boolean getComposeViewContextIncrementedDuringInit() {
        return this.composeViewContextIncrementedDuringInit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Configuration getConfiguration() {
        return (Configuration) this.J0.getF182175a();
    }

    /* JADX INFO: renamed from: getContentCaptureManager$ui, reason: from getter */
    public final j4.a getContentCaptureManager() {
        return this.contentCaptureManager;
    }

    @Override // h5.o1
    public t13.g getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // h5.o1
    public g6.c getDensity() {
        return (g6.c) this.f91282k.getF182175a();
    }

    @Override // m4.q0
    public n4.d getEmbeddedViewFocusRect() {
        if (isFocused()) {
            return getFocusOwner().w();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return m4.m.a(viewFindFocus, this);
        }
        return null;
    }

    @Override // h5.o1
    public m4.u getFocusOwner() {
        return this.f91287m;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        n4.d embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.f123547a);
            rect.top = Math.round(embeddedViewFocusRect.f123548b);
            rect.right = Math.round(embeddedViewFocusRect.f123549c);
            rect.bottom = Math.round(embeddedViewFocusRect.f123550d);
            return;
        }
        m4.u focusOwner = getFocusOwner();
        m4.g.f116466b.getClass();
        if (p005kotlin.jvm.internal.s.g(focusOwner.m(m4.g.f116472h, null, j.f91327a), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @Override // h5.o1
    public w5.q.b getFontFamilyResolver() {
        return (w5.q.b) this.fontFamilyResolver.getF182175a();
    }

    @Override // h5.o1
    public w5.p.b getFontLoader() {
        return this.fontLoader;
    }

    /* JADX INFO: renamed from: getFrameEndScheduler$ui, reason: from getter */
    public final r2.a getFrameEndScheduler() {
        return this.frameEndScheduler;
    }

    @Override // h5.o1
    public o4.q0 getGraphicsContext() {
        return this.E;
    }

    @Override // h5.o1
    public w4.a getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.V0.f81937b.c() || !this.f91278i.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // h5.o1
    public x4.c getInputModeManager() {
        return this.f91294p1;
    }

    public final f5.v getInsetsListener() {
        return this.insetsListener;
    }

    /* JADX INFO: renamed from: getLastMatrixRecalculationAnimationTime$ui, reason: from getter */
    public final long getLastMatrixRecalculationAnimationTime() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, h5.o1
    public g6.o getLayoutDirection() {
        return (g6.o) this.f91290n1.getF182175a();
    }

    @Override // h5.o1
    public z5.c getLocaleList() {
        return (z5.c) this.K0.getF182175a();
    }

    public long getMeasureIteration() {
        h5.q0 q0Var = this.V0;
        if (!q0Var.f81938c) {
            e5.a.a("measureIteration should be only used during the measure/layout pass");
        }
        return q0Var.f81942g;
    }

    @Override // h5.o1
    public g5.e getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // h5.o1
    public m getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // h5.o1
    public v1.a getPlacementScope() {
        w1.a aVar = w1.f69151a;
        return new f5.r1(this);
    }

    @Override // h5.o1
    public b5.x getPointerIconService() {
        return this.I1;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name and from getter */
    public final y4.b getPrimaryDirectionalMotionAxisOverride() {
        return this.primaryDirectionalMotionAxisOverride;
    }

    @Override // h5.o1
    public q5.e getRectManager() {
        return this.rectManager;
    }

    @Override // h5.o1
    public b4.f getRetainedValuesStore() {
        return this.retainedValuesStore;
    }

    @Override // h5.o1
    public h5.e0 getRoot() {
        return this.root;
    }

    public h5.w1 getRootForTest() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getScrollCaptureInProgress$ui() {
        o5.k kVar;
        if (Build.VERSION.SDK_INT < 31 || (kVar = this.G1) == null) {
            return false;
        }
        return ((Boolean) kVar.f129158a.getF182175a()).booleanValue();
    }

    @Override // h5.o1
    public b0 getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // h5.o1
    public h0 getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // h5.o1
    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? a1.f91082a.a(this) : this.showLayoutBounds;
    }

    @Override // h5.o1
    public r1 getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // h5.o1
    public m3 getSoftwareKeyboardController() {
        u1 u1Var = this.f91284k1;
        if (u1Var != null) {
            return u1Var;
        }
        u1 u1Var2 = new u1(getTextInputService());
        this.f91284k1 = u1Var2;
        return u1Var2;
    }

    @Override // h5.o1
    public m0 getTextInputService() {
        m0 m0Var = this.f91279i1;
        if (m0Var != null) {
            return m0Var;
        }
        h0.a aVar = h0.f91197a;
        n0 legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
        aVar.getClass();
        m0 m0Var2 = new m0(legacyTextInputServiceAndroid);
        this.f91279i1 = m0Var2;
        return m0Var2;
    }

    @Override // h5.o1
    public q3 getTextToolbar() {
        return this.f91298r1;
    }

    public final h5.w1.a getUncaughtExceptionHandler$ui() {
        return null;
    }

    public View getView() {
        return this;
    }

    @Override // h5.o1
    public a4 getViewConfiguration() {
        return this.f91303v;
    }

    public final c getViewTreeOwners() {
        return (c) this.f91273f1.getF182175a();
    }

    @Override // h5.o1
    public h4 getWindowInfo() {
        return h4.e.f81540b ? getComposeViewContext().f91461s : this.f91293p;
    }

    /* JADX INFO: renamed from: get_autofillManager$ui, reason: from getter */
    public final i4.b get_autofillManager() {
        return this._autofillManager;
    }

    @Override // h5.o1
    public final void h() {
        invalidate();
    }

    public final void h0(Configuration configuration) {
        c2 c2Var;
        Configuration configuration2 = getConfiguration();
        if (p005kotlin.jvm.internal.s.g(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(xy2.b.b(getContext()));
        }
        h0.a aVar = h0.f91197a;
        if ((configuration2.diff(configuration) & (-1342235264)) != 0 && (c2Var = this.f91293p.f91382b) != null) {
            c2Var.setValue(x0.a(this));
        }
        if (h4.e.f81548j) {
            return;
        }
        int i14 = Build.VERSION.SDK_INT;
        if ((i14 >= 31 ? configuration2.fontWeightAdjustment : 0) != (i14 >= 31 ? configuration.fontWeightAdjustment : 0)) {
            setFontFamilyResolver(u.a(getContext()));
        }
    }

    @Override // b5.l
    public final void i(float[] fArr) {
        c0();
        o4.a1.h(fArr, this.Z0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f91269d1 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f91269d1 & 4294967295L));
        h0.a aVar = h0.f91197a;
        float[] fArr2 = this.Y0;
        o4.a1.e(fArr2);
        o4.a1.i(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        h0.c(fArr, fArr2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0058  */
    public final void i0() {
        boolean z14;
        int i14;
        int[] iArr = this.X0;
        getLocationOnScreen(iArr);
        long j8 = this.W0;
        g6.k.a aVar = g6.k.f76003b;
        int i15 = (int) (j8 >> 32);
        int i16 = (int) (j8 & 4294967295L);
        int i17 = iArr[0];
        if (i15 == i17 && i16 == iArr[1] && this.lastMatrixRecalculationAnimationTime >= 0) {
            z14 = false;
        } else {
            this.W0 = (4294967295L & ((long) iArr[1])) | (((long) i17) << 32);
            if (i15 == Integer.MAX_VALUE || i16 == Integer.MAX_VALUE) {
                z14 = false;
            } else {
                q3.c<h5.e0> cVarN = getRoot().N();
                h5.e0[] e0VarArr = cVarN.f142356a;
                int i18 = cVarN.f142358c;
                for (int i19 = 0; i19 < i18; i19++) {
                    e0VarArr[i19].T.f81853p.U0();
                }
                z14 = true;
            }
        }
        c0();
        View rootView = this.H1;
        if (rootView == null) {
            rootView = getRootView();
            this.H1 = rootView;
        }
        q5.e rectManager = getRectManager();
        long j14 = this.W0;
        long jN = jg.b.N(this.f91269d1);
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        rectManager.getClass();
        float[] fArr = this.Z0;
        if (fArr.length < 16) {
            i14 = 0;
        } else {
            i14 = (((fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0) << 1) | ((fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) ? 1 : 0);
        }
        q5.g gVar = rectManager.f142833c;
        if ((i14 & 2) != 0) {
            fArr = null;
        }
        rectManager.f142836f = gVar.c(j14, jN, fArr, width, height) || rectManager.f142836f;
        this.V0.b(z14);
        getRectManager().a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // h5.o1
    public final n1 j(e23.p pVar, c1.g gVar, r4.c cVar) {
        q3.c<Reference<n1>> cVar2;
        Reference<? extends n1> referencePoll;
        Object obj;
        if (cVar != null) {
            return new e2(cVar, null, this, pVar, gVar);
        }
        do {
            g4<n1> g4Var = this.f91302u1;
            ReferenceQueue<n1> referenceQueue = g4Var.f91196b;
            cVar2 = g4Var.f91195a;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                cVar2.j(referencePoll);
            }
        } while (referencePoll != null);
        do {
            int i14 = cVar2.f142358c;
            if (i14 == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) cVar2.k(i14 - 1)).get();
        } while (obj == null);
        n1 n1Var = (n1) obj;
        if (n1Var == null) {
            return new e2(getGraphicsContext().a(), getGraphicsContext(), this, pVar, gVar);
        }
        n1Var.d(gVar, pVar);
        return n1Var;
    }

    @Override // h5.o1
    public final void k(h5.e0 e0Var, boolean z14, boolean z15, boolean z16) {
        h5.e0 e0VarK;
        h5.e0 e0VarK2;
        h5.q0 q0Var = this.V0;
        if (!z14) {
            if (q0Var.r(e0Var, z15) && z16) {
                e0(e0Var);
                return;
            }
            return;
        }
        h5.p pVar = q0Var.f81937b;
        h5.e0 e0Var2 = e0Var.f81767h;
        h5.j0 j0Var = e0Var.T;
        if (e0Var2 == null) {
            e5.a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i14 = h5.q0.b.f81948a[j0Var.f81841d.ordinal()];
        if (i14 != 1) {
            if (i14 == 2 || i14 == 3 || i14 == 4) {
                q0Var.f81943h.b(new h5.q0.a(e0Var, true, z15));
                return;
            }
            if (i14 != 5) {
                u0.r();
                return;
            }
            if (!j0Var.f81842e || z15) {
                j0Var.f81842e = true;
                j0Var.f81853p.f81972x = true;
                if (e0Var.M0) {
                    return;
                }
                if ((p005kotlin.jvm.internal.s.g(e0Var.W(), Boolean.TRUE) || h5.q0.i(e0Var)) && ((e0VarK = e0Var.K()) == null || !e0VarK.T.f81842e)) {
                    pVar.a(e0Var, h5.z.LookaheadMeasurement);
                } else if ((e0Var.g() || h5.q0.j(e0Var)) && ((e0VarK2 = e0Var.K()) == null || !e0VarK2.G())) {
                    pVar.a(e0Var, h5.z.Measurement);
                }
                if (q0Var.f81939d || !z16) {
                    return;
                }
                e0(e0Var);
            }
        }
    }

    @Override // h5.o1
    public final void l(h5.e0 e0Var) {
        m328getLayoutNodes().g(e0Var.f81761b);
        h5.q0 q0Var = this.V0;
        h5.p pVar = q0Var.f81937b;
        pVar.f81930a.c(e0Var);
        pVar.f81931b.c(e0Var);
        pVar.f81932c.c(e0Var);
        q0Var.f81940e.f81884a.j(e0Var);
        this.N0 = true;
        i4.b bVar = this._autofillManager;
        if (bVar == null || !bVar.f90831h.g(e0Var.f81761b)) {
            return;
        }
        bVar.f90824a.d(bVar.f90826c, e0Var.f81761b, false);
    }

    @Override // h5.o1
    public final long m(long j8) {
        c0();
        return o4.a1.c(j8, this.f91263a1);
    }

    @Override // h5.m1
    public final void n(f5.s0 s0Var) {
        p13.k<e23.a<p005kotlin.Unit>> kVar = this.f91278i;
        boolean zIsEmpty = kVar.isEmpty();
        kVar.addLast(s0Var);
        if (zIsEmpty) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(this.f91280j);
            } else {
                vb.h.s("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    @Override // b5.n0
    public final long o(long j8) {
        c0();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32)) - Float.intBitsToFloat((int) (this.f91269d1 >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j8 & 4294967295L)) - Float.intBitsToFloat((int) (this.f91269d1 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        n4.c.a aVar = n4.c.f123541b;
        return o4.a1.c(jFloatToRawIntBits, this.f91263a1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        androidx.lifecycle.n0 n0Var;
        androidx.lifecycle.b0 f158017a;
        androidx.lifecycle.b0 f158017a2;
        androidx.lifecycle.n0 n0Var2;
        int i14;
        super.onAttachedToWindow();
        setAttached(true);
        int i15 = Build.VERSION.SDK_INT;
        if (i15 < 30) {
            K1.getClass();
            setShowLayoutBounds(a.a());
        }
        this.insetsListener.onViewAttachedToWindow(this);
        K1.getClass();
        androidx.lifecycle.b0 f158017a3 = null;
        if (i15 > 28) {
            if (P1 == null) {
                ab2.a aVar = new ab2.a(5);
                P1 = aVar;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (L1 == null) {
                        L1 = Class.forName("android.os.SystemProperties");
                    }
                    if (N1 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class<?> cls = L1;
                        N1 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = N1;
                    if (method != null) {
                        method.invoke(null, aVar);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            p1.q0<m> q0Var = O1;
            synchronized (q0Var) {
                q0Var.g(this);
                p005kotlin.Unit unit = p005kotlin.Unit.INSTANCE;
            }
        }
        if (!this.composeViewContextIncrementedDuringInit) {
            getComposeViewContext().c();
        }
        this.composeViewContextIncrementedDuringInit = false;
        boolean z14 = h4.e.f81540b;
        if (!z14) {
            this.f91293p.f91383c.setValue(Boolean.valueOf(hasWindowFocus()));
            p2 p2Var = this.f91293p;
            C1750m c1750m = new C1750m();
            if (p2Var.f91382b == null) {
                p2Var.f91381a = c1750m;
            }
            c2 c2Var = this.f91293p.f91382b;
            if (c2Var != null) {
                c2Var.setValue(x0.a(this));
            }
        }
        W(getRoot());
        V(getRoot());
        f4.v vVar = getSnapshotObserver().f81981a;
        vVar.getClass();
        f4.f.a aVar2 = f4.f.f68735e;
        dh1.a aVar3 = vVar.f68816d;
        aVar2.getClass();
        vVar.f68820h = f4.f.a.d(aVar3);
        i4.a aVar4 = this.L0;
        if (aVar4 != null) {
            i4.m mVar = i4.m.f90845a;
            mVar.getClass();
            aVar4.f90822c.registerCallback(mVar);
        }
        if (z14) {
            b4.f fVarU = U(getComposeViewContext().f91445c, getComposeViewContext().f91447e);
            if (fVarU == null) {
                fVarU = b4.a.f15688a;
            }
            this.retainedValuesStore = fVarU;
            e23.l<? super s1, p005kotlin.Unit> lVar = this.f91275g1;
            if (lVar != null) {
                lVar.invoke(getComposeViewContext());
                this.f91275g1 = null;
            }
            f158017a2 = getComposeViewContext().f91445c.getF158016a();
        } else {
            androidx.lifecycle.n0 n0VarR = xy2.b.r(this);
            nd.e eVarP = gl1.y.p(this);
            ViewModelStoreOwner viewModelStoreOwnerS = zf.b.s(this);
            b4.f fVarU2 = U(n0VarR, viewModelStoreOwnerS);
            if (fVarU2 == null) {
                fVarU2 = b4.a.f15688a;
            }
            this.retainedValuesStore = fVarU2;
            c viewTreeOwners = getViewTreeOwners();
            if (viewTreeOwners == null || (n0VarR != null && eVarP != null && (n0VarR != viewTreeOwners.f91320a || eVarP != viewTreeOwners.f91321b || viewModelStoreOwnerS != viewTreeOwners.f91322c))) {
                if (n0VarR == null) {
                    vb.h.z("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                    return;
                }
                if (eVarP == null) {
                    vb.h.z("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                    return;
                }
                if (viewTreeOwners != null && (n0Var = viewTreeOwners.f91320a) != null && (f158017a = n0Var.getF158016a()) != null) {
                    f158017a.d(this);
                }
                n0VarR.getF158016a().a(this);
                set_viewTreeOwners(new c(n0VarR, eVarP, viewModelStoreOwnerS));
                e23.l<? super s1, p005kotlin.Unit> lVar2 = this.f91275g1;
                if (lVar2 != null) {
                    lVar2.invoke(getComposeViewContext());
                }
                this.f91275g1 = null;
            }
            c viewTreeOwners2 = getViewTreeOwners();
            if (viewTreeOwners2 != null && (n0Var2 = viewTreeOwners2.f91320a) != null) {
                f158017a3 = n0Var2.getF158016a();
            }
            if (f158017a3 == null) {
                throw e5.m("No lifecycle owner exists");
            }
            f158017a2 = f158017a3;
        }
        f158017a2.a(this);
        f158017a2.a(this.contentCaptureManager);
        x4.d dVar = this.f91294p1;
        if (isInTouchMode()) {
            x4.a.f188647b.getClass();
            i14 = x4.a.f188648c;
        } else {
            x4.a.f188647b.getClass();
            i14 = x4.a.f188649d;
        }
        dVar.f188651a.setValue(x4.a.a(i14));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            e0.f91144a.b(this);
        }
        i4.b bVar = this._autofillManager;
        if (bVar != null) {
            getFocusOwner().getListeners().g(bVar);
            getSemanticsOwner().f135954d.g(bVar);
        }
        getFocusOwner().getListeners().g(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        t<o0> tVar = this.f91281j1.get();
        o0 o0Var = tVar != null ? tVar.f81579b : null;
        if (o0Var == null) {
            return getLegacyTextInputServiceAndroid().f188891d;
        }
        t<j2> tVar2 = o0Var.f91364d.get();
        j2 j2Var = tVar2 != null ? tVar2.f81579b : null;
        return j2Var != null && (j2Var.f91233e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h0(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String str;
        t<o0> tVar = this.f91281j1.get();
        o0 o0Var = tVar != null ? tVar.f81579b : null;
        if (o0Var == null) {
            n0 legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
            if (legacyTextInputServiceAndroid.f188891d) {
                x5.q qVar = legacyTextInputServiceAndroid.f188895h;
                l0 l0Var = legacyTextInputServiceAndroid.f188894g;
                int i14 = qVar.f188936e;
                boolean z14 = qVar.f188932a;
                x5.p.f188918b.getClass();
                int i15 = x5.p.f188920d;
                int i16 = 6;
                if (i14 == i15) {
                    if (!z14) {
                        i16 = 0;
                    }
                } else if (i14 == 0) {
                    i16 = 1;
                } else if (i14 == x5.p.f188921e) {
                    i16 = 2;
                } else if (i14 == x5.p.f188925i) {
                    i16 = 5;
                } else if (i14 == x5.p.f188924h) {
                    i16 = 7;
                } else if (i14 == x5.p.f188922f) {
                    i16 = 3;
                } else if (i14 == x5.p.f188923g) {
                    i16 = 4;
                } else if (i14 != x5.p.f188926j) {
                    vb.h.z("invalid ImeAction");
                    return null;
                }
                editorInfo.imeOptions = i16;
                f0 f0Var = qVar.f188937f;
                if (f0Var != null && (str = f0Var.f188836a) != null) {
                    editorInfo.privateImeOptions = str;
                }
                int i17 = qVar.f188935d;
                x5.v.f188954b.getClass();
                if (i17 == x5.v.f188955c) {
                    editorInfo.inputType = 1;
                } else if (i17 == x5.v.f188956d) {
                    editorInfo.inputType = 1;
                    editorInfo.imeOptions |= Integer.MIN_VALUE;
                } else if (i17 == x5.v.f188957e) {
                    editorInfo.inputType = 2;
                } else if (i17 == x5.v.f188958f) {
                    editorInfo.inputType = 3;
                } else if (i17 == x5.v.f188959g) {
                    editorInfo.inputType = 17;
                } else if (i17 == x5.v.f188960h) {
                    editorInfo.inputType = 33;
                } else if (i17 == x5.v.f188961i) {
                    editorInfo.inputType = 129;
                } else if (i17 == x5.v.f188962j) {
                    editorInfo.inputType = 18;
                } else {
                    if (i17 != x5.v.f188963k) {
                        vb.h.z("Invalid Keyboard Type");
                        return null;
                    }
                    editorInfo.inputType = 8194;
                }
                if (!z14) {
                    int i18 = editorInfo.inputType;
                    if ((i18 & 1) == 1) {
                        editorInfo.inputType = i18 | 131072;
                        if (qVar.f188936e == i15) {
                            editorInfo.imeOptions |= 1073741824;
                        }
                    }
                }
                if ((editorInfo.inputType & 1) == 1) {
                    int i19 = qVar.f188933b;
                    x5.u.f188948b.getClass();
                    if (i19 == x5.u.f188950d) {
                        editorInfo.inputType |= 4096;
                    } else if (i19 == x5.u.f188951e) {
                        editorInfo.inputType |= 8192;
                    } else if (i19 == x5.u.f188952f) {
                        editorInfo.inputType |= 16384;
                    }
                    if (qVar.f188934c) {
                        editorInfo.inputType |= 32768;
                    }
                }
                long j8 = l0Var.f188879b;
                w0.a aVar = w0.f157315b;
                editorInfo.initialSelStart = (int) (j8 >> 32);
                editorInfo.initialSelEnd = (int) (j8 & 4294967295L);
                m7.a.a(editorInfo, l0Var.f188878a.f157138b);
                editorInfo.imeOptions |= 33554432;
                if (androidx.emoji2.text.d.e()) {
                    androidx.emoji2.text.d.a().j(editorInfo);
                }
                x5.h0 h0Var = new x5.h0(legacyTextInputServiceAndroid.f188894g, new o0(legacyTextInputServiceAndroid), legacyTextInputServiceAndroid.f188895h.f188934c);
                legacyTextInputServiceAndroid.f188896i.add(new WeakReference(h0Var));
                return h0Var;
            }
        } else {
            t<j2> tVar2 = o0Var.f91364d.get();
            j2 j2Var = tVar2 != null ? tVar2.f81579b : null;
            if (j2Var != null) {
                synchronized (j2Var.f91231c) {
                    if (j2Var.f91233e) {
                        return null;
                    }
                    InputConnection inputConnectionA = j2Var.f91229a.a(editorInfo);
                    i2 i2Var = new i2(j2Var);
                    InputConnection b0Var = Build.VERSION.SDK_INT >= 34 ? new x5.b0(inputConnectionA, i2Var) : new a0(inputConnectionA, i2Var);
                    j2Var.f91232d.b(new h2(b0Var));
                    return b0Var;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        y yVar;
        j4.a aVar = this.contentCaptureManager;
        aVar.getClass();
        j4.a.c.f96981a.getClass();
        for (long j8 : jArr) {
            p5.a0 a0VarB = aVar.d().b((int) j8);
            if (a0VarB != null && (yVar = a0VarB.f135947a) != null) {
                j4.b.n();
                ViewTranslationRequest.Builder builderM = j4.b.m(aVar.f96963a.getAutofillId(), yVar.f136100f);
                p5.q qVar = yVar.f136098d;
                p5.d0.f135959a.getClass();
                List list = (List) p5.r.a(qVar, p5.d0.D);
                if (list != null) {
                    builderM.setValue("android:text", TranslationRequestValue.forText(new s5.c(i6.b.b(list, "\n", null, 62), null, 2, null)));
                    consumer.accept(builderM.build());
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        androidx.lifecycle.b0 f158017a;
        androidx.lifecycle.n0 n0Var;
        super.onDetachedFromWindow();
        setAttached(false);
        this.insetsListener.onViewDetachedFromWindow(this);
        View view2 = this.f91285l;
        if (X() && view2 != null) {
            removeView(view2);
        }
        K1.getClass();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 > 28) {
            p1.q0<m> q0Var = O1;
            synchronized (q0Var) {
                q0Var.k(this);
                p005kotlin.Unit unit = p005kotlin.Unit.INSTANCE;
            }
        }
        getComposeViewContext().b();
        f4.v vVar = getSnapshotObserver().f81981a;
        en0.n nVar = vVar.f68820h;
        if (nVar != null) {
            nVar.c();
        }
        vVar.a();
        if (h4.e.f81540b) {
            f158017a = getComposeViewContext().f91445c.getF158016a();
        } else {
            p2 p2Var = this.f91293p;
            if (p2Var.f91382b == null) {
                p2Var.f91381a = null;
            }
            c viewTreeOwners = getViewTreeOwners();
            f158017a = (viewTreeOwners == null || (n0Var = viewTreeOwners.f91320a) == null) ? null : n0Var.getF158016a();
            if (f158017a == null) {
                throw e5.m("No lifecycle owner exists");
            }
        }
        f158017a.d(this.contentCaptureManager);
        f158017a.d(this);
        i4.a aVar = this.L0;
        if (aVar != null) {
            i4.m mVar = i4.m.f90845a;
            mVar.getClass();
            aVar.f90822c.unregisterCallback(mVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        r2.b bVar = this.f91274g;
        if (bVar != null) {
            bVar.f91428c = false;
        }
        this.f91274g = null;
        if (i14 >= 31) {
            e0.f91144a.a(this);
        }
        i4.b bVar2 = this._autofillManager;
        if (bVar2 != null) {
            getSemanticsOwner().f135954d.k(bVar2);
            getFocusOwner().getListeners().k(bVar2);
        }
        q5.e rectManager = getRectManager();
        q5.g gVar = rectManager.f142833c;
        g6.k.f76003b.getClass();
        rectManager.f142836f = gVar.c(0L, 0L, null, 0, 0);
        getRectManager().a();
        q5.e rectManager2 = getRectManager();
        Object obj = rectManager2.f142838h;
        if (obj != null) {
            rectManager2.f142831a.g(obj);
            rectManager2.f142838h = null;
        }
        getFocusOwner().getListeners().k(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z14, int i14, Rect rect) {
        super.onFocusChanged(z14, i14, rect);
        if (z14 || hasFocus()) {
            return;
        }
        getFocusOwner().x();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.lastMatrixRecalculationAnimationTime = 0L;
        i0();
        int i14 = Build.VERSION.SDK_INT;
        if (32 > i14 || i14 >= 34) {
            return;
        }
        h0(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.lastMatrixRecalculationAnimationTime = 0L;
            this.V0.l(this.C1);
            this.T0 = null;
            i0();
            if (this.S0 != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                try {
                    getAndroidViewsHandler$ui().layout(0, 0, i16 - i14, i17 - i15);
                    p005kotlin.Unit unit = p005kotlin.Unit.INSTANCE;
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
            p005kotlin.Unit unit2 = p005kotlin.Unit.INSTANCE;
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i14, int i15) {
        h5.q0 q0Var = this.V0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                W(getRoot());
            }
            long jR = R(i14);
            o13.z.a aVar = o13.z.f128618b;
            long jR2 = R(i15);
            g6.a.f75987b.getClass();
            long jA = g6.a.C1525a.a((int) (jR >>> 32), (int) (jR & 4294967295L), (int) (jR2 >>> 32), (int) (4294967295L & jR2));
            g6.a aVar2 = this.T0;
            if (aVar2 == null) {
                this.T0 = g6.a.a(jA);
                this.U0 = false;
            } else if (!g6.a.d(aVar2.f75988a, jA)) {
                this.U0 = true;
            }
            q0Var.s(jA);
            q0Var.n();
            setMeasuredDimension(getRoot().T.f81853p.f69144a, getRoot().T.f81853p.f69145b);
            if (this.S0 != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                try {
                    getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().T.f81853p.f69144a, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().T.f81853p.f69145b, 1073741824));
                    p005kotlin.Unit unit = p005kotlin.Unit.INSTANCE;
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
            p005kotlin.Unit unit2 = p005kotlin.Unit.INSTANCE;
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i14) {
        if (viewStructure != null) {
            i4.b bVar = this._autofillManager;
            if (bVar != null) {
                i4.j jVar = i4.j.f90842a;
                h5.e0 e0Var = bVar.f90825b.f135951a;
                AutofillId autofillId = bVar.f90830g;
                String str = bVar.f90828e;
                q5.e eVar = bVar.f90827d;
                i4.w.a(viewStructure, e0Var, autofillId, str, eVar);
                Object[] objArr = p1.b1.f134677a;
                p1.q0 q0Var = new p1.q0(2);
                q0Var.g(e0Var);
                q0Var.g(viewStructure);
                while (q0Var.e()) {
                    Object objL = q0Var.l(q0Var.f134668b - 1);
                    objL.getClass();
                    ViewStructure viewStructure2 = (ViewStructure) objL;
                    Object objL2 = q0Var.l(q0Var.f134668b - 1);
                    objL2.getClass();
                    List<p5.s> listZ = ((p5.s) objL2).z();
                    int size = listZ.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        p5.s sVar = listZ.get(i15);
                        if (!sVar.getM0() && sVar.isAttached() && sVar.g()) {
                            p5.q qVarY = sVar.y();
                            if (qVarY != null) {
                                t0<p5.j0<?>, Object> t0Var = qVarY.f136085a;
                                p5.p.f136057a.getClass();
                                if (!t0Var.a(p5.p.f136064h) && !t0Var.a(p5.p.f136065i)) {
                                    p5.d0.f135959a.getClass();
                                    if (!t0Var.a(p5.d0.f135977s) && !t0Var.a(p5.d0.f135978t)) {
                                        q0Var.g(sVar);
                                        q0Var.g(viewStructure2);
                                    }
                                }
                                jVar.getClass();
                                ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                i4.w.a(viewStructureNewChild, sVar, autofillId, str, eVar);
                                q0Var.g(sVar);
                                q0Var.g(viewStructureNewChild);
                            } else {
                                q0Var.g(sVar);
                                q0Var.g(viewStructure2);
                            }
                        }
                    }
                }
            }
            i4.a aVar = this.L0;
            if (aVar != null) {
                i4.p pVar = aVar.f90821b;
                LinkedHashMap linkedHashMap = pVar.f90849a;
                LinkedHashMap linkedHashMap2 = pVar.f90849a;
                if (linkedHashMap.isEmpty()) {
                    return;
                }
                i4.j jVar2 = i4.j.f90842a;
                int size2 = linkedHashMap2.size();
                jVar2.getClass();
                int iAddChildCount = viewStructure.addChildCount(size2);
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    int iIntValue = ((Number) entry.getKey()).intValue();
                    i4.o oVar = (i4.o) entry.getValue();
                    i4.j.f90842a.getClass();
                    ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                    viewStructureNewChild2.setAutofillId(aVar.f90823d, iIntValue);
                    viewStructureNewChild2.setId(iIntValue, aVar.f90820a.getContext().getPackageName(), null, null);
                    i4.r.f90875a.getClass();
                    i4.f fVar = i4.r.a.f90877b;
                    fVar.getClass();
                    viewStructureNewChild2.setAutofillType(fVar.f90839b);
                    List<i4.q> list = oVar.f90846a;
                    ArrayList arrayList = new ArrayList(list.size());
                    int size3 = list.size();
                    for (int i16 = 0; i16 < size3; i16++) {
                        String str2 = i4.e.f90838a.get(list.get(i16));
                        if (str2 == null) {
                            vb.h.s("Unsupported autofill type");
                            return;
                        }
                        arrayList.add(str2);
                    }
                    viewStructureNewChild2.setAutofillHints((String[]) arrayList.toArray(new String[0]));
                    n4.d dVar = oVar.f90847b;
                    if (dVar != null) {
                        int iRound = Math.round(dVar.f123547a);
                        int iRound2 = Math.round(dVar.f123548b);
                        int iRound3 = Math.round(dVar.f123549c);
                        int iRound4 = Math.round(dVar.f123550d) - iRound2;
                        i4.j.f90842a.getClass();
                        viewStructureNewChild2.setDimens(iRound, iRound2, 0, 0, iRound3 - iRound, iRound4);
                    }
                    iAddChildCount++;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i14) {
        b5.w f91331a;
        int toolType = motionEvent.getToolType(i14);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (f91331a = getPointerIconService().getF91331a()) == null)) {
            return super.onResolvePointerIcon(motionEvent, i14);
        }
        f0 f0Var = f0.f91175a;
        Context context = getContext();
        f0Var.getClass();
        if (f91331a instanceof b5.a) {
            return ((b5.a) f91331a).f15747b;
        }
        return f91331a instanceof b5.b ? PointerIcon.getSystemIcon(context, ((b5.b) f91331a).f15765b) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // androidx.lifecycle.n
    public final void onResume(androidx.lifecycle.n0 n0Var) {
        p3.e eVarA;
        if (Build.VERSION.SDK_INT < 30) {
            K1.getClass();
            setShowLayoutBounds(a.a());
        }
        r2.b bVar = this.f91274g;
        if (bVar != null) {
            r2.a aVar = this.frameEndScheduler;
            aVar.getClass();
            q2 q2Var = bVar.f91426a;
            b4.d dVar = q2Var.f91399a;
            if (!dVar.f15691a || dVar.f15693c) {
                return;
            }
            try {
                eVarA = aVar.a(new s2(bVar));
            } catch (CancellationException unused) {
                b4.d dVar2 = q2Var.f91399a;
                if (!dVar2.f15692b) {
                    if (dVar2.f15693c) {
                        c4.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    dVar2.a();
                    dVar2.f15693c = true;
                }
                eVarA = null;
            }
            p3.e eVar = bVar.f91429d;
            if (eVar != null) {
                eVar.cancel();
            }
            bVar.f91429d = eVarA;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i14) {
        g6.o oVar;
        if (this.f91266c) {
            int[] iArr = m4.m.f116498a;
            if (i14 != 0) {
                oVar = i14 != 1 ? null : g6.o.Rtl;
            } else {
                oVar = g6.o.Ltr;
            }
            if (oVar == null) {
                oVar = g6.o.Ltr;
            }
            setLayoutDirection(oVar);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer<ScrollCaptureTarget> consumer) {
        o5.k kVar;
        if (Build.VERSION.SDK_INT >= 31 && (kVar = this.G1) != null) {
            b0 semanticsOwner = getSemanticsOwner();
            t13.g coroutineContext = getCoroutineContext();
            q3.c cVar = new q3.c(new o5.l[16], 0);
            gl1.y.V(semanticsOwner.a(), 0, new o5.h(cVar));
            cVar.n(r13.a.a(o5.i.f129156a, o5.j.f129157a));
            int i14 = cVar.f142358c;
            o5.l lVar = (o5.l) (i14 == 0 ? null : cVar.f142356a[i14 - 1]);
            if (lVar != null) {
                g6.l lVar2 = lVar.f129161c;
                o5.a aVar = new o5.a(lVar.f129159a, lVar.f129161c, o53.c0.a(coroutineContext), kVar, this);
                f5.c0 c0Var = lVar.f129162d;
                n4.d dVarJ0 = f5.d0.c(c0Var).j0(c0Var, true);
                long jC = lVar2.c();
                Rect rectG = l1.g(lg.d.F(dVarJ0));
                g6.k.a aVar2 = g6.k.f76003b;
                ScrollCaptureTarget scrollCaptureTargetL = ka.i.l(this, rectG, new Point((int) (jC >> 32), (int) (jC & 4294967295L)), aVar);
                scrollCaptureTargetL.setScrollBounds(l1.g(lVar2));
                consumer.accept(scrollCaptureTargetL);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        i0();
    }

    @Override // androidx.lifecycle.n
    public final void onStop(androidx.lifecycle.n0 n0Var) {
        r2.b bVar = this.f91274g;
        if (bVar != null) {
            b4.d dVar = bVar.f91426a.f91399a;
            if (dVar.f15691a && !dVar.f15693c) {
                p3.e eVar = bVar.f91429d;
                if (eVar != null) {
                    eVar.cancel();
                }
                bVar.f91429d = null;
                return;
            }
            if (dVar.f15692b) {
                return;
            }
            if (!dVar.f15693c) {
                c4.a.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!dVar.f15694d.e()) {
                c4.a.a("Attempted to start retaining exited values with pending exited values");
            }
            dVar.f15693c = false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z14) {
        int i14;
        if (z14) {
            x4.a.f188647b.getClass();
            i14 = x4.a.f188648c;
        } else {
            x4.a.f188647b.getClass();
            i14 = x4.a.f188649d;
        }
        this.f91294p1.f188651a.setValue(x4.a.a(i14));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray<ViewTranslationResponse> longSparseArray) {
        j4.a aVar = this.contentCaptureManager;
        aVar.getClass();
        j4.a.c.f96981a.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (p005kotlin.jvm.internal.s.g(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            j4.a.c.a(aVar, longSparseArray);
        } else {
            aVar.f96963a.post(new h0.r0(21, aVar, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z14) {
        if (!h4.e.f81540b) {
            this.f91293p.f91383c.setValue(Boolean.valueOf(z14));
        }
        this.E1 = true;
        super.onWindowFocusChanged(z14);
        if (!z14 || Build.VERSION.SDK_INT >= 30) {
            return;
        }
        K1.getClass();
        boolean zA = a.a();
        if (getShowLayoutBounds() != zA) {
            setShowLayoutBounds(zA);
            V(getRoot());
        }
    }

    @Override // h5.o1
    public final void p() {
        p1.q0<e23.a<p005kotlin.Unit>> q0Var;
        f4.v.a[] aVarArr;
        if (this.N0) {
            f4.v vVar = getSnapshotObserver().f81981a;
            q1 q1Var = q1.f81949a;
            synchronized (vVar.f68819g) {
                try {
                    q3.c<f4.v.a> cVar = vVar.f68818f;
                    int i14 = cVar.f142358c;
                    int i15 = 0;
                    int i16 = 0;
                    while (true) {
                        aVarArr = cVar.f142356a;
                        if (i15 >= i14) {
                            break;
                        }
                        f4.v.a aVar = aVarArr[i15];
                        aVar.d(q1Var);
                        if (!aVar.f68828f.f()) {
                            i16++;
                        } else if (i16 > 0) {
                            f4.v.a[] aVarArr2 = cVar.f142356a;
                            aVarArr2[i15 - i16] = aVarArr2[i15];
                        }
                        i15++;
                    }
                    int i17 = i14 - i16;
                    p13.s.m(i17, i14, null, aVarArr);
                    cVar.f142358c = i17;
                    p005kotlin.Unit unit = p005kotlin.Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            this.N0 = false;
        }
        w0 w0Var = this.S0;
        if (w0Var != null) {
            Q(w0Var);
        }
        i4.b bVar = this._autofillManager;
        if (bVar != null) {
            p1.j0 j0Var = bVar.f90831h;
            if (j0Var.f134796d == 0 && bVar.f90832i) {
                bVar.f90824a.commit();
                bVar.f90832i = false;
            }
            if (j0Var.f134796d != 0) {
                bVar.f90832i = true;
            }
        }
        while (this.f91304v1.e() && this.f91304v1.b(0) != null) {
            int i18 = this.f91304v1.f134668b;
            int i19 = 0;
            while (true) {
                q0Var = this.f91304v1;
                if (i19 < i18) {
                    e23.a<p005kotlin.Unit> aVarB = q0Var.b(i19);
                    p1.q0<e23.a<p005kotlin.Unit>> q0Var2 = this.f91304v1;
                    if (i19 < 0 || i19 >= q0Var2.f134668b) {
                        q0Var2.f(i19);
                        throw null;
                    }
                    Object[] objArr = q0Var2.f134667a;
                    Object obj = objArr[i19];
                    objArr[i19] = null;
                    if (aVarB != null) {
                        aVarB.invoke();
                    }
                    i19++;
                }
            }
            q0Var.m(0, i18);
        }
    }

    @Override // h5.o1
    public final void q(h5.e0 e0Var, long j8) {
        h5.q0 q0Var = this.V0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            q0Var.m(e0Var, j8);
            if (!q0Var.f81937b.c()) {
                q0Var.b(false);
                getRectManager().a();
                if (this.f91283k0) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f91283k0 = false;
                }
            }
            p005kotlin.Unit unit = p005kotlin.Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }

    @Override // h5.o1
    public final void r() {
        this.f91283k0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i14, Rect rect) {
        int i15;
        int i16;
        if (!h4.i.f81559a) {
            if (isFocused()) {
                return true;
            }
            if (getFocusOwner().v().b()) {
                return super.requestFocus(i14, rect);
            }
            m4.g gVarD = m4.m.d(i14);
            if (gVarD != null) {
                i15 = gVarD.f116475a;
            } else {
                m4.g.f116466b.getClass();
                i15 = m4.g.f116473i;
            }
            return p005kotlin.jvm.internal.s.g(getFocusOwner().m(i15, rect != null ? l1.j(rect) : null, new r(i15)), Boolean.TRUE);
        }
        if (isFocused()) {
            return true;
        }
        m4.g gVarD2 = m4.m.d(i14);
        if (gVarD2 != null) {
            i16 = gVarD2.f116475a;
        } else {
            m4.g.f116466b.getClass();
            i16 = m4.g.f116473i;
        }
        Boolean boolM = getFocusOwner().m(i16, rect != null ? l1.j(rect) : null, new kotlin.p(i16));
        Boolean bool = Boolean.TRUE;
        if (p005kotlin.jvm.internal.s.g(boolM, bool) || p005kotlin.jvm.internal.s.g(getFocusOwner().m(i16, null, new kotlin.q(i16)), bool)) {
            return true;
        }
        if (hasFocus() && x.a(i16)) {
            return getFocusOwner().i(i16);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // h5.o1
    public final u13.a s(e23.p pVar, v13.c cVar) {
        kotlin.s sVar;
        if (cVar instanceof kotlin.s) {
            sVar = (kotlin.s) cVar;
            int i14 = sVar.f91434c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f91434c = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new kotlin.s(this, cVar);
            }
        } else {
            sVar = new kotlin.s(this, cVar);
        }
        Object obj = sVar.f91432a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f91434c;
        if (i15 == 0) {
            o13.r.b(obj);
            t tVar = new t(this);
            sVar.f91434c = 1;
            if (o53.c0.e(new h4.u(tVar, this.f91281j1, pVar, null), sVar) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        o2.c.f();
        return null;
    }

    public void setAccessibilityEventBatchIntervalMillis(long intervalMillis) {
        this.B.f91546e = intervalMillis;
    }

    public final void setComposeViewContext(s1 s1Var) {
        if (getCoroutineContext() != s1Var.f91444b.getF135297x() && !((q3.c.a) getRoot().D()).isEmpty()) {
            e5.a.a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        f4.f.f68735e.getClass();
        f4.f fVarA = f4.f.a.a();
        e23.l<Object, p005kotlin.Unit> lVarE = fVarA != null ? fVarA.getF68733f() : null;
        f4.f fVarB = f4.f.a.b(fVarA);
        try {
            s1 s1Var2 = get_composeViewContext();
            f4.f.a.e(fVarA, fVarB, lVarE);
            if (s1Var.equals(s1Var2)) {
                return;
            }
            if (isAttachedToWindow()) {
                s1Var2.b();
                s1Var.c();
            }
            set_composeViewContext(s1Var);
            setCoroutineContext(s1Var.f91444b.getF135297x());
        } catch (Throwable th3) {
            f4.f.a.e(fVarA, fVarB, lVarE);
            throw th3;
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z14) {
        this.composeViewContextIncrementedDuringInit = z14;
    }

    public final void setConfiguration(Configuration configuration) {
        this.J0.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(j4.a aVar) {
        this.contentCaptureManager = aVar;
    }

    public void setCoroutineContext(t13.g gVar) {
        this.coroutineContext = gVar;
    }

    public final void setFrameEndScheduler$ui(r2.a aVar) {
        this.frameEndScheduler = aVar;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j8) {
        this.lastMatrixRecalculationAnimationTime = j8;
    }

    public final void setOnReadyForComposition(e23.l<? super s1, p005kotlin.Unit> callback) {
        if (!h4.e.f81540b) {
            if (getViewTreeOwners() != null) {
                callback.invoke(getComposeViewContext());
            }
            if (isAttachedToWindow()) {
                return;
            }
            this.f91275g1 = callback;
            return;
        }
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.composeViewContextIncrementedDuringInit) {
            callback.invoke(getComposeViewContext());
        } else {
            this.f91275g1 = callback;
        }
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m327setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(y4.b bVar) {
        this.primaryDirectionalMotionAxisOverride = bVar;
    }

    @Override // h5.o1
    public void setShowLayoutBounds(boolean z14) {
        this.showLayoutBounds = z14;
    }

    public void setUncaughtExceptionHandler(h5.w1.a handler) {
        this.V0.getClass();
    }

    public final void setUncaughtExceptionHandler$ui(h5.w1.a aVar) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // h5.o1
    public final void t() {
        this.J1++;
        getView().setKeepScreenOn(this.J1 > 0);
    }

    @Override // h5.o1
    public final long u(long j8) {
        c0();
        return o4.a1.c(j8, this.Z0);
    }

    @Override // m4.p
    public final void v(m4.i0 i0Var, j0 j0Var) {
        h5.a1 a1Var;
        boolean z14;
        h5.a1 a1Var2;
        boolean z15;
        if (!h4.i.f81561c || i0Var == null) {
            return;
        }
        if (!i0Var.getNode().getIsAttached()) {
            e5.a.b("visitAncestors called on an unattached node");
        }
        r.c node = i0Var.getNode();
        h5.e0 e0VarG = h5.k.g(i0Var);
        p1.u0 u0Var = null;
        ArrayList arrayList = null;
        while (e0VarG != null) {
            if ((e0VarG.P.f81685f.getAggregateChildKindSet() & 2097152) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & 2097152) != 0) {
                        r.c cVarB = node;
                        q3.c cVar = null;
                        while (cVarB != null) {
                            if (cVarB instanceof y4.e) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(cVarB);
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                            if (z15 && (cVarB.getKindSet() & 2097152) != 0 && (cVarB instanceof h5.m)) {
                                int i14 = 0;
                                for (r.c child = ((h5.m) cVarB).f81888b; child != null; child = child.getChild()) {
                                    if ((child.getKindSet() & 2097152) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            cVarB = child;
                                        } else {
                                            if (cVar == null) {
                                                cVar = new q3.c(new r.c[16], 0);
                                            }
                                            if (cVarB != null) {
                                                cVar.b(cVarB);
                                                cVarB = null;
                                            }
                                            cVar.b(child);
                                        }
                                    }
                                }
                                if (i14 == 1) {
                                }
                            }
                            cVarB = h5.k.b(cVar);
                        }
                    }
                    node = node.getParent();
                }
            }
            e0VarG = e0VarG.K();
            node = (e0VarG == null || (a1Var2 = e0VarG.P) == null) ? null : a1Var2.f81684e;
        }
        if (arrayList == null) {
            return;
        }
        if (j0Var != null) {
            if (!j0Var.getNode().getIsAttached()) {
                e5.a.b("visitAncestors called on an unattached node");
            }
            r.c node2 = j0Var.getNode();
            h5.e0 e0VarG2 = h5.k.g(j0Var);
            p1.u0 u0VarA = null;
            while (e0VarG2 != null) {
                if ((e0VarG2.P.f81685f.getAggregateChildKindSet() & 2097152) != 0) {
                    while (node2 != null) {
                        if ((node2.getKindSet() & 2097152) != 0) {
                            r.c cVarB2 = node2;
                            q3.c cVar2 = null;
                            while (cVarB2 != null) {
                                if (cVarB2 instanceof y4.e) {
                                    if (u0VarA == null) {
                                        u0VarA = i1.a();
                                    }
                                    u0VarA.d(cVarB2);
                                    z14 = false;
                                } else {
                                    z14 = true;
                                }
                                if (z14 && (cVarB2.getKindSet() & 2097152) != 0 && (cVarB2 instanceof h5.m)) {
                                    int i15 = 0;
                                    for (r.c child2 = ((h5.m) cVarB2).f81888b; child2 != null; child2 = child2.getChild()) {
                                        if ((child2.getKindSet() & 2097152) != 0) {
                                            i15++;
                                            if (i15 == 1) {
                                                cVarB2 = child2;
                                            } else {
                                                if (cVar2 == null) {
                                                    cVar2 = new q3.c(new r.c[16], 0);
                                                }
                                                if (cVarB2 != null) {
                                                    cVar2.b(cVarB2);
                                                    cVarB2 = null;
                                                }
                                                cVar2.b(child2);
                                            }
                                        }
                                    }
                                    if (i15 == 1) {
                                    }
                                }
                                cVarB2 = h5.k.b(cVar2);
                            }
                        }
                        node2 = node2.getParent();
                    }
                }
                e0VarG2 = e0VarG2.K();
                node2 = (e0VarG2 == null || (a1Var = e0VarG2.P) == null) ? null : a1Var.f81684e;
            }
            u0Var = u0VarA;
        }
        int size = arrayList.size();
        for (int i16 = 0; i16 < size; i16++) {
            y4.e eVar = (y4.e) arrayList.get(i16);
            if (!(u0Var != null ? u0Var.a(eVar) : false)) {
                eVar.u0();
            }
        }
    }

    @Override // h5.o1
    public final void w(h5.e0 e0Var) {
        i4.b bVar = this._autofillManager;
        if (bVar == null || !bVar.f90831h.g(e0Var.f81761b)) {
            return;
        }
        bVar.f90824a.d(bVar.f90826c, e0Var.f81761b, false);
    }

    @Override // q5.b
    public final Object x(long j8, q5.e.a aVar) {
        com.garmin.android.music.c cVar = new com.garmin.android.music.c(aVar, 2);
        postDelayed(cVar, j8);
        return cVar;
    }

    @Override // h5.o1
    public final void y() {
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        K1.getClass();
        try {
            if (Q1 == null) {
                Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                declaredMethod.setAccessible(true);
                Q1 = declaredMethod;
            }
            Method method = Q1;
            if (method != null) {
                method.invoke(viewTreeObserver, null);
            }
        } catch (Exception unused) {
        }
    }

    @Override // h5.o1
    public final void z(float f14) {
        if (X()) {
            if (f14 > 0.0f) {
                if (Float.isNaN(this.f91306w1) || f14 > this.f91306w1) {
                    this.f91306w1 = f14;
                    return;
                }
                return;
            }
            if (f14 < 0.0f) {
                if (Float.isNaN(this.f91308x1) || f14 < this.f91308x1) {
                    this.f91308x1 = f14;
                }
            }
        }
    }

    @p005kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\t¨\u0006\u0013"}, d2 = {"Li5/m$a;", "", "<init>", "()V", "Ljava/lang/Class;", "systemPropertiesClass", "Ljava/lang/Class;", "Ljava/lang/reflect/Method;", "getBooleanMethod", "Ljava/lang/reflect/Method;", "addChangeCallbackMethod", "Lp1/q0;", "Li5/m;", "composeViews", "Lp1/q0;", "Ljava/lang/Runnable;", "systemPropertiesChangedRunnable", "Ljava/lang/Runnable;", "dispatchOnScrollChangedMethod", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static boolean a() {
            try {
                if (m.L1 == null) {
                    m.L1 = Class.forName("android.os.SystemProperties");
                }
                if (m.M1 == null) {
                    Class<?> cls = m.L1;
                    m.M1 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = m.M1;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                return p005kotlin.jvm.internal.s.g(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
            } catch (Exception unused) {
                return false;
            }
        }

        private a() {
        }
    }

    @Override // h5.o1
    public kotlin.i getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // h5.o1
    public kotlin.j getClipboard() {
        return this.clipboard;
    }

    @Override // h5.o1
    public kotlin.k getClipboardManager() {
        return this.clipboardManager;
    }

    @Override // h5.o1
    public k4.a getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    /* JADX INFO: renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public i0<h5.e0> m328getLayoutNodes() {
        return this.layoutNodes;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view2) {
        addView(view2, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view2, int i14, int i15) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i14;
        layoutParamsGenerateDefaultLayoutParams.height = i15;
        p005kotlin.Unit unit = p005kotlin.Unit.INSTANCE;
        addViewInLayout(view2, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view2, int i14, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view2, i14, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view2, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view2, -1, layoutParams, true);
    }
}
