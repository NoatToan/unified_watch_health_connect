package com.xiaomi.hm.health.imageload;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.MemoryCategory;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.cache.ExternalPreferredCacheDiskCacheFactory;
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory;
import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.request.RequestListener;
import com.huami.tools.log.HMLog;
import java.io.File;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes21.dex */
public class GlideLoader implements ILoader {
    private static final String a = "imageload-GlideLoader";

    private GlideRequest a(DisplayConfig displayConfig) {
        GlideRequest glideRequestJ = j(displayConfig, f(displayConfig));
        i(displayConfig, glideRequestJ);
        d(displayConfig, glideRequestJ);
        c(displayConfig, glideRequestJ);
        h(displayConfig, glideRequestJ);
        e(displayConfig, glideRequestJ);
        b(displayConfig, glideRequestJ);
        g(displayConfig, glideRequestJ);
        k(displayConfig, glideRequestJ);
        return glideRequestJ;
    }

    private GlideRequest b(DisplayConfig displayConfig, GlideRequest glideRequest) {
        DisplayConfig.ConfigBuilder.a adaptationType = displayConfig.getAdaptationType();
        if (adaptationType == DisplayConfig.ConfigBuilder.a.FIT_CENTER) {
            glideRequest.fitCenter();
        } else if (adaptationType == DisplayConfig.ConfigBuilder.a.CENTER_INSIDE) {
            glideRequest.centerInside();
        } else if (adaptationType == DisplayConfig.ConfigBuilder.a.CENTER_CROP) {
            glideRequest.centerCrop();
        } else if (adaptationType == DisplayConfig.ConfigBuilder.a.CIRCLE_CROP) {
            glideRequest.circleCrop();
        }
        return glideRequest;
    }

    private GlideRequest c(DisplayConfig displayConfig, GlideRequest glideRequest) {
        if (displayConfig.isDontAnimate()) {
            glideRequest.dontAnimate();
        }
        return glideRequest;
    }

    private GlideRequest d(DisplayConfig displayConfig, GlideRequest glideRequest) {
        DisplayConfig.ConfigBuilder.DiskCacheStrategy diskCacheStrategy = displayConfig.getDiskCacheStrategy();
        if (diskCacheStrategy == DisplayConfig.ConfigBuilder.DiskCacheStrategy.ALL) {
            glideRequest.diskCacheStrategy(DiskCacheStrategy.ALL);
        } else if (diskCacheStrategy == DisplayConfig.ConfigBuilder.DiskCacheStrategy.NONE) {
            glideRequest.diskCacheStrategy(DiskCacheStrategy.NONE);
        } else if (diskCacheStrategy == DisplayConfig.ConfigBuilder.DiskCacheStrategy.DATA) {
            glideRequest.diskCacheStrategy(DiskCacheStrategy.DATA);
        } else if (diskCacheStrategy == DisplayConfig.ConfigBuilder.DiskCacheStrategy.RESOURCE) {
            glideRequest.diskCacheStrategy(DiskCacheStrategy.RESOURCE);
        } else if (diskCacheStrategy == DisplayConfig.ConfigBuilder.DiskCacheStrategy.AUTOMATIC) {
            glideRequest.diskCacheStrategy(DiskCacheStrategy.AUTOMATIC);
        }
        return glideRequest;
    }

    private GlideRequest e(DisplayConfig displayConfig, GlideRequest glideRequest) {
        int error = displayConfig.getError();
        if (error != 0) {
            glideRequest.error(error);
        }
        return glideRequest;
    }

    private GlideRequests f(DisplayConfig displayConfig) {
        DisplayConfig.ConfigBuilder.b lifeCycle = displayConfig.getLifeCycle();
        if (lifeCycle == DisplayConfig.ConfigBuilder.b.CONTEXT) {
            return GlideApp.with(displayConfig.getContext());
        }
        if (lifeCycle == DisplayConfig.ConfigBuilder.b.ACTIVITY) {
            return GlideApp.with(displayConfig.getActivity());
        }
        return lifeCycle == DisplayConfig.ConfigBuilder.b.FRAGMENT ? GlideApp.with(displayConfig.getFragment()) : GlideApp.with(displayConfig.getView());
    }

