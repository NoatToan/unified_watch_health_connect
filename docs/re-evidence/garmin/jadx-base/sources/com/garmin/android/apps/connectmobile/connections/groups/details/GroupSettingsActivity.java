package com.garmin.android.apps.connectmobile.connections.groups.details;

import am.r1;
import am.x0;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.m;
import androidx.lifecycle.x1;
import bi2.k;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connections.groups.details.GroupSettingsActivity;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.i;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.social.share.UCropImageActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import f.j;
import fw.p;
import g.e;
import g.h;
import gg1.l0;
import i3.e5;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes7.dex */
public class GroupSettingsActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f31420z = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f31422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f31423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BottomSheetDialog f31424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k10.d f31425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f31426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f31427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GCMComplexTwoLineButton f31428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public GCMComplexTwoLineButton f31429i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GCMComplexTwoLineButton f31430j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public GCMComplexTwoLineButton f31431k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public GCMComplexTwoLineButton f31432l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public GCMComplexTwoLineButton f31433m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public GCMComplexTwoLineButton f31434n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public GCMComplexTwoLineButton f31435o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public GCMComplexTwoLineButton f31436p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public GCMComplexTwoLineButton f31437q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public GCMComplexTwoLineButton f31438r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public GroupDTO f31439t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public GroupDTO f31440v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f.c<Intent> f31441w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final f.c<j> f31442x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f31421a = new l0(2);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f.c<Intent> f31443y = registerForActivityResult(new h(), new a());

    public class a implements f.b<f.a> {
        public a() {
        }

        @Override // f.b
        public final void a(f.a aVar) {
            Intent intent;
            GroupDTO groupDTO;
            f.a aVar2 = aVar;
            if (aVar2.f67585a != -1 || (intent = aVar2.f67586b) == null || (groupDTO = (GroupDTO) intent.getParcelableExtra("GCM_extra_connection_group")) == null) {
                return;
            }
            GroupSettingsActivity groupSettingsActivity = GroupSettingsActivity.this;
            groupSettingsActivity.f31439t = groupDTO;
            groupSettingsActivity.ja();
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f31446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f31447c;

        static {
            int[] iArr = new int[p.values().length];
            f31447c = iArr;
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31447c[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31447c[p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[GroupDTO.d.values().length];
            f31446b = iArr2;
            try {
                iArr2[GroupDTO.d.PUBLIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31446b[GroupDTO.d.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31446b[GroupDTO.d.INVITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[GroupDTO.e.values().length];
            f31445a = iArr3;
            try {
                iArr3[GroupDTO.e.VISIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f31445a[GroupDTO.e.HIDDEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public GroupSettingsActivity() {
        final int i14 = 0;
        this.f31441w = registerForActivityResult(new h(), new f.b(this) { // from class: j10.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupSettingsActivity f96381b;

            {
                this.f96381b = this;
            }

            /* JADX WARN: Code duplicated, block: B:55:0x00ee A[Catch: Exception -> 0x0148, TryCatch #3 {Exception -> 0x0148, blocks: (B:18:0x0055, B:53:0x00ea, B:55:0x00ee, B:57:0x00f8, B:59:0x010d, B:61:0x0113, B:62:0x012c, B:63:0x0144, B:52:0x00c4, B:19:0x0071, B:32:0x009d, B:51:0x00c3, B:50:0x00c0), top: B:72:0x0055, inners: #5 }] */
            /* JADX WARN: Code duplicated, block: B:59:0x010d A[Catch: Exception -> 0x0148, TryCatch #3 {Exception -> 0x0148, blocks: (B:18:0x0055, B:53:0x00ea, B:55:0x00ee, B:57:0x00f8, B:59:0x010d, B:61:0x0113, B:62:0x012c, B:63:0x0144, B:52:0x00c4, B:19:0x0071, B:32:0x009d, B:51:0x00c3, B:50:0x00c0), top: B:72:0x0055, inners: #5 }] */
            /* JADX WARN: Code duplicated, block: B:62:0x012c A[Catch: Exception -> 0x0148, TryCatch #3 {Exception -> 0x0148, blocks: (B:18:0x0055, B:53:0x00ea, B:55:0x00ee, B:57:0x00f8, B:59:0x010d, B:61:0x0113, B:62:0x012c, B:63:0x0144, B:52:0x00c4, B:19:0x0071, B:32:0x009d, B:51:0x00c3, B:50:0x00c0), top: B:72:0x0055, inners: #5 }] */
            /* JADX WARN: Instruction removed from duplicated block: B:62:0x012c, please report this as an issue */
            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Uri uri;
                File file;
                switch (i14) {
                    case 0:
                        GroupSettingsActivity groupSettingsActivity = this.f96381b;
                        f.a aVar = (f.a) obj;
                        int i15 = GroupSettingsActivity.f31420z;
                        if (aVar.f67585a != -1 || (intent = aVar.f67586b) == null) {
                            return;
                        }
                        Uri uri2 = Build.VERSION.SDK_INT >= 33 ? (Uri) intent.getParcelableExtra("input_uri", Uri.class) : (Uri) intent.getParcelableExtra("input_uri");
                        if (uri2 == null) {
                            i2.f(a2.CONNECTIONS, "GroupSettingsActivity", "Invalid URI: null");
                            return;
                        }
                        try {
                            String str = "temp_group_photo_" + System.currentTimeMillis();
                            Uri uriFromFile = Uri.fromFile(File.createTempFile(str, null, groupSettingsActivity.getCacheDir()));
                            try {
                                InputStream inputStreamOpenInputStream = groupSettingsActivity.getContentResolver().openInputStream(uri2);
                                try {
                                    OutputStream outputStreamOpenOutputStream = groupSettingsActivity.getContentResolver().openOutputStream(uriFromFile);
                                    try {
                                        if (inputStreamOpenInputStream == null || outputStreamOpenOutputStream == null) {
                                            throw new Exception("Failed to open input or output stream for copying cropped group photo");
                                        }
                                        byte[] bArr = new byte[1024];
                                        while (true) {
                                            int i16 = inputStreamOpenInputStream.read(bArr);
                                            if (i16 <= 0) {
                                                outputStreamOpenOutputStream.flush();
                                                outputStreamOpenOutputStream.close();
                                                inputStreamOpenInputStream.close();
                                                uri = groupSettingsActivity.f31426f;
                                                if (uri != null && uri.toString().contains("temp_group_photo_")) {
                                                    file = new File(URI.create(groupSettingsActivity.f31426f.toString()));
                                                    if (file.exists() || !file.delete()) {
                                                        i2.f(a2.CONNECTIONS, "GroupSettingsActivity", "Try to delete previous temp group photo but failed: " + groupSettingsActivity.f31426f);
                                                    } else {
                                                        i2.a(a2.CONNECTIONS, "GroupSettingsActivity", "Deleted previous temp group photo: " + groupSettingsActivity.f31426f);
                                                    }
                                                }
                                                groupSettingsActivity.ha(uriFromFile, null);
                                                return;
                                            }
                                            outputStreamOpenOutputStream.write(bArr, 0, i16);
                                        }
                                    } catch (Throwable th3) {
                                        if (outputStreamOpenOutputStream == null) {
                                            throw th3;
                                        }
                                        try {
                                            outputStreamOpenOutputStream.close();
                                            throw th3;
                                        } catch (Throwable th4) {
                                            th3.addSuppressed(th4);
                                            throw th3;
                                        }
                                        i2.f(a2.CONNECTIONS, "GroupSettingsActivity", "Failed to copy cropped group photo to new temp file: " + str + ", from original uri: " + uri2 + ", error: " + e);
                                        uri = groupSettingsActivity.f31426f;
                                        if (uri != null) {
                                            file = new File(URI.create(groupSettingsActivity.f31426f.toString()));
                                            if (file.exists()) {
                                                i2.f(a2.CONNECTIONS, "GroupSettingsActivity", "Try to delete previous temp group photo but failed: " + groupSettingsActivity.f31426f);
                                            } else {
                                                i2.f(a2.CONNECTIONS, "GroupSettingsActivity", "Try to delete previous temp group photo but failed: " + groupSettingsActivity.f31426f);
                                            }
                                        }
                                        groupSettingsActivity.ha(uriFromFile, null);
                                        return;
                                    }
                                } catch (Throwable th5) {
                                    if (inputStreamOpenInputStream == null) {
                                        throw th5;
                                    }
                                    try {
                                        inputStreamOpenInputStream.close();
                                        throw th5;
                                    } catch (Throwable th6) {
                                        th5.addSuppressed(th6);
                                        throw th5;
                                    }
                                    uri = groupSettingsActivity.f31426f;
                                    if (uri != null) {
                                        file = new File(URI.create(groupSettingsActivity.f31426f.toString()));
                                        if (file.exists()) {
                                            i2.f(a2.CONNECTIONS, "GroupSettingsActivity", "Try to delete previous temp group photo but failed: " + groupSettingsActivity.f31426f);
                                        } else {
                                            i2.f(a2.CONNECTIONS, "GroupSettingsActivity", "Try to delete previous temp group photo but failed: " + groupSettingsActivity.f31426f);
                                        }
                                    }
                                    groupSettingsActivity.ha(uriFromFile, null);
                                    return;
                                }
                            } catch (Exception e4) {
                                i2.f(a2.CONNECTIONS, "GroupSettingsActivity", "Failed to copy cropped group photo to new temp file: " + str + ", from original uri: " + uri2 + ", error: " + e4);
                            }
                        } catch (Exception unused) {
                            i2.f(a2.CONNECTIONS, "GroupSettingsActivity", "Invalid URI: " + uri2);
                            return;
                        }
                        break;
                    default:
                        Uri uri3 = (Uri) obj;
                        int i17 = GroupSettingsActivity.f31420z;
                        if (uri3 != null) {
                            UCropImageActivity.b bVar = UCropImageActivity.b.RECTANGLE;
                            UCropImageActivity.a aVar2 = UCropImageActivity.f44623o;
                            aVar2.getClass();
                            bVar.getClass();
                            GroupSettingsActivity groupSettingsActivity2 = this.f96381b;
                            groupSettingsActivity2.f31441w.a(UCropImageActivity.a.a(aVar2, groupSettingsActivity2, uri3, 375, 180, bVar, null, 0.0f, 224), null);
                            return;
                        }
                        return;
                }
            }
        });
        final int i15 = 1;
        this.f31442x = registerForActivityResult(new e(), new f.b(this) { // from class: j10.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupSettingsActivity f96381b;

            {
                this.f96381b = this;
            }

            /* JADX WARN: Code duplicated, block: B:55:0x00ee A[Catch: Exception -> 0x0148, TryCatch #3 {Exception -> 0x0148, blocks: (B:18:0x0055, B:53:0x00ea, B:55:0x00ee, B:57:0x00f8, B:59:0x010d, B:61:0x0113, B:62:0x012c, B:63:0x0144, B:52:0x00c4, B:19:0x0071, B:32:0x009d, B:51:0x00c3, B:50:0x00c0), top: B:72:0x0055, inners: #5 }] */
            /* JADX WARN: Code duplicated, block: B:59:0x010d A[Catch: Exception -> 0x0148, TryCatch #3 {Exception -> 0x0148, blocks: (B:18:0x0055, B:53:0x00ea, B:55:0x00ee, B:57:0x00f8, B:59:0x010d, B:61:0x0113, B:62:0x012c, B:63:0x0144, B:52:0x00c4, B:19:0x0071, B:32:0x009d, B:51:0x00c3, B:50:0x00c0), top: B:72:0x0055, inners: #5 }] */
            /* JADX WARN: Code duplicated, block: B:62:0x012c A[Catch: Exception -> 0x0148, TryCatch #3 {Exception -> 0x0148, blocks: (B:18:0x0055, B:53:0x00ea, B:55:0x00ee, B:57:0x00f8, B:59:0x010d, B:61:0x0113, B:62:0x012c, B:63:0x0144, B:52:0x00c4, B:19:0x0071, B:32:0x009d, B:51:0x00c3, B:50:0x00c0), top: B:72:0x0055, inners: #5 }] */
            /* JADX WARN: Instruction removed from duplicated block: B:62:0x012c, please report this as an issue */
            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Uri uri;
                File file;
                switch (i15) {
                    case 0:
                        GroupSettingsActivity groupSettingsActivity = this.f96381b;
                        f.a aVar = (f.a) obj;
                        int i16 = GroupSettingsActivity.f31420z;
                        if (aVar.f67585a != -1 || (intent = aVar.f67586b) == null) {
                            return;
                        }
                        Uri uri2 = Build.VERSION.SDK_INT >= 33 ? (Uri) intent.getParcelableExtra("input_uri", Uri.class) : (Uri) intent.getParcelableExtra("input_uri");
                        if (uri2 == null) {
                            i2.f(a2.CONNECTIONS, "GroupSettingsActivity", "Invalid URI: null");
                            return;
                        }
                        try {
                            String str = "temp_group_photo_" + System.currentTimeMillis();
                            Uri uriFromFile = Uri.fromFile(File.createTempFile(str, null, groupSettingsActivity.getCacheDir()));
                            try {
                                InputStream inputStreamOpenInputStream = groupSettingsActivity.getContentResolver().openInputStream(uri2);
                                try {
                                    OutputStream outputStreamOpenOutputStream = groupSettingsActivity.getContentResolver().openOutputStream(uriFromFile);
                                    try {
                                        if (inputStreamOpenInputStream == null || outputStreamOpenOutputStream == null) {
                                            throw new Exception("Failed to open input or output stream for copying cropped group photo");
                                        }
                                        byte[] bArr = new byte[1024];
                                        while (true) {
                                            int i17 = inputStreamOpenInputStream.read(bArr);
                                            if (i17 <= 0) {
                                                outputStreamOpenOutputStream.flush();
                                                outputStreamOpenOutputStream.close();
                                                inputStreamOpenInputStream.close();
                                                uri = groupSettingsActivity.f31426f;
                                                if (uri != null && uri.toString().contains("temp_group_photo_")) {
                                                    file = new File(URI.create(groupSettingsActivity.f31426f.toString()));
                                                    if (file.exists() || !file.delete()) {
                                                        i2.f(a2.CONNECTIONS, "GroupSettingsActivity", "Try to delete previous temp group photo but failed: " + groupSettingsActivity.f31426f);
                                                    } else {
                                                        i2.a(a2.CONNECTIONS, "GroupSettingsActivity", "Deleted previous temp group photo: " + groupSettingsActivity.f31426f);
                                                    }
                                                }
                                                groupSettingsActivity.ha(uriFromFile, null);
                                                return;
                                            }
                                            outputStreamOpenOutputStream.write(bArr, 0, i17);
                                        }
                                    } catch (Throwable th3) {
                                        if (outputStreamOpenOutputStream == null) {
                                            throw th3;
                                        }
                                        try {
                                            outputStreamOpenOutputStream.close();
                                            throw th3;
                                        } catch (Throwable th4) {
                                            th3.addSuppressed(th4);
                                            throw th3;
                                        }
                                        i2.f(a2.CONNECTIONS, "GroupSettingsActivity", "Failed to copy cropped group photo to new temp file: " + str + ", from original uri: " + uri2 + ", error: " + e4);
                                        uri = groupSettingsActivity.f31426f;
                                        if (uri != null) {
                                            file = new File(URI.create(groupSettingsActivity.f31426f.toString()));
                                            if (file.exists()) {
                                                i2.f(a2.CONNECTIONS, "GroupSettingsActivity", "Try to delete previous temp group photo but failed: " + groupSettingsActivity.f31426f);
                                            } else {
                                                i2.f(a2.CONNECTIONS, "GroupSettingsActivity", "Try to delete previous temp group photo but failed: " + groupSettingsActivity.f31426f);
                                            }
                                        }
                                        groupSettingsActivity.ha(uriFromFile, null);
                                        return;
                                    }
                                } catch (Throwable th5) {
                                    if (inputStreamOpenInputStream == null) {
                                        throw th5;
                                    }
                                    try {
                                        inputStreamOpenInputStream.close();
                                        throw th5;
                                    } catch (Throwable th6) {
                                        th5.addSuppressed(th6);
                                        throw th5;
                                    }
                                    uri = groupSettingsActivity.f31426f;
                                    if (uri != null) {
                                        file = new File(URI.create(groupSettingsActivity.f31426f.toString()));
                                        if (file.exists()) {
                                            i2.f(a2.CONNECTIONS, "GroupSettingsActivity", "Try to delete previous temp group photo but failed: " + groupSettingsActivity.f31426f);
                                        } else {
                                            i2.f(a2.CONNECTIONS, "GroupSettingsActivity", "Try to delete previous temp group photo but failed: " + groupSettingsActivity.f31426f);
                                        }
                                    }
                                    groupSettingsActivity.ha(uriFromFile, null);
                                    return;
                                }
                            } catch (Exception e4) {
                                i2.f(a2.CONNECTIONS, "GroupSettingsActivity", "Failed to copy cropped group photo to new temp file: " + str + ", from original uri: " + uri2 + ", error: " + e4);
                            }
                        } catch (Exception unused) {
                            i2.f(a2.CONNECTIONS, "GroupSettingsActivity", "Invalid URI: " + uri2);
                            return;
                        }
                        break;
                    default:
                        Uri uri3 = (Uri) obj;
                        int i18 = GroupSettingsActivity.f31420z;
                        if (uri3 != null) {
                            UCropImageActivity.b bVar = UCropImageActivity.b.RECTANGLE;
                            UCropImageActivity.a aVar2 = UCropImageActivity.f44623o;
                            aVar2.getClass();
                            bVar.getClass();
                            GroupSettingsActivity groupSettingsActivity2 = this.f96381b;
                            groupSettingsActivity2.f31441w.a(UCropImageActivity.a.a(aVar2, groupSettingsActivity2, uri3, 375, 180, bVar, null, 0.0f, 224), null);
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void ga(EditText editText, String str, String str2) {
        editText.setText(str);
        editText.setHint(str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        editText.setSelection(str.length());
    }

    @SuppressLint({"InflateParams"})
    public final View ca() {
        return getLayoutInflater().inflate(R.layout.gcm_dialog_text_editor, (ViewGroup) null);
    }

    public final androidx.appcompat.app.e da(String str, View view2, DialogInterface.OnClickListener onClickListener) {
        return new androidx.appcompat.app.e.a(this).setTitle(str).setCancelable(true).setView(view2).setPositiveButton(R.string.lbl_done, new k(this, 18, onClickListener, view2)).create();
    }

    public final void ea() {
        if (this.f31424d == null) {
            BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
            this.f31424d = bottomSheetDialog;
            bottomSheetDialog.setContentView(R.layout.group_admin_setting_image_bottom_sheet);
            TextView textView = (TextView) this.f31424d.findViewById(R.id.select_stock_image_text);
            TextView textView2 = (TextView) this.f31424d.findViewById(R.id.upload_image_text);
            TextView textView3 = (TextView) this.f31424d.findViewById(R.id.reposition_image_text);
            textView.setOnClickListener(new j10.h(this, 5));
            textView2.setOnClickListener(new j10.h(this, 6));
            textView3.setOnClickListener(new j10.h(this, 7));
        }
        if (this.f31424d.isShowing()) {
            return;
        }
        this.f31424d.show();
    }

    public final void fa() {
        String string = getString(R.string.message_common_confirm_leaving_screen);
        hy.d dVar = new hy.d(this, 6);
        q1.f41066b.getClass();
        q1.b.a(R.string.lbl_admin_settings, string, R.string.lbl_yes, R.string.lbl_cancel, dVar).show(getSupportFragmentManager(), (String) null);
    }

    public final void ha(Uri uri, String str) {
        if (uri != null) {
            if (URLUtil.isFileUrl(uri.toString())) {
                File file = new File(URI.create(uri.toString()));
                zp0.c.f206560v.getClass();
                zp0.c cVar = new zp0.c((m) this);
                cVar.f206569i = file;
                cVar.h(this.f31422b);
            } else {
                zp0.c.f206560v.getClass();
                zp0.c cVar2 = new zp0.c((m) this);
                cVar2.f206568h = uri;
                cVar2.h(this.f31422b);
            }
        } else if (!TextUtils.isEmpty(str)) {
            k10.d dVar = this.f31425e;
            dVar.getClass();
            int iS = dVar.f102157c.s(this, str);
            zp0.c.f206560v.getClass();
            zp0.c cVar3 = new zp0.c((m) this);
            cVar3.f206567g = iS;
            cVar3.h(this.f31422b);
        } else if (!TextUtils.isEmpty(this.f31439t.f31564g)) {
            zp0.c.f206560v.getClass();
            zp0.c cVar4 = new zp0.c((m) this);
            cVar4.f206570j = 2131232395;
            cVar4.f206565e = this.f31439t.f31564g;
            cVar4.h(this.f31422b);
        } else if (TextUtils.isEmpty(this.f31439t.I)) {
            zp0.c.f206560v.getClass();
            zp0.c cVar5 = new zp0.c((m) this);
            k10.a aVar = k10.a.f102143a;
            cVar5.f206567g = 2131232829;
            cVar5.h(this.f31422b);
        } else {
            k10.d dVar2 = this.f31425e;
            String str2 = this.f31439t.I;
            dVar2.getClass();
            int iS2 = dVar2.f102157c.s(this, str2);
            zp0.c.f206560v.getClass();
            zp0.c cVar6 = new zp0.c((m) this);
            cVar6.f206567g = iS2;
            cVar6.h(this.f31422b);
        }
        this.f31426f = uri;
        this.f31427g = str;
    }

    public final void ia(List<com.garmin.android.apps.connectmobile.group.service.model.a> list) {
        for (int i14 = 0; i14 < list.size(); i14++) {
            com.garmin.android.apps.connectmobile.group.service.model.a aVar = list.get(i14);
            if (aVar.d()) {
                this.f31439t.f31564g = aVar.getUrl();
            } else {
                boolean zF = aVar.f();
                GroupDTO groupDTO = this.f31439t;
                if (zF) {
                    groupDTO.f31565h = aVar.getUrl();
                } else {
                    groupDTO.f31566i = aVar.getUrl();
                }
            }
        }
    }

    public final void ja() {
        String string;
        ha(null, null);
        this.f31428h.setButtonBottomLeftLabel(this.f31439t.f31559b);
        this.f31429i.setButtonBottomLeftLabel(this.f31439t.f31560c);
        this.f31430j.setButtonBottomLeftLabel(this.f31439t.f31569l);
        this.f31431k.setButtonBottomLeftLabel(this.f31439t.f31571n);
        this.f31432l.setButtonBottomLeftLabel(this.f31439t.f31572o);
        this.f31433m.setButtonBottomLeftLabel(this.f31439t.f31570m);
        int i14 = b.f31445a[this.f31439t.f31567j.ordinal()];
        String string2 = i14 != 1 ? i14 != 2 ? null : getString(R.string.lbl_group_privacy_visible_to_group_members) : getString(R.string.lbl_group_privacy_visible_to_everyone);
        int i15 = b.f31446b[this.f31439t.f31568k.ordinal()];
        if (i15 == 1) {
            string = getString(R.string.lbl_join_instantly);
        } else if (i15 != 2) {
            string = i15 != 3 ? null : getString(R.string.lbl_group_privacy_meta_invitation_only);
        } else {
            string = getString(R.string.lbl_group_privacy_meta_approval_required);
        }
        this.f31434n.setButtonBottomLeftLabel(e5.g(string2, (string2 == null || string == null) ? "" : " | ", string));
        ArrayList arrayList = this.f31439t.f31573p;
        ArrayList arrayListJ = arrayList != null ? jm0.e.j(arrayList) : null;
        StringBuilder sb3 = new StringBuilder();
        if (arrayListJ != null) {
            for (int i16 = 0; i16 < arrayListJ.size(); i16++) {
                com.garmin.android.apps.connectmobile.connections.groups.services.model.e eVar = (com.garmin.android.apps.connectmobile.connections.groups.services.model.e) arrayListJ.get(i16);
                String string3 = getString(((com.garmin.android.apps.connectmobile.connections.groups.services.model.e) arrayListJ.get(i16)).f31647b);
                if (eVar == com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_OTHER) {
                    string3 = this.f31439t.f31574q;
                }
                sb3.append(string3);
                if (i16 != arrayListJ.size() - 1) {
                    sb3.append(", ");
                }
            }
        }
        this.f31435o.setButtonBottomLeftLabel(sb3.toString());
        ArrayList arrayList2 = this.f31439t.f31577v;
        int size = arrayList2.size();
        StringBuilder sb4 = new StringBuilder();
        for (x0 x0Var : r1.b(new ArrayList(r1.a(this)))) {
            if (size <= 0) {
                break;
            }
            for (int i17 = 0; i17 < this.f31439t.f31577v.size(); i17++) {
                com.garmin.android.apps.connectmobile.connections.groups.services.model.a aVar = (com.garmin.android.apps.connectmobile.connections.groups.services.model.a) arrayList2.get(i17);
                i.f36758a.getClass();
                if (i.e(x0Var) == Integer.parseInt(aVar.f31607a)) {
                    if (sb4.length() > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(dh.b.A(this, x0Var.f4360c));
                    size--;
                    break;
                }
            }
        }
        this.f31436p.setButtonBottomLeftLabel(sb4.toString());
        ArrayList arrayList3 = this.f31439t.f31575r;
        StringBuilder sb5 = new StringBuilder();
        if (arrayList3 != null) {
            for (int i18 = 0; i18 < arrayList3.size(); i18++) {
                sb5.append(getString(((j10.d) arrayList3.get(i18)).f96364c));
                if (i18 != arrayList3.size() - 1) {
                    sb5.append(", ");
                }
            }
        }
        this.f31437q.setButtonBottomLeftLabel(sb5.toString());
        ArrayList arrayList4 = this.f31439t.f31576t;
        StringBuilder sb6 = new StringBuilder();
        if (arrayList4 != null) {
            for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                if (arrayList4.get(i19) != GroupDTO.b.LEADERBOARD) {
                    sb6.append(getString(((GroupDTO.b) arrayList4.get(i19)).f31587a));
                    if (i19 != arrayList4.size() - 1) {
                        sb6.append(", ");
                    }
                }
            }
        }
        this.f31438r.setButtonBottomLeftLabel(sb6.toString());
        if (((f12.b) KoinJavaComponent.inject(f12.b.class).getValue()).f()) {
            this.f31431k.setVisibility(8);
            this.f31432l.setVisibility(8);
        }
    }

    public final void ka() {
        k10.d dVar = this.f31425e;
        GroupDTO groupDTO = this.f31439t;
        String str = groupDTO.f31558a;
        dVar.getClass();
        str.getClass();
        xy2.b.K(dVar, new k10.e(dVar, str, groupDTO, null)).f(this, new j10.i(this, 2));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1) {
            if (i14 != 1) {
                if (i14 != 2) {
                    return;
                }
                ha(null, intent.getStringExtra("extra_group_default_image_select_id"));
            } else {
                GroupDTO groupDTO = (GroupDTO) intent.getParcelableExtra("GCM_extra_connection_group");
                if (groupDTO != null) {
                    this.f31439t = groupDTO;
                    ja();
                }
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (this.f31439t.equals(this.f31440v) && this.f31426f == null && TextUtils.isEmpty(this.f31427g)) {
            super.onBackPressed();
        } else {
            fa();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_group_settings_3_0);
        super.initActionBar(true, R.string.lbl_group_settings);
        GroupDTO groupDTO = (GroupDTO) getIntent().getParcelableExtra("GCM_extra_connection_group");
        this.f31439t = groupDTO;
        if (groupDTO == null) {
            Toast.makeText(this, R.string.txt_error_occurred, 1).show();
            finish();
        }
        this.f31440v = (GroupDTO) this.f31439t.clone();
        this.f31422b = (ImageView) findViewById(R.id.group_image_view);
        this.f31423c = (TextView) findViewById(R.id.edit_group_image_text);
        this.f31422b.setOnClickListener(new j10.h(this, 0));
        this.f31423c.setOnClickListener(new j10.h(this, 10));
        this.f31425e = (k10.d) new x1(this).b(s0.f105811a.b(k10.d.class));
        this.f31428h = (GCMComplexTwoLineButton) findViewById(R.id.edit_group_name);
        this.f31429i = (GCMComplexTwoLineButton) findViewById(R.id.edit_group_description);
        this.f31430j = (GCMComplexTwoLineButton) findViewById(R.id.edit_group_location);
        this.f31431k = (GCMComplexTwoLineButton) findViewById(R.id.edit_group_facebook);
        this.f31432l = (GCMComplexTwoLineButton) findViewById(R.id.edit_group_twitter);
        this.f31433m = (GCMComplexTwoLineButton) findViewById(R.id.edit_group_website);
        this.f31434n = (GCMComplexTwoLineButton) findViewById(R.id.edit_group_privacy);
        this.f31435o = (GCMComplexTwoLineButton) findViewById(R.id.edit_group_what_we_do);
        this.f31436p = (GCMComplexTwoLineButton) findViewById(R.id.edit_group_activity_feed_types);
        this.f31437q = (GCMComplexTwoLineButton) findViewById(R.id.edit_group_leaderboard_types);
        this.f31438r = (GCMComplexTwoLineButton) findViewById(R.id.edit_group_feature_types);
        this.f31428h.setOnClickListener(new j10.h(this, 11));
        this.f31429i.setOnClickListener(new j10.h(this, 12));
        this.f31430j.setOnClickListener(new j10.h(this, 13));
        this.f31431k.setOnClickListener(new j10.h(this, 14));
        this.f31432l.setOnClickListener(new j10.h(this, 15));
        this.f31433m.setOnClickListener(new j10.h(this, 1));
        this.f31434n.setOnClickListener(new j10.h(this, 2));
        this.f31435o.setOnClickListener(new j10.h(this, 3));
        this.f31436p.setOnClickListener(new j10.h(this, 4));
        this.f31437q.setOnClickListener(new j10.h(this, 8));
        this.f31438r.setOnClickListener(new j10.h(this, 9));
        ja();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.group_settings, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            if (!this.f31439t.equals(this.f31440v) || this.f31426f != null || !TextUtils.isEmpty(this.f31427g)) {
                fa();
                return true;
            }
        } else if (menuItem.getItemId() == R.id.menu_item_save) {
            showProgressOverlay();
            Uri uri = this.f31426f;
            if (uri != null) {
                k10.d dVar = this.f31425e;
                String str = this.f31439t.f31558a;
                dVar.getClass();
                str.getClass();
                androidx.lifecycle.m.a(null, new k10.c(this, uri, dVar, str, null), 3).f(this, new j10.i(this, 0));
                return true;
            }
            if (TextUtils.isEmpty(this.f31427g)) {
                ka();
                return true;
            }
            k10.d dVar2 = this.f31425e;
            GroupDTO groupDTO = this.f31439t;
            String str2 = this.f31427g;
            dVar2.getClass();
            groupDTO.getClass();
            str2.getClass();
            androidx.lifecycle.m.a(null, new k10.b(groupDTO, str2, dVar2, null), 3).f(this, new j10.i(this, 1));
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
