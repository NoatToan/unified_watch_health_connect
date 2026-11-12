package per.wsj.library;

import android.annotation.SuppressLint;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes23.dex */
public class StarDrawable extends LayerDrawable {
    public StarDrawable(RattingAttr rattingAttr) {
        super(rattingAttr.getLayerList());
        setId(0, android.R.id.background);
        setId(1, android.R.id.secondaryProgress);
        setId(2, android.R.id.progress);
        b(rattingAttr);
    }

    @SuppressLint({"NewApi"})
    private TileDrawable a(int id) {
        Drawable drawableFindDrawableByLayerId = findDrawableByLayerId(id);
        if (id == 16908288) {
            return (TileDrawable) drawableFindDrawableByLayerId;
        }
        if (id == 16908301 || id == 16908303) {
            ClipDrawable clipDrawable = (ClipDrawable) drawableFindDrawableByLayerId;
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                return (TileDrawable) clipDrawable.getDrawable();
            }
            try {
                Field declaredField = clipDrawable.getClass().getDeclaredField(i >= 22 ? "mState" : "mClipState");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(clipDrawable);
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawable");
                declaredField2.setAccessible(true);
                return (TileDrawable) declaredField2.get(obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        throw new RuntimeException();
    }

    private void b(RattingAttr rattingAttr) {
        TileDrawable tileDrawableA = a(android.R.id.background);
        TileDrawable tileDrawableA2 = a(android.R.id.secondaryProgress);
        TileDrawable tileDrawableA3 = a(android.R.id.progress);
        tileDrawableA.setTileCount(rattingAttr.getStarCount());
        tileDrawableA2.setTileCount(rattingAttr.getStarCount());
        tileDrawableA3.setTileCount(rattingAttr.getStarCount());
        if (rattingAttr.getBgColor() != null) {
            tileDrawableA.setTintList(rattingAttr.getBgColor());
        }
        if (rattingAttr.getSecondaryStarColor() != null) {
            tileDrawableA2.setTintList(rattingAttr.getSecondaryStarColor());
        }
        if (rattingAttr.getStarColor() != null) {
            tileDrawableA3.setTintList(rattingAttr.getStarColor());
        }
    }

    public float getTileRatio() {
        Drawable drawable = a(android.R.id.progress).getDrawable();
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    public void setStarCount(int count) {
        a(android.R.id.background).setTileCount(count);
        a(android.R.id.secondaryProgress).setTileCount(count);
        a(android.R.id.progress).setTileCount(count);
    }
}
