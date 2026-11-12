package com.mapbox.maps.plugin.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import androidx.core.view.e1;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraAnimationHint;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxCameraAnimationException;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.g;
import com.mapbox.maps.plugin.MapCameraPlugin;
import com.mapbox.maps.plugin.animation.animator.CameraAnchorAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraBearingAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraCenterAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraPaddingAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraPitchAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraZoomAnimator;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import com.mapbox.maps.plugin.delegates.MapProjectionDelegate;
import com.mapbox.maps.plugin.delegates.MapTransformDelegate;
import com.mapbox.maps.threading.AnimationThreadController;
import com.mapbox.maps.util.CameraOptionsUtils;
import com.mapbox.maps.util.MathUtils;
import g23.c;
import g23.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import k23.l;
import kg.f;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.b0;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.d0;
import p13.h0;
import p13.w;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 Î\u00012\u00020\u00012\u00020\u0002:\u0004Ï\u0001Î\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001d\u001a\u00020\u00072\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a\"\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010!\u001a\u00020\u00072\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a\"\u00020\u001b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0007¢\u0006\u0004\b#\u0010\u0004J\u001d\u0010'\u001a\u00020\u00072\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0016¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\u00020\u00072\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0)H\u0016¢\u0006\u0004\b+\u0010,J\u001d\u0010-\u001a\u00020\u00072\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0)H\u0016¢\u0006\u0004\b-\u0010,J\u001d\u0010.\u001a\u00020\u00072\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0)H\u0016¢\u0006\u0004\b.\u0010,J\u001d\u0010/\u001a\u00020\u00072\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0)H\u0016¢\u0006\u0004\b/\u0010,J\u001d\u00100\u001a\u00020\u00072\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100)H\u0016¢\u0006\u0004\b0\u0010,J\u001d\u00101\u001a\u00020\u00072\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100)H\u0016¢\u0006\u0004\b1\u0010,J\u001f\u00104\u001a\u00020\u00072\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010302H\u0016¢\u0006\u0004\b4\u00105J\u001f\u00106\u001a\u00020\u00072\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010302H\u0016¢\u0006\u0004\b6\u00105J\u001d\u00107\u001a\u00020\u00072\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0)H\u0016¢\u0006\u0004\b7\u0010,J\u001d\u00108\u001a\u00020\u00072\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0)H\u0016¢\u0006\u0004\b8\u0010,J\u001d\u00109\u001a\u00020\u00072\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0)H\u0016¢\u0006\u0004\b9\u0010,J\u001d\u0010:\u001a\u00020\u00072\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0)H\u0016¢\u0006\u0004\b:\u0010,J\u0017\u0010<\u001a\u00020\u00072\u0006\u0010*\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u00072\u0006\u0010*\u001a\u00020;H\u0016¢\u0006\u0004\b>\u0010=J+\u0010D\u001a\u00020C2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010@\u001a\u0004\u0018\u00010?2\b\u0010B\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\bD\u0010EJ+\u0010G\u001a\u00020C2\u0006\u0010F\u001a\u0002032\b\u0010@\u001a\u0004\u0018\u00010?2\b\u0010B\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\bG\u0010HJ5\u0010J\u001a\u00020C2\u0006\u0010I\u001a\u00020\f2\b\u0010F\u001a\u0004\u0018\u0001032\b\u0010@\u001a\u0004\u0018\u00010?2\b\u0010B\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\bJ\u0010KJ\u001f\u0010M\u001a\u00020\f2\u0006\u0010I\u001a\u00020\f2\u0006\u0010L\u001a\u00020\fH\u0016¢\u0006\u0004\bM\u0010NJ3\u0010Q\u001a\u00020C2\u0006\u0010O\u001a\u0002032\u0006\u0010P\u001a\u0002032\b\u0010@\u001a\u0004\u0018\u00010?2\b\u0010B\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\bQ\u0010RJ+\u0010S\u001a\u00020C2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010@\u001a\u0004\u0018\u00010?2\b\u0010B\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\bS\u0010TJ+\u0010U\u001a\u00020C2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010@\u001a\u0004\u0018\u00010?2\b\u0010B\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\bU\u0010EJ3\u0010Z\u001a\u00020\u001b2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\f0V2\u0014\u0010Y\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0007\u0018\u00010XH\u0016¢\u0006\u0004\bZ\u0010[J3\u0010\\\u001a\u00020\u001b2\f\u0010W\u001a\b\u0012\u0004\u0012\u0002030V2\u0014\u0010Y\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0007\u0018\u00010XH\u0016¢\u0006\u0004\b\\\u0010[J;\u0010^\u001a\u00020\u001b2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\f0V2\u0006\u0010]\u001a\u00020\u001f2\u0014\u0010Y\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0007\u0018\u00010XH\u0016¢\u0006\u0004\b^\u0010_J3\u0010`\u001a\u00020\u001b2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\f0V2\u0014\u0010Y\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0007\u0018\u00010XH\u0016¢\u0006\u0004\b`\u0010[J3\u0010a\u001a\u00020\u001b2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00100V2\u0014\u0010Y\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0007\u0018\u00010XH\u0016¢\u0006\u0004\ba\u0010[J;\u0010b\u001a\u00020\u001b2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\n0V2\u0006\u0010]\u001a\u00020\u001f2\u0014\u0010Y\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0007\u0018\u00010XH\u0016¢\u0006\u0004\bb\u0010_J#\u0010d\u001a\u00020\u00072\u0012\u0010c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a\"\u00020\u001bH\u0016¢\u0006\u0004\bd\u0010\u001eJ#\u0010e\u001a\u00020\u00072\u0012\u0010c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a\"\u00020\u001bH\u0016¢\u0006\u0004\be\u0010\u001eJ\u0017\u0010f\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\bf\u0010gJ\u001b\u0010j\u001a\u00020\u001f2\n\u0010i\u001a\u0006\u0012\u0002\b\u00030hH\u0002¢\u0006\u0004\bj\u0010kJ)\u0010p\u001a\u00020\u001f2\u0010\u0010m\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010l0\u001a2\u0006\u0010o\u001a\u00020nH\u0002¢\u0006\u0004\bp\u0010qJ\u001b\u0010s\u001a\u00020\u00072\n\u0010r\u001a\u0006\u0012\u0002\b\u00030hH\u0002¢\u0006\u0004\bs\u0010tJ\u001b\u0010u\u001a\u00020\u00072\n\u0010r\u001a\u0006\u0012\u0002\b\u00030hH\u0002¢\u0006\u0004\bu\u0010tJ#\u0010w\u001a\u00020\u00072\n\u0010r\u001a\u0006\u0012\u0002\b\u00030h2\u0006\u0010v\u001a\u00020\u001bH\u0002¢\u0006\u0004\bw\u0010xJ\u000f\u0010y\u001a\u00020\u0007H\u0002¢\u0006\u0004\by\u0010\u0004J\u000f\u0010z\u001a\u00020\u0007H\u0002¢\u0006\u0004\bz\u0010\u0004J5\u0010{\u001a\u00020C2\u0010\u0010c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030h0\u001a2\b\u0010@\u001a\u0004\u0018\u00010?2\b\u0010B\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0004\b{\u0010|R;\u0010c\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030h0}j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030h`~8\u0000X\u0081\u0004¢\u0006\u0015\n\u0004\bc\u0010\u007f\u0012\u0005\b\u0082\u0001\u0010\u0004\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R)\u0010\u0085\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u001b0\u0083\u0001j\t\u0012\u0004\u0012\u00020\u001b`\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001c\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R$\u0010\u008b\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0)0\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R$\u0010\u008d\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0)0\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008c\u0001R$\u0010\u008e\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100)0\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008c\u0001R&\u0010\u008f\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u000103020\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u008c\u0001R$\u0010\u0090\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0)0\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u008c\u0001R$\u0010\u0091\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0)0\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u008c\u0001R\u001e\u0010\u0092\u0001\u001a\t\u0012\u0004\u0012\u00020;0\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u008c\u0001R\u001e\u0010\u0094\u0001\u001a\t\u0012\u0005\u0012\u00030\u0093\u00010$8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R)\u0010\u0096\u0001\u001a\u00020\u001f8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R6\u0010\u000b\u001a\u0004\u0018\u00010\n2\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010\n8B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R6\u0010\r\u001a\u0004\u0018\u00010\f2\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010\f8B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\b£\u0001\u0010\u009e\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R6\u0010\u0011\u001a\u0004\u0018\u00010\u00102\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u00108B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\b¨\u0001\u0010\u009e\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R7\u0010²\u0001\u001a\u0004\u0018\u0001032\t\u0010\u009c\u0001\u001a\u0004\u0018\u0001038V@VX\u0096\u008e\u0002¢\u0006\u0018\n\u0006\b\u00ad\u0001\u0010\u009e\u0001\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R6\u0010\u000f\u001a\u0004\u0018\u00010\f2\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010\f8B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\b³\u0001\u0010\u009e\u0001\u001a\u0006\b´\u0001\u0010¥\u0001\"\u0006\bµ\u0001\u0010§\u0001R6\u0010\u000e\u001a\u0004\u0018\u00010\f2\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010\f8B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\b¶\u0001\u0010\u009e\u0001\u001a\u0006\b·\u0001\u0010¥\u0001\"\u0006\b¸\u0001\u0010§\u0001R\u001a\u0010º\u0001\u001a\u00030¹\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u0019\u0010¼\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u001a\u0010¿\u0001\u001a\u00030¾\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R\u001a\u0010Â\u0001\u001a\u00030Á\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u001a\u0010Å\u0001\u001a\u00030Ä\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R*\u0010È\u0001\u001a\u00030Ç\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÈ\u0001\u0010É\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0006\bÌ\u0001\u0010Í\u0001¨\u0006Ð\u0001"}, d2 = {"Lcom/mapbox/maps/plugin/animation/CameraAnimationsPluginImpl;", "Lcom/mapbox/maps/plugin/animation/CameraAnimationsPlugin;", "Lcom/mapbox/maps/plugin/MapCameraPlugin;", "<init>", "()V", "Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "delegateProvider", "", "onDelegateProvider", "(Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;)V", "Lcom/mapbox/geojson/Point;", TtmlNode.CENTER, "", "zoom", "pitch", "bearing", "Lcom/mapbox/maps/EdgeInsets;", "padding", "onCameraMove", "(Lcom/mapbox/geojson/Point;DDDLcom/mapbox/maps/EdgeInsets;)V", "cleanup", "Lcom/mapbox/maps/CameraOptions;", "cameraOptions", "performMapJump$plugin_animation_release", "(Lcom/mapbox/maps/CameraOptions;)V", "performMapJump", "", "Landroid/animation/ValueAnimator;", "cameraAnimators", "registerAnimators", "([Landroid/animation/ValueAnimator;)V", "", "cancelAnimators", "unregisterAnimators", "([Landroid/animation/ValueAnimator;Z)V", "unregisterAllAnimators", "", "", "exceptOwnerList", "cancelAllAnimators", "(Ljava/util/List;)V", "Lcom/mapbox/maps/plugin/animation/CameraAnimatorChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addCameraZoomChangeListener", "(Lcom/mapbox/maps/plugin/animation/CameraAnimatorChangeListener;)V", "removeCameraZoomChangeListener", "addCameraCenterChangeListener", "removeCameraCenterChangeListener", "addCameraPaddingChangeListener", "removeCameraPaddingChangeListener", "Lcom/mapbox/maps/plugin/animation/CameraAnimatorNullableChangeListener;", "Lcom/mapbox/maps/ScreenCoordinate;", "addCameraAnchorChangeListener", "(Lcom/mapbox/maps/plugin/animation/CameraAnimatorNullableChangeListener;)V", "removeCameraAnchorChangeListener", "addCameraBearingChangeListener", "removeCameraBearingChangeListener", "addCameraPitchChangeListener", "removeCameraPitchChangeListener", "Lcom/mapbox/maps/plugin/animation/CameraAnimationsLifecycleListener;", "addCameraAnimationsLifecycleListener", "(Lcom/mapbox/maps/plugin/animation/CameraAnimationsLifecycleListener;)V", "removeCameraAnimationsLifecycleListener", "Lcom/mapbox/maps/plugin/animation/MapAnimationOptions;", "animationOptions", "Landroid/animation/Animator$AnimatorListener;", "animatorListener", "Lcom/mapbox/common/Cancelable;", "easeTo", "(Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/plugin/animation/MapAnimationOptions;Landroid/animation/Animator$AnimatorListener;)Lcom/mapbox/common/Cancelable;", "screenCoordinate", "moveBy", "(Lcom/mapbox/maps/ScreenCoordinate;Lcom/mapbox/maps/plugin/animation/MapAnimationOptions;Landroid/animation/Animator$AnimatorListener;)Lcom/mapbox/common/Cancelable;", "amount", "scaleBy", "(DLcom/mapbox/maps/ScreenCoordinate;Lcom/mapbox/maps/plugin/animation/MapAnimationOptions;Landroid/animation/Animator$AnimatorListener;)Lcom/mapbox/common/Cancelable;", "currentZoom", "calculateScaleBy", "(DD)D", "first", "second", "rotateBy", "(Lcom/mapbox/maps/ScreenCoordinate;Lcom/mapbox/maps/ScreenCoordinate;Lcom/mapbox/maps/plugin/animation/MapAnimationOptions;Landroid/animation/Animator$AnimatorListener;)Lcom/mapbox/common/Cancelable;", "pitchBy", "(DLcom/mapbox/maps/plugin/animation/MapAnimationOptions;Landroid/animation/Animator$AnimatorListener;)Lcom/mapbox/common/Cancelable;", "flyTo", "Lcom/mapbox/maps/plugin/animation/CameraAnimatorOptions;", "options", "Lkotlin/Function1;", "block", "createZoomAnimator", "(Lcom/mapbox/maps/plugin/animation/CameraAnimatorOptions;Le23/l;)Landroid/animation/ValueAnimator;", "createAnchorAnimator", "useShortestPath", "createBearingAnimator", "(Lcom/mapbox/maps/plugin/animation/CameraAnimatorOptions;ZLe23/l;)Landroid/animation/ValueAnimator;", "createPitchAnimator", "createPaddingAnimator", "createCenterAnimator", "animators", "playAnimatorsTogether", "playAnimatorsSequentially", "skipMapJump", "(Lcom/mapbox/maps/CameraOptions;)Z", "Lcom/mapbox/maps/plugin/animation/animator/CameraAnimator;", "cameraAnimator", "updateAnimatorValues", "(Lcom/mapbox/maps/plugin/animation/animator/CameraAnimator;)Z", "", "animationObjectValues", "Lcom/mapbox/maps/plugin/animation/CameraAnimatorType;", NotificationConstants.KEY_DATA_MIME_TYPE, "skipRedundantAnimator", "([Ljava/lang/Object;Lcom/mapbox/maps/plugin/animation/CameraAnimatorType;)Z", "animator", "registerInternalListener", "(Lcom/mapbox/maps/plugin/animation/animator/CameraAnimator;)V", "registerInternalUpdateListener", "valueAnimator", "onAnimationUpdateInternal", "(Lcom/mapbox/maps/plugin/animation/animator/CameraAnimator;Landroid/animation/ValueAnimator;)V", "commitChanges", "cancelAnimatorSet", "startHighLevelAnimation", "([Lcom/mapbox/maps/plugin/animation/animator/CameraAnimator;Lcom/mapbox/maps/plugin/animation/MapAnimationOptions;Landroid/animation/Animator$AnimatorListener;)Lcom/mapbox/common/Cancelable;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "getAnimators$plugin_animation_release", "()Ljava/util/HashSet;", "getAnimators$plugin_animation_release$annotations", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "runningAnimatorsQueue", "Ljava/util/LinkedHashSet;", "Lcom/mapbox/maps/plugin/animation/HighLevelAnimatorSet;", "highLevelAnimatorSet", "Lcom/mapbox/maps/plugin/animation/HighLevelAnimatorSet;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "centerListeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "zoomListeners", "paddingListeners", "anchorListeners", "bearingListeners", "pitchListeners", "lifecycleListeners", "", "cameraAnimationHintFractions", "Ljava/util/List;", "debugMode", "Z", "getDebugMode", "()Z", "setDebugMode", "(Z)V", "<set-?>", "center$delegate", "Lg23/e;", "getCenter", "()Lcom/mapbox/geojson/Point;", "setCenter", "(Lcom/mapbox/geojson/Point;)V", "zoom$delegate", "getZoom", "()Ljava/lang/Double;", "setZoom", "(Ljava/lang/Double;)V", "padding$delegate", "getPadding", "()Lcom/mapbox/maps/EdgeInsets;", "setPadding", "(Lcom/mapbox/maps/EdgeInsets;)V", "anchor$delegate", "getAnchor", "()Lcom/mapbox/maps/ScreenCoordinate;", "setAnchor", "(Lcom/mapbox/maps/ScreenCoordinate;)V", "anchor", "bearing$delegate", "getBearing", "setBearing", "pitch$delegate", "getPitch", "setPitch", "Lcom/mapbox/maps/CameraOptions$Builder;", "cameraOptionsBuilder", "Lcom/mapbox/maps/CameraOptions$Builder;", "mapDelegateProvider", "Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "mapCameraManagerDelegate", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "Lcom/mapbox/maps/plugin/delegates/MapTransformDelegate;", "mapTransformDelegate", "Lcom/mapbox/maps/plugin/delegates/MapTransformDelegate;", "Lcom/mapbox/maps/plugin/delegates/MapProjectionDelegate;", "mapProjectionDelegate", "Lcom/mapbox/maps/plugin/delegates/MapProjectionDelegate;", "Lcom/mapbox/maps/plugin/animation/CameraAnimatorsFactory;", "cameraAnimationsFactory", "Lcom/mapbox/maps/plugin/animation/CameraAnimatorsFactory;", "getCameraAnimationsFactory", "()Lcom/mapbox/maps/plugin/animation/CameraAnimatorsFactory;", "setCameraAnimationsFactory", "(Lcom/mapbox/maps/plugin/animation/CameraAnimatorsFactory;)V", "Companion", "AnimationFinishStatus", "plugin-animation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CameraAnimationsPluginImpl implements CameraAnimationsPlugin, MapCameraPlugin {
    static final /* synthetic */ l<Object>[] $$delegatedProperties;
    public static final String TAG = "Mbgl-CameraManager";

    /* JADX INFO: renamed from: anchor$delegate, reason: from kotlin metadata */
    private final e anchor;

    /* JADX INFO: renamed from: bearing$delegate, reason: from kotlin metadata */
    private final e bearing;
    public CameraAnimatorsFactory cameraAnimationsFactory;
    private CameraOptions.Builder cameraOptionsBuilder;

    /* JADX INFO: renamed from: center$delegate, reason: from kotlin metadata */
    private final e center;
    private boolean debugMode;
    private HighLevelAnimatorSet highLevelAnimatorSet;
    private MapCameraManagerDelegate mapCameraManagerDelegate;
    private MapDelegateProvider mapDelegateProvider;
    private MapProjectionDelegate mapProjectionDelegate;
    private MapTransformDelegate mapTransformDelegate;

    /* JADX INFO: renamed from: padding$delegate, reason: from kotlin metadata */
    private final e padding;

    /* JADX INFO: renamed from: pitch$delegate, reason: from kotlin metadata */
    private final e pitch;

    /* JADX INFO: renamed from: zoom$delegate, reason: from kotlin metadata */
    private final e zoom;
    private final HashSet<CameraAnimator<?>> animators = new HashSet<>();
    private final LinkedHashSet<ValueAnimator> runningAnimatorsQueue = new LinkedHashSet<>();
    private final CopyOnWriteArraySet<CameraAnimatorChangeListener<Point>> centerListeners = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<CameraAnimatorChangeListener<Double>> zoomListeners = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<CameraAnimatorChangeListener<EdgeInsets>> paddingListeners = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<CameraAnimatorNullableChangeListener<ScreenCoordinate>> anchorListeners = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<CameraAnimatorChangeListener<Double>> bearingListeners = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<CameraAnimatorChangeListener<Double>> pitchListeners = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<CameraAnimationsLifecycleListener> lifecycleListeners = new CopyOnWriteArraySet<>();
    private final List<Float> cameraAnimationHintFractions = x.k(Float.valueOf(0.25f), Float.valueOf(0.5f), Float.valueOf(0.75f), Float.valueOf(1.0f));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/plugin/animation/CameraAnimationsPluginImpl$AnimationFinishStatus;", "", "(Ljava/lang/String;I)V", "CANCELED", "ENDED", "plugin-animation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum AnimationFinishStatus {
        CANCELED,
        ENDED
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CameraAnimatorType.values().length];
            try {
                iArr[CameraAnimatorType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CameraAnimatorType.ZOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CameraAnimatorType.ANCHOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CameraAnimatorType.PADDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CameraAnimatorType.BEARING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CameraAnimatorType.PITCH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        b0 b0Var = new b0(CameraAnimationsPluginImpl.class, TtmlNode.CENTER, "getCenter()Lcom/mapbox/geojson/Point;", 0);
        t0 t0Var = s0.f105811a;
        $$delegatedProperties = new l[]{t0Var.f(b0Var), f.g(CameraAnimationsPluginImpl.class, "zoom", "getZoom()Ljava/lang/Double;", 0, t0Var), f.g(CameraAnimationsPluginImpl.class, "padding", "getPadding()Lcom/mapbox/maps/EdgeInsets;", 0, t0Var), f.g(CameraAnimationsPluginImpl.class, "anchor", "getAnchor()Lcom/mapbox/maps/ScreenCoordinate;", 0, t0Var), f.g(CameraAnimationsPluginImpl.class, "bearing", "getBearing()Ljava/lang/Double;", 0, t0Var), f.g(CameraAnimationsPluginImpl.class, "pitch", "getPitch()Ljava/lang/Double;", 0, t0Var)};
        INSTANCE = new Companion(null);
    }

    public CameraAnimationsPluginImpl() {
        g23.a aVar = g23.a.f75578a;
        final Object obj = null;
        this.center = new c<Point>(obj) { // from class: com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl$special$$inlined$observable$1
            @Override // g23.c
            public void afterChange(l<?> property, Point oldValue, Point newValue) {
                property.getClass();
                Point point = newValue;
                Point point2 = oldValue;
                if (point == null || s.g(point2, point)) {
                    return;
                }
                Iterator it = this.centerListeners.iterator();
                while (it.hasNext()) {
                    ((CameraAnimatorChangeListener) it.next()).onChanged(point);
                }
            }
        };
        this.zoom = new c<Double>(obj) { // from class: com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl$special$$inlined$observable$2
            @Override // g23.c
            public void afterChange(l<?> property, Double oldValue, Double newValue) {
                property.getClass();
                Double d14 = newValue;
                Double d15 = oldValue;
                if (d14 != null) {
                    double dDoubleValue = d14.doubleValue();
                    if (s.c(d15, dDoubleValue)) {
                        return;
                    }
                    Iterator it = this.zoomListeners.iterator();
                    while (it.hasNext()) {
                        ((CameraAnimatorChangeListener) it.next()).onChanged(Double.valueOf(dDoubleValue));
                    }
                }
            }
        };
        this.padding = new c<EdgeInsets>(obj) { // from class: com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl$special$$inlined$observable$3
            @Override // g23.c
            public void afterChange(l<?> property, EdgeInsets oldValue, EdgeInsets newValue) {
                property.getClass();
                EdgeInsets edgeInsets = newValue;
                EdgeInsets edgeInsets2 = oldValue;
                if (edgeInsets == null || s.g(edgeInsets2, edgeInsets)) {
                    return;
                }
                Iterator it = this.paddingListeners.iterator();
                while (it.hasNext()) {
                    ((CameraAnimatorChangeListener) it.next()).onChanged(edgeInsets);
                }
            }
        };
        this.anchor = new c<ScreenCoordinate>(obj) { // from class: com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl$special$$inlined$observable$4
            @Override // g23.c
            public void afterChange(l<?> property, ScreenCoordinate oldValue, ScreenCoordinate newValue) {
                property.getClass();
                ScreenCoordinate screenCoordinate = newValue;
                if (s.g(oldValue, screenCoordinate)) {
                    return;
                }
                Iterator it = this.anchorListeners.iterator();
                while (it.hasNext()) {
                    ((CameraAnimatorNullableChangeListener) it.next()).onChanged(screenCoordinate);
                }
            }
        };
        this.bearing = new c<Double>(obj) { // from class: com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl$special$$inlined$observable$5
            @Override // g23.c
            public void afterChange(l<?> property, Double oldValue, Double newValue) {
                property.getClass();
                Double d14 = newValue;
                Double d15 = oldValue;
                if (d14 != null) {
                    double dDoubleValue = d14.doubleValue();
                    if (s.c(d15, dDoubleValue)) {
                        return;
                    }
                    Iterator it = this.bearingListeners.iterator();
                    while (it.hasNext()) {
                        ((CameraAnimatorChangeListener) it.next()).onChanged(Double.valueOf(dDoubleValue));
                    }
                }
            }
        };
        this.pitch = new c<Double>(obj) { // from class: com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl$special$$inlined$observable$6
            @Override // g23.c
            public void afterChange(l<?> property, Double oldValue, Double newValue) {
                property.getClass();
                Double d14 = newValue;
                Double d15 = oldValue;
                if (d14 != null) {
                    double dDoubleValue = d14.doubleValue();
                    if (s.c(d15, dDoubleValue)) {
                        return;
                    }
                    Iterator it = this.pitchListeners.iterator();
                    while (it.hasNext()) {
                        ((CameraAnimatorChangeListener) it.next()).onChanged(Double.valueOf(dDoubleValue));
                    }
                }
            }
        };
        this.cameraOptionsBuilder = new CameraOptions.Builder();
    }

    private final void cancelAnimatorSet() {
        HighLevelAnimatorSet highLevelAnimatorSet = this.highLevelAnimatorSet;
        if (highLevelAnimatorSet != null) {
            AnimationThreadController.INSTANCE.postOnAnimatorThread(new CameraAnimationsPluginImpl$cancelAnimatorSet$1$1(highLevelAnimatorSet));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void commitChanges() {
        CameraOptions cameraOptionsBuild = this.cameraOptionsBuilder.anchor(getAnchor()).build();
        cameraOptionsBuild.getClass();
        performMapJump$plugin_animation_release(cameraOptionsBuild);
        this.cameraOptionsBuilder = new CameraOptions.Builder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void easeTo$lambda$29() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void flyTo$lambda$30() {
    }

    public static /* synthetic */ void getAnimators$plugin_animation_release$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Double getBearing() {
        return (Double) this.bearing.getValue(this, $$delegatedProperties[4]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Point getCenter() {
        return (Point) this.center.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final EdgeInsets getPadding() {
        return (EdgeInsets) this.padding.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Double getPitch() {
        return (Double) this.pitch.getValue(this, $$delegatedProperties[5]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Double getZoom() {
        return (Double) this.zoom.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAnimationUpdateInternal(CameraAnimator<?> animator, ValueAnimator valueAnimator) {
        this.runningAnimatorsQueue.add(animator);
        CameraAnimationsUtils.updateCameraValue(animator, animator.getAnimatedValue(), this.cameraOptionsBuilder);
        if (animator.getType() == CameraAnimatorType.ANCHOR) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            animatedValue.getClass();
            setAnchor((ScreenCoordinate) animatedValue);
        }
        commitChanges();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerInternalListener(CameraAnimator<?> animator) {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C42091(animator, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerInternalUpdateListener(CameraAnimator<?> animator) {
        animator.addInternalUpdateListener$plugin_animation_release(new e1(3, this, animator));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerInternalUpdateListener$lambda$26(CameraAnimationsPluginImpl cameraAnimationsPluginImpl, CameraAnimator cameraAnimator, ValueAnimator valueAnimator) {
        cameraAnimationsPluginImpl.getClass();
        cameraAnimator.getClass();
        valueAnimator.getClass();
        AnimationThreadController.INSTANCE.postOnMainThread(new CameraAnimationsPluginImpl$registerInternalUpdateListener$1$1(cameraAnimationsPluginImpl, cameraAnimator, valueAnimator));
    }

    private final void setBearing(Double d14) {
        this.bearing.setValue(this, $$delegatedProperties[4], d14);
    }

    private final void setCenter(Point point) {
        this.center.setValue(this, $$delegatedProperties[0], point);
    }

    private final void setPadding(EdgeInsets edgeInsets) {
        this.padding.setValue(this, $$delegatedProperties[2], edgeInsets);
    }

    private final void setPitch(Double d14) {
        this.pitch.setValue(this, $$delegatedProperties[5], d14);
    }

    private final void setZoom(Double d14) {
        this.zoom.setValue(this, $$delegatedProperties[1], d14);
    }

    private final boolean skipMapJump(CameraOptions cameraOptions) {
        if (CameraOptionsUtils.isEmpty(cameraOptions)) {
            return true;
        }
        if (cameraOptions.getAnchor() != null) {
            return false;
        }
        Double pitch = cameraOptions.getPitch();
        if (pitch != null && (pitch.doubleValue() >= 60.0d || !s.a(pitch.doubleValue(), getPitch()))) {
            return false;
        }
        if (cameraOptions.getZoom() != null && !s.d(cameraOptions.getZoom(), getZoom())) {
            return false;
        }
        if (cameraOptions.getBearing() != null && !s.d(cameraOptions.getBearing(), getBearing())) {
            return false;
        }
        if (cameraOptions.getCenter() == null || s.g(cameraOptions.getCenter(), getCenter())) {
            return cameraOptions.getPadding() == null || s.g(cameraOptions.getPadding(), getPadding());
        }
        return false;
    }

    private final boolean skipRedundantAnimator(Object[] animationObjectValues, CameraAnimatorType type) {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                for (Object obj : animationObjectValues) {
                    if (!Objects.equals(getCenter(), obj)) {
                        return false;
                    }
                }
                return true;
            case 2:
                for (Object obj2 : animationObjectValues) {
                    if (!Objects.equals(getZoom(), obj2)) {
                        return false;
                    }
                }
                return true;
            case 3:
                return false;
            case 4:
                for (Object obj3 : animationObjectValues) {
                    if (!Objects.equals(getPadding(), obj3)) {
                        return false;
                    }
                }
                return true;
            case 5:
                for (Object obj4 : animationObjectValues) {
                    if (!Objects.equals(getBearing(), obj4)) {
                        return false;
                    }
                }
                return true;
            case 6:
                for (Object obj5 : animationObjectValues) {
                    if (!Objects.equals(getPitch(), obj5)) {
                        return false;
                    }
                }
                return true;
            default:
                u0.r();
                return false;
        }
    }

    private final Cancelable startHighLevelAnimation(CameraAnimator<?>[] animators, MapAnimationOptions animationOptions, Animator.AnimatorListener animatorListener) {
        TimeInterpolator interpolator;
        Long startDelay;
        Long duration;
        if (animators.length == 0) {
            MapboxLogger.logW(TAG, "No-op camera high-level animation as CameraOptions are empty.");
            return new g(3);
        }
        int length = animators.length;
        int i14 = 0;
        while (true) {
            String owner = null;
            if (i14 >= length) {
                break;
            }
            CameraAnimator<?> cameraAnimator = animators[i14];
            cameraAnimator.setInternal$plugin_animation_release(true);
            if (animationOptions != null) {
                owner = animationOptions.getOwner();
            }
            cameraAnimator.setOwner$plugin_animation_release(owner);
            i14++;
        }
        cancelAnimatorSet();
        registerAnimators((ValueAnimator[]) Arrays.copyOf(animators, animators.length));
        AnimatorSet animatorSet = new AnimatorSet();
        if (animationOptions != null && (duration = animationOptions.getDuration()) != null) {
            animatorSet.setDuration(duration.longValue());
        }
        if (animationOptions != null && (startDelay = animationOptions.getStartDelay()) != null) {
            animatorSet.setStartDelay(startDelay.longValue());
        }
        if (animationOptions != null && (interpolator = animationOptions.getInterpolator()) != null) {
            animatorSet.setInterpolator(interpolator);
        }
        if (animatorListener != null) {
            AnimationThreadController.INSTANCE.postOnAnimatorThread(new CameraAnimationsPluginImpl$startHighLevelAnimation$animatorSet$1$4$1(animatorSet, animatorListener, this));
        }
        animatorSet.playTogether((Animator[]) Arrays.copyOf(animators, animators.length));
        CameraAnimationHint cameraAnimationHintCalculateCameraAnimationHint$default = CameraAnimationsUtils.calculateCameraAnimationHint$default(animatorSet, this.cameraAnimationHintFractions, (CameraState) null, 2, (Object) null);
        if (cameraAnimationHintCalculateCameraAnimationHint$default != null) {
            MapTransformDelegate mapTransformDelegate = this.mapTransformDelegate;
            if (mapTransformDelegate == null) {
                s.m("mapTransformDelegate");
                throw null;
            }
            mapTransformDelegate.setCameraAnimationHint(cameraAnimationHintCalculateCameraAnimationHint$default);
        }
        HighLevelAnimatorSet highLevelAnimatorSet = new HighLevelAnimatorSet(animationOptions != null ? animationOptions.getOwner() : null, animatorSet);
        this.highLevelAnimatorSet = highLevelAnimatorSet;
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new CameraAnimationsPluginImpl$startHighLevelAnimation$4$1(highLevelAnimatorSet));
        return highLevelAnimatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startHighLevelAnimation$lambda$33() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:52:0x012f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0133  */
    /* JADX WARN: Code duplicated, block: B:56:0x013c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0174 A[LOOP:1: B:57:0x016e->B:59:0x0174, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x0192  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x01cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x019e A[SYNTHETIC] */
    public final boolean updateAnimatorValues(CameraAnimator<?> cameraAnimator) {
        int length;
        Object[] objArr;
        int i14;
        Object[] array;
        Object obj;
        CameraCenterAnimator cameraCenterAnimator;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        if (cameraAnimator.getTargets().length == 0) {
            MapboxLogger.logE(TAG, "Skipped animation " + cameraAnimator.getType().name() + " with no targets!");
            return false;
        }
        Object startValue = cameraAnimator.getStartValue();
        if (startValue == null) {
            switch (WhenMappings.$EnumSwitchMapping$0[cameraAnimator.getType().ordinal()]) {
                case 1:
                    MapCameraManagerDelegate mapCameraManagerDelegate = this.mapCameraManagerDelegate;
                    if (mapCameraManagerDelegate == null) {
                        s.m("mapCameraManagerDelegate");
                        throw null;
                    }
                    startValue = mapCameraManagerDelegate.getCameraState().getCenter();
                    startValue.getClass();
                    break;
                    break;
                case 2:
                    MapCameraManagerDelegate mapCameraManagerDelegate2 = this.mapCameraManagerDelegate;
                    if (mapCameraManagerDelegate2 == null) {
                        s.m("mapCameraManagerDelegate");
                        throw null;
                    }
                    startValue = Double.valueOf(mapCameraManagerDelegate2.getCameraState().getZoom());
                    break;
                    break;
                case 3:
                    startValue = new ScreenCoordinate(0.0d, 0.0d);
                    break;
                case 4:
                    MapCameraManagerDelegate mapCameraManagerDelegate3 = this.mapCameraManagerDelegate;
                    if (mapCameraManagerDelegate3 == null) {
                        s.m("mapCameraManagerDelegate");
                        throw null;
                    }
                    startValue = mapCameraManagerDelegate3.getCameraState().getPadding();
                    startValue.getClass();
                    break;
                    break;
                case 5:
                    MapCameraManagerDelegate mapCameraManagerDelegate4 = this.mapCameraManagerDelegate;
                    if (mapCameraManagerDelegate4 == null) {
                        s.m("mapCameraManagerDelegate");
                        throw null;
                    }
                    startValue = Double.valueOf(mapCameraManagerDelegate4.getCameraState().getBearing());
                    break;
                    break;
                case 6:
                    MapCameraManagerDelegate mapCameraManagerDelegate5 = this.mapCameraManagerDelegate;
                    if (mapCameraManagerDelegate5 == null) {
                        s.m("mapCameraManagerDelegate");
                        throw null;
                    }
                    startValue = Double.valueOf(mapCameraManagerDelegate5.getCameraState().getPitch());
                    break;
                    break;
                default:
                    u0.r();
                    return false;
            }
            if (getDebugMode()) {
                MapboxLogger.logI(TAG, "Animation " + cameraAnimator.getType().name() + CoreConstants.LEFT_PARENTHESIS_CHAR + cameraAnimator.hashCode() + "): automatically setting start value " + startValue + '.');
            }
        }
        if (cameraAnimator instanceof CameraBearingAnimator) {
            CameraBearingAnimator cameraBearingAnimator = (CameraBearingAnimator) cameraAnimator;
            if (cameraBearingAnimator.getUseShortestPath()) {
                MathUtils mathUtils = MathUtils.INSTANCE;
                int length2 = cameraBearingAnimator.getTargets().length + 1;
                double[] dArr = new double[length2];
                int i15 = 0;
                while (i15 < length2) {
                    dArr[i15] = i15 == 0 ? ((Double) startValue).doubleValue() : cameraBearingAnimator.getTargets()[i15 - 1].doubleValue();
                    i15++;
                }
                array = p13.s.u(mathUtils.prepareOptimalBearingPath(dArr));
            } else if (cameraAnimator instanceof CameraCenterAnimator) {
                cameraCenterAnimator = (CameraCenterAnimator) cameraAnimator;
                if (cameraCenterAnimator.getUseShortestPath()) {
                    List listC = w.c((Point) startValue);
                    Point[] targets = cameraCenterAnimator.getTargets();
                    targets.getClass();
                    ArrayList arrayList3 = new ArrayList(listC.size() + targets.length);
                    arrayList3.addAll(listC);
                    d0.w(arrayList3, targets);
                    arrayList = new ArrayList();
                    arrayList2 = new ArrayList(y.r(arrayList3, 10));
                    it = arrayList3.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(CameraTransform.INSTANCE.wrapCoordinate((Point) it.next()));
                    }
                    for (Point point : h0.G0(arrayList2)) {
                        if (arrayList.isEmpty()) {
                            arrayList.add(point);
                        } else {
                            arrayList.add(CameraTransform.INSTANCE.unwrapForShortestPath(point, (Point) h0.m0(arrayList)));
                        }
                    }
                    array = h0.G0(arrayList).toArray(new Point[0]);
                    array.getClass();
                } else {
                    length = cameraAnimator.getTargets().length + 1;
                    objArr = new Object[length];
                    for (i14 = 0; i14 < length; i14++) {
                        if (i14 == 0) {
                            obj = startValue;
                        } else {
                            obj = cameraAnimator.getTargets()[i14 - 1];
                        }
                        objArr[i14] = obj;
                    }
                    array = objArr;
                }
            } else {
                length = cameraAnimator.getTargets().length + 1;
                objArr = new Object[length];
                while (i14 < length) {
                    if (i14 == 0) {
                        obj = startValue;
                    } else {
                        obj = cameraAnimator.getTargets()[i14 - 1];
                    }
                    objArr[i14] = obj;
                }
                array = objArr;
            }
        } else if (cameraAnimator instanceof CameraCenterAnimator) {
            cameraCenterAnimator = (CameraCenterAnimator) cameraAnimator;
            if (cameraCenterAnimator.getUseShortestPath()) {
                List listC2 = w.c((Point) startValue);
                Point[] targets2 = cameraCenterAnimator.getTargets();
                targets2.getClass();
                ArrayList arrayList4 = new ArrayList(listC2.size() + targets2.length);
                arrayList4.addAll(listC2);
                d0.w(arrayList4, targets2);
                arrayList = new ArrayList();
                arrayList2 = new ArrayList(y.r(arrayList4, 10));
                it = arrayList4.iterator();
                while (it.hasNext()) {
                    arrayList2.add(CameraTransform.INSTANCE.wrapCoordinate((Point) it.next()));
                }
                while (r5.hasNext()) {
                    if (arrayList.isEmpty()) {
                        arrayList.add(point);
                    } else {
                        arrayList.add(CameraTransform.INSTANCE.unwrapForShortestPath(point, (Point) h0.m0(arrayList)));
                    }
                }
                array = h0.G0(arrayList).toArray(new Point[0]);
                array.getClass();
            } else {
                length = cameraAnimator.getTargets().length + 1;
                objArr = new Object[length];
                while (i14 < length) {
                    if (i14 == 0) {
                        obj = startValue;
                    } else {
                        obj = cameraAnimator.getTargets()[i14 - 1];
                    }
                    objArr[i14] = obj;
                }
                array = objArr;
            }
        } else {
            length = cameraAnimator.getTargets().length + 1;
            objArr = new Object[length];
            while (i14 < length) {
                if (i14 == 0) {
                    obj = startValue;
                } else {
                    obj = cameraAnimator.getTargets()[i14 - 1];
                }
                objArr[i14] = obj;
            }
            array = objArr;
        }
        if (!skipRedundantAnimator(array, cameraAnimator.getType())) {
            cameraAnimator.setObjectValues(Arrays.copyOf(array, array.length));
            return true;
        }
        if (getDebugMode()) {
            MapboxLogger.logI(TAG, "Animation " + cameraAnimator.getType().name() + CoreConstants.LEFT_PARENTHESIS_CHAR + cameraAnimator.hashCode() + ") was skipped.");
        }
        return false;
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public void addCameraAnchorChangeListener(CameraAnimatorNullableChangeListener<ScreenCoordinate> listener) {
        listener.getClass();
        this.anchorListeners.add(listener);
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public void addCameraAnimationsLifecycleListener(CameraAnimationsLifecycleListener listener) {
        listener.getClass();
        this.lifecycleListeners.add(listener);
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public void addCameraBearingChangeListener(CameraAnimatorChangeListener<Double> listener) {
        listener.getClass();
        this.bearingListeners.add(listener);
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public void addCameraCenterChangeListener(CameraAnimatorChangeListener<Point> listener) {
        listener.getClass();
        this.centerListeners.add(listener);
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public void addCameraPaddingChangeListener(CameraAnimatorChangeListener<EdgeInsets> listener) {
        listener.getClass();
        this.paddingListeners.add(listener);
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public void addCameraPitchChangeListener(CameraAnimatorChangeListener<Double> listener) {
        listener.getClass();
        this.pitchListeners.add(listener);
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public void addCameraZoomChangeListener(CameraAnimatorChangeListener<Double> listener) {
        listener.getClass();
        this.zoomListeners.add(listener);
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public double calculateScaleBy(double amount, double currentZoom) {
        return CameraTransform.INSTANCE.calculateScaleBy(amount, currentZoom);
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public void cancelAllAnimators(List<String> exceptOwnerList) {
        exceptOwnerList.getClass();
        for (CameraAnimator cameraAnimator : new HashSet(this.animators)) {
            if (!h0.R(exceptOwnerList, cameraAnimator.getOwner())) {
                AnimationThreadController.INSTANCE.postOnAnimatorThread(new CameraAnimationsPluginImpl$cancelAllAnimators$1$1(cameraAnimator));
            }
        }
        HighLevelAnimatorSet highLevelAnimatorSet = this.highLevelAnimatorSet;
        if (h0.R(exceptOwnerList, highLevelAnimatorSet != null ? highLevelAnimatorSet.getOwner() : null)) {
            return;
        }
        cancelAnimatorSet();
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void cleanup() {
        Object[] array = this.animators.toArray(new CameraAnimator[0]);
        array.getClass();
        CameraAnimator[] cameraAnimatorArr = (CameraAnimator[]) array;
        CameraAnimationsPlugin.DefaultImpls.unregisterAnimators$default(this, (ValueAnimator[]) Arrays.copyOf(cameraAnimatorArr, cameraAnimatorArr.length), false, 2, null);
        cancelAnimatorSet();
        this.centerListeners.clear();
        this.zoomListeners.clear();
        this.bearingListeners.clear();
        this.pitchListeners.clear();
        this.anchorListeners.clear();
        this.paddingListeners.clear();
        this.lifecycleListeners.clear();
        this.animators.clear();
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public ValueAnimator createAnchorAnimator(CameraAnimatorOptions<ScreenCoordinate> options, e23.l<? super ValueAnimator, Unit> block) {
        options.getClass();
        return new CameraAnchorAnimator(options, block);
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public ValueAnimator createBearingAnimator(CameraAnimatorOptions<Double> options, boolean useShortestPath, e23.l<? super ValueAnimator, Unit> block) {
        options.getClass();
        return new CameraBearingAnimator(options, useShortestPath, block);
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public ValueAnimator createCenterAnimator(CameraAnimatorOptions<Point> options, boolean useShortestPath, e23.l<? super ValueAnimator, Unit> block) {
        options.getClass();
        return new CameraCenterAnimator(null, options, useShortestPath, block, 1, null);
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public ValueAnimator createPaddingAnimator(CameraAnimatorOptions<EdgeInsets> options, e23.l<? super ValueAnimator, Unit> block) {
        options.getClass();
        return new CameraPaddingAnimator(options, block);
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public ValueAnimator createPitchAnimator(CameraAnimatorOptions<Double> options, e23.l<? super ValueAnimator, Unit> block) {
        options.getClass();
        return new CameraPitchAnimator(options, block);
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public ValueAnimator createZoomAnimator(CameraAnimatorOptions<Double> options, e23.l<? super ValueAnimator, Unit> block) {
        options.getClass();
        return new CameraZoomAnimator(options, block);
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public Cancelable easeTo(CameraOptions cameraOptions, MapAnimationOptions animationOptions, Animator.AnimatorListener animatorListener) {
        cameraOptions.getClass();
        if (!CameraOptionsUtils.isEmpty(cameraOptions)) {
            return startHighLevelAnimation(CameraAnimatorsFactory.getEaseTo$default(getCameraAnimationsFactory(), cameraOptions, null, 2, null), animationOptions, animatorListener);
        }
        MapboxLogger.logW(TAG, "No-op easeTo camera high-level animation as CameraOptions.isEmpty == true.");
        return new g(4);
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public Cancelable flyTo(CameraOptions cameraOptions, MapAnimationOptions animationOptions, Animator.AnimatorListener animatorListener) {
        cameraOptions.getClass();
        if (!CameraOptionsUtils.isEmpty(cameraOptions)) {
            return startHighLevelAnimation(CameraAnimatorsFactory.getFlyTo$default(getCameraAnimationsFactory(), cameraOptions, null, 2, null), animationOptions, animatorListener);
        }
        MapboxLogger.logW(TAG, "No-op flyTo camera high-level animation as CameraOptions.isEmpty == true.");
        return new g(5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public ScreenCoordinate getAnchor() {
        return (ScreenCoordinate) this.anchor.getValue(this, $$delegatedProperties[3]);
    }

    public final HashSet<CameraAnimator<?>> getAnimators$plugin_animation_release() {
        return this.animators;
    }

    public final CameraAnimatorsFactory getCameraAnimationsFactory() {
        CameraAnimatorsFactory cameraAnimatorsFactory = this.cameraAnimationsFactory;
        if (cameraAnimatorsFactory != null) {
            return cameraAnimatorsFactory;
        }
        s.m("cameraAnimationsFactory");
        throw null;
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public boolean getDebugMode() {
        return this.debugMode;
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void initialize() {
        CameraAnimationsPlugin.DefaultImpls.initialize(this);
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public Cancelable moveBy(ScreenCoordinate screenCoordinate, MapAnimationOptions animationOptions, Animator.AnimatorListener animatorListener) {
        screenCoordinate.getClass();
        return startHighLevelAnimation(CameraAnimatorsFactory.getMoveBy$default(getCameraAnimationsFactory(), screenCoordinate, null, 2, null), animationOptions, animatorListener);
    }

    @Override // com.mapbox.maps.plugin.MapCameraPlugin
    public void onCameraMove(Point center, double zoom, double pitch, double bearing, EdgeInsets padding) {
        center.getClass();
        padding.getClass();
        setBearing(Double.valueOf(bearing));
        setCenter(center);
        setPadding(padding);
        setPitch(Double.valueOf(pitch));
        setZoom(Double.valueOf(zoom));
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void onDelegateProvider(MapDelegateProvider delegateProvider) {
        delegateProvider.getClass();
        this.mapDelegateProvider = delegateProvider;
        this.mapCameraManagerDelegate = delegateProvider.getMapCameraManagerDelegate();
        MapDelegateProvider mapDelegateProvider = this.mapDelegateProvider;
        if (mapDelegateProvider == null) {
            s.m("mapDelegateProvider");
            throw null;
        }
        this.mapTransformDelegate = mapDelegateProvider.getMapTransformDelegate();
        MapDelegateProvider mapDelegateProvider2 = this.mapDelegateProvider;
        if (mapDelegateProvider2 == null) {
            s.m("mapDelegateProvider");
            throw null;
        }
        this.mapProjectionDelegate = mapDelegateProvider2.getMapProjectionDelegate();
        MapDelegateProvider mapDelegateProvider3 = this.mapDelegateProvider;
        if (mapDelegateProvider3 != null) {
            setCameraAnimationsFactory(new CameraAnimatorsFactory(mapDelegateProvider3));
        } else {
            s.m("mapDelegateProvider");
            throw null;
        }
    }

    public final void performMapJump$plugin_animation_release(CameraOptions cameraOptions) {
        cameraOptions.getClass();
        if (skipMapJump(cameraOptions)) {
            if (getDebugMode()) {
                MapboxLogger.logI(TAG, "Setting " + cameraOptions + " to core was skipped due to optimization.");
                return;
            }
            return;
        }
        try {
            MapCameraManagerDelegate mapCameraManagerDelegate = this.mapCameraManagerDelegate;
            if (mapCameraManagerDelegate != null) {
                mapCameraManagerDelegate.setCamera(cameraOptions);
            } else {
                s.m("mapCameraManagerDelegate");
                throw null;
            }
        } catch (Exception e4) {
            MapboxLogger.logE(TAG, "Exception while setting camera options : " + e4.getMessage() + " CameraOptions = " + cameraOptions);
        }
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public Cancelable pitchBy(double pitch, MapAnimationOptions animationOptions, Animator.AnimatorListener animatorListener) {
        return startHighLevelAnimation(CameraAnimatorsFactory.getPitchBy$default(getCameraAnimationsFactory(), pitch, null, 2, null), animationOptions, animatorListener);
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public void playAnimatorsSequentially(ValueAnimator... animators) {
        animators.getClass();
        if (animators.length == 0) {
            MapboxLogger.logW(TAG, "No-op playAnimatorsSequentially() as no animators are passed");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (ValueAnimator valueAnimator : animators) {
            if (valueAnimator instanceof CameraAnimator) {
                CameraAnimator cameraAnimator = (CameraAnimator) valueAnimator;
                cameraAnimator.setInternal$plugin_animation_release(true);
                if (cameraAnimator.getOwner() == null) {
                    cameraAnimator.setOwner$plugin_animation_release(MapAnimationOwnerRegistry.INTERNAL);
                }
                arrayList.add(valueAnimator);
            } else {
                MapboxLogger.logE(TAG, "All animators must be CameraAnimator's to be played sequentially!");
            }
        }
        Object[] array = arrayList.toArray(new CameraAnimator[0]);
        array.getClass();
        CameraAnimator[] cameraAnimatorArr = (CameraAnimator[]) array;
        registerAnimators((ValueAnimator[]) Arrays.copyOf(cameraAnimatorArr, cameraAnimatorArr.length));
        AnimatorSet animatorSet = new AnimatorSet();
        Object[] array2 = arrayList.toArray(new CameraAnimator[0]);
        array2.getClass();
        CameraAnimator[] cameraAnimatorArr2 = (CameraAnimator[]) array2;
        animatorSet.playSequentially((Animator[]) Arrays.copyOf(cameraAnimatorArr2, cameraAnimatorArr2.length));
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new CameraAnimationsPluginImpl$playAnimatorsSequentially$1$1(animatorSet));
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public void playAnimatorsTogether(ValueAnimator... animators) {
        animators.getClass();
        if (animators.length == 0) {
            MapboxLogger.logW(TAG, "No-op playAnimatorsTogether() as no animators are passed");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (ValueAnimator valueAnimator : animators) {
            if (valueAnimator instanceof CameraAnimator) {
                CameraAnimator cameraAnimator = (CameraAnimator) valueAnimator;
                cameraAnimator.setInternal$plugin_animation_release(true);
                if (cameraAnimator.getOwner() == null) {
                    cameraAnimator.setOwner$plugin_animation_release(MapAnimationOwnerRegistry.INTERNAL);
                }
                arrayList.add(valueAnimator);
            } else {
                MapboxLogger.logE(TAG, "All animators must be CameraAnimator's to be played together!");
            }
        }
        Object[] array = arrayList.toArray(new CameraAnimator[0]);
        array.getClass();
        CameraAnimator[] cameraAnimatorArr = (CameraAnimator[]) array;
        registerAnimators((ValueAnimator[]) Arrays.copyOf(cameraAnimatorArr, cameraAnimatorArr.length));
        AnimatorSet animatorSet = new AnimatorSet();
        Object[] array2 = arrayList.toArray(new CameraAnimator[0]);
        array2.getClass();
        CameraAnimator[] cameraAnimatorArr2 = (CameraAnimator[]) array2;
        animatorSet.playTogether((Animator[]) Arrays.copyOf(cameraAnimatorArr2, cameraAnimatorArr2.length));
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new CameraAnimationsPluginImpl$playAnimatorsTogether$1$1(animatorSet));
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public void registerAnimators(ValueAnimator... cameraAnimators) {
        cameraAnimators.getClass();
        AnimationThreadController.INSTANCE.postOnMainThread(new AnonymousClass1(cameraAnimators, this));
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public void removeCameraAnchorChangeListener(CameraAnimatorNullableChangeListener<ScreenCoordinate> listener) {
        listener.getClass();
        this.anchorListeners.remove(listener);
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public void removeCameraAnimationsLifecycleListener(CameraAnimationsLifecycleListener listener) {
        listener.getClass();
        this.lifecycleListeners.remove(listener);
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public void removeCameraBearingChangeListener(CameraAnimatorChangeListener<Double> listener) {
        listener.getClass();
        this.bearingListeners.remove(listener);
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public void removeCameraCenterChangeListener(CameraAnimatorChangeListener<Point> listener) {
        listener.getClass();
        this.centerListeners.remove(listener);
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public void removeCameraPaddingChangeListener(CameraAnimatorChangeListener<EdgeInsets> listener) {
        listener.getClass();
        this.paddingListeners.remove(listener);
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public void removeCameraPitchChangeListener(CameraAnimatorChangeListener<Double> listener) {
        listener.getClass();
        this.pitchListeners.remove(listener);
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public void removeCameraZoomChangeListener(CameraAnimatorChangeListener<Double> listener) {
        listener.getClass();
        this.zoomListeners.remove(listener);
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public Cancelable rotateBy(ScreenCoordinate first, ScreenCoordinate second, MapAnimationOptions animationOptions, Animator.AnimatorListener animatorListener) {
        first.getClass();
        second.getClass();
        return startHighLevelAnimation(CameraAnimatorsFactory.getRotateBy$default(getCameraAnimationsFactory(), first, second, null, 4, null), animationOptions, animatorListener);
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public Cancelable scaleBy(double amount, ScreenCoordinate screenCoordinate, MapAnimationOptions animationOptions, Animator.AnimatorListener animatorListener) {
        return startHighLevelAnimation(CameraAnimatorsFactory.getScaleBy$default(getCameraAnimationsFactory(), amount, screenCoordinate, null, 4, null), animationOptions, animatorListener);
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public void setAnchor(ScreenCoordinate screenCoordinate) {
        this.anchor.setValue(this, $$delegatedProperties[3], screenCoordinate);
    }

    public final void setCameraAnimationsFactory(CameraAnimatorsFactory cameraAnimatorsFactory) {
        cameraAnimatorsFactory.getClass();
        this.cameraAnimationsFactory = cameraAnimatorsFactory;
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public void setDebugMode(boolean z14) {
        this.debugMode = z14;
    }

    public final void unregisterAllAnimators() {
        Object[] array = this.animators.toArray(new CameraAnimator[0]);
        array.getClass();
        CameraAnimator[] cameraAnimatorArr = (CameraAnimator[]) array;
        CameraAnimationsPlugin.DefaultImpls.unregisterAnimators$default(this, (ValueAnimator[]) Arrays.copyOf(cameraAnimatorArr, cameraAnimatorArr.length), false, 2, null);
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    public void unregisterAnimators(ValueAnimator[] cameraAnimators, boolean cancelAnimators) {
        cameraAnimators.getClass();
        AnimationThreadController.INSTANCE.postOnMainThread(new C42101(cameraAnimators, this, cancelAnimators));
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl$registerInternalListener$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42091 extends p005kotlin.jvm.internal.w implements e23.a<Unit> {
        final /* synthetic */ CameraAnimator<?> $animator;
        final /* synthetic */ CameraAnimationsPluginImpl this$0;

        /* JADX INFO: renamed from: com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl$registerInternalListener$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\r"}, d2 = {"com/mapbox/maps/plugin/animation/CameraAnimationsPluginImpl$registerInternalListener$1$1", "Landroid/animation/Animator$AnimatorListener;", "finishAnimation", "", "animation", "Landroid/animation/Animator;", "finishStatus", "Lcom/mapbox/maps/plugin/animation/CameraAnimationsPluginImpl$AnimationFinishStatus;", "onAnimationCancel", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "onAnimationStartInternal", "plugin-animation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class C11771 implements Animator.AnimatorListener {
            final /* synthetic */ CameraAnimationsPluginImpl this$0;

            /* JADX INFO: renamed from: com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl$registerInternalListener$1$1$WhenMappings */
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[AnimationFinishStatus.values().length];
                    try {
                        iArr[AnimationFinishStatus.CANCELED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[AnimationFinishStatus.ENDED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public C11771(CameraAnimationsPluginImpl cameraAnimationsPluginImpl) {
                this.this$0 = cameraAnimationsPluginImpl;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void finishAnimation(Animator animation, AnimationFinishStatus finishStatus) {
                String str;
                CameraAnimator cameraAnimator = animation instanceof CameraAnimator ? (CameraAnimator) animation : null;
                if (cameraAnimator == null) {
                    throw new MapboxCameraAnimationException("Could not finish animation as it must be an instance of CameraAnimator and not null!");
                }
                CameraAnimationsPluginImpl cameraAnimationsPluginImpl = this.this$0;
                if (cameraAnimationsPluginImpl.getDebugMode()) {
                    int i14 = WhenMappings.$EnumSwitchMapping$0[finishStatus.ordinal()];
                    if (i14 == 1) {
                        str = "was canceled.";
                    } else {
                        if (i14 != 2) {
                            u0.r();
                            return;
                        }
                        str = "ended.";
                    }
                    StringBuilder sb3 = new StringBuilder("Animation ");
                    sb3.append(cameraAnimator.getType().name());
                    sb3.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
                    sb3.append(cameraAnimator.hashCode());
                    sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                    sb3.append(cameraAnimator.getSkipped() ? " skipped" : "");
                    sb3.append(' ');
                    sb3.append(str);
                    MapboxLogger.logI(CameraAnimationsPluginImpl.TAG, sb3.toString());
                }
                if (cameraAnimator.getIsInternal()) {
                    cameraAnimationsPluginImpl.unregisterAnimators(new ValueAnimator[]{cameraAnimator}, false);
                    if (cameraAnimationsPluginImpl.getDebugMode()) {
                        MapboxLogger.logI(CameraAnimationsPluginImpl.TAG, "Internal Animator " + cameraAnimator.getType().name() + CoreConstants.LEFT_PARENTHESIS_CHAR + cameraAnimator.hashCode() + ") was unregistered (" + cameraAnimationsPluginImpl.getAnimators$plugin_animation_release().size() + CoreConstants.RIGHT_PARENTHESIS_CHAR);
                    }
                }
                if (cameraAnimator.getSkipped()) {
                    return;
                }
                cameraAnimationsPluginImpl.runningAnimatorsQueue.remove(animation);
                if (cameraAnimationsPluginImpl.runningAnimatorsQueue.isEmpty()) {
                    MapTransformDelegate mapTransformDelegate = cameraAnimationsPluginImpl.mapTransformDelegate;
                    if (mapTransformDelegate == null) {
                        s.m("mapTransformDelegate");
                        throw null;
                    }
                    mapTransformDelegate.setUserAnimationInProgress(false);
                }
                for (CameraAnimationsLifecycleListener cameraAnimationsLifecycleListener : cameraAnimationsPluginImpl.lifecycleListeners) {
                    int i15 = WhenMappings.$EnumSwitchMapping$0[finishStatus.ordinal()];
                    if (i15 == 1) {
                        cameraAnimationsLifecycleListener.onAnimatorCancelling(cameraAnimator.getType(), cameraAnimator, cameraAnimator.getOwner());
                    } else if (i15 == 2) {
                        cameraAnimationsLifecycleListener.onAnimatorEnding(cameraAnimator.getType(), cameraAnimator, cameraAnimator.getOwner());
                    }
                }
                if (cameraAnimationsPluginImpl.runningAnimatorsQueue.isEmpty()) {
                    cameraAnimationsPluginImpl.commitChanges();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void onAnimationStartInternal(Animator animation) {
                Unit unit = null;
                CameraAnimator cameraAnimator = animation instanceof CameraAnimator ? (CameraAnimator) animation : null;
                if (cameraAnimator != null) {
                    CameraAnimationsPluginImpl cameraAnimationsPluginImpl = this.this$0;
                    if (cameraAnimator.getCanceled()) {
                        return;
                    }
                    if (!cameraAnimationsPluginImpl.updateAnimatorValues(cameraAnimator)) {
                        cameraAnimator.setSkipped$plugin_animation_release(true);
                        return;
                    }
                    Iterator it = cameraAnimationsPluginImpl.lifecycleListeners.iterator();
                    while (it.hasNext()) {
                        ((CameraAnimationsLifecycleListener) it.next()).onAnimatorStarting(cameraAnimator.getType(), cameraAnimator, cameraAnimator.getOwner());
                    }
                    MapTransformDelegate mapTransformDelegate = cameraAnimationsPluginImpl.mapTransformDelegate;
                    if (mapTransformDelegate == null) {
                        s.m("mapTransformDelegate");
                        throw null;
                    }
                    mapTransformDelegate.setUserAnimationInProgress(true);
                    for (CameraAnimator cameraAnimator2 : new HashSet(cameraAnimationsPluginImpl.getAnimators$plugin_animation_release())) {
                        if (cameraAnimator2.getType() == cameraAnimator.getType() && cameraAnimator2.isRunning() && !cameraAnimator2.equals(cameraAnimator)) {
                            Iterator it3 = cameraAnimationsPluginImpl.lifecycleListeners.iterator();
                            while (it3.hasNext()) {
                                ((CameraAnimationsLifecycleListener) it3.next()).onAnimatorInterrupting(cameraAnimator.getType(), cameraAnimator2, cameraAnimator2.getOwner(), cameraAnimator, cameraAnimator.getOwner());
                            }
                            AnimationThreadController.INSTANCE.postOnAnimatorThread(new CameraAnimationsPluginImpl$registerInternalListener$1$1$onAnimationStartInternal$1$2$2(cameraAnimator2));
                        }
                    }
                    if (!AnimationThreadController.INSTANCE.getUsingBackgroundThread() || cameraAnimator.getDuration() != 0) {
                        cameraAnimationsPluginImpl.registerInternalUpdateListener(cameraAnimator);
                    }
                    if (cameraAnimationsPluginImpl.getDebugMode()) {
                        MapboxLogger.logI(CameraAnimationsPluginImpl.TAG, "Animation " + cameraAnimator.getType().name() + CoreConstants.LEFT_PARENTHESIS_CHAR + cameraAnimator.hashCode() + ") started.");
                    }
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    throw new MapboxCameraAnimationException("Could not start animation as it must be an instance of CameraAnimator and not null!");
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                animation.getClass();
                AnimationThreadController.INSTANCE.postOnMainThread(new CameraAnimationsPluginImpl$registerInternalListener$1$1$onAnimationCancel$1(this, animation));
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                animation.getClass();
                AnimationThreadController.INSTANCE.postOnMainThread(new CameraAnimationsPluginImpl$registerInternalListener$1$1$onAnimationEnd$1(this, animation));
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
                animation.getClass();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                animation.getClass();
                AnimationThreadController animationThreadController = AnimationThreadController.INSTANCE;
                if (animationThreadController.getUsingBackgroundThread() && animation.getDuration() == 0) {
                    this.this$0.registerInternalUpdateListener((CameraAnimator) animation);
                }
                animationThreadController.postOnMainThread(new CameraAnimationsPluginImpl$registerInternalListener$1$1$onAnimationStart$1(this, animation));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42091(CameraAnimator<?> cameraAnimator, CameraAnimationsPluginImpl cameraAnimationsPluginImpl) {
            super(0);
            this.$animator = cameraAnimator;
            this.this$0 = cameraAnimationsPluginImpl;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$animator.addInternalListener$plugin_animation_release(new C11771(this.this$0));
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsPlugin
    @o13.e
    public ValueAnimator createCenterAnimator(CameraAnimatorOptions<Point> cameraAnimatorOptions, e23.l<? super ValueAnimator, Unit> lVar) {
        return CameraAnimationsPlugin.DefaultImpls.createCenterAnimator(this, cameraAnimatorOptions, lVar);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl$unregisterAnimators$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42101 extends p005kotlin.jvm.internal.w implements e23.a<Unit> {
        final /* synthetic */ ValueAnimator[] $cameraAnimators;
        final /* synthetic */ boolean $cancelAnimators;
        final /* synthetic */ CameraAnimationsPluginImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42101(ValueAnimator[] valueAnimatorArr, CameraAnimationsPluginImpl cameraAnimationsPluginImpl, boolean z14) {
            super(0);
            this.$cameraAnimators = valueAnimatorArr;
            this.this$0 = cameraAnimationsPluginImpl;
            this.$cancelAnimators = z14;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            for (ValueAnimator valueAnimator : this.$cameraAnimators) {
                if (!(valueAnimator instanceof CameraAnimator)) {
                    MapboxLogger.logE(CameraAnimationsPluginImpl.TAG, "All animators must be CameraAnimator's to be unregistered!");
                    return;
                }
                AnimationThreadController.INSTANCE.postOnAnimatorThread(new C11781(this.$cancelAnimators, valueAnimator));
            }
            HashSet<CameraAnimator<?>> animators$plugin_animation_release = this.this$0.getAnimators$plugin_animation_release();
            ValueAnimator[] valueAnimatorArr = this.$cameraAnimators;
            ArrayList arrayList = new ArrayList(valueAnimatorArr.length);
            for (ValueAnimator valueAnimator2 : valueAnimatorArr) {
                valueAnimator2.getClass();
                arrayList.add((CameraAnimator) valueAnimator2);
            }
            animators$plugin_animation_release.removeAll(arrayList);
        }

        /* JADX INFO: renamed from: com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl$unregisterAnimators$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class C11781 extends p005kotlin.jvm.internal.w implements e23.a<Unit> {
            final /* synthetic */ ValueAnimator $animator;
            final /* synthetic */ boolean $cancelAnimators;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11781(boolean z14, ValueAnimator valueAnimator) {
                super(0);
                this.$cancelAnimators = z14;
                this.$animator = valueAnimator;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.$cancelAnimators) {
                    this.$animator.cancel();
                }
                ((CameraAnimator) this.$animator).removeInternalListener$plugin_animation_release();
                ((CameraAnimator) this.$animator).removeInternalUpdateListener$plugin_animation_release();
            }

            @Override // e23.a
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl$registerAnimators$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends p005kotlin.jvm.internal.w implements e23.a<Unit> {
        final /* synthetic */ ValueAnimator[] $cameraAnimators;
        final /* synthetic */ CameraAnimationsPluginImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ValueAnimator[] valueAnimatorArr, CameraAnimationsPluginImpl cameraAnimationsPluginImpl) {
            super(0);
            this.$cameraAnimators = valueAnimatorArr;
            this.this$0 = cameraAnimationsPluginImpl;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            for (ValueAnimator valueAnimator : this.$cameraAnimators) {
                if (!(valueAnimator instanceof CameraAnimator)) {
                    MapboxLogger.logE(CameraAnimationsPluginImpl.TAG, "All animators must be CameraAnimator's to be registered!");
                    return;
                }
                this.this$0.registerInternalListener((CameraAnimator) valueAnimator);
            }
            HashSet<CameraAnimator<?>> animators$plugin_animation_release = this.this$0.getAnimators$plugin_animation_release();
            ValueAnimator[] valueAnimatorArr = this.$cameraAnimators;
            ArrayList arrayList = new ArrayList(valueAnimatorArr.length);
            for (ValueAnimator valueAnimator2 : valueAnimatorArr) {
                valueAnimator2.getClass();
                arrayList.add((CameraAnimator) valueAnimator2);
            }
            animators$plugin_animation_release.addAll(arrayList);
            if (this.this$0.getDebugMode()) {
                MapboxLogger.logI(CameraAnimationsPluginImpl.TAG, "Registered " + this.$cameraAnimators.length + " animators. Currently, " + this.this$0.getAnimators$plugin_animation_release().size() + " animators registered.");
            }
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }
}
