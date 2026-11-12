package com.bumptech.glide.request;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class ErrorRequestCoordinator implements RequestCoordinator, Request {

    @Nullable
    private final RequestCoordinator a;
    private Request b;
    private Request c;

    public ErrorRequestCoordinator(@Nullable RequestCoordinator requestCoordinator) {
        this.a = requestCoordinator;
    }

    private boolean a(Request request) {
        return request.equals(this.b) || (this.b.isFailed() && request.equals(this.c));
    }

    private boolean b() {
        RequestCoordinator requestCoordinator = this.a;
        return requestCoordinator == null || requestCoordinator.canNotifyCleared(this);
    }

    private boolean c() {
        RequestCoordinator requestCoordinator = this.a;
        return requestCoordinator == null || requestCoordinator.canNotifyStatusChanged(this);
    }

    private boolean d() {
        RequestCoordinator requestCoordinator = this.a;
        return requestCoordinator == null || requestCoordinator.canSetImage(this);
    }

    private boolean e() {
        RequestCoordinator requestCoordinator = this.a;
        return requestCoordinator != null && requestCoordinator.isAnyResourceSet();
    }

    @Override // com.bumptech.glide.request.Request
    public void begin() {
        if (this.b.isRunning()) {
            return;
        }
        this.b.begin();
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canNotifyCleared(Request request) {
        return b() && a(request);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canNotifyStatusChanged(Request request) {
        return c() && a(request);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canSetImage(Request request) {
        return d() && a(request);
    }

    @Override // com.bumptech.glide.request.Request
    public void clear() {
        this.b.clear();
        if (this.c.isRunning()) {
            this.c.clear();
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean isAnyResourceSet() {
        return e() || isResourceSet();
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isCleared() {
        return (this.b.isFailed() ? this.c : this.b).isCleared();
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isComplete() {
        return (this.b.isFailed() ? this.c : this.b).isComplete();
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isEquivalentTo(Request request) {
        if (!(request instanceof ErrorRequestCoordinator)) {
            return false;
        }
        ErrorRequestCoordinator errorRequestCoordinator = (ErrorRequestCoordinator) request;
        return this.b.isEquivalentTo(errorRequestCoordinator.b) && this.c.isEquivalentTo(errorRequestCoordinator.c);
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isFailed() {
        return this.b.isFailed() && this.c.isFailed();
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isResourceSet() {
        return (this.b.isFailed() ? this.c : this.b).isResourceSet();
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isRunning() {
        return (this.b.isFailed() ? this.c : this.b).isRunning();
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void onRequestFailed(Request request) {
        if (!request.equals(this.c)) {
            if (this.c.isRunning()) {
                return;
            }
            this.c.begin();
        } else {
            RequestCoordinator requestCoordinator = this.a;
            if (requestCoordinator != null) {
                requestCoordinator.onRequestFailed(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void onRequestSuccess(Request request) {
        RequestCoordinator requestCoordinator = this.a;
        if (requestCoordinator != null) {
            requestCoordinator.onRequestSuccess(this);
        }
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
}
