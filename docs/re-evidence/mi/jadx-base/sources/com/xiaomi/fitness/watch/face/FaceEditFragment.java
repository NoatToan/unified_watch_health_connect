package com.xiaomi.fitness.watch.face;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.watch.face.FaceEditFragment;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.db.WatchFaceDataBase;
import com.xiaomi.fitness.watch.face.edit.entity.DialEditEntity;
import com.xiaomi.fitness.watch.face.edit.entity.DialWatchFace;
import com.xiaomi.fitness.watch.face.edit.entity.EditWidget;
import com.xiaomi.fitness.watch.face.edit.entity.Image;
import com.xiaomi.fitness.watch.face.edit.entity.ResourceFile;
import com.xiaomi.fitness.watch.face.edit.entity.SlotEditItem;
import com.xiaomi.fitness.watch.face.edit.entity.Sprite;
import com.xiaomi.fitness.watch.face.edit.entity.Theme;
import com.xiaomi.fitness.watch.face.edit.photo.FaceEditPhotoHelper;
import com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment;
import com.xiaomi.fitness.watch.face.edit.slot.pick.FaceEditSlotPickerAdapter;
import com.xiaomi.fitness.watch.face.edit.utils.DialEditDeviceHelper;
import com.xiaomi.fitness.watch.face.edit.utils.DialEditHelper;
import com.xiaomi.fitness.watch.face.edit.utils.DialFileUtils;
import com.xiaomi.fitness.watch.face.event.FaceInstallEvent;
import com.xiaomi.fitness.watch.face.event.FaceReSycEvent;
import com.xiaomi.fitness.watch.face.export.data.FaceEditLiteralBean;
import com.xiaomi.fitness.watch.face.export.data.FaceEditPhotoBean;
import com.xiaomi.fitness.watch.face.export.data.FaceEditPhotoBeanKt;
import com.xiaomi.fitness.watch.face.export.data.WatchFace;
import com.xiaomi.fitness.watch.face.export.data.WatchFaceImage;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import com.xiaomi.fitness.watch.face.viewmodel.FaceBleInfoViewModelKt;
import com.xiaomi.fitness.watch.face.viewmodel.FaceEditViewModel;
import com.xiaomi.fitness.watch.face.widget.FaceDialog;
import com.xiaomi.fitness.watch.face.widget.FaceEditPicker;
import com.xiaomi.fitness.watch.face.widget.FaceEditScrollLayout;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.a4i;
import defpackage.av6;
import defpackage.b39;
import defpackage.isi;
import defpackage.jx8;
import defpackage.ld8;
import defpackage.noi;
import defpackage.orf;
import defpackage.ovi;
import defpackage.p1j;
import defpackage.q5r;
import defpackage.tv1;
import defpackage.twi;
import defpackage.uno;
import defpackage.w5r;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 «\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002«\u0001B\b¢\u0006\u0005\bª\u0001\u0010\u000bJ\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b\u0010\u0010%J'\u0010)\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010\u000bJ\u0017\u0010,\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\fH\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010\u000bJ\u000f\u0010/\u001a\u00020\u0006H\u0002¢\u0006\u0004\b/\u0010\u000bJ'\u00103\u001a\u00020\u0004*\b\u0012\u0004\u0012\u000201002\f\u00102\u001a\b\u0012\u0004\u0012\u00020100H\u0002¢\u0006\u0004\b3\u00104J\u001d\u00107\u001a\u00020\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000605H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0006H\u0002¢\u0006\u0004\b9\u0010\u000bJ\u000f\u0010:\u001a\u00020\u0006H\u0002¢\u0006\u0004\b:\u0010\u000bJ%\u0010=\u001a\u00020\u00062\u0014\u0010<\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00060;H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0006H\u0002¢\u0006\u0004\b?\u0010\u000bJ\u001d\u0010A\u001a\u00020\u00062\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000605H\u0002¢\u0006\u0004\bA\u00108J\u0017\u0010D\u001a\u00020\u00062\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0006H\u0002¢\u0006\u0004\bF\u0010\u000bJ\u000f\u0010G\u001a\u00020\u0006H\u0002¢\u0006\u0004\bG\u0010\u000bJ\u000f\u0010H\u001a\u00020\u0006H\u0002¢\u0006\u0004\bH\u0010\u000bJ\u000f\u0010I\u001a\u00020\u0006H\u0002¢\u0006\u0004\bI\u0010\u000bJ\u000f\u0010J\u001a\u00020\u0006H\u0002¢\u0006\u0004\bJ\u0010\u000bJ\u0017\u0010M\u001a\u00020\u00062\u0006\u0010L\u001a\u00020KH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\fH\u0002¢\u0006\u0004\bO\u0010-J\u000f\u0010P\u001a\u00020\u0006H\u0002¢\u0006\u0004\bP\u0010\u000bJ\u0019\u0010R\u001a\u00020\u00062\b\b\u0002\u0010Q\u001a\u00020\fH\u0002¢\u0006\u0004\bR\u0010-J\u000f\u0010S\u001a\u00020\u0004H\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u0004H\u0002¢\u0006\u0004\bU\u0010TJ+\u0010X\u001a\u00020\u00062\u0006\u0010V\u001a\u00020\f2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060;H\u0002¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u0004H\u0002¢\u0006\u0004\bZ\u0010TJ\u000f\u0010[\u001a\u00020\u0004H\u0002¢\u0006\u0004\b[\u0010TJ\u000f\u0010\\\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\\\u0010TJ\u000f\u0010]\u001a\u00020\u0004H\u0002¢\u0006\u0004\b]\u0010TJ\u000f\u0010^\u001a\u00020\u0004H\u0002¢\u0006\u0004\b^\u0010TJ%\u0010b\u001a\u00020\u00062\u0006\u0010`\u001a\u00020_2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u001200H\u0002¢\u0006\u0004\bb\u0010cJ\u001f\u0010e\u001a\u00020\u00062\u0006\u0010d\u001a\u00020\u00122\u0006\u0010V\u001a\u00020\fH\u0002¢\u0006\u0004\be\u0010fJ!\u0010k\u001a\u00020\u00062\u0006\u0010h\u001a\u00020g2\b\u0010j\u001a\u0004\u0018\u00010iH\u0016¢\u0006\u0004\bk\u0010lJ\u0017\u0010o\u001a\u00020\u00062\u0006\u0010n\u001a\u00020mH\u0007¢\u0006\u0004\bo\u0010pJ\u000f\u0010q\u001a\u00020\u0004H\u0016¢\u0006\u0004\bq\u0010TJ\u000f\u0010r\u001a\u00020\u0006H\u0016¢\u0006\u0004\br\u0010\u000bJ\u000f\u0010s\u001a\u00020\u0006H\u0016¢\u0006\u0004\bs\u0010\u000bR\u0016\u0010t\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010vR\u0016\u0010w\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010uR\u0016\u0010x\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010uR\u0016\u0010y\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010uR\u0016\u0010z\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010uR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020\f0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010}\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010uR\u0019\u0010\u007f\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0019\u0010\u0081\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0083\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010uR)\u0010\u0084\u0001\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0082\u0001R\u0019\u0010\u008b\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u008d\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010uR\u0019\u0010\u008e\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008c\u0001R!\u0010\u0094\u0001\u001a\u00030\u008f\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001e\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u0002010 8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010|R\u0019\u0010\u0096\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u008c\u0001R\u0019\u0010\u0097\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u008c\u0001R\u001b\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001e\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u00020\u0012008\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010|R\u0019\u0010\u009b\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0082\u0001R\u001c\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001c\u0010 \u0001\u001a\u0005\u0018\u00010\u009f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0019\u0010¢\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010\u008c\u0001R\u001e\u0010¤\u0001\u001a\t\u0012\u0004\u0012\u00020K0£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0019\u0010¦\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010\u008c\u0001R\u001e\u0010§\u0001\u001a\t\u0012\u0004\u0012\u00020\f0£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¥\u0001R#\u0010¨\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060;8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001¨\u0006¬\u0001"}, d2 = {"Lcom/xiaomi/fitness/watch/face/FaceEditFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceEditViewModel;", "Ljx8;", "", "isSetChange", "", "initSaveBtn", "(Z)V", "setButton", "loadPreviewImage", "()V", "", "slotItemEditProcessIndex", "Lcom/xiaomi/fitness/watch/face/edit/entity/Theme;", "passTheme", "refreshPreview", "(ILcom/xiaomi/fitness/watch/face/edit/entity/Theme;)V", "", "getDefaultVideoThumb", "()Ljava/lang/String;", "playNow", "loadMediaPlayer", "(ILcom/xiaomi/fitness/watch/face/edit/entity/Theme;Z)V", "Ljava/io/File;", "bgVideo", "setVideoSource", "(Ljava/io/File;Z)V", "loadEditPickerInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/fitness/watch/face/edit/entity/DialWatchFace;", WatchFaceDataBase.DB_NAME, "", "fillEditItemIndexList", "(Lcom/xiaomi/fitness/watch/face/edit/entity/DialWatchFace;)Ljava/util/List;", "", "ratio", "(F)V", "headerViewHeight", "offset", "position", "scrollAnimation", "(III)V", "scaleAnimation", "onAnimationEnd", "(I)V", "resizeEmptyView", "fillNewImageList", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceEditPhotoBean;", "target", "startWith", "(Ljava/util/List;Ljava/util/List;)Z", "Lkotlin/Function0;", "action", "checkConnect", "(Lkotlin/jvm/functions/Function0;)V", "setFace", "requestEdit", "Lkotlin/Function1;", "success", "cropFontFile", "(Lkotlin/jvm/functions/Function1;)V", "performSave", "allFilled", "checkEditTextEmpty", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceEditViewModel$EditResult;", "editRet", "onEditResult", "(Lcom/xiaomi/fitness/watch/face/viewmodel/FaceEditViewModel$EditResult;)V", "syncFace", "onRealDismissDialog", "editFail", "finishEdit", "deleteOriginVideoIfNeed", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceEditViewModel$BgImgTransferProgress;", BroadcastsKt.SILENT_PUSHING_PROGRESS, "onImgTransfer", "(Lcom/xiaomi/fitness/watch/face/viewmodel/FaceEditViewModel$BgImgTransferProgress;)V", "onFontTransfer", "addListener", "pickType", "gotoPhotoPickerPage", "bgImgChanged", "()Z", "indexPhotoChange", "index", "select", "showSlotSelectDialog", "(ILkotlin/jvm/functions/Function1;)V", "isConfigChange", "isThemeChange", "isEditChange", "isTextChange", "fontFileChange", "Lcom/xiaomi/fitness/watch/face/export/data/FaceEditLiteralBean;", "textEditBean", "textList", "showEditTextEmpty", "(Lcom/xiaomi/fitness/watch/face/export/data/FaceEditLiteralBean;Ljava/util/List;)V", "text", "showEditTextEmptyDialog", "(Ljava/lang/String;I)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lorf;", "event", "onDataEvent", "(Lorf;)V", "onBackPressed", LifecycleConstantKt.ON_PAUSE, LifecycleConstantKt.ON_DESTROY, "mFaceEditViewHeight", "I", "F", "originOutlineHeight", "originBottomViewHeight", "originHeaderViewHeight", "originHeaderViewWidth", "currentEditItemIndexList", "Ljava/util/List;", "themeIndex", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;", "mInfo", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;", "photoId", "Ljava/lang/String;", "currentPreviewImage", "dialWatchFace", "Lcom/xiaomi/fitness/watch/face/edit/entity/DialWatchFace;", "getDialWatchFace", "()Lcom/xiaomi/fitness/watch/face/edit/entity/DialWatchFace;", "setDialWatchFace", "(Lcom/xiaomi/fitness/watch/face/edit/entity/DialWatchFace;)V", "unzipPath", "progressDialogShowing", "Z", "editCode", "hasAod", "Lcom/xiaomi/fitness/watch/face/widget/FaceDialog;", "progressDialog$delegate", "Lkotlin/Lazy;", "getProgressDialog", "()Lcom/xiaomi/fitness/watch/face/widget/FaceDialog;", "progressDialog", "originImageList", "needOrderList", "deleteAll", "fontFile", "Ljava/io/File;", "originTextList", "originCropText", "Landroid/media/MediaPlayer;", "mediaPlayer", "Landroid/media/MediaPlayer;", "Lb39;", "titleBarBinding", "Lb39;", "expand", "Landroidx/lifecycle/Observer;", "bgImgTransferObserver", "Landroidx/lifecycle/Observer;", "isAppSave", "fontTransferObserver", "imageChangeListener", "Lkotlin/jvm/functions/Function1;", "<init>", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFaceEditFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceEditFragment.kt\ncom/xiaomi/fitness/watch/face/FaceEditFragment\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Animator.kt\nandroidx/core/animation/AnimatorKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1487:1\n13402#2,2:1488\n54#3,3:1490\n24#3:1493\n59#3,6:1494\n54#3,3:1501\n24#3:1504\n59#3,6:1505\n1#4:1500\n91#5,14:1511\n1863#6,2:1525\n1782#6,4:1527\n360#6,7:1531\n1872#6,3:1538\n1863#6,2:1541\n1663#6,8:1543\n360#6,7:1551\n*S KotlinDebug\n*F\n+ 1 FaceEditFragment.kt\ncom/xiaomi/fitness/watch/face/FaceEditFragment\n*L\n151#1:1488,2\n273#1:1490,3\n273#1:1493\n273#1:1494,6\n399#1:1501,3\n399#1:1504\n399#1:1505,6\n670#1:1511,14\n825#1:1525,2\n861#1:1527,4\n1409#1:1531,7\n1422#1:1538,3\n1125#1:1541,2\n1246#1:1543,8\n1325#1:1551,7\n*E\n"})
public final class FaceEditFragment extends Hilt_FaceEditFragment<FaceEditViewModel, jx8> {

    @NotNull
    public static final String FACE_UNZIP_PATH = "faceUnzipPath";

    @NotNull
    private static final String TAG = "FaceEditFragment";

    @NotNull
    private final Observer<FaceEditViewModel.BgImgTransferProgress> bgImgTransferObserver;

    @NotNull
    private final List<Integer> currentEditItemIndexList;
    private int currentPreviewImage;
    private boolean deleteAll;
    public DialWatchFace dialWatchFace;
    private int editCode;
    private boolean expand;

    @Nullable
    private File fontFile;

    @NotNull
    private final Observer<Integer> fontTransferObserver;
    private boolean hasAod;

    @NotNull
    private final Function1<Boolean, Unit> imageChangeListener;
    private boolean isAppSave;
    private int mFaceEditViewHeight;

    @Nullable
    private WatchFace mInfo;

    @Nullable
    private MediaPlayer mediaPlayer;
    private boolean needOrderList;
    private int originBottomViewHeight;

    @NotNull
    private String originCropText;
    private int originHeaderViewHeight;
    private int originHeaderViewWidth;
    private List<FaceEditPhotoBean> originImageList;
    private int originOutlineHeight;

    @NotNull
    private List<String> originTextList;

    @NotNull
    private String photoId;

    /* JADX INFO: renamed from: progressDialog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy progressDialog;
    private boolean progressDialogShowing;
    private float ratio;
    private int themeIndex;

    @Nullable
    private b39 titleBarBinding;

    @NotNull
    private String unzipPath;

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.FaceEditFragment$deleteOriginVideoIfNeed$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceEditFragment$deleteOriginVideoIfNeed$1", f = "FaceEditFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFaceEditFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceEditFragment.kt\ncom/xiaomi/fitness/watch/face/FaceEditFragment$deleteOriginVideoIfNeed$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1487:1\n1863#2,2:1488\n*S KotlinDebug\n*F\n+ 1 FaceEditFragment.kt\ncom/xiaomi/fitness/watch/face/FaceEditFragment$deleteOriginVideoIfNeed$1\n*L\n992#1:1488,2\n*E\n"})
    public static final class C33341 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C33341(Continuation<? super C33341> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceEditFragment.this.new C33341(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            for (FaceEditPhotoBean faceEditPhotoBean : FaceEditFragment.access$getMViewModel(FaceEditFragment.this).getNewImageList()) {
                String originImagePath = faceEditPhotoBean.getBackgroundImage().getOriginImagePath();
                if (originImagePath != null && originImagePath.length() != 0) {
                    File file = new File(faceEditPhotoBean.getBackgroundImage().getOriginImagePath());
                    if (file.exists()) {
                        file.delete();
                    }
                    faceEditPhotoBean.getBackgroundImage().setOriginImageMd5(faceEditPhotoBean.getBackgroundImage().getMd5());
                    faceEditPhotoBean.getBackgroundImage().setOriginImagePath(faceEditPhotoBean.getBackgroundImage().getCropPath());
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.FaceEditFragment$loadEditPickerInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceEditFragment", f = "FaceEditFragment.kt", i = {0, 0, 0}, l = {470}, m = "loadEditPickerInfo", n = {"this", "defaultVideoThumbPath", "newImageList"}, s = {"L$0", "L$1", "L$2"})
    public static final class C33351 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C33351(Continuation<? super C33351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FaceEditFragment.this.loadEditPickerInfo(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.FaceEditFragment$onEditResult$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceEditFragment$onEditResult$1", f = "FaceEditFragment.kt", i = {}, l = {891}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C33371(Continuation<? super C33371> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceEditFragment.this.new C33371(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Theme currentTheme;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceEditViewModel faceEditViewModelAccess$getMViewModel = FaceEditFragment.access$getMViewModel(FaceEditFragment.this);
                String str = FaceEditFragment.this.photoId;
                WatchFace watchFace = FaceEditFragment.this.mInfo;
                String id = watchFace != null ? watchFace.getId() : null;
                List<FaceEditPhotoBean> listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                DialWatchFace dialWatchFace = FaceEditFragment.this.getDialWatchFace();
                boolean z = (dialWatchFace == null || (currentTheme = dialWatchFace.getCurrentTheme()) == null || currentTheme.isVideoWatchFace()) ? false : true;
                this.label = 1;
                if (faceEditViewModelAccess$getMViewModel.savePhotosToDB(str, id, listEmptyList, z, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.FaceEditFragment$onImgTransfer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceEditFragment$onImgTransfer$1", f = "FaceEditFragment.kt", i = {}, l = {1019}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33381 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C33381(Continuation<? super C33381> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceEditFragment.this.new C33381(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Theme currentTheme;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceEditFragment faceEditFragment = FaceEditFragment.this;
                if (faceEditFragment.dialWatchFace != null) {
                    FaceEditViewModel faceEditViewModelAccess$getMViewModel = FaceEditFragment.access$getMViewModel(faceEditFragment);
                    String str = FaceEditFragment.this.photoId;
                    WatchFace watchFace = FaceEditFragment.this.mInfo;
                    String id = watchFace != null ? watchFace.getId() : null;
                    List<FaceEditPhotoBean> listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    DialWatchFace dialWatchFace = FaceEditFragment.this.getDialWatchFace();
                    boolean z = (dialWatchFace == null || (currentTheme = dialWatchFace.getCurrentTheme()) == null || currentTheme.isVideoWatchFace()) ? false : true;
                    this.label = 1;
                    if (faceEditViewModelAccess$getMViewModel.savePhotosToDB(str, id, listEmptyList, z, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.FaceEditFragment$onImgTransfer$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceEditFragment$onImgTransfer$2", f = "FaceEditFragment.kt", i = {}, l = {1035}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FaceEditViewModel.BgImgTransferProgress $progress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FaceEditViewModel.BgImgTransferProgress bgImgTransferProgress, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$progress = bgImgTransferProgress;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceEditFragment.this.new AnonymousClass2(this.$progress, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Theme currentTheme;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceEditFragment faceEditFragment = FaceEditFragment.this;
                if (faceEditFragment.dialWatchFace != null) {
                    FaceEditViewModel faceEditViewModelAccess$getMViewModel = FaceEditFragment.access$getMViewModel(faceEditFragment);
                    String str = FaceEditFragment.this.photoId;
                    WatchFace watchFace = FaceEditFragment.this.mInfo;
                    String id = watchFace != null ? watchFace.getId() : null;
                    List<FaceEditPhotoBean> transferQueue = this.$progress.getTransferQueue();
                    DialWatchFace dialWatchFace = FaceEditFragment.this.getDialWatchFace();
                    boolean z = (dialWatchFace == null || (currentTheme = dialWatchFace.getCurrentTheme()) == null || currentTheme.isVideoWatchFace()) ? false : true;
                    this.label = 1;
                    if (faceEditViewModelAccess$getMViewModel.savePhotosToDB(str, id, transferQueue, z, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public FaceEditFragment() {
        super(ovi.h, tv1.d);
        this.ratio = 1.0f;
        this.currentEditItemIndexList = new ArrayList();
        this.photoId = "";
        this.unzipPath = "";
        this.editCode = 10;
        this.progressDialog = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ss8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceEditFragment.progressDialog_delegate$lambda$0();
            }
        });
        this.originTextList = CollectionsKt__CollectionsKt.emptyList();
        this.originCropText = "";
        this.bgImgTransferObserver = new Observer() { // from class: ts8
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                FaceEditFragment.bgImgTransferObserver$lambda$36(this.f34988a, (FaceEditViewModel.BgImgTransferProgress) obj);
            }
        };
        this.fontTransferObserver = new Observer() { // from class: us8
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                FaceEditFragment.fontTransferObserver$lambda$39(this.f36082a, ((Integer) obj).intValue());
            }
        };
        this.imageChangeListener = new Function1() { // from class: vs8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceEditFragment.imageChangeListener$lambda$55(this.f37181a, ((Boolean) obj).booleanValue());
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ jx8 access$getMBinding(FaceEditFragment faceEditFragment) {
        return (jx8) faceEditFragment.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FaceEditViewModel access$getMViewModel(FaceEditFragment faceEditFragment) {
        return (FaceEditViewModel) faceEditFragment.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addListener() {
        ((jx8) getMBinding()).E.setOnTextChangeListener(new Function2() { // from class: hs8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FaceEditFragment.addListener$lambda$42(this.f20401a, (FaceEditLiteralBean) obj, (List) obj2);
            }
        });
        ((jx8) getMBinding()).E.setOnStyleSelectListener(new Function1() { // from class: is8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceEditFragment.addListener$lambda$43(this.f22043a, ((Integer) obj).intValue());
            }
        });
        ((jx8) getMBinding()).E.setOnPositionSelectListener(new Function1() { // from class: js8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceEditFragment.addListener$lambda$45(this.f23088a, ((Integer) obj).intValue());
            }
        });
        ((jx8) getMBinding()).E.setOnFaceEditFontStyleSelectListener(new Function1() { // from class: ks8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceEditFragment.addListener$lambda$46(this.f24256a, ((Integer) obj).intValue());
            }
        });
        ((jx8) getMBinding()).E.setOnColorGroupSelectListener(new Function1() { // from class: ms8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceEditFragment.addListener$lambda$47(this.f27154a, ((Integer) obj).intValue());
            }
        });
        ((jx8) getMBinding()).E.setOnFaceEditSlotClickListener(new Function1() { // from class: ns8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceEditFragment.addListener$lambda$49(this.f28320a, ((Integer) obj).intValue());
            }
        });
        ((jx8) getMBinding()).E.setOnPhotoClickListener(new Function0() { // from class: os8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceEditFragment.addListener$lambda$50(this.f29648a);
            }
        });
        ((jx8) getMBinding()).E.setOnVideoClickListener(new Function0() { // from class: ps8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceEditFragment.addListener$lambda$51(this.f30701a);
            }
        });
        ((jx8) getMBinding()).B.setOnTouchListener(new View.OnTouchListener() { // from class: qs8
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return FaceEditFragment.addListener$lambda$52(this.f31797a, view, motionEvent);
            }
        });
        FaceEditPhotoHelper.INSTANCE.addImageChangeListener(this.imageChangeListener);
        ((jx8) getMBinding()).F.setOnClickListener(new View.OnClickListener() { // from class: rs8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FaceEditFragment.addListener$lambda$53(this.f32851a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit addListener$lambda$42(FaceEditFragment this$0, FaceEditLiteralBean bean, List textList) {
        DialEditEntity dialEditEntity;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bean, "bean");
        Intrinsics.checkNotNullParameter(textList, "textList");
        Logger.i(TAG, "onTextChange: " + textList);
        List<Theme> normalThemeList = this$0.getDialWatchFace().getNormalThemeList();
        Theme theme = normalThemeList != null ? normalThemeList.get(this$0.getDialWatchFace().getThemeIndex()) : null;
        if (theme != null && (dialEditEntity = theme.getDialEditEntity()) != null) {
            dialEditEntity.setTextItemList(CollectionsKt__CollectionsKt.mutableListOf(bean));
        }
        this$0.getDialWatchFace().setTextList(CollectionsKt___CollectionsKt.toMutableList((Collection) textList));
        refreshPreview$default(this$0, 0, null, 3, null);
        FaceEditPicker faceEditPicker = ((jx8) this$0.getMBinding()).E;
        DialWatchFace dialWatchFace = this$0.getDialWatchFace();
        String str = this$0.unzipPath;
        String str2 = this$0.photoId;
        WatchFace watchFace = this$0.mInfo;
        Intrinsics.checkNotNull(watchFace);
        faceEditPicker.setData(dialWatchFace, str, str2, watchFace, (176 & 16) != 0 ? false : false, (176 & 32) != 0 ? null : null, (176 & 64) != 0 ? -1 : 9, (176 & 128) != 0 ? null : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit addListener$lambda$43(FaceEditFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "onStyleSelect: " + i);
        this$0.getDialWatchFace().setThemeIndex(i);
        refreshPreview$default(this$0, 0, null, 3, null);
        FaceEditPicker faceEditPicker = ((jx8) this$0.getMBinding()).E;
        DialWatchFace dialWatchFace = this$0.getDialWatchFace();
        String str = this$0.unzipPath;
        String str2 = this$0.photoId;
        WatchFace watchFace = this$0.mInfo;
        Intrinsics.checkNotNull(watchFace);
        faceEditPicker.setData(dialWatchFace, str, str2, watchFace, (176 & 16) != 0 ? false : false, (176 & 32) != 0 ? null : null, (176 & 64) != 0 ? -1 : 2, (176 & 128) != 0 ? null : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit addListener$lambda$45(FaceEditFragment this$0, int i) {
        DialEditEntity dialEditEntity;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "onPositionSelect: " + i);
        List<Theme> normalThemeList = this$0.getDialWatchFace().getNormalThemeList();
        Theme theme = normalThemeList != null ? normalThemeList.get(this$0.getDialWatchFace().getThemeIndex()) : null;
        if (theme != null && (dialEditEntity = theme.getDialEditEntity()) != null) {
            dialEditEntity.setPositionIndex(i);
        }
        refreshPreview$default(this$0, 0, null, 3, null);
        FaceEditPicker faceEditPicker = ((jx8) this$0.getMBinding()).E;
        DialWatchFace dialWatchFace = this$0.getDialWatchFace();
        String str = this$0.unzipPath;
        String str2 = this$0.photoId;
        WatchFace watchFace = this$0.mInfo;
        Intrinsics.checkNotNull(watchFace);
        faceEditPicker.setData(dialWatchFace, str, str2, watchFace, (176 & 16) != 0 ? false : false, (176 & 32) != 0 ? null : null, (176 & 64) != 0 ? -1 : 4, (176 & 128) != 0 ? null : null);
        Iterator<T> it = FaceEditPhotoHelper.INSTANCE.getCurrentPhotoList(this$0.photoId).iterator();
        while (it.hasNext()) {
            ((FaceEditPhotoBean) it.next()).setPositionIndex(i);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit addListener$lambda$46(FaceEditFragment this$0, int i) {
        DialEditEntity dialEditEntity;
        SlotEditItem fontSlotEditItem;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "onFontSelect: " + i);
        List<Theme> normalThemeList = this$0.getDialWatchFace().getNormalThemeList();
        Theme theme = normalThemeList != null ? normalThemeList.get(this$0.getDialWatchFace().getThemeIndex()) : null;
        if (theme != null && (dialEditEntity = theme.getDialEditEntity()) != null && (fontSlotEditItem = dialEditEntity.getFontSlotEditItem()) != null) {
            fontSlotEditItem.setSelectWidgetIndex(i);
        }
        refreshPreview$default(this$0, 0, null, 3, null);
        FaceEditPicker faceEditPicker = ((jx8) this$0.getMBinding()).E;
        DialWatchFace dialWatchFace = this$0.getDialWatchFace();
        String str = this$0.unzipPath;
        String str2 = this$0.photoId;
        WatchFace watchFace = this$0.mInfo;
        Intrinsics.checkNotNull(watchFace);
        faceEditPicker.setData(dialWatchFace, str, str2, watchFace, (176 & 16) != 0 ? false : false, (176 & 32) != 0 ? null : null, (176 & 64) != 0 ? -1 : 5, (176 & 128) != 0 ? null : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit addListener$lambda$47(FaceEditFragment this$0, int i) {
        DialEditEntity dialEditEntity;
        DialEditEntity dialEditEntity2;
        DialEditEntity dialEditEntity3;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "onColorGroupSelect: " + i);
        List<Theme> normalThemeList = this$0.getDialWatchFace().getNormalThemeList();
        Theme theme = normalThemeList != null ? normalThemeList.get(this$0.getDialWatchFace().getThemeIndex()) : null;
        if (theme != null && (dialEditEntity2 = theme.getDialEditEntity()) != null && dialEditEntity2.getColorGroupIndex() == -1) {
            DialEditEntity dialEditEntity4 = theme.getDialEditEntity();
            if ((dialEditEntity4 == null || dialEditEntity4.getRecolorIndex() != -1) && (dialEditEntity3 = theme.getDialEditEntity()) != null) {
                dialEditEntity3.setRecolorIndex(i);
            }
        } else if (theme != null && (dialEditEntity = theme.getDialEditEntity()) != null) {
            dialEditEntity.setColorGroupIndex(i);
        }
        refreshPreview$default(this$0, 0, null, 3, null);
        FaceEditPicker faceEditPicker = ((jx8) this$0.getMBinding()).E;
        DialWatchFace dialWatchFace = this$0.getDialWatchFace();
        String str = this$0.unzipPath;
        String str2 = this$0.photoId;
        WatchFace watchFace = this$0.mInfo;
        Intrinsics.checkNotNull(watchFace);
        faceEditPicker.setData(dialWatchFace, str, str2, watchFace, (176 & 16) != 0 ? false : false, (176 & 32) != 0 ? null : null, (176 & 64) != 0 ? -1 : 6, (176 & 128) != 0 ? null : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addListener$lambda$49(final FaceEditFragment this$0, final int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showSlotSelectDialog(i, new Function1() { // from class: bt8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceEditFragment.addListener$lambda$49$lambda$48(this.f4586a, i, ((Integer) obj).intValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit addListener$lambda$49$lambda$48(FaceEditFragment this$0, int i, int i2) {
        DialEditEntity dialEditEntity;
        List<SlotEditItem> slotItemList;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i2 < 0) {
            return Unit.INSTANCE;
        }
        List<Theme> normalThemeList = this$0.getDialWatchFace().getNormalThemeList();
        Theme theme = normalThemeList != null ? normalThemeList.get(this$0.getDialWatchFace().getThemeIndex()) : null;
        SlotEditItem slotEditItem = (theme == null || (dialEditEntity = theme.getDialEditEntity()) == null || (slotItemList = dialEditEntity.getSlotItemList()) == null) ? null : slotItemList.get(i);
        if (slotEditItem != null) {
            slotEditItem.setSelectWidgetIndex(i2);
        }
        refreshPreview$default(this$0, -1, null, 2, null);
        FaceEditPicker faceEditPicker = ((jx8) this$0.getMBinding()).E;
        DialWatchFace dialWatchFace = this$0.getDialWatchFace();
        String str = this$0.unzipPath;
        String str2 = this$0.photoId;
        WatchFace watchFace = this$0.mInfo;
        Intrinsics.checkNotNull(watchFace);
        faceEditPicker.setData(dialWatchFace, str, str2, watchFace, (176 & 16) != 0 ? false : false, (176 & 32) != 0 ? null : null, (176 & 64) != 0 ? -1 : 8, (176 & 128) != 0 ? null : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addListener$lambda$50(FaceEditFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        gotoPhotoPickerPage$default(this$0, 0, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addListener$lambda$51(FaceEditFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.gotoPhotoPickerPage(2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean addListener$lambda$52(FaceEditFragment this$0, View view, MotionEvent motionEvent) {
        CardView cardView;
        CardView cardView2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            ((jx8) this$0.getMBinding()).B.getParent().requestDisallowInterceptTouchEvent(true);
            refreshPreview$default(this$0, 0, DialEditHelper.INSTANCE.getAodTheme(this$0.getDialWatchFace()), 1, null);
            Theme currentTheme = this$0.getDialWatchFace().getCurrentTheme();
            if (currentTheme != null && currentTheme.isVideoWatchFace() && (cardView = ((jx8) this$0.getMBinding()).M) != null) {
                cardView.setVisibility(4);
            }
        } else if (actionMasked == 1) {
            ((jx8) this$0.getMBinding()).B.getParent().requestDisallowInterceptTouchEvent(false);
            refreshPreview$default(this$0, 0, null, 3, null);
            Theme currentTheme2 = this$0.getDialWatchFace().getCurrentTheme();
            if (currentTheme2 != null && currentTheme2.isVideoWatchFace() && (cardView2 = ((jx8) this$0.getMBinding()).M) != null) {
                cardView2.setVisibility(0);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addListener$lambda$53(FaceEditFragment this$0, View view) {
        MediaPlayer mediaPlayer;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<FaceEditPhotoBean> currentPhotoList = FaceEditPhotoHelper.INSTANCE.getCurrentPhotoList(this$0.photoId);
        if (currentPhotoList.isEmpty()) {
            Theme currentTheme = this$0.getDialWatchFace().getCurrentTheme();
            if (currentTheme == null || !currentTheme.isVideoWatchFace() || (mediaPlayer = this$0.mediaPlayer) == null || mediaPlayer.isPlaying()) {
                return;
            }
            MediaPlayer mediaPlayer2 = this$0.mediaPlayer;
            if (mediaPlayer2 != null) {
                mediaPlayer2.seekTo(0);
            }
            MediaPlayer mediaPlayer3 = this$0.mediaPlayer;
            if (mediaPlayer3 != null) {
                mediaPlayer3.start();
                return;
            }
            return;
        }
        this$0.currentPreviewImage = (this$0.currentPreviewImage + 1) % currentPhotoList.size();
        Theme currentTheme2 = this$0.getDialWatchFace().getCurrentTheme();
        if (currentTheme2 == null || !currentTheme2.isVideoWatchFace()) {
            refreshPreview$default(this$0, 0, null, 3, null);
            return;
        }
        if (currentPhotoList.isEmpty()) {
            return;
        }
        FaceEditPhotoBean faceEditPhotoBean = currentPhotoList.get(this$0.currentPreviewImage);
        if (faceEditPhotoBean.getBackgroundImage().getCropPath() != null) {
            String cropPath = faceEditPhotoBean.getBackgroundImage().getCropPath();
            Intrinsics.checkNotNull(cropPath);
            if (new File(cropPath).exists()) {
                try {
                    MediaPlayer mediaPlayer4 = this$0.mediaPlayer;
                    if (mediaPlayer4 != null) {
                        mediaPlayer4.reset();
                    }
                    MediaPlayer mediaPlayer5 = this$0.mediaPlayer;
                    if (mediaPlayer5 != null) {
                        mediaPlayer5.setDataSource(faceEditPhotoBean.getBackgroundImage().getCropPath());
                    }
                    MediaPlayer mediaPlayer6 = this$0.mediaPlayer;
                    if (mediaPlayer6 != null) {
                        mediaPlayer6.prepare();
                    }
                    MediaPlayer mediaPlayer7 = this$0.mediaPlayer;
                    if (mediaPlayer7 != null) {
                        mediaPlayer7.start();
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Exception e) {
                    Logger.e(TAG, "mediaplayer change source error " + e.getMessage());
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
    }

    private final boolean bgImgChanged() {
        List<FaceEditPhotoBean> list = this.originImageList;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("originImageList");
            list = null;
        }
        if (list.size() != FaceEditPhotoHelper.INSTANCE.getCurrentPhotoList(this.photoId).size()) {
            return true;
        }
        return indexPhotoChange();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bgImgTransferObserver$lambda$36(FaceEditFragment this$0, FaceEditViewModel.BgImgTransferProgress it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onImgTransfer(it);
    }

    private final void checkConnect(Function0<Unit> action) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected()) {
            action.invoke();
        } else {
            new CommonDialog.c("face_check_connect").setDialogTitle(p1j.q).setDialogDescription(p1j.p).setPositiveText(p1j.d).setNegativeText(p1j.c).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.watch.face.FaceEditFragment.checkConnect.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -2) {
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                    } else {
                        if (which != -1) {
                            return;
                        }
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        Bundle bundle = new Bundle();
                        bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_DEVICE());
                        Context context = FaceEditFragment.this.getContext();
                        if (context != null) {
                            MainExtKt.showMainActivity$default(context, null, bundle, 2, null);
                        }
                    }
                }
            }).showIfNeed(getChildFragmentManager());
            hideLoading();
        }
    }

    private final void checkEditTextEmpty(Function0<Unit> allFilled) {
        DialEditEntity dialEditEntity;
        List<FaceEditLiteralBean> textItemList;
        List<Theme> normalThemeList = getDialWatchFace().getNormalThemeList();
        FaceEditLiteralBean faceEditLiteralBean = null;
        Theme theme = normalThemeList != null ? normalThemeList.get(getDialWatchFace().getThemeIndex()) : null;
        int i = 0;
        if (theme != null && (dialEditEntity = theme.getDialEditEntity()) != null && (textItemList = dialEditEntity.getTextItemList()) != null) {
            faceEditLiteralBean = (FaceEditLiteralBean) CollectionsKt___CollectionsKt.getOrNull(textItemList, 0);
        }
        if (faceEditLiteralBean == null) {
            allFilled.invoke();
            return;
        }
        List<String> textList = getDialWatchFace().getTextList();
        if (textList == null) {
            textList = new ArrayList<>();
        }
        List<String> list = textList;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() == 0 && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
            if (i > 0) {
                showEditTextEmpty(faceEditLiteralBean, textList);
                return;
            }
        }
        allFilled.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void cropFontFile(Function1<? super File, Unit> success) {
        List arrayList;
        DialEditEntity dialEditEntity;
        if (!getDialWatchFace().getSupportLiteral()) {
            success.invoke2(null);
            return;
        }
        List<Theme> normalThemeList = getDialWatchFace().getNormalThemeList();
        Theme theme = normalThemeList != null ? normalThemeList.get(getDialWatchFace().getThemeIndex()) : null;
        List<FaceEditLiteralBean> textItemList = (theme == null || (dialEditEntity = theme.getDialEditEntity()) == null) ? null : dialEditEntity.getTextItemList();
        List<String> textList = getDialWatchFace().getTextList();
        if (textList == null || (arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) textList)) == null) {
            arrayList = new ArrayList();
        }
        String fontName = "";
        if (textItemList != null) {
            for (FaceEditLiteralBean faceEditLiteralBean : textItemList) {
                String fontName2 = faceEditLiteralBean.getFontName();
                if (fontName2 != null && fontName2.length() != 0) {
                    fontName = faceEditLiteralBean.getFontName();
                    Intrinsics.checkNotNull(fontName);
                }
            }
        }
        if (arrayList.isEmpty()) {
            success.invoke2(null);
        } else {
            ((FaceEditViewModel) getMViewModel()).cropFontFile(this.unzipPath, fontName, CollectionsKt___CollectionsKt.joinToString$default(StringsKt___StringsKt.toSet(CollectionsKt___CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null)), "", null, null, 0, null, null, 62, null), success);
        }
    }

    private final void deleteOriginVideoIfNeed() {
        Theme currentTheme;
        DialWatchFace dialWatchFace = getDialWatchFace();
        if (dialWatchFace == null || (currentTheme = dialWatchFace.getCurrentTheme()) == null || !currentTheme.isVideoWatchFace()) {
            return;
        }
        AnyExtKt.io$default(null, new C33341(null), 1, null);
    }

    private final void editFail() {
        syncFace();
        finishEdit();
    }

    private final List<Integer> fillEditItemIndexList(DialWatchFace face) {
        Theme theme;
        DialEditEntity dialEditEntity;
        ArrayList arrayList = new ArrayList();
        List<Theme> normalThemeList = getDialWatchFace().getNormalThemeList();
        if (normalThemeList != null && (theme = normalThemeList.get(face.getThemeIndex())) != null && (dialEditEntity = theme.getDialEditEntity()) != null) {
            arrayList.add(Integer.valueOf(dialEditEntity.getRecolorIndex()));
            arrayList.add(Integer.valueOf(dialEditEntity.getColorGroupIndex()));
            arrayList.add(Integer.valueOf(dialEditEntity.getPositionIndex()));
            SlotEditItem dialSlotEditItem = dialEditEntity.getDialSlotEditItem();
            arrayList.add(Integer.valueOf(dialSlotEditItem != null ? dialSlotEditItem.getSelectWidgetIndex() : -1));
            SlotEditItem timeSlotEditItem = dialEditEntity.getTimeSlotEditItem();
            arrayList.add(Integer.valueOf(timeSlotEditItem != null ? timeSlotEditItem.getSelectWidgetIndex() : -1));
            SlotEditItem fontSlotEditItem = dialEditEntity.getFontSlotEditItem();
            arrayList.add(Integer.valueOf(fontSlotEditItem != null ? fontSlotEditItem.getSelectWidgetIndex() : -1));
            Iterator<SlotEditItem> it = dialEditEntity.getSlotItemList().iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(it.next().getSelectWidgetIndex()));
            }
            arrayList.add(Integer.valueOf(dialEditEntity.getRecolorIndex()));
            arrayList.add(Integer.valueOf(dialEditEntity.getSlotItemEditProcessIndex()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fillNewImageList() {
        boolean z;
        ((FaceEditViewModel) getMViewModel()).getNewImageList().clear();
        this.needOrderList = false;
        this.deleteAll = false;
        List<FaceEditPhotoBean> currentPhotoList = FaceEditPhotoHelper.INSTANCE.getCurrentPhotoList(this.photoId);
        List<FaceEditPhotoBean> list = this.originImageList;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("originImageList");
            list = null;
        }
        if (!startWith(currentPhotoList, list)) {
            this.needOrderList = true;
        }
        if (currentPhotoList.size() != 0) {
            z = false;
        } else {
            List<FaceEditPhotoBean> list2 = this.originImageList;
            if (list2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("originImageList");
                list2 = null;
            }
            if (list2.size() != 0) {
                z = true;
            } else {
                z = false;
            }
        }
        this.deleteAll = z;
        int size = currentPhotoList.size();
        for (int i = 0; i < size; i++) {
            List<FaceEditPhotoBean> list3 = this.originImageList;
            if (list3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("originImageList");
                list3 = null;
            }
            int size2 = list3.size();
            boolean z2 = false;
            for (int i2 = 0; i2 < size2; i2++) {
                String str = FaceEditPhotoBeanKt.toWatchFaceGroup(currentPhotoList.get(i)).c;
                List<FaceEditPhotoBean> list4 = this.originImageList;
                if (list4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("originImageList");
                    list4 = null;
                }
                if (Intrinsics.areEqual(str, FaceEditPhotoBeanKt.toWatchFaceGroup(list4.get(i2)).c)) {
                    z2 = true;
                }
            }
            if (!z2) {
                ((FaceEditViewModel) getMViewModel()).getNewImageList().add(currentPhotoList.get(i));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void finishEdit() {
        deleteOriginVideoIfNeed();
        ((FaceEditViewModel) getMViewModel()).dismissDialog();
        FaceManager faceManager = FaceManager.INSTANCE;
        WatchFace watchFace = this.mInfo;
        WatchFace face = faceManager.getFace(watchFace != null ? watchFace.getId() : null);
        if (face == null) {
            face = this.mInfo;
        }
        this.mInfo = face;
        List<String> textList = DialEditDeviceHelper.INSTANCE.getTextList(getDialWatchFace());
        this.originTextList = textList;
        this.originCropText = CollectionsKt___CollectionsKt.joinToString$default(StringsKt___StringsKt.toSet(CollectionsKt___CollectionsKt.joinToString$default(textList, "", null, null, 0, null, null, 62, null)), "", null, null, 0, null, null, 62, null);
        Logger.i(TAG, "finishEdit: " + this.mInfo);
        Context context = getContext();
        if (context != null) {
            ToastExtKt.toastShort(context, FaceBleInfoViewModelKt.getTip(this.editCode));
        }
        this.editCode = 10;
        this.themeIndex = getDialWatchFace().getThemeIndex();
        this.currentEditItemIndexList.clear();
        this.currentEditItemIndexList.addAll(fillEditItemIndexList(getDialWatchFace()));
        this.needOrderList = false;
        initSaveBtn(isConfigChange());
    }

    private final boolean fontFileChange() {
        if (this.fontFile == null) {
            return false;
        }
        return !Intrinsics.areEqual(CollectionsKt___CollectionsKt.joinToString$default(StringsKt___StringsKt.toSet(CollectionsKt___CollectionsKt.joinToString$default(DialEditDeviceHelper.INSTANCE.getTextList(getDialWatchFace()), "", null, null, 0, null, null, 62, null)), "", null, null, 0, null, null, 62, null), this.originCropText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fontTransferObserver$lambda$39(FaceEditFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onFontTransfer(i);
    }

    private final String getDefaultVideoThumb() {
        Object obj;
        ResourceFile resourceFile;
        Map<String, Object> resourceMap;
        Map<String, Object> resourceMap2;
        Map<String, Object> resourceMap3;
        try {
            Theme theme = DialEditHelper.INSTANCE.getTheme(getDialWatchFace());
            if (theme != null && !theme.isVideoWatchFace()) {
                return null;
            }
            DialWatchFace dialWatchFace = getDialWatchFace();
            if (dialWatchFace == null || (resourceMap3 = dialWatchFace.getResourceMap()) == null) {
                obj = null;
            } else {
                obj = resourceMap3.get(theme != null ? theme.getBg() : null);
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.edit.entity.Sprite");
            Sprite sprite = (Sprite) obj;
            String refExt = sprite.getRefExt();
            if (refExt == null || refExt.length() == 0) {
                DialWatchFace dialWatchFace2 = getDialWatchFace();
                Object obj2 = (dialWatchFace2 == null || (resourceMap = dialWatchFace2.getResourceMap()) == null) ? null : resourceMap.get(sprite.getRef());
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.edit.entity.ResourceFile");
                resourceFile = (ResourceFile) obj2;
            } else {
                DialWatchFace dialWatchFace3 = getDialWatchFace();
                Object obj3 = (dialWatchFace3 == null || (resourceMap2 = dialWatchFace3.getResourceMap()) == null) ? null : resourceMap2.get(sprite.getRefExt());
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.edit.entity.ResourceFile");
                resourceFile = (ResourceFile) obj3;
            }
            DialFileUtils dialFileUtils = DialFileUtils.INSTANCE;
            String path = new File(dialFileUtils.getDialResourceFilePath(this.unzipPath), resourceFile.getFileName()).getPath();
            Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
            return dialFileUtils.getVideoThumb(path);
        } catch (Exception e) {
            Logger.e(TAG, "getDefaultVideoThumb fail " + e.getMessage());
            return null;
        }
    }

    private final FaceDialog getProgressDialog() {
        return (FaceDialog) this.progressDialog.getValue();
    }

    private final void gotoPhotoPickerPage(int pickType) {
        Bundle bundle = new Bundle();
        bundle.putString(FaceEditPhotoPickerFragment.FACE_PHOTO_ID, this.photoId);
        WatchFace watchFace = this.mInfo;
        Intrinsics.checkNotNull(watchFace);
        bundle.putString(FaceEditPhotoPickerFragment.FACE_ID, watchFace.getId());
        bundle.putInt(FaceEditPhotoPickerFragment.FACE_PICK_TYPE, pickType);
        bundle.putString(FACE_UNZIP_PATH, this.unzipPath);
        bundle.putParcelable(FaceInfoBase.FACE_INFO, this.mInfo);
        Unit unit = Unit.INSTANCE;
        BaseFragmentExKt.gotoPage(this, FaceEditPhotoPickerFragment.class, bundle);
    }

    public static /* synthetic */ void gotoPhotoPickerPage$default(FaceEditFragment faceEditFragment, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        faceEditFragment.gotoPhotoPickerPage(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit imageChangeListener$lambda$55(FaceEditFragment this$0, boolean z) {
        Theme currentTheme;
        DialEditEntity dialEditEntity;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.fillNewImageList();
        this$0.currentPreviewImage = 0;
        List<FaceEditPhotoBean> currentPhotoList = FaceEditPhotoHelper.INSTANCE.getCurrentPhotoList(this$0.photoId);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : currentPhotoList) {
            if (hashSet.add(Integer.valueOf(((FaceEditPhotoBean) obj).getPositionIndex()))) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == 1 && (currentTheme = this$0.getDialWatchFace().getCurrentTheme()) != null && (dialEditEntity = currentTheme.getDialEditEntity()) != null) {
            dialEditEntity.setPositionIndex(((FaceEditPhotoBean) arrayList.get(0)).getPositionIndex());
        }
        FaceEditPicker faceEditPicker = ((jx8) this$0.getMBinding()).E;
        DialWatchFace dialWatchFace = this$0.getDialWatchFace();
        String str = this$0.unzipPath;
        String str2 = this$0.photoId;
        WatchFace watchFace = this$0.mInfo;
        Intrinsics.checkNotNull(watchFace);
        faceEditPicker.setData(dialWatchFace, str, str2, watchFace, (176 & 16) != 0 ? false : false, (176 & 32) != 0 ? null : currentPhotoList, (176 & 64) != 0 ? -1 : 0, (176 & 128) != 0 ? null : null);
        Theme currentTheme2 = this$0.getDialWatchFace().getCurrentTheme();
        if (currentTheme2 != null && currentTheme2.isVideoWatchFace()) {
            loadMediaPlayer$default(this$0, 0, null, true, 3, null);
        }
        refreshPreview$default(this$0, 0, null, 3, null);
        return Unit.INSTANCE;
    }

    private final boolean indexPhotoChange() {
        List<FaceEditPhotoBean> currentPhotoList = FaceEditPhotoHelper.INSTANCE.getCurrentPhotoList(this.photoId);
        List<FaceEditPhotoBean> list = this.originImageList;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("originImageList");
            list = null;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            w5r.a watchFaceGroup = FaceEditPhotoBeanKt.toWatchFaceGroup(currentPhotoList.get(i));
            List<FaceEditPhotoBean> list2 = this.originImageList;
            if (list2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("originImageList");
                list2 = null;
            }
            w5r.a watchFaceGroup2 = FaceEditPhotoBeanKt.toWatchFaceGroup(list2.get(i));
            if (!Intrinsics.areEqual(watchFaceGroup.c, watchFaceGroup2.c) || watchFaceGroup.d != watchFaceGroup2.d) {
                return true;
            }
        }
        return false;
    }

    private final void initSaveBtn(boolean isSetChange) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        setActionBarNormalTitleMode();
        setButton(isSetChange);
        if (!FaceManager.INSTANCE.canRemove(this.mInfo)) {
            b39 b39Var = this.titleBarBinding;
            if (b39Var == null || (textView = b39Var.B) == null) {
                return;
            }
            ViewExtKt.gone(textView);
            return;
        }
        b39 b39Var2 = this.titleBarBinding;
        if (b39Var2 != null && (textView3 = b39Var2.B) != null) {
            textView3.setOnClickListener(new View.OnClickListener() { // from class: ws8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaceEditFragment.initSaveBtn$lambda$10(this.f38306a, view);
                }
            });
        }
        b39 b39Var3 = this.titleBarBinding;
        if (b39Var3 == null || (textView2 = b39Var3.B) == null) {
            return;
        }
        textView2.setContentDescription(getString(p1j.f29913k));
    }

    public static /* synthetic */ void initSaveBtn$default(FaceEditFragment faceEditFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        faceEditFragment.initSaveBtn(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSaveBtn$lambda$10(final FaceEditFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        a4i a4iVar = new a4i(this$0.requireContext(), view);
        a4iVar.f(twi.f35139a);
        a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: it8
            @Override // a4i.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return FaceEditFragment.initSaveBtn$lambda$10$lambda$9(this.f22071a, menuItem);
            }
        });
        a4iVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initSaveBtn$lambda$10$lambda$9(final FaceEditFragment this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (menuItem.getItemId() != isi.g1) {
            return true;
        }
        this$0.showLoading();
        this$0.checkConnect(new Function0() { // from class: cs8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceEditFragment.initSaveBtn$lambda$10$lambda$9$lambda$8(this.f14669a);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initSaveBtn$lambda$10$lambda$9$lambda$8(final FaceEditFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FaceEditViewModel faceEditViewModel = (FaceEditViewModel) this$0.getMViewModel();
        WatchFace watchFace = this$0.mInfo;
        Intrinsics.checkNotNull(watchFace);
        faceEditViewModel.deleteFace(watchFace.getId(), new Function1() { // from class: gs8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceEditFragment.initSaveBtn$lambda$10$lambda$9$lambda$8$lambda$7(this.f19294a, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initSaveBtn$lambda$10$lambda$9$lambda$8$lambda$7(FaceEditFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z) {
            ((FaceEditViewModel) this$0.getMViewModel()).dismissDialog();
            this$0.initSaveBtn(this$0.isConfigChange());
            Context context = this$0.getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, p1j.common_delete_failure);
            }
        }
        return Unit.INSTANCE;
    }

    private final boolean isConfigChange() {
        Logger.i(TAG, "isThemeChange " + isThemeChange() + " isEditChange " + isEditChange() + " bgImgChange " + bgImgChanged() + " isTextChange " + isTextChange());
        return isThemeChange() || isEditChange() || bgImgChanged() || isTextChange();
    }

    private final boolean isEditChange() {
        if (this.dialWatchFace == null) {
            return false;
        }
        List<Integer> listFillEditItemIndexList = fillEditItemIndexList(getDialWatchFace());
        Logger.d(TAG, "ongoing " + listFillEditItemIndexList + " current " + this.currentEditItemIndexList);
        if (listFillEditItemIndexList.size() != this.currentEditItemIndexList.size()) {
            return true;
        }
        int size = listFillEditItemIndexList.size();
        for (int i = 0; i < size; i++) {
            if (listFillEditItemIndexList.get(i).intValue() != this.currentEditItemIndexList.get(i).intValue()) {
                return true;
            }
        }
        return false;
    }

    private final boolean isTextChange() {
        if (this.dialWatchFace == null || !getDialWatchFace().getSupportLiteral()) {
            return false;
        }
        List<String> textList = DialEditDeviceHelper.INSTANCE.getTextList(getDialWatchFace());
        Logger.d(TAG, "current " + textList + " origin " + this.originTextList);
        if (this.originTextList.size() != textList.size()) {
            return true;
        }
        int size = textList.size();
        for (int i = 0; i < size; i++) {
            if (!Intrinsics.areEqual(this.originTextList.get(i), textList.get(i))) {
                return true;
            }
        }
        return false;
    }

    private final boolean isThemeChange() {
        return (this.dialWatchFace == null || this.themeIndex == getDialWatchFace().getThemeIndex()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:34:0x012e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0138  */
    /* JADX WARN: Code duplicated, block: B:37:0x0180  */
    /* JADX WARN: Code duplicated, block: B:39:0x018a  */
    /* JADX WARN: Code duplicated, block: B:43:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:46:0x0203  */
    /* JADX WARN: Code duplicated, block: B:49:0x0215  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object loadEditPickerInfo(Continuation<? super Unit> continuation) {
        C33351 c33351;
        String defaultVideoThumb;
        final FaceEditFragment faceEditFragment;
        List list;
        String str;
        Context context;
        FaceEditScrollLayout faceEditScrollLayout;
        FaceEditScrollLayout faceEditScrollLayout2;
        FaceEditScrollLayout faceEditScrollLayout3;
        if (continuation instanceof C33351) {
            c33351 = (C33351) continuation;
            int i = c33351.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33351.label = i - Integer.MIN_VALUE;
            } else {
                c33351 = new C33351(continuation);
            }
        } else {
            c33351 = new C33351(continuation);
        }
        Object obj = c33351.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c33351.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            defaultVideoThumb = getDefaultVideoThumb();
            if (((FaceEditViewModel) getMViewModel()).getNewImageList().isEmpty()) {
                faceEditFragment = this;
            } else {
                List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) ((FaceEditViewModel) getMViewModel()).getNewImageList());
                FaceEditPhotoHelper faceEditPhotoHelper = FaceEditPhotoHelper.INSTANCE;
                List<FaceEditPhotoBean> list2 = this.originImageList;
                if (list2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("originImageList");
                    list2 = null;
                }
                String str2 = this.photoId;
                c33351.L$0 = this;
                c33351.L$1 = defaultVideoThumb;
                c33351.L$2 = mutableList;
                c33351.label = 1;
                if (faceEditPhotoHelper.initMd5List(list2, str2, c33351) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                faceEditFragment = this;
                list = mutableList;
            }
            str = defaultVideoThumb;
            if (faceEditFragment.mInfo != null) {
                FaceEditPicker faceEditPicker = ((jx8) faceEditFragment.getMBinding()).E;
                DialWatchFace dialWatchFace = faceEditFragment.getDialWatchFace();
                String str3 = faceEditFragment.unzipPath;
                String str4 = faceEditFragment.photoId;
                WatchFace watchFace = faceEditFragment.mInfo;
                Intrinsics.checkNotNull(watchFace);
                faceEditPicker.setData(dialWatchFace, str3, str4, watchFace, (176 & 16) != 0 ? false : ((FaceEditViewModel) faceEditFragment.getMViewModel()).getNewImageList().isEmpty(), (176 & 32) != 0 ? null : null, (176 & 64) != 0 ? -1 : 0, (176 & 128) != 0 ? null : str);
            }
            context = faceEditFragment.getContext();
            if (context == null && UIUtils.INSTANCE.isTabletAndLandscape(context)) {
                faceEditFragment.originHeaderViewWidth = ((jx8) faceEditFragment.getMBinding()).I.getWidth();
                faceEditFragment.originHeaderViewHeight = ((jx8) faceEditFragment.getMBinding()).I.getHeight();
                faceEditFragment.originBottomViewHeight = ((jx8) faceEditFragment.getMBinding()).J.getHeight() - ((jx8) faceEditFragment.getMBinding()).I.getHeight();
                ((jx8) faceEditFragment.getMBinding()).I.setOnClickListener(new View.OnClickListener() { // from class: jt8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FaceEditFragment.loadEditPickerInfo$lambda$22(this.f23112a, view);
                    }
                });
            } else if (((jx8) faceEditFragment.getMBinding()).K == null) {
                faceEditFragment.originHeaderViewWidth = ((jx8) faceEditFragment.getMBinding()).I.getWidth();
                faceEditFragment.originHeaderViewHeight = ((jx8) faceEditFragment.getMBinding()).I.getHeight();
                faceEditFragment.originBottomViewHeight = ((jx8) faceEditFragment.getMBinding()).J.getHeight() - ((jx8) faceEditFragment.getMBinding()).I.getHeight();
                ((jx8) faceEditFragment.getMBinding()).I.setOnClickListener(new View.OnClickListener() { // from class: ht8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FaceEditFragment.loadEditPickerInfo$lambda$21(this.f20426a, view);
                    }
                });
            } else {
                FaceEditScrollLayout faceEditScrollLayout4 = ((jx8) faceEditFragment.getMBinding()).K;
                Integer numBoxInt = faceEditScrollLayout4 != null ? Boxing.boxInt(faceEditScrollLayout4.getHeight()) : null;
                Intrinsics.checkNotNull(numBoxInt);
                int iIntValue = (numBoxInt.intValue() - ((jx8) faceEditFragment.getMBinding()).I.getLayoutParams().height) + ExtUtilsKt.getDp(Boxing.boxInt(44));
                faceEditFragment.mFaceEditViewHeight = iIntValue;
                faceEditFragment.originBottomViewHeight = iIntValue;
                ((jx8) faceEditFragment.getMBinding()).E.getContentScrollView().getLayoutParams().height = ((faceEditFragment.originBottomViewHeight + faceEditFragment.originHeaderViewHeight) - ExtUtilsKt.getDp(Boxing.boxInt(240))) + ((jx8) faceEditFragment.getMBinding()).E.getTabRecyclerView().getHeight();
            }
            faceEditScrollLayout = ((jx8) faceEditFragment.getMBinding()).K;
            if (faceEditScrollLayout != null) {
                faceEditScrollLayout.setBottomViewHeight(faceEditFragment.mFaceEditViewHeight);
            }
            faceEditScrollLayout2 = ((jx8) faceEditFragment.getMBinding()).K;
            if (faceEditScrollLayout2 != null) {
                faceEditScrollLayout2.setOnPreviewResizeListener(new Function3() { // from class: kt8
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        return FaceEditFragment.loadEditPickerInfo$lambda$23(this.f24277a, ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), ((Boolean) obj4).booleanValue());
                    }
                });
            }
            faceEditScrollLayout3 = ((jx8) faceEditFragment.getMBinding()).K;
            if (faceEditScrollLayout3 != null) {
                faceEditScrollLayout3.setOnScrollListener(new Function2() { // from class: lt8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return FaceEditFragment.loadEditPickerInfo$lambda$24(this.f25413a, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                    }
                });
            }
            ((jx8) faceEditFragment.getMBinding()).E.getContentScrollView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: mt8
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view, int i3, int i4, int i5, int i6) {
                    FaceEditFragment.loadEditPickerInfo$lambda$25(this.f27179a, view, i3, i4, i5, i6);
                }
            });
            ((jx8) faceEditFragment.getMBinding()).E.getContentScrollView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.xiaomi.fitness.watch.face.FaceEditFragment.loadEditPickerInfo.7
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    int[] iArr = new int[2];
                    FaceEditFragment.access$getMBinding(FaceEditFragment.this).C.getLocationOnScreen(iArr);
                    FaceDragHelper.INSTANCE.setButtonTop(iArr[1]);
                    FaceEditFragment.access$getMBinding(FaceEditFragment.this).E.getContentScrollView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    FaceEditFragment.this.resizeEmptyView();
                }
            });
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        list = (List) c33351.L$2;
        defaultVideoThumb = (String) c33351.L$1;
        faceEditFragment = (FaceEditFragment) c33351.L$0;
        ResultKt.throwOnFailure(obj);
        FaceEditPhotoHelper faceEditPhotoHelper2 = FaceEditPhotoHelper.INSTANCE;
        List mutableList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) faceEditPhotoHelper2.getCurrentPhotoList(faceEditFragment.photoId));
        mutableList2.addAll(list);
        FaceEditPhotoHelper.setCurrentPhotoList$default(faceEditPhotoHelper2, faceEditFragment.photoId, mutableList2, false, 4, null);
        str = defaultVideoThumb;
        if (faceEditFragment.mInfo != null) {
            FaceEditPicker faceEditPicker2 = ((jx8) faceEditFragment.getMBinding()).E;
            DialWatchFace dialWatchFace2 = faceEditFragment.getDialWatchFace();
            String str5 = faceEditFragment.unzipPath;
            String str6 = faceEditFragment.photoId;
            WatchFace watchFace2 = faceEditFragment.mInfo;
            Intrinsics.checkNotNull(watchFace2);
            faceEditPicker2.setData(dialWatchFace2, str5, str6, watchFace2, (176 & 16) != 0 ? false : ((FaceEditViewModel) faceEditFragment.getMViewModel()).getNewImageList().isEmpty(), (176 & 32) != 0 ? null : null, (176 & 64) != 0 ? -1 : 0, (176 & 128) != 0 ? null : str);
        }
        context = faceEditFragment.getContext();
        if (context == null) {
            if (((jx8) faceEditFragment.getMBinding()).K == null) {
                faceEditFragment.originHeaderViewWidth = ((jx8) faceEditFragment.getMBinding()).I.getWidth();
                faceEditFragment.originHeaderViewHeight = ((jx8) faceEditFragment.getMBinding()).I.getHeight();
                faceEditFragment.originBottomViewHeight = ((jx8) faceEditFragment.getMBinding()).J.getHeight() - ((jx8) faceEditFragment.getMBinding()).I.getHeight();
                ((jx8) faceEditFragment.getMBinding()).I.setOnClickListener(new View.OnClickListener() { // from class: ht8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FaceEditFragment.loadEditPickerInfo$lambda$21(this.f20426a, view);
                    }
                });
            } else {
                FaceEditScrollLayout faceEditScrollLayout5 = ((jx8) faceEditFragment.getMBinding()).K;
                if (faceEditScrollLayout5 != null) {
                }
                Intrinsics.checkNotNull(numBoxInt);
                int iIntValue2 = (numBoxInt.intValue() - ((jx8) faceEditFragment.getMBinding()).I.getLayoutParams().height) + ExtUtilsKt.getDp(Boxing.boxInt(44));
                faceEditFragment.mFaceEditViewHeight = iIntValue2;
                faceEditFragment.originBottomViewHeight = iIntValue2;
                ((jx8) faceEditFragment.getMBinding()).E.getContentScrollView().getLayoutParams().height = ((faceEditFragment.originBottomViewHeight + faceEditFragment.originHeaderViewHeight) - ExtUtilsKt.getDp(Boxing.boxInt(240))) + ((jx8) faceEditFragment.getMBinding()).E.getTabRecyclerView().getHeight();
            }
        } else if (((jx8) faceEditFragment.getMBinding()).K == null) {
            faceEditFragment.originHeaderViewWidth = ((jx8) faceEditFragment.getMBinding()).I.getWidth();
            faceEditFragment.originHeaderViewHeight = ((jx8) faceEditFragment.getMBinding()).I.getHeight();
            faceEditFragment.originBottomViewHeight = ((jx8) faceEditFragment.getMBinding()).J.getHeight() - ((jx8) faceEditFragment.getMBinding()).I.getHeight();
            ((jx8) faceEditFragment.getMBinding()).I.setOnClickListener(new View.OnClickListener() { // from class: ht8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaceEditFragment.loadEditPickerInfo$lambda$21(this.f20426a, view);
                }
            });
        } else {
            FaceEditScrollLayout faceEditScrollLayout6 = ((jx8) faceEditFragment.getMBinding()).K;
            if (faceEditScrollLayout6 != null) {
            }
            Intrinsics.checkNotNull(numBoxInt);
            int iIntValue3 = (numBoxInt.intValue() - ((jx8) faceEditFragment.getMBinding()).I.getLayoutParams().height) + ExtUtilsKt.getDp(Boxing.boxInt(44));
            faceEditFragment.mFaceEditViewHeight = iIntValue3;
            faceEditFragment.originBottomViewHeight = iIntValue3;
            ((jx8) faceEditFragment.getMBinding()).E.getContentScrollView().getLayoutParams().height = ((faceEditFragment.originBottomViewHeight + faceEditFragment.originHeaderViewHeight) - ExtUtilsKt.getDp(Boxing.boxInt(240))) + ((jx8) faceEditFragment.getMBinding()).E.getTabRecyclerView().getHeight();
        }
        faceEditScrollLayout = ((jx8) faceEditFragment.getMBinding()).K;
        if (faceEditScrollLayout != null) {
            faceEditScrollLayout.setBottomViewHeight(faceEditFragment.mFaceEditViewHeight);
        }
        faceEditScrollLayout2 = ((jx8) faceEditFragment.getMBinding()).K;
        if (faceEditScrollLayout2 != null) {
            faceEditScrollLayout2.setOnPreviewResizeListener(new Function3() { // from class: kt8
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return FaceEditFragment.loadEditPickerInfo$lambda$23(this.f24277a, ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), ((Boolean) obj4).booleanValue());
                }
            });
        }
        faceEditScrollLayout3 = ((jx8) faceEditFragment.getMBinding()).K;
        if (faceEditScrollLayout3 != null) {
            faceEditScrollLayout3.setOnScrollListener(new Function2() { // from class: lt8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return FaceEditFragment.loadEditPickerInfo$lambda$24(this.f25413a, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                }
            });
        }
        ((jx8) faceEditFragment.getMBinding()).E.getContentScrollView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: mt8
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i3, int i4, int i5, int i6) {
                FaceEditFragment.loadEditPickerInfo$lambda$25(this.f27179a, view, i3, i4, i5, i6);
            }
        });
        ((jx8) faceEditFragment.getMBinding()).E.getContentScrollView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.xiaomi.fitness.watch.face.FaceEditFragment.loadEditPickerInfo.7
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                int[] iArr = new int[2];
                FaceEditFragment.access$getMBinding(FaceEditFragment.this).C.getLocationOnScreen(iArr);
                FaceDragHelper.INSTANCE.setButtonTop(iArr[1]);
                FaceEditFragment.access$getMBinding(FaceEditFragment.this).E.getContentScrollView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                FaceEditFragment.this.resizeEmptyView();
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadEditPickerInfo$lambda$21(FaceEditFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.scaleAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadEditPickerInfo$lambda$22(FaceEditFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.scaleAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit loadEditPickerInfo$lambda$23(FaceEditFragment this$0, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.mFaceEditViewHeight = ((jx8) this$0.getMBinding()).E.getHeight();
        } else {
            int i3 = this$0.mFaceEditViewHeight - i;
            FaceEditScrollLayout faceEditScrollLayout = ((jx8) this$0.getMBinding()).K;
            Intrinsics.checkNotNull(faceEditScrollLayout);
            faceEditScrollLayout.setBottomViewHeight(i3);
            int i4 = FaceIcon.INFO_HEIGHT;
            float f = (float) (((((double) i4) * 1.14d) + ((double) (i2 / 9))) / (((double) i4) * 1.14d));
            this$0.ratio = f;
            this$0.refreshPreview(f);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadEditPickerInfo$lambda$24(FaceEditFragment this$0, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i >= ExtUtilsKt.getDp(240) && i <= (this$0.originHeaderViewHeight + ExtUtilsKt.getDp(218)) / 2) {
            this$0.scrollAnimation(i, ExtUtilsKt.getDp(240) - i, 0);
        } else if (i > (this$0.originHeaderViewHeight + ExtUtilsKt.getDp(218)) / 2 && i2 > this$0.originBottomViewHeight / 2) {
            this$0.scrollAnimation(i, (this$0.originHeaderViewHeight - ExtUtilsKt.getDp(22)) - i, 1);
        } else {
            if (i2 == 0) {
                this$0.onAnimationEnd(2);
                return Unit.INSTANCE;
            }
            this$0.scrollAnimation(i, i2, 2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void loadEditPickerInfo$lambda$25(FaceEditFragment this$0, View view, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FaceEditScrollLayout faceEditScrollLayout = ((jx8) this$0.getMBinding()).K;
        if (faceEditScrollLayout != null) {
            faceEditScrollLayout.setCanScrollVertically(((jx8) this$0.getMBinding()).E.getContentScrollView().canScrollVertically(-1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0154  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [T, java.io.File] */
    private final void loadMediaPlayer(int slotItemEditProcessIndex, Theme passTheme, final boolean playNow) {
        File file;
        ImageView imageView;
        Object obj;
        ResourceFile resourceFile;
        Map<String, Object> resourceMap;
        Object obj2;
        Map<String, Object> resourceMap2;
        Map<String, Object> resourceMap3;
        Map<String, Object> resourceMap4;
        DialEditEntity dialEditEntity;
        if (passTheme == null) {
            passTheme = DialEditHelper.INSTANCE.getTheme(getDialWatchFace());
        }
        if (passTheme != null && (dialEditEntity = passTheme.getDialEditEntity()) != null) {
            dialEditEntity.setSlotItemEditProcessIndex(slotItemEditProcessIndex);
        }
        DialEditHelper.INSTANCE.setCurrentDiaWatchFace(getDialWatchFace());
        FaceEditPhotoHelper faceEditPhotoHelper = FaceEditPhotoHelper.INSTANCE;
        FaceEditPhotoBean faceEditPhotoBean = faceEditPhotoHelper.getCurrentPhotoList(this.photoId).isEmpty() ? null : faceEditPhotoHelper.getCurrentPhotoList(this.photoId).get(this.currentPreviewImage);
        Logger.i(TAG, "load video index " + this.currentPreviewImage + " " + faceEditPhotoBean);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        try {
            if (faceEditPhotoBean == null) {
                DialWatchFace dialWatchFace = getDialWatchFace();
                if (dialWatchFace == null || (resourceMap4 = dialWatchFace.getResourceMap()) == null) {
                    obj = null;
                } else {
                    obj = resourceMap4.get(passTheme != null ? passTheme.getBg() : null);
                }
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.edit.entity.Sprite");
                Sprite sprite = (Sprite) obj;
                String refExt = sprite.getRefExt();
                if (refExt == null || refExt.length() == 0) {
                    DialWatchFace dialWatchFace2 = getDialWatchFace();
                    Object obj3 = (dialWatchFace2 == null || (resourceMap = dialWatchFace2.getResourceMap()) == null) ? null : resourceMap.get(sprite.getRef());
                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.edit.entity.ResourceFile");
                    resourceFile = (ResourceFile) obj3;
                } else {
                    DialWatchFace dialWatchFace3 = getDialWatchFace();
                    Object obj4 = (dialWatchFace3 == null || (resourceMap3 = dialWatchFace3.getResourceMap()) == null) ? null : resourceMap3.get(sprite.getRefExt());
                    Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.edit.entity.ResourceFile");
                    resourceFile = (ResourceFile) obj4;
                }
                DialFileUtils dialFileUtils = DialFileUtils.INSTANCE;
                objectRef.element = new File(dialFileUtils.getDialResourceFilePath(this.unzipPath), resourceFile.getFileName());
                DialWatchFace dialWatchFace4 = getDialWatchFace();
                if (dialWatchFace4 == null || (resourceMap2 = dialWatchFace4.getResourceMap()) == null) {
                    obj2 = null;
                } else {
                    obj2 = resourceMap2.get(passTheme != null ? passTheme.getPreview() : null);
                }
                Image image = (Image) obj2;
                if ((image != null ? image.getSrc() : null) != null) {
                    file = new File(dialFileUtils.getDialResourceFilePath(this.unzipPath), image.getSrc());
                } else {
                    file = null;
                }
            } else {
                String cropPath = faceEditPhotoBean.getBackgroundImage().getCropPath();
                objectRef.element = cropPath != null ? new File(cropPath) : 0;
                String thumbnailCropPath = faceEditPhotoBean.getBackgroundImage().getThumbnailCropPath();
                if (thumbnailCropPath != null) {
                    file = new File(thumbnailCropPath);
                } else {
                    file = null;
                }
            }
        } catch (Exception e) {
            Logger.e(TAG, "video get fail " + e.getMessage());
        }
        ImageView imageView2 = ((jx8) getMBinding()).N;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (file != null && file.exists() && (imageView = ((jx8) getMBinding()).N) != null) {
            ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(file).target(imageView);
            builderTarget.placeholder(noi.G);
            imageLoader.enqueue(builderTarget.build());
        }
        CardView cardView = ((jx8) getMBinding()).M;
        if (cardView != null) {
            ExtUtilsKt.setVisible(cardView, true);
        }
        if (this.mediaPlayer != null) {
            setVideoSource((File) objectRef.element, playNow);
            return;
        }
        this.mediaPlayer = new MediaPlayer();
        TextureView textureView = ((jx8) getMBinding()).G;
        if ((textureView != null ? textureView.getSurfaceTexture() : null) == null) {
            TextureView textureView2 = ((jx8) getMBinding()).G;
            if (textureView2 != null) {
                textureView2.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: com.xiaomi.fitness.watch.face.FaceEditFragment.loadMediaPlayer.4
                    @Override // android.view.TextureView.SurfaceTextureListener
                    public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {
                        Intrinsics.checkNotNullParameter(surface, "surface");
                        MediaPlayer mediaPlayer = FaceEditFragment.this.mediaPlayer;
                        if (mediaPlayer != null) {
                            mediaPlayer.setSurface(new Surface(surface));
                        }
                        FaceEditFragment.this.setVideoSource(objectRef.element, playNow);
                    }

                    @Override // android.view.TextureView.SurfaceTextureListener
                    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
                        Intrinsics.checkNotNullParameter(surface, "surface");
                        return true;
                    }

                    @Override // android.view.TextureView.SurfaceTextureListener
                    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {
                        Intrinsics.checkNotNullParameter(surface, "surface");
                    }

                    @Override // android.view.TextureView.SurfaceTextureListener
                    public void onSurfaceTextureUpdated(SurfaceTexture surface) {
                        Intrinsics.checkNotNullParameter(surface, "surface");
                    }
                });
                return;
            }
            return;
        }
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            TextureView textureView3 = ((jx8) getMBinding()).G;
            mediaPlayer.setSurface(new Surface(textureView3 != null ? textureView3.getSurfaceTexture() : null));
        }
        setVideoSource((File) objectRef.element, playNow);
    }

    public static /* synthetic */ void loadMediaPlayer$default(FaceEditFragment faceEditFragment, int i, Theme theme, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 2) != 0) {
            theme = null;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        faceEditFragment.loadMediaPlayer(i, theme, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadPreviewImage() {
        String did;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        String deviceIconUrl = wearableDeviceModel != null ? DeviceModelExtKt.getDeviceIconUrl(wearableDeviceModel, 2) : null;
        int i = noi.P;
        if (wearableDeviceModel != null && DeviceModelExtKt.isBandType(wearableDeviceModel)) {
            i = noi.O;
        }
        ImageView outlineView = ((jx8) getMBinding()).H;
        Intrinsics.checkNotNullExpressionValue(outlineView, "outlineView");
        ImageLoader imageLoader = Coil.imageLoader(outlineView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(outlineView.getContext()).data(deviceIconUrl).target(outlineView);
        builderTarget.placeholder(i);
        builderTarget.size(ExtUtilsKt.getDp(320));
        imageLoader.enqueue(builderTarget.build());
        if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
            did = "";
        }
        WatchFace watchFace = this.mInfo;
        this.photoId = did + (watchFace != null ? watchFace.getId() : null);
        refreshPreview$default(this, 0, null, 3, null);
        ViewGroup.LayoutParams layoutParams = ((jx8) getMBinding()).I.getLayoutParams();
        layoutParams.height = ExtUtilsKt.getDp(466);
        ((jx8) getMBinding()).I.setLayoutParams(layoutParams);
        this.originOutlineHeight = ((jx8) getMBinding()).H.getHeight();
        FaceEditScrollLayout faceEditScrollLayout = ((jx8) getMBinding()).K;
        if (faceEditScrollLayout != null) {
            ConstraintLayout previewContainer = ((jx8) getMBinding()).I;
            Intrinsics.checkNotNullExpressionValue(previewContainer, "previewContainer");
            faceEditScrollLayout.setHeader(previewContainer);
        }
        this.originHeaderViewHeight = ExtUtilsKt.getDp(466);
        Theme currentTheme = getDialWatchFace().getCurrentTheme();
        if (currentTheme == null || !currentTheme.isVideoWatchFace()) {
            CardView videoCardView = ((jx8) getMBinding()).M;
            Intrinsics.checkNotNullExpressionValue(videoCardView, "videoCardView");
            ExtUtilsKt.setVisible(videoCardView, false);
            TextureView textureView = ((jx8) getMBinding()).G;
            if (textureView != null) {
                ExtUtilsKt.setVisible(textureView, false);
                return;
            }
            return;
        }
        CardView cardView = ((jx8) getMBinding()).M;
        ViewGroup.LayoutParams layoutParams2 = cardView != null ? cardView.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.height = (int) (((double) FaceIcon.INFO_WIDTH) * 1.14d * ((double) this.ratio));
        }
        if (layoutParams2 != null) {
            layoutParams2.width = (int) (((double) FaceIcon.INFO_HEIGHT) * 1.14d * ((double) this.ratio));
        }
        CardView cardView2 = ((jx8) getMBinding()).M;
        if (cardView2 != null) {
            cardView2.setRadius(((FaceIcon.INFO_HEIGHT * 1.14f) * this.ratio) / 2);
        }
        CardView cardView3 = ((jx8) getMBinding()).M;
        if (cardView3 != null) {
            cardView3.setLayoutParams(layoutParams2);
        }
        TextureView textureView2 = ((jx8) getMBinding()).G;
        ViewGroup.LayoutParams layoutParams3 = textureView2 != null ? textureView2.getLayoutParams() : null;
        if (layoutParams3 != null) {
            layoutParams3.height = (int) (((double) FaceIcon.INFO_WIDTH) * 1.14d * ((double) this.ratio));
        }
        if (layoutParams3 != null) {
            layoutParams3.width = (int) (((double) FaceIcon.INFO_HEIGHT) * 1.14d * ((double) this.ratio));
        }
        TextureView textureView3 = ((jx8) getMBinding()).G;
        if (textureView3 != null) {
            textureView3.setLayoutParams(layoutParams3);
        }
        CardView cardView4 = ((jx8) getMBinding()).M;
        if (cardView4 != null) {
            ExtUtilsKt.setVisible(cardView4, true);
        }
        TextureView textureView4 = ((jx8) getMBinding()).G;
        if (textureView4 != null) {
            ExtUtilsKt.setVisible(textureView4, true);
        }
        loadMediaPlayer$default(this, 0, null, true, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onAnimationEnd(int position) {
        int dp;
        if (position != 0) {
            dp = position != 1 ? 0 : this.originBottomViewHeight;
        } else {
            dp = (this.originBottomViewHeight + this.originHeaderViewHeight) - ExtUtilsKt.getDp(262);
        }
        this.mFaceEditViewHeight = dp;
        if (position == 0) {
            ImageView aodSwitch = ((jx8) getMBinding()).B;
            Intrinsics.checkNotNullExpressionValue(aodSwitch, "aodSwitch");
            ViewExtKt.invisible(aodSwitch);
            ImageView imageView = ((jx8) getMBinding()).L;
            if (imageView != null) {
                ViewExtKt.invisible(imageView);
            }
        } else if (position == 1) {
            if (this.hasAod) {
                ImageView aodSwitch2 = ((jx8) getMBinding()).B;
                Intrinsics.checkNotNullExpressionValue(aodSwitch2, "aodSwitch");
                ViewExtKt.visible(aodSwitch2);
            }
            ImageView imageView2 = ((jx8) getMBinding()).L;
            if (imageView2 != null) {
                ViewExtKt.visible(imageView2);
            }
        } else if (position == 2) {
            if (this.hasAod) {
                ImageView aodSwitch3 = ((jx8) getMBinding()).B;
                Intrinsics.checkNotNullExpressionValue(aodSwitch3, "aodSwitch");
                ViewExtKt.visible(aodSwitch3);
            }
            ImageView imageView3 = ((jx8) getMBinding()).L;
            if (imageView3 != null) {
                ViewExtKt.invisible(imageView3);
            }
        }
        FaceEditScrollLayout faceEditScrollLayout = ((jx8) getMBinding()).K;
        if (faceEditScrollLayout != null) {
            faceEditScrollLayout.setBottomViewHeight(this.mFaceEditViewHeight);
        }
        FaceEditScrollLayout faceEditScrollLayout2 = ((jx8) getMBinding()).K;
        if (faceEditScrollLayout2 != null) {
            faceEditScrollLayout2.onScrollEnd((this.originBottomViewHeight + this.originHeaderViewHeight) - this.mFaceEditViewHeight);
        }
        int i = this.originBottomViewHeight - this.mFaceEditViewHeight;
        int i2 = FaceIcon.INFO_HEIGHT;
        float f = (float) (((((double) i2) * 1.14d) + ((double) (i / 9))) / (((double) i2) * 1.14d));
        this.ratio = f;
        refreshPreview(f);
        ConstraintLayout buttonGroup = ((jx8) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(buttonGroup, "buttonGroup");
        ViewExtKt.setVisible(buttonGroup, position != 2);
        resizeEmptyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onEditResult(FaceEditViewModel.EditResult editRet) {
        Logger.i(TAG, "onEditResult: " + editRet);
        int code = editRet.getCode();
        if (code != 0) {
            if (code != 1) {
                if (code != 2) {
                    this.editCode = 20;
                    editFail();
                    return;
                } else {
                    this.editCode = 13;
                    editFail();
                    return;
                }
            }
            List<FaceEditPhotoBean> newImageList = ((FaceEditViewModel) getMViewModel()).getNewImageList();
            q5r editResponse = editRet.getEditResponse();
            Intrinsics.checkNotNull(editResponse);
            List<FaceEditPhotoBean> listSubList = newImageList.subList(0, editResponse.e);
            FaceEditViewModel faceEditViewModel = (FaceEditViewModel) getMViewModel();
            WatchFace watchFace = this.mInfo;
            Intrinsics.checkNotNull(watchFace);
            faceEditViewModel.transferImgList(listSubList, watchFace.getId(), editRet.getEditResponse().f);
            return;
        }
        if (!bgImgChanged() && !fontFileChange()) {
            syncFace();
            return;
        }
        if (!bgImgChanged()) {
            if (fontFileChange()) {
                Logger.d(TAG, "onEditResult fonfilechange " + fontFileChange());
                getProgressDialog().showIfNeed(getParentFragmentManager());
                getProgressDialog().setProgress(0);
                this.progressDialogShowing = true;
                FaceEditViewModel faceEditViewModel2 = (FaceEditViewModel) getMViewModel();
                File file = this.fontFile;
                Intrinsics.checkNotNull(file);
                q5r editResponse2 = editRet.getEditResponse();
                Intrinsics.checkNotNull(editResponse2);
                faceEditViewModel2.transferFontFile(file, editResponse2.f);
                return;
            }
            return;
        }
        if (!((FaceEditViewModel) getMViewModel()).getNewImageList().isEmpty()) {
            getProgressDialog().showIfNeed(getParentFragmentManager());
            getProgressDialog().setProgress(0);
            this.progressDialogShowing = true;
            FaceEditViewModel faceEditViewModel3 = (FaceEditViewModel) getMViewModel();
            List<FaceEditPhotoBean> newImageList2 = ((FaceEditViewModel) getMViewModel()).getNewImageList();
            WatchFace watchFace2 = this.mInfo;
            Intrinsics.checkNotNull(watchFace2);
            String id = watchFace2.getId();
            q5r editResponse3 = editRet.getEditResponse();
            Intrinsics.checkNotNull(editResponse3);
            faceEditViewModel3.transferImgList(newImageList2, id, editResponse3.f);
            return;
        }
        List<FaceEditPhotoBean> list = this.originImageList;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("originImageList");
            list = null;
        }
        list.clear();
        for (FaceEditPhotoBean faceEditPhotoBean : FaceEditPhotoHelper.INSTANCE.getCurrentPhotoList(this.photoId)) {
            List<FaceEditPhotoBean> list2 = this.originImageList;
            if (list2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("originImageList");
                list2 = null;
            }
            list2.add(faceEditPhotoBean);
        }
        syncFace();
        AnyExtKt.io$default(null, new C33371(null), 1, null);
    }

    private final void onFontTransfer(int progress) {
        if (progress == 100) {
            Logger.i(TAG, "onFontTransfer finish");
            this.fontFile = null;
            if (this.dialWatchFace != null) {
                List<String> list = CollectionsKt___CollectionsKt.toList(DialEditDeviceHelper.INSTANCE.getTextList(getDialWatchFace()));
                this.originTextList = list;
                this.originCropText = CollectionsKt___CollectionsKt.joinToString$default(StringsKt___StringsKt.toSet(CollectionsKt___CollectionsKt.joinToString$default(list, "", null, null, 0, null, null, 62, null)), "", null, null, 0, null, null, 62, null);
            }
            syncFace();
            return;
        }
        if (progress >= 0 && progress < 100) {
            getProgressDialog().setProgress(progress);
            return;
        }
        Logger.i(TAG, "onFontTransfer fail: code = " + progress);
        this.editCode = 20;
        finishEdit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onImgTransfer(FaceEditViewModel.BgImgTransferProgress progress) {
        int progress2 = progress.getProgress();
        if (progress2 == 100) {
            Logger.i(TAG, "onImgTransfer finish");
            ((FaceEditViewModel) getMViewModel()).getNewImageList().clear();
            List<FaceEditPhotoBean> list = this.originImageList;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("originImageList");
                list = null;
            }
            list.clear();
            for (FaceEditPhotoBean faceEditPhotoBean : FaceEditPhotoHelper.INSTANCE.getCurrentPhotoList(this.photoId)) {
                List<FaceEditPhotoBean> list2 = this.originImageList;
                if (list2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("originImageList");
                    list2 = null;
                }
                list2.add(faceEditPhotoBean);
            }
            syncFace();
            AnyExtKt.io$default(null, new C33381(null), 1, null);
            return;
        }
        if (progress2 >= 0 && progress2 < 100) {
            if (progress.getPushing()) {
                getProgressDialog().setProgress(progress.getProgress());
                return;
            } else {
                AnyExtKt.io$default(null, new AnonymousClass2(progress, null), 1, null);
                return;
            }
        }
        try {
            Logger.i(TAG, "onImgTransfer fail: code = " + progress);
        } catch (Exception e) {
            Logger.e(TAG, "logger error " + e.getMessage());
        }
        this.editCode = 20;
        finishEdit();
    }

    private final void onRealDismissDialog() {
        if (this.progressDialogShowing) {
            getProgressDialog().setProgress(0);
            getProgressDialog().dismissAllowingStateLoss();
            this.progressDialogShowing = false;
        }
        dismissDialogForce();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(FaceEditFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.onBackPressed()) {
            return;
        }
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(FaceEditFragment this$0, FaceEditViewModel.EditResult editResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(editResult);
        this$0.onEditResult(editResult);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$5(FaceEditFragment this$0, DialWatchFace dialWatchFace) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        DialEditEntity dialEditEntity;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (dialWatchFace != null) {
            ((FaceEditViewModel) this$0.getMViewModel()).getMModel().getInitNameIdMapDone().set(true);
            this$0.setDialWatchFace(dialWatchFace);
            List<String> list = CollectionsKt___CollectionsKt.toList(DialEditDeviceHelper.INSTANCE.getTextList(dialWatchFace));
            this$0.originTextList = list;
            this$0.originCropText = CollectionsKt___CollectionsKt.joinToString$default(StringsKt___StringsKt.toSet(CollectionsKt___CollectionsKt.joinToString$default(list, "", null, null, 0, null, null, 62, null)), "", null, null, 0, null, null, 62, null);
            List<Theme> aodThemeList = dialWatchFace.getAodThemeList();
            boolean z = !(aodThemeList == null || aodThemeList.isEmpty());
            this$0.hasAod = z;
            if (z) {
                ImageView aodSwitch = ((jx8) this$0.getMBinding()).B;
                Intrinsics.checkNotNullExpressionValue(aodSwitch, "aodSwitch");
                ViewExtKt.visible(aodSwitch);
            }
            this$0.themeIndex = this$0.getDialWatchFace().getThemeIndex();
            this$0.currentEditItemIndexList.clear();
            this$0.currentEditItemIndexList.addAll(this$0.fillEditItemIndexList(this$0.getDialWatchFace()));
            Theme currentTheme = this$0.getDialWatchFace().getCurrentTheme();
            Logger.d(TAG, "positionIndex " + ((currentTheme == null || (dialEditEntity = currentTheme.getDialEditEntity()) == null) ? null : Integer.valueOf(dialEditEntity.getPositionIndex())));
            this$0.loadPreviewImage();
            AnyExtKt.main$default(null, new FaceEditFragment$onViewCreated$4$1(this$0, null), 1, null);
            List<Theme> normalThemeList = this$0.getDialWatchFace().getNormalThemeList();
            Theme theme = normalThemeList != null ? normalThemeList.get(this$0.getDialWatchFace().getThemeIndex()) : null;
            if ((theme != null ? theme.getFg() : null) != null) {
                b39 b39Var = this$0.titleBarBinding;
                if (b39Var != null && (textView4 = b39Var.C) != null) {
                    textView4.setText(this$0.getString(p1j.Q0));
                }
            } else if (theme != null && theme.isPhotoAlbumWatchface()) {
                b39 b39Var2 = this$0.titleBarBinding;
                if (b39Var2 != null && (textView3 = b39Var2.C) != null) {
                    textView3.setText(this$0.getString(p1j.F0));
                }
            } else if (theme == null || !theme.isVideoWatchFace()) {
                b39 b39Var3 = this$0.titleBarBinding;
                if (b39Var3 != null && (textView = b39Var3.C) != null) {
                    textView.setText(this$0.getString(p1j.R));
                }
            } else {
                b39 b39Var4 = this$0.titleBarBinding;
                if (b39Var4 != null && (textView2 = b39Var4.C) != null) {
                    textView2.setText(this$0.getString(p1j.r2));
                }
            }
        } else {
            Context context = this$0.getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, p1j.common_hint_unkonwn_error);
            }
            this$0.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6(FaceEditFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onRealDismissDialog();
        return Unit.INSTANCE;
    }

    private final void performSave() {
        if (getDialWatchFace().getSupportLiteral()) {
            checkEditTextEmpty(new Function0() { // from class: as8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FaceEditFragment.performSave$lambda$40(this.f3409a);
                }
            });
        } else {
            requestEdit();
        }
        this.isAppSave = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit performSave$lambda$40(FaceEditFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.requestEdit();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FaceDialog progressDialog_delegate$lambda$0() {
        return new FaceDialog.Builder("save edit face").create().title(p1j.O);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshPreview(int slotItemEditProcessIndex, Theme passTheme) {
        DialEditEntity dialEditEntity;
        Theme theme = passTheme == null ? DialEditHelper.INSTANCE.getTheme(getDialWatchFace()) : passTheme;
        if (theme != null && (dialEditEntity = theme.getDialEditEntity()) != null) {
            dialEditEntity.setSlotItemEditProcessIndex(slotItemEditProcessIndex);
        }
        DialEditHelper dialEditHelper = DialEditHelper.INSTANCE;
        dialEditHelper.setCurrentDiaWatchFace(getDialWatchFace());
        if (theme != null) {
            FaceEditPhotoHelper faceEditPhotoHelper = FaceEditPhotoHelper.INSTANCE;
            FaceEditPhotoBean faceEditPhotoBean = theme.isVideoWatchFace() ? null : faceEditPhotoHelper.getCurrentPhotoList(this.photoId).isEmpty() ? null : faceEditPhotoHelper.getCurrentPhotoList(this.photoId).get(this.currentPreviewImage);
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            DialWatchFace dialWatchFace = getDialWatchFace();
            double d = ((double) FaceIcon.INFO_WIDTH) * 1.14d;
            float f = this.ratio;
            ((jx8) getMBinding()).F.setImageBitmap(dialEditHelper.watchFaceViewToBitmap(contextRequireContext, theme, dialWatchFace, (int) (d * ((double) f)), (int) (((double) FaceIcon.INFO_HEIGHT) * 1.14d * ((double) f)), this.unzipPath, (3392 & 64) != 0 ? Bitmap.Config.ARGB_8888 : null, (3392 & 128) != 0 ? null : Float.valueOf((float) (((double) FaceIcon.INFO_RADIUS) * 1.14d * ((double) f))), (3392 & 256) != 0 ? null : faceEditPhotoBean, (3392 & 512) != 0 ? false : false, (3392 & 1024) != 0 ? false : theme.getFg() != null, (3392 & 2048) != 0 ? null : null));
        }
        setButton(isConfigChange());
    }

    public static /* synthetic */ void refreshPreview$default(FaceEditFragment faceEditFragment, int i, Theme theme, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 2) != 0) {
            theme = null;
        }
        faceEditFragment.refreshPreview(i, theme);
    }

    private final void requestEdit() {
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 3, null);
        cropFontFile(new Function1() { // from class: gt8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceEditFragment.requestEdit$lambda$37(this.f19314a, (File) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit requestEdit$lambda$37(FaceEditFragment this$0, File file) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.fontFile = file;
        ((FaceEditViewModel) this$0.getMViewModel()).requestEdit(this$0.getDialWatchFace(), this$0.mInfo, this$0.needOrderList, this$0.deleteAll, FaceEditPhotoHelper.INSTANCE.getCurrentPhotoList(this$0.photoId), ((FaceEditViewModel) this$0.getMViewModel()).getNewImageList(), this$0.fontFile, this$0.fontFileChange());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void resizeEmptyView() {
        View viewFindViewById = ((jx8) getMBinding()).E.getContentScrollView().findViewById(isi.f0);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        layoutParams.height = ((jx8) getMBinding()).E.getHeight() - ((jx8) getMBinding()).E.getTabRecyclerView().getHeight();
        viewFindViewById.setLayoutParams(layoutParams);
    }

    private final void scaleAnimation() {
        int screenWidth = this.expand ? DisplayUtil.getScreenWidth() - ExtUtilsKt.getDp(56) : this.originHeaderViewWidth;
        int screenWidth2 = this.expand ? this.originHeaderViewWidth : DisplayUtil.getScreenWidth() - ExtUtilsKt.getDp(56);
        boolean z = this.expand;
        int i = z ? this.originBottomViewHeight + this.originHeaderViewHeight : this.originHeaderViewHeight;
        int i2 = z ? this.originHeaderViewHeight : this.originBottomViewHeight + this.originHeaderViewHeight;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(screenWidth, screenWidth2);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ds8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                FaceEditFragment.scaleAnimation$lambda$29$lambda$28(this.f15881a, valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: es8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                FaceEditFragment.scaleAnimation$lambda$31$lambda$30(this.f17017a, valueAnimator);
            }
        });
        float[] fArr = new float[2];
        boolean z2 = this.expand;
        fArr[0] = z2 ? 1.2592592f : 1.0f;
        fArr[1] = z2 ? 1.0f : 1.2592592f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fs8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                FaceEditFragment.scaleAnimation$lambda$33$lambda$32(this.f18151a, valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.xiaomi.fitness.watch.face.FaceEditFragment$scaleAnimation$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                ConstraintLayout buttonGroup = FaceEditFragment.access$getMBinding(this.this$0).C;
                Intrinsics.checkNotNullExpressionValue(buttonGroup, "buttonGroup");
                ViewExtKt.setVisible(buttonGroup, this.this$0.expand);
                FaceEditFragment faceEditFragment = this.this$0;
                faceEditFragment.expand = !faceEditFragment.expand;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfInt2, valueAnimatorOfFloat);
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void scaleAnimation$lambda$29$lambda$28(FaceEditFragment this$0, ValueAnimator value) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(value, "value");
        ViewGroup.LayoutParams layoutParams = ((jx8) this$0.getMBinding()).I.getLayoutParams();
        Object animatedValue = value.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.width = ((Integer) animatedValue).intValue();
        ((jx8) this$0.getMBinding()).I.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void scaleAnimation$lambda$31$lambda$30(FaceEditFragment this$0, ValueAnimator value) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(value, "value");
        ViewGroup.LayoutParams layoutParams = ((jx8) this$0.getMBinding()).I.getLayoutParams();
        Object animatedValue = value.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.height = ((Integer) animatedValue).intValue();
        ((jx8) this$0.getMBinding()).I.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scaleAnimation$lambda$33$lambda$32(FaceEditFragment this$0, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.refreshPreview(((Float) animatedValue).floatValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void scrollAnimation(int headerViewHeight, int offset, final int position) {
        FaceEditScrollLayout faceEditScrollLayout = ((jx8) getMBinding()).K;
        if (faceEditScrollLayout != null) {
            faceEditScrollLayout.setAnimatorOn(true);
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(headerViewHeight, offset + headerViewHeight);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ot8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                FaceEditFragment.scrollAnimation$lambda$27$lambda$26(this.f29666a, valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.xiaomi.fitness.watch.face.FaceEditFragment.scrollAnimation.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                FaceEditFragment.this.onAnimationEnd(position);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }
        });
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void scrollAnimation$lambda$27$lambda$26(FaceEditFragment this$0, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ViewGroup.LayoutParams layoutParams = ((jx8) this$0.getMBinding()).I.getLayoutParams();
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        layoutParams.height = iIntValue;
        ((jx8) this$0.getMBinding()).I.setLayoutParams(layoutParams);
        double dp = ((ExtUtilsKt.getDp(22) + iIntValue) - this$0.originHeaderViewHeight) / 9;
        int i = FaceIcon.INFO_HEIGHT;
        float f = (float) ((dp + (((double) i) * 1.14d)) / (((double) i) * 1.14d));
        this$0.ratio = f;
        this$0.refreshPreview(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setButton(boolean isSetChange) {
        if (isSetChange) {
            ((jx8) getMBinding()).A.setText(p1j.Z0);
            ((jx8) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: ys8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaceEditFragment.setButton$lambda$12(this.f40487a, view);
                }
            });
            ((jx8) getMBinding()).A.setEnabled(true);
        } else if (FaceManager.INSTANCE.isCurrent(this.mInfo)) {
            ((jx8) getMBinding()).A.setEnabled(false);
            ((jx8) getMBinding()).A.setText(p1j.A);
        } else {
            ((jx8) getMBinding()).A.setEnabled(true);
            ((jx8) getMBinding()).A.setText(p1j.L);
            ((jx8) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: zs8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaceEditFragment.setButton$lambda$13(this.f41623a, view);
                }
            });
        }
    }

    public static /* synthetic */ void setButton$default(FaceEditFragment faceEditFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        faceEditFragment.setButton(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setButton$lambda$12(final FaceEditFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkConnect(new Function0() { // from class: at8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceEditFragment.setButton$lambda$12$lambda$11(this.f3429a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setButton$lambda$12$lambda$11(FaceEditFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.performSave();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setButton$lambda$13(FaceEditFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showLoading();
        this$0.isAppSave = true;
        this$0.setFace();
    }

    private final void setFace() {
        checkConnect(new Function0() { // from class: ls8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceEditFragment.setFace$lambda$35(this.f25394a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setFace$lambda$35(FaceEditFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FaceEditViewModel faceEditViewModel = (FaceEditViewModel) this$0.getMViewModel();
        WatchFace watchFace = this$0.mInfo;
        Intrinsics.checkNotNull(watchFace);
        faceEditViewModel.setFaceId(watchFace.getId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setVideoSource(final File bgVideo, final boolean playNow) {
        TextureView textureView;
        if (bgVideo == null || !bgVideo.exists() || (textureView = ((jx8) getMBinding()).G) == null) {
            return;
        }
        textureView.post(new Runnable() { // from class: xs8
            @Override // java.lang.Runnable
            public final void run() {
                FaceEditFragment.setVideoSource$lambda$20(this.f39412a, bgVideo, playNow);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setVideoSource$lambda$20(final FaceEditFragment this$0, File file, boolean z) {
        MediaPlayer mediaPlayer;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            MediaPlayer mediaPlayer2 = this$0.mediaPlayer;
            if (mediaPlayer2 != null && mediaPlayer2.isPlaying() && (mediaPlayer = this$0.mediaPlayer) != null) {
                mediaPlayer.stop();
            }
            MediaPlayer mediaPlayer3 = this$0.mediaPlayer;
            if (mediaPlayer3 != null) {
                mediaPlayer3.reset();
            }
            MediaPlayer mediaPlayer4 = this$0.mediaPlayer;
            if (mediaPlayer4 != null) {
                Intrinsics.checkNotNull(file);
                mediaPlayer4.setDataSource(file.getPath());
            }
            MediaPlayer mediaPlayer5 = this$0.mediaPlayer;
            if (mediaPlayer5 != null) {
                mediaPlayer5.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: nt8
                    @Override // android.media.MediaPlayer.OnInfoListener
                    public final boolean onInfo(MediaPlayer mediaPlayer6, int i, int i2) {
                        return FaceEditFragment.setVideoSource$lambda$20$lambda$19(this.f28353a, mediaPlayer6, i, i2);
                    }
                });
            }
            if (z) {
                MediaPlayer mediaPlayer6 = this$0.mediaPlayer;
                if (mediaPlayer6 != null) {
                    mediaPlayer6.prepare();
                }
                MediaPlayer mediaPlayer7 = this$0.mediaPlayer;
                if (mediaPlayer7 != null) {
                    mediaPlayer7.start();
                }
            }
        } catch (Exception e) {
            Logger.e(TAG, "mediaplayer config error " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean setVideoSource$lambda$20$lambda$19(FaceEditFragment this$0, MediaPlayer mediaPlayer, int i, int i2) {
        ImageView imageView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i != 3 || (imageView = ((jx8) this$0.getMBinding()).N) == null) {
            return false;
        }
        imageView.setVisibility(4);
        return false;
    }

    private final void showEditTextEmpty(FaceEditLiteralBean textEditBean, List<String> textList) {
        String str;
        Iterator<String> it = textList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().length() == 0) {
                break;
            } else {
                i++;
            }
        }
        String source = textEditBean.getSource();
        if (source == null || source.length() == 0) {
            String string = getString(p1j.P);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            showEditTextEmptyDialog(string, i >= 0 ? i : 0);
            return;
        }
        String[] stringArray = getResources().getStringArray(getResources().getIdentifier("face_text_source_" + textEditBean.getSource(), "array", ApplicationExtKt.getApplication().getPackageName()));
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        StringBuilder sb = new StringBuilder();
        String string2 = getResources().getString(p1j.O5);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        int i2 = 0;
        for (Object obj : textList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (((String) obj).length() == 0 && (str = (String) ArraysKt___ArraysKt.getOrNull(stringArray, i2)) != null) {
                sb.append(str);
                sb.append(string2);
            }
            i2 = i3;
        }
        if (sb.length() > 0) {
            Intrinsics.checkNotNullExpressionValue(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        String string3 = getResources().getString(p1j.Q, sb.toString());
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        showEditTextEmptyDialog(string3, i >= 0 ? i : 0);
    }

    private final void showEditTextEmptyDialog(String text, final int index) {
        new CommonDialog.c("").setDialogDescriptionString(new DialogParams.DialogDescriptionString(text)).setPositiveText(p1j.t).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.watch.face.FaceEditFragment.showEditTextEmptyDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                DialEditEntity dialEditEntity;
                List<FaceEditLiteralBean> textItemList;
                FaceEditLiteralBean faceEditLiteralBean;
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                List<Theme> normalThemeList = FaceEditFragment.this.getDialWatchFace().getNormalThemeList();
                Theme theme = normalThemeList != null ? normalThemeList.get(FaceEditFragment.this.getDialWatchFace().getThemeIndex()) : null;
                if (theme != null && (dialEditEntity = theme.getDialEditEntity()) != null && (textItemList = dialEditEntity.getTextItemList()) != null && (faceEditLiteralBean = (FaceEditLiteralBean) CollectionsKt___CollectionsKt.getOrNull(textItemList, 0)) != null) {
                    faceEditLiteralBean.setShow(index);
                }
                FaceEditFragment.refreshPreview$default(FaceEditFragment.this, 0, null, 3, null);
                FaceEditPicker faceEditPicker = FaceEditFragment.access$getMBinding(FaceEditFragment.this).E;
                DialWatchFace dialWatchFace = FaceEditFragment.this.getDialWatchFace();
                String str = FaceEditFragment.this.unzipPath;
                String str2 = FaceEditFragment.this.photoId;
                WatchFace watchFace = FaceEditFragment.this.mInfo;
                Intrinsics.checkNotNull(watchFace);
                faceEditPicker.setData(dialWatchFace, str, str2, watchFace, (176 & 16) != 0 ? false : false, (176 & 32) != 0 ? null : null, (176 & 64) != 0 ? -1 : 9, (176 & 128) != 0 ? null : null);
            }
        }).showIfNeed(getParentFragmentManager());
    }

    private final void showSlotSelectDialog(int index, final Function1<? super Integer, Unit> select) {
        DialEditEntity dialEditEntity;
        List<SlotEditItem> slotItemList;
        SlotEditItem slotEditItem;
        View viewInflate = LayoutInflater.from(requireContext()).inflate(ovi.C, (ViewGroup) null, false);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(isi.d2);
        final FaceEditSlotPickerAdapter faceEditSlotPickerAdapter = new FaceEditSlotPickerAdapter();
        recyclerView.setAdapter(faceEditSlotPickerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        List<Theme> normalThemeList = getDialWatchFace().getNormalThemeList();
        Theme theme = normalThemeList != null ? normalThemeList.get(getDialWatchFace().getThemeIndex()) : null;
        if (theme == null || (dialEditEntity = theme.getDialEditEntity()) == null || (slotItemList = dialEditEntity.getSlotItemList()) == null || (slotEditItem = slotItemList.get(index)) == null) {
            return;
        }
        final List<EditWidget> listWidget = slotEditItem.getListWidget();
        faceEditSlotPickerAdapter.setList(listWidget, slotEditItem.getSelectWidgetIndex());
        CommonDialog commonDialogCreate = new CommonDialog.c("select slot dialog").setDialogTitle(p1j.m2).setCustomView(viewInflate).setCanceledOnTouchOutside(true).setCancelable(true).create();
        commonDialogCreate.showIfNeed(getParentFragmentManager());
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.watch.face.FaceEditFragment.showSlotSelectDialog.1
            @Override // defpackage.av6
            public void onDialogEvent(String dialogName, DialogInterface dialog, int what) {
                super.onDialogEvent(dialogName, dialog, what);
                if (what == 3) {
                    FaceEditFragment.refreshPreview$default(FaceEditFragment.this, -1, null, 2, null);
                }
            }
        });
        refreshPreview$default(this, index, null, 2, null);
        faceEditSlotPickerAdapter.setOnWidgetSelectListener(new Function1() { // from class: bs8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceEditFragment.showSlotSelectDialog$lambda$58(listWidget, faceEditSlotPickerAdapter, select, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSlotSelectDialog$lambda$58(List list, FaceEditSlotPickerAdapter adapter, Function1 select, String widgetName) {
        Intrinsics.checkNotNullParameter(list, "$list");
        Intrinsics.checkNotNullParameter(adapter, "$adapter");
        Intrinsics.checkNotNullParameter(select, "$select");
        Intrinsics.checkNotNullParameter(widgetName, "widgetName");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((EditWidget) it.next()).getWidgetName(), widgetName)) {
                adapter.setList(list, i);
                select.invoke2(Integer.valueOf(i));
                return Unit.INSTANCE;
            }
            i++;
        }
        i = -1;
        adapter.setList(list, i);
        select.invoke2(Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    private final boolean startWith(List<FaceEditPhotoBean> list, List<FaceEditPhotoBean> list2) {
        if (list.size() < list2.size()) {
            return false;
        }
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            w5r.a watchFaceGroup = FaceEditPhotoBeanKt.toWatchFaceGroup(list.get(i));
            w5r.a watchFaceGroup2 = FaceEditPhotoBeanKt.toWatchFaceGroup(list2.get(i));
            if (!Intrinsics.areEqual(watchFaceGroup.c, watchFaceGroup2.c) || watchFaceGroup.d != watchFaceGroup2.d) {
                return false;
            }
        }
        return true;
    }

    private final void syncFace() {
        ld8.c().l(new FaceInstallEvent());
    }

    @NotNull
    public final DialWatchFace getDialWatchFace() {
        DialWatchFace dialWatchFace = this.dialWatchFace;
        if (dialWatchFace != null) {
            return dialWatchFace;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dialWatchFace");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        if (!isConfigChange()) {
            FragmentActivity mActivity = getMActivity();
            if (mActivity == null) {
                return false;
            }
            mActivity.setResult(-1);
            return false;
        }
        if (isAdded() && !isDetached()) {
            new CommonDialog.c("save edit").setDialogTitle(p1j.C0).setDialogDescription(p1j.B0).setPositiveText(p1j.d).setNegativeText(p1j.c).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.watch.face.FaceEditFragment.onBackPressed.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which != -2) {
                        if (which != -1) {
                            return;
                        }
                        FaceEditFragment.this.finish();
                    } else if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            }).showIfNeed(getParentFragmentManager());
            return true;
        }
        FragmentActivity mActivity2 = getMActivity();
        if (mActivity2 != null) {
            mActivity2.setResult(-1);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @uno(threadMode = ThreadMode.MAIN)
    public final void onDataEvent(@NotNull orf event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof FaceReSycEvent) {
            FaceManager faceManager = FaceManager.INSTANCE;
            WatchFace watchFace = this.mInfo;
            if (faceManager.getFace(watchFace != null ? watchFace.getId() : null) == null) {
                Logger.i(TAG, "delete when edit");
                finish();
                return;
            }
            FaceEditViewModel.BgImgTransferProgress value = ((FaceEditViewModel) getMViewModel()).getBgImgTransfer().getValue();
            int progress = value != null ? value.getProgress() : 0;
            if (1 > progress || progress >= 100 || this.editCode == 20) {
                boolean z = this.isAppSave;
                if (z) {
                    this.isAppSave = false;
                    finishEdit();
                    return;
                } else {
                    Logger.i(TAG, "isAppSave " + z);
                    return;
                }
            }
            FaceEditViewModel.BgImgTransferProgress value2 = ((FaceEditViewModel) getMViewModel()).getBgImgTransfer().getValue();
            Boolean boolValueOf = value2 != null ? Boolean.valueOf(value2.getPushing()) : null;
            Logger.i(TAG, "pushing " + boolValueOf + " editCode " + this.editCode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ((FaceEditViewModel) getMViewModel()).getBgImgTransfer().removeObserver(this.bgImgTransferObserver);
        ((FaceEditViewModel) getMViewModel()).getFontTransfer().removeObserver(this.fontTransferObserver);
        ld8.c().r(this);
        DialEditHelper.INSTANCE.setCurrentDiaWatchFace(null);
        FaceEditPhotoHelper faceEditPhotoHelper = FaceEditPhotoHelper.INSTANCE;
        faceEditPhotoHelper.resetCurrentPhotoList();
        faceEditPhotoHelper.removeImageChangeListener(this.imageChangeListener);
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        MediaPlayer mediaPlayer;
        super.onPause();
        MediaPlayer mediaPlayer2 = this.mediaPlayer;
        if (mediaPlayer2 == null || !mediaPlayer2.isPlaying() || (mediaPlayer = this.mediaPlayer) == null) {
            return;
        }
        mediaPlayer.pause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        List<FaceEditPhotoBean> arrayList;
        String[] backgroundImageList;
        ArrayList<FaceEditPhotoBean> imageGroupList;
        String string;
        TextView textView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        b39 b39VarA0 = b39.A0(getLayoutInflater());
        this.titleBarBinding = b39VarA0;
        Intrinsics.checkNotNull(b39VarA0);
        View root = b39VarA0.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        setCustomView(root, new ActionBar.LayoutParams(-1, -1));
        b39 b39Var = this.titleBarBinding;
        if (b39Var != null && (textView = b39Var.A) != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: ct8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    FaceEditFragment.onViewCreated$lambda$1(this.f14694a, view2);
                }
            });
        }
        Bundle arguments = getArguments();
        this.mInfo = FaceManager.INSTANCE.getFace(arguments != null ? arguments.getString(FaceInfoBase.FACE_ID) : null);
        Bundle arguments2 = getArguments();
        String str = "";
        if (arguments2 != null && (string = arguments2.getString(FACE_UNZIP_PATH, "")) != null) {
            str = string;
        }
        this.unzipPath = str;
        ((FaceEditViewModel) getMViewModel()).requestDialWatchFace(this.mInfo, this.unzipPath);
        requireActivity().getWindow().setSoftInputMode(32);
        WatchFace watchFace = this.mInfo;
        if (watchFace == null || !watchFace.getSupportImageGroup()) {
            arrayList = new ArrayList<>();
            WatchFace watchFace2 = this.mInfo;
            if (watchFace2 != null && (backgroundImageList = watchFace2.getBackgroundImageList()) != null) {
                for (String str2 : backgroundImageList) {
                    arrayList.add(new FaceEditPhotoBean(0, new WatchFaceImage(str2, null, null, null, null, null, null, null, 254, null), null, 5, null));
                }
            }
        } else {
            WatchFace watchFace3 = this.mInfo;
            if (watchFace3 == null || (imageGroupList = watchFace3.getImageGroupList()) == null || (arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) imageGroupList)) == null) {
                arrayList = new ArrayList<>();
            }
        }
        this.originImageList = arrayList;
        initSaveBtn$default(this, false, 1, null);
        addListener();
        ((FaceEditViewModel) getMViewModel()).getEditRet().observe(getViewLifecycleOwner(), new FaceEditFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: dt8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceEditFragment.onViewCreated$lambda$4(this.f15910a, (FaceEditViewModel.EditResult) obj);
            }
        }));
        ((FaceEditViewModel) getMViewModel()).getBgImgTransfer().observeForever(this.bgImgTransferObserver);
        ((FaceEditViewModel) getMViewModel()).getFontTransfer().observeForever(this.fontTransferObserver);
        ((FaceEditViewModel) getMViewModel()).getDialWatchFaceLiveData().observe(getViewLifecycleOwner(), new FaceEditFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: et8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceEditFragment.onViewCreated$lambda$5(this.f17040a, (DialWatchFace) obj);
            }
        }));
        ((FaceEditViewModel) getMViewModel()).getDismissDialogLiveData().observe(getViewLifecycleOwner(), new FaceEditFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ft8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceEditFragment.onViewCreated$lambda$6(this.f18220a, (Boolean) obj);
            }
        }));
        if (ld8.c().j(this)) {
            return;
        }
        ld8.c().p(this);
    }

    public final void setDialWatchFace(@NotNull DialWatchFace dialWatchFace) {
        Intrinsics.checkNotNullParameter(dialWatchFace, "<set-?>");
        this.dialWatchFace = dialWatchFace;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshPreview(float ratio) {
        ViewGroup.LayoutParams layoutParams = ((jx8) getMBinding()).H.getLayoutParams();
        int i = this.originOutlineHeight;
        layoutParams.height = (int) (i * ratio);
        layoutParams.width = (int) (i * ratio);
        ((jx8) getMBinding()).H.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = ((jx8) getMBinding()).F.getLayoutParams();
        double d = ratio;
        layoutParams2.height = (int) (((double) FaceIcon.INFO_WIDTH) * 1.14d * d);
        layoutParams2.width = (int) (((double) FaceIcon.INFO_HEIGHT) * 1.14d * d);
        ((jx8) getMBinding()).F.setRatio(ratio);
        ((jx8) getMBinding()).F.setLayoutParams(layoutParams2);
        CardView cardView = ((jx8) getMBinding()).M;
        ViewGroup.LayoutParams layoutParams3 = cardView != null ? cardView.getLayoutParams() : null;
        if (layoutParams3 != null) {
            layoutParams3.height = (int) (((double) FaceIcon.INFO_WIDTH) * 1.14d * d);
        }
        if (layoutParams3 != null) {
            layoutParams3.width = (int) (((double) FaceIcon.INFO_HEIGHT) * 1.14d * d);
        }
        CardView cardView2 = ((jx8) getMBinding()).M;
        if (cardView2 != null) {
            cardView2.setRadius(((FaceIcon.INFO_HEIGHT * 1.14f) * ratio) / 2);
        }
        CardView cardView3 = ((jx8) getMBinding()).M;
        if (cardView3 != null) {
            cardView3.setLayoutParams(layoutParams3);
        }
        TextureView textureView = ((jx8) getMBinding()).G;
        ViewGroup.LayoutParams layoutParams4 = textureView != null ? textureView.getLayoutParams() : null;
        if (layoutParams4 != null) {
            layoutParams4.height = (int) (((double) FaceIcon.INFO_WIDTH) * 1.14d * d);
        }
        if (layoutParams4 != null) {
            layoutParams4.width = (int) (((double) FaceIcon.INFO_HEIGHT) * 1.14d * d);
        }
        TextureView textureView2 = ((jx8) getMBinding()).G;
        if (textureView2 != null) {
            textureView2.setLayoutParams(layoutParams4);
        }
    }
}
