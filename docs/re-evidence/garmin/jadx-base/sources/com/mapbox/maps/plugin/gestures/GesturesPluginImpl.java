package com.mapbox.maps.plugin.gestures;

import am.j;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mapbox.android.gestures.AndroidGesturesManager;
import com.mapbox.android.gestures.MoveGestureDetector;
import com.mapbox.android.gestures.MultiFingerTapGestureDetector;
import com.mapbox.android.gestures.RotateGestureDetector;
import com.mapbox.android.gestures.ShoveGestureDetector;
import com.mapbox.android.gestures.StandardScaleGestureDetector;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.ClickInteraction;
import com.mapbox.maps.DragInteraction;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.InteractionContext;
import com.mapbox.maps.LongClickInteraction;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.PlatformEventInfo;
import com.mapbox.maps.PlatformEventType;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.StylePropertyValueKind;
import com.mapbox.maps.plugin.InvalidPluginConfigurationException;
import com.mapbox.maps.plugin.MapStyleObserverPlugin;
import com.mapbox.maps.plugin.Plugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.animation.CameraAnimatorChangeListener;
import com.mapbox.maps.plugin.animation.CameraAnimatorOptions;
import com.mapbox.maps.plugin.animation.MapAnimationOptions;
import com.mapbox.maps.plugin.animation.MapAnimationOwnerRegistry;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import com.mapbox.maps.plugin.delegates.MapInteractionDelegate;
import com.mapbox.maps.plugin.delegates.MapPluginProviderDelegate;
import com.mapbox.maps.plugin.delegates.MapProjectionDelegate;
import com.mapbox.maps.plugin.delegates.MapTransformDelegate;
import com.mapbox.maps.plugin.gestures.generated.GesturesAttributeParser;
import com.mapbox.maps.plugin.gestures.generated.GesturesSettings;
import com.mapbox.maps.plugin.gestures.generated.GesturesSettingsBase;
import com.mapbox.maps.util.CoreGesturesHandler;
import e23.l;
import j20.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import p13.h0;
import q9.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000à\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 Õ\u00022\u00020\u00012\u00020\u00022\u00020\u0003:\u000eÕ\u0002Ö\u0002×\u0002Ø\u0002Ù\u0002Ú\u0002Û\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\fB!\b\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000fB)\b\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\b\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u001f\u0010 \u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J'\u0010(\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006H\u0000¢\u0006\u0004\b&\u0010'J\u0017\u0010+\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b,\u0010*J/\u00102\u001a\u00020\u00132\u0006\u0010#\u001a\u00020.2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0000¢\u0006\u0004\b0\u00101J\u001f\u00106\u001a\u00020\u00182\u0006\u0010#\u001a\u00020.2\u0006\u00103\u001a\u00020\u0006H\u0000¢\u0006\u0004\b4\u00105J\u0017\u00109\u001a\u00020\u00182\u0006\u0010#\u001a\u00020.H\u0000¢\u0006\u0004\b7\u00108J\u0017\u0010=\u001a\u00020\u00182\u0006\u0010#\u001a\u00020:H\u0000¢\u0006\u0004\b;\u0010<J\u001f\u0010A\u001a\u00020\u00182\u0006\u0010#\u001a\u00020:2\u0006\u0010>\u001a\u00020\u0006H\u0000¢\u0006\u0004\b?\u0010@J\u0017\u0010D\u001a\u00020\u00132\u0006\u0010#\u001a\u00020:H\u0000¢\u0006\u0004\bB\u0010CJ\u001f\u0010J\u001a\u00020\u00132\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020\u0018H\u0000¢\u0006\u0004\bH\u0010IJ'\u0010N\u001a\u00020\u00132\u0006\u0010K\u001a\u00020\u00182\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020\u0018H\u0000¢\u0006\u0004\bL\u0010MJ\u0017\u0010R\u001a\u00020\u00132\u0006\u0010O\u001a\u00020EH\u0000¢\u0006\u0004\bP\u0010QJ\u0017\u0010U\u001a\u00020\u00182\u0006\u0010O\u001a\u00020EH\u0000¢\u0006\u0004\bS\u0010TJ\u001f\u0010Y\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010V\u001a\u00020\u0006H\u0000¢\u0006\u0004\bW\u0010XJ'\u0010]\u001a\u00020\u00182\u0006\u0010Z\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006H\u0000¢\u0006\u0004\b[\u0010\\J\u000f\u0010_\u001a\u00020\u0013H\u0000¢\u0006\u0004\b^\u0010\u0015J\u0017\u0010b\u001a\u00020\u00182\u0006\u0010`\u001a\u00020EH\u0001¢\u0006\u0004\ba\u0010TJ\u0017\u0010g\u001a\u00020d2\u0006\u0010c\u001a\u00020\"H\u0001¢\u0006\u0004\be\u0010fJ\u0017\u0010j\u001a\u00020\u00132\u0006\u0010h\u001a\u00020EH\u0000¢\u0006\u0004\bi\u0010QJ\u000f\u0010l\u001a\u00020\u0013H\u0000¢\u0006\u0004\bk\u0010\u0015J\u000f\u0010o\u001a\u00020\u0018H\u0000¢\u0006\u0004\bm\u0010nJ\u0017\u0010r\u001a\u00020\u00132\u0006\u0010q\u001a\u00020pH\u0016¢\u0006\u0004\br\u0010sJ\u0017\u0010t\u001a\u00020\u00132\u0006\u0010q\u001a\u00020pH\u0016¢\u0006\u0004\bt\u0010sJ\u0017\u0010w\u001a\u00020\u00132\u0006\u0010v\u001a\u00020uH\u0016¢\u0006\u0004\bw\u0010xJ\u0017\u0010y\u001a\u00020\u00132\u0006\u0010v\u001a\u00020uH\u0016¢\u0006\u0004\by\u0010xJ\u0017\u0010|\u001a\u00020\u00132\u0006\u0010{\u001a\u00020zH\u0016¢\u0006\u0004\b|\u0010}J\u0017\u0010~\u001a\u00020\u00132\u0006\u0010{\u001a\u00020zH\u0016¢\u0006\u0004\b~\u0010}J\u001b\u0010\u0081\u0001\u001a\u00020\u00132\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0016¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001b\u0010\u0084\u0001\u001a\u00020\u00132\u0007\u0010\u0083\u0001\u001a\u00020\u007fH\u0016¢\u0006\u0006\b\u0084\u0001\u0010\u0082\u0001J\u001c\u0010\u0087\u0001\u001a\u00020\u00132\b\u0010\u0086\u0001\u001a\u00030\u0085\u0001H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001c\u0010\u0089\u0001\u001a\u00020\u00132\b\u0010\u0083\u0001\u001a\u00030\u0085\u0001H\u0016¢\u0006\u0006\b\u0089\u0001\u0010\u0088\u0001J\u001c\u0010\u008c\u0001\u001a\u00020\u00132\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001H\u0016¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u001c\u0010\u008e\u0001\u001a\u00020\u00132\b\u0010\u0083\u0001\u001a\u00030\u008a\u0001H\u0016¢\u0006\u0006\b\u008e\u0001\u0010\u008d\u0001J\u001c\u0010\u0091\u0001\u001a\u00020\u00132\b\u0010\u0090\u0001\u001a\u00030\u008f\u0001H\u0016¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u001c\u0010\u0093\u0001\u001a\u00020\u00132\b\u0010\u0083\u0001\u001a\u00030\u008f\u0001H\u0016¢\u0006\u0006\b\u0093\u0001\u0010\u0092\u0001J\u001c\u0010\u0096\u0001\u001a\u00020\u00132\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0016¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001c\u0010\u0098\u0001\u001a\u00020\u00132\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0016¢\u0006\u0006\b\u0098\u0001\u0010\u0097\u0001J\u0013\u0010\u009a\u0001\u001a\u00030\u0099\u0001H\u0016¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J.\u0010\u009f\u0001\u001a\u00020\u00132\b\u0010\u009c\u0001\u001a\u00030\u0099\u00012\u0007\u0010\u009d\u0001\u001a\u00020\u00182\u0007\u0010\u009e\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u0011\u0010¡\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b¡\u0001\u0010\u0015J,\u0010£\u0001\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\t\u0010¢\u0001\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0005\b£\u0001\u0010\fJ7\u0010£\u0001\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010¤\u0001\u001a\u00030\u0099\u00012\t\u0010¢\u0001\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u001c\u0010©\u0001\u001a\u00020\u00132\b\u0010¨\u0001\u001a\u00030§\u0001H\u0016¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u001a\u0010«\u0001\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u0011\u0010\u00ad\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b\u00ad\u0001\u0010\u0015J#\u0010®\u0001\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0007\u0010\u009d\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u0011\u0010°\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\b°\u0001\u0010\u0015J\u0011\u0010±\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\b±\u0001\u0010\u0015J%\u0010²\u0001\u001a\u00020\u00132\b\u0010¤\u0001\u001a\u00030\u0099\u00012\u0007\u0010\u009e\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0006\b²\u0001\u0010³\u0001J\u0011\u0010´\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\b´\u0001\u0010\u0015J'\u0010´\u0001\u001a\u0004\u0018\u00010\u00132\u0011\u0010·\u0001\u001a\f\u0012\u0005\u0012\u00030¶\u0001\u0018\u00010µ\u0001H\u0002¢\u0006\u0006\b´\u0001\u0010¸\u0001J%\u0010¹\u0001\u001a\u00020\u00132\u0011\u0010·\u0001\u001a\f\u0012\u0005\u0012\u00030¶\u0001\u0018\u00010µ\u0001H\u0002¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u0011\u0010»\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\b»\u0001\u0010\u0015J\u001a\u0010¼\u0001\u001a\u00020E2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0006\b¼\u0001\u0010½\u0001J$\u0010À\u0001\u001a\u00020d2\u0007\u0010¾\u0001\u001a\u00020d2\u0007\u0010¿\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J\u001a\u0010Â\u0001\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\u001a\u0010Ä\u0001\u001a\u00020E2\u0006\u0010#\u001a\u00020.H\u0002¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J6\u0010Ê\u0001\u001a\n\u0012\u0005\u0012\u00030¶\u00010µ\u00012\u0007\u0010Æ\u0001\u001a\u00020\u00062\b\u0010È\u0001\u001a\u00030Ç\u00012\u0007\u0010É\u0001\u001a\u00020EH\u0002¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J\u001a\u0010Ì\u0001\u001a\u00020\u00132\u0006\u0010#\u001a\u00020.H\u0002¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J?\u0010Ð\u0001\u001a\n\u0012\u0005\u0012\u00030¶\u00010µ\u00012\u0007\u0010Î\u0001\u001a\u00020d2\u0007\u0010Ï\u0001\u001a\u00020d2\u0007\u0010É\u0001\u001a\u00020E2\b\u0010È\u0001\u001a\u00030Ç\u0001H\u0002¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J!\u0010Ò\u0001\u001a\u00020\u00132\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020\u0018H\u0002¢\u0006\u0005\bÒ\u0001\u0010IJ\u0011\u0010Ó\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\bÓ\u0001\u0010\u0015J\u0011\u0010Ô\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\bÔ\u0001\u0010nJ\u0011\u0010Õ\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\bÕ\u0001\u0010\u0015J\u001b\u0010×\u0001\u001a\u00020\u00132\u0007\u0010#\u001a\u00030Ö\u0001H\u0002¢\u0006\u0006\b×\u0001\u0010Ø\u0001J\u001b\u0010Ù\u0001\u001a\u00020\u00182\u0007\u0010#\u001a\u00030Ö\u0001H\u0002¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J\u001b\u0010Û\u0001\u001a\u00020\u00132\u0007\u0010#\u001a\u00030Ö\u0001H\u0002¢\u0006\u0006\bÛ\u0001\u0010Ø\u0001J\u001a\u0010Ü\u0001\u001a\u00020\u00132\u0006\u0010#\u001a\u00020.H\u0002¢\u0006\u0006\bÜ\u0001\u0010Í\u0001J\u001a\u0010Ý\u0001\u001a\u00020\u00132\u0006\u0010#\u001a\u00020.H\u0002¢\u0006\u0006\bÝ\u0001\u0010Í\u0001J\u001a\u0010Þ\u0001\u001a\u00020\u00132\u0006\u0010#\u001a\u00020.H\u0002¢\u0006\u0006\bÞ\u0001\u0010Í\u0001J\u001a\u0010ß\u0001\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0006\bß\u0001\u0010Ã\u0001J\u001a\u0010à\u0001\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0006\bà\u0001\u0010Ã\u0001J\u001a\u0010á\u0001\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0006\bá\u0001\u0010Ã\u0001J\u0019\u0010â\u0001\u001a\u00020\u00132\u0006\u0010#\u001a\u00020:H\u0002¢\u0006\u0005\bâ\u0001\u0010CJ\u0019\u0010ã\u0001\u001a\u00020\u00132\u0006\u0010#\u001a\u00020:H\u0002¢\u0006\u0005\bã\u0001\u0010CJ\u0019\u0010ä\u0001\u001a\u00020\u00132\u0006\u0010#\u001a\u00020:H\u0002¢\u0006\u0005\bä\u0001\u0010CJ-\u0010è\u0001\u001a\u00020d2\u0007\u0010å\u0001\u001a\u00020d2\u0007\u0010æ\u0001\u001a\u00020d2\u0007\u0010ç\u0001\u001a\u00020dH\u0002¢\u0006\u0006\bè\u0001\u0010é\u0001J-\u0010è\u0001\u001a\u00020\u00062\u0007\u0010å\u0001\u001a\u00020\u00062\u0007\u0010æ\u0001\u001a\u00020\u00062\u0007\u0010ç\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\bè\u0001\u0010ê\u0001J:\u0010ï\u0001\u001a\u00020d*\u00020d2\u0007\u0010ë\u0001\u001a\u00020d2\u0007\u0010ì\u0001\u001a\u00020d2\u0007\u0010í\u0001\u001a\u00020d2\u0007\u0010î\u0001\u001a\u00020dH\u0002¢\u0006\u0006\bï\u0001\u0010ð\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010ñ\u0001R\u0017\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0007\u0010ò\u0001R\u001a\u0010¤\u0001\u001a\u00030\u0099\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¤\u0001\u0010ó\u0001R5\u0010õ\u0001\u001a\u00070ô\u0001R\u00020\u00008\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\bõ\u0001\u0010ö\u0001\u0012\u0005\bû\u0001\u0010\u0015\u001a\u0006\b÷\u0001\u0010ø\u0001\"\u0006\bù\u0001\u0010ú\u0001R\u001a\u0010ý\u0001\u001a\u00030ü\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bý\u0001\u0010þ\u0001R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000e\u0010ÿ\u0001R\u001f\u0010\u0082\u0002\u001a\n\u0012\u0005\u0012\u00030\u0081\u00020\u0080\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0002\u0010\u0083\u0002R\u001a\u0010\u0085\u0002\u001a\u00030\u0084\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0085\u0002\u0010\u0086\u0002R\u001a\u0010\u0088\u0002\u001a\u00030\u0087\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0088\u0002\u0010\u0089\u0002R\u001a\u0010\u008b\u0002\u001a\u00030\u008a\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008b\u0002\u0010\u008c\u0002R\u001a\u0010\u008e\u0002\u001a\u00030\u008d\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008e\u0002\u0010\u008f\u0002R1\u0010\u0091\u0002\u001a\u00030\u0090\u00028\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\b\u0091\u0002\u0010\u0092\u0002\u0012\u0005\b\u0097\u0002\u0010\u0015\u001a\u0006\b\u0093\u0002\u0010\u0094\u0002\"\u0006\b\u0095\u0002\u0010\u0096\u0002R\u001a\u0010\u0099\u0002\u001a\u00030\u0098\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0099\u0002\u0010\u009a\u0002R\u001f\u0010\u009c\u0002\u001a\n\u0012\u0005\u0012\u00030\u0094\u00010\u009b\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0002\u0010\u009d\u0002R\u001e\u0010\u009e\u0002\u001a\t\u0012\u0004\u0012\u00020p0\u009b\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0002\u0010\u009d\u0002R\u001e\u0010\u009f\u0002\u001a\t\u0012\u0004\u0012\u00020u0\u009b\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0002\u0010\u009d\u0002R\u001e\u0010 \u0002\u001a\t\u0012\u0004\u0012\u00020z0\u009b\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0002\u0010\u009d\u0002R\u001e\u0010¡\u0002\u001a\t\u0012\u0004\u0012\u00020\u007f0\u009b\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0002\u0010\u009d\u0002R\u001f\u0010¢\u0002\u001a\n\u0012\u0005\u0012\u00030\u0085\u00010\u009b\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0002\u0010\u009d\u0002R\u001f\u0010£\u0002\u001a\n\u0012\u0005\u0012\u00030\u008a\u00010\u009b\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0002\u0010\u009d\u0002R\u001f\u0010¤\u0002\u001a\n\u0012\u0005\u0012\u00030\u008f\u00010\u009b\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0002\u0010\u009d\u0002R\u0019\u0010¥\u0002\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0002\u0010¦\u0002R\u0019\u0010§\u0002\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0002\u0010¦\u0002R\u0019\u0010¨\u0002\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0002\u0010¦\u0002R\u0019\u0010©\u0002\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0002\u0010ª\u0002R\u0019\u0010«\u0002\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0002\u0010ª\u0002R\u0019\u0010¬\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0002\u0010ò\u0001R\u0019\u0010\u00ad\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0002\u0010ò\u0001R\u0019\u0010®\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0002\u0010ò\u0001R\u0019\u0010¯\u0002\u001a\u00020d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0002\u0010°\u0002R\u0019\u0010±\u0002\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0002\u0010ª\u0002R\u0019\u0010²\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0002\u0010ò\u0001R\u0019\u0010³\u0002\u001a\u00020d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0002\u0010°\u0002R\u0019\u0010´\u0002\u001a\u00020d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0002\u0010°\u0002R\u001b\u0010µ\u0002\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0002\u0010¦\u0002R\u0019\u0010¶\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0002\u0010ò\u0001R\u0019\u0010·\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0002\u0010ò\u0001R\u0019\u0010¸\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0002\u0010ò\u0001R\u0019\u0010¹\u0002\u001a\u00020d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0002\u0010°\u0002R\u0019\u0010º\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0002\u0010ò\u0001R\u001b\u0010»\u0002\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0002\u0010¦\u0002R#\u0010¼\u0002\u001a\f\u0012\u0005\u0012\u00030¶\u0001\u0018\u00010µ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0002\u0010½\u0002R#\u0010¾\u0002\u001a\f\u0012\u0005\u0012\u00030¶\u0001\u0018\u00010µ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0002\u0010½\u0002R+\u0010Á\u0002\u001a\u0016\u0012\u0005\u0012\u00030¶\u00010¿\u0002j\n\u0012\u0005\u0012\u00030¶\u0001`À\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0002\u0010Â\u0002R\u001a\u0010Ä\u0002\u001a\u00030Ã\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0002\u0010Å\u0002R\u001a\u0010Ç\u0002\u001a\u00030Æ\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÇ\u0002\u0010È\u0002R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010É\u0002R(\u0010Ê\u0002\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\bÊ\u0002\u0010ª\u0002\u001a\u0005\bË\u0002\u0010n\"\u0006\bÌ\u0002\u0010Í\u0002R*\u0010Ï\u0002\u001a\u00030Î\u00028\u0014@\u0014X\u0094\u000e¢\u0006\u0018\n\u0006\bÏ\u0002\u0010Ð\u0002\u001a\u0006\bÑ\u0002\u0010Ò\u0002\"\u0006\bÓ\u0002\u0010Ô\u0002¨\u0006Ü\u0002"}, d2 = {"Lcom/mapbox/maps/plugin/gestures/GesturesPluginImpl;", "Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;", "Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettingsBase;", "Lcom/mapbox/maps/plugin/MapStyleObserverPlugin;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "pixelRatio", "<init>", "(Landroid/content/Context;F)V", "Landroid/util/AttributeSet;", "attributeSet", "(Landroid/content/Context;Landroid/util/AttributeSet;F)V", "Lcom/mapbox/maps/MapboxStyleManager;", TtmlNode.TAG_STYLE, "(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/mapbox/maps/MapboxStyleManager;)V", "Landroid/os/Handler;", "animationsTimeoutHandler", "(Landroid/content/Context;Landroid/util/AttributeSet;FLandroid/os/Handler;)V", "", "applySettings", "()V", "Landroid/view/MotionEvent;", "motionEvent", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "event", "onGenericMotionEvent", "", "width", "height", "onSizeChanged", "(II)V", "Lcom/mapbox/android/gestures/StandardScaleGestureDetector;", "detector", "velocityX", "velocityY", "handleScaleEnd$plugin_gestures_release", "(Lcom/mapbox/android/gestures/StandardScaleGestureDetector;FF)V", "handleScaleEnd", "handleScale$plugin_gestures_release", "(Lcom/mapbox/android/gestures/StandardScaleGestureDetector;)Z", "handleScale", "handleScaleBegin$plugin_gestures_release", "handleScaleBegin", "Lcom/mapbox/android/gestures/RotateGestureDetector;", "angularVelocityEvent", "handleRotateEnd$plugin_gestures_release", "(Lcom/mapbox/android/gestures/RotateGestureDetector;FFF)V", "handleRotateEnd", "rotationDegreesSinceLast", "handleRotate$plugin_gestures_release", "(Lcom/mapbox/android/gestures/RotateGestureDetector;F)Z", "handleRotate", "handleRotateBegin$plugin_gestures_release", "(Lcom/mapbox/android/gestures/RotateGestureDetector;)Z", "handleRotateBegin", "Lcom/mapbox/android/gestures/ShoveGestureDetector;", "handleShoveBegin$plugin_gestures_release", "(Lcom/mapbox/android/gestures/ShoveGestureDetector;)Z", "handleShoveBegin", "deltaPixelsSinceLast", "handleShove$plugin_gestures_release", "(Lcom/mapbox/android/gestures/ShoveGestureDetector;F)Z", "handleShove", "handleShoveEnd$plugin_gestures_release", "(Lcom/mapbox/android/gestures/ShoveGestureDetector;)V", "handleShoveEnd", "Lcom/mapbox/maps/ScreenCoordinate;", "zoomFocalPoint", "runImmediately", "animateZoomOut$plugin_gestures_release", "(Lcom/mapbox/maps/ScreenCoordinate;Z)V", "animateZoomOut", "zoomIn", "handleZoomAnimation$plugin_gestures_release", "(ZLcom/mapbox/maps/ScreenCoordinate;Z)V", "handleZoomAnimation", "screenCoordinate", "handleLongPressEvent$plugin_gestures_release", "(Lcom/mapbox/maps/ScreenCoordinate;)V", "handleLongPressEvent", "handleClickEvent$plugin_gestures_release", "(Lcom/mapbox/maps/ScreenCoordinate;)Z", "handleClickEvent", "doubleTapMovementThreshold", "handleDoubleTapEvent$plugin_gestures_release", "(Landroid/view/MotionEvent;F)Z", "handleDoubleTapEvent", "e2", "handleFlingEvent$plugin_gestures_release", "(Landroid/view/MotionEvent;FF)Z", "handleFlingEvent", "handleMoveStartEvent$plugin_gestures_release", "handleMoveStartEvent", "pixel", "isPointAboveHorizon$plugin_gestures_release", "isPointAboveHorizon", "standardScaleGestureDetector", "", "calculateZoomBy$plugin_gestures_release", "(Lcom/mapbox/android/gestures/StandardScaleGestureDetector;)D", "calculateZoomBy", "targetScreenCoordinate", "handleMove$plugin_gestures_release", "handleMove", "handleMoveEnd$plugin_gestures_release", "handleMoveEnd", "handleSingleTapUpEvent$plugin_gestures_release", "()Z", "handleSingleTapUpEvent", "Lcom/mapbox/maps/plugin/gestures/OnMapClickListener;", "onMapClickListener", "addOnMapClickListener", "(Lcom/mapbox/maps/plugin/gestures/OnMapClickListener;)V", "removeOnMapClickListener", "Lcom/mapbox/maps/plugin/gestures/OnMapLongClickListener;", "onMapLongClickListener", "addOnMapLongClickListener", "(Lcom/mapbox/maps/plugin/gestures/OnMapLongClickListener;)V", "removeOnMapLongClickListener", "Lcom/mapbox/maps/plugin/gestures/OnFlingListener;", "onFlingListener", "addOnFlingListener", "(Lcom/mapbox/maps/plugin/gestures/OnFlingListener;)V", "removeOnFlingListener", "Lcom/mapbox/maps/plugin/gestures/OnMoveListener;", "onMoveListener", "addOnMoveListener", "(Lcom/mapbox/maps/plugin/gestures/OnMoveListener;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeOnMoveListener", "Lcom/mapbox/maps/plugin/gestures/OnRotateListener;", "onRotateListener", "addOnRotateListener", "(Lcom/mapbox/maps/plugin/gestures/OnRotateListener;)V", "removeOnRotateListener", "Lcom/mapbox/maps/plugin/gestures/OnScaleListener;", "onScaleListener", "addOnScaleListener", "(Lcom/mapbox/maps/plugin/gestures/OnScaleListener;)V", "removeOnScaleListener", "Lcom/mapbox/maps/plugin/gestures/OnShoveListener;", "onShoveListener", "addOnShoveListener", "(Lcom/mapbox/maps/plugin/gestures/OnShoveListener;)V", "removeOnShoveListener", "", "owner", "addProtectedAnimationOwner", "(Ljava/lang/String;)V", "removeProtectedAnimationOwner", "Lcom/mapbox/android/gestures/AndroidGesturesManager;", "getGesturesManager", "()Lcom/mapbox/android/gestures/AndroidGesturesManager;", "internalGesturesManager", "attachDefaultListeners", "setDefaultMutuallyExclusives", "setGesturesManager", "(Lcom/mapbox/android/gestures/AndroidGesturesManager;ZZ)V", "cleanup", "attrs", "bind", "gesturesManager", "bind$plugin_gestures_release", "(Landroid/content/Context;Lcom/mapbox/android/gestures/AndroidGesturesManager;Landroid/util/AttributeSet;F)V", "Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "delegateProvider", "onDelegateProvider", "(Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;)V", "onStyleChanged", "(Lcom/mapbox/maps/MapboxStyleManager;)V", "initialize", "initializeGestureListeners", "(Landroid/content/Context;Z)V", "registerInteractions", "unregisterInteractions", "initializeGesturesManager", "(Lcom/mapbox/android/gestures/AndroidGesturesManager;Z)V", "unregisterScheduledAnimators", "", "Landroid/animation/ValueAnimator;", "animators", "([Landroid/animation/ValueAnimator;)Lkotlin/Unit;", "scheduleAnimators", "([Landroid/animation/ValueAnimator;)V", "doubleTapFinished", "getScaleFocalPoint", "(Lcom/mapbox/android/gestures/StandardScaleGestureDetector;)Lcom/mapbox/maps/ScreenCoordinate;", "velocityXY", "isScalingOut", "calculateScale", "(DZ)D", "onScaleAnimationEnd", "(Lcom/mapbox/android/gestures/StandardScaleGestureDetector;)V", "getRotateFocalPoint", "(Lcom/mapbox/android/gestures/RotateGestureDetector;)Lcom/mapbox/maps/ScreenCoordinate;", "angularVelocity", "", "animationTime", "animationFocalPoint", "createRotateAnimators", "(FJLcom/mapbox/maps/ScreenCoordinate;)[Landroid/animation/ValueAnimator;", "onRotateAnimationEnd", "(Lcom/mapbox/android/gestures/RotateGestureDetector;)V", "currentZoom", "zoomAddition", "createScaleAnimators", "(DDLcom/mapbox/maps/ScreenCoordinate;J)[Landroid/animation/ValueAnimator;", "animateZoomIn", "cancelTransitionsIfRequired", "noGesturesInProgress", "notifyOnFlingListeners", "Lcom/mapbox/android/gestures/MoveGestureDetector;", "notifyOnMoveBeginListeners", "(Lcom/mapbox/android/gestures/MoveGestureDetector;)V", "notifyOnMoveListeners", "(Lcom/mapbox/android/gestures/MoveGestureDetector;)Z", "notifyOnMoveEndListeners", "notifyOnRotateBeginListeners", "notifyOnRotateListeners", "notifyOnRotateEndListeners", "notifyOnScaleBeginListeners", "notifyOnScaleListeners", "notifyOnScaleEndListeners", "notifyOnShoveBeginListeners", "notifyOnShoveListeners", "notifyOnShoveEndListeners", "value", "min", "max", "clamp", "(DDD)D", "(FFF)F", "x", "dataLow", "dataHigh", "normalizedHigh", "normalize", "(DDDDD)D", "Landroid/content/Context;", "F", "Lcom/mapbox/android/gestures/AndroidGesturesManager;", "Lcom/mapbox/maps/plugin/gestures/GesturesPluginImpl$MoveGestureListener;", "moveGestureListener", "Lcom/mapbox/maps/plugin/gestures/GesturesPluginImpl$MoveGestureListener;", "getMoveGestureListener$plugin_gestures_release", "()Lcom/mapbox/maps/plugin/gestures/GesturesPluginImpl$MoveGestureListener;", "setMoveGestureListener$plugin_gestures_release", "(Lcom/mapbox/maps/plugin/gestures/GesturesPluginImpl$MoveGestureListener;)V", "getMoveGestureListener$plugin_gestures_release$annotations", "Lcom/mapbox/maps/plugin/gestures/GestureState;", "gestureState", "Lcom/mapbox/maps/plugin/gestures/GestureState;", "Lcom/mapbox/maps/MapboxStyleManager;", "", "Lcom/mapbox/common/Cancelable;", "interactionsCancelableSet", "Ljava/util/Set;", "Lcom/mapbox/maps/plugin/delegates/MapTransformDelegate;", "mapTransformDelegate", "Lcom/mapbox/maps/plugin/delegates/MapTransformDelegate;", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "mapCameraManagerDelegate", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "Lcom/mapbox/maps/plugin/delegates/MapProjectionDelegate;", "mapProjectionDelegate", "Lcom/mapbox/maps/plugin/delegates/MapProjectionDelegate;", "Lcom/mapbox/maps/plugin/delegates/MapPluginProviderDelegate;", "mapPluginProviderDelegate", "Lcom/mapbox/maps/plugin/delegates/MapPluginProviderDelegate;", "Lcom/mapbox/maps/plugin/delegates/MapInteractionDelegate;", "mapInteractionDelegate", "Lcom/mapbox/maps/plugin/delegates/MapInteractionDelegate;", "getMapInteractionDelegate$plugin_gestures_release", "()Lcom/mapbox/maps/plugin/delegates/MapInteractionDelegate;", "setMapInteractionDelegate$plugin_gestures_release", "(Lcom/mapbox/maps/plugin/delegates/MapInteractionDelegate;)V", "getMapInteractionDelegate$plugin_gestures_release$annotations", "Lcom/mapbox/maps/plugin/animation/CameraAnimationsPlugin;", "cameraAnimationsPlugin", "Lcom/mapbox/maps/plugin/animation/CameraAnimationsPlugin;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "protectedCameraAnimatorOwners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "onMapClickListeners", "onMapLongClickListeners", "onFlingListeners", "onMoveListeners", "onRotateListeners", "onScaleListeners", "onShoveListeners", "doubleTapFocalPoint", "Lcom/mapbox/maps/ScreenCoordinate;", "centerScreen", "cameraCenterScreenCoordinate", "sizeChanged", "Z", "cameraPaddingChanged", "minimumGestureSpeed", "minimumAngledGestureSpeed", "minimumVelocity", "scaleVelocityRatioThreshold", "D", "quickZoom", "spanSinceLast", "screenHeight", "startZoom", "scaleCachedAnchor", "minimumScaleSpanWhenRotating", "angularVelocityMultiplier", "minimumAngularVelocity", "rotateVelocityRatioThreshold", "defaultSpanSinceStartThreshold", "rotateCachedAnchor", "scaleAnimators", "[Landroid/animation/ValueAnimator;", "rotateAnimators", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "scheduledAnimators", "Ljava/util/ArrayList;", "Lq9/c;", "gesturesInterpolator", "Lq9/c;", "Lcom/mapbox/maps/util/CoreGesturesHandler;", "coreGesturesHandler", "Lcom/mapbox/maps/util/CoreGesturesHandler;", "Landroid/os/Handler;", "doubleTapRegistered", "getDoubleTapRegistered$plugin_gestures_release", "setDoubleTapRegistered$plugin_gestures_release", "(Z)V", "Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings;", "internalSettings", "Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings;", "getInternalSettings", "()Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings;", "setInternalSettings", "(Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings;)V", "Companion", "MoveGestureListener", "RotateGestureListener", "ScaleGestureListener", "ShoveGestureListener", "StandardGestureListener", "TapGestureListener", "plugin-gestures_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GesturesPluginImpl extends GesturesSettingsBase implements GesturesPlugin, MapStyleObserverPlugin {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final MapAnimationOptions IMMEDIATE_ANIMATION_OPTIONS;

    @Deprecated
    public static final float MAX_SHOVE_ANGLE = 45.0f;

    @Deprecated
    public static final float ROTATION_ANGLE_THRESHOLD = 3.0f;

    @Deprecated
    private static final String TAG = "Gestures";
    private float angularVelocityMultiplier;
    private final Handler animationsTimeoutHandler;
    private CameraAnimationsPlugin cameraAnimationsPlugin;
    private ScreenCoordinate cameraCenterScreenCoordinate;
    private boolean cameraPaddingChanged;
    private ScreenCoordinate centerScreen;
    private final Context context;
    private CoreGesturesHandler coreGesturesHandler;
    private float defaultSpanSinceStartThreshold;
    private ScreenCoordinate doubleTapFocalPoint;
    private boolean doubleTapRegistered;
    private GestureState gestureState;
    private c gesturesInterpolator;
    private AndroidGesturesManager gesturesManager;
    private final Set<Cancelable> interactionsCancelableSet;
    private GesturesSettings internalSettings;
    private MapCameraManagerDelegate mapCameraManagerDelegate;
    public MapInteractionDelegate mapInteractionDelegate;
    private MapPluginProviderDelegate mapPluginProviderDelegate;
    private MapProjectionDelegate mapProjectionDelegate;
    private MapTransformDelegate mapTransformDelegate;
    private float minimumAngledGestureSpeed;
    private float minimumAngularVelocity;
    private float minimumGestureSpeed;
    private float minimumScaleSpanWhenRotating;
    private float minimumVelocity;
    public MoveGestureListener moveGestureListener;
    private final CopyOnWriteArraySet<OnFlingListener> onFlingListeners;
    private final CopyOnWriteArraySet<OnMapClickListener> onMapClickListeners;
    private final CopyOnWriteArraySet<OnMapLongClickListener> onMapLongClickListeners;
    private final CopyOnWriteArraySet<OnMoveListener> onMoveListeners;
    private final CopyOnWriteArraySet<OnRotateListener> onRotateListeners;
    private final CopyOnWriteArraySet<OnScaleListener> onScaleListeners;
    private final CopyOnWriteArraySet<OnShoveListener> onShoveListeners;
    private float pixelRatio;
    private final CopyOnWriteArraySet<String> protectedCameraAnimatorOwners;
    private boolean quickZoom;
    private ValueAnimator[] rotateAnimators;
    private ScreenCoordinate rotateCachedAnchor;
    private double rotateVelocityRatioThreshold;
    private ValueAnimator[] scaleAnimators;
    private ScreenCoordinate scaleCachedAnchor;
    private double scaleVelocityRatioThreshold;
    private final ArrayList<ValueAnimator> scheduledAnimators;
    private double screenHeight;
    private boolean sizeChanged;
    private float spanSinceLast;
    private double startZoom;
    private MapboxStyleManager style;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0081\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/mapbox/maps/plugin/gestures/GesturesPluginImpl$MoveGestureListener;", "Lcom/mapbox/android/gestures/MoveGestureDetector$SimpleOnMoveGestureListener;", "(Lcom/mapbox/maps/plugin/gestures/GesturesPluginImpl;)V", "detector", "Lcom/mapbox/android/gestures/MoveGestureDetector;", "getDetector", "()Lcom/mapbox/android/gestures/MoveGestureDetector;", "setDetector", "(Lcom/mapbox/android/gestures/MoveGestureDetector;)V", "onMove", "", "distanceX", "", "distanceY", "onMoveBegin", "onMoveEnd", "", "velocityX", "velocityY", "plugin-gestures_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class MoveGestureListener extends MoveGestureDetector.SimpleOnMoveGestureListener {
        public MoveGestureDetector detector;

        public MoveGestureListener() {
        }

        public final MoveGestureDetector getDetector() {
            MoveGestureDetector moveGestureDetector = this.detector;
            if (moveGestureDetector != null) {
                return moveGestureDetector;
            }
            s.m("detector");
            throw null;
        }

        @Override // com.mapbox.android.gestures.MoveGestureDetector.SimpleOnMoveGestureListener, com.mapbox.android.gestures.MoveGestureDetector.OnMoveGestureListener
        public boolean onMove(MoveGestureDetector detector, float distanceX, float distanceY) {
            detector.getClass();
            if ((distanceX == 0.0f && distanceY == 0.0f) || detector.getPointersCount() > 2) {
                return false;
            }
            if (!GesturesPluginImpl.this.getInternalSettings().getPinchScrollEnabled() && detector.getPointersCount() > 1) {
                return false;
            }
            AndroidGesturesManager androidGesturesManager = GesturesPluginImpl.this.gesturesManager;
            if (androidGesturesManager == null) {
                s.m("gesturesManager");
                throw null;
            }
            if (androidGesturesManager.getShoveGestureDetector().isInProgress()) {
                return false;
            }
            double d14 = detector.getFocalPoint().x;
            double d15 = detector.getFocalPoint().y;
            if (Double.isInfinite(d14) || Double.isNaN(d14) || Double.isInfinite(d15) || Double.isNaN(d15)) {
                MapboxLogger.logE(GesturesPluginImpl.TAG, "Invalid focal point=" + detector.getFocalPoint() + " to perform map panning!");
                return false;
            }
            if (Float.isInfinite(distanceX) || Float.isNaN(distanceX) || Float.isInfinite(distanceY) || Float.isNaN(distanceY)) {
                MapboxLogger.logE(GesturesPluginImpl.TAG, j.l("Invalid distanceX=", distanceX, " or distanceY=", distanceY, " to perform map panning!"));
                return false;
            }
            if (GesturesPluginImpl.this.isPointAboveHorizon$plugin_gestures_release(new ScreenCoordinate(d14, d15))) {
                return false;
            }
            GesturesPluginImpl.this.getMapInteractionDelegate$plugin_gestures_release().dispatch(new PlatformEventInfo(PlatformEventType.DRAG, new ScreenCoordinate(d14 - (GesturesUtils.isScrollHorizontallyLimited(GesturesPluginImpl.this.getInternalSettings()) ? 0.0d : distanceX), d15 - (GesturesUtils.isScrollVerticallyLimited(GesturesPluginImpl.this.getInternalSettings()) ? 0.0d : distanceY))));
            return false;
        }

        @Override // com.mapbox.android.gestures.MoveGestureDetector.SimpleOnMoveGestureListener, com.mapbox.android.gestures.MoveGestureDetector.OnMoveGestureListener
        public boolean onMoveBegin(MoveGestureDetector detector) {
            detector.getClass();
            if (this.detector == null || getDetector() != detector) {
                setDetector(detector);
            }
            if (!GesturesPluginImpl.this.getInternalSettings().getScrollEnabled()) {
                return false;
            }
            GesturesPluginImpl.this.getMapInteractionDelegate$plugin_gestures_release().dispatch(new PlatformEventInfo(PlatformEventType.DRAG_BEGIN, new ScreenCoordinate(detector.getFocalPoint().x, detector.getFocalPoint().y)));
            return true;
        }

        @Override // com.mapbox.android.gestures.MoveGestureDetector.SimpleOnMoveGestureListener, com.mapbox.android.gestures.MoveGestureDetector.OnMoveGestureListener
        public void onMoveEnd(MoveGestureDetector detector, float velocityX, float velocityY) {
            detector.getClass();
            GesturesPluginImpl.this.getMapInteractionDelegate$plugin_gestures_release().dispatch(new PlatformEventInfo(PlatformEventType.DRAG_END, new ScreenCoordinate(detector.getFocalPoint().x, detector.getFocalPoint().y)));
        }

        public final void setDetector(MoveGestureDetector moveGestureDetector) {
            moveGestureDetector.getClass();
            this.detector = moveGestureDetector;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J(\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016¨\u0006\u0010"}, d2 = {"Lcom/mapbox/maps/plugin/gestures/GesturesPluginImpl$RotateGestureListener;", "Lcom/mapbox/android/gestures/RotateGestureDetector$SimpleOnRotateGestureListener;", "(Lcom/mapbox/maps/plugin/gestures/GesturesPluginImpl;)V", "onRotate", "", "detector", "Lcom/mapbox/android/gestures/RotateGestureDetector;", "rotationDegreesSinceLast", "", "rotationDegreesSinceFirst", "onRotateBegin", "onRotateEnd", "", "velocityX", "velocityY", "angularVelocity", "plugin-gestures_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class RotateGestureListener extends RotateGestureDetector.SimpleOnRotateGestureListener {
        public RotateGestureListener() {
        }

        @Override // com.mapbox.android.gestures.RotateGestureDetector.SimpleOnRotateGestureListener, com.mapbox.android.gestures.RotateGestureDetector.OnRotateGestureListener
        public boolean onRotate(RotateGestureDetector detector, float rotationDegreesSinceLast, float rotationDegreesSinceFirst) {
            detector.getClass();
            return GesturesPluginImpl.this.handleRotate$plugin_gestures_release(detector, rotationDegreesSinceLast);
        }

        @Override // com.mapbox.android.gestures.RotateGestureDetector.SimpleOnRotateGestureListener, com.mapbox.android.gestures.RotateGestureDetector.OnRotateGestureListener
        public boolean onRotateBegin(RotateGestureDetector detector) {
            detector.getClass();
            return GesturesPluginImpl.this.handleRotateBegin$plugin_gestures_release(detector);
        }

        @Override // com.mapbox.android.gestures.RotateGestureDetector.SimpleOnRotateGestureListener, com.mapbox.android.gestures.RotateGestureDetector.OnRotateGestureListener
        public void onRotateEnd(RotateGestureDetector detector, float velocityX, float velocityY, float angularVelocity) {
            detector.getClass();
            GesturesPluginImpl.this.handleRotateEnd$plugin_gestures_release(detector, velocityX, velocityY, angularVelocity);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, d2 = {"Lcom/mapbox/maps/plugin/gestures/GesturesPluginImpl$ScaleGestureListener;", "Lcom/mapbox/android/gestures/StandardScaleGestureDetector$SimpleStandardOnScaleGestureListener;", "(Lcom/mapbox/maps/plugin/gestures/GesturesPluginImpl;)V", "onScale", "", "detector", "Lcom/mapbox/android/gestures/StandardScaleGestureDetector;", "onScaleBegin", "onScaleEnd", "", "velocityX", "", "velocityY", "plugin-gestures_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class ScaleGestureListener extends StandardScaleGestureDetector.SimpleStandardOnScaleGestureListener {
        public ScaleGestureListener() {
        }

        @Override // com.mapbox.android.gestures.StandardScaleGestureDetector.SimpleStandardOnScaleGestureListener, com.mapbox.android.gestures.StandardScaleGestureDetector.StandardOnScaleGestureListener
        public boolean onScale(StandardScaleGestureDetector detector) {
            detector.getClass();
            return GesturesPluginImpl.this.handleScale$plugin_gestures_release(detector);
        }

        @Override // com.mapbox.android.gestures.StandardScaleGestureDetector.SimpleStandardOnScaleGestureListener, com.mapbox.android.gestures.StandardScaleGestureDetector.StandardOnScaleGestureListener
        public boolean onScaleBegin(StandardScaleGestureDetector detector) {
            detector.getClass();
            return GesturesPluginImpl.this.handleScaleBegin$plugin_gestures_release(detector);
        }

        @Override // com.mapbox.android.gestures.StandardScaleGestureDetector.SimpleStandardOnScaleGestureListener, com.mapbox.android.gestures.StandardScaleGestureDetector.StandardOnScaleGestureListener
        public void onScaleEnd(StandardScaleGestureDetector detector, float velocityX, float velocityY) {
            detector.getClass();
            GesturesPluginImpl.this.handleScaleEnd$plugin_gestures_release(detector, velocityX, velocityY);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016¨\u0006\u000f"}, d2 = {"Lcom/mapbox/maps/plugin/gestures/GesturesPluginImpl$ShoveGestureListener;", "Lcom/mapbox/android/gestures/ShoveGestureDetector$SimpleOnShoveGestureListener;", "(Lcom/mapbox/maps/plugin/gestures/GesturesPluginImpl;)V", "onShove", "", "detector", "Lcom/mapbox/android/gestures/ShoveGestureDetector;", "deltaPixelsSinceLast", "", "deltaPixelsSinceStart", "onShoveBegin", "onShoveEnd", "", "velocityX", "velocityY", "plugin-gestures_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class ShoveGestureListener extends ShoveGestureDetector.SimpleOnShoveGestureListener {
        public ShoveGestureListener() {
        }

        @Override // com.mapbox.android.gestures.ShoveGestureDetector.SimpleOnShoveGestureListener, com.mapbox.android.gestures.ShoveGestureDetector.OnShoveGestureListener
        public boolean onShove(ShoveGestureDetector detector, float deltaPixelsSinceLast, float deltaPixelsSinceStart) {
            detector.getClass();
            return GesturesPluginImpl.this.handleShove$plugin_gestures_release(detector, deltaPixelsSinceLast);
        }

        @Override // com.mapbox.android.gestures.ShoveGestureDetector.SimpleOnShoveGestureListener, com.mapbox.android.gestures.ShoveGestureDetector.OnShoveGestureListener
        public boolean onShoveBegin(ShoveGestureDetector detector) {
            detector.getClass();
            return GesturesPluginImpl.this.handleShoveBegin$plugin_gestures_release(detector);
        }

        @Override // com.mapbox.android.gestures.ShoveGestureDetector.SimpleOnShoveGestureListener, com.mapbox.android.gestures.ShoveGestureDetector.OnShoveGestureListener
        public void onShoveEnd(ShoveGestureDetector detector, float velocityX, float velocityY) {
            detector.getClass();
            GesturesPluginImpl.this.handleShoveEnd$plugin_gestures_release(detector);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0081\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J,\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u0011\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u0012\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/mapbox/maps/plugin/gestures/GesturesPluginImpl$StandardGestureListener;", "Lcom/mapbox/maps/plugin/gestures/StandardGestureListenerShim;", "doubleTapMovementThreshold", "", "(Lcom/mapbox/maps/plugin/gestures/GesturesPluginImpl;F)V", "onDoubleTapEvent", "", "motionEvent", "Landroid/view/MotionEvent;", "onDown", "onFling", "e1", "e2", "velocityX", "velocityY", "onLongPress", "", "onSingleTapConfirmed", "onSingleTapUp", "plugin-gestures_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class StandardGestureListener extends StandardGestureListenerShim {
        private final float doubleTapMovementThreshold;

        public StandardGestureListener(float f14) {
            this.doubleTapMovementThreshold = f14;
        }

        @Override // com.mapbox.maps.plugin.gestures.StandardGestureListenerShim, com.mapbox.android.gestures.StandardGestureDetector.SimpleStandardOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            if (motionEvent == null) {
                return false;
            }
            if (GesturesPluginImpl.this.handleDoubleTapEvent$plugin_gestures_release(motionEvent, this.doubleTapMovementThreshold)) {
                return true;
            }
            return super.onDoubleTapEvent(motionEvent);
        }

        @Override // com.mapbox.maps.plugin.gestures.StandardGestureListenerShim, com.mapbox.android.gestures.StandardGestureDetector.SimpleStandardOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // com.mapbox.maps.plugin.gestures.StandardGestureListenerShim, com.mapbox.android.gestures.StandardGestureDetector.SimpleStandardOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent e4, MotionEvent e14, float velocityX, float velocityY) {
            if (e4 == null || e14 == null) {
                return false;
            }
            return GesturesPluginImpl.this.handleFlingEvent$plugin_gestures_release(e14, velocityX, velocityY);
        }

        @Override // com.mapbox.maps.plugin.gestures.StandardGestureListenerShim, com.mapbox.android.gestures.StandardGestureDetector.SimpleStandardOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (motionEvent == null) {
                return;
            }
            GesturesPluginImpl.this.getMapInteractionDelegate$plugin_gestures_release().dispatch(new PlatformEventInfo(PlatformEventType.LONG_CLICK, GesturesPluginImplKt.toScreenCoordinate(motionEvent)));
        }

        @Override // com.mapbox.maps.plugin.gestures.StandardGestureListenerShim, com.mapbox.android.gestures.StandardGestureDetector.SimpleStandardOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (motionEvent == null) {
                return false;
            }
            GesturesPluginImpl.this.getMapInteractionDelegate$plugin_gestures_release().dispatch(new PlatformEventInfo(PlatformEventType.CLICK, GesturesPluginImplKt.toScreenCoordinate(motionEvent)));
            return false;
        }

        @Override // com.mapbox.maps.plugin.gestures.StandardGestureListenerShim, com.mapbox.android.gestures.StandardGestureDetector.SimpleStandardOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return GesturesPluginImpl.this.handleSingleTapUpEvent$plugin_gestures_release();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/mapbox/maps/plugin/gestures/GesturesPluginImpl$TapGestureListener;", "Lcom/mapbox/android/gestures/MultiFingerTapGestureDetector$OnMultiFingerTapGestureListener;", "(Lcom/mapbox/maps/plugin/gestures/GesturesPluginImpl;)V", "onMultiFingerTap", "", "detector", "Lcom/mapbox/android/gestures/MultiFingerTapGestureDetector;", "pointersCount", "", "plugin-gestures_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class TapGestureListener implements MultiFingerTapGestureDetector.OnMultiFingerTapGestureListener {
        public TapGestureListener() {
        }

        @Override // com.mapbox.android.gestures.MultiFingerTapGestureDetector.OnMultiFingerTapGestureListener
        public boolean onMultiFingerTap(MultiFingerTapGestureDetector detector, int pointersCount) {
            detector.getClass();
            if (!GesturesPluginImpl.this.getInternalSettings().getDoubleTouchToZoomOutEnabled() || pointersCount != 2) {
                return false;
            }
            CameraAnimationsPlugin cameraAnimationsPlugin = GesturesPluginImpl.this.cameraAnimationsPlugin;
            if (cameraAnimationsPlugin == null) {
                s.m("cameraAnimationsPlugin");
                throw null;
            }
            cameraAnimationsPlugin.cancelAllAnimators(h0.b1(GesturesPluginImpl.this.protectedCameraAnimatorOwners));
            ScreenCoordinate focalPoint = GesturesPluginImpl.this.getInternalSettings().getFocalPoint();
            if (focalPoint != null) {
                GesturesPluginImpl.this.animateZoomOut$plugin_gestures_release(focalPoint, false);
                return true;
            }
            PointF focalPoint2 = detector.getFocalPoint();
            GesturesPluginImpl.this.animateZoomOut$plugin_gestures_release(new ScreenCoordinate(focalPoint2.x, focalPoint2.y), false);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.gestures.GesturesPluginImpl$registerInteractions$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/mapbox/maps/InteractionContext;", "invoke", "(Lcom/mapbox/maps/InteractionContext;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42271 extends w implements l<InteractionContext, Boolean> {
        public C42271() {
            super(1);
        }

        @Override // e23.l
        public final Boolean invoke(InteractionContext interactionContext) {
            interactionContext.getClass();
            GesturesPluginImpl gesturesPluginImpl = GesturesPluginImpl.this;
            ScreenCoordinate screenCoordinate = interactionContext.getScreenCoordinate();
            screenCoordinate.getClass();
            gesturesPluginImpl.handleClickEvent$plugin_gestures_release(screenCoordinate);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.gestures.GesturesPluginImpl$registerInteractions$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/mapbox/maps/InteractionContext;", "invoke", "(Lcom/mapbox/maps/InteractionContext;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements l<InteractionContext, Boolean> {
        public AnonymousClass2() {
            super(1);
        }

        @Override // e23.l
        public final Boolean invoke(InteractionContext interactionContext) {
            interactionContext.getClass();
            GesturesPluginImpl gesturesPluginImpl = GesturesPluginImpl.this;
            ScreenCoordinate screenCoordinate = interactionContext.getScreenCoordinate();
            screenCoordinate.getClass();
            gesturesPluginImpl.handleLongPressEvent$plugin_gestures_release(screenCoordinate);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.gestures.GesturesPluginImpl$registerInteractions$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/mapbox/maps/InteractionContext;", "invoke", "(Lcom/mapbox/maps/InteractionContext;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass3 extends w implements l<InteractionContext, Boolean> {
        public AnonymousClass3() {
            super(1);
        }

        @Override // e23.l
        public final Boolean invoke(InteractionContext interactionContext) {
            interactionContext.getClass();
            GesturesPluginImpl.this.handleMoveStartEvent$plugin_gestures_release();
            return Boolean.TRUE;
        }
    }

    static {
        MapAnimationOptions.Companion companion = MapAnimationOptions.INSTANCE;
        MapAnimationOptions.Builder builder = new MapAnimationOptions.Builder();
        builder.duration(0L);
        builder.owner(MapAnimationOwnerRegistry.GESTURES);
        IMMEDIATE_ANIMATION_OPTIONS = builder.build();
    }

    public GesturesPluginImpl(Context context, AttributeSet attributeSet, MapboxStyleManager mapboxStyleManager) {
        context.getClass();
        attributeSet.getClass();
        mapboxStyleManager.getClass();
        this.pixelRatio = 1.0f;
        this.interactionsCancelableSet = new LinkedHashSet();
        this.protectedCameraAnimatorOwners = new CopyOnWriteArraySet<>();
        this.onMapClickListeners = new CopyOnWriteArraySet<>();
        this.onMapLongClickListeners = new CopyOnWriteArraySet<>();
        this.onFlingListeners = new CopyOnWriteArraySet<>();
        this.onMoveListeners = new CopyOnWriteArraySet<>();
        this.onRotateListeners = new CopyOnWriteArraySet<>();
        this.onScaleListeners = new CopyOnWriteArraySet<>();
        this.onShoveListeners = new CopyOnWriteArraySet<>();
        ScreenCoordinate screenCoordinate = new ScreenCoordinate(0.0d, 0.0d);
        this.doubleTapFocalPoint = screenCoordinate;
        this.centerScreen = screenCoordinate;
        this.cameraCenterScreenCoordinate = screenCoordinate;
        this.sizeChanged = true;
        this.scheduledAnimators = new ArrayList<>();
        this.gesturesInterpolator = new c();
        this.context = context;
        this.pixelRatio = 1.0f;
        setInternalSettings(GesturesAttributeParser.INSTANCE.parseGesturesSettings(context, attributeSet));
        this.animationsTimeoutHandler = new Handler(Looper.getMainLooper());
        this.style = mapboxStyleManager;
    }

    private final void animateZoomIn(ScreenCoordinate zoomFocalPoint, boolean runImmediately) {
        handleZoomAnimation$plugin_gestures_release(true, zoomFocalPoint, runImmediately);
    }

    private final double calculateScale(double velocityXY, boolean isScalingOut) {
        double dClamp = clamp(velocityXY * 2.5d * 1.0E-4d, 0.0d, 2.5d);
        return isScalingOut ? -dClamp : dClamp;
    }

    private final void cancelTransitionsIfRequired() {
        if (noGesturesInProgress()) {
            CameraAnimationsPlugin cameraAnimationsPlugin = this.cameraAnimationsPlugin;
            if (cameraAnimationsPlugin != null) {
                cameraAnimationsPlugin.cancelAllAnimators(h0.b1(this.protectedCameraAnimatorOwners));
            } else {
                s.m("cameraAnimationsPlugin");
                throw null;
            }
        }
    }

    private final float clamp(float value, float min, float max) {
        if (max <= value) {
            value = max;
        }
        return min < value ? value : min;
    }

    private final ValueAnimator[] createRotateAnimators(float angularVelocity, long animationTime, ScreenCoordinate animationFocalPoint) {
        float f14;
        c cVar = this.gesturesInterpolator;
        long j8 = (animationTime / ((long) 16)) + 1;
        if (1 <= j8) {
            float fA = angularVelocity;
            long j14 = 1;
            while (true) {
                fA = x.a(1, cVar.getInterpolation(j14 / j8), angularVelocity, fA);
                if (j14 == j8) {
                    break;
                }
                j14++;
            }
            f14 = fA;
        } else {
            f14 = angularVelocity;
        }
        MapCameraManagerDelegate mapCameraManagerDelegate = this.mapCameraManagerDelegate;
        if (mapCameraManagerDelegate == null) {
            s.m("mapCameraManagerDelegate");
            throw null;
        }
        double bearing = mapCameraManagerDelegate.getCameraState().getBearing();
        double d14 = ((double) f14) + bearing;
        CameraAnimationsPlugin cameraAnimationsPlugin = this.cameraAnimationsPlugin;
        if (cameraAnimationsPlugin == null) {
            s.m("cameraAnimationsPlugin");
            throw null;
        }
        CameraAnimatorOptions.Companion companion = CameraAnimatorOptions.INSTANCE;
        CameraAnimatorOptions.Builder builder = new CameraAnimatorOptions.Builder(Arrays.copyOf(new Double[]{Double.valueOf(d14)}, 1));
        builder.owner(MapAnimationOwnerRegistry.GESTURES);
        builder.startValue(Double.valueOf(bearing));
        ValueAnimator valueAnimatorCreateBearingAnimator$default = CameraAnimationsPlugin.DefaultImpls.createBearingAnimator$default(cameraAnimationsPlugin, builder.build(), false, new GesturesPluginImpl$createRotateAnimators$bearingAnimator$2(cVar, animationTime), 2, null);
        CoreGesturesHandler coreGesturesHandler = this.coreGesturesHandler;
        if (coreGesturesHandler == null) {
            s.m("coreGesturesHandler");
            throw null;
        }
        valueAnimatorCreateBearingAnimator$default.addListener(coreGesturesHandler.getCoreGestureAnimatorHandler());
        ScreenCoordinate screenCoordinate = new ScreenCoordinate(animationFocalPoint.getX(), animationFocalPoint.getY());
        CameraAnimationsPlugin cameraAnimationsPlugin2 = this.cameraAnimationsPlugin;
        if (cameraAnimationsPlugin2 == null) {
            s.m("cameraAnimationsPlugin");
            throw null;
        }
        CameraAnimatorOptions.Builder builder2 = new CameraAnimatorOptions.Builder(Arrays.copyOf(new ScreenCoordinate[]{screenCoordinate}, 1));
        builder2.owner(MapAnimationOwnerRegistry.GESTURES);
        builder2.startValue(screenCoordinate);
        ValueAnimator valueAnimatorCreateAnchorAnimator = cameraAnimationsPlugin2.createAnchorAnimator(builder2.build(), new GesturesPluginImpl$createRotateAnimators$anchorAnimator$2(cVar, animationTime));
        valueAnimatorCreateAnchorAnimator.addListener(new Animator.AnimatorListener() { // from class: com.mapbox.maps.plugin.gestures.GesturesPluginImpl$createRotateAnimators$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                animator.getClass();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                animator.getClass();
                CameraAnimationsPlugin cameraAnimationsPlugin3 = this.this$0.cameraAnimationsPlugin;
                if (cameraAnimationsPlugin3 != null) {
                    cameraAnimationsPlugin3.setAnchor(this.this$0.rotateCachedAnchor);
                } else {
                    s.m("cameraAnimationsPlugin");
                    throw null;
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                animator.getClass();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                animator.getClass();
            }
        });
        return new ValueAnimator[]{valueAnimatorCreateBearingAnimator$default, valueAnimatorCreateAnchorAnimator};
    }

    private final ValueAnimator[] createScaleAnimators(double currentZoom, double zoomAddition, ScreenCoordinate animationFocalPoint, long animationTime) {
        c cVar = this.gesturesInterpolator;
        CameraAnimationsPlugin cameraAnimationsPlugin = this.cameraAnimationsPlugin;
        if (cameraAnimationsPlugin == null) {
            s.m("cameraAnimationsPlugin");
            throw null;
        }
        CameraAnimatorOptions.Companion companion = CameraAnimatorOptions.INSTANCE;
        CameraAnimatorOptions.Builder builder = new CameraAnimatorOptions.Builder(Arrays.copyOf(new Double[]{Double.valueOf(zoomAddition + currentZoom)}, 1));
        builder.owner(MapAnimationOwnerRegistry.GESTURES);
        builder.startValue(Double.valueOf(currentZoom));
        ValueAnimator valueAnimatorCreateZoomAnimator = cameraAnimationsPlugin.createZoomAnimator(builder.build(), new GesturesPluginImpl$createScaleAnimators$zoomAnimator$2(cVar, animationTime));
        valueAnimatorCreateZoomAnimator.addListener(new Animator.AnimatorListener() { // from class: com.mapbox.maps.plugin.gestures.GesturesPluginImpl$createScaleAnimators$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                animator.getClass();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                animator.getClass();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                animator.getClass();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                animator.getClass();
                GesturesPluginImpl gesturesPluginImpl = this.this$0;
                AndroidGesturesManager androidGesturesManager = gesturesPluginImpl.gesturesManager;
                if (androidGesturesManager == null) {
                    s.m("gesturesManager");
                    throw null;
                }
                StandardScaleGestureDetector standardScaleGestureDetector = androidGesturesManager.getStandardScaleGestureDetector();
                standardScaleGestureDetector.getClass();
                gesturesPluginImpl.notifyOnScaleListeners(standardScaleGestureDetector);
            }
        });
        CoreGesturesHandler coreGesturesHandler = this.coreGesturesHandler;
        if (coreGesturesHandler == null) {
            s.m("coreGesturesHandler");
            throw null;
        }
        valueAnimatorCreateZoomAnimator.addListener(coreGesturesHandler.getCoreGestureAnimatorHandler());
        CameraAnimationsPlugin cameraAnimationsPlugin2 = this.cameraAnimationsPlugin;
        if (cameraAnimationsPlugin2 == null) {
            s.m("cameraAnimationsPlugin");
            throw null;
        }
        CameraAnimatorOptions.Builder builder2 = new CameraAnimatorOptions.Builder(Arrays.copyOf(new ScreenCoordinate[]{animationFocalPoint}, 1));
        builder2.owner(MapAnimationOwnerRegistry.GESTURES);
        builder2.startValue(animationFocalPoint);
        ValueAnimator valueAnimatorCreateAnchorAnimator = cameraAnimationsPlugin2.createAnchorAnimator(builder2.build(), new GesturesPluginImpl$createScaleAnimators$anchorAnimator$2(cVar, animationTime));
        valueAnimatorCreateAnchorAnimator.addListener(new Animator.AnimatorListener() { // from class: com.mapbox.maps.plugin.gestures.GesturesPluginImpl$createScaleAnimators$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                animator.getClass();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                animator.getClass();
                GesturesPluginImpl gesturesPluginImpl = this.this$0;
                AndroidGesturesManager androidGesturesManager = gesturesPluginImpl.gesturesManager;
                if (androidGesturesManager == null) {
                    s.m("gesturesManager");
                    throw null;
                }
                StandardScaleGestureDetector standardScaleGestureDetector = androidGesturesManager.getStandardScaleGestureDetector();
                standardScaleGestureDetector.getClass();
                gesturesPluginImpl.notifyOnScaleEndListeners(standardScaleGestureDetector);
                CameraAnimationsPlugin cameraAnimationsPlugin3 = this.this$0.cameraAnimationsPlugin;
                if (cameraAnimationsPlugin3 != null) {
                    cameraAnimationsPlugin3.setAnchor(this.this$0.scaleCachedAnchor);
                } else {
                    s.m("cameraAnimationsPlugin");
                    throw null;
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                animator.getClass();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                animator.getClass();
            }
        });
        return new ValueAnimator[]{valueAnimatorCreateZoomAnimator, valueAnimatorCreateAnchorAnimator};
    }

    private final void doubleTapFinished() {
        if (this.doubleTapRegistered) {
            GestureState gestureState = this.gestureState;
            if (gestureState == null) {
                s.m("gestureState");
                throw null;
            }
            gestureState.restore(GestureState.Type.DoubleTap);
            this.doubleTapRegistered = false;
        }
    }

    public static /* synthetic */ void getMapInteractionDelegate$plugin_gestures_release$annotations() {
    }

    public static /* synthetic */ void getMoveGestureListener$plugin_gestures_release$annotations() {
    }

    private final ScreenCoordinate getRotateFocalPoint(RotateGestureDetector detector) {
        ScreenCoordinate focalPoint = getInternalSettings().getFocalPoint();
        if (focalPoint != null) {
            return focalPoint;
        }
        PointF focalPoint2 = detector.getFocalPoint();
        return new ScreenCoordinate(focalPoint2.x, focalPoint2.y);
    }

    private final ScreenCoordinate getScaleFocalPoint(StandardScaleGestureDetector detector) {
        ScreenCoordinate focalPoint = getInternalSettings().getFocalPoint();
        if (focalPoint != null) {
            return focalPoint;
        }
        if (this.quickZoom) {
            return this.doubleTapFocalPoint;
        }
        PointF focalPoint2 = detector.getFocalPoint();
        return new ScreenCoordinate(focalPoint2.x, focalPoint2.y);
    }

    private final void initializeGestureListeners(Context context, boolean attachDefaultListeners) {
        if (attachDefaultListeners) {
            Resources resources = context.getResources();
            int i14 = com.mapbox.android.gestures.R.dimen.mapbox_defaultScaleSpanSinceStartThreshold;
            StandardGestureListener standardGestureListener = new StandardGestureListener(resources.getDimension(i14));
            setMoveGestureListener$plugin_gestures_release(new MoveGestureListener());
            this.minimumGestureSpeed = context.getResources().getDimension(R.dimen.mapbox_minimum_scale_speed);
            this.minimumAngledGestureSpeed = context.getResources().getDimension(R.dimen.mapbox_minimum_angled_scale_speed);
            this.minimumVelocity = context.getResources().getDimension(R.dimen.mapbox_minimum_scale_velocity);
            Resources resources2 = context.getResources();
            int i15 = R.dimen.mapbox_density_constant;
            this.scaleVelocityRatioThreshold = ((double) resources2.getDimension(i15)) * 0.004d;
            ScaleGestureListener scaleGestureListener = new ScaleGestureListener();
            this.minimumScaleSpanWhenRotating = context.getResources().getDimension(R.dimen.mapbox_minimum_scale_span_when_rotating);
            this.angularVelocityMultiplier = context.getResources().getDimension(R.dimen.mapbox_angular_velocity_multiplier);
            this.minimumAngularVelocity = context.getResources().getDimension(R.dimen.mapbox_minimum_angular_velocity);
            this.rotateVelocityRatioThreshold = ((double) context.getResources().getDimension(i15)) * 2.2000000000000003E-4d;
            this.defaultSpanSinceStartThreshold = context.getResources().getDimension(i14);
            RotateGestureListener rotateGestureListener = new RotateGestureListener();
            ShoveGestureListener shoveGestureListener = new ShoveGestureListener();
            TapGestureListener tapGestureListener = new TapGestureListener();
            AndroidGesturesManager androidGesturesManager = this.gesturesManager;
            if (androidGesturesManager == null) {
                s.m("gesturesManager");
                throw null;
            }
            androidGesturesManager.setStandardGestureListener(standardGestureListener);
            AndroidGesturesManager androidGesturesManager2 = this.gesturesManager;
            if (androidGesturesManager2 == null) {
                s.m("gesturesManager");
                throw null;
            }
            androidGesturesManager2.setMoveGestureListener(getMoveGestureListener$plugin_gestures_release());
            AndroidGesturesManager androidGesturesManager3 = this.gesturesManager;
            if (androidGesturesManager3 == null) {
                s.m("gesturesManager");
                throw null;
            }
            androidGesturesManager3.setStandardScaleGestureListener(scaleGestureListener);
            AndroidGesturesManager androidGesturesManager4 = this.gesturesManager;
            if (androidGesturesManager4 == null) {
                s.m("gesturesManager");
                throw null;
            }
            androidGesturesManager4.setRotateGestureListener(rotateGestureListener);
            AndroidGesturesManager androidGesturesManager5 = this.gesturesManager;
            if (androidGesturesManager5 == null) {
                s.m("gesturesManager");
                throw null;
            }
            androidGesturesManager5.setShoveGestureListener(shoveGestureListener);
            AndroidGesturesManager androidGesturesManager6 = this.gesturesManager;
            if (androidGesturesManager6 == null) {
                s.m("gesturesManager");
                throw null;
            }
            androidGesturesManager6.setMultiFingerTapGestureListener(tapGestureListener);
            registerInteractions();
        }
    }

    private final void initializeGesturesManager(AndroidGesturesManager gesturesManager, boolean setDefaultMutuallyExclusives) {
        if (setDefaultMutuallyExclusives) {
            HashSet hashSet = new HashSet();
            hashSet.add(3);
            hashSet.add(1);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(3);
            hashSet2.add(2);
            HashSet hashSet3 = new HashSet();
            hashSet3.add(1);
            hashSet3.add(6);
            gesturesManager.setMutuallyExclusiveGestures(hashSet, hashSet2, hashSet3);
        }
        gesturesManager.getRotateGestureDetector().setAngleThreshold(3.0f);
        gesturesManager.getShoveGestureDetector().setMaxShoveAngle(45.0f);
        this.gesturesManager = gesturesManager;
    }

    private final boolean noGesturesInProgress() {
        if (getInternalSettings().getScrollEnabled()) {
            AndroidGesturesManager androidGesturesManager = this.gesturesManager;
            if (androidGesturesManager == null) {
                s.m("gesturesManager");
                throw null;
            }
            if (androidGesturesManager.getMoveGestureDetector().isInProgress()) {
                return false;
            }
        }
        if (getInternalSettings().getPinchToZoomEnabled() || getInternalSettings().getDoubleTouchToZoomOutEnabled() || getInternalSettings().getDoubleTapToZoomInEnabled()) {
            AndroidGesturesManager androidGesturesManager2 = this.gesturesManager;
            if (androidGesturesManager2 == null) {
                s.m("gesturesManager");
                throw null;
            }
            if (androidGesturesManager2.getStandardScaleGestureDetector().isInProgress()) {
                return false;
            }
        }
        if (getInternalSettings().getRotateEnabled()) {
            AndroidGesturesManager androidGesturesManager3 = this.gesturesManager;
            if (androidGesturesManager3 == null) {
                s.m("gesturesManager");
                throw null;
            }
            if (androidGesturesManager3.getRotateGestureDetector().isInProgress()) {
                return false;
            }
        }
        if (!getInternalSettings().getPitchEnabled()) {
            return true;
        }
        AndroidGesturesManager androidGesturesManager4 = this.gesturesManager;
        if (androidGesturesManager4 != null) {
            return !androidGesturesManager4.getShoveGestureDetector().isInProgress();
        }
        s.m("gesturesManager");
        throw null;
    }

    private final double normalize(double d14, double d15, double d16, double d17, double d18) {
        return o2.c.b(d18, d14, (d15 - d16) / (d17 - d16), d14);
    }

    private final void notifyOnFlingListeners() {
        Iterator<OnFlingListener> it = this.onFlingListeners.iterator();
        while (it.hasNext()) {
            it.next().onFling();
        }
    }

    private final void notifyOnMoveBeginListeners(MoveGestureDetector detector) {
        Iterator<OnMoveListener> it = this.onMoveListeners.iterator();
        while (it.hasNext()) {
            it.next().onMoveBegin(detector);
        }
    }

    private final void notifyOnMoveEndListeners(MoveGestureDetector detector) {
        Iterator<OnMoveListener> it = this.onMoveListeners.iterator();
        while (it.hasNext()) {
            it.next().onMoveEnd(detector);
        }
    }

    private final boolean notifyOnMoveListeners(MoveGestureDetector detector) {
        Iterator<OnMoveListener> it = this.onMoveListeners.iterator();
        while (it.hasNext()) {
            if (it.next().onMove(detector)) {
                return true;
            }
        }
        return false;
    }

    private final void notifyOnRotateBeginListeners(RotateGestureDetector detector) {
        Iterator<OnRotateListener> it = this.onRotateListeners.iterator();
        while (it.hasNext()) {
            it.next().onRotateBegin(detector);
        }
    }

    private final void notifyOnRotateEndListeners(RotateGestureDetector detector) {
        Iterator<OnRotateListener> it = this.onRotateListeners.iterator();
        while (it.hasNext()) {
            it.next().onRotateEnd(detector);
        }
    }

    private final void notifyOnRotateListeners(RotateGestureDetector detector) {
        Iterator<OnRotateListener> it = this.onRotateListeners.iterator();
        while (it.hasNext()) {
            it.next().onRotate(detector);
        }
    }

    private final void notifyOnScaleBeginListeners(StandardScaleGestureDetector detector) {
        Iterator<OnScaleListener> it = this.onScaleListeners.iterator();
        while (it.hasNext()) {
            it.next().onScaleBegin(detector);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyOnScaleEndListeners(StandardScaleGestureDetector detector) {
        Iterator<OnScaleListener> it = this.onScaleListeners.iterator();
        while (it.hasNext()) {
            it.next().onScaleEnd(detector);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyOnScaleListeners(StandardScaleGestureDetector detector) {
        Iterator<OnScaleListener> it = this.onScaleListeners.iterator();
        while (it.hasNext()) {
            it.next().onScale(detector);
        }
    }

    private final void notifyOnShoveBeginListeners(ShoveGestureDetector detector) {
        Iterator<OnShoveListener> it = this.onShoveListeners.iterator();
        while (it.hasNext()) {
            it.next().onShoveBegin(detector);
        }
    }

    private final void notifyOnShoveEndListeners(ShoveGestureDetector detector) {
        Iterator<OnShoveListener> it = this.onShoveListeners.iterator();
        while (it.hasNext()) {
            it.next().onShoveEnd(detector);
        }
    }

    private final void notifyOnShoveListeners(ShoveGestureDetector detector) {
        Iterator<OnShoveListener> it = this.onShoveListeners.iterator();
        while (it.hasNext()) {
            it.next().onShove(detector);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDelegateProvider$lambda$21(GesturesPluginImpl gesturesPluginImpl, EdgeInsets edgeInsets) {
        gesturesPluginImpl.getClass();
        edgeInsets.getClass();
        gesturesPluginImpl.cameraPaddingChanged = true;
    }

    private final void onRotateAnimationEnd(RotateGestureDetector detector) {
        CameraAnimationsPlugin cameraAnimationsPlugin = this.cameraAnimationsPlugin;
        if (cameraAnimationsPlugin == null) {
            s.m("cameraAnimationsPlugin");
            throw null;
        }
        cameraAnimationsPlugin.setAnchor(this.rotateCachedAnchor);
        notifyOnRotateListeners(detector);
    }

    private final void onScaleAnimationEnd(StandardScaleGestureDetector detector) {
        CameraAnimationsPlugin cameraAnimationsPlugin = this.cameraAnimationsPlugin;
        if (cameraAnimationsPlugin == null) {
            s.m("cameraAnimationsPlugin");
            throw null;
        }
        cameraAnimationsPlugin.setAnchor(this.scaleCachedAnchor);
        notifyOnScaleListeners(detector);
        this.spanSinceLast = Math.abs(detector.getCurrentSpan() - detector.getPreviousSpan());
    }

    private final void registerInteractions() {
        this.interactionsCancelableSet.add(getMapInteractionDelegate$plugin_gestures_release().addInteraction(ClickInteraction.INSTANCE.map(new C42271())));
        this.interactionsCancelableSet.add(getMapInteractionDelegate$plugin_gestures_release().addInteraction(LongClickInteraction.INSTANCE.map(new AnonymousClass2())));
        this.interactionsCancelableSet.add(getMapInteractionDelegate$plugin_gestures_release().addInteraction(DragInteraction.INSTANCE.invoke(new AnonymousClass3(), new AnonymousClass4(), new AnonymousClass5())));
    }

    private final void scheduleAnimators(ValueAnimator[] animators) {
        if (animators != null) {
            for (ValueAnimator valueAnimator : animators) {
                this.scheduledAnimators.add(valueAnimator);
            }
        }
        this.animationsTimeoutHandler.removeCallbacksAndMessages(null);
        this.animationsTimeoutHandler.postDelayed(new cd0.h0(this, 21), 150L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleAnimators$lambda$3(GesturesPluginImpl gesturesPluginImpl) {
        gesturesPluginImpl.getClass();
        gesturesPluginImpl.unregisterScheduledAnimators();
    }

    private final void unregisterInteractions() {
        Iterator<T> it = this.interactionsCancelableSet.iterator();
        while (it.hasNext()) {
            ((Cancelable) it.next()).cancel();
        }
        this.interactionsCancelableSet.clear();
    }

    private final Unit unregisterScheduledAnimators(ValueAnimator[] animators) {
        if (animators == null) {
            return null;
        }
        CameraAnimationsPlugin cameraAnimationsPlugin = this.cameraAnimationsPlugin;
        if (cameraAnimationsPlugin != null) {
            CameraAnimationsPlugin.DefaultImpls.unregisterAnimators$default(cameraAnimationsPlugin, (ValueAnimator[]) Arrays.copyOf(animators, animators.length), false, 2, null);
            return Unit.INSTANCE;
        }
        s.m("cameraAnimationsPlugin");
        throw null;
    }

    @Override // com.mapbox.maps.plugin.gestures.GesturesPlugin
    public void addOnFlingListener(OnFlingListener onFlingListener) {
        onFlingListener.getClass();
        this.onFlingListeners.add(onFlingListener);
    }

    @Override // com.mapbox.maps.plugin.gestures.GesturesPlugin
    public void addOnMapClickListener(OnMapClickListener onMapClickListener) {
        onMapClickListener.getClass();
        this.onMapClickListeners.add(onMapClickListener);
    }

    @Override // com.mapbox.maps.plugin.gestures.GesturesPlugin
    public void addOnMapLongClickListener(OnMapLongClickListener onMapLongClickListener) {
        onMapLongClickListener.getClass();
        this.onMapLongClickListeners.add(onMapLongClickListener);
    }

    @Override // com.mapbox.maps.plugin.gestures.GesturesPlugin
    public void addOnMoveListener(OnMoveListener onMoveListener) {
        onMoveListener.getClass();
        this.onMoveListeners.add(onMoveListener);
    }

    @Override // com.mapbox.maps.plugin.gestures.GesturesPlugin
    public void addOnRotateListener(OnRotateListener onRotateListener) {
        onRotateListener.getClass();
        this.onRotateListeners.add(onRotateListener);
    }

    @Override // com.mapbox.maps.plugin.gestures.GesturesPlugin
    public void addOnScaleListener(OnScaleListener onScaleListener) {
        onScaleListener.getClass();
        this.onScaleListeners.add(onScaleListener);
    }

    @Override // com.mapbox.maps.plugin.gestures.GesturesPlugin
    public void addOnShoveListener(OnShoveListener onShoveListener) {
        onShoveListener.getClass();
        this.onShoveListeners.add(onShoveListener);
    }

    @Override // com.mapbox.maps.plugin.gestures.GesturesPlugin
    public void addProtectedAnimationOwner(String owner) {
        owner.getClass();
        this.protectedCameraAnimatorOwners.add(owner);
    }

    public final void animateZoomOut$plugin_gestures_release(ScreenCoordinate zoomFocalPoint, boolean runImmediately) {
        zoomFocalPoint.getClass();
        handleZoomAnimation$plugin_gestures_release(false, zoomFocalPoint, runImmediately);
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsBase
    public void applySettings() {
    }

    @Override // com.mapbox.maps.plugin.ContextBinder
    public void bind(Context context, AttributeSet attrs, float pixelRatio) {
        context.getClass();
        bind$plugin_gestures_release(context, new AndroidGesturesManager(context), attrs, pixelRatio);
    }

    public final void bind$plugin_gestures_release(Context context, AndroidGesturesManager gesturesManager, AttributeSet attrs, float pixelRatio) {
        context.getClass();
        gesturesManager.getClass();
        this.gesturesManager = gesturesManager;
        this.gestureState = new GestureState(gesturesManager);
        this.pixelRatio = pixelRatio;
        setInternalSettings(GesturesAttributeParser.INSTANCE.parseGesturesSettings(context, attrs));
    }

    public final double calculateZoomBy$plugin_gestures_release(StandardScaleGestureDetector standardScaleGestureDetector) {
        standardScaleGestureDetector.getClass();
        return (Math.log(standardScaleGestureDetector.getScaleFactor()) / Math.log(1.5707963267948966d)) * 0.6499999761581421d * ((double) getInternalSettings().getZoomAnimationAmount());
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void cleanup() {
        this.style = null;
        unregisterInteractions();
        this.protectedCameraAnimatorOwners.clear();
        this.animationsTimeoutHandler.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: getDoubleTapRegistered$plugin_gestures_release, reason: from getter */
    public final boolean getDoubleTapRegistered() {
        return this.doubleTapRegistered;
    }

    @Override // com.mapbox.maps.plugin.gestures.GesturesPlugin
    public AndroidGesturesManager getGesturesManager() {
        AndroidGesturesManager androidGesturesManager = this.gesturesManager;
        if (androidGesturesManager != null) {
            return androidGesturesManager;
        }
        s.m("gesturesManager");
        throw null;
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsBase
    public GesturesSettings getInternalSettings() {
        return this.internalSettings;
    }

    public final MapInteractionDelegate getMapInteractionDelegate$plugin_gestures_release() {
        MapInteractionDelegate mapInteractionDelegate = this.mapInteractionDelegate;
        if (mapInteractionDelegate != null) {
            return mapInteractionDelegate;
        }
        s.m("mapInteractionDelegate");
        throw null;
    }

    public final MoveGestureListener getMoveGestureListener$plugin_gestures_release() {
        MoveGestureListener moveGestureListener = this.moveGestureListener;
        if (moveGestureListener != null) {
            return moveGestureListener;
        }
        s.m("moveGestureListener");
        throw null;
    }

    public final boolean handleClickEvent$plugin_gestures_release(ScreenCoordinate screenCoordinate) {
        screenCoordinate.getClass();
        if (this.onMapClickListeners.isEmpty()) {
            return false;
        }
        MapCameraManagerDelegate mapCameraManagerDelegate = this.mapCameraManagerDelegate;
        if (mapCameraManagerDelegate == null) {
            s.m("mapCameraManagerDelegate");
            throw null;
        }
        Point pointCoordinateForPixel = mapCameraManagerDelegate.coordinateForPixel(screenCoordinate);
        Iterator<OnMapClickListener> it = this.onMapClickListeners.iterator();
        while (it.hasNext()) {
            if (it.next().onMapClick(pointCoordinateForPixel)) {
                return true;
            }
        }
        return false;
    }

    public final boolean handleDoubleTapEvent$plugin_gestures_release(MotionEvent motionEvent, float doubleTapMovementThreshold) {
        motionEvent.getClass();
        if (motionEvent.getActionMasked() == 0) {
            this.doubleTapFocalPoint = GesturesPluginImplKt.toScreenCoordinate(motionEvent);
            GestureState gestureState = this.gestureState;
            if (gestureState == null) {
                s.m("gestureState");
                throw null;
            }
            gestureState.saveAndDisable(GestureState.Type.DoubleTap);
            this.doubleTapRegistered = true;
        }
        if (motionEvent.getActionMasked() == 1) {
            double dAbs = Math.abs(((double) motionEvent.getX()) - this.doubleTapFocalPoint.getX());
            double dAbs2 = Math.abs(((double) motionEvent.getY()) - this.doubleTapFocalPoint.getY());
            double d14 = doubleTapMovementThreshold;
            if (dAbs > d14 || dAbs2 > d14 || !getInternalSettings().getDoubleTapToZoomInEnabled()) {
                return false;
            }
            ScreenCoordinate focalPoint = getInternalSettings().getFocalPoint();
            if (focalPoint != null) {
                this.doubleTapFocalPoint = focalPoint;
            }
            animateZoomIn(this.doubleTapFocalPoint, false);
            return true;
        }
        return false;
    }

    public final boolean handleFlingEvent$plugin_gestures_release(MotionEvent e4, float velocityX, float velocityY) {
        double dExp;
        e4.getClass();
        if (!getInternalSettings().getScrollEnabled() || isPointAboveHorizon$plugin_gestures_release(GesturesPluginImplKt.toScreenCoordinate(e4))) {
            return false;
        }
        notifyOnFlingListeners();
        if (!getInternalSettings().getScrollDecelerationEnabled()) {
            return false;
        }
        float f14 = this.pixelRatio;
        double dHypot = Math.hypot(velocityX / f14, velocityY / f14);
        if (dHypot < 1000.0d) {
            return false;
        }
        MapCameraManagerDelegate mapCameraManagerDelegate = this.mapCameraManagerDelegate;
        if (mapCameraManagerDelegate == null) {
            s.m("mapCameraManagerDelegate");
            throw null;
        }
        double pitch = mapCameraManagerDelegate.getCameraState().getPitch();
        if (pitch < 60.0d) {
            dExp = pitch / 10.0d;
        } else if (60.0d > pitch || pitch > 85.0d) {
            dExp = 0.0d;
        } else {
            double dLog = Math.log(6.0d);
            dExp = Math.exp((((pitch - 60.0d) * (Math.log(300.0d) - dLog)) / 25.0d) + dLog);
        }
        double d14 = (dExp / ((double) f14)) + 10.0d;
        double d15 = GesturesUtils.isScrollHorizontallyLimited(getInternalSettings()) ? 0.0d : ((double) velocityX) / d14;
        double d16 = GesturesUtils.isScrollVerticallyLimited(getInternalSettings()) ? 0.0d : ((double) velocityY) / d14;
        CameraAnimationsPlugin cameraAnimationsPlugin = this.cameraAnimationsPlugin;
        if (cameraAnimationsPlugin == null) {
            s.m("cameraAnimationsPlugin");
            throw null;
        }
        cameraAnimationsPlugin.cancelAllAnimators(h0.b1(this.protectedCameraAnimatorOwners));
        long j8 = (long) (dHypot / d14);
        ScreenCoordinate screenCoordinate = new ScreenCoordinate(this.centerScreen.getX(), this.centerScreen.getY() * 2.0d);
        CameraAnimationsPlugin cameraAnimationsPlugin2 = this.cameraAnimationsPlugin;
        if (cameraAnimationsPlugin2 == null) {
            s.m("cameraAnimationsPlugin");
            throw null;
        }
        MapCameraManagerDelegate mapCameraManagerDelegate2 = this.mapCameraManagerDelegate;
        if (mapCameraManagerDelegate2 == null) {
            s.m("mapCameraManagerDelegate");
            throw null;
        }
        CameraOptions cameraOptionsCameraForDrag = mapCameraManagerDelegate2.cameraForDrag(screenCoordinate, new ScreenCoordinate(screenCoordinate.getX() + d15, screenCoordinate.getY() + d16));
        MapAnimationOptions.Companion companion = MapAnimationOptions.INSTANCE;
        MapAnimationOptions.Builder builder = new MapAnimationOptions.Builder();
        builder.owner(MapAnimationOwnerRegistry.GESTURES);
        builder.duration(j8);
        builder.interpolator(this.gesturesInterpolator);
        Unit unit = Unit.INSTANCE;
        MapAnimationOptions mapAnimationOptionsBuild = builder.build();
        CoreGesturesHandler coreGesturesHandler = this.coreGesturesHandler;
        if (coreGesturesHandler != null) {
            cameraAnimationsPlugin2.easeTo(cameraOptionsCameraForDrag, mapAnimationOptionsBuild, coreGesturesHandler.getCoreGestureAnimatorHandler());
            return true;
        }
        s.m("coreGesturesHandler");
        throw null;
    }

    public final void handleLongPressEvent$plugin_gestures_release(ScreenCoordinate screenCoordinate) {
        screenCoordinate.getClass();
        if (this.onMapLongClickListeners.isEmpty()) {
            return;
        }
        MapCameraManagerDelegate mapCameraManagerDelegate = this.mapCameraManagerDelegate;
        if (mapCameraManagerDelegate == null) {
            s.m("mapCameraManagerDelegate");
            throw null;
        }
        Point pointCoordinateForPixel = mapCameraManagerDelegate.coordinateForPixel(screenCoordinate);
        Iterator<OnMapLongClickListener> it = this.onMapLongClickListeners.iterator();
        while (it.hasNext() && !it.next().onMapLongClick(pointCoordinateForPixel)) {
        }
    }

    public final void handleMove$plugin_gestures_release(ScreenCoordinate targetScreenCoordinate) {
        targetScreenCoordinate.getClass();
        MoveGestureDetector detector = getMoveGestureListener$plugin_gestures_release().getDetector();
        if (notifyOnMoveListeners(detector)) {
            return;
        }
        PointF focalPoint = detector.getFocalPoint();
        double d14 = focalPoint.x;
        double d15 = focalPoint.y;
        CoreGesturesHandler coreGesturesHandler = this.coreGesturesHandler;
        if (coreGesturesHandler == null) {
            s.m("coreGesturesHandler");
            throw null;
        }
        coreGesturesHandler.notifyCoreGestureStarted();
        MapCameraManagerDelegate mapCameraManagerDelegate = this.mapCameraManagerDelegate;
        if (mapCameraManagerDelegate == null) {
            s.m("mapCameraManagerDelegate");
            throw null;
        }
        CameraOptions cameraOptionsCameraForDrag = mapCameraManagerDelegate.cameraForDrag(new ScreenCoordinate(d14, d15), targetScreenCoordinate);
        CameraAnimationsPlugin cameraAnimationsPlugin = this.cameraAnimationsPlugin;
        if (cameraAnimationsPlugin != null) {
            CameraAnimationsPlugin.DefaultImpls.easeTo$default(cameraAnimationsPlugin, cameraOptionsCameraForDrag, IMMEDIATE_ANIMATION_OPTIONS, null, 4, null);
        } else {
            s.m("cameraAnimationsPlugin");
            throw null;
        }
    }

    public final void handleMoveEnd$plugin_gestures_release() {
        notifyOnMoveEndListeners(getMoveGestureListener$plugin_gestures_release().getDetector());
    }

    public final void handleMoveStartEvent$plugin_gestures_release() {
        cancelTransitionsIfRequired();
        notifyOnMoveBeginListeners(getMoveGestureListener$plugin_gestures_release().getDetector());
    }

    public final boolean handleRotate$plugin_gestures_release(RotateGestureDetector detector, float rotationDegreesSinceLast) {
        detector.getClass();
        MapCameraManagerDelegate mapCameraManagerDelegate = this.mapCameraManagerDelegate;
        if (mapCameraManagerDelegate == null) {
            s.m("mapCameraManagerDelegate");
            throw null;
        }
        double bearing = mapCameraManagerDelegate.getCameraState().getBearing();
        CameraAnimationsPlugin cameraAnimationsPlugin = this.cameraAnimationsPlugin;
        if (cameraAnimationsPlugin == null) {
            s.m("cameraAnimationsPlugin");
            throw null;
        }
        this.rotateCachedAnchor = cameraAnimationsPlugin.getAnchor();
        double d14 = bearing + ((double) rotationDegreesSinceLast);
        ScreenCoordinate rotateFocalPoint = getRotateFocalPoint(detector);
        CoreGesturesHandler coreGesturesHandler = this.coreGesturesHandler;
        if (coreGesturesHandler == null) {
            s.m("coreGesturesHandler");
            throw null;
        }
        coreGesturesHandler.notifyCoreGestureStarted();
        boolean simultaneousRotateAndPinchToZoomEnabled = getInternalSettings().getSimultaneousRotateAndPinchToZoomEnabled();
        CameraAnimationsPlugin cameraAnimationsPlugin2 = this.cameraAnimationsPlugin;
        if (simultaneousRotateAndPinchToZoomEnabled) {
            if (cameraAnimationsPlugin2 == null) {
                s.m("cameraAnimationsPlugin");
                throw null;
            }
            CameraAnimatorOptions.Companion companion = CameraAnimatorOptions.INSTANCE;
            CameraAnimatorOptions.Builder builder = new CameraAnimatorOptions.Builder(Arrays.copyOf(new Double[]{Double.valueOf(d14)}, 1));
            builder.owner(MapAnimationOwnerRegistry.GESTURES);
            ValueAnimator valueAnimatorCreateBearingAnimator$default = CameraAnimationsPlugin.DefaultImpls.createBearingAnimator$default(cameraAnimationsPlugin2, builder.build(), false, GesturesPluginImpl$handleRotate$bearingAnimator$2.INSTANCE, 2, null);
            CameraAnimationsPlugin cameraAnimationsPlugin3 = this.cameraAnimationsPlugin;
            if (cameraAnimationsPlugin3 == null) {
                s.m("cameraAnimationsPlugin");
                throw null;
            }
            CameraAnimatorOptions.Builder builder2 = new CameraAnimatorOptions.Builder(Arrays.copyOf(new ScreenCoordinate[]{rotateFocalPoint}, 1));
            builder2.owner(MapAnimationOwnerRegistry.GESTURES);
            ValueAnimator valueAnimatorCreateAnchorAnimator = cameraAnimationsPlugin3.createAnchorAnimator(builder2.build(), GesturesPluginImpl$handleRotate$anchorAnimator$2.INSTANCE);
            CameraAnimationsPlugin cameraAnimationsPlugin4 = this.cameraAnimationsPlugin;
            if (cameraAnimationsPlugin4 == null) {
                s.m("cameraAnimationsPlugin");
                throw null;
            }
            cameraAnimationsPlugin4.playAnimatorsTogether(valueAnimatorCreateAnchorAnimator, valueAnimatorCreateBearingAnimator$default);
        } else {
            if (cameraAnimationsPlugin2 == null) {
                s.m("cameraAnimationsPlugin");
                throw null;
            }
            CameraOptions cameraOptionsBuild = new CameraOptions.Builder().anchor(rotateFocalPoint).bearing(Double.valueOf(d14)).build();
            cameraOptionsBuild.getClass();
            CameraAnimationsPlugin.DefaultImpls.easeTo$default(cameraAnimationsPlugin2, cameraOptionsBuild, IMMEDIATE_ANIMATION_OPTIONS, null, 4, null);
        }
        onRotateAnimationEnd(detector);
        return true;
    }

    public final boolean handleRotateBegin$plugin_gestures_release(RotateGestureDetector detector) {
        detector.getClass();
        if (!getInternalSettings().getRotateEnabled()) {
            return false;
        }
        float fAbs = Math.abs(detector.getDeltaSinceLast());
        double eventTime = detector.getCurrentEvent().getEventTime();
        double eventTime2 = detector.getPreviousEvent().getEventTime();
        if (eventTime == eventTime2) {
            return false;
        }
        double d14 = ((double) fAbs) / (eventTime - eventTime2);
        float fAbs2 = Math.abs(detector.getDeltaSinceStart());
        if (d14 >= 0.04d && ((d14 <= 0.07d || fAbs2 >= 5.0f) && ((d14 <= 0.15d || fAbs2 >= 7.0f) && (d14 <= 0.5d || fAbs2 >= 15.0f)))) {
            AndroidGesturesManager androidGesturesManager = this.gesturesManager;
            if (androidGesturesManager == null) {
                s.m("gesturesManager");
                throw null;
            }
            if (!androidGesturesManager.getStandardScaleGestureDetector().isInProgress() || fAbs2 >= 16.0f) {
                if (getInternalSettings().getIncreasePinchToZoomThresholdWhenRotating()) {
                    AndroidGesturesManager androidGesturesManager2 = this.gesturesManager;
                    if (androidGesturesManager2 == null) {
                        s.m("gesturesManager");
                        throw null;
                    }
                    androidGesturesManager2.getStandardScaleGestureDetector().setSpanSinceStartThreshold(this.minimumScaleSpanWhenRotating);
                    AndroidGesturesManager androidGesturesManager3 = this.gesturesManager;
                    if (androidGesturesManager3 == null) {
                        s.m("gesturesManager");
                        throw null;
                    }
                    androidGesturesManager3.getStandardScaleGestureDetector().interrupt();
                }
                cancelTransitionsIfRequired();
                notifyOnRotateBeginListeners(detector);
                return true;
            }
        }
        return false;
    }

    public final void handleRotateEnd$plugin_gestures_release(RotateGestureDetector detector, float velocityX, float velocityY, float angularVelocityEvent) {
        detector.getClass();
        if (getInternalSettings().getIncreasePinchToZoomThresholdWhenRotating()) {
            AndroidGesturesManager androidGesturesManager = this.gesturesManager;
            if (androidGesturesManager == null) {
                s.m("gesturesManager");
                throw null;
            }
            androidGesturesManager.getStandardScaleGestureDetector().setSpanSinceStartThreshold(this.defaultSpanSinceStartThreshold);
        }
        notifyOnRotateEndListeners(detector);
        float fClamp = clamp(angularVelocityEvent * this.angularVelocityMultiplier, -30.0f, 30.0f);
        double dAbs = Math.abs(detector.getDeltaSinceLast()) / (Math.abs(velocityY) + Math.abs(velocityX));
        if (!getInternalSettings().getRotateDecelerationEnabled() || Math.abs(fClamp) < this.minimumAngularVelocity) {
            return;
        }
        AndroidGesturesManager androidGesturesManager2 = this.gesturesManager;
        if (androidGesturesManager2 == null) {
            s.m("gesturesManager");
            throw null;
        }
        if (!androidGesturesManager2.getStandardScaleGestureDetector().isInProgress() || dAbs >= this.rotateVelocityRatioThreshold) {
            ValueAnimator[] valueAnimatorArrCreateRotateAnimators = createRotateAnimators(fClamp, (long) ((Math.log((((double) 1) / Math.pow(2.718281828459045d, 2.0d)) + ((double) Math.abs(fClamp))) + ((double) 2)) * 150.0d), getRotateFocalPoint(detector));
            this.rotateAnimators = valueAnimatorArrCreateRotateAnimators;
            scheduleAnimators(valueAnimatorArrCreateRotateAnimators);
        }
    }

    public final boolean handleScale$plugin_gestures_release(StandardScaleGestureDetector detector) {
        detector.getClass();
        ScreenCoordinate scaleFocalPoint = getScaleFocalPoint(detector);
        CameraAnimationsPlugin cameraAnimationsPlugin = this.cameraAnimationsPlugin;
        if (cameraAnimationsPlugin == null) {
            s.m("cameraAnimationsPlugin");
            throw null;
        }
        this.scaleCachedAnchor = cameraAnimationsPlugin.getAnchor();
        CoreGesturesHandler coreGesturesHandler = this.coreGesturesHandler;
        if (coreGesturesHandler == null) {
            s.m("coreGesturesHandler");
            throw null;
        }
        coreGesturesHandler.notifyCoreGestureStarted();
        if (this.quickZoom) {
            double dAbs = Math.abs(((double) detector.getCurrentEvent().getY()) - this.doubleTapFocalPoint.getY());
            boolean z14 = ((double) detector.getCurrentEvent().getY()) < this.doubleTapFocalPoint.getY();
            double dNormalize = normalize(0.0d, dAbs, 0.0d, this.screenHeight, 4.0d);
            double d14 = this.startZoom;
            double zoomAnimationAmount = (z14 ? d14 - dNormalize : d14 + dNormalize) * ((double) getInternalSettings().getZoomAnimationAmount());
            CameraAnimationsPlugin cameraAnimationsPlugin2 = this.cameraAnimationsPlugin;
            if (cameraAnimationsPlugin2 == null) {
                s.m("cameraAnimationsPlugin");
                throw null;
            }
            CameraOptions cameraOptionsBuild = new CameraOptions.Builder().zoom(Double.valueOf(zoomAnimationAmount)).anchor(scaleFocalPoint).build();
            cameraOptionsBuild.getClass();
            CameraAnimationsPlugin.DefaultImpls.easeTo$default(cameraAnimationsPlugin2, cameraOptionsBuild, IMMEDIATE_ANIMATION_OPTIONS, null, 4, null);
        } else {
            double dCalculateZoomBy$plugin_gestures_release = calculateZoomBy$plugin_gestures_release(detector);
            boolean simultaneousRotateAndPinchToZoomEnabled = getInternalSettings().getSimultaneousRotateAndPinchToZoomEnabled();
            CameraAnimationsPlugin cameraAnimationsPlugin3 = this.cameraAnimationsPlugin;
            if (simultaneousRotateAndPinchToZoomEnabled) {
                if (cameraAnimationsPlugin3 == null) {
                    s.m("cameraAnimationsPlugin");
                    throw null;
                }
                CameraAnimatorOptions.Companion companion = CameraAnimatorOptions.INSTANCE;
                MapCameraManagerDelegate mapCameraManagerDelegate = this.mapCameraManagerDelegate;
                if (mapCameraManagerDelegate == null) {
                    s.m("mapCameraManagerDelegate");
                    throw null;
                }
                CameraAnimatorOptions.Builder builder = new CameraAnimatorOptions.Builder(Arrays.copyOf(new Double[]{Double.valueOf(mapCameraManagerDelegate.getCameraState().getZoom() + dCalculateZoomBy$plugin_gestures_release)}, 1));
                MapCameraManagerDelegate mapCameraManagerDelegate2 = this.mapCameraManagerDelegate;
                if (mapCameraManagerDelegate2 == null) {
                    s.m("mapCameraManagerDelegate");
                    throw null;
                }
                builder.startValue(Double.valueOf(mapCameraManagerDelegate2.getCameraState().getZoom()));
                builder.owner(MapAnimationOwnerRegistry.GESTURES);
                ValueAnimator valueAnimatorCreateZoomAnimator = cameraAnimationsPlugin3.createZoomAnimator(builder.build(), GesturesPluginImpl$handleScale$zoomAnimator$2.INSTANCE);
                CameraAnimationsPlugin cameraAnimationsPlugin4 = this.cameraAnimationsPlugin;
                if (cameraAnimationsPlugin4 == null) {
                    s.m("cameraAnimationsPlugin");
                    throw null;
                }
                CameraAnimatorOptions.Builder builder2 = new CameraAnimatorOptions.Builder(Arrays.copyOf(new ScreenCoordinate[]{scaleFocalPoint}, 1));
                builder2.owner(MapAnimationOwnerRegistry.GESTURES);
                ValueAnimator valueAnimatorCreateAnchorAnimator = cameraAnimationsPlugin4.createAnchorAnimator(builder2.build(), GesturesPluginImpl$handleScale$anchorAnimator$2.INSTANCE);
                CameraAnimationsPlugin cameraAnimationsPlugin5 = this.cameraAnimationsPlugin;
                if (cameraAnimationsPlugin5 == null) {
                    s.m("cameraAnimationsPlugin");
                    throw null;
                }
                cameraAnimationsPlugin5.playAnimatorsTogether(valueAnimatorCreateAnchorAnimator, valueAnimatorCreateZoomAnimator);
            } else {
                if (cameraAnimationsPlugin3 == null) {
                    s.m("cameraAnimationsPlugin");
                    throw null;
                }
                CameraOptions.Builder builder3 = new CameraOptions.Builder();
                MapCameraManagerDelegate mapCameraManagerDelegate3 = this.mapCameraManagerDelegate;
                if (mapCameraManagerDelegate3 == null) {
                    s.m("mapCameraManagerDelegate");
                    throw null;
                }
                CameraOptions cameraOptionsBuild2 = builder3.zoom(Double.valueOf(mapCameraManagerDelegate3.getCameraState().getZoom() + dCalculateZoomBy$plugin_gestures_release)).anchor(scaleFocalPoint).build();
                cameraOptionsBuild2.getClass();
                CameraAnimationsPlugin.DefaultImpls.easeTo$default(cameraAnimationsPlugin3, cameraOptionsBuild2, IMMEDIATE_ANIMATION_OPTIONS, null, 4, null);
            }
        }
        onScaleAnimationEnd(detector);
        return true;
    }

    public final boolean handleScaleBegin$plugin_gestures_release(StandardScaleGestureDetector detector) {
        detector.getClass();
        boolean z14 = detector.getPointersCount() == 1;
        this.quickZoom = z14;
        if (z14) {
            if (!getInternalSettings().getQuickZoomEnabled()) {
                return false;
            }
            GestureState gestureState = this.gestureState;
            if (gestureState == null) {
                s.m("gestureState");
                throw null;
            }
            gestureState.saveAndDisable(GestureState.Type.ScaleQuickZoom);
        } else {
            if (!getInternalSettings().getPinchToZoomEnabled() || detector.getPreviousSpan() <= 0.0f) {
                return false;
            }
            float currentSpan = detector.getCurrentSpan();
            float previousSpan = detector.getPreviousSpan();
            double eventTime = detector.getCurrentEvent().getEventTime();
            double eventTime2 = detector.getPreviousEvent().getEventTime();
            if (eventTime == eventTime2) {
                return false;
            }
            double dAbs = ((double) Math.abs(currentSpan - previousSpan)) / (eventTime - eventTime2);
            if (dAbs < this.minimumGestureSpeed) {
                return false;
            }
            AndroidGesturesManager androidGesturesManager = this.gesturesManager;
            if (androidGesturesManager == null) {
                s.m("gesturesManager");
                throw null;
            }
            if (!androidGesturesManager.getRotateGestureDetector().isInProgress()) {
                AndroidGesturesManager androidGesturesManager2 = this.gesturesManager;
                if (androidGesturesManager2 == null) {
                    s.m("gesturesManager");
                    throw null;
                }
                if (Math.abs(androidGesturesManager2.getRotateGestureDetector().getDeltaSinceLast()) > 0.4d && dAbs < this.minimumAngledGestureSpeed) {
                    return false;
                }
                if (!getInternalSettings().getSimultaneousRotateAndPinchToZoomEnabled()) {
                    GestureState gestureState2 = this.gestureState;
                    if (gestureState2 == null) {
                        s.m("gestureState");
                        throw null;
                    }
                    gestureState2.saveAndDisable(GestureState.Type.Scale);
                }
            }
        }
        this.screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;
        MapCameraManagerDelegate mapCameraManagerDelegate = this.mapCameraManagerDelegate;
        if (mapCameraManagerDelegate == null) {
            s.m("mapCameraManagerDelegate");
            throw null;
        }
        this.startZoom = mapCameraManagerDelegate.getCameraState().getZoom();
        cancelTransitionsIfRequired();
        notifyOnScaleBeginListeners(detector);
        this.spanSinceLast = Math.abs(detector.getCurrentSpan() - detector.getPreviousSpan());
        return true;
    }

    public final void handleScaleEnd$plugin_gestures_release(StandardScaleGestureDetector detector, float velocityX, float velocityY) {
        detector.getClass();
        GestureState gestureState = this.gestureState;
        if (gestureState == null) {
            s.m("gestureState");
            throw null;
        }
        gestureState.restore(this.quickZoom ? GestureState.Type.ScaleQuickZoom : GestureState.Type.Scale);
        notifyOnScaleEndListeners(detector);
        float fAbs = Math.abs(velocityY) + Math.abs(velocityX);
        if (!getInternalSettings().getPinchToZoomDecelerationEnabled() || fAbs < this.minimumVelocity || this.spanSinceLast / fAbs < this.scaleVelocityRatioThreshold) {
            return;
        }
        double dCalculateScale = calculateScale(fAbs, detector.isScalingOut());
        MapCameraManagerDelegate mapCameraManagerDelegate = this.mapCameraManagerDelegate;
        if (mapCameraManagerDelegate == null) {
            s.m("mapCameraManagerDelegate");
            throw null;
        }
        ValueAnimator[] valueAnimatorArrCreateScaleAnimators = createScaleAnimators(mapCameraManagerDelegate.getCameraState().getZoom(), dCalculateScale, getScaleFocalPoint(detector), (long) ((Math.log((((double) 1) / Math.pow(2.718281828459045d, 2.0d)) + Math.abs(dCalculateScale)) + ((double) 2)) * 150.0d));
        this.scaleAnimators = valueAnimatorArrCreateScaleAnimators;
        scheduleAnimators(valueAnimatorArrCreateScaleAnimators);
    }

    public final boolean handleShove$plugin_gestures_release(ShoveGestureDetector detector, float deltaPixelsSinceLast) {
        detector.getClass();
        MapCameraManagerDelegate mapCameraManagerDelegate = this.mapCameraManagerDelegate;
        if (mapCameraManagerDelegate == null) {
            s.m("mapCameraManagerDelegate");
            throw null;
        }
        double dClamp = clamp(mapCameraManagerDelegate.getCameraState().getPitch() - ((double) (0.1f * deltaPixelsSinceLast)), 0.0d, 85.0d);
        if (this.cameraPaddingChanged || this.sizeChanged) {
            MapCameraManagerDelegate mapCameraManagerDelegate2 = this.mapCameraManagerDelegate;
            if (mapCameraManagerDelegate2 == null) {
                s.m("mapCameraManagerDelegate");
                throw null;
            }
            if (mapCameraManagerDelegate2 == null) {
                s.m("mapCameraManagerDelegate");
                throw null;
            }
            Point center = mapCameraManagerDelegate2.getCameraState().getCenter();
            center.getClass();
            this.cameraCenterScreenCoordinate = mapCameraManagerDelegate2.pixelForCoordinate(center);
            this.cameraPaddingChanged = false;
            this.sizeChanged = false;
        }
        CoreGesturesHandler coreGesturesHandler = this.coreGesturesHandler;
        if (coreGesturesHandler == null) {
            s.m("coreGesturesHandler");
            throw null;
        }
        coreGesturesHandler.notifyCoreGestureStarted();
        CameraAnimationsPlugin cameraAnimationsPlugin = this.cameraAnimationsPlugin;
        if (cameraAnimationsPlugin == null) {
            s.m("cameraAnimationsPlugin");
            throw null;
        }
        CameraOptions cameraOptionsBuild = new CameraOptions.Builder().anchor(this.cameraCenterScreenCoordinate).pitch(Double.valueOf(dClamp)).build();
        cameraOptionsBuild.getClass();
        CameraAnimationsPlugin.DefaultImpls.easeTo$default(cameraAnimationsPlugin, cameraOptionsBuild, IMMEDIATE_ANIMATION_OPTIONS, null, 4, null);
        notifyOnShoveListeners(detector);
        return true;
    }

    public final boolean handleShoveBegin$plugin_gestures_release(ShoveGestureDetector detector) {
        detector.getClass();
        if (!getInternalSettings().getPitchEnabled()) {
            return false;
        }
        cancelTransitionsIfRequired();
        GestureState gestureState = this.gestureState;
        if (gestureState == null) {
            s.m("gestureState");
            throw null;
        }
        gestureState.saveAndDisable(GestureState.Type.Shove);
        notifyOnShoveBeginListeners(detector);
        return true;
    }

    public final void handleShoveEnd$plugin_gestures_release(ShoveGestureDetector detector) {
        detector.getClass();
        GestureState gestureState = this.gestureState;
        if (gestureState == null) {
            s.m("gestureState");
            throw null;
        }
        gestureState.restore(GestureState.Type.Shove);
        notifyOnShoveEndListeners(detector);
    }

    public final boolean handleSingleTapUpEvent$plugin_gestures_release() {
        CameraAnimationsPlugin cameraAnimationsPlugin = this.cameraAnimationsPlugin;
        if (cameraAnimationsPlugin != null) {
            cameraAnimationsPlugin.cancelAllAnimators(h0.b1(this.protectedCameraAnimatorOwners));
            return true;
        }
        s.m("cameraAnimationsPlugin");
        throw null;
    }

    public final void handleZoomAnimation$plugin_gestures_release(boolean zoomIn, ScreenCoordinate zoomFocalPoint, boolean runImmediately) {
        zoomFocalPoint.getClass();
        unregisterScheduledAnimators(this.scaleAnimators);
        AndroidGesturesManager androidGesturesManager = this.gesturesManager;
        if (androidGesturesManager == null) {
            s.m("gesturesManager");
            throw null;
        }
        StandardScaleGestureDetector standardScaleGestureDetector = androidGesturesManager.getStandardScaleGestureDetector();
        standardScaleGestureDetector.getClass();
        notifyOnScaleBeginListeners(standardScaleGestureDetector);
        MapCameraManagerDelegate mapCameraManagerDelegate = this.mapCameraManagerDelegate;
        if (mapCameraManagerDelegate == null) {
            s.m("mapCameraManagerDelegate");
            throw null;
        }
        ValueAnimator[] valueAnimatorArrCreateScaleAnimators = createScaleAnimators(mapCameraManagerDelegate.getCameraState().getZoom(), zoomIn ? 1 : -1, zoomFocalPoint, 300L);
        this.scaleAnimators = valueAnimatorArrCreateScaleAnimators;
        if (!runImmediately) {
            scheduleAnimators(valueAnimatorArrCreateScaleAnimators);
            return;
        }
        for (ValueAnimator valueAnimator : valueAnimatorArrCreateScaleAnimators) {
            valueAnimator.start();
        }
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void initialize() {
        AndroidGesturesManager androidGesturesManager = this.gesturesManager;
        if (androidGesturesManager == null) {
            s.m("gesturesManager");
            throw null;
        }
        initializeGesturesManager(androidGesturesManager, true);
        initializeGestureListeners(this.context, true);
    }

    public final boolean isPointAboveHorizon$plugin_gestures_release(ScreenCoordinate pixel) {
        String upperCase;
        pixel.getClass();
        MapboxStyleManager mapboxStyleManager = this.style;
        StylePropertyValue styleProjectionProperty = mapboxStyleManager != null ? mapboxStyleManager.getStyleProjectionProperty("name") : null;
        if (styleProjectionProperty == null) {
            return false;
        }
        if (styleProjectionProperty.getKind() == StylePropertyValueKind.UNDEFINED) {
            upperCase = "MERCATOR";
        } else {
            Object contents = styleProjectionProperty.getValue().getContents();
            contents.getClass();
            upperCase = ((String) contents).toUpperCase(Locale.ROOT);
            upperCase.getClass();
        }
        if (!upperCase.equals("MERCATOR")) {
            return false;
        }
        MapTransformDelegate mapTransformDelegate = this.mapTransformDelegate;
        if (mapTransformDelegate == null) {
            s.m("mapTransformDelegate");
            throw null;
        }
        double height = 0.04d * ((double) mapTransformDelegate.getSize().getHeight());
        double dMin = Math.min(10.0d, height / ((double) 2));
        double x14 = pixel.getX();
        double d14 = 0.0d;
        if (Double.isNaN(x14)) {
            MapboxLogger.logE(TAG, "isPointAboveHorizon: screen coordinate x is NaN.");
            x14 = 0.0d;
        }
        double y14 = pixel.getY();
        if (Double.isNaN(y14)) {
            MapboxLogger.logE(TAG, "isPointAboveHorizon: screen coordinate y is NaN.");
        } else {
            d14 = y14;
        }
        ScreenCoordinate screenCoordinate = new ScreenCoordinate(x14, d14 - height);
        MapCameraManagerDelegate mapCameraManagerDelegate = this.mapCameraManagerDelegate;
        if (mapCameraManagerDelegate == null) {
            s.m("mapCameraManagerDelegate");
            throw null;
        }
        Point pointCoordinateForPixel = mapCameraManagerDelegate.coordinateForPixel(screenCoordinate);
        MapCameraManagerDelegate mapCameraManagerDelegate2 = this.mapCameraManagerDelegate;
        if (mapCameraManagerDelegate2 != null) {
            return mapCameraManagerDelegate2.pixelForCoordinate(pointCoordinateForPixel).getY() >= screenCoordinate.getY() + dMin;
        }
        s.m("mapCameraManagerDelegate");
        throw null;
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void onDelegateProvider(MapDelegateProvider delegateProvider) throws InvalidPluginConfigurationException {
        delegateProvider.getClass();
        delegateProvider.getStyle(new AnonymousClass1());
        this.mapTransformDelegate = delegateProvider.getMapTransformDelegate();
        this.mapCameraManagerDelegate = delegateProvider.getMapCameraManagerDelegate();
        this.mapProjectionDelegate = delegateProvider.getMapProjectionDelegate();
        setMapInteractionDelegate$plugin_gestures_release(delegateProvider.getMapInteractionDelegate());
        this.mapPluginProviderDelegate = delegateProvider.getMapPluginProviderDelegate();
        CameraAnimationsPlugin cameraAnimationsPlugin = (CameraAnimationsPlugin) delegateProvider.getMapPluginProviderDelegate().getPlugin(Plugin.MAPBOX_CAMERA_PLUGIN_ID);
        if (cameraAnimationsPlugin == null) {
            throw new InvalidPluginConfigurationException("Can't look up an instance of plugin, is it available on the clazz path and loaded through the map?");
        }
        this.cameraAnimationsPlugin = cameraAnimationsPlugin;
        cameraAnimationsPlugin.addCameraPaddingChangeListener(new CameraAnimatorChangeListener() { // from class: com.mapbox.maps.plugin.gestures.a
            @Override // com.mapbox.maps.plugin.animation.CameraAnimatorChangeListener
            public final void onChanged(Object obj) {
                GesturesPluginImpl.onDelegateProvider$lambda$21(this.f54562a, (EdgeInsets) obj);
            }
        });
        MapTransformDelegate mapTransformDelegate = this.mapTransformDelegate;
        if (mapTransformDelegate == null) {
            s.m("mapTransformDelegate");
            throw null;
        }
        MapCameraManagerDelegate mapCameraManagerDelegate = this.mapCameraManagerDelegate;
        if (mapCameraManagerDelegate != null) {
            this.coreGesturesHandler = new CoreGesturesHandler(mapTransformDelegate, mapCameraManagerDelegate);
        } else {
            s.m("mapCameraManagerDelegate");
            throw null;
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.GesturesPlugin
    public boolean onGenericMotionEvent(MotionEvent event) {
        event.getClass();
        if ((event.getSource() & 2) != 2 || event.getActionMasked() != 8 || !getInternalSettings().getPinchToZoomEnabled()) {
            return false;
        }
        CameraAnimationsPlugin cameraAnimationsPlugin = this.cameraAnimationsPlugin;
        if (cameraAnimationsPlugin == null) {
            s.m("cameraAnimationsPlugin");
            throw null;
        }
        cameraAnimationsPlugin.cancelAllAnimators(h0.b1(this.protectedCameraAnimatorOwners));
        float axisValue = event.getAxisValue(9);
        MapCameraManagerDelegate mapCameraManagerDelegate = this.mapCameraManagerDelegate;
        if (mapCameraManagerDelegate == null) {
            s.m("mapCameraManagerDelegate");
            throw null;
        }
        double zoom = mapCameraManagerDelegate.getCameraState().getZoom();
        CameraAnimationsPlugin cameraAnimationsPlugin2 = this.cameraAnimationsPlugin;
        if (cameraAnimationsPlugin2 == null) {
            s.m("cameraAnimationsPlugin");
            throw null;
        }
        ScreenCoordinate anchor = cameraAnimationsPlugin2.getAnchor();
        ScreenCoordinate screenCoordinate = GesturesPluginImplKt.toScreenCoordinate(event);
        CameraAnimationsPlugin cameraAnimationsPlugin3 = this.cameraAnimationsPlugin;
        if (cameraAnimationsPlugin3 == null) {
            s.m("cameraAnimationsPlugin");
            throw null;
        }
        double dCalculateScaleBy = cameraAnimationsPlugin3.calculateScaleBy(axisValue, zoom);
        CameraAnimationsPlugin cameraAnimationsPlugin4 = this.cameraAnimationsPlugin;
        if (cameraAnimationsPlugin4 == null) {
            s.m("cameraAnimationsPlugin");
            throw null;
        }
        CameraOptions cameraOptionsBuild = new CameraOptions.Builder().anchor(screenCoordinate).zoom(Double.valueOf(dCalculateScaleBy)).build();
        cameraOptionsBuild.getClass();
        CameraAnimationsPlugin.DefaultImpls.easeTo$default(cameraAnimationsPlugin4, cameraOptionsBuild, IMMEDIATE_ANIMATION_OPTIONS, null, 4, null);
        CameraAnimationsPlugin cameraAnimationsPlugin5 = this.cameraAnimationsPlugin;
        if (cameraAnimationsPlugin5 != null) {
            cameraAnimationsPlugin5.setAnchor(anchor);
            return true;
        }
        s.m("cameraAnimationsPlugin");
        throw null;
    }

    @Override // com.mapbox.maps.plugin.MapSizePlugin
    public void onSizeChanged(int width, int height) {
        this.centerScreen = new ScreenCoordinate(width / 2, height / 2);
        this.sizeChanged = true;
    }

    @Override // com.mapbox.maps.plugin.MapStyleObserverPlugin
    public void onStyleChanged(MapboxStyleManager style) {
        style.getClass();
        this.style = style;
    }

    @Override // com.mapbox.maps.plugin.gestures.GesturesPlugin
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        if (motionEvent.getButtonState() != 0 && motionEvent.getButtonState() != 1) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            unregisterScheduledAnimators();
        }
        AndroidGesturesManager androidGesturesManager = this.gesturesManager;
        if (androidGesturesManager == null) {
            s.m("gesturesManager");
            throw null;
        }
        boolean zOnTouchEvent = androidGesturesManager.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            doubleTapFinished();
            CoreGesturesHandler coreGesturesHandler = this.coreGesturesHandler;
            if (coreGesturesHandler == null) {
                s.m("coreGesturesHandler");
                throw null;
            }
            coreGesturesHandler.notifyCoreTouchEnded();
            if (!this.scheduledAnimators.isEmpty()) {
                this.animationsTimeoutHandler.removeCallbacksAndMessages(null);
                CameraAnimationsPlugin cameraAnimationsPlugin = this.cameraAnimationsPlugin;
                if (cameraAnimationsPlugin == null) {
                    s.m("cameraAnimationsPlugin");
                    throw null;
                }
                Object[] array = this.scheduledAnimators.toArray(new ValueAnimator[0]);
                array.getClass();
                ValueAnimator[] valueAnimatorArr = (ValueAnimator[]) array;
                cameraAnimationsPlugin.registerAnimators((ValueAnimator[]) Arrays.copyOf(valueAnimatorArr, valueAnimatorArr.length));
                Iterator<ValueAnimator> it = this.scheduledAnimators.iterator();
                while (it.hasNext()) {
                    it.next().start();
                }
                this.scheduledAnimators.clear();
                return zOnTouchEvent;
            }
        } else {
            if (actionMasked == 3) {
                this.scheduledAnimators.clear();
                CoreGesturesHandler coreGesturesHandler2 = this.coreGesturesHandler;
                if (coreGesturesHandler2 == null) {
                    s.m("coreGesturesHandler");
                    throw null;
                }
                coreGesturesHandler2.notifyCoreTouchEnded();
                doubleTapFinished();
                return zOnTouchEvent;
            }
            if (actionMasked == 5) {
                doubleTapFinished();
                return zOnTouchEvent;
            }
        }
        return zOnTouchEvent;
    }

    @Override // com.mapbox.maps.plugin.gestures.GesturesPlugin
    public void removeOnFlingListener(OnFlingListener onFlingListener) {
        onFlingListener.getClass();
        this.onFlingListeners.remove(onFlingListener);
    }

    @Override // com.mapbox.maps.plugin.gestures.GesturesPlugin
    public void removeOnMapClickListener(OnMapClickListener onMapClickListener) {
        onMapClickListener.getClass();
        this.onMapClickListeners.remove(onMapClickListener);
    }

    @Override // com.mapbox.maps.plugin.gestures.GesturesPlugin
    public void removeOnMapLongClickListener(OnMapLongClickListener onMapLongClickListener) {
        onMapLongClickListener.getClass();
        this.onMapLongClickListeners.remove(onMapLongClickListener);
    }

    @Override // com.mapbox.maps.plugin.gestures.GesturesPlugin
    public void removeOnMoveListener(OnMoveListener listener) {
        listener.getClass();
        this.onMoveListeners.remove(listener);
    }

    @Override // com.mapbox.maps.plugin.gestures.GesturesPlugin
    public void removeOnRotateListener(OnRotateListener listener) {
        listener.getClass();
        this.onRotateListeners.remove(listener);
    }

    @Override // com.mapbox.maps.plugin.gestures.GesturesPlugin
    public void removeOnScaleListener(OnScaleListener listener) {
        listener.getClass();
        this.onScaleListeners.remove(listener);
    }

    @Override // com.mapbox.maps.plugin.gestures.GesturesPlugin
    public void removeOnShoveListener(OnShoveListener listener) {
        listener.getClass();
        this.onShoveListeners.remove(listener);
    }

    @Override // com.mapbox.maps.plugin.gestures.GesturesPlugin
    public void removeProtectedAnimationOwner(String owner) {
        owner.getClass();
        this.protectedCameraAnimatorOwners.remove(owner);
    }

    public final void setDoubleTapRegistered$plugin_gestures_release(boolean z14) {
        this.doubleTapRegistered = z14;
    }

    @Override // com.mapbox.maps.plugin.gestures.GesturesPlugin
    public void setGesturesManager(AndroidGesturesManager internalGesturesManager, boolean attachDefaultListeners, boolean setDefaultMutuallyExclusives) {
        internalGesturesManager.getClass();
        initializeGesturesManager(internalGesturesManager, setDefaultMutuallyExclusives);
        initializeGestureListeners(this.context, attachDefaultListeners);
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsBase
    public void setInternalSettings(GesturesSettings gesturesSettings) {
        gesturesSettings.getClass();
        this.internalSettings = gesturesSettings;
    }

    public final void setMapInteractionDelegate$plugin_gestures_release(MapInteractionDelegate mapInteractionDelegate) {
        mapInteractionDelegate.getClass();
        this.mapInteractionDelegate = mapInteractionDelegate;
    }

    public final void setMoveGestureListener$plugin_gestures_release(MoveGestureListener moveGestureListener) {
        moveGestureListener.getClass();
        this.moveGestureListener = moveGestureListener;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/mapbox/maps/plugin/gestures/GesturesPluginImpl$Companion;", "", "()V", "IMMEDIATE_ANIMATION_OPTIONS", "Lcom/mapbox/maps/plugin/animation/MapAnimationOptions;", "MAX_SHOVE_ANGLE", "", "ROTATION_ANGLE_THRESHOLD", "TAG", "", "plugin-gestures_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.gestures.GesturesPluginImpl$onDelegateProvider$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/mapbox/maps/MapboxStyleManager;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<MapboxStyleManager, Unit> {
        public AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MapboxStyleManager mapboxStyleManager) {
            mapboxStyleManager.getClass();
            GesturesPluginImpl.this.style = mapboxStyleManager;
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(MapboxStyleManager mapboxStyleManager) {
            invoke2(mapboxStyleManager);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.gestures.GesturesPluginImpl$registerInteractions$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/mapbox/maps/InteractionContext;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass5 extends w implements l<InteractionContext, Unit> {
        public AnonymousClass5() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InteractionContext interactionContext) {
            interactionContext.getClass();
            GesturesPluginImpl.this.handleMoveEnd$plugin_gestures_release();
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(InteractionContext interactionContext) {
            invoke2(interactionContext);
            return Unit.INSTANCE;
        }
    }

    private final double clamp(double value, double min, double max) {
        if (max <= value) {
            value = max;
        }
        return min < value ? value : min;
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.gestures.GesturesPluginImpl$registerInteractions$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/mapbox/maps/InteractionContext;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass4 extends w implements l<InteractionContext, Unit> {
        public AnonymousClass4() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InteractionContext interactionContext) {
            interactionContext.getClass();
            GesturesPluginImpl gesturesPluginImpl = GesturesPluginImpl.this;
            ScreenCoordinate screenCoordinate = interactionContext.getScreenCoordinate();
            screenCoordinate.getClass();
            gesturesPluginImpl.handleMove$plugin_gestures_release(screenCoordinate);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(InteractionContext interactionContext) {
            invoke2(interactionContext);
            return Unit.INSTANCE;
        }
    }

    private final void unregisterScheduledAnimators() {
        this.animationsTimeoutHandler.removeCallbacksAndMessages(null);
        this.scheduledAnimators.clear();
        unregisterScheduledAnimators(this.scaleAnimators);
        unregisterScheduledAnimators(this.rotateAnimators);
    }

    public GesturesPluginImpl(Context context, AttributeSet attributeSet, float f14) {
        context.getClass();
        attributeSet.getClass();
        this.pixelRatio = 1.0f;
        this.interactionsCancelableSet = new LinkedHashSet();
        this.protectedCameraAnimatorOwners = new CopyOnWriteArraySet<>();
        this.onMapClickListeners = new CopyOnWriteArraySet<>();
        this.onMapLongClickListeners = new CopyOnWriteArraySet<>();
        this.onFlingListeners = new CopyOnWriteArraySet<>();
        this.onMoveListeners = new CopyOnWriteArraySet<>();
        this.onRotateListeners = new CopyOnWriteArraySet<>();
        this.onScaleListeners = new CopyOnWriteArraySet<>();
        this.onShoveListeners = new CopyOnWriteArraySet<>();
        ScreenCoordinate screenCoordinate = new ScreenCoordinate(0.0d, 0.0d);
        this.doubleTapFocalPoint = screenCoordinate;
        this.centerScreen = screenCoordinate;
        this.cameraCenterScreenCoordinate = screenCoordinate;
        this.sizeChanged = true;
        this.scheduledAnimators = new ArrayList<>();
        this.gesturesInterpolator = new c();
        this.context = context;
        this.pixelRatio = f14;
        setInternalSettings(GesturesAttributeParser.INSTANCE.parseGesturesSettings(context, attributeSet));
        this.animationsTimeoutHandler = new Handler(Looper.getMainLooper());
    }

    public GesturesPluginImpl(Context context, float f14) {
        context.getClass();
        this.pixelRatio = 1.0f;
        this.interactionsCancelableSet = new LinkedHashSet();
        this.protectedCameraAnimatorOwners = new CopyOnWriteArraySet<>();
        this.onMapClickListeners = new CopyOnWriteArraySet<>();
        this.onMapLongClickListeners = new CopyOnWriteArraySet<>();
        this.onFlingListeners = new CopyOnWriteArraySet<>();
        this.onMoveListeners = new CopyOnWriteArraySet<>();
        this.onRotateListeners = new CopyOnWriteArraySet<>();
        this.onScaleListeners = new CopyOnWriteArraySet<>();
        this.onShoveListeners = new CopyOnWriteArraySet<>();
        ScreenCoordinate screenCoordinate = new ScreenCoordinate(0.0d, 0.0d);
        this.doubleTapFocalPoint = screenCoordinate;
        this.centerScreen = screenCoordinate;
        this.cameraCenterScreenCoordinate = screenCoordinate;
        this.sizeChanged = true;
        this.scheduledAnimators = new ArrayList<>();
        this.gesturesInterpolator = new c();
        this.context = context;
        this.pixelRatio = f14;
        setInternalSettings(GesturesAttributeParser.INSTANCE.parseGesturesSettings(context, null));
        this.animationsTimeoutHandler = new Handler(Looper.getMainLooper());
    }

    public GesturesPluginImpl(Context context, AttributeSet attributeSet, float f14, Handler handler) {
        context.getClass();
        attributeSet.getClass();
        handler.getClass();
        this.pixelRatio = 1.0f;
        this.interactionsCancelableSet = new LinkedHashSet();
        this.protectedCameraAnimatorOwners = new CopyOnWriteArraySet<>();
        this.onMapClickListeners = new CopyOnWriteArraySet<>();
        this.onMapLongClickListeners = new CopyOnWriteArraySet<>();
        this.onFlingListeners = new CopyOnWriteArraySet<>();
        this.onMoveListeners = new CopyOnWriteArraySet<>();
        this.onRotateListeners = new CopyOnWriteArraySet<>();
        this.onScaleListeners = new CopyOnWriteArraySet<>();
        this.onShoveListeners = new CopyOnWriteArraySet<>();
        ScreenCoordinate screenCoordinate = new ScreenCoordinate(0.0d, 0.0d);
        this.doubleTapFocalPoint = screenCoordinate;
        this.centerScreen = screenCoordinate;
        this.cameraCenterScreenCoordinate = screenCoordinate;
        this.sizeChanged = true;
        this.scheduledAnimators = new ArrayList<>();
        this.gesturesInterpolator = new c();
        this.context = context;
        this.pixelRatio = f14;
        setInternalSettings(GesturesAttributeParser.INSTANCE.parseGesturesSettings(context, attributeSet));
        this.animationsTimeoutHandler = handler;
    }
}
