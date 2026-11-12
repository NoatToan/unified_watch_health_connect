package com.bumptech.glide.request;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
public class ThumbnailRequestCoordinator implements RequestCoordinator, Request {

    @Nullable
    private final RequestCoordinator a;
    private Request b;
    private Request c;
    private boolean d;

    @VisibleForTesting
    public ThumbnailRequestCoordinator() {
        this(null);
    }

    private boolean a() {
        RequestCoordinator requestCoordinator = this.a;
        return requestCoordinator == null || requestCoordinator.canNotifyCleared(this);
    }

    private boolean b() {
        RequestCoordinator requestCoordinator = this.a;
        return requestCoordinator == null || requestCoordinator.canNotifyStatusChanged(this);
    }

    private boolean c() {
        RequestCoordinator requestCoordinator = this.a;
        return requestCoordinator == null || requestCoordinator.canSetImage(this);
    }

    private boolean d() {
        RequestCoordinator requestCoordinator = this.a;
        return requestCoordinator != null && requestCoordinator.isAnyResourceSet();
    }

    @Override // com.bumptech.glide.request.Request
    public void begin() {
        this.d = true;
        if (!this.b.isComplete() && !this.c.isRunning()) {
            this.c.begin();
        }
        if (!this.d || this.b.isRunning()) {
            return;
        }
        this.b.begin();
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canNotifyCleared(Request request) {
        return a() && request.equals(this.b);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canNotifyStatusChanged(Request request) {
        return b() && request.equals(this.b) && !isAnyResourceSet();
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canSetImage(Request request) {
        return c() && (request.equals(this.b) || !this.b.isResourceSet());
    }

    @Override // com.bumptech.glide.request.Request
    public void clear() {
        this.d = false;
        this.c.clear();
        this.b.clear();
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean isAnyResourceSet() {
        return d() || isResourceSet();
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isCleared() {
        return this.b.isCleared();
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isComplete() {
        return this.b.isComplete() || this.c.isComplete();
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isEquivalentTo(Request request) {
        if (!(request instanceof ThumbnailRequestCoordinator)) {
            return false;
        }
        ThumbnailRequestCoordinator thumbnailRequestCoordinator = (ThumbnailRequestCoordinator) request;
        Request request2 = this.b;
        if (request2 == null) {
            if (thumbnailRequestCoordinator.b != null) {
                return false;
            }
        } else if (!request2.isEquivalentTo(thumbnailRequestCoordinator.b)) {
            return false;
        }
        Request request3 = this.c;
        Request request4 = thumbnailRequestCoordinator.c;
        if (request3 == null) {
            if (request4 != null) {
                return false;
            }
        } else if (!request3.isEquivalentTo(request4)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isFailed() {
        return this.b.isFailed();
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isResourceSet() {
        return this.b.isResourceSet() || this.c.isResourceSet();
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isRunning() {
        return this.b.isRunning();
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void onRequestFailed(Request request) {
        RequestCoordinator requestCoordinator;
        if (request.equals(this.b) && (requestCoordinator = this.a) != null) {
            requestCoordinator.onRequestFailed(this);
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void onRequestSuccess(Request request) {
        if (request.equals(this.c)) {
            return;
        }
        RequestCoordinator requestCoordinator = this.a;
        if (requestCoordinator != null) {
            requestCoordinator.onRequestSuccess(this);
        }
        if (this.c.isComplete()) {
            return;
        }
        this.c.clear();
    }

    @Override // com.bumptech.glide.request.Request
    public void recycle() {
        this.b.recycle();
        this.c.recycle();
    }

    public void setRequests(Request request, Request request2) {
        this.b = request;
        this.c = request2;
    }

    public ThumbnailRequestCoordinator(@Nullable RequestCoordinator requestCoordinator) {
        this.a = requestCoordinator;
    }
}
