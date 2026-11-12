package b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.i1;
import androidx.lifecycle.k0;
import androidx.lifecycle.m1;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.x1;
import androidx.lifecycle.y;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.y0;
import z6.b0;
import z6.c0;
import z6.e0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ø\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 ä\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\u00022\u00020\n2\u00020\u000b2\u00020\u00022\u00020\f2\u00020\r2\u00020\u00022\u00020\u000e2\u00020\u0002:\bå\u0001æ\u0001ç\u0001è\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010B\u0013\b\u0017\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0014H\u0015¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u001d\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00162\b\b\u0001\u0010\u001e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u0013J\u0019\u0010\u001f\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\u001f\u0010\"J#\u0010\u001f\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b\u001f\u0010%J#\u0010&\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\u0016H\u0017¢\u0006\u0004\b'\u0010\u0010J\u0011\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\u00162\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\u00162\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b/\u0010.J)\u00104\u001a\u0002032\u0006\u00100\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b4\u00105J\u001f\u00106\u001a\u0002032\u0006\u00100\u001a\u00020\u00112\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b6\u00107J\u001f\u0010:\u001a\u0002032\u0006\u00100\u001a\u00020\u00112\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u00112\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\u00162\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010@\u001a\u00020\u00162\u0006\u0010?\u001a\u00020>2\u0006\u0010B\u001a\u00020\u0003H\u0016¢\u0006\u0004\b@\u0010CJ'\u0010@\u001a\u00020\u00162\u0006\u0010?\u001a\u00020>2\u0006\u0010B\u001a\u00020\u00032\u0006\u0010E\u001a\u00020DH\u0017¢\u0006\u0004\b@\u0010FJ\u0017\u0010G\u001a\u00020\u00162\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bG\u0010AJ\u000f\u0010H\u001a\u00020\u0016H\u0016¢\u0006\u0004\bH\u0010\u0010J\u000f\u0010I\u001a\u00020\u0016H\u0017¢\u0006\u0004\bI\u0010\u0010J\u001f\u0010M\u001a\u00020\u00162\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020\u0011H\u0017¢\u0006\u0004\bM\u0010NJ)\u0010M\u001a\u00020\u00162\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020\u00112\b\u0010O\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\bM\u0010PJA\u0010V\u001a\u00020\u00162\u0006\u0010K\u001a\u00020Q2\u0006\u0010L\u001a\u00020\u00112\b\u0010R\u001a\u0004\u0018\u00010J2\u0006\u0010S\u001a\u00020\u00112\u0006\u0010T\u001a\u00020\u00112\u0006\u0010U\u001a\u00020\u0011H\u0017¢\u0006\u0004\bV\u0010WJK\u0010V\u001a\u00020\u00162\u0006\u0010K\u001a\u00020Q2\u0006\u0010L\u001a\u00020\u00112\b\u0010R\u001a\u0004\u0018\u00010J2\u0006\u0010S\u001a\u00020\u00112\u0006\u0010T\u001a\u00020\u00112\u0006\u0010U\u001a\u00020\u00112\b\u0010O\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\bV\u0010XJ)\u0010[\u001a\u00020\u00162\u0006\u0010L\u001a\u00020\u00112\u0006\u0010Y\u001a\u00020\u00112\b\u0010Z\u001a\u0004\u0018\u00010JH\u0015¢\u0006\u0004\b[\u0010\\J-\u0010b\u001a\u00020\u00162\u0006\u0010L\u001a\u00020\u00112\f\u0010_\u001a\b\u0012\u0004\u0012\u00020^0]2\u0006\u0010a\u001a\u00020`H\u0017¢\u0006\u0004\bb\u0010cJI\u0010m\u001a\b\u0012\u0004\u0012\u00028\u00000l\"\u0004\b\u0000\u0010d\"\u0004\b\u0001\u0010e2\u0012\u0010g\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010f2\u0006\u0010i\u001a\u00020h2\f\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00010j¢\u0006\u0004\bm\u0010nJA\u0010m\u001a\b\u0012\u0004\u0012\u00028\u00000l\"\u0004\b\u0000\u0010d\"\u0004\b\u0001\u0010e2\u0012\u0010g\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010f2\f\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00010j¢\u0006\u0004\bm\u0010oJ\u0017\u0010r\u001a\u00020\u00162\u0006\u0010q\u001a\u00020pH\u0017¢\u0006\u0004\br\u0010sJ\u001b\u0010u\u001a\u00020\u00162\f\u0010,\u001a\b\u0012\u0004\u0012\u00020p0t¢\u0006\u0004\bu\u0010vJ\u001b\u0010w\u001a\u00020\u00162\f\u0010,\u001a\b\u0012\u0004\u0012\u00020p0t¢\u0006\u0004\bw\u0010vJ\u0017\u0010y\u001a\u00020\u00162\u0006\u0010x\u001a\u00020\u0011H\u0017¢\u0006\u0004\by\u0010\u0013J\u001b\u0010z\u001a\u00020\u00162\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00110t¢\u0006\u0004\bz\u0010vJ\u001b\u0010{\u001a\u00020\u00162\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00110t¢\u0006\u0004\b{\u0010vJ\u0017\u0010|\u001a\u00020\u00162\u0006\u0010K\u001a\u00020JH\u0015¢\u0006\u0004\b|\u0010}J\u001b\u0010~\u001a\u00020\u00162\f\u0010,\u001a\b\u0012\u0004\u0012\u00020J0t¢\u0006\u0004\b~\u0010vJ\u001b\u0010\u007f\u001a\u00020\u00162\f\u0010,\u001a\b\u0012\u0004\u0012\u00020J0t¢\u0006\u0004\b\u007f\u0010vJ\u001b\u0010\u0081\u0001\u001a\u00020\u00162\u0007\u0010\u0080\u0001\u001a\u000203H\u0017¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J#\u0010\u0081\u0001\u001a\u00020\u00162\u0007\u0010\u0080\u0001\u001a\u0002032\u0006\u0010q\u001a\u00020pH\u0017¢\u0006\u0006\b\u0081\u0001\u0010\u0083\u0001J\u001e\u0010\u0085\u0001\u001a\u00020\u00162\r\u0010,\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010t¢\u0006\u0005\b\u0085\u0001\u0010vJ\u001e\u0010\u0086\u0001\u001a\u00020\u00162\r\u0010,\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010t¢\u0006\u0005\b\u0086\u0001\u0010vJ\u001b\u0010\u0088\u0001\u001a\u00020\u00162\u0007\u0010\u0087\u0001\u001a\u000203H\u0017¢\u0006\u0006\b\u0088\u0001\u0010\u0082\u0001J#\u0010\u0088\u0001\u001a\u00020\u00162\u0007\u0010\u0087\u0001\u001a\u0002032\u0006\u0010q\u001a\u00020pH\u0017¢\u0006\u0006\b\u0088\u0001\u0010\u0083\u0001J\u001e\u0010\u008a\u0001\u001a\u00020\u00162\r\u0010,\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010t¢\u0006\u0005\b\u008a\u0001\u0010vJ\u001e\u0010\u008b\u0001\u001a\u00020\u00162\r\u0010,\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010t¢\u0006\u0005\b\u008b\u0001\u0010vJ\u0011\u0010\u008c\u0001\u001a\u00020\u0016H\u0015¢\u0006\u0005\b\u008c\u0001\u0010\u0010J\u0019\u0010\u008e\u0001\u001a\u00020\u00162\u0007\u0010,\u001a\u00030\u008d\u0001¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0019\u0010\u0090\u0001\u001a\u00020\u00162\u0007\u0010,\u001a\u00030\u008d\u0001¢\u0006\u0006\b\u0090\u0001\u0010\u008f\u0001J\u0011\u0010\u0091\u0001\u001a\u00020\u0016H\u0016¢\u0006\u0005\b\u0091\u0001\u0010\u0010J\u0011\u0010\u0092\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0005\b\u0092\u0001\u0010\u0010J\u001c\u0010\u0095\u0001\u001a\u00020\u00162\b\u0010\u0094\u0001\u001a\u00030\u0093\u0001H\u0003¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0013\u0010\u0098\u0001\u001a\u00030\u0097\u0001H\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010\u009e\u0001\u001a\u00030\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001f\u0010¡\u0001\u001a\u00030 \u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b¡\u0001\u0010¢\u0001\u0012\u0005\b£\u0001\u0010\u0010R\u001c\u0010¥\u0001\u001a\u0005\u0018\u00010¤\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010§\u0001\u001a\u00030\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R!\u0010®\u0001\u001a\u00030©\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010dR\u0018\u0010°\u0001\u001a\u00030¯\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u001c\u0010²\u0001\u001a\u00020h8\u0006¢\u0006\u0010\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001R$\u0010·\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020p0t0¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R$\u0010¹\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110t0¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010¸\u0001R$\u0010º\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0t0¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010¸\u0001R%\u0010»\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0084\u00010t0¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¸\u0001R%\u0010¼\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0089\u00010t0¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010¸\u0001R\u001f\u0010½\u0001\u001a\n\u0012\u0005\u0012\u00030\u008d\u00010¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¸\u0001R\u0019\u0010¾\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u0019\u0010À\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010¿\u0001R!\u0010Å\u0001\u001a\u00030Á\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÂ\u0001\u0010«\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001R!\u0010Ê\u0001\u001a\u00030Æ\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÇ\u0001\u0010«\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001R!\u0010Î\u0001\u001a\u00030\u0093\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\bË\u0001\u0010«\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001R\u0018\u0010Ð\u0001\u001a\u0004\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÏ\u0001\u0010\u001cR\u0018\u0010Ô\u0001\u001a\u00030Ñ\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÒ\u0001\u0010Ó\u0001R\u0018\u0010×\u0001\u001a\u00030¤\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u0018\u0010Û\u0001\u001a\u00030Ø\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÙ\u0001\u0010Ú\u0001R\u0018\u0010ß\u0001\u001a\u00030Ü\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÝ\u0001\u0010Þ\u0001R\u0015\u0010ã\u0001\u001a\u00030à\u00018F¢\u0006\b\u001a\u0006\bá\u0001\u0010â\u0001¨\u0006é\u0001"}, d2 = {"Lb/g;", "Lz6/e;", "", "Landroidx/lifecycle/n0;", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/lifecycle/y;", "Lnd/e;", "Lb/w;", "Lwc/d;", "Lf/h;", "La7/e;", "La7/f;", "Lz6/b0;", "Lz6/c0;", "Landroidx/core/view/o;", "<init>", "()V", "", "contentLayoutId", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onRetainNonConfigurationInstance", "()Ljava/lang/Object;", "onRetainCustomNonConfigurationInstance", "layoutResID", "setContentView", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "initializeViewTreeOwners", "Landroid/content/Context;", "peekAvailableContext", "()Landroid/content/Context;", "Le/b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnContextAvailableListener", "(Le/b;)V", "removeOnContextAvailableListener", "featureId", "Landroid/view/Menu;", "menu", "", "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onPanelClosed", "(ILandroid/view/Menu;)V", "Landroidx/core/view/s;", "provider", "addMenuProvider", "(Landroidx/core/view/s;)V", "owner", "(Landroidx/core/view/s;Landroidx/lifecycle/n0;)V", "Landroidx/lifecycle/b0$b;", RemoteConfigConstants.ResponseFieldKey.STATE, "(Landroidx/core/view/s;Landroidx/lifecycle/n0;Landroidx/lifecycle/b0$b;)V", "removeMenuProvider", "invalidateMenu", "onBackPressed", "Landroid/content/Intent;", "intent", "requestCode", "startActivityForResult", "(Landroid/content/Intent;I)V", "options", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "startIntentSenderForResult", "(Landroid/content/IntentSender;ILandroid/content/Intent;III)V", "(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "I", "O", "Lg/a;", "contract", "Lf/e;", "registry", "Lf/b;", "callback", "Lf/c;", "registerForActivityResult", "(Lg/a;Lf/e;Lf/b;)Lf/c;", "(Lg/a;Lf/b;)Lf/c;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lk7/b;", "addOnConfigurationChangedListener", "(Lk7/b;)V", "removeOnConfigurationChangedListener", "level", "onTrimMemory", "addOnTrimMemoryListener", "removeOnTrimMemoryListener", "onNewIntent", "(Landroid/content/Intent;)V", "addOnNewIntentListener", "removeOnNewIntentListener", "isInMultiWindowMode", "onMultiWindowModeChanged", "(Z)V", "(ZLandroid/content/res/Configuration;)V", "Lz6/h;", "addOnMultiWindowModeChangedListener", "removeOnMultiWindowModeChangedListener", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "Lz6/e0;", "addOnPictureInPictureModeChangedListener", "removeOnPictureInPictureModeChangedListener", "onUserLeaveHint", "Ljava/lang/Runnable;", "addOnUserLeaveHintListener", "(Ljava/lang/Runnable;)V", "removeOnUserLeaveHintListener", "reportFullyDrawn", "ensureViewModelStore", "Lb/u;", "dispatcher", "addObserverForBackInvoker", "(Lb/u;)V", "Lb/g$d;", "createFullyDrawnExecutor", "()Lb/g$d;", "Le/a;", "contextAwareHelper", "Le/a;", "Landroidx/core/view/r;", "menuHostHelper", "Landroidx/core/view/r;", "Lnd/d;", "savedStateRegistryController", "Lnd/d;", "getSavedStateRegistryController$annotations", "Landroidx/lifecycle/y1;", "_viewModelStore", "Landroidx/lifecycle/y1;", "reportFullyDrawnExecutor", "Lb/g$d;", "Lb/r;", "fullyDrawnReporter$delegate", "Lo13/l;", "getFullyDrawnReporter", "()Lb/r;", "fullyDrawnReporter", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextLocalRequestCode", "Ljava/util/concurrent/atomic/AtomicInteger;", "activityResultRegistry", "Lf/e;", "getActivityResultRegistry", "()Lf/e;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onConfigurationChangedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onTrimMemoryListeners", "onNewIntentListeners", "onMultiWindowModeChangedListeners", "onPictureInPictureModeChangedListeners", "onUserLeaveHintListeners", "dispatchingOnMultiWindowModeChanged", "Z", "dispatchingOnPictureInPictureModeChanged", "Lwc/a;", "onBackPressedInput$delegate", "getOnBackPressedInput", "()Lwc/a;", "onBackPressedInput", "Landroidx/lifecycle/x1$c;", "defaultViewModelProviderFactory$delegate", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/x1$c;", "defaultViewModelProviderFactory", "onBackPressedDispatcher$delegate", "getOnBackPressedDispatcher", "()Lb/u;", "onBackPressedDispatcher", "getLastCustomNonConfigurationInstance", "lastCustomNonConfigurationInstance", "Landroidx/lifecycle/b0;", "getLifecycle", "()Landroidx/lifecycle/b0;", "lifecycle", "getViewModelStore", "()Landroidx/lifecycle/y1;", "viewModelStore", "Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultViewModelCreationExtras", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "defaultViewModelCreationExtras", "Lwc/c;", "getNavigationEventDispatcher", "()Lwc/c;", "navigationEventDispatcher", "Lnd/c;", "getSavedStateRegistry", "()Lnd/c;", "savedStateRegistry", "Companion", "c", "d", JWKParameterNames.RSA_EXPONENT, "b", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class g extends z6.e implements ViewModelStoreOwner, y, nd.e, w, wc.d, f.h, a7.e, a7.f, b0, c0, androidx.core.view.o {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final b Companion = new b(null);
    private y1 _viewModelStore;
    private final f.e activityResultRegistry;
    private int contentLayoutId;
    private final e.a contextAwareHelper;

    /* JADX INFO: renamed from: defaultViewModelProviderFactory$delegate, reason: from kotlin metadata */
    private final o13.l defaultViewModelProviderFactory;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;

    /* JADX INFO: renamed from: fullyDrawnReporter$delegate, reason: from kotlin metadata */
    private final o13.l fullyDrawnReporter;
    private final androidx.core.view.r menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;

    /* JADX INFO: renamed from: onBackPressedDispatcher$delegate, reason: from kotlin metadata */
    private final o13.l onBackPressedDispatcher;

    /* JADX INFO: renamed from: onBackPressedInput$delegate, reason: from kotlin metadata */
    private final o13.l onBackPressedInput;
    private final CopyOnWriteArrayList<k7.b<Configuration>> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<k7.b<z6.h>> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<k7.b<Intent>> onNewIntentListeners;
    private final CopyOnWriteArrayList<k7.b<e0>> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<k7.b<Integer>> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final d reportFullyDrawnExecutor;
    private final nd.d savedStateRegistryController;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"b/g$a", "Landroidx/lifecycle/k0;", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements k0 {
        public a() {
        }

        @Override // androidx.lifecycle.k0
        public final void onStateChanged(n0 n0Var, androidx.lifecycle.b0.a aVar) {
            g gVar = g.this;
            gVar.ensureViewModelStore();
            gVar.getF158016a().d(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb/g$c;", "", "<init>", "()V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f13799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public y1 f13800b;
    }

    public interface d extends Executor {
        void B();

        void N(View view2);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lb/g$e;", "Lb/g$d;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "Ljava/lang/Runnable;", "<init>", "(Lb/g;)V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class e implements d, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f13801a = SystemClock.uptimeMillis() + ((long) 10000);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Runnable f13802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f13803c;

        public e() {
        }

        @Override // b.g.d
        public final void B() {
            g gVar = g.this;
            gVar.getWindow().getDecorView().removeCallbacks(this);
            gVar.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // b.g.d
        public final void N(View view2) {
            if (this.f13803c) {
                return;
            }
            this.f13803c = true;
            view2.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.getClass();
            this.f13802b = runnable;
            View decorView = g.this.getWindow().getDecorView();
            decorView.getClass();
            if (!this.f13803c) {
                decorView.postOnAnimation(new a0.c(this, 17));
            } else if (p005kotlin.jvm.internal.s.g(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            boolean z14;
            Runnable runnable = this.f13802b;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f13801a) {
                    this.f13803c = false;
                    g.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f13802b = null;
            r fullyDrawnReporter = g.this.getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f13814c) {
                z14 = fullyDrawnReporter.f13815d;
            }
            if (z14) {
                this.f13803c = false;
                g.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"b/g$f", "Lf/e;", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends f.e {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ int f13805j = 0;

        public f() {
        }

        @Override // f.e
        public final <I, O> void b(int i14, g.a<I, O> aVar, I i15, z6.b bVar) {
            Bundle bundleA;
            int i16;
            aVar.getClass();
            g gVar = g.this;
            g.a.C1502a<O> c1502aB = aVar.b(gVar, i15);
            if (c1502aB != null) {
                new Handler(Looper.getMainLooper()).post(new androidx.camera.camera2.internal.compat.j(this, i14, c1502aB, 2));
                return;
            }
            Intent intentA = aVar.a(gVar, i15);
            if (intentA.getExtras() != null) {
                Bundle extras = intentA.getExtras();
                extras.getClass();
                if (extras.getClassLoader() == null) {
                    intentA.setExtrasClassLoader(gVar.getClassLoader());
                }
            }
            if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleA = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleA = bVar != null ? bVar.a() : null;
            }
            Bundle bundle = bundleA;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
                String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                z6.a.a(gVar, stringArrayExtra, i14);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
                gVar.startActivityForResult(intentA, i14, bundle);
                return;
            }
            f.i iVar = (f.i) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                iVar.getClass();
                i16 = i14;
                try {
                    gVar.startIntentSenderForResult(iVar.f67609a, i16, iVar.f67610b, iVar.f67611c, iVar.f67612d, 0, bundle);
                    Unit unit = Unit.INSTANCE;
                } catch (IntentSender.SendIntentException e4) {
                    e = e4;
                    new Handler(Looper.getMainLooper()).post(new androidx.camera.camera2.internal.compat.j(this, i16, e, 3));
                }
            } catch (IntentSender.SendIntentException e14) {
                e = e14;
                i16 = i14;
            }
        }
    }

    public g() {
        this.contextAwareHelper = new e.a();
        int i14 = 1;
        this.menuHostHelper = new androidx.core.view.r(new b.d(this, i14));
        nd.d.f125385c.getClass();
        nd.d dVarA = nd.d.a.a(this);
        this.savedStateRegistryController = dVarA;
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter = o13.m.b(new b.e(this, i14));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new f();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput = o13.m.b(new b.e(this, 2));
        if (getF158016a() == null) {
            vb.h.z("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        final int i15 = 0;
        getF158016a().a(new k0(this) { // from class: b.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f13797b;

            {
                this.f13797b = this;
            }

            @Override // androidx.lifecycle.k0
            public final void onStateChanged(n0 n0Var, androidx.lifecycle.b0.a aVar) {
                switch (i15) {
                    case 0:
                        g._init_$lambda$1(this.f13797b, n0Var, aVar);
                        break;
                    default:
                        g._init_$lambda$2(this.f13797b, n0Var, aVar);
                        break;
                }
            }
        });
        final int i16 = 1;
        getF158016a().a(new k0(this) { // from class: b.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f13797b;

            {
                this.f13797b = this;
            }

            @Override // androidx.lifecycle.k0
            public final void onStateChanged(n0 n0Var, androidx.lifecycle.b0.a aVar) {
                switch (i16) {
                    case 0:
                        g._init_$lambda$1(this.f13797b, n0Var, aVar);
                        break;
                    default:
                        g._init_$lambda$2(this.f13797b, n0Var, aVar);
                        break;
                }
            }
        });
        getF158016a().a(new a());
        dVarA.f125386a.a();
        m1.b(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new androidx.fragment.app.j(this, 2));
        addOnContextAvailableListener(new androidx.fragment.app.l(this, 1));
        this.defaultViewModelProviderFactory = o13.m.b(new b.e(this, 3));
        this.onBackPressedDispatcher = o13.m.b(new b.e(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(g gVar, n0 n0Var, androidx.lifecycle.b0.a aVar) {
        Window window;
        View viewPeekDecorView;
        n0Var.getClass();
        aVar.getClass();
        if (aVar != androidx.lifecycle.b0.a.ON_STOP || (window = gVar.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(g gVar, n0 n0Var, androidx.lifecycle.b0.a aVar) {
        n0Var.getClass();
        aVar.getClass();
        if (aVar == androidx.lifecycle.b0.a.ON_DESTROY) {
            gVar.contextAwareHelper.f61816b = null;
            if (!gVar.isChangingConfigurations()) {
                gVar.getViewModelStore().a();
            }
            gVar.reportFullyDrawnExecutor.B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$3(g gVar) {
        Bundle bundle = new Bundle();
        f.e eVar = gVar.activityResultRegistry;
        eVar.getClass();
        LinkedHashMap linkedHashMap = eVar.f67593b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(eVar.f67595d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(eVar.f67598g));
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(g gVar, Context context) {
        context.getClass();
        Bundle bundleA = gVar.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            f.e eVar = gVar.activityResultRegistry;
            LinkedHashMap linkedHashMap = eVar.f67593b;
            LinkedHashMap linkedHashMap2 = eVar.f67592a;
            Bundle bundle = eVar.f67598g;
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                eVar.f67595d.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                String str = stringArrayList.get(i14);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        y0.c(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i14);
                num2.getClass();
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i14);
                str2.getClass();
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                eVar.f67593b.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserverForBackInvoker(u dispatcher) {
        getF158016a().a(new androidx.core.view.q(2, dispatcher, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$0(u uVar, g gVar, n0 n0Var, androidx.lifecycle.b0.a aVar) {
        n0Var.getClass();
        aVar.getClass();
        if (aVar == androidx.lifecycle.b0.a.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = gVar.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            uVar.e(onBackInvokedDispatcher);
        }
    }

    private final d createFullyDrawnExecutor() {
        return new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p1 defaultViewModelProviderFactory_delegate$lambda$0(g gVar) {
        return new p1(gVar.getApplication(), gVar, gVar.getIntent() != null ? gVar.getIntent().getExtras() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this._viewModelStore = cVar.f13800b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new y1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r fullyDrawnReporter_delegate$lambda$0(g gVar) {
        return new r(gVar.reportFullyDrawnExecutor, new b.e(gVar, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fullyDrawnReporter_delegate$lambda$0$0(g gVar) {
        gVar.reportFullyDrawn();
        return Unit.INSTANCE;
    }

    private final wc.a getOnBackPressedInput() {
        return (wc.a) this.onBackPressedInput.getValue();
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u onBackPressedDispatcher_delegate$lambda$0(g gVar) {
        u uVar = new u(new b.d(gVar, 0));
        if (Build.VERSION.SDK_INT >= 33) {
            if (!p005kotlin.jvm.internal.s.g(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new ab.j(15, gVar, uVar));
                return uVar;
            }
            gVar.addObserverForBackInvoker(uVar);
        }
        return uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBackPressedDispatcher_delegate$lambda$0$0(g gVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e4) {
            if (!p005kotlin.jvm.internal.s.g(e4.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e4;
            }
        } catch (NullPointerException e14) {
            if (!p005kotlin.jvm.internal.s.g(e14.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e14;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wc.a onBackPressedInput_delegate$lambda$0(g gVar) {
        wc.a aVar = new wc.a();
        gVar.getNavigationEventDispatcher().b(aVar);
        return aVar;
    }

    @Override // android.app.Activity
    public void addContentView(View view2, ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        dVar.N(decorView);
        super.addContentView(view2, params);
    }

    @Override // androidx.core.view.o
    public void addMenuProvider(androidx.core.view.s provider) {
        provider.getClass();
        androidx.core.view.r rVar = this.menuHostHelper;
        rVar.f6559b.add(provider);
        rVar.f6558a.run();
    }

    @Override // a7.e
    public final void addOnConfigurationChangedListener(k7.b<Configuration> listener) {
        listener.getClass();
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(e.b listener) {
        listener.getClass();
        e.a aVar = this.contextAwareHelper;
        aVar.getClass();
        g gVar = aVar.f61816b;
        if (gVar != null) {
            listener.a(gVar);
        }
        aVar.f61815a.add(listener);
    }

    @Override // z6.b0
    public final void addOnMultiWindowModeChangedListener(k7.b<z6.h> listener) {
        listener.getClass();
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(k7.b<Intent> listener) {
        listener.getClass();
        this.onNewIntentListeners.add(listener);
    }

    @Override // z6.c0
    public final void addOnPictureInPictureModeChangedListener(k7.b<e0> listener) {
        listener.getClass();
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // a7.f
    public final void addOnTrimMemoryListener(k7.b<Integer> listener) {
        listener.getClass();
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(Runnable listener) {
        listener.getClass();
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // f.h
    public final f.e getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.y
    public CreationExtras getDefaultViewModelCreationExtras() {
        androidx.lifecycle.viewmodel.a aVar = new androidx.lifecycle.viewmodel.a(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        if (getApplication() != null) {
            aVar.b(x1.a.f8075f, getApplication());
        }
        aVar.b(m1.f7960a, this);
        aVar.b(m1.f7961b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            aVar.b(m1.f7962c, extras);
        }
        return aVar;
    }

    @Override // androidx.lifecycle.y
    public x1.c getDefaultViewModelProviderFactory() {
        return (x1.c) this.defaultViewModelProviderFactory.getValue();
    }

    public r getFullyDrawnReporter() {
        return (r) this.fullyDrawnReporter.getValue();
    }

    @o13.e
    public Object getLastCustomNonConfigurationInstance() {
        c cVar = (c) getLastNonConfigurationInstance();
        if (cVar != null) {
            return cVar.f13799a;
        }
        return null;
    }

    @Override // z6.e, androidx.lifecycle.n0
    /* JADX INFO: renamed from: getLifecycle */
    public androidx.lifecycle.b0 getF158016a() {
        return super.getF158016a();
    }

    @Override // wc.d
    public wc.c getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().c().f13827c;
    }

    @Override // b.w
    public final u getOnBackPressedDispatcher() {
        return (u) this.onBackPressedDispatcher.getValue();
    }

    @Override // nd.e
    public final nd.c getSavedStateRegistry() {
        return this.savedStateRegistryController.f125387b;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public y1 getViewModelStore() {
        if (getApplication() == null) {
            vb.h.z("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        ensureViewModelStore();
        y1 y1Var = this._viewModelStore;
        y1Var.getClass();
        return y1Var;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // androidx.core.view.o
    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @o13.e
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (this.activityResultRegistry.a(requestCode, resultCode, data)) {
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // android.app.Activity
    @o13.e
    public void onBackPressed() {
        getOnBackPressedInput().a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        newConfig.getClass();
        super.onConfigurationChanged(newConfig);
        Iterator<k7.b<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // z6.e, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        this.savedStateRegistryController.a(savedInstanceState);
        e.a aVar = this.contextAwareHelper;
        aVar.getClass();
        aVar.f61816b = this;
        Iterator it = aVar.f61815a.iterator();
        while (it.hasNext()) {
            ((e.b) it.next()).a(this);
        }
        super.onCreate(savedInstanceState);
        i1.f7938b.getClass();
        i1.a.b(this);
        int i14 = this.contentLayoutId;
        if (i14 != 0) {
            setContentView(i14);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        menu.getClass();
        if (featureId != 0) {
            return true;
        }
        super.onCreatePanelMenu(featureId, menu);
        androidx.core.view.r rVar = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator<androidx.core.view.s> it = rVar.f6559b.iterator();
        while (it.hasNext()) {
            it.next().Y3(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        item.getClass();
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        if (featureId == 0) {
            Iterator<androidx.core.view.s> it = this.menuHostHelper.f6559b.iterator();
            while (it.hasNext()) {
                if (it.next().w5(item)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode, Configuration newConfig) {
        newConfig.getClass();
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(isInMultiWindowMode, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<k7.b<z6.h>> it = this.onMultiWindowModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new z6.h(isInMultiWindowMode, newConfig));
            }
        } catch (Throwable th3) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th3;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator<k7.b<Intent>> it = this.onNewIntentListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int featureId, Menu menu) {
        menu.getClass();
        Iterator<androidx.core.view.s> it = this.menuHostHelper.f6559b.iterator();
        while (it.hasNext()) {
            it.next().M1(menu);
        }
        super.onPanelClosed(featureId, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig) {
        newConfig.getClass();
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<k7.b<e0>> it = this.onPictureInPictureModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new e0(isInPictureInPictureMode, newConfig));
            }
        } catch (Throwable th3) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th3;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int featureId, View view2, Menu menu) {
        menu.getClass();
        if (featureId != 0) {
            return true;
        }
        super.onPreparePanel(featureId, view2, menu);
        Iterator<androidx.core.view.s> it = this.menuHostHelper.f6559b.iterator();
        while (it.hasNext()) {
            it.next().Z4(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    @o13.e
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        permissions.getClass();
        grantResults.getClass();
        if (this.activityResultRegistry.a(requestCode, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @o13.e
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        y1 y1Var = this._viewModelStore;
        if (y1Var == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            y1Var = cVar.f13800b;
        }
        if (y1Var == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.f13799a = objOnRetainCustomNonConfigurationInstance;
        cVar2.f13800b = y1Var;
        return cVar2;
    }

    @Override // z6.e, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        outState.getClass();
        if (getF158016a() instanceof o0) {
            androidx.lifecycle.b0 lifecycle = getF158016a();
            lifecycle.getClass();
            ((o0) lifecycle).i(androidx.lifecycle.b0.b.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.b(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Iterator<k7.b<Integer>> it = this.onTrimMemoryListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(level));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.f61816b;
    }

    public final <I, O> f.c<I> registerForActivityResult(g.a<I, O> contract, f.e registry, f.b<O> callback) {
        contract.getClass();
        registry.getClass();
        callback.getClass();
        return registry.c("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // androidx.core.view.o
    public void removeMenuProvider(androidx.core.view.s provider) {
        provider.getClass();
        this.menuHostHelper.c(provider);
    }

    @Override // a7.e
    public final void removeOnConfigurationChangedListener(k7.b<Configuration> listener) {
        listener.getClass();
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(e.b listener) {
        listener.getClass();
        e.a aVar = this.contextAwareHelper;
        aVar.getClass();
        aVar.f61815a.remove(listener);
    }

    @Override // z6.b0
    public final void removeOnMultiWindowModeChangedListener(k7.b<z6.h> listener) {
        listener.getClass();
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(k7.b<Intent> listener) {
        listener.getClass();
        this.onNewIntentListeners.remove(listener);
    }

    @Override // z6.c0
    public final void removeOnPictureInPictureModeChangedListener(k7.b<e0> listener) {
        listener.getClass();
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // a7.f
    public final void removeOnTrimMemoryListener(k7.b<Integer> listener) {
        listener.getClass();
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(Runnable listener) {
        listener.getClass();
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (ce.a.b()) {
                Trace.beginSection(ce.a.d("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().a();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int layoutResID) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        dVar.N(decorView);
        super.setContentView(layoutResID);
    }

    @Override // android.app.Activity
    @o13.e
    public void startActivityForResult(Intent intent, int requestCode) {
        intent.getClass();
        super.startActivityForResult(intent, requestCode);
    }

    @Override // android.app.Activity
    @o13.e
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        intent.getClass();
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb/g$b;", "", "<init>", "()V", "", "ACTIVITY_RESULT_TAG", "Ljava/lang/String;", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    @Override // android.app.Activity
    @o13.e
    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        intent.getClass();
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override // android.app.Activity
    @o13.e
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws IntentSender.SendIntentException {
        intent.getClass();
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    @Override // androidx.core.view.o
    public void addMenuProvider(androidx.core.view.s provider, n0 owner) {
        provider.getClass();
        owner.getClass();
        this.menuHostHelper.a(provider, owner);
    }

    @Override // androidx.core.view.o
    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(androidx.core.view.s provider, n0 owner, androidx.lifecycle.b0.b state) {
        provider.getClass();
        owner.getClass();
        state.getClass();
        this.menuHostHelper.b(provider, owner, state);
    }

    @Override // android.app.Activity
    public void setContentView(View view2) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        dVar.N(decorView);
        super.setContentView(view2);
    }

    @Override // android.app.Activity
    public void setContentView(View view2, ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        dVar.N(decorView);
        super.setContentView(view2, params);
    }

    public final <I, O> f.c<I> registerForActivityResult(g.a<I, O> contract, f.b<O> callback) {
        contract.getClass();
        callback.getClass();
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    @o13.e
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<k7.b<z6.h>> it = this.onMultiWindowModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new z6.h(isInMultiWindowMode));
        }
    }

    @Override // android.app.Activity
    @o13.e
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<k7.b<e0>> it = this.onPictureInPictureModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new e0(isInPictureInPictureMode));
        }
    }

    public g(int i14) {
        this();
        this.contentLayoutId = i14;
    }
}
