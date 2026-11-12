package com.chad.library.adapter.base;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.IntRange;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.h;
import com.chad.library.adapter.base.animation.AlphaInAnimation;
import com.chad.library.adapter.base.animation.BaseAnimation;
import com.chad.library.adapter.base.animation.ScaleInAnimation;
import com.chad.library.adapter.base.animation.SlideInBottomAnimation;
import com.chad.library.adapter.base.animation.SlideInLeftAnimation;
import com.chad.library.adapter.base.animation.SlideInRightAnimation;
import com.chad.library.adapter.base.diff.BrvahAsyncDiffer;
import com.chad.library.adapter.base.diff.BrvahAsyncDifferConfig;
import com.chad.library.adapter.base.diff.BrvahListUpdateCallback;
import com.chad.library.adapter.base.module.BaseDraggableModule;
import com.chad.library.adapter.base.module.BaseLoadMoreModule;
import com.chad.library.adapter.base.module.BaseUpFetchModule;
import com.chad.library.adapter.base.util.AdapterUtilsKt;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.onetrack.c.q;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.n8h;
import defpackage.o8h;
import defpackage.oie;
import defpackage.s8h;
import defpackage.t82;
import defpackage.u3b;
import defpackage.v8h;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010!\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b.\b&\u0018\u0000 «\u0002*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u00052\u00020\u0006:\u0004¬\u0002«\u0002B'\b\u0007\u0012\b\b\u0001\u0010U\u001a\u00020\u001f\u0012\u0010\b\u0002\u0010z\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010*¢\u0006\u0006\b©\u0002\u0010ª\u0002J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u0004\u0018\u00018\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00028\u0000H$¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00028\u00002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0014¢\u0006\u0004\b\u0017\u0010\u001cJ\u001f\u0010!\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00028\u00012\u0006\u0010%\u001a\u00020\u001fH\u0016¢\u0006\u0004\b(\u0010)J-\u0010(\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00028\u00012\u0006\u0010%\u001a\u00020\u001f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0*H\u0016¢\u0006\u0004\b(\u0010+J\u0017\u0010-\u001a\u00020,2\u0006\u0010%\u001a\u00020\u001fH\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00028\u0001H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00072\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00072\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b5\u00104J\u0017\u00108\u001a\u0002072\u0006\u00106\u001a\u00020\u001fH\u0014¢\u0006\u0004\b8\u00109J\u0019\u0010:\u001a\u00028\u00002\b\b\u0001\u0010%\u001a\u00020\u001fH\u0016¢\u0006\u0004\b:\u0010;J\u001b\u0010<\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010%\u001a\u00020\u001fH\u0016¢\u0006\u0004\b<\u0010;J\u0019\u0010=\u001a\u00020\u001f2\b\u0010\u0016\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b=\u0010>J\u0013\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001f0?¢\u0006\u0004\b@\u0010AJ\u001b\u0010D\u001a\u00020\u00072\f\b\u0001\u0010C\u001a\u00020B\"\u00020\u001f¢\u0006\u0004\bD\u0010EJ\u0013\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001f0?¢\u0006\u0004\bF\u0010AJ\u001b\u0010G\u001a\u00020\u00072\f\b\u0001\u0010C\u001a\u00020B\"\u00020\u001f¢\u0006\u0004\bG\u0010EJ\u001f\u0010I\u001a\u00020\u00072\u0006\u0010H\u001a\u00028\u00012\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\bI\u0010)J\u001f\u0010K\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u001fH\u0014¢\u0006\u0004\bK\u0010LJ\u001f\u0010M\u001a\u0002072\u0006\u0010J\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u001fH\u0014¢\u0006\u0004\bM\u0010NJ\u001f\u0010O\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u001fH\u0014¢\u0006\u0004\bO\u0010LJ\u001f\u0010P\u001a\u0002072\u0006\u0010J\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u001fH\u0014¢\u0006\u0004\bP\u0010NJ\u001f\u0010Q\u001a\u00020\u00072\u0006\u0010H\u001a\u00028\u00012\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\bQ\u0010)J\u000f\u0010R\u001a\u00020\u001fH\u0014¢\u0006\u0004\bR\u0010$J\u0017\u0010S\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001fH\u0014¢\u0006\u0004\bS\u0010'J\u001f\u0010T\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\bT\u0010\"J!\u0010V\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010U\u001a\u00020\u001fH\u0014¢\u0006\u0004\bV\u0010\"J\u0017\u0010V\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\bX\u0010\u0015J!\u0010Z\u001a\u0004\u0018\u00010\u000e2\u0006\u0010%\u001a\u00020\u001f2\b\b\u0001\u0010Y\u001a\u00020\u001f¢\u0006\u0004\bZ\u0010[J+\u0010^\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\\\u001a\u00020\u001f2\b\b\u0002\u0010]\u001a\u00020\u001fH\u0007¢\u0006\u0004\b^\u0010_J+\u0010`\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\\\u001a\u00020\u001f2\b\b\u0002\u0010]\u001a\u00020\u001fH\u0007¢\u0006\u0004\b`\u0010_J\r\u0010a\u001a\u000207¢\u0006\u0004\ba\u0010bJ\u0015\u0010d\u001a\u00020\u00072\u0006\u0010c\u001a\u00020\u000e¢\u0006\u0004\bd\u0010eJ\r\u0010f\u001a\u00020\u0007¢\u0006\u0004\bf\u0010\tJ+\u0010g\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\\\u001a\u00020\u001f2\b\b\u0002\u0010]\u001a\u00020\u001fH\u0007¢\u0006\u0004\bg\u0010_J+\u0010h\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\\\u001a\u00020\u001f2\b\b\u0002\u0010]\u001a\u00020\u001fH\u0007¢\u0006\u0004\bh\u0010_J\u0015\u0010j\u001a\u00020\u00072\u0006\u0010i\u001a\u00020\u000e¢\u0006\u0004\bj\u0010eJ\r\u0010k\u001a\u00020\u0007¢\u0006\u0004\bk\u0010\tJ\r\u0010l\u001a\u000207¢\u0006\u0004\bl\u0010bJ\u0015\u0010n\u001a\u00020\u00072\u0006\u0010m\u001a\u00020\u000e¢\u0006\u0004\bn\u0010eJ\u0015\u0010n\u001a\u00020\u00072\u0006\u0010U\u001a\u00020\u001f¢\u0006\u0004\bn\u0010oJ\r\u0010p\u001a\u00020\u0007¢\u0006\u0004\bp\u0010\tJ\r\u0010q\u001a\u000207¢\u0006\u0004\bq\u0010bJ\u001f\u0010t\u001a\u00020\u00072\u0006\u0010s\u001a\u00020r2\u0006\u0010\\\u001a\u00020\u001fH\u0014¢\u0006\u0004\bt\u0010uJ\u0015\u0010x\u001a\u00020\u00072\u0006\u0010w\u001a\u00020v¢\u0006\u0004\bx\u0010yJ\u001f\u0010{\u001a\u00020\u00072\u000e\u0010z\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010*H\u0017¢\u0006\u0004\b{\u0010|J\u001f\u0010~\u001a\u00020\u00072\u000e\u0010}\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010*H\u0016¢\u0006\u0004\b~\u0010|J!\u0010\u0081\u0001\u001a\u00020\u00072\r\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u007fH\u0017¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\"\u0010\u0083\u0001\u001a\u00020\u00072\u000e\u0010}\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u007fH\u0016¢\u0006\u0006\b\u0083\u0001\u0010\u0082\u0001J$\u0010\u0084\u0001\u001a\u00020\u00072\b\b\u0001\u0010\\\u001a\u00020\u001f2\u0006\u0010z\u001a\u00028\u0000H\u0016¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J$\u0010\u0086\u0001\u001a\u00020\u00072\b\b\u0001\u0010%\u001a\u00020\u001f2\u0006\u0010z\u001a\u00028\u0000H\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0085\u0001J\u001c\u0010\u0086\u0001\u001a\u00020\u00072\b\b\u0001\u0010z\u001a\u00028\u0000H\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J+\u0010\u0086\u0001\u001a\u00020\u00072\b\b\u0001\u0010%\u001a\u00020\u001f2\r\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u007fH\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0088\u0001J#\u0010\u0086\u0001\u001a\u00020\u00072\u000f\b\u0001\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u007fH\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0082\u0001J\u001b\u0010\u0089\u0001\u001a\u00020\u00072\b\b\u0001\u0010%\u001a\u00020\u001fH\u0017¢\u0006\u0005\b\u0089\u0001\u0010oJ\u001b\u0010\u008a\u0001\u001a\u00020\u00072\b\b\u0001\u0010%\u001a\u00020\u001fH\u0016¢\u0006\u0005\b\u008a\u0001\u0010oJ\u001a\u0010\u0089\u0001\u001a\u00020\u00072\u0006\u0010z\u001a\u00028\u0000H\u0016¢\u0006\u0006\b\u0089\u0001\u0010\u0087\u0001J\u001a\u0010\u008c\u0001\u001a\u00020\u00072\u0007\u0010\u008b\u0001\u001a\u00020\u001fH\u0004¢\u0006\u0005\b\u008c\u0001\u0010oJ \u0010\u008f\u0001\u001a\u00020\u00072\u000e\u0010\u008e\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u008d\u0001¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J \u0010\u0093\u0001\u001a\u00020\u00072\u000e\u0010\u0092\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0091\u0001¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0019\u0010\u0096\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0095\u0001H\u0007¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u0017\u0010\u0098\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0095\u0001¢\u0006\u0006\b\u0098\u0001\u0010\u0097\u0001J!\u0010\u0099\u0001\u001a\u00020\u00072\u000e\u0010}\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010*H\u0016¢\u0006\u0005\b\u0099\u0001\u0010|J,\u0010\u0099\u0001\u001a\u00020\u00072\n\b\u0001\u0010\u009b\u0001\u001a\u00030\u009a\u00012\f\u0010}\u001a\b\u0012\u0004\u0012\u00028\u00000*H\u0016¢\u0006\u0006\b\u0099\u0001\u0010\u009c\u0001J\u001e\u0010\u009f\u0001\u001a\u00020\u00072\n\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009d\u0001H\u0016¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u001e\u0010£\u0001\u001a\u00020\u00072\n\u0010¢\u0001\u001a\u0005\u0018\u00010¡\u0001H\u0016¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u001e\u0010¦\u0001\u001a\u00020\u00072\n\u0010¢\u0001\u001a\u0005\u0018\u00010¥\u0001H\u0016¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u001e\u0010©\u0001\u001a\u00020\u00072\n\u0010¢\u0001\u001a\u0005\u0018\u00010¨\u0001H\u0016¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u001e\u0010¬\u0001\u001a\u00020\u00072\n\u0010¢\u0001\u001a\u0005\u0018\u00010«\u0001H\u0016¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J\u0013\u0010®\u0001\u001a\u0005\u0018\u00010¡\u0001¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u0013\u0010°\u0001\u001a\u0005\u0018\u00010¥\u0001¢\u0006\u0006\b°\u0001\u0010±\u0001J\u0013\u0010²\u0001\u001a\u0005\u0018\u00010¨\u0001¢\u0006\u0006\b²\u0001\u0010³\u0001J\u0013\u0010´\u0001\u001a\u0005\u0018\u00010«\u0001¢\u0006\u0006\b´\u0001\u0010µ\u0001R;\u0010z\u001a\b\u0012\u0004\u0012\u00028\u00000*2\r\u0010¶\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000*8\u0006@@X\u0086\u000e¢\u0006\u0016\n\u0005\bz\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001\"\u0005\bº\u0001\u0010|R(\u0010»\u0001\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0005\b½\u0001\u0010b\"\u0006\b¾\u0001\u0010¿\u0001R(\u0010À\u0001\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÀ\u0001\u0010¼\u0001\u001a\u0005\bÁ\u0001\u0010b\"\u0006\bÂ\u0001\u0010¿\u0001R(\u0010Ã\u0001\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÃ\u0001\u0010¼\u0001\u001a\u0005\bÃ\u0001\u0010b\"\u0006\bÄ\u0001\u0010¿\u0001R(\u0010Å\u0001\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÅ\u0001\u0010¼\u0001\u001a\u0005\bÆ\u0001\u0010b\"\u0006\bÇ\u0001\u0010¿\u0001R(\u0010È\u0001\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÈ\u0001\u0010¼\u0001\u001a\u0005\bÉ\u0001\u0010b\"\u0006\bÊ\u0001\u0010¿\u0001R(\u0010Ë\u0001\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bË\u0001\u0010¼\u0001\u001a\u0005\bÌ\u0001\u0010b\"\u0006\bÍ\u0001\u0010¿\u0001R(\u0010Î\u0001\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÎ\u0001\u0010¼\u0001\u001a\u0005\bÎ\u0001\u0010b\"\u0006\bÏ\u0001\u0010¿\u0001R8\u0010Ò\u0001\u001a\u0005\u0018\u00010Ð\u00012\n\u0010Ñ\u0001\u001a\u0005\u0018\u00010Ð\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÒ\u0001\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0006\bÖ\u0001\u0010×\u0001R\"\u0010Ø\u0001\u001a\u000b\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0095\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u001a\u0010Û\u0001\u001a\u00030Ú\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÛ\u0001\u0010Ü\u0001R\u001a\u0010Ý\u0001\u001a\u00030Ú\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÝ\u0001\u0010Ü\u0001R\u001a\u0010ß\u0001\u001a\u00030Þ\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bß\u0001\u0010à\u0001R\u0019\u0010á\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bá\u0001\u0010â\u0001R\u001c\u0010ã\u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bã\u0001\u0010ä\u0001R\u001c\u0010å\u0001\u001a\u0005\u0018\u00010¡\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0001\u0010æ\u0001R\u001c\u0010ç\u0001\u001a\u0005\u0018\u00010¥\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bç\u0001\u0010è\u0001R\u001c\u0010é\u0001\u001a\u0005\u0018\u00010¨\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bé\u0001\u0010ê\u0001R\u001c\u0010ë\u0001\u001a\u0005\u0018\u00010«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bë\u0001\u0010ì\u0001R\u001c\u0010î\u0001\u001a\u0005\u0018\u00010í\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0001\u0010ï\u0001R\u001c\u0010ñ\u0001\u001a\u0005\u0018\u00010ð\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bñ\u0001\u0010ò\u0001R,\u0010ô\u0001\u001a\u0005\u0018\u00010ó\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bô\u0001\u0010õ\u0001\u001a\u0006\bö\u0001\u0010÷\u0001\"\u0006\bø\u0001\u0010ù\u0001R,\u0010û\u0001\u001a\u00030ú\u00012\b\u0010¶\u0001\u001a\u00030ú\u00018\u0004@BX\u0084.¢\u0006\u0010\n\u0006\bû\u0001\u0010ü\u0001\u001a\u0006\bý\u0001\u0010þ\u0001R7\u0010\u0080\u0002\u001a\t\u0012\u0004\u0012\u0002010ÿ\u00018\u0006@\u0006X\u0087.¢\u0006\u001f\n\u0006\b\u0080\u0002\u0010\u0081\u0002\u0012\u0005\b\u0086\u0002\u0010\t\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002\"\u0006\b\u0084\u0002\u0010\u0085\u0002R*\u0010\u0087\u0002\u001a\u0004\u0018\u0001018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0087\u0002\u0010\u0088\u0002\u001a\u0006\b\u0089\u0002\u0010\u008a\u0002\"\u0005\b\u008b\u0002\u00104R\u001d\u0010\u008c\u0002\u001a\b\u0012\u0004\u0012\u00020\u001f0?8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0002\u0010\u008d\u0002R\u001d\u0010\u008e\u0002\u001a\b\u0012\u0004\u0012\u00020\u001f0?8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0002\u0010\u008d\u0002R\u0015\u0010U\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bU\u0010â\u0001R\u0015\u0010\u0090\u0002\u001a\u00030ó\u00018F¢\u0006\b\u001a\u0006\b\u008f\u0002\u0010÷\u0001R\u0015\u0010\u0093\u0002\u001a\u00030í\u00018F¢\u0006\b\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002R\u0015\u0010\u0096\u0002\u001a\u00030ð\u00018F¢\u0006\b\u001a\u0006\b\u0094\u0002\u0010\u0095\u0002R(\u00102\u001a\u0002012\u0007\u0010Ñ\u0001\u001a\u0002018F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0097\u0002\u0010\u008a\u0002\"\u0005\b\u0098\u0002\u00104R\u0013\u0010\u009a\u0002\u001a\u00020\u001f8F¢\u0006\u0007\u001a\u0005\b\u0099\u0002\u0010$R\u0013\u0010\u009c\u0002\u001a\u00020\u001f8F¢\u0006\u0007\u001a\u0005\b\u009b\u0002\u0010$R\u0017\u0010\u009f\u0002\u001a\u0005\u0018\u00010Ú\u00018F¢\u0006\b\u001a\u0006\b\u009d\u0002\u0010\u009e\u0002R\u0013\u0010¡\u0002\u001a\u00020\u001f8F¢\u0006\u0007\u001a\u0005\b \u0002\u0010$R\u0013\u0010£\u0002\u001a\u00020\u001f8F¢\u0006\u0007\u001a\u0005\b¢\u0002\u0010$R\u0017\u0010¥\u0002\u001a\u0005\u0018\u00010Ú\u00018F¢\u0006\b\u001a\u0006\b¤\u0002\u0010\u009e\u0002R\u0017\u0010¨\u0002\u001a\u0005\u0018\u00010Þ\u00018F¢\u0006\b\u001a\u0006\b¦\u0002\u0010§\u0002¨\u0006\u00ad\u0002"}, d2 = {"Lcom/chad/library/adapter/base/BaseQuickAdapter;", "T", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "VH", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapterModuleImp;", "Lt82;", "", "checkModule", "()V", "Ljava/lang/Class;", "z", "getInstancedGenericKClass", "(Ljava/lang/Class;)Ljava/lang/Class;", "Landroid/view/View;", "view", "createBaseGenericKInstance", "(Ljava/lang/Class;Landroid/view/View;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "addAnimation", "(Landroidx/recyclerview/widget/RecyclerView$d0;)V", "item", "convert", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V", "", "", "payloads", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "onBindViewHolder", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;I)V", "", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;ILjava/util/List;)V", "", "getItemId", "(I)J", "onViewAttachedToWindow", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "onDetachedFromRecyclerView", "type", "", "isFixedViewType", "(I)Z", "getItem", "(I)Ljava/lang/Object;", "getItemOrNull", "getItemPosition", "(Ljava/lang/Object;)I", "Ljava/util/LinkedHashSet;", "getChildClickViewIds", "()Ljava/util/LinkedHashSet;", "", "viewIds", "addChildClickViewIds", "([I)V", "getChildLongClickViewIds", "addChildLongClickViewIds", "viewHolder", "bindViewClickListener", "v", "setOnItemClick", "(Landroid/view/View;I)V", "setOnItemLongClick", "(Landroid/view/View;I)Z", "setOnItemChildClick", "setOnItemChildLongClick", "onItemViewHolderCreated", "getDefItemCount", "getDefItemViewType", "onCreateDefViewHolder", "layoutResId", "createBaseViewHolder", "(Landroid/view/View;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "setFullSpan", "viewId", "getViewByPosition", "(II)Landroid/view/View;", "index", "orientation", "addHeaderView", "(Landroid/view/View;II)I", "setHeaderView", "hasHeaderLayout", "()Z", "header", "removeHeaderView", "(Landroid/view/View;)V", "removeAllHeaderView", "addFooterView", "setFooterView", "footer", "removeFooterView", "removeAllFooterView", "hasFooterLayout", "emptyView", "setEmptyView", "(I)V", "removeEmptyView", "hasEmptyView", "Landroid/animation/Animator;", "anim", "startAnim", "(Landroid/animation/Animator;I)V", "Lcom/chad/library/adapter/base/BaseQuickAdapter$AnimationType;", "animationType", "setAnimationWithDefault", "(Lcom/chad/library/adapter/base/BaseQuickAdapter$AnimationType;)V", "data", "setNewData", "(Ljava/util/List;)V", "list", "setNewInstance", "", "newData", "replaceData", "(Ljava/util/Collection;)V", "setList", "setData", "(ILjava/lang/Object;)V", "addData", "(Ljava/lang/Object;)V", "(ILjava/util/Collection;)V", "remove", "removeAt", MediaStoreUtil.MediaInfo.SIZE, "compatibilityDataSizeChanged", "Landroidx/recyclerview/widget/h$f;", "diffCallback", "setDiffCallback", "(Landroidx/recyclerview/widget/h$f;)V", "Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;", q.f13857a, "setDiffConfig", "(Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;)V", "Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;", "getDiffHelper", "()Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;", "getDiffer", "setDiffNewData", "Landroidx/recyclerview/widget/h$e;", "diffResult", "(Landroidx/recyclerview/widget/h$e;Ljava/util/List;)V", "Lu3b;", "spanSizeLookup", "setGridSpanSizeLookup", "(Lu3b;)V", "Ls8h;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemClickListener", "(Ls8h;)V", "Lv8h;", "setOnItemLongClickListener", "(Lv8h;)V", "Ln8h;", "setOnItemChildClickListener", "(Ln8h;)V", "Lo8h;", "setOnItemChildLongClickListener", "(Lo8h;)V", "getOnItemClickListener", "()Ls8h;", "getOnItemLongClickListener", "()Lv8h;", "getOnItemChildClickListener", "()Ln8h;", "getOnItemChildLongClickListener", "()Lo8h;", "<set-?>", "Ljava/util/List;", "getData", "()Ljava/util/List;", "setData$com_github_CymChad_brvah", "headerWithEmptyEnable", "Z", "getHeaderWithEmptyEnable", "setHeaderWithEmptyEnable", "(Z)V", "footerWithEmptyEnable", "getFooterWithEmptyEnable", "setFooterWithEmptyEnable", "isUseEmpty", "setUseEmpty", "headerViewAsFlow", "getHeaderViewAsFlow", "setHeaderViewAsFlow", "footerViewAsFlow", "getFooterViewAsFlow", "setFooterViewAsFlow", "animationEnable", "getAnimationEnable", "setAnimationEnable", "isAnimationFirstOnly", "setAnimationFirstOnly", "Lcom/chad/library/adapter/base/animation/BaseAnimation;", "value", "adapterAnimation", "Lcom/chad/library/adapter/base/animation/BaseAnimation;", "getAdapterAnimation", "()Lcom/chad/library/adapter/base/animation/BaseAnimation;", "setAdapterAnimation", "(Lcom/chad/library/adapter/base/animation/BaseAnimation;)V", "mDiffHelper", "Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;", "Landroid/widget/LinearLayout;", "mHeaderLayout", "Landroid/widget/LinearLayout;", "mFooterLayout", "Landroid/widget/FrameLayout;", "mEmptyLayout", "Landroid/widget/FrameLayout;", "mLastPosition", "I", "mSpanSizeLookup", "Lu3b;", "mOnItemClickListener", "Ls8h;", "mOnItemLongClickListener", "Lv8h;", "mOnItemChildClickListener", "Ln8h;", "mOnItemChildLongClickListener", "Lo8h;", "Lcom/chad/library/adapter/base/module/BaseUpFetchModule;", "mUpFetchModule", "Lcom/chad/library/adapter/base/module/BaseUpFetchModule;", "Lcom/chad/library/adapter/base/module/BaseDraggableModule;", "mDraggableModule", "Lcom/chad/library/adapter/base/module/BaseDraggableModule;", "Lcom/chad/library/adapter/base/module/BaseLoadMoreModule;", "mLoadMoreModule", "Lcom/chad/library/adapter/base/module/BaseLoadMoreModule;", "getMLoadMoreModule$com_github_CymChad_brvah", "()Lcom/chad/library/adapter/base/module/BaseLoadMoreModule;", "setMLoadMoreModule$com_github_CymChad_brvah", "(Lcom/chad/library/adapter/base/module/BaseLoadMoreModule;)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/lang/ref/WeakReference;", "weakRecyclerView", "Ljava/lang/ref/WeakReference;", "getWeakRecyclerView", "()Ljava/lang/ref/WeakReference;", "setWeakRecyclerView", "(Ljava/lang/ref/WeakReference;)V", "weakRecyclerView$annotations", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getMRecyclerView$com_github_CymChad_brvah", "()Landroidx/recyclerview/widget/RecyclerView;", "setMRecyclerView$com_github_CymChad_brvah", "childClickViewIds", "Ljava/util/LinkedHashSet;", "childLongClickViewIds", "getLoadMoreModule", "loadMoreModule", "getUpFetchModule", "()Lcom/chad/library/adapter/base/module/BaseUpFetchModule;", "upFetchModule", "getDraggableModule", "()Lcom/chad/library/adapter/base/module/BaseDraggableModule;", "draggableModule", "getRecyclerView", "setRecyclerView", "getHeaderViewPosition", "headerViewPosition", "getHeaderLayoutCount", "headerLayoutCount", "getHeaderLayout", "()Landroid/widget/LinearLayout;", "headerLayout", "getFooterViewPosition", "footerViewPosition", "getFooterLayoutCount", "footerLayoutCount", "getFooterLayout", "footerLayout", "getEmptyLayout", "()Landroid/widget/FrameLayout;", "emptyLayout", "<init>", "(ILjava/util/List;)V", "Companion", "AnimationType", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
public abstract class BaseQuickAdapter<T, VH extends BaseViewHolder> extends RecyclerView.Adapter<VH> implements BaseQuickAdapterModuleImp, t82 {
    public static final int EMPTY_VIEW = 268436821;
    public static final int FOOTER_VIEW = 268436275;
    public static final int HEADER_VIEW = 268435729;
    public static final int LOAD_MORE_VIEW = 268436002;

    @Nullable
    private BaseAnimation adapterAnimation;
    private boolean animationEnable;
    private final LinkedHashSet<Integer> childClickViewIds;
    private final LinkedHashSet<Integer> childLongClickViewIds;

    @NotNull
    private Context context;

    @NotNull
    private List<T> data;
    private boolean footerViewAsFlow;
    private boolean footerWithEmptyEnable;
    private boolean headerViewAsFlow;
    private boolean headerWithEmptyEnable;
    private boolean isAnimationFirstOnly;
    private boolean isUseEmpty;
    private final int layoutResId;
    private BrvahAsyncDiffer<T> mDiffHelper;
    private BaseDraggableModule mDraggableModule;
    private FrameLayout mEmptyLayout;
    private LinearLayout mFooterLayout;
    private LinearLayout mHeaderLayout;
    private int mLastPosition;

    @Nullable
    private BaseLoadMoreModule mLoadMoreModule;
    private n8h mOnItemChildClickListener;
    private o8h mOnItemChildLongClickListener;
    private s8h mOnItemClickListener;
    private v8h mOnItemLongClickListener;

    @Nullable
    private RecyclerView mRecyclerView;
    private u3b mSpanSizeLookup;
    private BaseUpFetchModule mUpFetchModule;

    @NotNull
    public WeakReference<RecyclerView> weakRecyclerView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/chad/library/adapter/base/BaseQuickAdapter$AnimationType;", "", "(Ljava/lang/String;I)V", "AlphaIn", "ScaleIn", "SlideInBottom", "SlideInLeft", "SlideInRight", "com.github.CymChad.brvah"}, k = 1, mv = {1, 1, 16})
    public enum AnimationType {
        AlphaIn,
        ScaleIn,
        SlideInBottom,
        SlideInLeft,
        SlideInRight
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnimationType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[AnimationType.AlphaIn.ordinal()] = 1;
            iArr[AnimationType.ScaleIn.ordinal()] = 2;
            iArr[AnimationType.SlideInBottom.ordinal()] = 3;
            iArr[AnimationType.SlideInLeft.ordinal()] = 4;
            iArr[AnimationType.SlideInRight.ordinal()] = 5;
        }
    }

    /* JADX INFO: renamed from: com.chad.library.adapter.base.BaseQuickAdapter$addFooterView$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
    final /* synthetic */ class AnonymousClass1 extends MutablePropertyReference0 {
        public AnonymousClass1(BaseQuickAdapter baseQuickAdapter) {
            super(baseQuickAdapter);
        }

        @Override // kotlin.reflect.KProperty0
        @Nullable
        public Object get() {
            return BaseQuickAdapter.access$getMFooterLayout$p((BaseQuickAdapter) this.receiver);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public String getName() {
            return "mFooterLayout";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(BaseQuickAdapter.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public String getSignature() {
            return "getMFooterLayout()Landroid/widget/LinearLayout;";
        }

        @Override // kotlin.reflect.KMutableProperty0
        public void set(@Nullable Object obj) {
            ((BaseQuickAdapter) this.receiver).mFooterLayout = (LinearLayout) obj;
        }
    }

    /* JADX INFO: renamed from: com.chad.library.adapter.base.BaseQuickAdapter$addHeaderView$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
    final /* synthetic */ class C13311 extends MutablePropertyReference0 {
        public C13311(BaseQuickAdapter baseQuickAdapter) {
            super(baseQuickAdapter);
        }

        @Override // kotlin.reflect.KProperty0
        @Nullable
        public Object get() {
            return BaseQuickAdapter.access$getMHeaderLayout$p((BaseQuickAdapter) this.receiver);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public String getName() {
            return "mHeaderLayout";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(BaseQuickAdapter.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public String getSignature() {
            return "getMHeaderLayout()Landroid/widget/LinearLayout;";
        }

        @Override // kotlin.reflect.KMutableProperty0
        public void set(@Nullable Object obj) {
            ((BaseQuickAdapter) this.receiver).mHeaderLayout = (LinearLayout) obj;
        }
    }

    /* JADX INFO: renamed from: com.chad.library.adapter.base.BaseQuickAdapter$hasEmptyView$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
    final /* synthetic */ class C13321 extends MutablePropertyReference0 {
        public C13321(BaseQuickAdapter baseQuickAdapter) {
            super(baseQuickAdapter);
        }

        @Override // kotlin.reflect.KProperty0
        @Nullable
        public Object get() {
            return BaseQuickAdapter.access$getMEmptyLayout$p((BaseQuickAdapter) this.receiver);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public String getName() {
            return "mEmptyLayout";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(BaseQuickAdapter.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public String getSignature() {
            return "getMEmptyLayout()Landroid/widget/FrameLayout;";
        }

        @Override // kotlin.reflect.KMutableProperty0
        public void set(@Nullable Object obj) {
            ((BaseQuickAdapter) this.receiver).mEmptyLayout = (FrameLayout) obj;
        }
    }

    /* JADX INFO: renamed from: com.chad.library.adapter.base.BaseQuickAdapter$hasFooterLayout$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
    final /* synthetic */ class C13331 extends MutablePropertyReference0 {
        public C13331(BaseQuickAdapter baseQuickAdapter) {
            super(baseQuickAdapter);
        }

        @Override // kotlin.reflect.KProperty0
        @Nullable
        public Object get() {
            return BaseQuickAdapter.access$getMFooterLayout$p((BaseQuickAdapter) this.receiver);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public String getName() {
            return "mFooterLayout";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(BaseQuickAdapter.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public String getSignature() {
            return "getMFooterLayout()Landroid/widget/LinearLayout;";
        }

        @Override // kotlin.reflect.KMutableProperty0
        public void set(@Nullable Object obj) {
            ((BaseQuickAdapter) this.receiver).mFooterLayout = (LinearLayout) obj;
        }
    }

    /* JADX INFO: renamed from: com.chad.library.adapter.base.BaseQuickAdapter$hasHeaderLayout$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
    final /* synthetic */ class C13341 extends MutablePropertyReference0 {
        public C13341(BaseQuickAdapter baseQuickAdapter) {
            super(baseQuickAdapter);
        }

        @Override // kotlin.reflect.KProperty0
        @Nullable
        public Object get() {
            return BaseQuickAdapter.access$getMHeaderLayout$p((BaseQuickAdapter) this.receiver);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public String getName() {
            return "mHeaderLayout";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(BaseQuickAdapter.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public String getSignature() {
            return "getMHeaderLayout()Landroid/widget/LinearLayout;";
        }

        @Override // kotlin.reflect.KMutableProperty0
        public void set(@Nullable Object obj) {
            ((BaseQuickAdapter) this.receiver).mHeaderLayout = (LinearLayout) obj;
        }
    }

    /* JADX INFO: renamed from: com.chad.library.adapter.base.BaseQuickAdapter$removeEmptyView$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
    final /* synthetic */ class C13361 extends MutablePropertyReference0 {
        public C13361(BaseQuickAdapter baseQuickAdapter) {
            super(baseQuickAdapter);
        }

        @Override // kotlin.reflect.KProperty0
        @Nullable
        public Object get() {
            return BaseQuickAdapter.access$getMEmptyLayout$p((BaseQuickAdapter) this.receiver);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public String getName() {
            return "mEmptyLayout";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(BaseQuickAdapter.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public String getSignature() {
            return "getMEmptyLayout()Landroid/widget/FrameLayout;";
        }

        @Override // kotlin.reflect.KMutableProperty0
        public void set(@Nullable Object obj) {
            ((BaseQuickAdapter) this.receiver).mEmptyLayout = (FrameLayout) obj;
        }
    }

    /* JADX INFO: renamed from: com.chad.library.adapter.base.BaseQuickAdapter$setEmptyView$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
    final /* synthetic */ class C13371 extends MutablePropertyReference0 {
        public C13371(BaseQuickAdapter baseQuickAdapter) {
            super(baseQuickAdapter);
        }

        @Override // kotlin.reflect.KProperty0
        @Nullable
        public Object get() {
            return BaseQuickAdapter.access$getMEmptyLayout$p((BaseQuickAdapter) this.receiver);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public String getName() {
            return "mEmptyLayout";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(BaseQuickAdapter.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public String getSignature() {
            return "getMEmptyLayout()Landroid/widget/FrameLayout;";
        }

        @Override // kotlin.reflect.KMutableProperty0
        public void set(@Nullable Object obj) {
            ((BaseQuickAdapter) this.receiver).mEmptyLayout = (FrameLayout) obj;
        }
    }

    /* JADX INFO: renamed from: com.chad.library.adapter.base.BaseQuickAdapter$setFooterView$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
    final /* synthetic */ class C13381 extends MutablePropertyReference0 {
        public C13381(BaseQuickAdapter baseQuickAdapter) {
            super(baseQuickAdapter);
        }

        @Override // kotlin.reflect.KProperty0
        @Nullable
        public Object get() {
            return BaseQuickAdapter.access$getMFooterLayout$p((BaseQuickAdapter) this.receiver);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public String getName() {
            return "mFooterLayout";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(BaseQuickAdapter.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public String getSignature() {
            return "getMFooterLayout()Landroid/widget/LinearLayout;";
        }

        @Override // kotlin.reflect.KMutableProperty0
        public void set(@Nullable Object obj) {
            ((BaseQuickAdapter) this.receiver).mFooterLayout = (LinearLayout) obj;
        }
    }

    /* JADX INFO: renamed from: com.chad.library.adapter.base.BaseQuickAdapter$setHeaderView$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
    final /* synthetic */ class C13391 extends MutablePropertyReference0 {
        public C13391(BaseQuickAdapter baseQuickAdapter) {
            super(baseQuickAdapter);
        }

        @Override // kotlin.reflect.KProperty0
        @Nullable
        public Object get() {
            return BaseQuickAdapter.access$getMHeaderLayout$p((BaseQuickAdapter) this.receiver);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public String getName() {
            return "mHeaderLayout";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(BaseQuickAdapter.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public String getSignature() {
            return "getMHeaderLayout()Landroid/widget/LinearLayout;";
        }

        @Override // kotlin.reflect.KMutableProperty0
        public void set(@Nullable Object obj) {
            ((BaseQuickAdapter) this.receiver).mHeaderLayout = (LinearLayout) obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public BaseQuickAdapter(int i) {
        this(i, null, 2, 0 == true ? 1 : 0);
    }

    public static final /* synthetic */ FrameLayout access$getMEmptyLayout$p(BaseQuickAdapter baseQuickAdapter) {
        FrameLayout frameLayout = baseQuickAdapter.mEmptyLayout;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
        }
        return frameLayout;
    }

    public static final /* synthetic */ LinearLayout access$getMFooterLayout$p(BaseQuickAdapter baseQuickAdapter) {
        LinearLayout linearLayout = baseQuickAdapter.mFooterLayout;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
        }
        return linearLayout;
    }

    public static final /* synthetic */ LinearLayout access$getMHeaderLayout$p(BaseQuickAdapter baseQuickAdapter) {
        LinearLayout linearLayout = baseQuickAdapter.mHeaderLayout;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
        }
        return linearLayout;
    }

    public static final /* synthetic */ u3b access$getMSpanSizeLookup$p(BaseQuickAdapter baseQuickAdapter) {
        baseQuickAdapter.getClass();
        return null;
    }

    private final void addAnimation(RecyclerView.d0 holder) {
        if (this.animationEnable) {
            if (!this.isAnimationFirstOnly || holder.getLayoutPosition() > this.mLastPosition) {
                BaseAnimation alphaInAnimation = this.adapterAnimation;
                if (alphaInAnimation == null) {
                    alphaInAnimation = new AlphaInAnimation(0.0f, 1, null);
                }
                View view = holder.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
                for (Animator animator : alphaInAnimation.animators(view)) {
                    startAnim(animator, holder.getLayoutPosition());
                }
                this.mLastPosition = holder.getLayoutPosition();
            }
        }
    }

    public static /* synthetic */ int addFooterView$default(BaseQuickAdapter baseQuickAdapter, View view, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addFooterView");
        }
        if ((i3 & 2) != 0) {
            i = -1;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return baseQuickAdapter.addFooterView(view, i, i2);
    }

    public static /* synthetic */ int addHeaderView$default(BaseQuickAdapter baseQuickAdapter, View view, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addHeaderView");
        }
        if ((i3 & 2) != 0) {
            i = -1;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return baseQuickAdapter.addHeaderView(view, i, i2);
    }

    private final void checkModule() {
        if (this instanceof oie) {
            this.mLoadMoreModule = addLoadMoreModule(this);
        }
    }

    private final VH createBaseGenericKInstance(Class<?> z, View view) {
        try {
            if (!z.isMemberClass() || Modifier.isStatic(z.getModifiers())) {
                Constructor<?> declaredConstructor = z.getDeclaredConstructor(View.class);
                Intrinsics.checkExpressionValueIsNotNull(declaredConstructor, "z.getDeclaredConstructor(View::class.java)");
                declaredConstructor.setAccessible(true);
                Object objNewInstance = declaredConstructor.newInstance(view);
                if (objNewInstance != null) {
                    return (VH) objNewInstance;
                }
                throw new TypeCastException("null cannot be cast to non-null type VH");
            }
            Constructor<?> declaredConstructor2 = z.getDeclaredConstructor(getClass(), View.class);
            Intrinsics.checkExpressionValueIsNotNull(declaredConstructor2, "z.getDeclaredConstructor…aClass, View::class.java)");
            declaredConstructor2.setAccessible(true);
            Object objNewInstance2 = declaredConstructor2.newInstance(this, view);
            if (objNewInstance2 != null) {
                return (VH) objNewInstance2;
            }
            throw new TypeCastException("null cannot be cast to non-null type VH");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InstantiationException e2) {
            e2.printStackTrace();
            return null;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            return null;
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    private final Class<?> getInstancedGenericKClass(Class<?> z) {
        try {
            Type genericSuperclass = z.getGenericSuperclass();
            if (!(genericSuperclass instanceof ParameterizedType)) {
                return null;
            }
            Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
            Intrinsics.checkExpressionValueIsNotNull(actualTypeArguments, "type.actualTypeArguments");
            for (Type type : actualTypeArguments) {
                if (type instanceof Class) {
                    if (BaseViewHolder.class.isAssignableFrom((Class) type)) {
                        return (Class) type;
                    }
                } else if (type instanceof ParameterizedType) {
                    Type rawType = ((ParameterizedType) type).getRawType();
                    Intrinsics.checkExpressionValueIsNotNull(rawType, "temp.rawType");
                    if ((rawType instanceof Class) && BaseViewHolder.class.isAssignableFrom((Class) rawType)) {
                        return (Class) rawType;
                    }
                } else {
                    continue;
                }
            }
            return null;
        } catch (TypeNotPresentException e) {
            e.printStackTrace();
            return null;
        } catch (GenericSignatureFormatError e2) {
            e2.printStackTrace();
            return null;
        } catch (MalformedParameterizedTypeException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public static /* synthetic */ int setFooterView$default(BaseQuickAdapter baseQuickAdapter, View view, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFooterView");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return baseQuickAdapter.setFooterView(view, i, i2);
    }

    public static /* synthetic */ int setHeaderView$default(BaseQuickAdapter baseQuickAdapter, View view, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setHeaderView");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return baseQuickAdapter.setHeaderView(view, i, i2);
    }

    @Deprecated(message = "Please use recyclerView", replaceWith = @ReplaceWith(expression = "recyclerView", imports = {}))
    public static /* synthetic */ void weakRecyclerView$annotations() {
    }

    public final void addChildClickViewIds(@NotNull int... viewIds) {
        for (int i : viewIds) {
            this.childClickViewIds.add(Integer.valueOf(i));
        }
    }

    public final void addChildLongClickViewIds(@NotNull int... viewIds) {
        for (int i : viewIds) {
            this.childLongClickViewIds.add(Integer.valueOf(i));
        }
    }

    public void addData(@IntRange(from = 0) int position, T data) {
        this.data.add(position, data);
        notifyItemInserted(position + getHeaderLayoutCount());
        compatibilityDataSizeChanged(1);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapterModuleImp
    @NotNull
    public BaseDraggableModule addDraggableModule(@NotNull BaseQuickAdapter<?, ?> baseQuickAdapter) {
        return BaseQuickAdapterModuleImp.DefaultImpls.addDraggableModule(this, baseQuickAdapter);
    }

    @JvmOverloads
    public final int addFooterView(@NotNull View view) {
        return addFooterView$default(this, view, 0, 0, 6, null);
    }

    @JvmOverloads
    public final int addHeaderView(@NotNull View view) {
        return addHeaderView$default(this, view, 0, 0, 6, null);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapterModuleImp
    @NotNull
    public BaseLoadMoreModule addLoadMoreModule(@NotNull BaseQuickAdapter<?, ?> baseQuickAdapter) {
        return BaseQuickAdapterModuleImp.DefaultImpls.addLoadMoreModule(this, baseQuickAdapter);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapterModuleImp
    @NotNull
    public BaseUpFetchModule addUpFetchModule(@NotNull BaseQuickAdapter<?, ?> baseQuickAdapter) {
        return BaseQuickAdapterModuleImp.DefaultImpls.addUpFetchModule(this, baseQuickAdapter);
    }

    public void bindViewClickListener(@NotNull VH viewHolder, int viewType) {
    }

    public final void compatibilityDataSizeChanged(int size) {
        if (this.data.size() == size) {
            notifyDataSetChanged();
        }
    }

    public abstract void convert(@NotNull VH holder, T item);

    public void convert(@NotNull VH holder, T item, @NotNull List<? extends Object> payloads) {
    }

    @NotNull
    public VH createBaseViewHolder(@NotNull ViewGroup parent, int layoutResId) {
        return (VH) createBaseViewHolder(AdapterUtilsKt.getItemView(parent, layoutResId));
    }

    @Nullable
    public final BaseAnimation getAdapterAnimation() {
        return this.adapterAnimation;
    }

    public final boolean getAnimationEnable() {
        return this.animationEnable;
    }

    @NotNull
    public final LinkedHashSet<Integer> getChildClickViewIds() {
        return this.childClickViewIds;
    }

    @NotNull
    public final LinkedHashSet<Integer> getChildLongClickViewIds() {
        return this.childLongClickViewIds;
    }

    @NotNull
    public final Context getContext() {
        Context context = this.context;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        return context;
    }

    @NotNull
    public final List<T> getData() {
        return this.data;
    }

    public int getDefItemCount() {
        return this.data.size();
    }

    public int getDefItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Deprecated(message = "User getDiffer()", replaceWith = @ReplaceWith(expression = "getDiffer()", imports = {}))
    @NotNull
    public final BrvahAsyncDiffer<T> getDiffHelper() {
        return getDiffer();
    }

    @NotNull
    public final BrvahAsyncDiffer<T> getDiffer() {
        BrvahAsyncDiffer<T> brvahAsyncDiffer = this.mDiffHelper;
        if (brvahAsyncDiffer == null) {
            throw new IllegalStateException("Please use setDiffCallback() or setDiffConfig() first!".toString());
        }
        if (brvahAsyncDiffer == null) {
            Intrinsics.throwNpe();
        }
        return brvahAsyncDiffer;
    }

    @NotNull
    public final BaseDraggableModule getDraggableModule() {
        BaseDraggableModule baseDraggableModule = this.mDraggableModule;
        if (baseDraggableModule == null) {
            throw new IllegalStateException("Please first implements DraggableModule".toString());
        }
        if (baseDraggableModule == null) {
            Intrinsics.throwNpe();
        }
        return baseDraggableModule;
    }

    @Nullable
    public final FrameLayout getEmptyLayout() {
        FrameLayout frameLayout = this.mEmptyLayout;
        if (frameLayout == null) {
            return null;
        }
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
        return frameLayout;
    }

    @Nullable
    public final LinearLayout getFooterLayout() {
        LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout == null) {
            return null;
        }
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
        return linearLayout;
    }

    public final int getFooterLayoutCount() {
        return hasFooterLayout() ? 1 : 0;
    }

    public final boolean getFooterViewAsFlow() {
        return this.footerViewAsFlow;
    }

    public final int getFooterViewPosition() {
        if (!hasEmptyView()) {
            return getHeaderLayoutCount() + this.data.size();
        }
        int i = (this.headerWithEmptyEnable && hasHeaderLayout()) ? 2 : 1;
        if (this.footerWithEmptyEnable) {
            return i;
        }
        return -1;
    }

    public final boolean getFooterWithEmptyEnable() {
        return this.footerWithEmptyEnable;
    }

    @Nullable
    public final LinearLayout getHeaderLayout() {
        LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout == null) {
            return null;
        }
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
        return linearLayout;
    }

    public final int getHeaderLayoutCount() {
        return hasHeaderLayout() ? 1 : 0;
    }

    public final boolean getHeaderViewAsFlow() {
        return this.headerViewAsFlow;
    }

    public final int getHeaderViewPosition() {
        return (!hasEmptyView() || this.headerWithEmptyEnable) ? 0 : -1;
    }

    public final boolean getHeaderWithEmptyEnable() {
        return this.headerWithEmptyEnable;
    }

    public T getItem(@IntRange(from = 0) int position) {
        return this.data.get(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int i = 1;
        if (!hasEmptyView()) {
            BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
            return getHeaderLayoutCount() + getDefItemCount() + getFooterLayoutCount() + ((baseLoadMoreModule == null || !baseLoadMoreModule.hasLoadMoreView()) ? 0 : 1);
        }
        if (this.headerWithEmptyEnable && hasHeaderLayout()) {
            i = 2;
        }
        return (this.footerWithEmptyEnable && hasFooterLayout()) ? i + 1 : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Nullable
    public T getItemOrNull(@IntRange(from = 0) int position) {
        return (T) CollectionsKt___CollectionsKt.getOrNull(this.data, position);
    }

    public int getItemPosition(@Nullable T item) {
        if (item == null || !(!this.data.isEmpty())) {
            return -1;
        }
        return this.data.indexOf(item);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (hasEmptyView()) {
            boolean z = this.headerWithEmptyEnable && hasHeaderLayout();
            if (position != 0) {
                return position != 1 ? FOOTER_VIEW : FOOTER_VIEW;
            }
            if (z) {
                return HEADER_VIEW;
            }
            return EMPTY_VIEW;
        }
        boolean zHasHeaderLayout = hasHeaderLayout();
        if (zHasHeaderLayout && position == 0) {
            return HEADER_VIEW;
        }
        if (zHasHeaderLayout) {
            position--;
        }
        int size = this.data.size();
        if (position < size) {
            return getDefItemViewType(position);
        }
        return position - size < hasFooterLayout() ? FOOTER_VIEW : LOAD_MORE_VIEW;
    }

    @NotNull
    public final BaseLoadMoreModule getLoadMoreModule() {
        BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule == null) {
            throw new IllegalStateException("Please first implements LoadMoreModule".toString());
        }
        if (baseLoadMoreModule == null) {
            Intrinsics.throwNpe();
        }
        return baseLoadMoreModule;
    }

    @Nullable
    /* JADX INFO: renamed from: getMLoadMoreModule$com_github_CymChad_brvah, reason: from getter */
    public final BaseLoadMoreModule getMLoadMoreModule() {
        return this.mLoadMoreModule;
    }

    @Nullable
    /* JADX INFO: renamed from: getMRecyclerView$com_github_CymChad_brvah, reason: from getter */
    public final RecyclerView getMRecyclerView() {
        return this.mRecyclerView;
    }

    @Nullable
    public final n8h getOnItemChildClickListener() {
        return null;
    }

    @Nullable
    public final o8h getOnItemChildLongClickListener() {
        return null;
    }

    @Nullable
    public final s8h getOnItemClickListener() {
        return null;
    }

    @Nullable
    public final v8h getOnItemLongClickListener() {
        return null;
    }

    @NotNull
    public final RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            throw new IllegalStateException("Please get it after onAttachedToRecyclerView()".toString());
        }
        if (recyclerView == null) {
            Intrinsics.throwNpe();
        }
        return recyclerView;
    }

    @NotNull
    public final BaseUpFetchModule getUpFetchModule() {
        BaseUpFetchModule baseUpFetchModule = this.mUpFetchModule;
        if (baseUpFetchModule == null) {
            throw new IllegalStateException("Please first implements UpFetchModule".toString());
        }
        if (baseUpFetchModule == null) {
            Intrinsics.throwNpe();
        }
        return baseUpFetchModule;
    }

    @Nullable
    public final View getViewByPosition(int position, int viewId) {
        BaseViewHolder baseViewHolder;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (baseViewHolder = (BaseViewHolder) recyclerView.findViewHolderForLayoutPosition(position)) == null) {
            return null;
        }
        return baseViewHolder.getViewOrNull(viewId);
    }

    @NotNull
    public final WeakReference<RecyclerView> getWeakRecyclerView() {
        WeakReference<RecyclerView> weakReference = this.weakRecyclerView;
        if (weakReference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("weakRecyclerView");
        }
        return weakReference;
    }

    public final boolean hasEmptyView() {
        FrameLayout frameLayout = this.mEmptyLayout;
        if (frameLayout != null) {
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
            }
            if (frameLayout.getChildCount() != 0 && this.isUseEmpty) {
                return this.data.isEmpty();
            }
            return false;
        }
        return false;
    }

    public final boolean hasFooterLayout() {
        LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout == null) {
            return false;
        }
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
        }
        return linearLayout.getChildCount() > 0;
    }

    public final boolean hasHeaderLayout() {
        LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout == null) {
            return false;
        }
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
        }
        return linearLayout.getChildCount() > 0;
    }

    /* JADX INFO: renamed from: isAnimationFirstOnly, reason: from getter */
    public final boolean getIsAnimationFirstOnly() {
        return this.isAnimationFirstOnly;
    }

    public boolean isFixedViewType(int type) {
        return type == 268436821 || type == 268435729 || type == 268436275 || type == 268436002;
    }

    /* JADX INFO: renamed from: isUseEmpty, reason: from getter */
    public final boolean getIsUseEmpty() {
        return this.isUseEmpty;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.weakRecyclerView = new WeakReference<>(recyclerView);
        this.mRecyclerView = recyclerView;
        Context context = recyclerView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "recyclerView.context");
        this.context = context;
        BaseDraggableModule baseDraggableModule = this.mDraggableModule;
        if (baseDraggableModule != null) {
            baseDraggableModule.attachToRecyclerView(recyclerView);
        }
        final RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            final GridLayoutManager.b bVarY = gridLayoutManager.y();
            gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.chad.library.adapter.base.BaseQuickAdapter.onAttachedToRecyclerView.1
                @Override // androidx.recyclerview.widget.GridLayoutManager.b
                public int getSpanSize(int position) {
                    int itemViewType = BaseQuickAdapter.this.getItemViewType(position);
                    if (itemViewType == 268435729 && BaseQuickAdapter.this.getHeaderViewAsFlow()) {
                        return 1;
                    }
                    if (itemViewType == 268436275 && BaseQuickAdapter.this.getFooterViewAsFlow()) {
                        return 1;
                    }
                    BaseQuickAdapter.access$getMSpanSizeLookup$p(BaseQuickAdapter.this);
                    return BaseQuickAdapter.this.isFixedViewType(itemViewType) ? ((GridLayoutManager) layoutManager).u() : bVarY.getSpanSize(position);
                }
            });
        }
    }

    @NotNull
    public VH onCreateDefViewHolder(@NotNull ViewGroup parent, int viewType) {
        return (VH) createBaseViewHolder(parent, this.layoutResId);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.mRecyclerView = null;
    }

    public void onItemViewHolderCreated(@NotNull VH viewHolder, int viewType) {
    }

    @Deprecated(message = "Please use removeAt()", replaceWith = @ReplaceWith(expression = "removeAt(position)", imports = {}))
    public void remove(@IntRange(from = 0) int position) {
        removeAt(position);
    }

    public final void removeAllFooterView() {
        if (hasFooterLayout()) {
            LinearLayout linearLayout = this.mFooterLayout;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
            }
            linearLayout.removeAllViews();
            int footerViewPosition = getFooterViewPosition();
            if (footerViewPosition != -1) {
                notifyItemRemoved(footerViewPosition);
            }
        }
    }

    public final void removeAllHeaderView() {
        if (hasHeaderLayout()) {
            LinearLayout linearLayout = this.mHeaderLayout;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
            }
            linearLayout.removeAllViews();
            int headerViewPosition = getHeaderViewPosition();
            if (headerViewPosition != -1) {
                notifyItemRemoved(headerViewPosition);
            }
        }
    }

    public void removeAt(@IntRange(from = 0) int position) {
        if (position >= this.data.size()) {
            return;
        }
        this.data.remove(position);
        int headerLayoutCount = position + getHeaderLayoutCount();
        notifyItemRemoved(headerLayoutCount);
        compatibilityDataSizeChanged(0);
        notifyItemRangeChanged(headerLayoutCount, this.data.size() - headerLayoutCount);
    }

    public final void removeEmptyView() {
        FrameLayout frameLayout = this.mEmptyLayout;
        if (frameLayout != null) {
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
            }
            frameLayout.removeAllViews();
        }
    }

    public final void removeFooterView(@NotNull View footer) {
        int footerViewPosition;
        if (hasFooterLayout()) {
            LinearLayout linearLayout = this.mFooterLayout;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
            }
            linearLayout.removeView(footer);
            LinearLayout linearLayout2 = this.mFooterLayout;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
            }
            if (linearLayout2.getChildCount() != 0 || (footerViewPosition = getFooterViewPosition()) == -1) {
                return;
            }
            notifyItemRemoved(footerViewPosition);
        }
    }

    public final void removeHeaderView(@NotNull View header) {
        int headerViewPosition;
        if (hasHeaderLayout()) {
            LinearLayout linearLayout = this.mHeaderLayout;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
            }
            linearLayout.removeView(header);
            LinearLayout linearLayout2 = this.mHeaderLayout;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
            }
            if (linearLayout2.getChildCount() != 0 || (headerViewPosition = getHeaderViewPosition()) == -1) {
                return;
            }
            notifyItemRemoved(headerViewPosition);
        }
    }

    @Deprecated(message = "Please use setData()", replaceWith = @ReplaceWith(expression = "setData(newData)", imports = {}))
    public void replaceData(@NotNull Collection<? extends T> newData) {
        setList(newData);
    }

    public final void setAdapterAnimation(@Nullable BaseAnimation baseAnimation) {
        this.animationEnable = true;
        this.adapterAnimation = baseAnimation;
    }

    public final void setAnimationEnable(boolean z) {
        this.animationEnable = z;
    }

    public final void setAnimationFirstOnly(boolean z) {
        this.isAnimationFirstOnly = z;
    }

    public final void setAnimationWithDefault(@NotNull AnimationType animationType) {
        BaseAnimation alphaInAnimation;
        int i = WhenMappings.$EnumSwitchMapping$0[animationType.ordinal()];
        if (i == 1) {
            alphaInAnimation = new AlphaInAnimation(0.0f, 1, null);
        } else if (i == 2) {
            alphaInAnimation = new ScaleInAnimation(0.0f, 1, null);
        } else if (i == 3) {
            alphaInAnimation = new SlideInBottomAnimation();
        } else if (i == 4) {
            alphaInAnimation = new SlideInLeftAnimation();
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            alphaInAnimation = new SlideInRightAnimation();
        }
        setAdapterAnimation(alphaInAnimation);
    }

    public void setData(@IntRange(from = 0) int index, T data) {
        if (index >= this.data.size()) {
            return;
        }
        this.data.set(index, data);
        notifyItemChanged(index + getHeaderLayoutCount());
    }

    public final void setData$com_github_CymChad_brvah(@NotNull List<T> list) {
        this.data = list;
    }

    public final void setDiffCallback(@NotNull h.f<T> diffCallback) {
        setDiffConfig(new BrvahAsyncDifferConfig.Builder(diffCallback).build());
    }

    public final void setDiffConfig(@NotNull BrvahAsyncDifferConfig<T> config) {
        this.mDiffHelper = new BrvahAsyncDiffer<>(this, config);
    }

    public void setDiffNewData(@Nullable List<T> list) {
        if (hasEmptyView()) {
            setNewInstance(list);
            return;
        }
        BrvahAsyncDiffer<T> brvahAsyncDiffer = this.mDiffHelper;
        if (brvahAsyncDiffer != null) {
            BrvahAsyncDiffer.submitList$default(brvahAsyncDiffer, list, null, 2, null);
        }
    }

    public final void setEmptyView(@NotNull View emptyView) {
        boolean z;
        int itemCount = getItemCount();
        if (this.mEmptyLayout == null) {
            FrameLayout frameLayout = new FrameLayout(emptyView.getContext());
            this.mEmptyLayout = frameLayout;
            ViewGroup.LayoutParams layoutParams = emptyView.getLayoutParams();
            frameLayout.setLayoutParams(layoutParams != null ? new ViewGroup.LayoutParams(layoutParams.width, layoutParams.height) : new ViewGroup.LayoutParams(-1, -1));
            z = true;
        } else {
            ViewGroup.LayoutParams layoutParams2 = emptyView.getLayoutParams();
            if (layoutParams2 != null) {
                FrameLayout frameLayout2 = this.mEmptyLayout;
                if (frameLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
                }
                ViewGroup.LayoutParams layoutParams3 = frameLayout2.getLayoutParams();
                layoutParams3.width = layoutParams2.width;
                layoutParams3.height = layoutParams2.height;
                FrameLayout frameLayout3 = this.mEmptyLayout;
                if (frameLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
                }
                frameLayout3.setLayoutParams(layoutParams3);
            }
            z = false;
        }
        FrameLayout frameLayout4 = this.mEmptyLayout;
        if (frameLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
        }
        frameLayout4.removeAllViews();
        FrameLayout frameLayout5 = this.mEmptyLayout;
        if (frameLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
        }
        frameLayout5.addView(emptyView);
        this.isUseEmpty = true;
        if (z && hasEmptyView()) {
            int i = (this.headerWithEmptyEnable && hasHeaderLayout()) ? 1 : 0;
            if (getItemCount() > itemCount) {
                notifyItemInserted(i);
            } else {
                notifyDataSetChanged();
            }
        }
    }

    @JvmOverloads
    public final int setFooterView(@NotNull View view) {
        return setFooterView$default(this, view, 0, 0, 6, null);
    }

    public final void setFooterViewAsFlow(boolean z) {
        this.footerViewAsFlow = z;
    }

    public final void setFooterWithEmptyEnable(boolean z) {
        this.footerWithEmptyEnable = z;
    }

    public void setFullSpan(@NotNull RecyclerView.d0 holder) {
        View view = holder.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).i(true);
        }
    }

    public void setGridSpanSizeLookup(@Nullable u3b spanSizeLookup) {
    }

    @JvmOverloads
    public final int setHeaderView(@NotNull View view) {
        return setHeaderView$default(this, view, 0, 0, 6, null);
    }

    public final void setHeaderViewAsFlow(boolean z) {
        this.headerViewAsFlow = z;
    }

    public final void setHeaderWithEmptyEnable(boolean z) {
        this.headerWithEmptyEnable = z;
    }

    public void setList(@Nullable Collection<? extends T> list) {
        List<T> list2 = this.data;
        if (list != list2) {
            list2.clear();
            if (list != null && !list.isEmpty()) {
                this.data.addAll(list);
            }
        } else if (list == null || list.isEmpty()) {
            this.data.clear();
        } else {
            ArrayList arrayList = new ArrayList(list);
            this.data.clear();
            this.data.addAll(arrayList);
        }
        BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule != null) {
            baseLoadMoreModule.reset$com_github_CymChad_brvah();
        }
        this.mLastPosition = -1;
        notifyDataSetChanged();
        BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
        if (baseLoadMoreModule2 != null) {
            baseLoadMoreModule2.checkDisableLoadMoreIfNotFullPage();
        }
    }

    public final void setMLoadMoreModule$com_github_CymChad_brvah(@Nullable BaseLoadMoreModule baseLoadMoreModule) {
        this.mLoadMoreModule = baseLoadMoreModule;
    }

    public final void setMRecyclerView$com_github_CymChad_brvah(@Nullable RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
    }

    @Deprecated(message = "Please use setNewInstance(), This method will be removed in the next version", replaceWith = @ReplaceWith(expression = "setNewInstance(data)", imports = {}))
    public void setNewData(@Nullable List<T> data) {
        setNewInstance(data);
    }

    public void setNewInstance(@Nullable List<T> list) {
        if (list == this.data) {
            return;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        this.data = list;
        BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule != null) {
            baseLoadMoreModule.reset$com_github_CymChad_brvah();
        }
        this.mLastPosition = -1;
        notifyDataSetChanged();
        BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
        if (baseLoadMoreModule2 != null) {
            baseLoadMoreModule2.checkDisableLoadMoreIfNotFullPage();
        }
    }

    public void setOnItemChildClick(@NotNull View v, int position) {
    }

    @Override // defpackage.t82
    public void setOnItemChildClickListener(@Nullable n8h listener) {
    }

    public boolean setOnItemChildLongClick(@NotNull View v, int position) {
        return false;
    }

    @Override // defpackage.t82
    public void setOnItemChildLongClickListener(@Nullable o8h listener) {
    }

    public void setOnItemClick(@NotNull View v, int position) {
    }

    @Override // defpackage.t82
    public void setOnItemClickListener(@Nullable s8h listener) {
    }

    public boolean setOnItemLongClick(@NotNull View v, int position) {
        return false;
    }

    @Override // defpackage.t82
    public void setOnItemLongClickListener(@Nullable v8h listener) {
    }

    public final void setRecyclerView(@NotNull RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
    }

    public final void setUseEmpty(boolean z) {
        this.isUseEmpty = z;
    }

    public final void setWeakRecyclerView(@NotNull WeakReference<RecyclerView> weakReference) {
        this.weakRecyclerView = weakReference;
    }

    public void startAnim(@NotNull Animator anim, int index) {
        anim.start();
    }

    public /* synthetic */ BaseQuickAdapter(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : list);
    }

    @JvmOverloads
    public final int addFooterView(@NotNull View view, int i) {
        return addFooterView$default(this, view, i, 0, 4, null);
    }

    @JvmOverloads
    public final int addHeaderView(@NotNull View view, int i) {
        return addHeaderView$default(this, view, i, 0, 4, null);
    }

    @NotNull
    public VH createBaseViewHolder(@NotNull View view) {
        Class<?> instancedGenericKClass = null;
        for (Class<?> superclass = getClass(); instancedGenericKClass == null && superclass != null; superclass = superclass.getSuperclass()) {
            instancedGenericKClass = getInstancedGenericKClass(superclass);
        }
        VH vh = instancedGenericKClass == null ? (VH) new BaseViewHolder(view) : (VH) createBaseGenericKInstance(instancedGenericKClass, view);
        return vh != null ? vh : (VH) new BaseViewHolder(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.d0 d0Var, int i, List list) {
        onBindViewHolder((BaseViewHolder) d0Var, i, (List<Object>) list);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public VH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        switch (viewType) {
            case HEADER_VIEW /* 268435729 */:
                LinearLayout linearLayout = this.mHeaderLayout;
                if (linearLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
                }
                ViewParent parent2 = linearLayout.getParent();
                if (parent2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent2;
                    LinearLayout linearLayout2 = this.mHeaderLayout;
                    if (linearLayout2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
                    }
                    viewGroup.removeView(linearLayout2);
                }
                LinearLayout linearLayout3 = this.mHeaderLayout;
                if (linearLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
                }
                return (VH) createBaseViewHolder(linearLayout3);
            case LOAD_MORE_VIEW /* 268436002 */:
                BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
                if (baseLoadMoreModule == null) {
                    Intrinsics.throwNpe();
                }
                VH vh = (VH) createBaseViewHolder(baseLoadMoreModule.getLoadMoreView().getRootView(parent));
                BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
                if (baseLoadMoreModule2 == null) {
                    Intrinsics.throwNpe();
                }
                baseLoadMoreModule2.setupViewHolder$com_github_CymChad_brvah(vh);
                return vh;
            case FOOTER_VIEW /* 268436275 */:
                LinearLayout linearLayout4 = this.mFooterLayout;
                if (linearLayout4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
                }
                ViewParent parent3 = linearLayout4.getParent();
                if (parent3 instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) parent3;
                    LinearLayout linearLayout5 = this.mFooterLayout;
                    if (linearLayout5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
                    }
                    viewGroup2.removeView(linearLayout5);
                }
                LinearLayout linearLayout6 = this.mFooterLayout;
                if (linearLayout6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
                }
                return (VH) createBaseViewHolder(linearLayout6);
            case EMPTY_VIEW /* 268436821 */:
                FrameLayout frameLayout = this.mEmptyLayout;
                if (frameLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
                }
                ViewParent parent4 = frameLayout.getParent();
                if (parent4 instanceof ViewGroup) {
                    ViewGroup viewGroup3 = (ViewGroup) parent4;
                    FrameLayout frameLayout2 = this.mEmptyLayout;
                    if (frameLayout2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
                    }
                    viewGroup3.removeView(frameLayout2);
                }
                FrameLayout frameLayout3 = this.mEmptyLayout;
                if (frameLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
                }
                return (VH) createBaseViewHolder(frameLayout3);
            default:
                VH vh2 = (VH) onCreateDefViewHolder(parent, viewType);
                bindViewClickListener(vh2, viewType);
                BaseDraggableModule baseDraggableModule = this.mDraggableModule;
                if (baseDraggableModule != null) {
                    baseDraggableModule.initView$com_github_CymChad_brvah(vh2);
                }
                onItemViewHolderCreated(vh2, viewType);
                return vh2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NotNull VH holder) {
        super.onViewAttachedToWindow(holder);
        if (isFixedViewType(holder.getItemViewType())) {
            setFullSpan(holder);
        } else {
            addAnimation(holder);
        }
    }

    public void remove(T data) {
        int iIndexOf = this.data.indexOf(data);
        if (iIndexOf == -1) {
            return;
        }
        removeAt(iIndexOf);
    }

    @JvmOverloads
    public final int setFooterView(@NotNull View view, int i) {
        return setFooterView$default(this, view, i, 0, 4, null);
    }

    @JvmOverloads
    public final int setHeaderView(@NotNull View view, int i) {
        return setHeaderView$default(this, view, i, 0, 4, null);
    }

    @JvmOverloads
    public BaseQuickAdapter(int i, @Nullable List<T> list) {
        this.layoutResId = i;
        this.data = list == null ? new ArrayList<>() : list;
        this.isUseEmpty = true;
        this.isAnimationFirstOnly = true;
        this.mLastPosition = -1;
        checkModule();
        this.childClickViewIds = new LinkedHashSet<>();
        this.childLongClickViewIds = new LinkedHashSet<>();
    }

    @JvmOverloads
    public final int addFooterView(@NotNull View view, int index, int orientation) {
        int footerViewPosition;
        RecyclerView.LayoutParams layoutParams;
        if (this.mFooterLayout == null) {
            LinearLayout linearLayout = new LinearLayout(view.getContext());
            this.mFooterLayout = linearLayout;
            linearLayout.setOrientation(orientation);
            LinearLayout linearLayout2 = this.mFooterLayout;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
            }
            if (orientation == 1) {
                layoutParams = new RecyclerView.LayoutParams(-1, -2);
            } else {
                layoutParams = new RecyclerView.LayoutParams(-2, -1);
            }
            linearLayout2.setLayoutParams(layoutParams);
        }
        LinearLayout linearLayout3 = this.mFooterLayout;
        if (linearLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
        }
        int childCount = linearLayout3.getChildCount();
        if (index < 0 || index > childCount) {
            index = childCount;
        }
        LinearLayout linearLayout4 = this.mFooterLayout;
        if (linearLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
        }
        linearLayout4.addView(view, index);
        LinearLayout linearLayout5 = this.mFooterLayout;
        if (linearLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
        }
        if (linearLayout5.getChildCount() == 1 && (footerViewPosition = getFooterViewPosition()) != -1) {
            notifyItemInserted(footerViewPosition);
        }
        return index;
    }

    @JvmOverloads
    public final int addHeaderView(@NotNull View view, int index, int orientation) {
        int headerViewPosition;
        RecyclerView.LayoutParams layoutParams;
        if (this.mHeaderLayout == null) {
            LinearLayout linearLayout = new LinearLayout(view.getContext());
            this.mHeaderLayout = linearLayout;
            linearLayout.setOrientation(orientation);
            LinearLayout linearLayout2 = this.mHeaderLayout;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
            }
            if (orientation == 1) {
                layoutParams = new RecyclerView.LayoutParams(-1, -2);
            } else {
                layoutParams = new RecyclerView.LayoutParams(-2, -1);
            }
            linearLayout2.setLayoutParams(layoutParams);
        }
        LinearLayout linearLayout3 = this.mHeaderLayout;
        if (linearLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
        }
        int childCount = linearLayout3.getChildCount();
        if (index < 0 || index > childCount) {
            index = childCount;
        }
        LinearLayout linearLayout4 = this.mHeaderLayout;
        if (linearLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
        }
        linearLayout4.addView(view, index);
        LinearLayout linearLayout5 = this.mHeaderLayout;
        if (linearLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
        }
        if (linearLayout5.getChildCount() == 1 && (headerViewPosition = getHeaderViewPosition()) != -1) {
            notifyItemInserted(headerViewPosition);
        }
        return index;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull VH holder, int position) {
        BaseUpFetchModule baseUpFetchModule = this.mUpFetchModule;
        if (baseUpFetchModule != null) {
            baseUpFetchModule.autoUpFetch$com_github_CymChad_brvah(position);
        }
        BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule != null) {
            baseLoadMoreModule.autoLoadMore$com_github_CymChad_brvah(position);
        }
        switch (holder.getItemViewType()) {
            case HEADER_VIEW /* 268435729 */:
            case FOOTER_VIEW /* 268436275 */:
            case EMPTY_VIEW /* 268436821 */:
                break;
            case LOAD_MORE_VIEW /* 268436002 */:
                BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
                if (baseLoadMoreModule2 != null) {
                    baseLoadMoreModule2.getLoadMoreView().convert(holder, position, baseLoadMoreModule2.getLoadMoreStatus());
                }
                break;
            default:
                convert(holder, getItem(position - getHeaderLayoutCount()));
                break;
        }
    }

    @JvmOverloads
    public final int setFooterView(@NotNull View view, int index, int orientation) {
        LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout != null) {
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
            }
            if (linearLayout.getChildCount() > index) {
                LinearLayout linearLayout2 = this.mFooterLayout;
                if (linearLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
                }
                linearLayout2.removeViewAt(index);
                LinearLayout linearLayout3 = this.mFooterLayout;
                if (linearLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
                }
                linearLayout3.addView(view, index);
                return index;
            }
        }
        return addFooterView(view, index, orientation);
    }

    @JvmOverloads
    public final int setHeaderView(@NotNull View view, int index, int orientation) {
        LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout != null) {
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
            }
            if (linearLayout.getChildCount() > index) {
                LinearLayout linearLayout2 = this.mHeaderLayout;
                if (linearLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
                }
                linearLayout2.removeViewAt(index);
                LinearLayout linearLayout3 = this.mHeaderLayout;
                if (linearLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
                }
                linearLayout3.addView(view, index);
                return index;
            }
        }
        return addHeaderView(view, index, orientation);
    }

    public void addData(T data) {
        this.data.add(data);
        notifyItemInserted(this.data.size() + getHeaderLayoutCount());
        compatibilityDataSizeChanged(1);
    }

    public void setDiffNewData(@NotNull h.e diffResult, @NotNull List<T> list) {
        if (hasEmptyView()) {
            setNewInstance(list);
        } else {
            diffResult.c(new BrvahListUpdateCallback(this));
            this.data = list;
        }
    }

    public void addData(@IntRange(from = 0) int position, @NotNull Collection<? extends T> newData) {
        this.data.addAll(position, newData);
        notifyItemRangeInserted(position + getHeaderLayoutCount(), newData.size());
        compatibilityDataSizeChanged(newData.size());
    }

    public void onBindViewHolder(@NotNull VH holder, int position, @NotNull List<Object> payloads) {
        if (payloads.isEmpty()) {
            onBindViewHolder((BaseViewHolder) holder, position);
        }
        BaseUpFetchModule baseUpFetchModule = this.mUpFetchModule;
        if (baseUpFetchModule != null) {
            baseUpFetchModule.autoUpFetch$com_github_CymChad_brvah(position);
        }
        BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule != null) {
            baseLoadMoreModule.autoLoadMore$com_github_CymChad_brvah(position);
        }
        switch (holder.getItemViewType()) {
            case HEADER_VIEW /* 268435729 */:
            case FOOTER_VIEW /* 268436275 */:
            case EMPTY_VIEW /* 268436821 */:
                break;
            case LOAD_MORE_VIEW /* 268436002 */:
                BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
                if (baseLoadMoreModule2 != null) {
                    baseLoadMoreModule2.getLoadMoreView().convert(holder, position, baseLoadMoreModule2.getLoadMoreStatus());
                }
                break;
            default:
                convert(holder, getItem(position - getHeaderLayoutCount()), payloads);
                break;
        }
    }

    public void addData(@NotNull Collection<? extends T> newData) {
        this.data.addAll(newData);
        notifyItemRangeInserted((this.data.size() - newData.size()) + getHeaderLayoutCount(), newData.size());
        compatibilityDataSizeChanged(newData.size());
    }

    public final void setEmptyView(int layoutResId) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            View view = LayoutInflater.from(recyclerView.getContext()).inflate(layoutResId, (ViewGroup) recyclerView, false);
            Intrinsics.checkExpressionValueIsNotNull(view, "view");
            setEmptyView(view);
        }
    }
}
