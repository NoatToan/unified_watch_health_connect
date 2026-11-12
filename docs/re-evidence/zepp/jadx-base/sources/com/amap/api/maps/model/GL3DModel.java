package com.amap.api.maps.model;

import android.text.TextUtils;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.amap.api.maps.model.animation.Animation;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.interfaces.IglModel;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class GL3DModel extends BasePointOverlay {
    private WeakReference<IGlOverlayLayer> glOverlayLayerRef;
    private IglModel mModel;
    private Object object;
    private GL3DModelOptions options;

    public GL3DModel(IglModel iglModel) {
        super("");
        this.mModel = iglModel;
    }

    private void a() {
        try {
            IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
                return;
            }
            iGlOverlayLayer.updateOption(this.overlayName, this.options);
        } catch (Throwable unused) {
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void destroy() {
        IglModel iglModel = this.mModel;
        if (iglModel != null) {
            iglModel.destroy();
        } else {
            remove();
        }
    }

    public float getAngle() {
        try {
            IglModel iglModel = this.mModel;
            return iglModel != null ? iglModel.getRotateAngle() : this.options.getAngle();
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0f;
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public String getId() {
        try {
            IglModel iglModel = this.mModel;
            return iglModel != null ? iglModel.getId() : this.overlayName;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public Object getObject() {
        IglModel iglModel = this.mModel;
        return iglModel != null ? iglModel.getObject() : this.object;
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public LatLng getPosition() {
        try {
            IglModel iglModel = this.mModel;
            return iglModel != null ? iglModel.getPosition() : this.options.getLatLng();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public float getRotateAngle() {
        try {
            return getAngle();
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0f;
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public String getSnippet() {
        try {
            IglModel iglModel = this.mModel;
            if (iglModel != null) {
                return iglModel.getSnippet();
            }
            GL3DModelOptions gL3DModelOptions = this.options;
            return gL3DModelOptions != null ? gL3DModelOptions.getSnippet() : "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public String getTitle() {
        try {
            IglModel iglModel = this.mModel;
            if (iglModel != null) {
                return iglModel.getTitle();
            }
            GL3DModelOptions gL3DModelOptions = this.options;
            return gL3DModelOptions != null ? gL3DModelOptions.getTitle() : "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public boolean isInfoWindowEnable() {
        return true;
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public boolean isVisible() {
        try {
            IglModel iglModel = this.mModel;
            return iglModel != null ? iglModel.isVisible() : this.options.isVisible();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void remove() {
        try {
            IglModel iglModel = this.mModel;
            if (iglModel != null) {
                iglModel.remove();
                return;
            }
            IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (iGlOverlayLayer != null) {
                iGlOverlayLayer.removeOverlay(this.overlayName);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setAngle(float f) {
        try {
            IglModel iglModel = this.mModel;
            if (iglModel != null) {
                iglModel.setRotateAngle(f);
            } else {
                this.options.angle(f);
                a();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void setAnimation(Animation animation) {
        try {
            IglModel iglModel = this.mModel;
            if (iglModel != null) {
                iglModel.setAnimation(animation);
            } else {
                a("setAnimation", new Object[]{animation});
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void setGeoPoint(IPoint iPoint) {
        IglModel iglModel = this.mModel;
        if (iglModel != null) {
            iglModel.setGeoPoint(iPoint);
        }
    }

    public void setModelFixedLength(int i) {
        try {
            IglModel iglModel = this.mModel;
            if (iglModel != null) {
                iglModel.setModelFixedLength(i);
            } else {
                this.options.setModelFixedLength(i);
                a();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void setObject(Object obj) {
        try {
            IglModel iglModel = this.mModel;
            if (iglModel != null) {
                iglModel.setObject(obj);
            } else {
                this.object = obj;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void setPosition(LatLng latLng) {
        try {
            IglModel iglModel = this.mModel;
            if (iglModel != null) {
                iglModel.setPosition(latLng);
            } else {
                this.options.position(latLng);
                a();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void setRotateAngle(float f) {
        try {
            setAngle(f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void setSnippet(String str) {
        IglModel iglModel = this.mModel;
        if (iglModel != null) {
            iglModel.setSnippet(str);
            return;
        }
        GL3DModelOptions gL3DModelOptions = this.options;
        if (gL3DModelOptions != null) {
            gL3DModelOptions.snippet(str);
            a();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void setTitle(String str) {
        IglModel iglModel = this.mModel;
        if (iglModel != null) {
            iglModel.setTitle(str);
            return;
        }
        GL3DModelOptions gL3DModelOptions = this.options;
        if (gL3DModelOptions != null) {
            gL3DModelOptions.title(str);
            a();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void setVisible(boolean z) {
        try {
            IglModel iglModel = this.mModel;
            if (iglModel != null) {
                iglModel.setVisible(z);
            } else {
                this.options.setVisible(z);
                a();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setZoomLimit(float f) {
        IglModel iglModel = this.mModel;
        if (iglModel != null) {
            iglModel.setZoomLimit(f);
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void showInfoWindow() {
        try {
            IglModel iglModel = this.mModel;
            if (iglModel != null) {
                iglModel.showInfoWindow();
                return;
            }
            IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
                return;
            }
            iGlOverlayLayer.showInfoWindow(this.overlayName);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public boolean startAnimation() {
        IglModel iglModel = this.mModel;
        if (iglModel != null) {
            return iglModel.startAnimation();
        }
        Object objA = a("startAnimation", null);
        if (objA instanceof Boolean) {
            return ((Boolean) objA).booleanValue();
        }
        return false;
    }

    public GL3DModel(IGlOverlayLayer iGlOverlayLayer, GL3DModelOptions gL3DModelOptions, String str) {
        super(str);
        this.glOverlayLayerRef = new WeakReference<>(iGlOverlayLayer);
        this.options = gL3DModelOptions;
    }

    private Object a(String str, Object[] objArr) {
        try {
            IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
                return null;
            }
            return iGlOverlayLayer.getNativeProperties(this.overlayName, str, objArr);
        } catch (Throwable unused) {
            return null;
        }
    }
}
