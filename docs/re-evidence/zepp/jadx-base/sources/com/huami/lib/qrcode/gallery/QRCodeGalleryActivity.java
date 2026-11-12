package com.huami.lib.qrcode.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.lib.qrcode.R;
import com.huami.lib.qrcode.gallery.adapter.GalleryAdapter;
import com.huami.lib.qrcode.gallery.bean.MediaStoreImage;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class QRCodeGalleryActivity extends AppCompatActivity implements GalleryAdapter.OnItemClickListener {
    public static final int REQUEST_CODE = 4660;
    public static final int REQUEST_PERMISSION_CODE_STORAGE = 4165;
    private QRCodeGalleryViewModel a;

    private boolean d() {
        return ContextCompat.checkSelfPermission(this, "android.permission.READ_EXTERNAL_STORAGE") == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActionBar() != null) {
            getActionBar().hide();
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(-805306368);
        }
        setContentView(R.layout.activity_qrcode_gallery);
        findViewById(R.id.iv_close).setOnClickListener(new View.OnClickListener() { // from class: u56
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.e(view);
            }
        });
        this.a = (QRCodeGalleryViewModel) new ViewModelProvider(this, new ViewModelProvider.AndroidViewModelFactory(getApplication())).get(QRCodeGalleryViewModel.class);
        final GalleryAdapter galleryAdapter = new GalleryAdapter();
        this.a.getImages().observe(this, new Observer() { // from class: v56
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                galleryAdapter.submitList((List) obj);
            }
        });
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.gallery);
        recyclerView.addItemDecoration(new a(3, 3, true));
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(galleryAdapter);
        galleryAdapter.setOnItemClickListener(this);
        if (d()) {
            showImages();
        } else {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, REQUEST_PERMISSION_CODE_STORAGE);
        }
    }

    @Override // com.huami.lib.qrcode.gallery.adapter.GalleryAdapter.OnItemClickListener
    public void onItemClick(MediaStoreImage mediaStoreImage) {
        Intent intent = new Intent();
        intent.setData(mediaStoreImage.contentUri);
        setResult(-1, intent);
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 4165 && iArr[0] == 0) {
            showImages();
        }
    }

    public void showImages() {
        this.a.loadImages();
    }
}
