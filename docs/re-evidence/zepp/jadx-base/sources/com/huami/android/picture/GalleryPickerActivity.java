package com.huami.android.picture;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.LoaderManager;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Checkable;
import android.widget.CursorAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import com.huami.android.picture.GalleryPickerActivity;
import com.huami.android.qrcode.R;
import com.xiaomi.hm.health.imageload.DisplayConfig;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import defpackage.xf0;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"NewApi"})
public class GalleryPickerActivity extends Activity implements LoaderManager.LoaderCallbacks<Cursor>, AdapterView.OnItemClickListener, AbsListView.MultiChoiceModeListener {
    public static final String ACTION_MULTIPLE_PICK = "cn.com.smartdevices.bracelet.action.MULTIPLE_PICK";
    public static final String ACTION_PICK = "cn.com.smartdevices.bracelet.action.PICK";
    public static final int DATA_INDEX = 0;
    public static final String EXTRA_CROP_DATA = "cn.com.smartdevices.bracelet.extra.CROP";
    public static final String EXTRA_DATA = "cn.com.smartdevices.bracelet.extra.DATA";
    public static final int ID_INDEX = 1;
    private static final String g = "GalleryPickerActivity";
    public static final Uri h = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    public static final String[] i = {"_data", "_id"};
    public static final String j = "_id DESC";
    private static final int k = 0;
    private GridView a;
    private GalleryAdapter b;
    private boolean c;
    private int d;
    private int e;
    private DisplayConfig.ConfigBuilder f;

    public static class GalleryAdapter extends CursorAdapter {
        private int a;
        private int b;
        private DisplayConfig.ConfigBuilder c;
        private AbsListView.LayoutParams d;

        public static class ViewHolder {
            public ImageView a;
            public String b;
        }

        public GalleryAdapter(Context context, DisplayConfig.ConfigBuilder configBuilder) {
            super(context, (Cursor) null, false);
            this.a = 0;
            this.b = 0;
            this.c = configBuilder;
            this.d = new AbsListView.LayoutParams(-1, -1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Void c(View view, String str, ImageView imageView) throws Exception {
            this.c.placeholder(R.drawable.picker_empty_photo).load(GalleryPickerActivity.getImageContentUri(view.getContext(), str)).override(this.a).centerCrop().into(imageView);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void d(Void r0) throws Exception {
        }

        @Override // android.widget.CursorAdapter
        public void bindView(final View view, Context context, Cursor cursor) {
            ViewHolder viewHolder = (ViewHolder) view.getTag(R.id.indexTag);
            final String string = cursor.getString(cursor.getColumnIndex("_data"));
            viewHolder.b = string;
            final ImageView imageView = viewHolder.a;
            if (imageView.getLayoutParams().height != this.a) {
                imageView.setLayoutParams(this.d);
            }
            Observable.fromCallable(new Callable() { // from class: wd2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.c(view, string, imageView);
                }
            }).subscribeOn(Schedulers.trampoline()).subscribe(new Consumer() { // from class: vd2
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    GalleryPickerActivity.GalleryAdapter.d((Void) obj);
                }
            }, xf0.a);
        }

        @Override // android.widget.CursorAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return super.getItemId(i);
        }

        public int getNumColumns() {
            return this.b;
        }

        @Override // android.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return super.hasStableIds();
        }

