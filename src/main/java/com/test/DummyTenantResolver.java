package com.test;

import org.hibernate.context.spi.CurrentTenantIdentifierResolver;

public class DummyTenantResolver implements CurrentTenantIdentifierResolver {
    @Override
    public String resolveCurrentTenantIdentifier() {
        throw new RuntimeException("no identifier");
    }

    @Override
    public boolean validateExistingCurrentSessions() {
        return true;
    }
}
