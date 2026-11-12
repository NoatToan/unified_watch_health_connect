package com.xiaomi.hm.health.training.api.entity;

/* JADX INFO: loaded from: classes21.dex */
public abstract class PayOrderResult<T> {
    private Resource<T> a;

    public static class JoinResult extends PayOrderResult<Boolean> {
        public JoinResult(Resource<Boolean> resource) {
            super(resource);
        }
    }

    public static class OrderResult extends PayOrderResult<Void> {
        public OrderResult(Resource<Void> resource) {
            super(resource);
        }
    }

    public static class PayResult extends PayOrderResult<PayChannel> {
        public PayResult(Resource<PayChannel> resource) {
            super(resource);
        }
    }

    public PayOrderResult(Resource<T> resource) {
        this.a = resource;
    }

    public Resource<T> getResult() {
        return this.a;
    }
}