        @Override // android.widget.CursorAdapter
        public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
            ViewHolder viewHolder = new ViewHolder();
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setLayoutParams(this.d);
            viewHolder.a = imageView;
            imageView.setTag(R.id.indexTag, viewHolder);
            return imageView;
        }

        public void setItemHeight(int i) {
            if (i == this.a) {
                return;
            }
            this.a = i;
            this.d = new AbsListView.LayoutParams(-1, this.a);
            notifyDataSetChanged();
        }

        public void setNumColumns(int i) {
            this.b = i;
        }
    }

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        @TargetApi(16)
        public void onGlobalLayout() {
            int iFloor;
            if (GalleryPickerActivity.this.b.getNumColumns() != 0 || (iFloor = (int) Math.floor(GalleryPickerActivity.this.a.getWidth() / (GalleryPickerActivity.this.d + GalleryPickerActivity.this.e))) <= 0) {
                return;
            }
            int width = (GalleryPickerActivity.this.a.getWidth() / iFloor) - GalleryPickerActivity.this.e;
            GalleryPickerActivity.this.b.setNumColumns(iFloor);
            GalleryPickerActivity.this.b.setItemHeight(width);
            GalleryPickerActivity.this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    private void e() {
        this.f = HMImageLoader.with(this);
    }

    private void f() {
        this.b = new GalleryAdapter(this, this.f);
        GridView gridView = (GridView) findViewById(R.id.picker_grid);
        this.a = gridView;
        gridView.setAdapter((ListAdapter) this.b);
        this.a.setOnItemClickListener(this);
        this.a.setMultiChoiceModeListener(this);
        this.a.getViewTreeObserver().addOnGlobalLayoutListener(new a());
    }

    public static Bitmap getBitmapFromUri(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            parcelFileDescriptorOpenFileDescriptor.close();
            return bitmapDecodeFileDescriptor;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Uri getImageContentUri(Context context, String str) {
        Cursor cursorQuery = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "_data=? ", new String[]{str}, null);
        if (cursorQuery == null || !cursorQuery.moveToFirst()) {
            if (!new File(str).exists()) {
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("_data", str);
            return context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        }
        int i2 = cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
        return Uri.withAppendedPath(Uri.parse("content://media/external/images/media"), "" + i2);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_done) {
            return false;
        }
        long[] checkedItemIds = this.a.getCheckedItemIds();
        Intent intent = new Intent();
        if (!this.c) {
            if (checkedItemIds.length > 0) {
                intent.putExtra("cn.com.smartdevices.bracelet.extra.DATA", ContentUris.withAppendedId(h, checkedItemIds[0]));
            }
            return true;
        }
        Uri[] uriArr = new Uri[checkedItemIds.length];
        for (int i2 = 0; i2 < checkedItemIds.length; i2++) {
            uriArr[i2] = ContentUris.withAppendedId(h, checkedItemIds[i2]);
        }
        intent.putExtra("cn.com.smartdevices.bracelet.extra.DATA", uriArr);
        setResult(-1, intent);
        finish();
        return true;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_picture_picker);
        this.c = "cn.com.smartdevices.bracelet.action.MULTIPLE_PICK".equals(getIntent().getAction());
        this.d = getResources().getDimensionPixelSize(R.dimen.image_thumbnail_size);
        this.e = getResources().getDimensionPixelSize(R.dimen.image_thumbnail_spacing);
        e();
        f();
        getLoaderManager().initLoader(0, null, this);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }

    @Override // android.app.LoaderManager.LoaderCallbacks
    public Loader<Cursor> onCreateLoader(int i2, Bundle bundle) {
        return new CursorLoader(this, h, i, null, null, "_id DESC");
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
    }

    @Override // android.widget.AbsListView.MultiChoiceModeListener
    public void onItemCheckedStateChanged(ActionMode actionMode, int i2, long j2, boolean z) {
        int checkedItemCount = this.a.getCheckedItemCount();
        actionMode.setTitle(getResources().getQuantityString(R.plurals.picker_number_of_items_selected, checkedItemCount, Integer.valueOf(checkedItemCount)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        if (this.c) {
            if (view instanceof Checkable) {
                this.a.setItemChecked(i2, !((Checkable) view).isChecked());
                return;
            }
            return;
        }
        String str = ((GalleryAdapter.ViewHolder) view.getTag(R.id.indexTag)).b;
        Log.i(g, "path:" + str);
        Intent intent = new Intent();
        intent.putExtra("cn.com.smartdevices.bracelet.extra.DATA", str);
        setResult(-1, intent);
        finish();
    }

    @Override // android.app.LoaderManager.LoaderCallbacks
    public void onLoaderReset(Loader<Cursor> loader) {
        this.b.swapCursor(null);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.b.notifyDataSetChanged();
    }

    @Override // android.app.LoaderManager.LoaderCallbacks
    public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
        this.b.swapCursor(cursor);
    }
}