    private GlideRequest g(DisplayConfig displayConfig, GlideRequest glideRequest) {
        HMLoadListener listener = displayConfig.getListener();
        if (listener != null) {
            glideRequest.listener((RequestListener) new GlideRequestListener(listener));
        }
        return glideRequest;
    }

    private GlideRequest h(DisplayConfig displayConfig, GlideRequest glideRequest) {
        int placeHolder = displayConfig.getPlaceHolder();
        if (placeHolder != 0) {
            glideRequest.placeholder(placeHolder);
        }
        return glideRequest;
    }

    private GlideRequest i(DisplayConfig displayConfig, GlideRequest glideRequest) {
        if (displayConfig.getPath() != null) {
            glideRequest.load(displayConfig.getPath());
            HMLog.i(a, "getPath : " + displayConfig.getPath(), new Object[0]);
        } else if (displayConfig.getUri() != null) {
            glideRequest.load(displayConfig.getUri());
            HMLog.i(a, "getUri : " + displayConfig.getUri().toString(), new Object[0]);
        } else if (displayConfig.getFile() != null) {
            glideRequest.load(displayConfig.getFile());
            HMLog.i(a, "getFile : " + displayConfig.getFile().toString(), new Object[0]);
        } else if (displayConfig.getResId() != null) {
            glideRequest.load(displayConfig.getResId());
            HMLog.i(a, "getResId : " + displayConfig.getResId().toString(), new Object[0]);
        } else {
            glideRequest.load("");
            HMLog.i(a, "getDefault : from is not availed", new Object[0]);
        }
        return glideRequest;
    }

    private GlideRequest j(DisplayConfig displayConfig, GlideRequests glideRequests) {
        DisplayConfig.ConfigBuilder.c resourceType = displayConfig.getResourceType();
        if (resourceType == DisplayConfig.ConfigBuilder.c.GIF) {
            return glideRequests.asGif();
        }
        if (resourceType == DisplayConfig.ConfigBuilder.c.FILE) {
            return glideRequests.asFile();
        }
        return resourceType == DisplayConfig.ConfigBuilder.c.BITMAP ? glideRequests.asBitmap() : glideRequests.asDrawable();
    }

    private GlideRequest k(DisplayConfig displayConfig, GlideRequest glideRequest) {
        GlideTransformation transformation = displayConfig.getTransformation();
        if (transformation != null) {
            glideRequest.transform(transformation);
        }
        return glideRequest;
    }

    @Override // com.xiaomi.hm.health.imageload.ILoader
    public void clearMemory(Context context) {
        GlideApp.get(context).clearMemory();
    }

    @Override // com.xiaomi.hm.health.imageload.ILoader
    public void downloadOnly(DisplayConfig displayConfig) {
        GlideRequest glideRequestA = a(displayConfig);
        if (glideRequestA != null) {
            glideRequestA.downloadOnly(new GlideSimpleTarget(displayConfig.getTarget()));
        } else {
            HMLog.i(a, "please give a valid address", new Object[0]);
        }
    }

