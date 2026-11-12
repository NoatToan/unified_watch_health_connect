package com.xiaomi.hm.health.watermarkcamera.ui.activity;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.LoaderManager;
import android.content.ContentUris;
import android.content.Context;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
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
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.xiaomi.hm.health.watermarkcamera.R;
import com.xiaomi.hm.health.watermarkcamera.ui.activity.GalleryPickerActivity;
import defpackage.u6;
import java.util.concurrent.Callable;
import rx.Observable;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes22.dex */
@SuppressLint({"NewApi"})
public class GalleryPickerActivity extends Activity implements LoaderManager.LoaderCallbacks<Cursor>, AdapterView.OnItemClickListener, AbsListView.MultiChoiceModeListener {
    public static final String ACTION_MULTIPLE_PICK = "cn.com.smartdevices.bracelet.action.MULTIPLE_PICK";
    public static final String ACTION_PICK = "cn.com.smartdevices.bracelet.action.PICK";
    public static final int DATA_INDEX = 0;
    public static final String EXTRA_CROP_DATA = "cn.com.smartdevices.bracelet.extra.CROP";
    public static final String EXTRA_DATA = "cn.com.smartdevices.bracelet.extra.DATA";
    public static final int ID_INDEX = 1;
    private static final String f = "GalleryPickerActivity";
    public static final Uri g = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    public static final String[] h = {"_data", "_id"};
    public static final String i = "_id DESC";
    private static final int j = 0;
    private GridView a;
    private GalleryAdapter b;
    private boolean c;
    private int d;
    private int e;

    public static class GalleryAdapter extends CursorAdapter {
        private int a;
        private int b;
        private AbsListView.LayoutParams c;

        public static class ViewHolder {
            public ImageView a;
            public String b;
            public Uri c;
        }

        public GalleryAdapter(Context context) {
            super(context, (Cursor) null, false);
            this.a = 0;
            this.b = 0;
            this.c = new AbsListView.LayoutParams(-1, -1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Void c(Context context, ViewHolder viewHolder, ImageView imageView) throws Exception {
            Glide.with(context).load(Build.VERSION.SDK_INT > 29 ? viewHolder.c : viewHolder.b).apply(new RequestOptions().placeholder(R.drawable.picker_empty_photo).override(this.a).centerCrop()).into(imageView);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void d(Void r0) {
        }

        @Override // android.widget.CursorAdapter
        public void bindView(View view, final Context context, Cursor cursor) {
            final ViewHolder viewHolder = (ViewHolder) view.getTag(R.id.indexTag);
            if (Build.VERSION.SDK_INT > 29) {
                viewHolder.c = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, cursor.getLong(cursor.getColumnIndexOrThrow("_id")));
            } else {
                viewHolder.b = cursor.getString(cursor.getColumnIndex("_data"));
            }
            final ImageView imageView = viewHolder.a;
            if (imageView.getLayoutParams().height != this.a) {
                imageView.setLayoutParams(this.c);
            }
            Observable.fromCallable(new Callable() { // from class: xd2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.c(context, viewHolder, imageView);
                }
            }).subscribeOn(Schedulers.trampoline()).subscribe(new Action1() { // from class: yd2
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    GalleryPickerActivity.GalleryAdapter.d((Void) obj);
                }
            }, u6.a);
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
            imageView.setLayoutParams(this.c);
            viewHolder.a = imageView;
            imageView.setTag(R.id.indexTag, viewHolder);
            return imageView;
        }

        public void setItemHeight(int i) {
            if (i == this.a) {
                return;
            }
            this.a = i;
            this.c = new AbsListView.LayoutParams(-1, this.a);
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
        this.b = new GalleryAdapter(this);
        GridView gridView = (GridView) findViewById(R.id.picker_grid);
        this.a = gridView;
        gridView.setAdapter((ListAdapter) this.b);
        this.a.setOnItemClickListener(this);
        this.a.setMultiChoiceModeListener(this);
        this.a.getViewTreeObserver().addOnGlobalLayoutListener(new a());
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
                intent.putExtra("cn.com.smartdevices.bracelet.extra.DATA", ContentUris.withAppendedId(g, checkedItemIds[0]));
            }
            return true;
        }
        Uri[] uriArr = new Uri[checkedItemIds.length];
        for (int i2 = 0; i2 < checkedItemIds.length; i2++) {
            uriArr[i2] = ContentUris.withAppendedId(g, checkedItemIds[i2]);
        }
        intent.putExtra("cn.com.smartdevices.bracelet.extra.DATA", uriArr);
        setResult(-1, intent);
        finish();
        return true;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_watermark_picture_picker);
        this.c = "cn.com.smartdevices.bracelet.action.MULTIPLE_PICK".equals(getIntent().getAction());
        this.d = getResources().getDimensionPixelSize(R.dimen.image_thumbnail_size);
        this.e = getResources().getDimensionPixelSize(R.dimen.image_thumbnail_spacing);
        e();
        getLoaderManager().initLoader(0, null, this);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }

    @Override // android.app.LoaderManager.LoaderCallbacks
    public Loader<Cursor> onCreateLoader(int i2, Bundle bundle) {
        return new CursorLoader(this, g, h, null, null, "_id DESC");
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
        Log.i(f, "path:" + str);
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
