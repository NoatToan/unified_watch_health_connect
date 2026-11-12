package com.garmin.android.apps.connectmobile.developer.tutorials;

import a23.f;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import c53.c0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.Gson;
import e23.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import y80.a0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/developer/tutorials/c;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f33727c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f33728a = new w1(s0.f105811a.b(k80.a.class), new C0566c(this), new e(this), new d(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f33729b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f33730a;

        public b(l lVar) {
            lVar.getClass();
            this.f33730a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f33730a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f33730a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.developer.tutorials.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0566c extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f33731a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0566c(Fragment fragment) {
            super(0);
            this.f33731a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f33731a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f33732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f33733b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f33732a = aVar;
            this.f33733b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f33732a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f33733b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f33734a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f33734a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f33734a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Uri data;
        File filesDir;
        super.onActivityResult(i14, i15, intent);
        if (i14 != 123 || i15 != -1 || intent == null || (data = intent.getData()) == null) {
            return;
        }
        k80.a aVarU6 = u6();
        a0 a0Var = aVarU6.f103336f;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVarU6.f103334d.j(data);
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                filesDir = contextRequireContext.getExternalFilesDir(null);
                if (filesDir == null) {
                    filesDir = contextRequireContext.getFilesDir();
                }
                filesDir.getClass();
            } else {
                filesDir = contextRequireContext.getFilesDir();
                filesDir.getClass();
            }
            File file = new File(filesDir, "tutorials");
            k80.a.x4(file);
            file.mkdir();
            File file2 = new File(file, "tutorials.zip");
            InputStream inputStreamOpenInputStream = contextRequireContext.getContentResolver().openInputStream(data);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            if (inputStreamOpenInputStream != null) {
                dh.b.p(inputStreamOpenInputStream, fileOutputStream, 8192);
            }
            fileOutputStream.close();
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream.close();
            }
            k80.a.y4(aVarU6, file2);
            List<File> listS = c0.s(c0.h(f.c(file, a23.c.TOP_DOWN), new jy0.b(25)));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str = "";
            String strA = null;
            dr1.a aVar = null;
            for (File file3 : listS) {
                String name = file3.getName();
                name.getClass();
                a0Var.getClass();
                if (d53.w.z(name, "lottie.json", true)) {
                    try {
                        strA = a23.e.a(file3, d53.c.f57666b);
                    } catch (Exception e4) {
                        String string = e4.toString();
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.f(a2Var, "DevDeviceTutorialAnimation", string);
                        str = str + "\n\nError reading text from Lottie .json file " + e4.getMessage();
                    }
                } else {
                    String name2 = file3.getName();
                    name2.getClass();
                    if (d53.w.z(name2, "lottie_tutorials_setup.json", true)) {
                        try {
                            aVar = (dr1.a) new Gson().fromJson(a23.e.a(file3, d53.c.f57666b), dr1.a.class);
                        } catch (Exception e14) {
                            String string2 = e14.toString();
                            i2.a aVar3 = i2.f36769a;
                            a2 a2Var2 = a2.GENERAL;
                            aVar3.getClass();
                            i2.a.f(a2Var2, "DevDeviceTutorialAnimation", string2);
                            str = str + "\n\nError parsing lottie_tutorials_setup.json " + e14.getMessage();
                        }
                    } else {
                        String name3 = file3.getName();
                        name3.getClass();
                        if (d53.w.z(name3, ".png", true)) {
                            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new FileInputStream(file3));
                            if (bitmapDecodeStream != null) {
                                linkedHashMap.put(file3.getName(), bitmapDecodeStream);
                            } else {
                                str = str + "\n\nError decoding Bitmap from " + file3.getName();
                            }
                        }
                    }
                }
            }
            if (strA == null) {
                str = str + "\n\nCannot find a valid Lottie .json file (name ending in \"lottie.json\")";
            }
            if (aVar == null) {
                str = str + "\n\nCannot find a valid lottie_tutorials_setup.json";
            }
            if (linkedHashMap.get("device_frame.png") == null) {
                str = str + "\n\nMissing device_frame.png asset";
            }
            aVarU6.f103333c.j(str);
            if (strA == null || aVar == null) {
                return;
            }
            y0<aa0.d> y0Var = aVarU6.f103332b;
            k22.b bVar = new k22.b(contextRequireContext);
            int i16 = a0.f195083b;
            a0Var.getClass();
            y0Var.j(a0.a(strA, aVar, linkedHashMap, bVar, null));
        } catch (Exception e15) {
            String string3 = e15.toString();
            i2.a aVar4 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var3, "DevDeviceTutorialAnimation", string3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_dev_device_tutorials, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        final int i14 = 0;
        ((Button) view2.findViewById(R.id.dev_browse_devices)).setOnClickListener(new View.OnClickListener(this) { // from class: k80.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.developer.tutorials.c f103351b;

            {
                this.f103351b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.developer.tutorials.c cVar = this.f103351b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.developer.tutorials.c.a aVar = com.garmin.android.apps.connectmobile.developer.tutorials.c.f33727c;
                        cVar.u6().f103331a.m(m.SHOW_DEVICE_LIST);
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.developer.tutorials.c.a aVar2 = com.garmin.android.apps.connectmobile.developer.tutorials.c.f33727c;
                        Intent intent = new Intent("android.intent.action.GET_CONTENT");
                        intent.setType("application/zip");
                        intent.addCategory("android.intent.category.OPENABLE");
                        cVar.startActivityForResult(Intent.createChooser(intent, "Select tutorials ZIP file"), 123);
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.developer.tutorials.c.a aVar3 = com.garmin.android.apps.connectmobile.developer.tutorials.c.f33727c;
                        cVar.u6().f103331a.m(m.PAIR);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.developer.tutorials.c.a aVar4 = com.garmin.android.apps.connectmobile.developer.tutorials.c.f33727c;
                        cVar.u6().f103331a.m(m.GESTURE);
                        break;
                }
            }
        });
        final int i15 = 1;
        ((Button) view2.findViewById(R.id.dev_import_tutorials_zip)).setOnClickListener(new View.OnClickListener(this) { // from class: k80.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.developer.tutorials.c f103351b;

            {
                this.f103351b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.developer.tutorials.c cVar = this.f103351b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.developer.tutorials.c.a aVar = com.garmin.android.apps.connectmobile.developer.tutorials.c.f33727c;
                        cVar.u6().f103331a.m(m.SHOW_DEVICE_LIST);
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.developer.tutorials.c.a aVar2 = com.garmin.android.apps.connectmobile.developer.tutorials.c.f33727c;
                        Intent intent = new Intent("android.intent.action.GET_CONTENT");
                        intent.setType("application/zip");
                        intent.addCategory("android.intent.category.OPENABLE");
                        cVar.startActivityForResult(Intent.createChooser(intent, "Select tutorials ZIP file"), 123);
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.developer.tutorials.c.a aVar3 = com.garmin.android.apps.connectmobile.developer.tutorials.c.f33727c;
                        cVar.u6().f103331a.m(m.PAIR);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.developer.tutorials.c.a aVar4 = com.garmin.android.apps.connectmobile.developer.tutorials.c.f33727c;
                        cVar.u6().f103331a.m(m.GESTURE);
                        break;
                }
            }
        });
        Button button = (Button) view2.findViewById(R.id.dev_pair_tutorials);
        final int i16 = 2;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: k80.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.developer.tutorials.c f103351b;

            {
                this.f103351b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i17 = i16;
                com.garmin.android.apps.connectmobile.developer.tutorials.c cVar = this.f103351b;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.developer.tutorials.c.a aVar = com.garmin.android.apps.connectmobile.developer.tutorials.c.f33727c;
                        cVar.u6().f103331a.m(m.SHOW_DEVICE_LIST);
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.developer.tutorials.c.a aVar2 = com.garmin.android.apps.connectmobile.developer.tutorials.c.f33727c;
                        Intent intent = new Intent("android.intent.action.GET_CONTENT");
                        intent.setType("application/zip");
                        intent.addCategory("android.intent.category.OPENABLE");
                        cVar.startActivityForResult(Intent.createChooser(intent, "Select tutorials ZIP file"), 123);
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.developer.tutorials.c.a aVar3 = com.garmin.android.apps.connectmobile.developer.tutorials.c.f33727c;
                        cVar.u6().f103331a.m(m.PAIR);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.developer.tutorials.c.a aVar4 = com.garmin.android.apps.connectmobile.developer.tutorials.c.f33727c;
                        cVar.u6().f103331a.m(m.GESTURE);
                        break;
                }
            }
        });
        Button button2 = (Button) view2.findViewById(R.id.dev_gesture_tutorials);
        final int i17 = 3;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: k80.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.developer.tutorials.c f103351b;

            {
                this.f103351b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i18 = i17;
                com.garmin.android.apps.connectmobile.developer.tutorials.c cVar = this.f103351b;
                switch (i18) {
                    case 0:
                        com.garmin.android.apps.connectmobile.developer.tutorials.c.a aVar = com.garmin.android.apps.connectmobile.developer.tutorials.c.f33727c;
                        cVar.u6().f103331a.m(m.SHOW_DEVICE_LIST);
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.developer.tutorials.c.a aVar2 = com.garmin.android.apps.connectmobile.developer.tutorials.c.f33727c;
                        Intent intent = new Intent("android.intent.action.GET_CONTENT");
                        intent.setType("application/zip");
                        intent.addCategory("android.intent.category.OPENABLE");
                        cVar.startActivityForResult(Intent.createChooser(intent, "Select tutorials ZIP file"), 123);
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.developer.tutorials.c.a aVar3 = com.garmin.android.apps.connectmobile.developer.tutorials.c.f33727c;
                        cVar.u6().f103331a.m(m.PAIR);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.developer.tutorials.c.a aVar4 = com.garmin.android.apps.connectmobile.developer.tutorials.c.f33727c;
                        cVar.u6().f103331a.m(m.GESTURE);
                        break;
                }
            }
        });
        View viewFindViewById = view2.findViewById(R.id.dev_tutorials_error);
        viewFindViewById.getClass();
        this.f33729b = (TextView) viewFindViewById;
        u6().f103333c.f(getViewLifecycleOwner(), new b(new iz1.f(this, 21)));
        u6().f103332b.f(getViewLifecycleOwner(), new b(new jt1.d(7, button, button2)));
    }

    public final k80.a u6() {
        return (k80.a) this.f33728a.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/developer/tutorials/c$a;", "", "<init>", "()V", "", "PICK_FILE_RESULT_CODE", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