    @Override // com.xiaomi.hm.health.imageload.ILoader
    public void downloadOnlyExecute(DisplayConfig displayConfig) {
        GlideRequest glideRequestA = a(displayConfig);
        if (glideRequestA == null) {
            HMLog.i(a, "please give a valid address", new Object[0]);
            return;
        }
        if (displayConfig.getTarget() != null) {
            displayConfig.getTarget().onLoadStarted();
        }
        try {
            FutureTarget<File> futureTargetDownloadOnly = glideRequestA.downloadOnly(Integer.MIN_VALUE, Integer.MIN_VALUE);
            if (displayConfig.getTarget() != null) {
                File file = futureTargetDownloadOnly.get();
                if (file == null) {
                    displayConfig.getTarget().onLoadFailed(new NullPointerException("FutureTarget<File> get() is null"));
                } else {
                    displayConfig.getTarget().onLoadFinish(file);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (displayConfig.getTarget() != null) {
                displayConfig.getTarget().onLoadFailed(e);
            }
        }
    }

    @Override // com.xiaomi.hm.health.imageload.ILoader
    public Bitmap get(DisplayConfig displayConfig) {
        GlideRequest glideRequestA = a(displayConfig);
        if (glideRequestA == null) {
            HMLog.i(a, "please give a valid address", new Object[0]);
            return null;
        }
        int width = displayConfig.getWidth();
        int height = displayConfig.getHeight();
        if (width <= 0 && height <= 0) {
            height = Integer.MIN_VALUE;
            width = Integer.MIN_VALUE;
        }
        try {
            return (Bitmap) glideRequestA.into(width, height).get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.xiaomi.hm.health.imageload.ILoader
    public void init(Context context, int i, HMImageLoader.MemoryCategory memoryCategory, boolean z) {
        MemoryCategory memoryCategory2;
        if (memoryCategory == HMImageLoader.MemoryCategory.NORMAL) {
            memoryCategory2 = MemoryCategory.NORMAL;
        } else {
            memoryCategory2 = memoryCategory == HMImageLoader.MemoryCategory.HIGH ? MemoryCategory.HIGH : MemoryCategory.LOW;
        }
        GlideApp.get(context).setMemoryCategory(memoryCategory2);
        GlideBuilder glideBuilder = new GlideBuilder();
        if (z) {
            glideBuilder.setDiskCache(new InternalCacheDiskCacheFactory(context, i * 1024 * 1024));
        } else {
            glideBuilder.setDiskCache(new ExternalPreferredCacheDiskCacheFactory(context, i * 1024 * 1024));
        }
    }

    @Override // com.xiaomi.hm.health.imageload.ILoader
    public File obtain(DisplayConfig displayConfig) {
        GlideRequest glideRequestA = a(displayConfig);
        if (glideRequestA == null) {
            HMLog.i(a, "please give a valid address", new Object[0]);
            return null;
        }
        try {
            return glideRequestA.onlyRetrieveFromCache(true).downloadOnly(Integer.MIN_VALUE, Integer.MIN_VALUE).get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.xiaomi.hm.health.imageload.ILoader
    public void onLowMemory(Context context) {
        GlideApp.get(context).onLowMemory();
    }

    @Override // com.xiaomi.hm.health.imageload.ILoader
    public void onTrimMemory(Context context, int i) {
        GlideApp.get(context).onTrimMemory(i);
    }

    @Override // com.xiaomi.hm.health.imageload.ILoader
    public void preload(DisplayConfig displayConfig) {
        GlideRequest glideRequestA = a(displayConfig);
        if (glideRequestA != null) {
            glideRequestA.preload();
        } else {
            HMLog.i(a, "please give a valid address", new Object[0]);
        }
    }

    @Override // com.xiaomi.hm.health.imageload.ILoader
    public void show(DisplayConfig displayConfig) {
        GlideRequest glideRequestA = a(displayConfig);
        if (glideRequestA == null) {
            HMLog.i(a, "please give a valid address", new Object[0]);
            return;
        }
        int width = displayConfig.getWidth();
        int height = displayConfig.getHeight();
        if (width > 0 && height > 0) {
            glideRequestA.override(width, height);
        }
        ImageView imageView = displayConfig.getImageView();
        if (imageView != null) {
            glideRequestA.into(imageView);
        } else {
            glideRequestA.into(new GlideSimpleTarget(displayConfig.getTarget()));
        }
    }
}
