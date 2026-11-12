package com.facebook.internal.logging.dumpsys;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.watch.notification.TransportUri;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.StringCompanionObject;
import org.cybergarage.upnp.RootDescription;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00182\u00020\u0001:\u0004\u0018\u0019\u001a\u001bB\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/AndroidRootResolver;", "", "", "a", "Lcom/facebook/internal/logging/dumpsys/AndroidRootResolver$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "attachActiveRootListener", "", "Lcom/facebook/internal/logging/dumpsys/AndroidRootResolver$Root;", "listActiveRoots", "", "Z", "initialized", "b", "Ljava/lang/Object;", "windowManagerObj", "Ljava/lang/reflect/Field;", "c", "Ljava/lang/reflect/Field;", "viewsField", GoogleApiAvailabilityLight.a, "paramsField", "<init>", "()V", "Companion", "ListenableArrayList", "Listener", "Root", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AndroidRootResolver {
    private static final String e = AndroidRootResolver.class.getSimpleName();
    private static final String f = "android.view.WindowManagerImpl";
    private static final String g = "android.view.WindowManagerGlobal";
    private static final String h = "mViews";
    private static final String i = "mParams";
    private static final String j = "getDefault";
    private static final String k = "getInstance";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean initialized;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Object windowManagerObj;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Field viewsField;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Field paramsField;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\u0003B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\fH\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/AndroidRootResolver$ListenableArrayList;", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "Lcom/facebook/internal/logging/dumpsys/AndroidRootResolver$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setListener", "value", "", TransportUri.ACTION_ADD, "remove", "", "index", "removeAt", "a", "Lcom/facebook/internal/logging/dumpsys/AndroidRootResolver$Listener;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class ListenableArrayList extends ArrayList<View> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private Listener listener;

        public /* bridge */ boolean contains(View view) {
            return super.contains((Object) view);
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ int indexOf(View view) {
            return super.indexOf((Object) view);
        }

        public /* bridge */ int lastIndexOf(View view) {
            return super.lastIndexOf((Object) view);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ View remove(int i) {
            return remove(i);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        @Nullable
        /* JADX INFO: renamed from: removeAt, reason: merged with bridge method [inline-methods] */
        public View remove(int index) {
            View view = (View) super.remove(index);
            Listener listener = this.listener;
            if (listener != null) {
                if (listener != null) {
                    listener.onRootRemoved(view);
                }
                Listener listener2 = this.listener;
                if (listener2 != null) {
                    listener2.onRootsChanged(this);
                }
            }
            return view;
        }

        public final void setListener(@Nullable Listener listener) {
            this.listener = listener;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(@Nullable View value) {
            Listener listener;
            boolean zAdd = super.add(value);
            if (zAdd && (listener = this.listener) != null) {
                if (listener != null) {
                    listener.onRootAdded(value);
                }
                Listener listener2 = this.listener;
                if (listener2 != null) {
                    listener2.onRootsChanged(this);
                }
            }
            return zAdd;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj != null ? obj instanceof View : true) {
                return contains((View) obj);
            }
            return false;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj != null ? obj instanceof View : true) {
                return indexOf((View) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj != null ? obj instanceof View : true) {
                return lastIndexOf((View) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean remove(Object obj) {
            if (obj != null ? obj instanceof View : true) {
                return remove((View) obj);
            }
            return false;
        }

        public boolean remove(@Nullable View value) {
            Listener listener;
            boolean zRemove = super.remove((Object) value);
            if (zRemove && (listener = this.listener) != null && (value instanceof View)) {
                if (listener != null) {
                    listener.onRootRemoved(value);
                }
                Listener listener2 = this.listener;
                if (listener2 != null) {
                    listener2.onRootsChanged(this);
                }
            }
            return zRemove;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u001a\u0010\t\u001a\u00020\u00042\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0007H&¨\u0006\n"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/AndroidRootResolver$Listener;", "", "Landroid/view/View;", RootDescription.ROOT_ELEMENT, "", "onRootAdded", "onRootRemoved", "", "roots", "onRootsChanged", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface Listener {
        void onRootAdded(@Nullable View root);

        void onRootRemoved(@Nullable View root);

        void onRootsChanged(@Nullable List<? extends View> roots);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/AndroidRootResolver$Root;", "", "Landroid/view/View;", "a", "Landroid/view/View;", "getView", "()Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/WindowManager$LayoutParams;", "b", "Landroid/view/WindowManager$LayoutParams;", "getParam", "()Landroid/view/WindowManager$LayoutParams;", "param", "<init>", "(Landroid/view/View;Landroid/view/WindowManager$LayoutParams;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Root {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final View view;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final WindowManager.LayoutParams param;

        public Root(@NotNull View view, @NotNull WindowManager.LayoutParams layoutParams) {
            this.view = view;
            this.param = layoutParams;
        }

        @NotNull
        public final WindowManager.LayoutParams getParam() {
            return this.param;
        }

        @NotNull
        public final View getView() {
            return this.view;
        }
    }

    private final void a() {
        this.initialized = true;
        int i2 = Build.VERSION.SDK_INT;
        String str = i2 > 16 ? g : f;
        String str2 = i2 > 16 ? k : j;
        try {
            Class<?> cls = Class.forName(str);
            this.windowManagerObj = cls.getMethod(str2, new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField(h);
            this.viewsField = declaredField;
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            Field declaredField2 = cls.getDeclaredField(i);
            this.paramsField = declaredField2;
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
        } catch (ClassNotFoundException e2) {
            String str3 = e;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Log.d(str3, String.format("could not find class: %s", Arrays.copyOf(new Object[]{str}, 1)), e2);
        } catch (IllegalAccessException e3) {
            String str4 = e;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            Log.d(str4, String.format("reflective setup failed using obj: %s method: %s field: %s", Arrays.copyOf(new Object[]{str, str2, h}, 3)), e3);
        } catch (NoSuchFieldException e4) {
            String str5 = e;
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            Log.d(str5, String.format("could not find field: %s or %s on %s", Arrays.copyOf(new Object[]{i, h, str}, 3)), e4);
        } catch (NoSuchMethodException e5) {
            String str6 = e;
            StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
            Log.d(str6, String.format("could not find method: %s on %s", Arrays.copyOf(new Object[]{str2, str}, 2)), e5);
        } catch (RuntimeException e6) {
            String str7 = e;
            StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
            Log.d(str7, String.format("reflective setup failed using obj: %s method: %s field: %s", Arrays.copyOf(new Object[]{str, str2, h}, 3)), e6);
        } catch (InvocationTargetException e7) {
            String str8 = e;
            StringCompanionObject stringCompanionObject6 = StringCompanionObject.INSTANCE;
            Log.d(str8, String.format("could not invoke: %s on %s", Arrays.copyOf(new Object[]{str2, str}, 2)), e7.getCause());
        }
    }

    public final void attachActiveRootListener(@Nullable Listener listener) {
        if (Build.VERSION.SDK_INT < 19 || listener == null) {
            return;
        }
        if (!this.initialized) {
            a();
        }
        try {
            Field declaredField = Field.class.getDeclaredField("accessFlags");
            declaredField.setAccessible(true);
            Field field = this.viewsField;
            declaredField.setInt(field, field != null ? field.getModifiers() : 0);
            Field field2 = this.viewsField;
            Object obj = field2 != null ? field2.get(this.windowManagerObj) : null;
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<android.view.View> /* = java.util.ArrayList<android.view.View> */");
            }
            ListenableArrayList listenableArrayList = new ListenableArrayList();
            listenableArrayList.setListener(listener);
            listenableArrayList.addAll((ArrayList) obj);
            Field field3 = this.viewsField;
            if (field3 != null) {
                field3.set(this.windowManagerObj, listenableArrayList);
            }
        } catch (Throwable th) {
            Log.d(e, "Couldn't attach root listener.", th);
        }
    }

    @Nullable
    public final List<Root> listActiveRoots() {
        List listEmptyList;
        if (!this.initialized) {
            a();
        }
        Object obj = this.windowManagerObj;
        List listEmptyList2 = null;
        if (obj == null) {
            Log.d(e, "No reflective access to windowmanager object.");
            return null;
        }
        Field field = this.viewsField;
        if (field == null) {
            Log.d(e, "No reflective access to mViews");
            return null;
        }
        if (this.paramsField == null) {
            Log.d(e, "No reflective access to mPArams");
            return null;
        }
        try {
            if (Build.VERSION.SDK_INT < 19) {
                View[] viewArr = (View[]) (field != null ? field.get(obj) : null);
                listEmptyList = viewArr != null ? ArraysKt___ArraysKt.toList(viewArr) : null;
                Field field2 = this.paramsField;
                WindowManager.LayoutParams[] layoutParamsArr = (WindowManager.LayoutParams[]) (field2 != null ? field2.get(this.windowManagerObj) : null);
                if (layoutParamsArr != null) {
                    listEmptyList2 = ArraysKt___ArraysKt.toList(layoutParamsArr);
                }
            } else {
                listEmptyList = (List) (field != null ? field.get(obj) : null);
                Field field3 = this.paramsField;
                listEmptyList2 = (List) (field3 != null ? field3.get(this.windowManagerObj) : null);
            }
            ArrayList arrayList = new ArrayList();
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            if (listEmptyList2 == null) {
                listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
            }
            for (Pair pair : CollectionsKt___CollectionsKt.zip(listEmptyList, listEmptyList2)) {
                arrayList.add(new Root((View) pair.component1(), (WindowManager.LayoutParams) pair.component2()));
            }
            return arrayList;
        } catch (IllegalAccessException e2) {
            String str = e;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Log.d(str, String.format("Reflective access to %s or %s on %s failed.", Arrays.copyOf(new Object[]{this.viewsField, this.paramsField, this.windowManagerObj}, 3)), e2);
            return null;
        } catch (RuntimeException e3) {
            String str2 = e;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            Log.d(str2, String.format("Reflective access to %s or %s on %s failed.", Arrays.copyOf(new Object[]{this.viewsField, this.paramsField, this.windowManagerObj}, 3)), e3);
            return null;
        }
    }
}
